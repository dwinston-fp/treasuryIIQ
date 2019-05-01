package gov.dhs.cdm.sailpoint.connector;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.text.ParseException;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.security.SecureRandom;

import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.addressing.AddressingConstants;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties.ProxyProperties;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.LogFactory;
import org.apache.neethi.Policy;
import org.apache.rampart.RampartMessageData;
import org.apache.rampart.policy.model.CryptoConfig;
import org.apache.rampart.policy.model.RampartConfig;
import org.apache.ws.security.WSPasswordCallback;
import org.apache.ws.security.handler.WSHandlerConstants;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;

import gov.dhs.cdm.sailpoint.util.DateUtil;
import gov.gsa.hspd12.federated.enrollment.AdjudicationInformation;
import gov.gsa.hspd12.federated.enrollment.AgencyServiceStub;
import gov.gsa.hspd12.federated.enrollment.ArrayOfCredentialInformation;
import gov.gsa.hspd12.federated.enrollment.ArrayOfProcessStatus;
import gov.gsa.hspd12.federated.enrollment.CredentialInformation;
import gov.gsa.hspd12.federated.enrollment.EnrollmentInformation;
import gov.gsa.hspd12.federated.enrollment.FingerprintInformation;
import gov.gsa.hspd12.federated.enrollment.PersonIdentifier;
import gov.gsa.hspd12.federated.enrollment.PersonalInformation;
import gov.gsa.hspd12.federated.enrollment.ProcessStatus;
import gov.gsa.hspd12.federated.enrollment.QueryModifiedList;
import gov.gsa.hspd12.federated.enrollment.QueryModifiedListResponse;
import gov.gsa.hspd12.federated.enrollment.QuerySIP;
import gov.gsa.hspd12.federated.enrollment.QuerySIPResponse;
import gov.gsa.hspd12.federated.enrollment.SponsorshipInformation;
import gov.gsa.hspd12.federated.enrollment.StatusInformation;
import gov.gsa.hspd12.federated.enrollment.TransactionHeader;
import gov.gsa.hspd12.federated.enrollment.TransactionStatus;
import gov.treasury.cdm.constants.TreasuryCustomGlobalStringConst;
import openconnector.AbstractConnector;
import openconnector.ConnectorConfig;
import openconnector.ConnectorException;
import openconnector.Filter;
import openconnector.FilteredIterator;
import openconnector.Log;
import openconnector.Schema.Attribute;
import sailpoint.api.SailPointContext;
import sailpoint.api.SailPointFactory;
import sailpoint.object.Application;
import sailpoint.object.Custom;
import sailpoint.object.Identity;
import sailpoint.tools.GeneralException;

/**
 * 
 * USAccessConnector Class, connects to GSA USAccess SIP Webservice.
 *
 */
public class USAccessConnector extends AbstractConnector {

	// User Accounts Map
	private Map<String, Map<String, Object>> accounts;

	/* LOGGING */
	private static org.apache.commons.logging.Log log = LogFactory.getLog(USAccessConnector.class);
	
	private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
	
	private static final String SUCCESS = "SUCCESS";
	
	//Query List Parameter needed for calling QuerySIP endpoint
	private int queryList;
	
	private static ConfigurationContext configContext;
	
	/*
	 * SailPoint Context.
	 */
	private SailPointContext context;
	
	/*
	 * GSA Agency Service Stub.
	 */
	private AgencyServiceStub stub;

	/*
	 * Number of times to retry.
	 */
	private static final int MAX_RETRIES = 3;
	/*
	 * Number of milliseconds to wait between retries.
	 */
	private static final int RETRY_WAIT_MILLIS = 5000;

	
	
	static {
	     try {
			configContext = ConfigurationContextFactory.createConfigurationContextFromFileSystem(null, null);
		} catch (AxisFault e) {
			log.error("Failed to create Axis2 Configuration Context. ", e);
			throw new ConnectorException("Unable to retrieve SailPoint context: " + e);
		}
	}
	
	/**
	 * Default constructor.
	 */
	public USAccessConnector() {
		super();
		try {
			context = SailPointFactory.getCurrentContext();
		} catch (GeneralException e) {
			log.error("Failed to get SailPoint CurrnetContext. ", e);
			throw new ConnectorException("Unable to retrieve SailPoint context: " + e.getMessage());
		}
	}

	/**
	 * Constructor for an account USAccessConnector
	 * 
	 * @param config
	 *            The ConnectorConfig to use.
	 * @param log
	 *            The Log to use.
	 */
	public USAccessConnector(ConnectorConfig config, Log log) {
		super(config, log);
		try {
			context = SailPointFactory.getCurrentContext();
		} catch (GeneralException e) {
			log.error("Failed to get SailPoint CurrnetContext. ", e);
			throw new ConnectorException("Unable to retrieve SailPoint context: " + e.getMessage());
		}
	}
	
	/**
	 * Test Connection.
	 */
	@Override
	public void testConnection() {		
		log.trace("Testing connection");
		String endpoint = config.getString("endpoint");
		HttpURLConnection connect = null;
		try {
			if (StringUtils.isBlank(endpoint)) {
				log.error("Set the wsdl endpoint in the application config map using the property name 'endpoint'");
				throw new ConnectorException(
						"Could not find endpoint URL, the wsdl endpoint in the application config map must be set to the property name 'endpoint'.");
			}
			
			//Create a URL using the endpoint
			URL url = new URL(endpoint);
			
			//Retrieve Proxy Settings
			String proxyAddress = config.getString("proxyAddress");
			String proxyPort = config.getString("proxyPort");
			
			Proxy proxy = null;
			
			//If Proxy Address and Port are populated
			if(!StringUtils.isBlank(proxyAddress) && !StringUtils.isBlank(proxyPort)){
				//Create Proxy
				proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyAddress, portToInt(proxyPort)));	
				//Create an HttpURLConnection
				connect = (HttpURLConnection) url.openConnection(proxy);
			} else {
				//Not Using a Proxy
				connect = (HttpURLConnection) url.openConnection();
			}
			
			//Connect
			connect.connect();
			
			//Retrieve Response Code
			int code = connect.getResponseCode();
			
			//If not 200, throw error
			if(code != HttpURLConnection.HTTP_OK){
				log.error("Connection failed with the following status: " + code);
				InputStream is = connect.getErrorStream();
				if(is != null){
					String error = IOUtils.toString(is);
					log.error("Returned Error Stream: " + error);
					is.close();
				}
				throw new ConnectorException("Connection failed with the following status: " + code);
			}
			log.info("Ping returned status: " + code);
		} catch (MalformedURLException e) {
			log.error("Invalid wsdl endpoint url supplied: " + endpoint + ". ", e);
			throw new ConnectorException("Invalid wsdl endpoint url supplied: " + endpoint + ". " + e.getMessage());
		} catch (IOException e) {
			log.error("IOException occurred while connecting to wsdl endpoint: " + endpoint + ". ", e);
			throw new ConnectorException("IOException occurred while connecting to wsdl endpoint: " + endpoint + ". " + e.getMessage());
		} catch (Exception e) {
			log.error("Connection to wsdl endpoint failed: " + endpoint + ". ", e);
			throw new ConnectorException("Connection to wsdl endpoint failed: " + endpoint + ". " + e.getMessage());
		} finally {
			if (null != connect) {
				//Close connection
				connect.disconnect();
			}
		}
	}

	/**
	 * Return the Map that has the objects for the currently configured object
	 * type. This maps native identifier to the resource object with that
	 * identifier.
	 */
	Map<String, Map<String, Object>> getObjectsMap() throws ConnectorException {
		log.trace("Getting accounts map");
		if (OBJECT_TYPE_ACCOUNT.equals(this.objectType)) {			
			return accounts;
		}
		log.error("Object type is not supported: " + this.objectType);
		throw new ConnectorException("Unhandled object type: " + this.objectType);
	}

	/**
	 * Iterate over user accounts that have changed within a specific time
	 * range.
	 * 
	 * @filter the filter to use to filter the results.
	 */
	public Iterator<Map<String, Object>> iterate(Filter filter) throws ConnectorException {
		log.trace("Iterating over users with recent changes to their accounts");
		Date startTime = null;
		
		//Initialize the Accounts Map
		accounts = new HashMap<String, Map<String, Object>>();
		
		if (OBJECT_TYPE_ACCOUNT.equals(this.objectType)) {
			try {
				//Create Service Client
				stub = new AgencyServiceStub(configContext, config.getString("endpoint"));
				ServiceClient sc = stub._getServiceClient();
				sc.engageModule("rampart");
				sc.engageModule("addressing");

				//Set options
				setServiceOptions(sc);
				//Record start time
				startTime = new Date();

				//Call QueryMofifiedList
				try {
					//loop through Sponsor Organizational Identifiers
					String sponsorOrgIds = config.getString("spnsrOrgId");
					if(StringUtils.isNotBlank(sponsorOrgIds)){
						String[] sponsorOrgs = sponsorOrgIds.split(",");
						for(String sponsorOrgId: sponsorOrgs){
							log.info("------Starting Processing Sponsor Org ID: " + sponsorOrgId + "-------");
							String[] changedPids = getChangedPids(sponsorOrgId);	
							if (changedPids == null || changedPids.length == 0) {
								log.warn("QueryModifiedList ArrayOfstring changedPids is null for sponsorOrgID: " + sponsorOrgId);
							} else {
								//Parse Maximum Records to process from application config
								int maxRecords = 0;
								String maxRecordsStr = config.getString("maxRecords");
								if(!StringUtils.isBlank(maxRecordsStr)){
									try{
										maxRecords = Integer.parseInt(maxRecordsStr);
									} catch(NumberFormatException nfe){
										log.warn("Error parsing maxRecords value : " + maxRecordsStr + ". Proceeding with all returned results");
									}
								}

								log.info("Retrieved " + changedPids.length + " records");

								//Calculate the number of records to process based on the max records if set
								int numberOfRecordsToProcess = 0;
								if(maxRecords > 0 && changedPids.length > maxRecords) {
									numberOfRecordsToProcess = maxRecords;
								} else {
									numberOfRecordsToProcess = changedPids.length;
								}

								log.warn("Processing " + numberOfRecordsToProcess + " out of " + changedPids.length + " records.");
								
								//Count to determine if all returned Pids were processed successfully
								int successfulRecordsCount = 0;

								int availableProcessors = Runtime.getRuntime().availableProcessors();
								log.info("Number of available processors: " + availableProcessors);
								
								String maxThreadsStr = config.getString("maxThreads");
								int maxThreads = 0;
								if(!StringUtils.isBlank(maxThreadsStr)){
									try{
										maxThreads = Integer.parseInt(maxThreadsStr);
									} catch(NumberFormatException nfe){
										log.warn("Error parsing maxThreads value : " + maxThreadsStr + ". Proceeding with all returned results");
									}
								}
								
								//If available processors is greater than the configured maximum threads, use the maxThreads
								//Else use all available processors
								if(maxThreads > 0 && availableProcessors > maxThreads){
									availableProcessors = maxThreads;
								}
								
								//Calculate QueryList to be used when calling QuerySIP endpoint
								queryList = (int) getQueryList();
								
								log.warn("Calling QuerySIP with queryList value: " + queryList);

								//Create Executor Service and initialize with number of threads
								ExecutorService e = Executors.newFixedThreadPool(availableProcessors);

								//List of Future tasks to process
								ArrayList<Future<Boolean>> futures = new ArrayList<Future<Boolean>>();

								//Loop over the number of records to process and call querySIP
								for(int i=0; i< numberOfRecordsToProcess; i++){
									PersonAccount person = new PersonAccount(changedPids[i], sponsorOrgId);
									Future<Boolean> future = e.submit(person);
									futures.add(future);
								}

								//Process results
								for(Future<Boolean> future : futures)
								{
									Boolean success = future.get();
									if(success){
										successfulRecordsCount++;
									}
								}

								//shut down the executor service now
								e.shutdown();

								//Set the last successful run date
								log.warn(successfulRecordsCount + " records successfully proccessed out of " + changedPids.length);	
							}
							log.info("------Completed Processing Sponsor Org ID: " + sponsorOrgId + "-------");
						}
						
						//Save the lastSuccessfulDate
						try {
							Application app = context.getObjectByName(Application.class, TreasuryCustomGlobalStringConst.USACCESS_APPLICATION_NAME);
							if (app != null) {
								String rangeEnd = config.getString("rangeEnd");
								
								if(!StringUtils.isBlank(rangeEnd)){
									log.warn("Setting lastSuccessful date to configured rangeEnd");
									app.setAttribute("lastSuccessfulDate", rangeEnd);
									context.saveObject(app);
								} else {
									log.warn("Setting lastSuccessful date to aggregation task completion date");
									app.setAttribute("lastSuccessfulDate", DateUtil.getFormattedDate(startTime, DATE_FORMAT));
									context.saveObject(app);
								}
								log.warn("LastSuccessfulDate set to: " + app.getAttributeValue("lastSuccessfulDate"));
							} else {
								log.warn("Couldn't retrieve USAccess Application. Failed to save the lastSuccessfulDate");
							}
						} catch (Exception ex) {
							// Don't throw an exception if couldn't update the
							// last successful date.
							log.warn("Failed to save the lastSuccessfulDate for QueryModifiedList.", ex);
						}
					} else {
						log.error("Sponsor Organizational Identifier not specified.");
						throw new ConnectorException("Sponsor Organizational Identifier not specified. Please configure the application spnsrOrgId parameter.");
					}
				} catch (Exception e) {
					log.error("An Exception occurred while calling the SIP Client. ", e);
					throw new ConnectorException("An Exception occurred while calling the SIP Client. " + e.getMessage());
				}
			} catch (AxisFault e) {
				log.error("An Exception occurred while configuring Axis2. ", e);
				throw new ConnectorException("An Exception occurred while configuring Axis2. " + e.getMessage());
			} catch (Exception e) {
				log.error("An Exception occurred while preparing to call the QueryModifiedList endpoint. ", e);
				throw new ConnectorException("An Exception occurred while preparing to call the QueryModifiedList endpoint. " + e.getMessage());
			}
			
			// Return the iterator on a copy of the list to avoid concurrent mod
			// exceptions if entries are added/removed while iterating.
			Iterator<Map<String, Object>> it = new ArrayList<Map<String, Object>>(getObjectsMap().values()).iterator();

			return new FilteredIterator(it, filter);
		} else {
			log.error("Object type is not supported: " + this.objectType);
			throw new ConnectorException("Unhandled object type: " + this.objectType);
		}
	}

	/**
	 * Support all of the features for all supports object types.
	 */
	@Override
	public List<Feature> getSupportedFeatures(String objectType) {
		log.trace("Get Supported Featrues for : " + objectType);
		// Return all features indicated in the application.xml file
		return Arrays.asList(Feature.values());
	}

	@Override
	public Map<String, Object> read(String paramString) {
		Map<String, Object> objectMap = new HashMap<String, Object>();
		try {
			if (OBJECT_TYPE_ACCOUNT.equals(objectType)) {
				Identity user = context.getObject(Identity.class, paramString);
				if (user != null) {
					for (Attribute att : schema.getAttributes()) {
						objectMap.put(att.getName(), user.getAttribute(att.getName()));
					}
				}
			} else {
				log.error("Object type is not supported: " + this.objectType);
				throw new ConnectorException("Unhandled object type: " + this.objectType);
			}
		} catch (GeneralException e) {
			log.error("Unable to retrieve SailPoint context. ", e);
			throw new ConnectorException("Unable to retrieve SailPoint context: " + e.getMessage());
		}
		return objectMap;
	}

	/**
	 * Set the options on the AgencyService Stub.
	 * 
	 * @param sc
	 * 		ServiceClient from the AgencyService Stub.
	 */
	private void setServiceOptions(ServiceClient sc) {
		Options opts = sc.getOptions();

		// Adds "mustUnderstand" to the SOAP envelope elements
		opts.setProperty(AddressingConstants.ADD_MUST_UNDERSTAND_TO_ADDRESSING_HEADERS, true);
		
		// Include 'replyTo: anon' in the SOAP header/addressing
		opts.setProperty(AddressingConstants.INCLUDE_OPTIONAL_HEADERS, Boolean.TRUE);

		// Disable HTTP 'chunking' mode
		// See also http://wso2.org/library/952
		opts.setProperty(HTTPConstants.CHUNKED, Boolean.FALSE);
		
		// Remove "action" from the "Content-Type" within the HTTP header 
		// - otherwise IIS rejects the request by issuing a "connection reset"
		opts.setProperty(Constants.Configuration.DISABLE_SOAP_ACTION, Boolean.TRUE);
		
		// .NET follows the "submission" instead of the "final" addressing
		// standard - "unknown action" issue 
		opts.setProperty(AddressingConstants.WS_ADDRESSING_VERSION, AddressingConstants.Submission.WSA_NAMESPACE);
		
		//Set the Proxy if configured.
		String proxyAddress = config.getString("proxyAddress");
		String proxyPort = config.getString("proxyPort");
		
		//If Proxy Address and Port are populated
		if(!StringUtils.isBlank(proxyAddress) && !StringUtils.isBlank(proxyPort)){
			// Set the proxy
			ProxyProperties proxyProperties = new ProxyProperties();
			proxyProperties.setProxyName(proxyAddress);
			proxyProperties.setProxyPort(portToInt(proxyPort));
			opts.setProperty(HTTPConstants.PROXY, proxyProperties);
		}
		
		//Set the security policy
		opts.setProperty(RampartMessageData.KEY_RAMPART_POLICY, getPolicy());
			
		
		//Set the password callback handler which returns the password of the private key
		opts.setProperty(WSHandlerConstants.PW_CALLBACK_REF, new CallbackHandler() {

			@Override
			public void handle(final Callback[] callbacks) throws IOException, UnsupportedCallbackException {
	
				String pwd = config.getString("keyStorePassword");				
				for (int i = 0; i < callbacks.length; i++) {
					
					// To use the private key to sign messages, we need to provide 
					// the private key password 
					WSPasswordCallback  pwcb = (WSPasswordCallback )callbacks[i];
			
					//Retrieve Key Store User
					String user = pwcb.getIdentifier();

					//Check if user matches keyStoreAlias
					if(!StringUtils.isBlank(user)){
						if(user.equals(config.getString("keyStoreAlias"))){
							pwcb.setPassword(pwd);
						} else {
							log.error("UnsupportedCallbackException: " + callbacks[i] + ". No password found for " + user);
							throw new ConnectorException("UnsupportedCallbackException: " + callbacks[i] + ". No password found for " + user);
						}
					}
				}
				return;
			}
		});
	}
	
	/*
	 * Set the Authentication policy which signs and encrypts the request.
	 */
	private Policy getPolicy(){
		Policy policy = null;
		try {
			
			//Get the Policy Path
			StAXOMBuilder builder = new StAXOMBuilder(config.getString("policyPath"));
			policy = org.apache.neethi.PolicyEngine.getPolicy(builder.getDocumentElement());

			//Create the RampartConfig object used to sign and encrypt the message
			RampartConfig rampartConfig = new RampartConfig();
			rampartConfig.setUserCertAlias(config.getString("keyStoreAlias"));
			rampartConfig.setEncryptionUser(config.getString("trustStoreAlias"));

			//Signing Properties
			CryptoConfig sigCrypto = new CryptoConfig();
			sigCrypto.setProvider("org.apache.ws.security.components.crypto.Merlin");
			Properties sigProps = new Properties();
			sigProps.setProperty("org.apache.ws.security.crypto.merlin.keystore.type", config.getString("keyStoreType"));
			sigProps.setProperty("org.apache.ws.security.crypto.merlin.file", config.getString("keyStorePath"));
			sigProps.setProperty("org.apache.ws.security.crypto.merlin.keystore.password", context.decrypt(config.getString("keyStorePassword")));
			sigCrypto.setProp(sigProps);
			rampartConfig.setSigCryptoConfig(sigCrypto);

			//Encryption Properties
			CryptoConfig encCrypto = new CryptoConfig();
			encCrypto.setProvider("org.apache.ws.security.components.crypto.Merlin");
			Properties encProps = new Properties();
			encProps.setProperty("org.apache.ws.security.crypto.merlin.keystore.type", config.getString("trustStoreType"));
			encProps.setProperty("org.apache.ws.security.crypto.merlin.file", config.getString("trustStorePath"));
			encProps.setProperty("org.apache.ws.security.crypto.merlin.keystore.password", context.decrypt(config.getString("trustStorePassword")));
			encCrypto.setProp(encProps);
			rampartConfig.setEncrCryptoConfig(encCrypto);
			
			//Attach the rampart configuration to the policy
			policy.addAssertion(rampartConfig);
		} catch (FileNotFoundException e) {
			log.error("Required authentication policy file not found. ", e);
			throw new ConnectorException("Required authentication policy file not found. " + e.getMessage());
		} catch (Exception e){
			log.error("An error occured while creating Rampart Policy for USAccess authentication. ", e);
			throw new ConnectorException("An error occured while creating Rampart Policy for USAccess authentication. " + e.getMessage());
		}
		return policy;
	}	


	/**
	 * Parse the port from a string to an integer.
	 * @param s
	 * @return
	 */
	private int portToInt(String s){
		try {
			return Integer.parseInt(s);
		} catch (NumberFormatException nfe){		
			log.error("An error occured while parsing " + s + " to an integer.", nfe);
			throw new ConnectorException("Invalid number: " + s + "." + nfe.getMessage());
		}
	}
	
	/**
	 * QueryMofidfiedList
	 * @return
	 */
	public String[] getChangedPids(String sponsorOrgId){
		String[] changedPids = null;
		
		TransactionHeader th = new TransactionHeader();
		th.setSystemID(config.getString("systemId"));
		
		//Transaction Organizational Identifier
		String transOrgId = config.getString("transOrgId");
						
		//Set the Transaction Organizational Identifier
		th.setTransactionOrganizationalIdentifier(transOrgId);
		
		//Generate a random Transaction ID starting with the transOrgId
		
		th.setTransactionID(getRandomTransID(transOrgId));
		
		//Set the Transaction Timestamp
		th.setTransactionTimeStamp(Calendar.getInstance());
		
		QueryModifiedList mdl = new QueryModifiedList();
		mdl.setTransactionHeader(th);
		mdl.setSponsorOrganizationalIdentifier(sponsorOrgId);
		
		//Set the rangeStart and rangeEnd dates for the QueryModifiedList Call				
		Calendar startDate = Calendar.getInstance();
		Calendar endDate = Calendar.getInstance();
		
		String rangeStart = config.getString("rangeStart");
		String rangeEnd = config.getString("rangeEnd");
		
		if(!StringUtils.isBlank(rangeStart) && !StringUtils.isBlank(rangeEnd)){
			log.warn("Ignoring Last successful run date and using the configured parameters rangeStart and rangeEnd");
			try {
				startDate.setTime(DateUtil.stringToDate(rangeStart, DATE_FORMAT));
				endDate.setTime(DateUtil.stringToDate(rangeEnd, DATE_FORMAT));
			} catch (ParseException e) {
				log.error("Error parsing rangeStart/rangeEnd: ", e);
				throw new ConnectorException("Error parsing rangeStart/rangeEnd: " + e.getMessage());
			}
		} else {
			String lastSuccessfulDate = (String) config.getAttribute("lastSuccessfulDate");
			if(!StringUtils.isBlank(lastSuccessfulDate)){
				try {
					startDate.setTime(DateUtil.stringToDate(lastSuccessfulDate, DATE_FORMAT));
					//End date is set above to today
				} catch (ParseException e) {
					log.error("Error parsing lastSuccessfulDate: ", e);
					throw new ConnectorException("Error parsing lastSuccessfulDate: " + e.getMessage());
				}
			} else {
				log.error("No lastSuccessfulDate stored on the application, please set the initial run rangeStart and rangeEnd attributes.");
				throw new ConnectorException("No lastSuccessfulDate stored on the application, please set the initial run rangeStart and rangeEnd attributes.");
			}
		}

		log.info(String.format("QueryModifiedList:  Date range %s - %s", startDate.getTime().toString(), endDate.getTime().toString()));

		mdl.setRangeStart(startDate);
		mdl.setRangeEnd(endDate);
		
		//Call QueryMofifiedList - catch java.net.SocketTimeoutException
		try {

			/**
			 * Will retry until the max number of retries if the cause of the exception is a SocketTimeoutException
			 * list. After max retries is reached it will run one more time
			 */

			QueryModifiedListResponse queryModifiedListResp = null;
			int count = 0;
			int maxRetries = MAX_RETRIES + 1; // Add one for the initial run, then retry max retries after that
			int waitMillis = RETRY_WAIT_MILLIS;

			do {
				try {
					log.trace("Try number " + count + " for queryModifiedList");
					count++;
					queryModifiedListResp = stub.queryModifiedList(mdl);
				} catch (Exception ex) {
					//Check for a socketTimeoutException
					if(ex instanceof SocketTimeoutException) {
						log.trace("SocketTimeoutException occurred: " + ex.getMessage());
						if (count < maxRetries) {
							log.trace("Retrying queryModifiedList call in " + waitMillis + " milliseconds, retry number " + count);
							Thread.sleep(waitMillis);
						} else {
							log.trace("Maximum retries reached: " + ex.getMessage());
							throw ex;
						}
					} else {
						log.trace("Not retrying queryModifiedList as exception occurred is of not type SocketTimeoutException.");
						throw ex;
					}
				}
			} while(queryModifiedListResp == null && count <= maxRetries);

			if (queryModifiedListResp == null) {
				log.error("QueryModifiedListResponse is null");
				throw new ConnectorException("QueryModifiedListResponse is null for SponsorOrgID: " + sponsorOrgId + ". Please check RangeStart/RangeEnd configurations as well as authentication parameters.");
			} else {
				TransactionStatus transactionStatus = queryModifiedListResp.getTransactionStatus();
				if(transactionStatus != null){
					//Check if the returned status from USAccess is equal to "SUCCESS"
					if(transactionStatus.getStatusCode() != null && SUCCESS.equalsIgnoreCase(transactionStatus.getStatusCode().trim())){
						ArrayOfstring aoPids = queryModifiedListResp.getPids();
						if(aoPids == null){
							log.warn("QueryModifiedListResponse ArrayOfstring is null for SponsorOrgID: " + sponsorOrgId);
						} else {
							//getSring returns an array of String
							changedPids = aoPids.getString();
						}
					} else {
						log.error("QueryModifiedList failed with the following message for SponsorOrgID: " + sponsorOrgId + ". " + transactionStatus.getStatusCode() + ": " + transactionStatus.getStatusMessage());										
						throw new ConnectorException("QueryModifiedList failed with the following message for SponsorOrgID: " + sponsorOrgId + ". " + transactionStatus.getStatusCode() + ": " + transactionStatus.getStatusMessage());
					}
				} else {
					log.error("QueryModifiedListResponse TransactionStatus is null for SponsorOrgID: " + sponsorOrgId);
					throw new ConnectorException("QueryModifiedListResponse TransactionStatus is null for SponsorOrgID: " + sponsorOrgId);
				}
			}
		} catch(Exception e){
			log.error("An exception occurred while calling QueryModifiedList for SponsorOrgID: " + sponsorOrgId, e);
			throw new ConnectorException("An exception occurred while calling QueryModifiedList for SponsorOrgID: " + sponsorOrgId + ". " + e.getMessage());
		}
		return changedPids;
	}
	
	class PersonAccount implements Callable<Boolean>
	{
		//Person ID returned from USAccess
	    private String personID;
	    
	    private String sponsorOrgID;
	 
	    public PersonAccount(String personID, String sponsorOrgID) {
	        this.personID = personID;
	        this.sponsorOrgID = sponsorOrgID;
	    }
	 
	    /*
	     * 
	     * @see java.util.concurrent.Callable#call()
	     * 
	     * Returns true for success and false for failure
	     */
	    @Override
	    public Boolean call() throws Exception {
	    	
	    	try {
	    		//Prepare QuerySIP call
				QuerySIP qs = new QuerySIP();
				
				TransactionHeader th = new TransactionHeader();
				th.setSystemID(config.getString("systemId"));
				
				//Transaction Organizational Identifier
				String transOrgId = config.getString("transOrgId");
								
				//Set the Transaction Organizational Identifier
				th.setTransactionOrganizationalIdentifier(transOrgId);
							
				//Set the Transaction Timestamp
				th.setTransactionTimeStamp(Calendar.getInstance());
				th.setTransactionID(getRandomTransID(transOrgId));
				
				qs.setTransactionHeader(th);
				
				//Create the PersonIdentifier Object and set the PersonID to the ID returned from QueryModified List
				PersonIdentifier pid = new PersonIdentifier();
				pid.setPersonID(personID);
				pid.setSponsorOrganizationalIdentifier(sponsorOrgID);
				
				//Set the QuerySIP PersonIdentifier Object
				qs.setPersonIdentifier(pid);
				
				//Set the QuerySIP QueryList Parameter
				qs.setQueryList(queryList);
				
				//Call the QuerySIP Webservice Method
				QuerySIPResponse querySIPResp = stub.querySIP(qs);
				if (querySIPResp == null) {
					log.warn("QuerySIP Response is null for user: " + personID);
				} else {
					TransactionStatus transactionStatus = querySIPResp.getTransactionStatus();
					if(transactionStatus != null){
						//Check if the returned status from USAccess is equal to "SUCCESS"
						if(transactionStatus.getStatusCode() != null && SUCCESS.equalsIgnoreCase(transactionStatus.getStatusCode().trim())){
							//Add the account to the accounts map
							accounts.put(personID, getAccountFromQuerySIPResponse(querySIPResp, personID));
							return true;
						} else {
							log.error("QuerySIP failed with the following message for user personID: " + personID + ". " + transactionStatus.getStatusCode() + ": " + transactionStatus.getStatusMessage());										
						}
					} else {
						log.error("TransactionStatus is null for user: " + personID);
					}
				}
		        return false;
	    	} catch(Exception e){
	    		log.error("Call QuerySIP failed for user: " + personID + ". ", e);
	    		return false;
	    	}	    	
	    }	    
	    
	    /**
	     * Create an account from the QuerySIPResponse Object.
	     * @param querySIPResp
	     * @param personID
	     * @return
	     */
	    private Map<String, Object> getAccountFromQuerySIPResponse(QuerySIPResponse querySIPResp, String personID){
			//Create Account Object
			Map<String, Object> account = new HashMap<String, Object>();
			
			//Person Identifier
			PersonIdentifier personIdentifier = querySIPResp.getPersonIdentifier();
			if(personIdentifier != null){
				account.put("PersonIdentifier-PersonID", personIdentifier.getPersonID());
				account.put("PersonIdentifier-SponsorOrganizationalIdentifier", personIdentifier.getSponsorOrganizationalIdentifier());
				account.put("PersonIdentifier-AgencyPersonGUID", personIdentifier.getAgencyPersonGUID());
			} else {
				log.debug("PersonIdentifier is null for user: " + personID);
			}
			
			//Personal Information
			PersonalInformation personalInfo = querySIPResp.getPersonalInformation();
			if(personalInfo != null){
				account.put("Personal-FirstName", personalInfo.getFirstName());
				account.put("Personal-MiddleName", personalInfo.getMiddleName());
				account.put("Personal-LastName", personalInfo.getLastName());
				account.put("Personal-Suffix", personalInfo.getSuffix());
				//account.put("Personal-SSN", personalInfo.getSSN());
				account.put("Personal-TaxID", personalInfo.getTaxID());
				account.put("Personal-ForeignID", personalInfo.getForeignID());
				account.put("Personal-DateofBirth", calendarToString(personalInfo.getDateofBirth()));
				account.put("Personal-BirthCountryCode", personalInfo.getBirthCountryCode());
				account.put("Personal-BirthStateCode", personalInfo.getBirthStateCode());
				account.put("Personal-BirthCity", personalInfo.getBirthCity());
				account.put("Personal-CitizenshipCountryCode", personalInfo.getCitizenshipCountryCode());
				account.put("Personal-AddressLine1", personalInfo.getAddressLine1());
				account.put("Personal-AddressLine2", personalInfo.getAddressLine2());
				account.put("Personal-AddressLine3", personalInfo.getAddressLine3());
				account.put("Personal-City", personalInfo.getCity());
				account.put("Personal-StateCode", personalInfo.getStateCode());
				account.put("Personal-Zip", personalInfo.getZip());
				account.put("Personal-CountryCode", personalInfo.getCountryCode());
				account.put("Personal-HomePhone", personalInfo.getHomePhone());
				account.put("Personal-CellPhone", personalInfo.getCellPhone());
				account.put("Personal-HomeEmail", personalInfo.getHomeEmail());
				account.put("Personal-OtherEmail", personalInfo.getOtherEmail());
				account.put("Personal-Gender", personalInfo.getGender());
				account.put("Personal-Race", personalInfo.getRace());
				account.put("Personal-EyeColor", personalInfo.getEyeColor());
				account.put("Personal-HairColor", personalInfo.getHairColor());
				account.put("Personal-Height", personalInfo.getHeight());
				account.put("Personal-Weight", personalInfo.getWeight());
			} else {
				log.debug("PersonalInformation is null for user: " + personID);
			}

			//Sponsorship Information
			SponsorshipInformation sponsorshipInfo = querySIPResp.getSponsorshipInformation();
			if(sponsorshipInfo != null){
				account.put("Sponsorship-SubAgencyAbbreviation", sponsorshipInfo.getSubAgencyAbbreviation());
				account.put("Sponsorship-EmployeeStatus", sponsorshipInfo.getEmployeeStatus());
				account.put("Sponsorship-PersonOrganizationAssociationCategory", sponsorshipInfo.getPersonOrganizationAssociationCategory());
				account.put("Sponsorship-SponsorPID", sponsorshipInfo.getSponsorPID());
				account.put("Sponsorship-PIVCardRequiredCode", sponsorshipInfo.getPIVCardRequiredCode());
				account.put("Sponsorship-PIVCardType", sponsorshipInfo.getPIVCardType());
				account.put("Sponsorship-BusinessPhone", sponsorshipInfo.getBusinessPhone());
				account.put("Sponsorship-BusinessEmail", sponsorshipInfo.getBusinessEmail());
				account.put("Sponsorship-FederalEmergencyResponseOfficialFlag", sponsorshipInfo.getFederalEmergencyResponseOfficialFlag());
				account.put("Sponsorship-CardShippingTypeCode", sponsorshipInfo.getCardShippingTypeCode());
				account.put("Sponsorship-CardShipAddrCode", sponsorshipInfo.getCardShipAddrCode());
				account.put("Sponsorship-UPN", sponsorshipInfo.getUPN());
				account.put("Sponsorship-Rank", sponsorshipInfo.getRank());
				account.put("Sponsorship-AgencySpecificText", sponsorshipInfo.getAgencySpecificText());
				account.put("Sponsorship-AgencySpecificData", sponsorshipInfo.getAgencySpecificData());
				account.put("Sponsorship-CardHeader", sponsorshipInfo.getCardHeader());
				account.put("Sponsorship-ContractNumber", sponsorshipInfo.getContractNumber());
				account.put("Sponsorship-EmployeeID", sponsorshipInfo.getEmployeeID());
				account.put("Sponsorship-PIVCertificateSet", sponsorshipInfo.getPIVCertificateSet());
				account.put("Sponsorship-DateofSponsorship", calendarToString(sponsorshipInfo.getDateofSponsorship()));
				account.put("Sponsorship-CredentialOption", sponsorshipInfo.getCredentialOption());
			} else {
				log.debug("SponsorshipInformation is null for user: " + personID);
			}
			
			//Enrollment Information
			EnrollmentInformation enrollmentInfo = querySIPResp.getEnrollmentInformation();
			if(enrollmentInfo != null){
				account.put("Enrollment-EnrollmentSiteCode", enrollmentInfo.getEnrollmentSiteCode());
				account.put("Enrollment-RegistrarPersonID", enrollmentInfo.getRegistrarPersonID());
				account.put("Enrollment-InitialEnrollmentDate", calendarToString(enrollmentInfo.getInitialEnrollmentDate()));
				account.put("Enrollment-LastEnrollmentDate", calendarToString(enrollmentInfo.getLastEnrollmentDate()));
			} else {
				log.debug("EnrollmentInformation is null for user: " + personID);
			}
			
			//Fingerprint Information
			FingerprintInformation fingerprintInfo = querySIPResp.getFingerprintInformation();
			if(fingerprintInfo != null){
				account.put("Fingerprint-PrimaryPrintIndicator", fingerprintInfo.getPrimaryPrintIndicator());
				account.put("Fingerprint-SecondaryPrintIndicator", fingerprintInfo.getSecondaryPrintIndicator());
				account.put("Fingerprint-FTEReasonCode", fingerprintInfo.getFteReasonCode());
			} else {
				log.debug("FingerprintInformation is null for user: " + personID);
			}
			
			//Adjudication information
			AdjudicationInformation adjudicationInfo = querySIPResp.getAdjudicationInformation();
			if(adjudicationInfo != null){
				account.put("Adjudication-NACAdjudicationValue", adjudicationInfo.getNACAdjudicationValue());
				account.put("Adjudication-NACAdjudicatorPersonID", adjudicationInfo.getNACAdjudicatorPersonID());
				account.put("Adjudication-NACAdjudicationEffDate", calendarToString(adjudicationInfo.getNACAdjudicationEffDate()));
				account.put("Adjudication-NACIAdjudicationValue", adjudicationInfo.getNACIAdjudicationValue());
				account.put("Adjudication-NACIAdjudicatorPersonID", adjudicationInfo.getNACIAdjudicatorPersonID());
				account.put("Adjudication-NACIAdjudicationEffDate", calendarToString(adjudicationInfo.getNACIAdjudicationEffDate()));
				account.put("Adjudication-AdjudicationNote", adjudicationInfo.getAdjudicationNote());
				account.put("Adjudication-SOI", adjudicationInfo.getSOI());
				account.put("Adjudication-SON", adjudicationInfo.getSON());
				account.put("Adjudication-OPAC", adjudicationInfo.getOPAC());
			} else {
				log.debug("AdjudicationInformation is null for user: " + personID);
			}
			
			//Status Information
			StatusInformation statusInfo = querySIPResp.getStatusInformation();
			if (statusInfo != null){
				account.put("Status-SponsorshipStatus", statusInfo.getSponsorshipStatus());
				account.put("Status-SponsorshipLastUpdate", calendarToString(statusInfo.getSponsorshipLastUpdate()));
				account.put("Status-EnrollmentStatus", statusInfo.getEnrollmentStatus());
				account.put("Status-EnrollmentLastUpdate", calendarToString(statusInfo.getEnrollmentLastUpdate()));
				account.put("Status-AdjudicationStatus", statusInfo.getAdjudicationStatus());
				account.put("Status-AdjudicationLastUpdate", calendarToString(statusInfo.getAdjudicationLastUpdate()));
				account.put("Status-IssuanceStatus", statusInfo.getIssuanceStatus());
				account.put("Status-IssuanceLastUpdate", calendarToString(statusInfo.getIssuanceLastUpdate()));
				account.put("Status-ReplacementStatus", statusInfo.getReplacementStatus());
				account.put("Status-ReplacementLastUpdate", calendarToString(statusInfo.getReplacementLastUpdate()));
				account.put("Status-DocumentReferral", statusInfo.getDocumentReferral());
				account.put("Status-DuplicateCheck", statusInfo.getDuplicateCheck());
				account.put("Status-CertificateReissuanceRequest", statusInfo.getCertificateReissuanceRequest());
				account.put("Status-CertificateReissuanceRequestDate", calendarToString(statusInfo.getCertificateReissuanceRequestDate()));
				account.put("Status-CardReprintRequest", statusInfo.getCardReprintRequest());
				account.put("Status-CardReprintRequestDate", calendarToString(statusInfo.getCardReprintRequestDate()));
				account.put("Status-CardReissueRequest", statusInfo.getCardReissueRequest());
				account.put("Status-CardReissueRequestDate", calendarToString(statusInfo.getCardReissueRequestDate()));
				
				//Array Of Process Status
				ArrayOfProcessStatus processStatusList = statusInfo.getProcessStatusList();
				if(processStatusList != null){
					ProcessStatus[] processStatusArray = processStatusList.getProcessStatus();
					if(processStatusArray != null && processStatusArray.length > 0){
						int latestIndex = processStatusArray.length - 1;
						//Retrieve latest Process Status Code and Date from the Process Status List
						ProcessStatus latestProcessStatus = processStatusArray[latestIndex];
						if(latestProcessStatus != null){
							account.put("Status-ProcessStatusCode", latestProcessStatus.getProcessStatusCode());
							account.put("Status-ProcessStatusCodeDate", calendarToString(latestProcessStatus.getProcessStatusCodeDate()));
						} else {
							log.debug("Latest Process Status is null for user: " + personID);
						}
					}
				} else {
					log.debug("ProcessStatus List is null for user: " + personID);
				}
				
			} else {
				log.debug("StatusInformation is null for user: " + personID);
			}
			
			//Current Credential Information
			CredentialInformation currentCredInfo = querySIPResp.getCurrentCredentialInformation();
			if(currentCredInfo != null){
				account.put("CurrentCredential-IssuanceID", currentCredInfo.getIssuanceID());
				account.put("CurrentCredential-ChuidStatus", currentCredInfo.getChuidStatus());
				account.put("CurrentCredential-CardStatus", currentCredInfo.getCardStatus());
				account.put("CurrentCredential-CardSerialNumber", currentCredInfo.getCardSerialNumber());
				account.put("CurrentCredential-PIVCardType", currentCredInfo.getPIVCardType());
				account.put("CurrentCredential-CertificateExpiryDate", calendarToString(currentCredInfo.getCertificateExpiryDate()));
				account.put("CurrentCredential-CardExpiryDate", calendarToString(currentCredInfo.getCardExpiryDate()));
				account.put("CurrentCredential-FascnDecoded", currentCredInfo.getFascnDecoded());
			} else {
				log.debug("CurrentCredentialInformation is null for user: " + personID);
			}
			
			//Replacement Credential Information
			CredentialInformation replacementCredInfo = querySIPResp.getReplacementCredentialInformation();
			if(replacementCredInfo != null){
				account.put("ReplacementCredential-IssuanceID", replacementCredInfo.getIssuanceID());
				account.put("ReplacementCredential-ChuidStatus", replacementCredInfo.getChuidStatus());
				account.put("ReplacementCredential-CardStatus", replacementCredInfo.getCardStatus());
				account.put("ReplacementCredential-CardSerialNumber", replacementCredInfo.getCardSerialNumber());
				account.put("ReplacementCredential-PIVCardType", replacementCredInfo.getPIVCardType());
				account.put("ReplacementCredential-CertificateExpiryDate", calendarToString(replacementCredInfo.getCertificateExpiryDate()));
				account.put("ReplacementCredential-CardExpiryDate", calendarToString(replacementCredInfo.getCardExpiryDate()));
				account.put("ReplacementCredential-FascnDecoded", replacementCredInfo.getFascnDecoded());
			} else {
				log.debug("ReplacementCredentialInformation is null for user: " + personID);
			}
			
			//Prior Credential Information
			ArrayOfCredentialInformation priorCredInfoArray = querySIPResp.getPriorCredentialInformation();
			if(priorCredInfoArray != null){
				CredentialInformation[] priorCredentials = priorCredInfoArray.getCredentialInformation();
				if(priorCredentials != null && priorCredentials.length > 0){
					for(int j=0; j< priorCredentials.length; j++){
						CredentialInformation priorCredInfo = priorCredentials[j];
						if(priorCredInfo != null){
							account.put("PriorCredential-IssuanceID", priorCredInfo.getIssuanceID());
							account.put("PriorCredential-ChuidStatus", priorCredInfo.getChuidStatus());
							account.put("PriorCredential-CardStatus", priorCredInfo.getCardStatus());
							account.put("PriorCredential-CardSerialNumber", priorCredInfo.getCardSerialNumber());
							account.put("PriorCredential-PIVCardType", priorCredInfo.getPIVCardType());
							account.put("PriorCredential-CertificateExpiryDate", calendarToString(priorCredInfo.getCertificateExpiryDate()));
							account.put("PriorCredential-CardExpiryDate", calendarToString(priorCredInfo.getCardExpiryDate()));
							account.put("PriorCredential-FascnDecoded", priorCredInfo.getFascnDecoded());
							//TODO: only processing latest PriorCredential information, awaiting answer if others need to be processed.
							break;
						} else {
							log.debug("PriorCredential-CredentialInformation[" + j + "] is null for user: " + personID);
						}
					}
				} else {
					log.debug("PriorCredential-CredentialInformation is null for user: " + personID);
				}
			} else {
				log.debug("PriorCredentialInformation is null for user: " + personID);
			}
			return account;
		}
	    
	    /**
	     * Convert calendar to string.
	     * @param cal
	     * @return
	     */
	    private String calendarToString(Calendar cal){
			if(cal != null && cal.getTime() != null){
				return cal.getTime().toString();
			}
			return null;
		}
	}
    
    /**
	 * Method to calculate the bit-wise or of the QueryList parameters specified in the USAccess SIP documentation.
	 * @return
	 */
	private long getQueryList() {
		//Get the queryList attribute from the application
		List<String> queryList = (List<String>) config.getAttribute("queryList");
		//Bit wise OR value
		long ql = 0;
		//Calculate the queryList value based on application config
		if(queryList != null && queryList.size() > 0){			
			try {
				Custom globalConsts = context.getObjectByName(Custom.class, TreasuryCustomGlobalStringConst.CUSTOM_GLOBAL_OBJECT_NAME);
				if (globalConsts != null) {
					Map queryMap = (Map) globalConsts.get(TreasuryCustomGlobalStringConst.QUERY_LIST_MAPPINGS_KEY);
					//Map values from custom global queryList
					if (queryMap != null) {
						for (String queryKey : queryList) {
							String q = (String) queryMap.get(queryKey);
							if (!StringUtils.isBlank(q)) {
								long queryCode = Integer.parseInt(q) & 0xffffffffL;
								ql = ql | queryCode;
							} else {
								log.warn("Invalid queryList entry: " + queryKey + ". Skipping this entry.");
							}
						}
					} else{
						log.error("No values found in " + TreasuryCustomGlobalStringConst.QUERY_LIST_MAPPINGS_KEY + " when mapping QueryList parameters. Please update the global constants map.");
						throw new ConnectorException("No values found in " + TreasuryCustomGlobalStringConst.QUERY_LIST_MAPPINGS_KEY + " when mapping QueryList parameters.");
					}
				} else {
					log.error("Unable to retrieve custom global object " + TreasuryCustomGlobalStringConst.CUSTOM_GLOBAL_OBJECT_NAME + " to retrieve configured queryList parameter.");
					throw new ConnectorException("Unable to retrieve custom global object " + TreasuryCustomGlobalStringConst.CUSTOM_GLOBAL_OBJECT_NAME + " to retrieve configured queryList parameter.");
				}
			} catch (Exception e) {
				log.error("Error processing QueryList into long representation. ", e);
				throw new ConnectorException("An exception occurred while processing QueryList parameter for QuerySIP. " + e.getMessage());
			}
		} else {
			log.error("QueryList parameter cannot be null. Please configure the application queryList in the application configuration");
			throw new ConnectorException("QueryList parameter cannot be null.");
		}
		return ql;
	}
	
	/**
	 * Generate a random transaction id.
	 * @param transOrgId
	 * @return
	 */
    private synchronized String getRandomTransID(String transOrgId) {
		SecureRandom rand = new SecureRandom();
		int num = rand.nextInt(9000000) + 1000000;
		return transOrgId + "_" + num;
	}
}
package gov.dhs.cdm.sailpoint.connector;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

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
import org.apache.ws.security.WSPasswordCallback;
import org.apache.ws.security.handler.WSHandlerConstants;

import com.oracle.xmlns.hrc_pds_cdm_querymurapplication.hrc_pds_cdm_querymur.hrc_pds_cdm_querymur_bpel.Hrc_pds_cdm_querymur_bpel_client_epStub;
import com.oracle.xmlns.hrc_pds_cdm_querymodifiedlistapplication.hrc_pds_cdm_querymodifiedlist.hrc_pds_cdm_querymodifiedlist.Hrc_pds_cdm_querymodifiedlist_client_epStub;

import cdmpersonschema.transform.pds.CDMPersonSchemaRequest;
import cdmpersonschema.transform.pds.CDMPersonSchemaResponse;
import cdmpersonschema.transform.pds.CDMQueryBPELRequest;
import cdmpersonschema.transform.pds.CDMQueryBPELResponse;
import cdmpersonschema.transform.pds.ErrorInfoType;
import cdmpersonschema.transform.pds.ErrorInformationType;
import cdmpersonschema.transform.pds.PersonInfoType;
import cdmpersonschema.transform.pds.TrustInformationType;
import cdmpersonschema.transform.pds.TrustType;
import gov.dhs.cdm.sailpoint.connector.USAccessConnector.PersonAccount;
import gov.dhs.cdm.sailpoint.util.DateUtil;
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
import sailpoint.object.Identity;
import sailpoint.tools.GeneralException;

/**
 * 
 * HRConnectConnector Class, connects to HRConnect Webservice.
 *
 */
public class HRConnectConnector extends AbstractConnector {

	// User Accounts Map
	private Map<String, Map<String, Object>> accounts;

	/* LOGGING */
	private static org.apache.commons.logging.Log log = LogFactory.getLog(HRConnectConnector.class);
	
	private static ConfigurationContext configContext;

	private static final String[] DATE_FORMATS = {"yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", "yyyy-MM-dd"};
	
	private static final String SUCCESS = "Success";
	
	/*
	 * SailPoint Context.
	 */
	private SailPointContext context;

	/*
	 * Query Service Stub.
	 */
	private Hrc_pds_cdm_querymodifiedlist_client_epStub queryStub;
	
	/*
	 * GetPerson Service Stub.
	 */
	private Hrc_pds_cdm_querymur_bpel_client_epStub personStub;

	/*
	 * Number of times to retry.
	 */
	private static final int MAX_RETRIES = 3;
	/*
	 * Number of milliseconds to wait between retries.
	 */
	private static final int RETRY_WAIT_MILLIS = 5000;

	//
	private static final String NO_RECORDS_ERROR = "No records were found matching the search criteria";

	
	
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
	public HRConnectConnector() {
		super();
		try {
			context = SailPointFactory.getCurrentContext();
		} catch (GeneralException e) {
			log.error("Failed to get SailPoint CurrentContext. ", e);
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
	public HRConnectConnector(ConnectorConfig config, Log log) {
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
		String queryEndpoint = config.getString("queryEndpoint");
		HttpURLConnection connect = null;
		try {
			if (StringUtils.isBlank(queryEndpoint)) {
				log.error("Set the wsdl query endpoint in the application config map using the property name 'queryEndpoint'");
				throw new ConnectorException(
						"Could not find endpoint URL, the wsdl endpoint in the application config map must be set to the property name 'endpoint'.");
			}
			
			//Create a URL using the queryEndpoint
			URL url = new URL(queryEndpoint);
			
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
			log.error("Invalid wsdl endpoint url supplied: " + queryEndpoint + ". ", e);
			throw new ConnectorException("Invalid wsdl endpoint url supplied: " + queryEndpoint + ". " + e.getMessage());
		} catch (IOException e) {
			log.error("IOException occurred while connecting to wsdl endpoint: " + queryEndpoint + ". ", e);
			throw new ConnectorException("IOException occurred while connecting to wsdl endpoint: " + queryEndpoint + ". " + e.getMessage());
		} catch (Exception e) {
			log.error("Connection to wsdl endpoint failed: " + queryEndpoint + ". ", e);
			throw new ConnectorException("Connection to wsdl endpoint failed: " + queryEndpoint + ". " + e.getMessage());
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
		log.trace("SIZE: " + accounts.size());
		if (OBJECT_TYPE_ACCOUNT.equals(this.objectType)) {
			log.trace("returning accounts: " + accounts);
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
		
		//Initialize the Accounts Map
		accounts = new HashMap<String, Map<String, Object>>();
		
		if (OBJECT_TYPE_ACCOUNT.equals(this.objectType)) {
			try {
				//Create Service Client for query
				queryStub = new Hrc_pds_cdm_querymodifiedlist_client_epStub(configContext, config.getString("queryEndpoint"));
				ServiceClient scq = queryStub._getServiceClient();

				//Set options
				setServiceOptions(scq);
				
				//Create Service Client for person
				personStub = new Hrc_pds_cdm_querymur_bpel_client_epStub(configContext, config.getString("personEndpoint"));
				ServiceClient scp = personStub._getServiceClient();

				//Set options
				setServiceOptions(scp);
				
				String startTime = DateUtil.getFormattedToday(DATE_FORMATS[0]);
				
				//Call QueryMofifiedList
				try {
					//loop through Sponsor Organizational Identifiers
					String sponsorOrgIds = config.getString("spnsrOrgId");
					if(StringUtils.isNotBlank(sponsorOrgIds)){
						String[] sponsorOrgs = sponsorOrgIds.split(",");
						for(String sponsorOrgId: sponsorOrgs){
							log.info("------Starting Processing Sponsor Org ID: " + sponsorOrgId + "-------");
							PersonInfoType[] changedUsers = getChangedUsers(sponsorOrgId);	
							if (changedUsers == null || changedUsers.length == 0) {
								log.warn("QueryModifiedList ArrayOfstring changedUsers is null for sponsorOrgID: " + sponsorOrgId);
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

								log.info("Retrieved " + changedUsers.length + " records");

								//Calculate the number of records to process based on the max records if set
								int numberOfRecordsToProcess = 0;
								if(maxRecords > 0 && changedUsers.length > maxRecords) {
									numberOfRecordsToProcess = maxRecords;
								} else {
									numberOfRecordsToProcess = changedUsers.length;
								}

								log.warn("Processing " + numberOfRecordsToProcess + " out of " + changedUsers.length + " records.");
								
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
								
								//Create Executor Service and initialize with number of threads
								ExecutorService e = Executors.newFixedThreadPool(availableProcessors);

								//List of Future tasks to process
								ArrayList<Future<Boolean>> futures = new ArrayList<Future<Boolean>>();

								//Loop over the number of records to process and call querySIP
								for(int i=0; i< numberOfRecordsToProcess; i++){
									CDMPersonAccount person = new CDMPersonAccount(changedUsers[i].getAgencyPersonGUID(), sponsorOrgId);
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
								log.warn(successfulRecordsCount + " records successfully proccessed out of " + changedUsers.length);	
							}
							log.info("------Completed Processing Sponsor Org ID: " + sponsorOrgId + "-------");
						}
						
						//Save the lastSuccessfulDate
						try {
							Application app = context.getObjectByName(Application.class, TreasuryCustomGlobalStringConst.HRCONNECT_APPLICATION_NAME);
							if (app != null) {
								String rangeEnd = config.getString("rangeEnd");
								
								if(!StringUtils.isBlank(rangeEnd)){
									log.warn("Setting lastSuccessful date to configured rangeEnd");
									app.setAttribute("lastSuccessfulDate", DateUtil.getValidDate(rangeEnd, DATE_FORMATS));
									context.saveObject(app);
								} else {
									log.warn("Setting lastSuccessful date to aggregation task completion date");
									app.setAttribute("lastSuccessfulDate", DateUtil.getValidDate(startTime, DATE_FORMATS));
									context.saveObject(app);
								}
								log.warn("LastSuccessfulDate set to: " + app.getAttributeValue("lastSuccessfulDate"));
							} else {
								log.warn("Couldn't retrieve HRConnect Application. Failed to save the lastSuccessfulDate");
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
		log.trace("Entering read() method.");
		Map<String, Object> objectMap = new HashMap<String, Object>();
		try {
			if (OBJECT_TYPE_ACCOUNT.equals(objectType)) {
				Identity user = context.getObject(Identity.class, paramString);
				if (user != null) {
					for (Attribute att : schema.getAttributes()) {
						objectMap.put(att.getName(), user.getAttribute(att.getName()));
						log.debug("att: " + att.getName());
						log.debug("user's attribute: " + user.getAttribute(att.getName()));
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
	public PersonInfoType[] getChangedUsers(String sponsorOrgId){
		log.trace("Entering method: getChangedUsers");
		PersonInfoType[] changedUsers = null;
		
		CDMQueryBPELRequest queryRequest = new CDMQueryBPELRequest();
		
		queryRequest.setNISTCode(sponsorOrgId);
		
		//Set the rangeStart and rangeEnd dates for the QueryModifiedList Call				
		String startDate = null;
		String endDate = DateUtil.getFormattedToday(DATE_FORMATS[0]);
				
		String rangeStart = config.getString("rangeStart");
		String rangeEnd = config.getString("rangeEnd");
				
		if(!StringUtils.isBlank(rangeStart) && !StringUtils.isBlank(rangeEnd)){
			log.warn("Ignoring Last successful run date and using the configured parameters rangeStart and rangeEnd");
			try {
				//validate that dates are in correct format by parsing
				startDate = DateUtil.getValidDate(rangeStart, DATE_FORMATS);
				endDate = DateUtil.getValidDate(rangeEnd, DATE_FORMATS);
			} catch (ParseException e) {
				log.error("Error parsing rangeStart/rangeEnd: ", e);
				throw new ConnectorException("Error parsing rangeStart/rangeEnd: " + e.getMessage());
			}
		} else {
			String lastSuccessfulDate = (String) config.getAttribute("lastSuccessfulDate");
			if(!StringUtils.isBlank(lastSuccessfulDate)){
				try {
					startDate = DateUtil.getValidDate(lastSuccessfulDate, DATE_FORMATS);
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

		if (startDate == null) {				
			log.error("No lastSuccessfulDate stored on the application and no range start date entered. Please set the initial run rangeStart attribute.");
			throw new ConnectorException("No lastSuccessfulDate stored on the application and no range start date entered. Please set the initial run rangeStart attribute.");
		} 
		
		log.info(String.format("QueryModifiedList:  Date range %s - %s", startDate, endDate));

		queryRequest.setStartDate(startDate);
		queryRequest.setEndDate(endDate);
				
		
		//Call CDMQueryBPELRequest - catch java.net.SocketTimeoutException
		try {

			/**
			 * Will retry until the max number of retries if the cause of the exception is a SocketTimeoutException
			 * list. After max retries is reached it will run one more time
			 */

			CDMQueryBPELResponse queryResp = null;
			int count = 0;
			int maxRetries = MAX_RETRIES + 1; // Add one for the initial run, then retry max retries after that
			int waitMillis = RETRY_WAIT_MILLIS;

			do {
				try {
					log.trace("Try number " + count + " for queryModifiedList");
					count++;
					queryResp = queryStub.process(queryRequest);
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
			} while(queryResp == null && count <= maxRetries);

			if (queryResp == null) {
				log.error("CDMQueryBPELResponse is null");
				throw new ConnectorException("CDMQueryBPELResponse is null.");
			} else {
				ErrorInfoType errorInfo = queryResp.getErrorInfo();
				if (errorInfo != null && errorInfo.getErrorText() != null) {
					if (errorInfo.getErrorText().equals(NO_RECORDS_ERROR)){
						log.warn(errorInfo.getErrorText() + ". InstanceId: " + errorInfo.getInstanceId());
					} else {
						log.error("Error occurred: " + errorInfo.getErrorText() + " with instance id: " + errorInfo.getInstanceId());
						throw new ConnectorException("Error occurred: " + errorInfo.getErrorText() + " with instance id: " + errorInfo.getInstanceId());	
					}
				}
				changedUsers = queryResp.getPersonInfo();
				if(changedUsers == null){
					log.warn("CDMQueryBPELResponse personInfo is null.");
				}
			}
		} catch(Exception e){
			log.error("An exception occurred while calling QueryModifiedList", e);
			throw new ConnectorException("An exception occurred while calling QueryModifiedList. " + e.getMessage());
		}
		return changedUsers;
	}
	
	
	class CDMPersonAccount implements Callable<Boolean>
	{
		//Agency Person GUID from HRConnect
	    private String guid;
	    private String nistCode;
	 
	    public CDMPersonAccount(String guid, String nistCode) {
	        this.guid = guid;
	        this.nistCode = nistCode;
	    }
	 
	    /*
	     * 
	     * @see java.util.concurrent.Callable#call()
	     * 
	     * Returns true for success and false for failure
	     */
	    @Override
	    public Boolean call() throws Exception {
	    	log.trace("Entering CDMPersonAccount call method");
	    	
	    	try {
	    		//Prepare CDMPersonRequest call
				CDMPersonSchemaRequest req = new CDMPersonSchemaRequest();
				req.setAgencyPersonGUID(guid);
				req.setSponsorOrganizationalIdentifier(nistCode);	
				
				//Call the QuerySIP Webservice Method
				CDMPersonSchemaResponse cdmPersonResp = personStub.process(req);
				if (cdmPersonResp == null) {
					log.warn("CDMPersonResp Response is null for user: " + guid);
				} else {
					//Add the account to the accounts map
					Map<String, Object> newAccount = getAccountFromCDMPersonSchemaResponse(cdmPersonResp, guid);
					if (newAccount != null) {
						accounts.put(guid, newAccount);
						log.trace("added " + guid + " to accounts map");
						return true;
					}
				}
		        return false;
	    	} catch(Exception e){
	    		log.error("Call CDMPersonSchemaRequest failed for user: " + guid + ". ", e);
	    		return false;
	    	}	    	
	    }	    
	    
	    /**
	     * Create an account from the CDMPersonSchemaResponse Object.
	     * @param querySIPResp
	     * @param personID
	     * @return
	     */
	    private Map<String, Object> getAccountFromCDMPersonSchemaResponse(CDMPersonSchemaResponse cdmPersonResp, String agencyGUID){
			//Create Account Object
	    	log.trace("Entering getAccountFromCDMPersonSchemaResponse. Guid is: " + agencyGUID);
	    	
	    	//if person has error info, return null
	    	ErrorInformationType errorInfo = cdmPersonResp.getErrorInfo();
			if (errorInfo != null && !StringUtils.equals(errorInfo.getProcessStatus(), SUCCESS)) {
				log.warn("ErrorInfo is not null. ProcessStatus is: " + errorInfo.getProcessStatus() + ", and ErrorDescription is: " + errorInfo.getErrorDescription());
				return null;
			}
	    	
			Map<String, Object> account = new HashMap<String, Object>();
			
			account.put("AgencyPersonGUID", agencyGUID);
			account.put("PersonID", cdmPersonResp.getPersonID());
			account.put("FullName", cdmPersonResp.getFullName());
			account.put("FirstName", cdmPersonResp.getFirstName());
			account.put("MiddleName", cdmPersonResp.getMiddleName());
			account.put("LastName", cdmPersonResp.getLastName());
			account.put("Suffix", cdmPersonResp.getSuffix());
			account.put("BusinessEmail", cdmPersonResp.getBusinessEmail());
			account.put("JobcodeTitle", cdmPersonResp.getJobcodeTitle());
			account.put("MURDepartment", cdmPersonResp.getMURDepartment());
			account.put("SponsorOrganizationalIdentifier", cdmPersonResp.getSponsorOrganizationalIdentifier());
			account.put("WorkLocationAddress1", cdmPersonResp.getWorkLocationAddress1());
			account.put("WorkLocationAddress2", cdmPersonResp.getWorkLocationAddress2());
			account.put("WorkLocationAddress3", cdmPersonResp.getWorkLocationAddress3());
			account.put("WorkLocationCity", cdmPersonResp.getWorkLocationCity());
			account.put("WorkLocationState", cdmPersonResp.getWorkLocationState());
			account.put("WorkLocationPostal", cdmPersonResp.getWorkLocationPostal());
			account.put("WorkLocationCountry", cdmPersonResp.getWorkLocationCountry());
			account.put("SupervisorTRUID", cdmPersonResp.getSupervisorTRUID());
			account.put("EmployeeStatus", cdmPersonResp.getAgencyPersonGUID());
			account.put("PersonType", cdmPersonResp.getAgencyPersonGUID());
			account.put("UPN", cdmPersonResp.getAgencyPersonGUID());
			account.put("CardSerialNumber", cdmPersonResp.getCardSerialNumber());
			account.put("CredentialOption", cdmPersonResp.getCredentialOption());
			account.put("ChuidStatus", cdmPersonResp.getChuidStatus());
			account.put("PIVCardType", cdmPersonResp.getPIVCardType());
			account.put("IssuanceLastUpdate", cdmPersonResp.getIssuanceLastUpdate());
			account.put("CardExpiryDate", cdmPersonResp.getCardExpiryDate());
			
			//Trust Information
			TrustInformationType trustInfoList = cdmPersonResp.getTrustInformation();
			if(trustInfoList != null){
				List<String> trustIds = new ArrayList<String>();
				List<String> trustNames = new ArrayList<String>();
				List<String> trustTypes = new ArrayList<String>();
				List<String> trustStatuses = new ArrayList<String>();
				List<String> trustCreationDates = new ArrayList<String>();
				for (TrustType trustObj : trustInfoList.getTrust()) {
					trustIds.add(trustObj.getTrustId());
					trustNames.add(trustObj.getTrustName());
					trustTypes.add(trustObj.getTrustType());
					trustStatuses.add(trustObj.getTrustStatus());
					trustCreationDates.add(trustObj.getTrustCreationDate());
				}
				account.put("TrustId", trustIds);
				account.put("TrustName", trustTypes);
				account.put("TrustType", trustNames);
				account.put("TrustStatus", trustStatuses);
				account.put("TrustCreationDate", trustCreationDates);
			} else {
				log.debug("TrustInformation is null for user: " + agencyGUID);
			}
			
			return account;
		}
	}
 
}
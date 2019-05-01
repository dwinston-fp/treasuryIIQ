package gov.treasury.cdm.constants;

public class TreasuryCustomGlobalStringConst {

	private TreasuryCustomGlobalStringConst() {}
	
	public static final String CUSTOM_GLOBAL_OBJECT_NAME = "TreasuryCustomGlobal";
	
	public static final String DEPARTMENT_DEFAULT_VALUE = "Treasury";

	public static final String INACTIVE_TRUE_VALUE = "true";
	public static final String INACTIVE_FALSE_VALUE = "false";
	
	/*Additional Treasury Attributes */
	public static final String IDENTITY_ATTRIBUTE_PERSONID = "personID";
	
	/*USAccess Application Attributes */
	public static final String USACCESS_APPLICATION_NAME = "USAccess";
	public static final String USACCESS_COMPONENT_ATTRIBUTE = "PersonIdentifier-SponsorOrganizationalIdentifier";
	public static final String USACCESS_USERSTATUS_ATTRIBUTE = "Sponsorship-EmployeeStatus";
	public static final String USACCESS_USERTYPE_ATTRIBUTE = "Sponsorship-PersonOrganizationAssociationCategory";
	public static final String USACCESS_ACTIVE = "A";
	public static final String USACCESS_SSN_ATTRIBUTE = "Personal-SSN";
	public static final String USACCESS_UPN_ATTRIBUTE = "Sponsorship-UPN";
	public static final String USACCESS_EMAIL_ATTRIBUTE = "Sponsorship-BusinessEmail";
	public static final String USACCESS_PERSON_ATTRIBUTE = "PersonIdentifier-PersonID";
	public static final String USACCESS_SPONSOR_ATTRIBUTE = "PersonIdentifier-SponsorOrganizationalIdentifier";
	
	/*HR Connect Application Attributes */
	public static final String HRCONNECT_APPLICATION_NAME = "HRConnect";
	public static final String HRCONNECT_COMPONENT_ATTRIBUTE = "SponsorOrganizationalIdentifier";
	public static final String HRCONNECT_USERSTATUS_ATTRIBUTE = "EmployeeStatus";
	public static final String HRCONNECT_USERTYPE_ATTRIBUTE = "PersonType";
	public static final String HRCONNECT_ACTIVE = "A";
	public static final String HRCONNECT_WORKADDR1_ATTRIBUTE = "WorkLocationAddress1";
	public static final String HRCONNECT_WORKADDR2_ATTRIBUTE = "WorkLocationAddress2";
	public static final String HRCONNECT_WORKADDR3_ATTRIBUTE = "WorkLocationAddress3";
	public static final String HRCONNECT_WORKCITY_ATTRIBUTE = "WorkLocationCity";
	public static final String HRCONNECT_WORKSTATE_ATTRIBUTE = "WorkLocationState";
	public static final String HRCONNECT_WORKPOSTAL_ATTRIBUTE = "WorkLocationPostal";
	public static final String HRCONNECT_WORKCOUNTRY_ATTRIBUTE = "WorkLocationCountry";

	
	/*Mapping keys located in TreasuryCustomGlobal */
	public static final String QUERY_LIST_MAPPINGS_KEY = "queryListMappings";
	public static final String COMPONENT_MAPPING_KEY = "componentMapping";
	public static final String USERSTATUS_USACCESS_MAPPING_KEY = "userStatusMapping-USAccess";
	public static final String USERSTATUS_HRCONNECT_MAPPING_KEY = "userStatusMapping-HRConnect";
	public static final String USERTYPE_USACCESS_MAPPING_KEY = "userTypeMapping-USAccess";
	public static final String USERTYPE_HRCONNECT_MAPPING_KEY = "userTypeMapping-HRConnect";
	public static final String CRED_STATUS_MAPPING_KEY = "credStatusMapping";
	public static final String CRED_TYPE_MAPPING_KEY = "credTypeMapping";
	public static final String CRED_DESC_MAPPING_KEY = "credDescMapping";
	public static final String TRUST_STATUS_MAPPING_KEY = "trustStatusMapping";

	public static final String TRUST_TYPE_INVESTIGATIVE_HRCONNECT = "Investigative";
	




}

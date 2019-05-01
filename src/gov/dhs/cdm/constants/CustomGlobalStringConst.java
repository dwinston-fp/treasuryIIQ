package gov.dhs.cdm.constants;

@SuppressWarnings("unused")
public abstract class CustomGlobalStringConst {
	
	/*
	 * Identity Attribute names
	 */
	// OOTB Attributes
	public static final String USER_NAME_IDENTITY_ATTR_NAME = "name";
	public static final String DETECTED_ROLES_IDENTITY_ATTR_NAME = "bundles";
	public static final String DETECTED_ROLES_SUMMARY_IDENTITY_ATTR_NAME = "bundleSummary";
	public static final String ASSIGNED_ROLES_IDENTITY_ATTR_NAME = "assignedRoles";
	public static final String ASSIGNED_ROLES_SUMMARY_IDENTITY_ATTR_NAME = "assignedRolesSummary";
	public static final String EXCEPTIONS_IDENTITY_ATTR_NAME = "exceptions";
	public static final String LAST_REFRESH_IDENTITY_ATTR_NAME = "lastRefresh";
	public static final String LAST_LOGIN_IDENTITY_ATTR_NAME = "lastLogin";
	public static final String CAPABILITIES_IDENTITY_ATTR_NAME = "capabilities";
	public static final String COMPOSITE_SCORE_IDENTITY_ATTR_NAME = "scorecard.compositeScore";
	public static final String MANAGER_IDENTITY_ATTR_NAME = "manager";
	public static final String EMAIL_IDENTITY_ATTR_NAME = "email";
	public static final String FIRST_NAME_IDENTITY_ATTR_NAME = "firstname";
	public static final String LAST_NAME_IDENTITY_ATTR_NAME = "lastname";
	public static final String INACTIVE_IDENTITY_ATTR_NAME = "inactive";
	public static final String DISPLAY_NAME_IDENTITY_ATTR_NAME = "displayName";
	public static final String MANAGER_STATUS_IDENTITY_ATTR_NAME = "managerStatus";
	public static final String RIGHTS_IDENTITY_ATTR_NAME = "rights";
	public static final String WORKGROUPS_IDENTITY_ATTR_NAME = "workgroups";
	// Custom Extended Attributes
	public static final String UNIQUE_IDENTIFIER_IDENTITY_ATTR_NAME = "uniqueIdentifier";
	public static final String JOB_TITLE_IDENTITY_ATTR_NAME = "jobTitle";
	public static final String DEPARTMENT_IDENTITY_ATTR_NAME = "department";
	public static final String COMPONENT_IDENTITY_ATTR_NAME = "component";
	public static final String CITY_IDENTITY_ATTR_NAME = "city";
	public static final String STATE_IDENTITY_ATTR_NAME = "state";
	public static final String USER_TYPE_IDENTITY_ATTR_NAME = "userType";
	public static final String USER_STATUS_IDENTITY_ATTR_NAME = "userStatus";
	public static final String MIDDLE_NAME_IDENTITY_ATTR_NAME = "middleName";
	public static final String GENERATION_QUALIFIER_IDENTITY_ATTR_NAME = "nameSuffix";
	public static final String PHYSICAL_OFFICE_LOCATION_IDENTITY_ATTR_NAME = "physicalOfficeLocation";
	public static final String SECURITY_DUTY_IDS_IDENTITY_ATTR_NAME = "securityDutyIds";
	public static final String USER_STATUS_INIT_DATE_IDENTITY_ATTR_NAME = "userStatusInitiationDate";
	public static final String PRIVILEGED_USER_IDENTITY_ATTR_NAME = "privilegedUser";
	public static final String USER_REVIEW_DATE_IDENTITY_ATTR_NAME = "userReviewDate";
	public static final String USER_REVIEW_GRACE_PERIOD_IDENTITY_ATTR_NAME = "userReviewGracePeriod";

	/*
	 * Link Attribute Names
	 */
	// Custom Extended Attributes
	public static final String PRIVILEGED_ACCOUNT_LINK_ATTR_NAME = "privilegedAccount";
	public static final String ACCOUNT_CONTROL_LINK_ATTR_NAME = "accountControl";
	public static final String NON_PRIVILEGED_ACCOUNT_LINK_ATTR_NAME = "nonPrivilegedAccount";
	public static final String SYSTEM_ACCOUNT_LINK_ATTR_NAME = "systemAccount";
	public static final String SHARED_ACCOUNT_LINK_ATTR_NAME = "sharedAccount";

	/*
	 * MUR Attribute Values
	 */
	// User Status
	public static final String USER_STATUS_VALUE_SEPARATED = "SEPARATED";
	public static final String USER_STATUS_VALUE_ACTIVE = "ACTIVE";
	public static final String USER_STATUS_VALUE_SERVICE = "SERVICE";
	public static final String USER_STATUS_VALUE_INACTIVE = "INACTIVE";
	public static final String USER_STATUS_VALUE_PENDING = "PENDING";
	// User Type
	public static final String USER_TYPE_VALUE_GOV = "GOV";
	public static final String USER_TYPE_VALUE_CONTRACTOR = "CONTRACTOR";
	public static final String USER_TYPE_VALUE_NONPERSON = "NONPERSON";
	public static final String USER_TYPE_VALUE_OGA = "OGA"; // Other Government Agencies
	// Trust Level Status
	public static final String TRUST_LEVEL_STATUS_VALUE_PENDING = "PENDING";
	public static final String TRUST_LEVEL_STATUS_VALUE_AUTHORIZED = "AUTHORIZED";
	public static final String TRUST_LEVEL_STATUS_VALUE_SUSPENDED = "SUSPENDED";
	public static final String TRUST_LEVEL_STATUS_VALUE_EXPIRED = "EXPIRED";
	public static final String TRUST_LEVEL_STATUS_VALUE_REVOKED = "REVOKED";
	// Trust Level Type
	public static final String TRUST_LEVEL_TYPE_VALUE_INVESTIGATIVE = "INVESTIGATIVE";
	public static final String TRUST_LEVEL_TYPE_VALUE_SUITABILITY = "SUITABILITY";
	public static final String TRUST_LEVEL_TYPE_VALUE_ROB = "ROB"; // Rules of Behavior Agreement
	public static final String TRUST_LEVEL_TYPE_VALUE_NDA = "NDA"; // Non-Disclosure Agreement
	public static final String TRUST_LEVEL_TYPE_VALUE_FDA = "FDA"; // Financial Disclosure Agreement
	public static final String TRUST_LEVEL_TYPE_VALUE_OTHER = "AGENCYOTHER";
	// Credential Status
	public static final String CRED_STATUS_VALUE_PENDING = "PENDING";
	public static final String CRED_STATUS_VALUE_ISSUED = "ISSUED";
	public static final String CRED_STATUS_VALUE_SUSPENDED = "SUSPENDED";
	public static final String CRED_STATUS_VALUE_EXPIRED = "EXPIRED";
	public static final String CRED_STATUS_VALUE_REVOKED = "REVOKED";
	// Credential Type
	public static final String CRED_TYPE_VALUE_USERIDPASSWORD = "USERIDPASSWORD";
	public static final String CRED_TYPE_VALUE_PIV = "PIVCARD";
	public static final String CRED_TYPE_VALUE_BIOMETRIC = "BIOMETRIC";
	public static final String CRED_TYPE_VALUE_CAC = "CACCARD";
	public static final String CRED_TYPE_VALUE_LOA = "LOA4CREDENTIAL";
	public static final String CRED_TYPE_VALUE_OTHER = "AGENCYOTHER";
	// Training Status
	public static final String BEHAVE_STATUS_VALUE_COMPLETED = "COMPLETED";
	public static final String BEHAVE_STATUS_VALUE_PENDING = "PENDING";
	public static final String BEHAVE_STATUS_VALUE_INCOMPLETE = "INCOMPLETE";
	public static final String BEHAVE_STATUS_VALUE_EXPIRED = "EXPIRED";
	// Training Type
	public static final String BEHAVE_TYPE_VALUE_CSAT = "CSAT";
	public static final String BEHAVE_TYPE_VALUE_PHISHING = "PHISHING";
	public static final String BEHAVE_TYPE_VALUE_TRAINING = "ROLETRAINING";
	public static final String BEHAVE_TYPE_VALUE_KNOWLEDGE = "KNOWLEDGE";
	public static final String BEHAVE_TYPE_VALUE_CERTIFICATION = "CERTIFICATION";
	public static final String BEHAVE_TYPE_VALUE_OTHER = "AGENCYOTHER";
	// Account Type
	public static final String ACCOUNT_TYPE_VALUE_PRIVNETWORK = "PRIVILEGED NETWORK";
	public static final String ACCOUNT_TYPE_VALUE_PRIVLOCAL = "PRIVILEGEDLOCAL";
	public static final String ACCOUNT_TYPE_VALUE_UNPRIVNETWORK = "UNPRIVILEGED NETWORK";
	public static final String ACCOUNT_TYPE_VALUE_UNPRIVLOCAL = "UNPRIVILEGEDLOCAL";
	// Account Status
	public static final String ACCOUNT_STATUS_VALUE_ENABLED = "ENABLED";
	public static final String ACCOUNT_STATUS_VALUE_DISABLED = "DISABLED";
	public static final String ACCOUNT_STATUS_VALUE_EXPIRED = "EXPIRED";
	public static final String ACCOUNT_STATUS_VALUE_LOCKED = "LOCKED";
	// Unprivileged status
	public static final String UNPRIVILEGED_TRUE_VALUE = "true";
	public static final String UNPRIVILEGED_DEFAULT_VALUE = null;
	// Privileged status
	public static final String PRIVILEGED_DEFAULT_VALUE = null;
	public static final String PRIVILEGED_TRUE_VALUE = "true";
	
	/*
	 * Link Attribute Values
	 */
	public static final String PRIVILEGED_ACCOUNT_DEFAULT_VALUE = null;
	public static final String PRIVILEGED_ACCOUNT_LINK_ATTRIBUTE_NAME = "privilegedAccount";
	public static final String SYSTEM_ACCOUNT_DEFAULT_VALUE = null;
	public static final String SHARED_ACCOUNT_DEFAULT_VALUE = null;
	public static final String NETWORK_ACCOUNT_DEFAULT_VALUE = null;
	public static final String NETWORK_ACCOUNT_TRUE_VALUE = "true";
    public static final String ACCOUNT_CONTROL_SOURCE_ATTRIBUTE_NAME = "userAccountControl";
	public static final String ACCOUNT_CONTROL_VALUE_SMARTCARD_ENABLED = "Smart Card Enabled";
	public static final String ACCOUNT_CONTROL_VALUE_PASSWORD_ENABLED = "Password Enabled";
}
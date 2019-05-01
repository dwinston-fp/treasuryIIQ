
/**
 * CDMPersonSchemaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */

            
                package cdmpersonschema.transform.pds;
            

            /**
            *  CDMPersonSchemaResponse bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class CDMPersonSchemaResponse
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "hrc:pds:transform:CDMpersonschema",
                "CDMPersonSchemaResponse",
                "ns1");

            

                        /**
                        * field for SponsorOrganizationalIdentifier
                        */

                        
                                    protected java.lang.String localSponsorOrganizationalIdentifier ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSponsorOrganizationalIdentifierTracker = false ;

                           public boolean isSponsorOrganizationalIdentifierSpecified(){
                               return localSponsorOrganizationalIdentifierTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSponsorOrganizationalIdentifier(){
                               return localSponsorOrganizationalIdentifier;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SponsorOrganizationalIdentifier
                               */
                               public void setSponsorOrganizationalIdentifier(java.lang.String param){
                            localSponsorOrganizationalIdentifierTracker = param != null;
                                   
                                            this.localSponsorOrganizationalIdentifier=param;
                                    

                               }
                            

                        /**
                        * field for AgencyPersonGUID
                        */

                        
                                    protected java.lang.String localAgencyPersonGUID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAgencyPersonGUIDTracker = false ;

                           public boolean isAgencyPersonGUIDSpecified(){
                               return localAgencyPersonGUIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAgencyPersonGUID(){
                               return localAgencyPersonGUID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AgencyPersonGUID
                               */
                               public void setAgencyPersonGUID(java.lang.String param){
                            localAgencyPersonGUIDTracker = param != null;
                                   
                                            this.localAgencyPersonGUID=param;
                                    

                               }
                            

                        /**
                        * field for PersonID
                        */

                        
                                    protected java.lang.String localPersonID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPersonIDTracker = false ;

                           public boolean isPersonIDSpecified(){
                               return localPersonIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPersonID(){
                               return localPersonID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PersonID
                               */
                               public void setPersonID(java.lang.String param){
                            localPersonIDTracker = param != null;
                                   
                                            this.localPersonID=param;
                                    

                               }
                            

                        /**
                        * field for FullName
                        */

                        
                                    protected java.lang.String localFullName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFullNameTracker = false ;

                           public boolean isFullNameSpecified(){
                               return localFullNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFullName(){
                               return localFullName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FullName
                               */
                               public void setFullName(java.lang.String param){
                            localFullNameTracker = param != null;
                                   
                                            this.localFullName=param;
                                    

                               }
                            

                        /**
                        * field for FirstName
                        */

                        
                                    protected java.lang.String localFirstName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFirstNameTracker = false ;

                           public boolean isFirstNameSpecified(){
                               return localFirstNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFirstName(){
                               return localFirstName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FirstName
                               */
                               public void setFirstName(java.lang.String param){
                            localFirstNameTracker = param != null;
                                   
                                            this.localFirstName=param;
                                    

                               }
                            

                        /**
                        * field for MiddleName
                        */

                        
                                    protected java.lang.String localMiddleName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMiddleNameTracker = false ;

                           public boolean isMiddleNameSpecified(){
                               return localMiddleNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMiddleName(){
                               return localMiddleName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MiddleName
                               */
                               public void setMiddleName(java.lang.String param){
                            localMiddleNameTracker = param != null;
                                   
                                            this.localMiddleName=param;
                                    

                               }
                            

                        /**
                        * field for LastName
                        */

                        
                                    protected java.lang.String localLastName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastNameTracker = false ;

                           public boolean isLastNameSpecified(){
                               return localLastNameTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLastName(){
                               return localLastName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastName
                               */
                               public void setLastName(java.lang.String param){
                            localLastNameTracker = param != null;
                                   
                                            this.localLastName=param;
                                    

                               }
                            

                        /**
                        * field for Suffix
                        */

                        
                                    protected java.lang.String localSuffix ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSuffixTracker = false ;

                           public boolean isSuffixSpecified(){
                               return localSuffixTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSuffix(){
                               return localSuffix;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Suffix
                               */
                               public void setSuffix(java.lang.String param){
                            localSuffixTracker = param != null;
                                   
                                            this.localSuffix=param;
                                    

                               }
                            

                        /**
                        * field for BusinessEmail
                        */

                        
                                    protected java.lang.String localBusinessEmail ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBusinessEmailTracker = false ;

                           public boolean isBusinessEmailSpecified(){
                               return localBusinessEmailTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBusinessEmail(){
                               return localBusinessEmail;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BusinessEmail
                               */
                               public void setBusinessEmail(java.lang.String param){
                            localBusinessEmailTracker = param != null;
                                   
                                            this.localBusinessEmail=param;
                                    

                               }
                            

                        /**
                        * field for JobcodeTitle
                        */

                        
                                    protected java.lang.String localJobcodeTitle ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localJobcodeTitleTracker = false ;

                           public boolean isJobcodeTitleSpecified(){
                               return localJobcodeTitleTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getJobcodeTitle(){
                               return localJobcodeTitle;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param JobcodeTitle
                               */
                               public void setJobcodeTitle(java.lang.String param){
                            localJobcodeTitleTracker = param != null;
                                   
                                            this.localJobcodeTitle=param;
                                    

                               }
                            

                        /**
                        * field for MURDepartment
                        */

                        
                                    protected java.lang.String localMURDepartment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMURDepartmentTracker = false ;

                           public boolean isMURDepartmentSpecified(){
                               return localMURDepartmentTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMURDepartment(){
                               return localMURDepartment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MURDepartment
                               */
                               public void setMURDepartment(java.lang.String param){
                            localMURDepartmentTracker = param != null;
                                   
                                            this.localMURDepartment=param;
                                    

                               }
                            

                        /**
                        * field for WorkLocationAddress1
                        */

                        
                                    protected java.lang.String localWorkLocationAddress1 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWorkLocationAddress1Tracker = false ;

                           public boolean isWorkLocationAddress1Specified(){
                               return localWorkLocationAddress1Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getWorkLocationAddress1(){
                               return localWorkLocationAddress1;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WorkLocationAddress1
                               */
                               public void setWorkLocationAddress1(java.lang.String param){
                            localWorkLocationAddress1Tracker = param != null;
                                   
                                            this.localWorkLocationAddress1=param;
                                    

                               }
                            

                        /**
                        * field for WorkLocationAddress2
                        */

                        
                                    protected java.lang.String localWorkLocationAddress2 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWorkLocationAddress2Tracker = false ;

                           public boolean isWorkLocationAddress2Specified(){
                               return localWorkLocationAddress2Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getWorkLocationAddress2(){
                               return localWorkLocationAddress2;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WorkLocationAddress2
                               */
                               public void setWorkLocationAddress2(java.lang.String param){
                            localWorkLocationAddress2Tracker = param != null;
                                   
                                            this.localWorkLocationAddress2=param;
                                    

                               }
                            

                        /**
                        * field for WorkLocationAddress3
                        */

                        
                                    protected java.lang.String localWorkLocationAddress3 ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWorkLocationAddress3Tracker = false ;

                           public boolean isWorkLocationAddress3Specified(){
                               return localWorkLocationAddress3Tracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getWorkLocationAddress3(){
                               return localWorkLocationAddress3;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WorkLocationAddress3
                               */
                               public void setWorkLocationAddress3(java.lang.String param){
                            localWorkLocationAddress3Tracker = param != null;
                                   
                                            this.localWorkLocationAddress3=param;
                                    

                               }
                            

                        /**
                        * field for WorkLocationCity
                        */

                        
                                    protected java.lang.String localWorkLocationCity ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWorkLocationCityTracker = false ;

                           public boolean isWorkLocationCitySpecified(){
                               return localWorkLocationCityTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getWorkLocationCity(){
                               return localWorkLocationCity;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WorkLocationCity
                               */
                               public void setWorkLocationCity(java.lang.String param){
                            localWorkLocationCityTracker = param != null;
                                   
                                            this.localWorkLocationCity=param;
                                    

                               }
                            

                        /**
                        * field for WorkLocationState
                        */

                        
                                    protected java.lang.String localWorkLocationState ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWorkLocationStateTracker = false ;

                           public boolean isWorkLocationStateSpecified(){
                               return localWorkLocationStateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getWorkLocationState(){
                               return localWorkLocationState;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WorkLocationState
                               */
                               public void setWorkLocationState(java.lang.String param){
                            localWorkLocationStateTracker = param != null;
                                   
                                            this.localWorkLocationState=param;
                                    

                               }
                            

                        /**
                        * field for WorkLocationPostal
                        */

                        
                                    protected java.lang.String localWorkLocationPostal ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWorkLocationPostalTracker = false ;

                           public boolean isWorkLocationPostalSpecified(){
                               return localWorkLocationPostalTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getWorkLocationPostal(){
                               return localWorkLocationPostal;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WorkLocationPostal
                               */
                               public void setWorkLocationPostal(java.lang.String param){
                            localWorkLocationPostalTracker = param != null;
                                   
                                            this.localWorkLocationPostal=param;
                                    

                               }
                            

                        /**
                        * field for WorkLocationCountry
                        */

                        
                                    protected java.lang.String localWorkLocationCountry ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWorkLocationCountryTracker = false ;

                           public boolean isWorkLocationCountrySpecified(){
                               return localWorkLocationCountryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getWorkLocationCountry(){
                               return localWorkLocationCountry;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param WorkLocationCountry
                               */
                               public void setWorkLocationCountry(java.lang.String param){
                            localWorkLocationCountryTracker = param != null;
                                   
                                            this.localWorkLocationCountry=param;
                                    

                               }
                            

                        /**
                        * field for SupervisorTRUID
                        */

                        
                                    protected java.lang.String localSupervisorTRUID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSupervisorTRUIDTracker = false ;

                           public boolean isSupervisorTRUIDSpecified(){
                               return localSupervisorTRUIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSupervisorTRUID(){
                               return localSupervisorTRUID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SupervisorTRUID
                               */
                               public void setSupervisorTRUID(java.lang.String param){
                            localSupervisorTRUIDTracker = param != null;
                                   
                                            this.localSupervisorTRUID=param;
                                    

                               }
                            

                        /**
                        * field for EmployeeStatus
                        */

                        
                                    protected java.lang.String localEmployeeStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEmployeeStatusTracker = false ;

                           public boolean isEmployeeStatusSpecified(){
                               return localEmployeeStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEmployeeStatus(){
                               return localEmployeeStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EmployeeStatus
                               */
                               public void setEmployeeStatus(java.lang.String param){
                            localEmployeeStatusTracker = param != null;
                                   
                                            this.localEmployeeStatus=param;
                                    

                               }
                            

                        /**
                        * field for PersonType
                        */

                        
                                    protected java.lang.String localPersonType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPersonTypeTracker = false ;

                           public boolean isPersonTypeSpecified(){
                               return localPersonTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPersonType(){
                               return localPersonType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PersonType
                               */
                               public void setPersonType(java.lang.String param){
                            localPersonTypeTracker = param != null;
                                   
                                            this.localPersonType=param;
                                    

                               }
                            

                        /**
                        * field for TrustInformation
                        */

                        
                                    protected cdmpersonschema.transform.pds.TrustInformationType localTrustInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTrustInformationTracker = false ;

                           public boolean isTrustInformationSpecified(){
                               return localTrustInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return cdmpersonschema.transform.pds.TrustInformationType
                           */
                           public  cdmpersonschema.transform.pds.TrustInformationType getTrustInformation(){
                               return localTrustInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TrustInformation
                               */
                               public void setTrustInformation(cdmpersonschema.transform.pds.TrustInformationType param){
                            localTrustInformationTracker = param != null;
                                   
                                            this.localTrustInformation=param;
                                    

                               }
                            

                        /**
                        * field for CardSerialNumber
                        */

                        
                                    protected java.lang.String localCardSerialNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCardSerialNumberTracker = false ;

                           public boolean isCardSerialNumberSpecified(){
                               return localCardSerialNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCardSerialNumber(){
                               return localCardSerialNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CardSerialNumber
                               */
                               public void setCardSerialNumber(java.lang.String param){
                            localCardSerialNumberTracker = param != null;
                                   
                                            this.localCardSerialNumber=param;
                                    

                               }
                            

                        /**
                        * field for CredentialOption
                        */

                        
                                    protected java.lang.String localCredentialOption ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCredentialOptionTracker = false ;

                           public boolean isCredentialOptionSpecified(){
                               return localCredentialOptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCredentialOption(){
                               return localCredentialOption;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CredentialOption
                               */
                               public void setCredentialOption(java.lang.String param){
                            localCredentialOptionTracker = param != null;
                                   
                                            this.localCredentialOption=param;
                                    

                               }
                            

                        /**
                        * field for ChuidStatus
                        */

                        
                                    protected java.lang.String localChuidStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChuidStatusTracker = false ;

                           public boolean isChuidStatusSpecified(){
                               return localChuidStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getChuidStatus(){
                               return localChuidStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChuidStatus
                               */
                               public void setChuidStatus(java.lang.String param){
                            localChuidStatusTracker = param != null;
                                   
                                            this.localChuidStatus=param;
                                    

                               }
                            

                        /**
                        * field for PIVCardType
                        */

                        
                                    protected java.lang.String localPIVCardType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPIVCardTypeTracker = false ;

                           public boolean isPIVCardTypeSpecified(){
                               return localPIVCardTypeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPIVCardType(){
                               return localPIVCardType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PIVCardType
                               */
                               public void setPIVCardType(java.lang.String param){
                            localPIVCardTypeTracker = param != null;
                                   
                                            this.localPIVCardType=param;
                                    

                               }
                            

                        /**
                        * field for IssuanceLastUpdate
                        */

                        
                                    protected java.lang.String localIssuanceLastUpdate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIssuanceLastUpdateTracker = false ;

                           public boolean isIssuanceLastUpdateSpecified(){
                               return localIssuanceLastUpdateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getIssuanceLastUpdate(){
                               return localIssuanceLastUpdate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IssuanceLastUpdate
                               */
                               public void setIssuanceLastUpdate(java.lang.String param){
                            localIssuanceLastUpdateTracker = param != null;
                                   
                                            this.localIssuanceLastUpdate=param;
                                    

                               }
                            

                        /**
                        * field for CardExpiryDate
                        */

                        
                                    protected java.lang.String localCardExpiryDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCardExpiryDateTracker = false ;

                           public boolean isCardExpiryDateSpecified(){
                               return localCardExpiryDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCardExpiryDate(){
                               return localCardExpiryDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CardExpiryDate
                               */
                               public void setCardExpiryDate(java.lang.String param){
                            localCardExpiryDateTracker = param != null;
                                   
                                            this.localCardExpiryDate=param;
                                    

                               }
                            

                        /**
                        * field for ErrorInfo
                        */

                        
                                    protected cdmpersonschema.transform.pds.ErrorInformationType localErrorInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorInfoTracker = false ;

                           public boolean isErrorInfoSpecified(){
                               return localErrorInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return cdmpersonschema.transform.pds.ErrorInformationType
                           */
                           public  cdmpersonschema.transform.pds.ErrorInformationType getErrorInfo(){
                               return localErrorInfo;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorInfo
                               */
                               public void setErrorInfo(cdmpersonschema.transform.pds.ErrorInformationType param){
                            localErrorInfoTracker = param != null;
                                   
                                            this.localErrorInfo=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"hrc:pds:transform:CDMpersonschema");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":CDMPersonSchemaResponse",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "CDMPersonSchemaResponse",
                           xmlWriter);
                   }

               
                   }
                if (localSponsorOrganizationalIdentifierTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "SponsorOrganizationalIdentifier", xmlWriter);
                             

                                          if (localSponsorOrganizationalIdentifier==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SponsorOrganizationalIdentifier cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSponsorOrganizationalIdentifier);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAgencyPersonGUIDTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "AgencyPersonGUID", xmlWriter);
                             

                                          if (localAgencyPersonGUID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("AgencyPersonGUID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAgencyPersonGUID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPersonIDTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "PersonID", xmlWriter);
                             

                                          if (localPersonID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PersonID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPersonID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFullNameTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "FullName", xmlWriter);
                             

                                          if (localFullName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("FullName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFullName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFirstNameTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "FirstName", xmlWriter);
                             

                                          if (localFirstName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("FirstName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFirstName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMiddleNameTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "MiddleName", xmlWriter);
                             

                                          if (localMiddleName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("MiddleName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMiddleName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLastNameTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "LastName", xmlWriter);
                             

                                          if (localLastName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("LastName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLastName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSuffixTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "Suffix", xmlWriter);
                             

                                          if (localSuffix==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Suffix cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSuffix);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBusinessEmailTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "BusinessEmail", xmlWriter);
                             

                                          if (localBusinessEmail==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("BusinessEmail cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBusinessEmail);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localJobcodeTitleTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "JobcodeTitle", xmlWriter);
                             

                                          if (localJobcodeTitle==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("JobcodeTitle cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localJobcodeTitle);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMURDepartmentTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "MURDepartment", xmlWriter);
                             

                                          if (localMURDepartment==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("MURDepartment cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMURDepartment);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWorkLocationAddress1Tracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "WorkLocationAddress1", xmlWriter);
                             

                                          if (localWorkLocationAddress1==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("WorkLocationAddress1 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localWorkLocationAddress1);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWorkLocationAddress2Tracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "WorkLocationAddress2", xmlWriter);
                             

                                          if (localWorkLocationAddress2==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("WorkLocationAddress2 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localWorkLocationAddress2);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWorkLocationAddress3Tracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "WorkLocationAddress3", xmlWriter);
                             

                                          if (localWorkLocationAddress3==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("WorkLocationAddress3 cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localWorkLocationAddress3);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWorkLocationCityTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "WorkLocationCity", xmlWriter);
                             

                                          if (localWorkLocationCity==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("WorkLocationCity cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localWorkLocationCity);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWorkLocationStateTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "WorkLocationState", xmlWriter);
                             

                                          if (localWorkLocationState==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("WorkLocationState cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localWorkLocationState);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWorkLocationPostalTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "WorkLocationPostal", xmlWriter);
                             

                                          if (localWorkLocationPostal==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("WorkLocationPostal cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localWorkLocationPostal);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localWorkLocationCountryTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "WorkLocationCountry", xmlWriter);
                             

                                          if (localWorkLocationCountry==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("WorkLocationCountry cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localWorkLocationCountry);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSupervisorTRUIDTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "SupervisorTRUID", xmlWriter);
                             

                                          if (localSupervisorTRUID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SupervisorTRUID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSupervisorTRUID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEmployeeStatusTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "EmployeeStatus", xmlWriter);
                             

                                          if (localEmployeeStatus==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("EmployeeStatus cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEmployeeStatus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPersonTypeTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "PersonType", xmlWriter);
                             

                                          if (localPersonType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PersonType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPersonType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTrustInformationTracker){
                                            if (localTrustInformation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("TrustInformation cannot be null!!");
                                            }
                                           localTrustInformation.serialize(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","TrustInformation"),
                                               xmlWriter);
                                        } if (localCardSerialNumberTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "CardSerialNumber", xmlWriter);
                             

                                          if (localCardSerialNumber==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CardSerialNumber cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCardSerialNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCredentialOptionTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "CredentialOption", xmlWriter);
                             

                                          if (localCredentialOption==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CredentialOption cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCredentialOption);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localChuidStatusTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "ChuidStatus", xmlWriter);
                             

                                          if (localChuidStatus==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ChuidStatus cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localChuidStatus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPIVCardTypeTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "PIVCardType", xmlWriter);
                             

                                          if (localPIVCardType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("PIVCardType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPIVCardType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIssuanceLastUpdateTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "IssuanceLastUpdate", xmlWriter);
                             

                                          if (localIssuanceLastUpdate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("IssuanceLastUpdate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIssuanceLastUpdate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCardExpiryDateTracker){
                                    namespace = "hrc:pds:transform:CDMpersonschema";
                                    writeStartElement(null, namespace, "CardExpiryDate", xmlWriter);
                             

                                          if (localCardExpiryDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CardExpiryDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCardExpiryDate);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localErrorInfoTracker){
                                            if (localErrorInfo==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ErrorInfo cannot be null!!");
                                            }
                                           localErrorInfo.serialize(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","ErrorInfo"),
                                               xmlWriter);
                                        }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("hrc:pds:transform:CDMpersonschema")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localSponsorOrganizationalIdentifierTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "SponsorOrganizationalIdentifier"));
                                 
                                        if (localSponsorOrganizationalIdentifier != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSponsorOrganizationalIdentifier));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SponsorOrganizationalIdentifier cannot be null!!");
                                        }
                                    } if (localAgencyPersonGUIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "AgencyPersonGUID"));
                                 
                                        if (localAgencyPersonGUID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAgencyPersonGUID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("AgencyPersonGUID cannot be null!!");
                                        }
                                    } if (localPersonIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "PersonID"));
                                 
                                        if (localPersonID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPersonID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PersonID cannot be null!!");
                                        }
                                    } if (localFullNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "FullName"));
                                 
                                        if (localFullName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFullName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("FullName cannot be null!!");
                                        }
                                    } if (localFirstNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "FirstName"));
                                 
                                        if (localFirstName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFirstName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("FirstName cannot be null!!");
                                        }
                                    } if (localMiddleNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "MiddleName"));
                                 
                                        if (localMiddleName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMiddleName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("MiddleName cannot be null!!");
                                        }
                                    } if (localLastNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "LastName"));
                                 
                                        if (localLastName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("LastName cannot be null!!");
                                        }
                                    } if (localSuffixTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "Suffix"));
                                 
                                        if (localSuffix != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuffix));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Suffix cannot be null!!");
                                        }
                                    } if (localBusinessEmailTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "BusinessEmail"));
                                 
                                        if (localBusinessEmail != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBusinessEmail));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("BusinessEmail cannot be null!!");
                                        }
                                    } if (localJobcodeTitleTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "JobcodeTitle"));
                                 
                                        if (localJobcodeTitle != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localJobcodeTitle));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("JobcodeTitle cannot be null!!");
                                        }
                                    } if (localMURDepartmentTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "MURDepartment"));
                                 
                                        if (localMURDepartment != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMURDepartment));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("MURDepartment cannot be null!!");
                                        }
                                    } if (localWorkLocationAddress1Tracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "WorkLocationAddress1"));
                                 
                                        if (localWorkLocationAddress1 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWorkLocationAddress1));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("WorkLocationAddress1 cannot be null!!");
                                        }
                                    } if (localWorkLocationAddress2Tracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "WorkLocationAddress2"));
                                 
                                        if (localWorkLocationAddress2 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWorkLocationAddress2));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("WorkLocationAddress2 cannot be null!!");
                                        }
                                    } if (localWorkLocationAddress3Tracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "WorkLocationAddress3"));
                                 
                                        if (localWorkLocationAddress3 != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWorkLocationAddress3));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("WorkLocationAddress3 cannot be null!!");
                                        }
                                    } if (localWorkLocationCityTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "WorkLocationCity"));
                                 
                                        if (localWorkLocationCity != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWorkLocationCity));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("WorkLocationCity cannot be null!!");
                                        }
                                    } if (localWorkLocationStateTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "WorkLocationState"));
                                 
                                        if (localWorkLocationState != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWorkLocationState));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("WorkLocationState cannot be null!!");
                                        }
                                    } if (localWorkLocationPostalTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "WorkLocationPostal"));
                                 
                                        if (localWorkLocationPostal != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWorkLocationPostal));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("WorkLocationPostal cannot be null!!");
                                        }
                                    } if (localWorkLocationCountryTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "WorkLocationCountry"));
                                 
                                        if (localWorkLocationCountry != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWorkLocationCountry));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("WorkLocationCountry cannot be null!!");
                                        }
                                    } if (localSupervisorTRUIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "SupervisorTRUID"));
                                 
                                        if (localSupervisorTRUID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSupervisorTRUID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SupervisorTRUID cannot be null!!");
                                        }
                                    } if (localEmployeeStatusTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "EmployeeStatus"));
                                 
                                        if (localEmployeeStatus != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmployeeStatus));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("EmployeeStatus cannot be null!!");
                                        }
                                    } if (localPersonTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "PersonType"));
                                 
                                        if (localPersonType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPersonType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PersonType cannot be null!!");
                                        }
                                    } if (localTrustInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "TrustInformation"));
                            
                            
                                    if (localTrustInformation==null){
                                         throw new org.apache.axis2.databinding.ADBException("TrustInformation cannot be null!!");
                                    }
                                    elementList.add(localTrustInformation);
                                } if (localCardSerialNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "CardSerialNumber"));
                                 
                                        if (localCardSerialNumber != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardSerialNumber));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CardSerialNumber cannot be null!!");
                                        }
                                    } if (localCredentialOptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "CredentialOption"));
                                 
                                        if (localCredentialOption != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCredentialOption));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CredentialOption cannot be null!!");
                                        }
                                    } if (localChuidStatusTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "ChuidStatus"));
                                 
                                        if (localChuidStatus != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChuidStatus));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ChuidStatus cannot be null!!");
                                        }
                                    } if (localPIVCardTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "PIVCardType"));
                                 
                                        if (localPIVCardType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPIVCardType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("PIVCardType cannot be null!!");
                                        }
                                    } if (localIssuanceLastUpdateTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "IssuanceLastUpdate"));
                                 
                                        if (localIssuanceLastUpdate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIssuanceLastUpdate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("IssuanceLastUpdate cannot be null!!");
                                        }
                                    } if (localCardExpiryDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "CardExpiryDate"));
                                 
                                        if (localCardExpiryDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardExpiryDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CardExpiryDate cannot be null!!");
                                        }
                                    } if (localErrorInfoTracker){
                            elementList.add(new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema",
                                                                      "ErrorInfo"));
                            
                            
                                    if (localErrorInfo==null){
                                         throw new org.apache.axis2.databinding.ADBException("ErrorInfo cannot be null!!");
                                    }
                                    elementList.add(localErrorInfo);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static CDMPersonSchemaResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CDMPersonSchemaResponse object =
                new CDMPersonSchemaResponse();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"CDMPersonSchemaResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CDMPersonSchemaResponse)cdmpersonschema.transform.pds.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","SponsorOrganizationalIdentifier").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSponsorOrganizationalIdentifier(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","AgencyPersonGUID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAgencyPersonGUID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","PersonID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPersonID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","FullName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFullName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","FirstName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFirstName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","MiddleName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMiddleName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","LastName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","Suffix").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSuffix(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","BusinessEmail").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBusinessEmail(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","JobcodeTitle").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setJobcodeTitle(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","MURDepartment").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMURDepartment(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","WorkLocationAddress1").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWorkLocationAddress1(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","WorkLocationAddress2").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWorkLocationAddress2(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","WorkLocationAddress3").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWorkLocationAddress3(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","WorkLocationCity").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWorkLocationCity(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","WorkLocationState").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWorkLocationState(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","WorkLocationPostal").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWorkLocationPostal(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","WorkLocationCountry").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWorkLocationCountry(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","SupervisorTRUID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSupervisorTRUID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","EmployeeStatus").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEmployeeStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","PersonType").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPersonType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","TrustInformation").equals(reader.getName())){
                                
                                                object.setTrustInformation(cdmpersonschema.transform.pds.TrustInformationType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","CardSerialNumber").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCardSerialNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","CredentialOption").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCredentialOption(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","ChuidStatus").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setChuidStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","PIVCardType").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPIVCardType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","IssuanceLastUpdate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIssuanceLastUpdate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","CardExpiryDate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCardExpiryDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("hrc:pds:transform:CDMpersonschema","ErrorInfo").equals(reader.getName())){
                                
                                                object.setErrorInfo(cdmpersonschema.transform.pds.ErrorInformationType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
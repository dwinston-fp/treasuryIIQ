
/**
 * SponsorshipInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */

            
                package gov.gsa.hspd12.federated.enrollment;
            

            /**
            *  SponsorshipInformation bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class SponsorshipInformation
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = SponsorshipInformation
                Namespace URI = http://hspd12.gsa.gov/federated/enrollment
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for PersonOrganizationAssociationCategory
                        */

                        
                                    protected java.lang.String localPersonOrganizationAssociationCategory ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPersonOrganizationAssociationCategoryTracker = false ;

                           public boolean isPersonOrganizationAssociationCategorySpecified(){
                               return localPersonOrganizationAssociationCategoryTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPersonOrganizationAssociationCategory(){
                               return localPersonOrganizationAssociationCategory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PersonOrganizationAssociationCategory
                               */
                               public void setPersonOrganizationAssociationCategory(java.lang.String param){
                            localPersonOrganizationAssociationCategoryTracker = true;
                                   
                                            this.localPersonOrganizationAssociationCategory=param;
                                    

                               }
                            

                        /**
                        * field for FederalEmergencyResponseOfficialFlag
                        */

                        
                                    protected java.lang.String localFederalEmergencyResponseOfficialFlag ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFederalEmergencyResponseOfficialFlagTracker = false ;

                           public boolean isFederalEmergencyResponseOfficialFlagSpecified(){
                               return localFederalEmergencyResponseOfficialFlagTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFederalEmergencyResponseOfficialFlag(){
                               return localFederalEmergencyResponseOfficialFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FederalEmergencyResponseOfficialFlag
                               */
                               public void setFederalEmergencyResponseOfficialFlag(java.lang.String param){
                            localFederalEmergencyResponseOfficialFlagTracker = true;
                                   
                                            this.localFederalEmergencyResponseOfficialFlag=param;
                                    

                               }
                            

                        /**
                        * field for DateofSponsorship
                        */

                        
                                    protected java.util.Calendar localDateofSponsorship ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDateofSponsorshipTracker = false ;

                           public boolean isDateofSponsorshipSpecified(){
                               return localDateofSponsorshipTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getDateofSponsorship(){
                               return localDateofSponsorship;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DateofSponsorship
                               */
                               public void setDateofSponsorship(java.util.Calendar param){
                            localDateofSponsorshipTracker = param != null;
                                   
                                            this.localDateofSponsorship=param;
                                    

                               }
                            

                        /**
                        * field for SponsorPID
                        */

                        
                                    protected java.lang.String localSponsorPID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSponsorPIDTracker = false ;

                           public boolean isSponsorPIDSpecified(){
                               return localSponsorPIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSponsorPID(){
                               return localSponsorPID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SponsorPID
                               */
                               public void setSponsorPID(java.lang.String param){
                            localSponsorPIDTracker = true;
                                   
                                            this.localSponsorPID=param;
                                    

                               }
                            

                        /**
                        * field for BusinessPhone
                        */

                        
                                    protected java.lang.String localBusinessPhone ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBusinessPhoneTracker = false ;

                           public boolean isBusinessPhoneSpecified(){
                               return localBusinessPhoneTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBusinessPhone(){
                               return localBusinessPhone;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BusinessPhone
                               */
                               public void setBusinessPhone(java.lang.String param){
                            localBusinessPhoneTracker = true;
                                   
                                            this.localBusinessPhone=param;
                                    

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
                            localBusinessEmailTracker = true;
                                   
                                            this.localBusinessEmail=param;
                                    

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
                            localCredentialOptionTracker = true;
                                   
                                            this.localCredentialOption=param;
                                    

                               }
                            

                        /**
                        * field for PIVCardRequiredCode
                        */

                        
                                    protected java.lang.String localPIVCardRequiredCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPIVCardRequiredCodeTracker = false ;

                           public boolean isPIVCardRequiredCodeSpecified(){
                               return localPIVCardRequiredCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPIVCardRequiredCode(){
                               return localPIVCardRequiredCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PIVCardRequiredCode
                               */
                               public void setPIVCardRequiredCode(java.lang.String param){
                            localPIVCardRequiredCodeTracker = true;
                                   
                                            this.localPIVCardRequiredCode=param;
                                    

                               }
                            

                        /**
                        * field for UPNFlag
                        */

                        
                                    protected java.lang.String localUPNFlag ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUPNFlagTracker = false ;

                           public boolean isUPNFlagSpecified(){
                               return localUPNFlagTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUPNFlag(){
                               return localUPNFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UPNFlag
                               */
                               public void setUPNFlag(java.lang.String param){
                            localUPNFlagTracker = true;
                                   
                                            this.localUPNFlag=param;
                                    

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
                            localPIVCardTypeTracker = true;
                                   
                                            this.localPIVCardType=param;
                                    

                               }
                            

                        /**
                        * field for CardShippingTypeCode
                        */

                        
                                    protected java.lang.String localCardShippingTypeCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCardShippingTypeCodeTracker = false ;

                           public boolean isCardShippingTypeCodeSpecified(){
                               return localCardShippingTypeCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCardShippingTypeCode(){
                               return localCardShippingTypeCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CardShippingTypeCode
                               */
                               public void setCardShippingTypeCode(java.lang.String param){
                            localCardShippingTypeCodeTracker = true;
                                   
                                            this.localCardShippingTypeCode=param;
                                    

                               }
                            

                        /**
                        * field for CardShipAddrCode
                        */

                        
                                    protected java.lang.String localCardShipAddrCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCardShipAddrCodeTracker = false ;

                           public boolean isCardShipAddrCodeSpecified(){
                               return localCardShipAddrCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCardShipAddrCode(){
                               return localCardShipAddrCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CardShipAddrCode
                               */
                               public void setCardShipAddrCode(java.lang.String param){
                            localCardShipAddrCodeTracker = true;
                                   
                                            this.localCardShipAddrCode=param;
                                    

                               }
                            

                        /**
                        * field for AgencySpecialUse
                        */

                        
                                    protected java.lang.String localAgencySpecialUse ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAgencySpecialUseTracker = false ;

                           public boolean isAgencySpecialUseSpecified(){
                               return localAgencySpecialUseTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAgencySpecialUse(){
                               return localAgencySpecialUse;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AgencySpecialUse
                               */
                               public void setAgencySpecialUse(java.lang.String param){
                            localAgencySpecialUseTracker = true;
                                   
                                            this.localAgencySpecialUse=param;
                                    

                               }
                            

                        /**
                        * field for AgencySpecificText
                        */

                        
                                    protected java.lang.String localAgencySpecificText ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAgencySpecificTextTracker = false ;

                           public boolean isAgencySpecificTextSpecified(){
                               return localAgencySpecificTextTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAgencySpecificText(){
                               return localAgencySpecificText;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AgencySpecificText
                               */
                               public void setAgencySpecificText(java.lang.String param){
                            localAgencySpecificTextTracker = true;
                                   
                                            this.localAgencySpecificText=param;
                                    

                               }
                            

                        /**
                        * field for Rank
                        */

                        
                                    protected java.lang.String localRank ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRankTracker = false ;

                           public boolean isRankSpecified(){
                               return localRankTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRank(){
                               return localRank;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Rank
                               */
                               public void setRank(java.lang.String param){
                            localRankTracker = true;
                                   
                                            this.localRank=param;
                                    

                               }
                            

                        /**
                        * field for AgencySpecificData
                        */

                        
                                    protected java.lang.String localAgencySpecificData ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAgencySpecificDataTracker = false ;

                           public boolean isAgencySpecificDataSpecified(){
                               return localAgencySpecificDataTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAgencySpecificData(){
                               return localAgencySpecificData;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AgencySpecificData
                               */
                               public void setAgencySpecificData(java.lang.String param){
                            localAgencySpecificDataTracker = true;
                                   
                                            this.localAgencySpecificData=param;
                                    

                               }
                            

                        /**
                        * field for CardHeader
                        */

                        
                                    protected java.lang.String localCardHeader ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCardHeaderTracker = false ;

                           public boolean isCardHeaderSpecified(){
                               return localCardHeaderTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCardHeader(){
                               return localCardHeader;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CardHeader
                               */
                               public void setCardHeader(java.lang.String param){
                            localCardHeaderTracker = true;
                                   
                                            this.localCardHeader=param;
                                    

                               }
                            

                        /**
                        * field for UPN
                        */

                        
                                    protected java.lang.String localUPN ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUPNTracker = false ;

                           public boolean isUPNSpecified(){
                               return localUPNTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUPN(){
                               return localUPN;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UPN
                               */
                               public void setUPN(java.lang.String param){
                            localUPNTracker = true;
                                   
                                            this.localUPN=param;
                                    

                               }
                            

                        /**
                        * field for ContractNumber
                        */

                        
                                    protected java.lang.String localContractNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localContractNumberTracker = false ;

                           public boolean isContractNumberSpecified(){
                               return localContractNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getContractNumber(){
                               return localContractNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ContractNumber
                               */
                               public void setContractNumber(java.lang.String param){
                            localContractNumberTracker = true;
                                   
                                            this.localContractNumber=param;
                                    

                               }
                            

                        /**
                        * field for EmployeeID
                        */

                        
                                    protected java.lang.String localEmployeeID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEmployeeIDTracker = false ;

                           public boolean isEmployeeIDSpecified(){
                               return localEmployeeIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEmployeeID(){
                               return localEmployeeID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EmployeeID
                               */
                               public void setEmployeeID(java.lang.String param){
                            localEmployeeIDTracker = true;
                                   
                                            this.localEmployeeID=param;
                                    

                               }
                            

                        /**
                        * field for PIVCertificateSet
                        */

                        
                                    protected java.lang.String localPIVCertificateSet ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPIVCertificateSetTracker = false ;

                           public boolean isPIVCertificateSetSpecified(){
                               return localPIVCertificateSetTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPIVCertificateSet(){
                               return localPIVCertificateSet;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PIVCertificateSet
                               */
                               public void setPIVCertificateSet(java.lang.String param){
                            localPIVCertificateSetTracker = true;
                                   
                                            this.localPIVCertificateSet=param;
                                    

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
                            localEmployeeStatusTracker = true;
                                   
                                            this.localEmployeeStatus=param;
                                    

                               }
                            

                        /**
                        * field for SubAgencyAbbreviation
                        */

                        
                                    protected java.lang.String localSubAgencyAbbreviation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubAgencyAbbreviationTracker = false ;

                           public boolean isSubAgencyAbbreviationSpecified(){
                               return localSubAgencyAbbreviationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSubAgencyAbbreviation(){
                               return localSubAgencyAbbreviation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SubAgencyAbbreviation
                               */
                               public void setSubAgencyAbbreviation(java.lang.String param){
                            localSubAgencyAbbreviationTracker = true;
                                   
                                            this.localSubAgencyAbbreviation=param;
                                    

                               }
                            

                        /**
                        * field for PrintMode
                        */

                        
                                    protected java.lang.String localPrintMode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrintModeTracker = false ;

                           public boolean isPrintModeSpecified(){
                               return localPrintModeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPrintMode(){
                               return localPrintMode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrintMode
                               */
                               public void setPrintMode(java.lang.String param){
                            localPrintModeTracker = true;
                                   
                                            this.localPrintMode=param;
                                    

                               }
                            

                        /**
                        * field for NextCardExpireDate
                        */

                        
                                    protected java.util.Calendar localNextCardExpireDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNextCardExpireDateTracker = false ;

                           public boolean isNextCardExpireDateSpecified(){
                               return localNextCardExpireDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getNextCardExpireDate(){
                               return localNextCardExpireDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NextCardExpireDate
                               */
                               public void setNextCardExpireDate(java.util.Calendar param){
                            localNextCardExpireDateTracker = param != null;
                                   
                                            this.localNextCardExpireDate=param;
                                    

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
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://hspd12.gsa.gov/federated/enrollment");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":SponsorshipInformation",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "SponsorshipInformation",
                           xmlWriter);
                   }

               
                   }
                if (localPersonOrganizationAssociationCategoryTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "PersonOrganizationAssociationCategory", xmlWriter);
                             

                                          if (localPersonOrganizationAssociationCategory==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPersonOrganizationAssociationCategory);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFederalEmergencyResponseOfficialFlagTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "FederalEmergencyResponseOfficialFlag", xmlWriter);
                             

                                          if (localFederalEmergencyResponseOfficialFlag==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFederalEmergencyResponseOfficialFlag);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDateofSponsorshipTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "DateofSponsorship", xmlWriter);
                             

                                          if (localDateofSponsorship==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("DateofSponsorship cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateofSponsorship));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSponsorPIDTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "SponsorPID", xmlWriter);
                             

                                          if (localSponsorPID==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSponsorPID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBusinessPhoneTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "BusinessPhone", xmlWriter);
                             

                                          if (localBusinessPhone==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBusinessPhone);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBusinessEmailTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "BusinessEmail", xmlWriter);
                             

                                          if (localBusinessEmail==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBusinessEmail);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCredentialOptionTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "CredentialOption", xmlWriter);
                             

                                          if (localCredentialOption==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCredentialOption);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPIVCardRequiredCodeTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "PIVCardRequiredCode", xmlWriter);
                             

                                          if (localPIVCardRequiredCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPIVCardRequiredCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUPNFlagTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "UPNFlag", xmlWriter);
                             

                                          if (localUPNFlag==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUPNFlag);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPIVCardTypeTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "PIVCardType", xmlWriter);
                             

                                          if (localPIVCardType==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPIVCardType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCardShippingTypeCodeTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "CardShippingTypeCode", xmlWriter);
                             

                                          if (localCardShippingTypeCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCardShippingTypeCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCardShipAddrCodeTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "CardShipAddrCode", xmlWriter);
                             

                                          if (localCardShipAddrCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCardShipAddrCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAgencySpecialUseTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "AgencySpecialUse", xmlWriter);
                             

                                          if (localAgencySpecialUse==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAgencySpecialUse);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAgencySpecificTextTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "AgencySpecificText", xmlWriter);
                             

                                          if (localAgencySpecificText==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAgencySpecificText);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRankTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "Rank", xmlWriter);
                             

                                          if (localRank==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRank);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAgencySpecificDataTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "AgencySpecificData", xmlWriter);
                             

                                          if (localAgencySpecificData==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAgencySpecificData);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCardHeaderTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "CardHeader", xmlWriter);
                             

                                          if (localCardHeader==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCardHeader);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUPNTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "UPN", xmlWriter);
                             

                                          if (localUPN==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUPN);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localContractNumberTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "ContractNumber", xmlWriter);
                             

                                          if (localContractNumber==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localContractNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEmployeeIDTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "EmployeeID", xmlWriter);
                             

                                          if (localEmployeeID==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEmployeeID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPIVCertificateSetTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "PIVCertificateSet", xmlWriter);
                             

                                          if (localPIVCertificateSet==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPIVCertificateSet);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEmployeeStatusTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "EmployeeStatus", xmlWriter);
                             

                                          if (localEmployeeStatus==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEmployeeStatus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSubAgencyAbbreviationTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "SubAgencyAbbreviation", xmlWriter);
                             

                                          if (localSubAgencyAbbreviation==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSubAgencyAbbreviation);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPrintModeTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "PrintMode", xmlWriter);
                             

                                          if (localPrintMode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPrintMode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNextCardExpireDateTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "NextCardExpireDate", xmlWriter);
                             

                                          if (localNextCardExpireDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("NextCardExpireDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNextCardExpireDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://hspd12.gsa.gov/federated/enrollment")){
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

                 if (localPersonOrganizationAssociationCategoryTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "PersonOrganizationAssociationCategory"));
                                 
                                         elementList.add(localPersonOrganizationAssociationCategory==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPersonOrganizationAssociationCategory));
                                    } if (localFederalEmergencyResponseOfficialFlagTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "FederalEmergencyResponseOfficialFlag"));
                                 
                                         elementList.add(localFederalEmergencyResponseOfficialFlag==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFederalEmergencyResponseOfficialFlag));
                                    } if (localDateofSponsorshipTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "DateofSponsorship"));
                                 
                                        if (localDateofSponsorship != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDateofSponsorship));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("DateofSponsorship cannot be null!!");
                                        }
                                    } if (localSponsorPIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "SponsorPID"));
                                 
                                         elementList.add(localSponsorPID==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSponsorPID));
                                    } if (localBusinessPhoneTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "BusinessPhone"));
                                 
                                         elementList.add(localBusinessPhone==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBusinessPhone));
                                    } if (localBusinessEmailTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "BusinessEmail"));
                                 
                                         elementList.add(localBusinessEmail==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBusinessEmail));
                                    } if (localCredentialOptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "CredentialOption"));
                                 
                                         elementList.add(localCredentialOption==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCredentialOption));
                                    } if (localPIVCardRequiredCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "PIVCardRequiredCode"));
                                 
                                         elementList.add(localPIVCardRequiredCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPIVCardRequiredCode));
                                    } if (localUPNFlagTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "UPNFlag"));
                                 
                                         elementList.add(localUPNFlag==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUPNFlag));
                                    } if (localPIVCardTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "PIVCardType"));
                                 
                                         elementList.add(localPIVCardType==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPIVCardType));
                                    } if (localCardShippingTypeCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "CardShippingTypeCode"));
                                 
                                         elementList.add(localCardShippingTypeCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardShippingTypeCode));
                                    } if (localCardShipAddrCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "CardShipAddrCode"));
                                 
                                         elementList.add(localCardShipAddrCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardShipAddrCode));
                                    } if (localAgencySpecialUseTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "AgencySpecialUse"));
                                 
                                         elementList.add(localAgencySpecialUse==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAgencySpecialUse));
                                    } if (localAgencySpecificTextTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "AgencySpecificText"));
                                 
                                         elementList.add(localAgencySpecificText==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAgencySpecificText));
                                    } if (localRankTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "Rank"));
                                 
                                         elementList.add(localRank==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRank));
                                    } if (localAgencySpecificDataTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "AgencySpecificData"));
                                 
                                         elementList.add(localAgencySpecificData==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAgencySpecificData));
                                    } if (localCardHeaderTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "CardHeader"));
                                 
                                         elementList.add(localCardHeader==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardHeader));
                                    } if (localUPNTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "UPN"));
                                 
                                         elementList.add(localUPN==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUPN));
                                    } if (localContractNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "ContractNumber"));
                                 
                                         elementList.add(localContractNumber==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localContractNumber));
                                    } if (localEmployeeIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "EmployeeID"));
                                 
                                         elementList.add(localEmployeeID==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmployeeID));
                                    } if (localPIVCertificateSetTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "PIVCertificateSet"));
                                 
                                         elementList.add(localPIVCertificateSet==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPIVCertificateSet));
                                    } if (localEmployeeStatusTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "EmployeeStatus"));
                                 
                                         elementList.add(localEmployeeStatus==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmployeeStatus));
                                    } if (localSubAgencyAbbreviationTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "SubAgencyAbbreviation"));
                                 
                                         elementList.add(localSubAgencyAbbreviation==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSubAgencyAbbreviation));
                                    } if (localPrintModeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "PrintMode"));
                                 
                                         elementList.add(localPrintMode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrintMode));
                                    } if (localNextCardExpireDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "NextCardExpireDate"));
                                 
                                        if (localNextCardExpireDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNextCardExpireDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("NextCardExpireDate cannot be null!!");
                                        }
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
        public static SponsorshipInformation parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SponsorshipInformation object =
                new SponsorshipInformation();

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
                    
                            if (!"SponsorshipInformation".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SponsorshipInformation)gov.gsa.hspd12.federated.enrollment.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","PersonOrganizationAssociationCategory").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPersonOrganizationAssociationCategory(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","FederalEmergencyResponseOfficialFlag").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFederalEmergencyResponseOfficialFlag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","DateofSponsorship").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDateofSponsorship(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","SponsorPID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSponsorPID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","BusinessPhone").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBusinessPhone(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","BusinessEmail").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBusinessEmail(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","CredentialOption").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCredentialOption(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","PIVCardRequiredCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPIVCardRequiredCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","UPNFlag").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUPNFlag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","PIVCardType").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPIVCardType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","CardShippingTypeCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCardShippingTypeCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","CardShipAddrCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCardShipAddrCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","AgencySpecialUse").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAgencySpecialUse(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","AgencySpecificText").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAgencySpecificText(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","Rank").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRank(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","AgencySpecificData").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAgencySpecificData(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","CardHeader").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCardHeader(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","UPN").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUPN(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","ContractNumber").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setContractNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","EmployeeID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEmployeeID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","PIVCertificateSet").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPIVCertificateSet(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","EmployeeStatus").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEmployeeStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","SubAgencyAbbreviation").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSubAgencyAbbreviation(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","PrintMode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPrintMode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","NextCardExpireDate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNextCardExpireDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
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
           
    
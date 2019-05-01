
/**
 * StatusInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */

            
                package gov.gsa.hspd12.federated.enrollment;
            

            /**
            *  StatusInformation bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class StatusInformation
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = StatusInformation
                Namespace URI = http://hspd12.gsa.gov/federated/enrollment
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for SponsorshipStatus
                        */

                        
                                    protected java.lang.String localSponsorshipStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSponsorshipStatusTracker = false ;

                           public boolean isSponsorshipStatusSpecified(){
                               return localSponsorshipStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSponsorshipStatus(){
                               return localSponsorshipStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SponsorshipStatus
                               */
                               public void setSponsorshipStatus(java.lang.String param){
                            localSponsorshipStatusTracker = true;
                                   
                                            this.localSponsorshipStatus=param;
                                    

                               }
                            

                        /**
                        * field for SponsorshipLastUpdate
                        */

                        
                                    protected java.util.Calendar localSponsorshipLastUpdate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSponsorshipLastUpdateTracker = false ;

                           public boolean isSponsorshipLastUpdateSpecified(){
                               return localSponsorshipLastUpdateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getSponsorshipLastUpdate(){
                               return localSponsorshipLastUpdate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SponsorshipLastUpdate
                               */
                               public void setSponsorshipLastUpdate(java.util.Calendar param){
                            localSponsorshipLastUpdateTracker = param != null;
                                   
                                            this.localSponsorshipLastUpdate=param;
                                    

                               }
                            

                        /**
                        * field for EnrollmentStatus
                        */

                        
                                    protected java.lang.String localEnrollmentStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEnrollmentStatusTracker = false ;

                           public boolean isEnrollmentStatusSpecified(){
                               return localEnrollmentStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getEnrollmentStatus(){
                               return localEnrollmentStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EnrollmentStatus
                               */
                               public void setEnrollmentStatus(java.lang.String param){
                            localEnrollmentStatusTracker = true;
                                   
                                            this.localEnrollmentStatus=param;
                                    

                               }
                            

                        /**
                        * field for EnrollmentLastUpdate
                        */

                        
                                    protected java.util.Calendar localEnrollmentLastUpdate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEnrollmentLastUpdateTracker = false ;

                           public boolean isEnrollmentLastUpdateSpecified(){
                               return localEnrollmentLastUpdateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getEnrollmentLastUpdate(){
                               return localEnrollmentLastUpdate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EnrollmentLastUpdate
                               */
                               public void setEnrollmentLastUpdate(java.util.Calendar param){
                            localEnrollmentLastUpdateTracker = param != null;
                                   
                                            this.localEnrollmentLastUpdate=param;
                                    

                               }
                            

                        /**
                        * field for AdjudicationStatus
                        */

                        
                                    protected java.lang.String localAdjudicationStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAdjudicationStatusTracker = false ;

                           public boolean isAdjudicationStatusSpecified(){
                               return localAdjudicationStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAdjudicationStatus(){
                               return localAdjudicationStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdjudicationStatus
                               */
                               public void setAdjudicationStatus(java.lang.String param){
                            localAdjudicationStatusTracker = true;
                                   
                                            this.localAdjudicationStatus=param;
                                    

                               }
                            

                        /**
                        * field for AdjudicationLastUpdate
                        */

                        
                                    protected java.util.Calendar localAdjudicationLastUpdate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAdjudicationLastUpdateTracker = false ;

                           public boolean isAdjudicationLastUpdateSpecified(){
                               return localAdjudicationLastUpdateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getAdjudicationLastUpdate(){
                               return localAdjudicationLastUpdate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdjudicationLastUpdate
                               */
                               public void setAdjudicationLastUpdate(java.util.Calendar param){
                            localAdjudicationLastUpdateTracker = param != null;
                                   
                                            this.localAdjudicationLastUpdate=param;
                                    

                               }
                            

                        /**
                        * field for AgencySpecificCriteriaStatus
                        */

                        
                                    protected java.lang.String localAgencySpecificCriteriaStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAgencySpecificCriteriaStatusTracker = false ;

                           public boolean isAgencySpecificCriteriaStatusSpecified(){
                               return localAgencySpecificCriteriaStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAgencySpecificCriteriaStatus(){
                               return localAgencySpecificCriteriaStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AgencySpecificCriteriaStatus
                               */
                               public void setAgencySpecificCriteriaStatus(java.lang.String param){
                            localAgencySpecificCriteriaStatusTracker = true;
                                   
                                            this.localAgencySpecificCriteriaStatus=param;
                                    

                               }
                            

                        /**
                        * field for PIVIAgencySpecificCriteriaStatus
                        */

                        
                                    protected java.lang.String localPIVIAgencySpecificCriteriaStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPIVIAgencySpecificCriteriaStatusTracker = false ;

                           public boolean isPIVIAgencySpecificCriteriaStatusSpecified(){
                               return localPIVIAgencySpecificCriteriaStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPIVIAgencySpecificCriteriaStatus(){
                               return localPIVIAgencySpecificCriteriaStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PIVIAgencySpecificCriteriaStatus
                               */
                               public void setPIVIAgencySpecificCriteriaStatus(java.lang.String param){
                            localPIVIAgencySpecificCriteriaStatusTracker = true;
                                   
                                            this.localPIVIAgencySpecificCriteriaStatus=param;
                                    

                               }
                            

                        /**
                        * field for AgencySpecificCriteriaLastUpdate
                        */

                        
                                    protected java.util.Calendar localAgencySpecificCriteriaLastUpdate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAgencySpecificCriteriaLastUpdateTracker = false ;

                           public boolean isAgencySpecificCriteriaLastUpdateSpecified(){
                               return localAgencySpecificCriteriaLastUpdateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getAgencySpecificCriteriaLastUpdate(){
                               return localAgencySpecificCriteriaLastUpdate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AgencySpecificCriteriaLastUpdate
                               */
                               public void setAgencySpecificCriteriaLastUpdate(java.util.Calendar param){
                            localAgencySpecificCriteriaLastUpdateTracker = param != null;
                                   
                                            this.localAgencySpecificCriteriaLastUpdate=param;
                                    

                               }
                            

                        /**
                        * field for IssuanceStatus
                        */

                        
                                    protected java.lang.String localIssuanceStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIssuanceStatusTracker = false ;

                           public boolean isIssuanceStatusSpecified(){
                               return localIssuanceStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getIssuanceStatus(){
                               return localIssuanceStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IssuanceStatus
                               */
                               public void setIssuanceStatus(java.lang.String param){
                            localIssuanceStatusTracker = true;
                                   
                                            this.localIssuanceStatus=param;
                                    

                               }
                            

                        /**
                        * field for IssuanceLastUpdate
                        */

                        
                                    protected java.util.Calendar localIssuanceLastUpdate ;
                                
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
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getIssuanceLastUpdate(){
                               return localIssuanceLastUpdate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IssuanceLastUpdate
                               */
                               public void setIssuanceLastUpdate(java.util.Calendar param){
                            localIssuanceLastUpdateTracker = param != null;
                                   
                                            this.localIssuanceLastUpdate=param;
                                    

                               }
                            

                        /**
                        * field for ReplacementStatus
                        */

                        
                                    protected java.lang.String localReplacementStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReplacementStatusTracker = false ;

                           public boolean isReplacementStatusSpecified(){
                               return localReplacementStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReplacementStatus(){
                               return localReplacementStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReplacementStatus
                               */
                               public void setReplacementStatus(java.lang.String param){
                            localReplacementStatusTracker = true;
                                   
                                            this.localReplacementStatus=param;
                                    

                               }
                            

                        /**
                        * field for ReplacementLastUpdate
                        */

                        
                                    protected java.util.Calendar localReplacementLastUpdate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReplacementLastUpdateTracker = false ;

                           public boolean isReplacementLastUpdateSpecified(){
                               return localReplacementLastUpdateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getReplacementLastUpdate(){
                               return localReplacementLastUpdate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReplacementLastUpdate
                               */
                               public void setReplacementLastUpdate(java.util.Calendar param){
                            localReplacementLastUpdateTracker = param != null;
                                   
                                            this.localReplacementLastUpdate=param;
                                    

                               }
                            

                        /**
                        * field for DocumentReferral
                        */

                        
                                    protected java.lang.String localDocumentReferral ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDocumentReferralTracker = false ;

                           public boolean isDocumentReferralSpecified(){
                               return localDocumentReferralTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDocumentReferral(){
                               return localDocumentReferral;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DocumentReferral
                               */
                               public void setDocumentReferral(java.lang.String param){
                            localDocumentReferralTracker = true;
                                   
                                            this.localDocumentReferral=param;
                                    

                               }
                            

                        /**
                        * field for DuplicateCheck
                        */

                        
                                    protected java.lang.String localDuplicateCheck ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDuplicateCheckTracker = false ;

                           public boolean isDuplicateCheckSpecified(){
                               return localDuplicateCheckTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDuplicateCheck(){
                               return localDuplicateCheck;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DuplicateCheck
                               */
                               public void setDuplicateCheck(java.lang.String param){
                            localDuplicateCheckTracker = true;
                                   
                                            this.localDuplicateCheck=param;
                                    

                               }
                            

                        /**
                        * field for CertificateReissuanceRequest
                        */

                        
                                    protected java.lang.String localCertificateReissuanceRequest ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCertificateReissuanceRequestTracker = false ;

                           public boolean isCertificateReissuanceRequestSpecified(){
                               return localCertificateReissuanceRequestTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCertificateReissuanceRequest(){
                               return localCertificateReissuanceRequest;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CertificateReissuanceRequest
                               */
                               public void setCertificateReissuanceRequest(java.lang.String param){
                            localCertificateReissuanceRequestTracker = true;
                                   
                                            this.localCertificateReissuanceRequest=param;
                                    

                               }
                            

                        /**
                        * field for CertificateReissuanceRequestDate
                        */

                        
                                    protected java.util.Calendar localCertificateReissuanceRequestDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCertificateReissuanceRequestDateTracker = false ;

                           public boolean isCertificateReissuanceRequestDateSpecified(){
                               return localCertificateReissuanceRequestDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getCertificateReissuanceRequestDate(){
                               return localCertificateReissuanceRequestDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CertificateReissuanceRequestDate
                               */
                               public void setCertificateReissuanceRequestDate(java.util.Calendar param){
                            localCertificateReissuanceRequestDateTracker = param != null;
                                   
                                            this.localCertificateReissuanceRequestDate=param;
                                    

                               }
                            

                        /**
                        * field for CardReprintRequest
                        */

                        
                                    protected java.lang.String localCardReprintRequest ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCardReprintRequestTracker = false ;

                           public boolean isCardReprintRequestSpecified(){
                               return localCardReprintRequestTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCardReprintRequest(){
                               return localCardReprintRequest;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CardReprintRequest
                               */
                               public void setCardReprintRequest(java.lang.String param){
                            localCardReprintRequestTracker = true;
                                   
                                            this.localCardReprintRequest=param;
                                    

                               }
                            

                        /**
                        * field for CardReprintRequestDate
                        */

                        
                                    protected java.util.Calendar localCardReprintRequestDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCardReprintRequestDateTracker = false ;

                           public boolean isCardReprintRequestDateSpecified(){
                               return localCardReprintRequestDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getCardReprintRequestDate(){
                               return localCardReprintRequestDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CardReprintRequestDate
                               */
                               public void setCardReprintRequestDate(java.util.Calendar param){
                            localCardReprintRequestDateTracker = param != null;
                                   
                                            this.localCardReprintRequestDate=param;
                                    

                               }
                            

                        /**
                        * field for CardReissueRequest
                        */

                        
                                    protected java.lang.String localCardReissueRequest ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCardReissueRequestTracker = false ;

                           public boolean isCardReissueRequestSpecified(){
                               return localCardReissueRequestTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCardReissueRequest(){
                               return localCardReissueRequest;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CardReissueRequest
                               */
                               public void setCardReissueRequest(java.lang.String param){
                            localCardReissueRequestTracker = true;
                                   
                                            this.localCardReissueRequest=param;
                                    

                               }
                            

                        /**
                        * field for CardReissueRequestDate
                        */

                        
                                    protected java.util.Calendar localCardReissueRequestDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCardReissueRequestDateTracker = false ;

                           public boolean isCardReissueRequestDateSpecified(){
                               return localCardReissueRequestDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getCardReissueRequestDate(){
                               return localCardReissueRequestDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CardReissueRequestDate
                               */
                               public void setCardReissueRequestDate(java.util.Calendar param){
                            localCardReissueRequestDateTracker = param != null;
                                   
                                            this.localCardReissueRequestDate=param;
                                    

                               }
                            

                        /**
                        * field for ProcessStatusList
                        */

                        
                                    protected gov.gsa.hspd12.federated.enrollment.ArrayOfProcessStatus localProcessStatusList ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProcessStatusListTracker = false ;

                           public boolean isProcessStatusListSpecified(){
                               return localProcessStatusListTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.gsa.hspd12.federated.enrollment.ArrayOfProcessStatus
                           */
                           public  gov.gsa.hspd12.federated.enrollment.ArrayOfProcessStatus getProcessStatusList(){
                               return localProcessStatusList;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProcessStatusList
                               */
                               public void setProcessStatusList(gov.gsa.hspd12.federated.enrollment.ArrayOfProcessStatus param){
                            localProcessStatusListTracker = true;
                                   
                                            this.localProcessStatusList=param;
                                    

                               }
                            

                        /**
                        * field for IssuanceValidationStatus
                        */

                        
                                    protected gov.gsa.hspd12.federated.enrollment.IssuanceValidationStatus localIssuanceValidationStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIssuanceValidationStatusTracker = false ;

                           public boolean isIssuanceValidationStatusSpecified(){
                               return localIssuanceValidationStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.gsa.hspd12.federated.enrollment.IssuanceValidationStatus
                           */
                           public  gov.gsa.hspd12.federated.enrollment.IssuanceValidationStatus getIssuanceValidationStatus(){
                               return localIssuanceValidationStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IssuanceValidationStatus
                               */
                               public void setIssuanceValidationStatus(gov.gsa.hspd12.federated.enrollment.IssuanceValidationStatus param){
                            localIssuanceValidationStatusTracker = true;
                                   
                                            this.localIssuanceValidationStatus=param;
                                    

                               }
                            

                        /**
                        * field for CredentialCheckInStatus
                        */

                        
                                    protected gov.gsa.hspd12.federated.enrollment.CredentialCheckInStatus localCredentialCheckInStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCredentialCheckInStatusTracker = false ;

                           public boolean isCredentialCheckInStatusSpecified(){
                               return localCredentialCheckInStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.gsa.hspd12.federated.enrollment.CredentialCheckInStatus
                           */
                           public  gov.gsa.hspd12.federated.enrollment.CredentialCheckInStatus getCredentialCheckInStatus(){
                               return localCredentialCheckInStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CredentialCheckInStatus
                               */
                               public void setCredentialCheckInStatus(gov.gsa.hspd12.federated.enrollment.CredentialCheckInStatus param){
                            localCredentialCheckInStatusTracker = true;
                                   
                                            this.localCredentialCheckInStatus=param;
                                    

                               }
                            

                        /**
                        * field for EftsRequestStatus
                        */

                        
                                    protected gov.gsa.hspd12.federated.enrollment.EftsRequestStatus localEftsRequestStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEftsRequestStatusTracker = false ;

                           public boolean isEftsRequestStatusSpecified(){
                               return localEftsRequestStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.gsa.hspd12.federated.enrollment.EftsRequestStatus
                           */
                           public  gov.gsa.hspd12.federated.enrollment.EftsRequestStatus getEftsRequestStatus(){
                               return localEftsRequestStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EftsRequestStatus
                               */
                               public void setEftsRequestStatus(gov.gsa.hspd12.federated.enrollment.EftsRequestStatus param){
                            localEftsRequestStatusTracker = true;
                                   
                                            this.localEftsRequestStatus=param;
                                    

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
                           namespacePrefix+":StatusInformation",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "StatusInformation",
                           xmlWriter);
                   }

               
                   }
                if (localSponsorshipStatusTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "SponsorshipStatus", xmlWriter);
                             

                                          if (localSponsorshipStatus==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSponsorshipStatus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSponsorshipLastUpdateTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "SponsorshipLastUpdate", xmlWriter);
                             

                                          if (localSponsorshipLastUpdate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("SponsorshipLastUpdate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSponsorshipLastUpdate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEnrollmentStatusTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "EnrollmentStatus", xmlWriter);
                             

                                          if (localEnrollmentStatus==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localEnrollmentStatus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localEnrollmentLastUpdateTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "EnrollmentLastUpdate", xmlWriter);
                             

                                          if (localEnrollmentLastUpdate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("EnrollmentLastUpdate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnrollmentLastUpdate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAdjudicationStatusTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "AdjudicationStatus", xmlWriter);
                             

                                          if (localAdjudicationStatus==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAdjudicationStatus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAdjudicationLastUpdateTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "AdjudicationLastUpdate", xmlWriter);
                             

                                          if (localAdjudicationLastUpdate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("AdjudicationLastUpdate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdjudicationLastUpdate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAgencySpecificCriteriaStatusTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "AgencySpecificCriteriaStatus", xmlWriter);
                             

                                          if (localAgencySpecificCriteriaStatus==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAgencySpecificCriteriaStatus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPIVIAgencySpecificCriteriaStatusTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "PIVIAgencySpecificCriteriaStatus", xmlWriter);
                             

                                          if (localPIVIAgencySpecificCriteriaStatus==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPIVIAgencySpecificCriteriaStatus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAgencySpecificCriteriaLastUpdateTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "AgencySpecificCriteriaLastUpdate", xmlWriter);
                             

                                          if (localAgencySpecificCriteriaLastUpdate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("AgencySpecificCriteriaLastUpdate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAgencySpecificCriteriaLastUpdate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIssuanceStatusTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "IssuanceStatus", xmlWriter);
                             

                                          if (localIssuanceStatus==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIssuanceStatus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIssuanceLastUpdateTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "IssuanceLastUpdate", xmlWriter);
                             

                                          if (localIssuanceLastUpdate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("IssuanceLastUpdate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIssuanceLastUpdate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReplacementStatusTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "ReplacementStatus", xmlWriter);
                             

                                          if (localReplacementStatus==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReplacementStatus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReplacementLastUpdateTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "ReplacementLastUpdate", xmlWriter);
                             

                                          if (localReplacementLastUpdate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReplacementLastUpdate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReplacementLastUpdate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDocumentReferralTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "DocumentReferral", xmlWriter);
                             

                                          if (localDocumentReferral==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDocumentReferral);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDuplicateCheckTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "DuplicateCheck", xmlWriter);
                             

                                          if (localDuplicateCheck==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDuplicateCheck);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCertificateReissuanceRequestTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "CertificateReissuanceRequest", xmlWriter);
                             

                                          if (localCertificateReissuanceRequest==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCertificateReissuanceRequest);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCertificateReissuanceRequestDateTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "CertificateReissuanceRequestDate", xmlWriter);
                             

                                          if (localCertificateReissuanceRequestDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CertificateReissuanceRequestDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCertificateReissuanceRequestDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCardReprintRequestTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "CardReprintRequest", xmlWriter);
                             

                                          if (localCardReprintRequest==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCardReprintRequest);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCardReprintRequestDateTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "CardReprintRequestDate", xmlWriter);
                             

                                          if (localCardReprintRequestDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CardReprintRequestDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardReprintRequestDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCardReissueRequestTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "CardReissueRequest", xmlWriter);
                             

                                          if (localCardReissueRequest==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCardReissueRequest);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCardReissueRequestDateTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "CardReissueRequestDate", xmlWriter);
                             

                                          if (localCardReissueRequestDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CardReissueRequestDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardReissueRequestDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProcessStatusListTracker){
                                    if (localProcessStatusList==null){

                                        writeStartElement(null, "http://hspd12.gsa.gov/federated/enrollment", "ProcessStatusList", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localProcessStatusList.serialize(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","ProcessStatusList"),
                                        xmlWriter);
                                    }
                                } if (localIssuanceValidationStatusTracker){
                                    if (localIssuanceValidationStatus==null){

                                        writeStartElement(null, "http://hspd12.gsa.gov/federated/enrollment", "IssuanceValidationStatus", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localIssuanceValidationStatus.serialize(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","IssuanceValidationStatus"),
                                        xmlWriter);
                                    }
                                } if (localCredentialCheckInStatusTracker){
                                    if (localCredentialCheckInStatus==null){

                                        writeStartElement(null, "http://hspd12.gsa.gov/federated/enrollment", "CredentialCheckInStatus", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCredentialCheckInStatus.serialize(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","CredentialCheckInStatus"),
                                        xmlWriter);
                                    }
                                } if (localEftsRequestStatusTracker){
                                    if (localEftsRequestStatus==null){

                                        writeStartElement(null, "http://hspd12.gsa.gov/federated/enrollment", "EftsRequestStatus", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localEftsRequestStatus.serialize(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","EftsRequestStatus"),
                                        xmlWriter);
                                    }
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

                 if (localSponsorshipStatusTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "SponsorshipStatus"));
                                 
                                         elementList.add(localSponsorshipStatus==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSponsorshipStatus));
                                    } if (localSponsorshipLastUpdateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "SponsorshipLastUpdate"));
                                 
                                        if (localSponsorshipLastUpdate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSponsorshipLastUpdate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("SponsorshipLastUpdate cannot be null!!");
                                        }
                                    } if (localEnrollmentStatusTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "EnrollmentStatus"));
                                 
                                         elementList.add(localEnrollmentStatus==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnrollmentStatus));
                                    } if (localEnrollmentLastUpdateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "EnrollmentLastUpdate"));
                                 
                                        if (localEnrollmentLastUpdate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnrollmentLastUpdate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("EnrollmentLastUpdate cannot be null!!");
                                        }
                                    } if (localAdjudicationStatusTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "AdjudicationStatus"));
                                 
                                         elementList.add(localAdjudicationStatus==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdjudicationStatus));
                                    } if (localAdjudicationLastUpdateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "AdjudicationLastUpdate"));
                                 
                                        if (localAdjudicationLastUpdate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdjudicationLastUpdate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("AdjudicationLastUpdate cannot be null!!");
                                        }
                                    } if (localAgencySpecificCriteriaStatusTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "AgencySpecificCriteriaStatus"));
                                 
                                         elementList.add(localAgencySpecificCriteriaStatus==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAgencySpecificCriteriaStatus));
                                    } if (localPIVIAgencySpecificCriteriaStatusTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "PIVIAgencySpecificCriteriaStatus"));
                                 
                                         elementList.add(localPIVIAgencySpecificCriteriaStatus==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPIVIAgencySpecificCriteriaStatus));
                                    } if (localAgencySpecificCriteriaLastUpdateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "AgencySpecificCriteriaLastUpdate"));
                                 
                                        if (localAgencySpecificCriteriaLastUpdate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAgencySpecificCriteriaLastUpdate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("AgencySpecificCriteriaLastUpdate cannot be null!!");
                                        }
                                    } if (localIssuanceStatusTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "IssuanceStatus"));
                                 
                                         elementList.add(localIssuanceStatus==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIssuanceStatus));
                                    } if (localIssuanceLastUpdateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "IssuanceLastUpdate"));
                                 
                                        if (localIssuanceLastUpdate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIssuanceLastUpdate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("IssuanceLastUpdate cannot be null!!");
                                        }
                                    } if (localReplacementStatusTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "ReplacementStatus"));
                                 
                                         elementList.add(localReplacementStatus==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReplacementStatus));
                                    } if (localReplacementLastUpdateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "ReplacementLastUpdate"));
                                 
                                        if (localReplacementLastUpdate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReplacementLastUpdate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReplacementLastUpdate cannot be null!!");
                                        }
                                    } if (localDocumentReferralTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "DocumentReferral"));
                                 
                                         elementList.add(localDocumentReferral==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDocumentReferral));
                                    } if (localDuplicateCheckTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "DuplicateCheck"));
                                 
                                         elementList.add(localDuplicateCheck==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDuplicateCheck));
                                    } if (localCertificateReissuanceRequestTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "CertificateReissuanceRequest"));
                                 
                                         elementList.add(localCertificateReissuanceRequest==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCertificateReissuanceRequest));
                                    } if (localCertificateReissuanceRequestDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "CertificateReissuanceRequestDate"));
                                 
                                        if (localCertificateReissuanceRequestDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCertificateReissuanceRequestDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CertificateReissuanceRequestDate cannot be null!!");
                                        }
                                    } if (localCardReprintRequestTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "CardReprintRequest"));
                                 
                                         elementList.add(localCardReprintRequest==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardReprintRequest));
                                    } if (localCardReprintRequestDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "CardReprintRequestDate"));
                                 
                                        if (localCardReprintRequestDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardReprintRequestDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CardReprintRequestDate cannot be null!!");
                                        }
                                    } if (localCardReissueRequestTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "CardReissueRequest"));
                                 
                                         elementList.add(localCardReissueRequest==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardReissueRequest));
                                    } if (localCardReissueRequestDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "CardReissueRequestDate"));
                                 
                                        if (localCardReissueRequestDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardReissueRequestDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CardReissueRequestDate cannot be null!!");
                                        }
                                    } if (localProcessStatusListTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "ProcessStatusList"));
                            
                            
                                    elementList.add(localProcessStatusList==null?null:
                                    localProcessStatusList);
                                } if (localIssuanceValidationStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "IssuanceValidationStatus"));
                            
                            
                                    elementList.add(localIssuanceValidationStatus==null?null:
                                    localIssuanceValidationStatus);
                                } if (localCredentialCheckInStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "CredentialCheckInStatus"));
                            
                            
                                    elementList.add(localCredentialCheckInStatus==null?null:
                                    localCredentialCheckInStatus);
                                } if (localEftsRequestStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "EftsRequestStatus"));
                            
                            
                                    elementList.add(localEftsRequestStatus==null?null:
                                    localEftsRequestStatus);
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
        public static StatusInformation parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            StatusInformation object =
                new StatusInformation();

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
                    
                            if (!"StatusInformation".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (StatusInformation)gov.gsa.hspd12.federated.enrollment.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","SponsorshipStatus").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSponsorshipStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","SponsorshipLastUpdate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSponsorshipLastUpdate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","EnrollmentStatus").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEnrollmentStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","EnrollmentLastUpdate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setEnrollmentLastUpdate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","AdjudicationStatus").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAdjudicationStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","AdjudicationLastUpdate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAdjudicationLastUpdate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","AgencySpecificCriteriaStatus").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAgencySpecificCriteriaStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","PIVIAgencySpecificCriteriaStatus").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPIVIAgencySpecificCriteriaStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","AgencySpecificCriteriaLastUpdate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAgencySpecificCriteriaLastUpdate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","IssuanceStatus").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIssuanceStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","IssuanceLastUpdate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIssuanceLastUpdate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","ReplacementStatus").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReplacementStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","ReplacementLastUpdate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReplacementLastUpdate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","DocumentReferral").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDocumentReferral(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","DuplicateCheck").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDuplicateCheck(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","CertificateReissuanceRequest").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCertificateReissuanceRequest(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","CertificateReissuanceRequestDate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCertificateReissuanceRequestDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","CardReprintRequest").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCardReprintRequest(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","CardReprintRequestDate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCardReprintRequestDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","CardReissueRequest").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCardReissueRequest(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","CardReissueRequestDate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCardReissueRequestDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","ProcessStatusList").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setProcessStatusList(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setProcessStatusList(gov.gsa.hspd12.federated.enrollment.ArrayOfProcessStatus.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","IssuanceValidationStatus").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setIssuanceValidationStatus(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setIssuanceValidationStatus(gov.gsa.hspd12.federated.enrollment.IssuanceValidationStatus.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","CredentialCheckInStatus").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCredentialCheckInStatus(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCredentialCheckInStatus(gov.gsa.hspd12.federated.enrollment.CredentialCheckInStatus.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","EftsRequestStatus").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setEftsRequestStatus(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setEftsRequestStatus(gov.gsa.hspd12.federated.enrollment.EftsRequestStatus.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
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
           
    
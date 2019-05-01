
/**
 * QuerySIPResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */

            
                package gov.gsa.hspd12.federated.enrollment;
            

            /**
            *  QuerySIPResponse bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class QuerySIPResponse
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://hspd12.gsa.gov/federated/enrollment",
                "QuerySIPResponse",
                "ns1");

            

                        /**
                        * field for TransactionHeader
                        */

                        
                                    protected gov.gsa.hspd12.federated.enrollment.TransactionHeader localTransactionHeader ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransactionHeaderTracker = false ;

                           public boolean isTransactionHeaderSpecified(){
                               return localTransactionHeaderTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.gsa.hspd12.federated.enrollment.TransactionHeader
                           */
                           public  gov.gsa.hspd12.federated.enrollment.TransactionHeader getTransactionHeader(){
                               return localTransactionHeader;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransactionHeader
                               */
                               public void setTransactionHeader(gov.gsa.hspd12.federated.enrollment.TransactionHeader param){
                            localTransactionHeaderTracker = true;
                                   
                                            this.localTransactionHeader=param;
                                    

                               }
                            

                        /**
                        * field for PersonIdentifier
                        */

                        
                                    protected gov.gsa.hspd12.federated.enrollment.PersonIdentifier localPersonIdentifier ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPersonIdentifierTracker = false ;

                           public boolean isPersonIdentifierSpecified(){
                               return localPersonIdentifierTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.gsa.hspd12.federated.enrollment.PersonIdentifier
                           */
                           public  gov.gsa.hspd12.federated.enrollment.PersonIdentifier getPersonIdentifier(){
                               return localPersonIdentifier;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PersonIdentifier
                               */
                               public void setPersonIdentifier(gov.gsa.hspd12.federated.enrollment.PersonIdentifier param){
                            localPersonIdentifierTracker = true;
                                   
                                            this.localPersonIdentifier=param;
                                    

                               }
                            

                        /**
                        * field for TransactionStatus
                        */

                        
                                    protected gov.gsa.hspd12.federated.enrollment.TransactionStatus localTransactionStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransactionStatusTracker = false ;

                           public boolean isTransactionStatusSpecified(){
                               return localTransactionStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.gsa.hspd12.federated.enrollment.TransactionStatus
                           */
                           public  gov.gsa.hspd12.federated.enrollment.TransactionStatus getTransactionStatus(){
                               return localTransactionStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransactionStatus
                               */
                               public void setTransactionStatus(gov.gsa.hspd12.federated.enrollment.TransactionStatus param){
                            localTransactionStatusTracker = true;
                                   
                                            this.localTransactionStatus=param;
                                    

                               }
                            

                        /**
                        * field for PersonalInformation
                        */

                        
                                    protected gov.gsa.hspd12.federated.enrollment.PersonalInformation localPersonalInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPersonalInformationTracker = false ;

                           public boolean isPersonalInformationSpecified(){
                               return localPersonalInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.gsa.hspd12.federated.enrollment.PersonalInformation
                           */
                           public  gov.gsa.hspd12.federated.enrollment.PersonalInformation getPersonalInformation(){
                               return localPersonalInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PersonalInformation
                               */
                               public void setPersonalInformation(gov.gsa.hspd12.federated.enrollment.PersonalInformation param){
                            localPersonalInformationTracker = true;
                                   
                                            this.localPersonalInformation=param;
                                    

                               }
                            

                        /**
                        * field for SponsorshipInformation
                        */

                        
                                    protected gov.gsa.hspd12.federated.enrollment.SponsorshipInformation localSponsorshipInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSponsorshipInformationTracker = false ;

                           public boolean isSponsorshipInformationSpecified(){
                               return localSponsorshipInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.gsa.hspd12.federated.enrollment.SponsorshipInformation
                           */
                           public  gov.gsa.hspd12.federated.enrollment.SponsorshipInformation getSponsorshipInformation(){
                               return localSponsorshipInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SponsorshipInformation
                               */
                               public void setSponsorshipInformation(gov.gsa.hspd12.federated.enrollment.SponsorshipInformation param){
                            localSponsorshipInformationTracker = true;
                                   
                                            this.localSponsorshipInformation=param;
                                    

                               }
                            

                        /**
                        * field for EnrollmentInformation
                        */

                        
                                    protected gov.gsa.hspd12.federated.enrollment.EnrollmentInformation localEnrollmentInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEnrollmentInformationTracker = false ;

                           public boolean isEnrollmentInformationSpecified(){
                               return localEnrollmentInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.gsa.hspd12.federated.enrollment.EnrollmentInformation
                           */
                           public  gov.gsa.hspd12.federated.enrollment.EnrollmentInformation getEnrollmentInformation(){
                               return localEnrollmentInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EnrollmentInformation
                               */
                               public void setEnrollmentInformation(gov.gsa.hspd12.federated.enrollment.EnrollmentInformation param){
                            localEnrollmentInformationTracker = true;
                                   
                                            this.localEnrollmentInformation=param;
                                    

                               }
                            

                        /**
                        * field for FingerprintInformation
                        */

                        
                                    protected gov.gsa.hspd12.federated.enrollment.FingerprintInformation localFingerprintInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFingerprintInformationTracker = false ;

                           public boolean isFingerprintInformationSpecified(){
                               return localFingerprintInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.gsa.hspd12.federated.enrollment.FingerprintInformation
                           */
                           public  gov.gsa.hspd12.federated.enrollment.FingerprintInformation getFingerprintInformation(){
                               return localFingerprintInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FingerprintInformation
                               */
                               public void setFingerprintInformation(gov.gsa.hspd12.federated.enrollment.FingerprintInformation param){
                            localFingerprintInformationTracker = true;
                                   
                                            this.localFingerprintInformation=param;
                                    

                               }
                            

                        /**
                        * field for AdjudicationInformation
                        */

                        
                                    protected gov.gsa.hspd12.federated.enrollment.AdjudicationInformation localAdjudicationInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAdjudicationInformationTracker = false ;

                           public boolean isAdjudicationInformationSpecified(){
                               return localAdjudicationInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.gsa.hspd12.federated.enrollment.AdjudicationInformation
                           */
                           public  gov.gsa.hspd12.federated.enrollment.AdjudicationInformation getAdjudicationInformation(){
                               return localAdjudicationInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdjudicationInformation
                               */
                               public void setAdjudicationInformation(gov.gsa.hspd12.federated.enrollment.AdjudicationInformation param){
                            localAdjudicationInformationTracker = true;
                                   
                                            this.localAdjudicationInformation=param;
                                    

                               }
                            

                        /**
                        * field for StatusInformation
                        */

                        
                                    protected gov.gsa.hspd12.federated.enrollment.StatusInformation localStatusInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStatusInformationTracker = false ;

                           public boolean isStatusInformationSpecified(){
                               return localStatusInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.gsa.hspd12.federated.enrollment.StatusInformation
                           */
                           public  gov.gsa.hspd12.federated.enrollment.StatusInformation getStatusInformation(){
                               return localStatusInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StatusInformation
                               */
                               public void setStatusInformation(gov.gsa.hspd12.federated.enrollment.StatusInformation param){
                            localStatusInformationTracker = true;
                                   
                                            this.localStatusInformation=param;
                                    

                               }
                            

                        /**
                        * field for PriorCredentialInformation
                        */

                        
                                    protected gov.gsa.hspd12.federated.enrollment.ArrayOfCredentialInformation localPriorCredentialInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPriorCredentialInformationTracker = false ;

                           public boolean isPriorCredentialInformationSpecified(){
                               return localPriorCredentialInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.gsa.hspd12.federated.enrollment.ArrayOfCredentialInformation
                           */
                           public  gov.gsa.hspd12.federated.enrollment.ArrayOfCredentialInformation getPriorCredentialInformation(){
                               return localPriorCredentialInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PriorCredentialInformation
                               */
                               public void setPriorCredentialInformation(gov.gsa.hspd12.federated.enrollment.ArrayOfCredentialInformation param){
                            localPriorCredentialInformationTracker = true;
                                   
                                            this.localPriorCredentialInformation=param;
                                    

                               }
                            

                        /**
                        * field for ReplacementCredentialInformation
                        */

                        
                                    protected gov.gsa.hspd12.federated.enrollment.CredentialInformation localReplacementCredentialInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReplacementCredentialInformationTracker = false ;

                           public boolean isReplacementCredentialInformationSpecified(){
                               return localReplacementCredentialInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.gsa.hspd12.federated.enrollment.CredentialInformation
                           */
                           public  gov.gsa.hspd12.federated.enrollment.CredentialInformation getReplacementCredentialInformation(){
                               return localReplacementCredentialInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReplacementCredentialInformation
                               */
                               public void setReplacementCredentialInformation(gov.gsa.hspd12.federated.enrollment.CredentialInformation param){
                            localReplacementCredentialInformationTracker = true;
                                   
                                            this.localReplacementCredentialInformation=param;
                                    

                               }
                            

                        /**
                        * field for CurrentCredentialInformation
                        */

                        
                                    protected gov.gsa.hspd12.federated.enrollment.CredentialInformation localCurrentCredentialInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCurrentCredentialInformationTracker = false ;

                           public boolean isCurrentCredentialInformationSpecified(){
                               return localCurrentCredentialInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.gsa.hspd12.federated.enrollment.CredentialInformation
                           */
                           public  gov.gsa.hspd12.federated.enrollment.CredentialInformation getCurrentCredentialInformation(){
                               return localCurrentCredentialInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CurrentCredentialInformation
                               */
                               public void setCurrentCredentialInformation(gov.gsa.hspd12.federated.enrollment.CredentialInformation param){
                            localCurrentCredentialInformationTracker = true;
                                   
                                            this.localCurrentCredentialInformation=param;
                                    

                               }
                            

                        /**
                        * field for PhotographInformation
                        */

                        
                                    protected gov.gsa.hspd12.federated.enrollment.PhotographInformation localPhotographInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPhotographInformationTracker = false ;

                           public boolean isPhotographInformationSpecified(){
                               return localPhotographInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.gsa.hspd12.federated.enrollment.PhotographInformation
                           */
                           public  gov.gsa.hspd12.federated.enrollment.PhotographInformation getPhotographInformation(){
                               return localPhotographInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PhotographInformation
                               */
                               public void setPhotographInformation(gov.gsa.hspd12.federated.enrollment.PhotographInformation param){
                            localPhotographInformationTracker = true;
                                   
                                            this.localPhotographInformation=param;
                                    

                               }
                            

                        /**
                        * field for PriorTempCredentialInformation
                        */

                        
                                    protected gov.gsa.hspd12.federated.enrollment.ArrayOfTempCredentialInformation localPriorTempCredentialInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPriorTempCredentialInformationTracker = false ;

                           public boolean isPriorTempCredentialInformationSpecified(){
                               return localPriorTempCredentialInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.gsa.hspd12.federated.enrollment.ArrayOfTempCredentialInformation
                           */
                           public  gov.gsa.hspd12.federated.enrollment.ArrayOfTempCredentialInformation getPriorTempCredentialInformation(){
                               return localPriorTempCredentialInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PriorTempCredentialInformation
                               */
                               public void setPriorTempCredentialInformation(gov.gsa.hspd12.federated.enrollment.ArrayOfTempCredentialInformation param){
                            localPriorTempCredentialInformationTracker = true;
                                   
                                            this.localPriorTempCredentialInformation=param;
                                    

                               }
                            

                        /**
                        * field for CurrentTempCredentialInformation
                        */

                        
                                    protected gov.gsa.hspd12.federated.enrollment.TempCredentialInformation localCurrentTempCredentialInformation ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCurrentTempCredentialInformationTracker = false ;

                           public boolean isCurrentTempCredentialInformationSpecified(){
                               return localCurrentTempCredentialInformationTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.gsa.hspd12.federated.enrollment.TempCredentialInformation
                           */
                           public  gov.gsa.hspd12.federated.enrollment.TempCredentialInformation getCurrentTempCredentialInformation(){
                               return localCurrentTempCredentialInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CurrentTempCredentialInformation
                               */
                               public void setCurrentTempCredentialInformation(gov.gsa.hspd12.federated.enrollment.TempCredentialInformation param){
                            localCurrentTempCredentialInformationTracker = true;
                                   
                                            this.localCurrentTempCredentialInformation=param;
                                    

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://hspd12.gsa.gov/federated/enrollment");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":QuerySIPResponse",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "QuerySIPResponse",
                           xmlWriter);
                   }

               
                   }
                if (localTransactionHeaderTracker){
                                    if (localTransactionHeader==null){

                                        writeStartElement(null, "http://hspd12.gsa.gov/federated/enrollment", "transactionHeader", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTransactionHeader.serialize(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","transactionHeader"),
                                        xmlWriter);
                                    }
                                } if (localPersonIdentifierTracker){
                                    if (localPersonIdentifier==null){

                                        writeStartElement(null, "http://hspd12.gsa.gov/federated/enrollment", "personIdentifier", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPersonIdentifier.serialize(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","personIdentifier"),
                                        xmlWriter);
                                    }
                                } if (localTransactionStatusTracker){
                                    if (localTransactionStatus==null){

                                        writeStartElement(null, "http://hspd12.gsa.gov/federated/enrollment", "transactionStatus", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTransactionStatus.serialize(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","transactionStatus"),
                                        xmlWriter);
                                    }
                                } if (localPersonalInformationTracker){
                                    if (localPersonalInformation==null){

                                        writeStartElement(null, "http://hspd12.gsa.gov/federated/enrollment", "personalInformation", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPersonalInformation.serialize(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","personalInformation"),
                                        xmlWriter);
                                    }
                                } if (localSponsorshipInformationTracker){
                                    if (localSponsorshipInformation==null){

                                        writeStartElement(null, "http://hspd12.gsa.gov/federated/enrollment", "sponsorshipInformation", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localSponsorshipInformation.serialize(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","sponsorshipInformation"),
                                        xmlWriter);
                                    }
                                } if (localEnrollmentInformationTracker){
                                    if (localEnrollmentInformation==null){

                                        writeStartElement(null, "http://hspd12.gsa.gov/federated/enrollment", "enrollmentInformation", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localEnrollmentInformation.serialize(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","enrollmentInformation"),
                                        xmlWriter);
                                    }
                                } if (localFingerprintInformationTracker){
                                    if (localFingerprintInformation==null){

                                        writeStartElement(null, "http://hspd12.gsa.gov/federated/enrollment", "fingerprintInformation", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localFingerprintInformation.serialize(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","fingerprintInformation"),
                                        xmlWriter);
                                    }
                                } if (localAdjudicationInformationTracker){
                                    if (localAdjudicationInformation==null){

                                        writeStartElement(null, "http://hspd12.gsa.gov/federated/enrollment", "adjudicationInformation", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAdjudicationInformation.serialize(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","adjudicationInformation"),
                                        xmlWriter);
                                    }
                                } if (localStatusInformationTracker){
                                    if (localStatusInformation==null){

                                        writeStartElement(null, "http://hspd12.gsa.gov/federated/enrollment", "statusInformation", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localStatusInformation.serialize(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","statusInformation"),
                                        xmlWriter);
                                    }
                                } if (localPriorCredentialInformationTracker){
                                    if (localPriorCredentialInformation==null){

                                        writeStartElement(null, "http://hspd12.gsa.gov/federated/enrollment", "priorCredentialInformation", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPriorCredentialInformation.serialize(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","priorCredentialInformation"),
                                        xmlWriter);
                                    }
                                } if (localReplacementCredentialInformationTracker){
                                    if (localReplacementCredentialInformation==null){

                                        writeStartElement(null, "http://hspd12.gsa.gov/federated/enrollment", "replacementCredentialInformation", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localReplacementCredentialInformation.serialize(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","replacementCredentialInformation"),
                                        xmlWriter);
                                    }
                                } if (localCurrentCredentialInformationTracker){
                                    if (localCurrentCredentialInformation==null){

                                        writeStartElement(null, "http://hspd12.gsa.gov/federated/enrollment", "currentCredentialInformation", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCurrentCredentialInformation.serialize(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","currentCredentialInformation"),
                                        xmlWriter);
                                    }
                                } if (localPhotographInformationTracker){
                                    if (localPhotographInformation==null){

                                        writeStartElement(null, "http://hspd12.gsa.gov/federated/enrollment", "photographInformation", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPhotographInformation.serialize(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","photographInformation"),
                                        xmlWriter);
                                    }
                                } if (localPriorTempCredentialInformationTracker){
                                    if (localPriorTempCredentialInformation==null){

                                        writeStartElement(null, "http://hspd12.gsa.gov/federated/enrollment", "priorTempCredentialInformation", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localPriorTempCredentialInformation.serialize(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","priorTempCredentialInformation"),
                                        xmlWriter);
                                    }
                                } if (localCurrentTempCredentialInformationTracker){
                                    if (localCurrentTempCredentialInformation==null){

                                        writeStartElement(null, "http://hspd12.gsa.gov/federated/enrollment", "currentTempCredentialInformation", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localCurrentTempCredentialInformation.serialize(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","currentTempCredentialInformation"),
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

                 if (localTransactionHeaderTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "transactionHeader"));
                            
                            
                                    elementList.add(localTransactionHeader==null?null:
                                    localTransactionHeader);
                                } if (localPersonIdentifierTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "personIdentifier"));
                            
                            
                                    elementList.add(localPersonIdentifier==null?null:
                                    localPersonIdentifier);
                                } if (localTransactionStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "transactionStatus"));
                            
                            
                                    elementList.add(localTransactionStatus==null?null:
                                    localTransactionStatus);
                                } if (localPersonalInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "personalInformation"));
                            
                            
                                    elementList.add(localPersonalInformation==null?null:
                                    localPersonalInformation);
                                } if (localSponsorshipInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "sponsorshipInformation"));
                            
                            
                                    elementList.add(localSponsorshipInformation==null?null:
                                    localSponsorshipInformation);
                                } if (localEnrollmentInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "enrollmentInformation"));
                            
                            
                                    elementList.add(localEnrollmentInformation==null?null:
                                    localEnrollmentInformation);
                                } if (localFingerprintInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "fingerprintInformation"));
                            
                            
                                    elementList.add(localFingerprintInformation==null?null:
                                    localFingerprintInformation);
                                } if (localAdjudicationInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "adjudicationInformation"));
                            
                            
                                    elementList.add(localAdjudicationInformation==null?null:
                                    localAdjudicationInformation);
                                } if (localStatusInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "statusInformation"));
                            
                            
                                    elementList.add(localStatusInformation==null?null:
                                    localStatusInformation);
                                } if (localPriorCredentialInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "priorCredentialInformation"));
                            
                            
                                    elementList.add(localPriorCredentialInformation==null?null:
                                    localPriorCredentialInformation);
                                } if (localReplacementCredentialInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "replacementCredentialInformation"));
                            
                            
                                    elementList.add(localReplacementCredentialInformation==null?null:
                                    localReplacementCredentialInformation);
                                } if (localCurrentCredentialInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "currentCredentialInformation"));
                            
                            
                                    elementList.add(localCurrentCredentialInformation==null?null:
                                    localCurrentCredentialInformation);
                                } if (localPhotographInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "photographInformation"));
                            
                            
                                    elementList.add(localPhotographInformation==null?null:
                                    localPhotographInformation);
                                } if (localPriorTempCredentialInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "priorTempCredentialInformation"));
                            
                            
                                    elementList.add(localPriorTempCredentialInformation==null?null:
                                    localPriorTempCredentialInformation);
                                } if (localCurrentTempCredentialInformationTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "currentTempCredentialInformation"));
                            
                            
                                    elementList.add(localCurrentTempCredentialInformation==null?null:
                                    localCurrentTempCredentialInformation);
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
        public static QuerySIPResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            QuerySIPResponse object =
                new QuerySIPResponse();

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
                    
                            if (!"QuerySIPResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (QuerySIPResponse)gov.gsa.hspd12.federated.enrollment.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","transactionHeader").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTransactionHeader(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTransactionHeader(gov.gsa.hspd12.federated.enrollment.TransactionHeader.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","personIdentifier").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPersonIdentifier(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPersonIdentifier(gov.gsa.hspd12.federated.enrollment.PersonIdentifier.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","transactionStatus").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTransactionStatus(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTransactionStatus(gov.gsa.hspd12.federated.enrollment.TransactionStatus.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","personalInformation").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPersonalInformation(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPersonalInformation(gov.gsa.hspd12.federated.enrollment.PersonalInformation.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","sponsorshipInformation").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setSponsorshipInformation(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setSponsorshipInformation(gov.gsa.hspd12.federated.enrollment.SponsorshipInformation.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","enrollmentInformation").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setEnrollmentInformation(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setEnrollmentInformation(gov.gsa.hspd12.federated.enrollment.EnrollmentInformation.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","fingerprintInformation").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setFingerprintInformation(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setFingerprintInformation(gov.gsa.hspd12.federated.enrollment.FingerprintInformation.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","adjudicationInformation").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAdjudicationInformation(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAdjudicationInformation(gov.gsa.hspd12.federated.enrollment.AdjudicationInformation.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","statusInformation").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setStatusInformation(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setStatusInformation(gov.gsa.hspd12.federated.enrollment.StatusInformation.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","priorCredentialInformation").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPriorCredentialInformation(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPriorCredentialInformation(gov.gsa.hspd12.federated.enrollment.ArrayOfCredentialInformation.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","replacementCredentialInformation").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setReplacementCredentialInformation(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setReplacementCredentialInformation(gov.gsa.hspd12.federated.enrollment.CredentialInformation.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","currentCredentialInformation").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCurrentCredentialInformation(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCurrentCredentialInformation(gov.gsa.hspd12.federated.enrollment.CredentialInformation.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","photographInformation").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPhotographInformation(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPhotographInformation(gov.gsa.hspd12.federated.enrollment.PhotographInformation.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","priorTempCredentialInformation").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setPriorTempCredentialInformation(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setPriorTempCredentialInformation(gov.gsa.hspd12.federated.enrollment.ArrayOfTempCredentialInformation.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","currentTempCredentialInformation").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setCurrentTempCredentialInformation(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setCurrentTempCredentialInformation(gov.gsa.hspd12.federated.enrollment.TempCredentialInformation.Factory.parse(reader));
                                              
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
           
    
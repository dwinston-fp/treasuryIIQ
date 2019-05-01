
/**
 * CredentialInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */

            
                package gov.gsa.hspd12.federated.enrollment;
            

            /**
            *  CredentialInformation bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class CredentialInformation
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = CredentialInformation
                Namespace URI = http://hspd12.gsa.gov/federated/enrollment
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for CardAuthenticationCertificate
                        */

                        
                                    protected javax.activation.DataHandler localCardAuthenticationCertificate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCardAuthenticationCertificateTracker = false ;

                           public boolean isCardAuthenticationCertificateSpecified(){
                               return localCardAuthenticationCertificateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return javax.activation.DataHandler
                           */
                           public  javax.activation.DataHandler getCardAuthenticationCertificate(){
                               return localCardAuthenticationCertificate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CardAuthenticationCertificate
                               */
                               public void setCardAuthenticationCertificate(javax.activation.DataHandler param){
                            localCardAuthenticationCertificateTracker = true;
                                   
                                            this.localCardAuthenticationCertificate=param;
                                    

                               }
                            

                        /**
                        * field for CardExpiryDate
                        */

                        
                                    protected java.util.Calendar localCardExpiryDate ;
                                
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
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getCardExpiryDate(){
                               return localCardExpiryDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CardExpiryDate
                               */
                               public void setCardExpiryDate(java.util.Calendar param){
                            localCardExpiryDateTracker = param != null;
                                   
                                            this.localCardExpiryDate=param;
                                    

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
                            localCardSerialNumberTracker = true;
                                   
                                            this.localCardSerialNumber=param;
                                    

                               }
                            

                        /**
                        * field for CardStatus
                        */

                        
                                    protected java.lang.String localCardStatus ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCardStatusTracker = false ;

                           public boolean isCardStatusSpecified(){
                               return localCardStatusTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCardStatus(){
                               return localCardStatus;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CardStatus
                               */
                               public void setCardStatus(java.lang.String param){
                            localCardStatusTracker = true;
                                   
                                            this.localCardStatus=param;
                                    

                               }
                            

                        /**
                        * field for CardUuid
                        */

                        
                                    protected java.lang.String localCardUuid ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCardUuidTracker = false ;

                           public boolean isCardUuidSpecified(){
                               return localCardUuidTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCardUuid(){
                               return localCardUuid;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CardUuid
                               */
                               public void setCardUuid(java.lang.String param){
                            localCardUuidTracker = true;
                                   
                                            this.localCardUuid=param;
                                    

                               }
                            

                        /**
                        * field for CertificateExpiryDate
                        */

                        
                                    protected java.util.Calendar localCertificateExpiryDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCertificateExpiryDateTracker = false ;

                           public boolean isCertificateExpiryDateSpecified(){
                               return localCertificateExpiryDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getCertificateExpiryDate(){
                               return localCertificateExpiryDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CertificateExpiryDate
                               */
                               public void setCertificateExpiryDate(java.util.Calendar param){
                            localCertificateExpiryDateTracker = param != null;
                                   
                                            this.localCertificateExpiryDate=param;
                                    

                               }
                            

                        /**
                        * field for Chuid
                        */

                        
                                    protected javax.activation.DataHandler localChuid ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChuidTracker = false ;

                           public boolean isChuidSpecified(){
                               return localChuidTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return javax.activation.DataHandler
                           */
                           public  javax.activation.DataHandler getChuid(){
                               return localChuid;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Chuid
                               */
                               public void setChuid(javax.activation.DataHandler param){
                            localChuidTracker = true;
                                   
                                            this.localChuid=param;
                                    

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
                            localChuidStatusTracker = true;
                                   
                                            this.localChuidStatus=param;
                                    

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
                        * field for DigitalSignatureCertificate
                        */

                        
                                    protected javax.activation.DataHandler localDigitalSignatureCertificate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDigitalSignatureCertificateTracker = false ;

                           public boolean isDigitalSignatureCertificateSpecified(){
                               return localDigitalSignatureCertificateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return javax.activation.DataHandler
                           */
                           public  javax.activation.DataHandler getDigitalSignatureCertificate(){
                               return localDigitalSignatureCertificate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DigitalSignatureCertificate
                               */
                               public void setDigitalSignatureCertificate(javax.activation.DataHandler param){
                            localDigitalSignatureCertificateTracker = true;
                                   
                                            this.localDigitalSignatureCertificate=param;
                                    

                               }
                            

                        /**
                        * field for EncryptionCertificate
                        */

                        
                                    protected javax.activation.DataHandler localEncryptionCertificate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEncryptionCertificateTracker = false ;

                           public boolean isEncryptionCertificateSpecified(){
                               return localEncryptionCertificateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return javax.activation.DataHandler
                           */
                           public  javax.activation.DataHandler getEncryptionCertificate(){
                               return localEncryptionCertificate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param EncryptionCertificate
                               */
                               public void setEncryptionCertificate(javax.activation.DataHandler param){
                            localEncryptionCertificateTracker = true;
                                   
                                            this.localEncryptionCertificate=param;
                                    

                               }
                            

                        /**
                        * field for Fascn
                        */

                        
                                    protected javax.activation.DataHandler localFascn ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFascnTracker = false ;

                           public boolean isFascnSpecified(){
                               return localFascnTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return javax.activation.DataHandler
                           */
                           public  javax.activation.DataHandler getFascn(){
                               return localFascn;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Fascn
                               */
                               public void setFascn(javax.activation.DataHandler param){
                            localFascnTracker = true;
                                   
                                            this.localFascn=param;
                                    

                               }
                            

                        /**
                        * field for FascnDecoded
                        */

                        
                                    protected java.lang.String localFascnDecoded ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFascnDecodedTracker = false ;

                           public boolean isFascnDecodedSpecified(){
                               return localFascnDecodedTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFascnDecoded(){
                               return localFascnDecoded;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FascnDecoded
                               */
                               public void setFascnDecoded(java.lang.String param){
                            localFascnDecodedTracker = true;
                                   
                                            this.localFascnDecoded=param;
                                    

                               }
                            

                        /**
                        * field for IssuanceID
                        */

                        
                                    protected long localIssuanceID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIssuanceIDTracker = false ;

                           public boolean isIssuanceIDSpecified(){
                               return localIssuanceIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getIssuanceID(){
                               return localIssuanceID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IssuanceID
                               */
                               public void setIssuanceID(long param){
                            
                                       // setting primitive attribute tracker to true
                                       localIssuanceIDTracker =
                                       param != java.lang.Long.MIN_VALUE;
                                   
                                            this.localIssuanceID=param;
                                    

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
                        * field for PivAuthenticationCertificate
                        */

                        
                                    protected javax.activation.DataHandler localPivAuthenticationCertificate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPivAuthenticationCertificateTracker = false ;

                           public boolean isPivAuthenticationCertificateSpecified(){
                               return localPivAuthenticationCertificateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return javax.activation.DataHandler
                           */
                           public  javax.activation.DataHandler getPivAuthenticationCertificate(){
                               return localPivAuthenticationCertificate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PivAuthenticationCertificate
                               */
                               public void setPivAuthenticationCertificate(javax.activation.DataHandler param){
                            localPivAuthenticationCertificateTracker = true;
                                   
                                            this.localPivAuthenticationCertificate=param;
                                    

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
                           namespacePrefix+":CredentialInformation",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "CredentialInformation",
                           xmlWriter);
                   }

               
                   }
                if (localCardAuthenticationCertificateTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "CardAuthenticationCertificate", xmlWriter);
                             
                                        
                                    if (localCardAuthenticationCertificate!=null)  {
                                       try {
                                           org.apache.axiom.util.stax.XMLStreamWriterUtils.writeDataHandler(xmlWriter, localCardAuthenticationCertificate, null, true);
                                       } catch (java.io.IOException ex) {
                                           throw new javax.xml.stream.XMLStreamException("Unable to read data handler for CardAuthenticationCertificate", ex);
                                       }
                                    } else {
                                         
                                             writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                         
                                    }
                                 
                                   xmlWriter.writeEndElement();
                             } if (localCardExpiryDateTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "CardExpiryDate", xmlWriter);
                             

                                          if (localCardExpiryDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CardExpiryDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardExpiryDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCardSerialNumberTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "CardSerialNumber", xmlWriter);
                             

                                          if (localCardSerialNumber==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCardSerialNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCardStatusTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "CardStatus", xmlWriter);
                             

                                          if (localCardStatus==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCardStatus);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCardUuidTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "CardUuid", xmlWriter);
                             

                                          if (localCardUuid==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCardUuid);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCertificateExpiryDateTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "CertificateExpiryDate", xmlWriter);
                             

                                          if (localCertificateExpiryDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CertificateExpiryDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCertificateExpiryDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localChuidTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "Chuid", xmlWriter);
                             
                                        
                                    if (localChuid!=null)  {
                                       try {
                                           org.apache.axiom.util.stax.XMLStreamWriterUtils.writeDataHandler(xmlWriter, localChuid, null, true);
                                       } catch (java.io.IOException ex) {
                                           throw new javax.xml.stream.XMLStreamException("Unable to read data handler for Chuid", ex);
                                       }
                                    } else {
                                         
                                             writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                         
                                    }
                                 
                                   xmlWriter.writeEndElement();
                             } if (localChuidStatusTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "ChuidStatus", xmlWriter);
                             

                                          if (localChuidStatus==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localChuidStatus);
                                            
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
                             } if (localDigitalSignatureCertificateTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "DigitalSignatureCertificate", xmlWriter);
                             
                                        
                                    if (localDigitalSignatureCertificate!=null)  {
                                       try {
                                           org.apache.axiom.util.stax.XMLStreamWriterUtils.writeDataHandler(xmlWriter, localDigitalSignatureCertificate, null, true);
                                       } catch (java.io.IOException ex) {
                                           throw new javax.xml.stream.XMLStreamException("Unable to read data handler for DigitalSignatureCertificate", ex);
                                       }
                                    } else {
                                         
                                             writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                         
                                    }
                                 
                                   xmlWriter.writeEndElement();
                             } if (localEncryptionCertificateTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "EncryptionCertificate", xmlWriter);
                             
                                        
                                    if (localEncryptionCertificate!=null)  {
                                       try {
                                           org.apache.axiom.util.stax.XMLStreamWriterUtils.writeDataHandler(xmlWriter, localEncryptionCertificate, null, true);
                                       } catch (java.io.IOException ex) {
                                           throw new javax.xml.stream.XMLStreamException("Unable to read data handler for EncryptionCertificate", ex);
                                       }
                                    } else {
                                         
                                             writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                         
                                    }
                                 
                                   xmlWriter.writeEndElement();
                             } if (localFascnTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "Fascn", xmlWriter);
                             
                                        
                                    if (localFascn!=null)  {
                                       try {
                                           org.apache.axiom.util.stax.XMLStreamWriterUtils.writeDataHandler(xmlWriter, localFascn, null, true);
                                       } catch (java.io.IOException ex) {
                                           throw new javax.xml.stream.XMLStreamException("Unable to read data handler for Fascn", ex);
                                       }
                                    } else {
                                         
                                             writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                         
                                    }
                                 
                                   xmlWriter.writeEndElement();
                             } if (localFascnDecodedTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "FascnDecoded", xmlWriter);
                             

                                          if (localFascnDecoded==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFascnDecoded);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIssuanceIDTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "IssuanceID", xmlWriter);
                             
                                               if (localIssuanceID==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("IssuanceID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIssuanceID));
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
                             } if (localPivAuthenticationCertificateTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "PivAuthenticationCertificate", xmlWriter);
                             
                                        
                                    if (localPivAuthenticationCertificate!=null)  {
                                       try {
                                           org.apache.axiom.util.stax.XMLStreamWriterUtils.writeDataHandler(xmlWriter, localPivAuthenticationCertificate, null, true);
                                       } catch (java.io.IOException ex) {
                                           throw new javax.xml.stream.XMLStreamException("Unable to read data handler for PivAuthenticationCertificate", ex);
                                       }
                                    } else {
                                         
                                             writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                         
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

                 if (localCardAuthenticationCertificateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                        "CardAuthenticationCertificate"));
                                
                            elementList.add(localCardAuthenticationCertificate);
                        } if (localCardExpiryDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "CardExpiryDate"));
                                 
                                        if (localCardExpiryDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardExpiryDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CardExpiryDate cannot be null!!");
                                        }
                                    } if (localCardSerialNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "CardSerialNumber"));
                                 
                                         elementList.add(localCardSerialNumber==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardSerialNumber));
                                    } if (localCardStatusTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "CardStatus"));
                                 
                                         elementList.add(localCardStatus==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardStatus));
                                    } if (localCardUuidTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "CardUuid"));
                                 
                                         elementList.add(localCardUuid==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCardUuid));
                                    } if (localCertificateExpiryDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "CertificateExpiryDate"));
                                 
                                        if (localCertificateExpiryDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCertificateExpiryDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CertificateExpiryDate cannot be null!!");
                                        }
                                    } if (localChuidTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                        "Chuid"));
                                
                            elementList.add(localChuid);
                        } if (localChuidStatusTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "ChuidStatus"));
                                 
                                         elementList.add(localChuidStatus==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChuidStatus));
                                    } if (localCredentialOptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "CredentialOption"));
                                 
                                         elementList.add(localCredentialOption==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCredentialOption));
                                    } if (localDigitalSignatureCertificateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                        "DigitalSignatureCertificate"));
                                
                            elementList.add(localDigitalSignatureCertificate);
                        } if (localEncryptionCertificateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                        "EncryptionCertificate"));
                                
                            elementList.add(localEncryptionCertificate);
                        } if (localFascnTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                        "Fascn"));
                                
                            elementList.add(localFascn);
                        } if (localFascnDecodedTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "FascnDecoded"));
                                 
                                         elementList.add(localFascnDecoded==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFascnDecoded));
                                    } if (localIssuanceIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "IssuanceID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIssuanceID));
                            } if (localPIVCardTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "PIVCardType"));
                                 
                                         elementList.add(localPIVCardType==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPIVCardType));
                                    } if (localPivAuthenticationCertificateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                        "PivAuthenticationCertificate"));
                                
                            elementList.add(localPivAuthenticationCertificate);
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
        public static CredentialInformation parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            CredentialInformation object =
                new CredentialInformation();

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
                    
                            if (!"CredentialInformation".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (CredentialInformation)gov.gsa.hspd12.federated.enrollment.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","CardAuthenticationCertificate").equals(reader.getName())){
                                
                                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                        if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                             object.setCardAuthenticationCertificate(null);
                                             reader.next();
                                        } else {
                                    
                                            object.setCardAuthenticationCertificate(org.apache.axiom.util.stax.XMLStreamReaderUtils.getDataHandlerFromElement(reader));
                                    
                                        }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","CardExpiryDate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCardExpiryDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","CardSerialNumber").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCardSerialNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","CardStatus").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCardStatus(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","CardUuid").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCardUuid(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","CertificateExpiryDate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCertificateExpiryDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","Chuid").equals(reader.getName())){
                                
                                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                        if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                             object.setChuid(null);
                                             reader.next();
                                        } else {
                                    
                                            object.setChuid(org.apache.axiom.util.stax.XMLStreamReaderUtils.getDataHandlerFromElement(reader));
                                    
                                        }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","ChuidStatus").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setChuidStatus(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","DigitalSignatureCertificate").equals(reader.getName())){
                                
                                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                        if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                             object.setDigitalSignatureCertificate(null);
                                             reader.next();
                                        } else {
                                    
                                            object.setDigitalSignatureCertificate(org.apache.axiom.util.stax.XMLStreamReaderUtils.getDataHandlerFromElement(reader));
                                    
                                        }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","EncryptionCertificate").equals(reader.getName())){
                                
                                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                        if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                             object.setEncryptionCertificate(null);
                                             reader.next();
                                        } else {
                                    
                                            object.setEncryptionCertificate(org.apache.axiom.util.stax.XMLStreamReaderUtils.getDataHandlerFromElement(reader));
                                    
                                        }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","Fascn").equals(reader.getName())){
                                
                                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                        if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                             object.setFascn(null);
                                             reader.next();
                                        } else {
                                    
                                            object.setFascn(org.apache.axiom.util.stax.XMLStreamReaderUtils.getDataHandlerFromElement(reader));
                                    
                                        }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","FascnDecoded").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFascnDecoded(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","IssuanceID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIssuanceID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setIssuanceID(java.lang.Long.MIN_VALUE);
                                           
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","PivAuthenticationCertificate").equals(reader.getName())){
                                
                                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                        if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                             object.setPivAuthenticationCertificate(null);
                                             reader.next();
                                        } else {
                                    
                                            object.setPivAuthenticationCertificate(org.apache.axiom.util.stax.XMLStreamReaderUtils.getDataHandlerFromElement(reader));
                                    
                                        }
                                      
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
           
    
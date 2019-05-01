
/**
 * AdjudicationInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */

            
                package gov.gsa.hspd12.federated.enrollment;
            

            /**
            *  AdjudicationInformation bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class AdjudicationInformation
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = AdjudicationInformation
                Namespace URI = http://hspd12.gsa.gov/federated/enrollment
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for NACAdjudicatorPersonID
                        */

                        
                                    protected java.lang.String localNACAdjudicatorPersonID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNACAdjudicatorPersonIDTracker = false ;

                           public boolean isNACAdjudicatorPersonIDSpecified(){
                               return localNACAdjudicatorPersonIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNACAdjudicatorPersonID(){
                               return localNACAdjudicatorPersonID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NACAdjudicatorPersonID
                               */
                               public void setNACAdjudicatorPersonID(java.lang.String param){
                            localNACAdjudicatorPersonIDTracker = true;
                                   
                                            this.localNACAdjudicatorPersonID=param;
                                    

                               }
                            

                        /**
                        * field for NACAdjudicationValue
                        */

                        
                                    protected java.lang.String localNACAdjudicationValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNACAdjudicationValueTracker = false ;

                           public boolean isNACAdjudicationValueSpecified(){
                               return localNACAdjudicationValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNACAdjudicationValue(){
                               return localNACAdjudicationValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NACAdjudicationValue
                               */
                               public void setNACAdjudicationValue(java.lang.String param){
                            localNACAdjudicationValueTracker = true;
                                   
                                            this.localNACAdjudicationValue=param;
                                    

                               }
                            

                        /**
                        * field for NACAdjudicationEffDate
                        */

                        
                                    protected java.util.Calendar localNACAdjudicationEffDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNACAdjudicationEffDateTracker = false ;

                           public boolean isNACAdjudicationEffDateSpecified(){
                               return localNACAdjudicationEffDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getNACAdjudicationEffDate(){
                               return localNACAdjudicationEffDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NACAdjudicationEffDate
                               */
                               public void setNACAdjudicationEffDate(java.util.Calendar param){
                            localNACAdjudicationEffDateTracker = param != null;
                                   
                                            this.localNACAdjudicationEffDate=param;
                                    

                               }
                            

                        /**
                        * field for NACIAdjudicatorPersonID
                        */

                        
                                    protected java.lang.String localNACIAdjudicatorPersonID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNACIAdjudicatorPersonIDTracker = false ;

                           public boolean isNACIAdjudicatorPersonIDSpecified(){
                               return localNACIAdjudicatorPersonIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNACIAdjudicatorPersonID(){
                               return localNACIAdjudicatorPersonID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NACIAdjudicatorPersonID
                               */
                               public void setNACIAdjudicatorPersonID(java.lang.String param){
                            localNACIAdjudicatorPersonIDTracker = true;
                                   
                                            this.localNACIAdjudicatorPersonID=param;
                                    

                               }
                            

                        /**
                        * field for NACIAdjudicationValue
                        */

                        
                                    protected java.lang.String localNACIAdjudicationValue ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNACIAdjudicationValueTracker = false ;

                           public boolean isNACIAdjudicationValueSpecified(){
                               return localNACIAdjudicationValueTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNACIAdjudicationValue(){
                               return localNACIAdjudicationValue;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NACIAdjudicationValue
                               */
                               public void setNACIAdjudicationValue(java.lang.String param){
                            localNACIAdjudicationValueTracker = true;
                                   
                                            this.localNACIAdjudicationValue=param;
                                    

                               }
                            

                        /**
                        * field for NACIAdjudicationEffDate
                        */

                        
                                    protected java.util.Calendar localNACIAdjudicationEffDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNACIAdjudicationEffDateTracker = false ;

                           public boolean isNACIAdjudicationEffDateSpecified(){
                               return localNACIAdjudicationEffDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getNACIAdjudicationEffDate(){
                               return localNACIAdjudicationEffDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NACIAdjudicationEffDate
                               */
                               public void setNACIAdjudicationEffDate(java.util.Calendar param){
                            localNACIAdjudicationEffDateTracker = param != null;
                                   
                                            this.localNACIAdjudicationEffDate=param;
                                    

                               }
                            

                        /**
                        * field for AdjudicationNote
                        */

                        
                                    protected java.lang.String localAdjudicationNote ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAdjudicationNoteTracker = false ;

                           public boolean isAdjudicationNoteSpecified(){
                               return localAdjudicationNoteTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAdjudicationNote(){
                               return localAdjudicationNote;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AdjudicationNote
                               */
                               public void setAdjudicationNote(java.lang.String param){
                            localAdjudicationNoteTracker = true;
                                   
                                            this.localAdjudicationNote=param;
                                    

                               }
                            

                        /**
                        * field for SOI
                        */

                        
                                    protected java.lang.String localSOI ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSOITracker = false ;

                           public boolean isSOISpecified(){
                               return localSOITracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSOI(){
                               return localSOI;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SOI
                               */
                               public void setSOI(java.lang.String param){
                            localSOITracker = true;
                                   
                                            this.localSOI=param;
                                    

                               }
                            

                        /**
                        * field for SON
                        */

                        
                                    protected java.lang.String localSON ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSONTracker = false ;

                           public boolean isSONSpecified(){
                               return localSONTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSON(){
                               return localSON;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SON
                               */
                               public void setSON(java.lang.String param){
                            localSONTracker = true;
                                   
                                            this.localSON=param;
                                    

                               }
                            

                        /**
                        * field for OPAC
                        */

                        
                                    protected java.lang.String localOPAC ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOPACTracker = false ;

                           public boolean isOPACSpecified(){
                               return localOPACTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOPAC(){
                               return localOPAC;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OPAC
                               */
                               public void setOPAC(java.lang.String param){
                            localOPACTracker = true;
                                   
                                            this.localOPAC=param;
                                    

                               }
                            

                        /**
                        * field for TransactionTypeCode
                        */

                        
                                    protected java.lang.String localTransactionTypeCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransactionTypeCodeTracker = false ;

                           public boolean isTransactionTypeCodeSpecified(){
                               return localTransactionTypeCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTransactionTypeCode(){
                               return localTransactionTypeCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransactionTypeCode
                               */
                               public void setTransactionTypeCode(java.lang.String param){
                            localTransactionTypeCodeTracker = true;
                                   
                                            this.localTransactionTypeCode=param;
                                    

                               }
                            

                        /**
                        * field for CaseNumber
                        */

                        
                                    protected java.lang.String localCaseNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCaseNumberTracker = false ;

                           public boolean isCaseNumberSpecified(){
                               return localCaseNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCaseNumber(){
                               return localCaseNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CaseNumber
                               */
                               public void setCaseNumber(java.lang.String param){
                            localCaseNumberTracker = true;
                                   
                                            this.localCaseNumber=param;
                                    

                               }
                            

                        /**
                        * field for LastUpdatedByAgency
                        */

                        
                                    protected java.lang.String localLastUpdatedByAgency ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastUpdatedByAgencyTracker = false ;

                           public boolean isLastUpdatedByAgencySpecified(){
                               return localLastUpdatedByAgencyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getLastUpdatedByAgency(){
                               return localLastUpdatedByAgency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastUpdatedByAgency
                               */
                               public void setLastUpdatedByAgency(java.lang.String param){
                            localLastUpdatedByAgencyTracker = true;
                                   
                                            this.localLastUpdatedByAgency=param;
                                    

                               }
                            

                        /**
                        * field for LastUpdatedByAgencyDate
                        */

                        
                                    protected java.util.Calendar localLastUpdatedByAgencyDate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLastUpdatedByAgencyDateTracker = false ;

                           public boolean isLastUpdatedByAgencyDateSpecified(){
                               return localLastUpdatedByAgencyDateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getLastUpdatedByAgencyDate(){
                               return localLastUpdatedByAgencyDate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LastUpdatedByAgencyDate
                               */
                               public void setLastUpdatedByAgencyDate(java.util.Calendar param){
                            localLastUpdatedByAgencyDateTracker = param != null;
                                   
                                            this.localLastUpdatedByAgencyDate=param;
                                    

                               }
                            

                        /**
                        * field for AgencySpecificCriteria
                        */

                        
                                    protected gov.gsa.hspd12.federated.enrollment.AgencySpecificCriteria localAgencySpecificCriteria ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAgencySpecificCriteriaTracker = false ;

                           public boolean isAgencySpecificCriteriaSpecified(){
                               return localAgencySpecificCriteriaTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.gsa.hspd12.federated.enrollment.AgencySpecificCriteria
                           */
                           public  gov.gsa.hspd12.federated.enrollment.AgencySpecificCriteria getAgencySpecificCriteria(){
                               return localAgencySpecificCriteria;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AgencySpecificCriteria
                               */
                               public void setAgencySpecificCriteria(gov.gsa.hspd12.federated.enrollment.AgencySpecificCriteria param){
                            localAgencySpecificCriteriaTracker = true;
                                   
                                            this.localAgencySpecificCriteria=param;
                                    

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
                           namespacePrefix+":AdjudicationInformation",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "AdjudicationInformation",
                           xmlWriter);
                   }

               
                   }
                if (localNACAdjudicatorPersonIDTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "NACAdjudicatorPersonID", xmlWriter);
                             

                                          if (localNACAdjudicatorPersonID==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNACAdjudicatorPersonID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNACAdjudicationValueTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "NACAdjudicationValue", xmlWriter);
                             

                                          if (localNACAdjudicationValue==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNACAdjudicationValue);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNACAdjudicationEffDateTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "NACAdjudicationEffDate", xmlWriter);
                             

                                          if (localNACAdjudicationEffDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("NACAdjudicationEffDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNACAdjudicationEffDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNACIAdjudicatorPersonIDTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "NACIAdjudicatorPersonID", xmlWriter);
                             

                                          if (localNACIAdjudicatorPersonID==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNACIAdjudicatorPersonID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNACIAdjudicationValueTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "NACIAdjudicationValue", xmlWriter);
                             

                                          if (localNACIAdjudicationValue==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNACIAdjudicationValue);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localNACIAdjudicationEffDateTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "NACIAdjudicationEffDate", xmlWriter);
                             

                                          if (localNACIAdjudicationEffDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("NACIAdjudicationEffDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNACIAdjudicationEffDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAdjudicationNoteTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "AdjudicationNote", xmlWriter);
                             

                                          if (localAdjudicationNote==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAdjudicationNote);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSOITracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "SOI", xmlWriter);
                             

                                          if (localSOI==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSOI);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSONTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "SON", xmlWriter);
                             

                                          if (localSON==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSON);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOPACTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "OPAC", xmlWriter);
                             

                                          if (localOPAC==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOPAC);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransactionTypeCodeTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "TransactionTypeCode", xmlWriter);
                             

                                          if (localTransactionTypeCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTransactionTypeCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCaseNumberTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "CaseNumber", xmlWriter);
                             

                                          if (localCaseNumber==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCaseNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLastUpdatedByAgencyTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "LastUpdatedByAgency", xmlWriter);
                             

                                          if (localLastUpdatedByAgency==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localLastUpdatedByAgency);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localLastUpdatedByAgencyDateTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "LastUpdatedByAgencyDate", xmlWriter);
                             

                                          if (localLastUpdatedByAgencyDate==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("LastUpdatedByAgencyDate cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastUpdatedByAgencyDate));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAgencySpecificCriteriaTracker){
                                    if (localAgencySpecificCriteria==null){

                                        writeStartElement(null, "http://hspd12.gsa.gov/federated/enrollment", "AgencySpecificCriteria", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localAgencySpecificCriteria.serialize(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","AgencySpecificCriteria"),
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

                 if (localNACAdjudicatorPersonIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "NACAdjudicatorPersonID"));
                                 
                                         elementList.add(localNACAdjudicatorPersonID==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNACAdjudicatorPersonID));
                                    } if (localNACAdjudicationValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "NACAdjudicationValue"));
                                 
                                         elementList.add(localNACAdjudicationValue==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNACAdjudicationValue));
                                    } if (localNACAdjudicationEffDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "NACAdjudicationEffDate"));
                                 
                                        if (localNACAdjudicationEffDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNACAdjudicationEffDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("NACAdjudicationEffDate cannot be null!!");
                                        }
                                    } if (localNACIAdjudicatorPersonIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "NACIAdjudicatorPersonID"));
                                 
                                         elementList.add(localNACIAdjudicatorPersonID==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNACIAdjudicatorPersonID));
                                    } if (localNACIAdjudicationValueTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "NACIAdjudicationValue"));
                                 
                                         elementList.add(localNACIAdjudicationValue==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNACIAdjudicationValue));
                                    } if (localNACIAdjudicationEffDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "NACIAdjudicationEffDate"));
                                 
                                        if (localNACIAdjudicationEffDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNACIAdjudicationEffDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("NACIAdjudicationEffDate cannot be null!!");
                                        }
                                    } if (localAdjudicationNoteTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "AdjudicationNote"));
                                 
                                         elementList.add(localAdjudicationNote==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAdjudicationNote));
                                    } if (localSOITracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "SOI"));
                                 
                                         elementList.add(localSOI==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSOI));
                                    } if (localSONTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "SON"));
                                 
                                         elementList.add(localSON==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSON));
                                    } if (localOPACTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "OPAC"));
                                 
                                         elementList.add(localOPAC==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOPAC));
                                    } if (localTransactionTypeCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "TransactionTypeCode"));
                                 
                                         elementList.add(localTransactionTypeCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionTypeCode));
                                    } if (localCaseNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "CaseNumber"));
                                 
                                         elementList.add(localCaseNumber==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCaseNumber));
                                    } if (localLastUpdatedByAgencyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "LastUpdatedByAgency"));
                                 
                                         elementList.add(localLastUpdatedByAgency==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastUpdatedByAgency));
                                    } if (localLastUpdatedByAgencyDateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "LastUpdatedByAgencyDate"));
                                 
                                        if (localLastUpdatedByAgencyDate != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastUpdatedByAgencyDate));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("LastUpdatedByAgencyDate cannot be null!!");
                                        }
                                    } if (localAgencySpecificCriteriaTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "AgencySpecificCriteria"));
                            
                            
                                    elementList.add(localAgencySpecificCriteria==null?null:
                                    localAgencySpecificCriteria);
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
        public static AdjudicationInformation parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AdjudicationInformation object =
                new AdjudicationInformation();

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
                    
                            if (!"AdjudicationInformation".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AdjudicationInformation)gov.gsa.hspd12.federated.enrollment.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","NACAdjudicatorPersonID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNACAdjudicatorPersonID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","NACAdjudicationValue").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNACAdjudicationValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","NACAdjudicationEffDate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNACAdjudicationEffDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","NACIAdjudicatorPersonID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNACIAdjudicatorPersonID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","NACIAdjudicationValue").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNACIAdjudicationValue(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","NACIAdjudicationEffDate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNACIAdjudicationEffDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","AdjudicationNote").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAdjudicationNote(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","SOI").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSOI(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","SON").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSON(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","OPAC").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOPAC(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","TransactionTypeCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransactionTypeCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","CaseNumber").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCaseNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","LastUpdatedByAgency").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastUpdatedByAgency(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","LastUpdatedByAgencyDate").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLastUpdatedByAgencyDate(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","AgencySpecificCriteria").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setAgencySpecificCriteria(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setAgencySpecificCriteria(gov.gsa.hspd12.federated.enrollment.AgencySpecificCriteria.Factory.parse(reader));
                                              
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
           
    
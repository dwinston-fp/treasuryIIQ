
/**
 * FingerprintInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */

            
                package gov.gsa.hspd12.federated.enrollment;
            

            /**
            *  FingerprintInformation bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class FingerprintInformation
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = FingerprintInformation
                Namespace URI = http://hspd12.gsa.gov/federated/enrollment
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for FteReasonCode
                        */

                        
                                    protected java.lang.String localFteReasonCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFteReasonCodeTracker = false ;

                           public boolean isFteReasonCodeSpecified(){
                               return localFteReasonCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFteReasonCode(){
                               return localFteReasonCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FteReasonCode
                               */
                               public void setFteReasonCode(java.lang.String param){
                            localFteReasonCodeTracker = true;
                                   
                                            this.localFteReasonCode=param;
                                    

                               }
                            

                        /**
                        * field for PrimaryPrintIndicator
                        */

                        
                                    protected java.lang.String localPrimaryPrintIndicator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrimaryPrintIndicatorTracker = false ;

                           public boolean isPrimaryPrintIndicatorSpecified(){
                               return localPrimaryPrintIndicatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPrimaryPrintIndicator(){
                               return localPrimaryPrintIndicator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrimaryPrintIndicator
                               */
                               public void setPrimaryPrintIndicator(java.lang.String param){
                            localPrimaryPrintIndicatorTracker = true;
                                   
                                            this.localPrimaryPrintIndicator=param;
                                    

                               }
                            

                        /**
                        * field for SecondaryPrintIndicator
                        */

                        
                                    protected java.lang.String localSecondaryPrintIndicator ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSecondaryPrintIndicatorTracker = false ;

                           public boolean isSecondaryPrintIndicatorSpecified(){
                               return localSecondaryPrintIndicatorTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSecondaryPrintIndicator(){
                               return localSecondaryPrintIndicator;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SecondaryPrintIndicator
                               */
                               public void setSecondaryPrintIndicator(java.lang.String param){
                            localSecondaryPrintIndicatorTracker = true;
                                   
                                            this.localSecondaryPrintIndicator=param;
                                    

                               }
                            

                        /**
                        * field for FingerprintTemplate
                        */

                        
                                    protected javax.activation.DataHandler localFingerprintTemplate ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFingerprintTemplateTracker = false ;

                           public boolean isFingerprintTemplateSpecified(){
                               return localFingerprintTemplateTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return javax.activation.DataHandler
                           */
                           public  javax.activation.DataHandler getFingerprintTemplate(){
                               return localFingerprintTemplate;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FingerprintTemplate
                               */
                               public void setFingerprintTemplate(javax.activation.DataHandler param){
                            localFingerprintTemplateTracker = true;
                                   
                                            this.localFingerprintTemplate=param;
                                    

                               }
                            

                        /**
                        * field for NfiqScores
                        */

                        
                                    protected gov.gsa.hspd12.federated.enrollment.ArrayOfFingerprintScore localNfiqScores ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localNfiqScoresTracker = false ;

                           public boolean isNfiqScoresSpecified(){
                               return localNfiqScoresTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return gov.gsa.hspd12.federated.enrollment.ArrayOfFingerprintScore
                           */
                           public  gov.gsa.hspd12.federated.enrollment.ArrayOfFingerprintScore getNfiqScores(){
                               return localNfiqScores;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NfiqScores
                               */
                               public void setNfiqScores(gov.gsa.hspd12.federated.enrollment.ArrayOfFingerprintScore param){
                            localNfiqScoresTracker = true;
                                   
                                            this.localNfiqScores=param;
                                    

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
                           namespacePrefix+":FingerprintInformation",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "FingerprintInformation",
                           xmlWriter);
                   }

               
                   }
                if (localFteReasonCodeTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "FteReasonCode", xmlWriter);
                             

                                          if (localFteReasonCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFteReasonCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPrimaryPrintIndicatorTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "PrimaryPrintIndicator", xmlWriter);
                             

                                          if (localPrimaryPrintIndicator==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPrimaryPrintIndicator);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSecondaryPrintIndicatorTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "SecondaryPrintIndicator", xmlWriter);
                             

                                          if (localSecondaryPrintIndicator==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSecondaryPrintIndicator);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFingerprintTemplateTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "FingerprintTemplate", xmlWriter);
                             
                                        
                                    if (localFingerprintTemplate!=null)  {
                                       try {
                                           org.apache.axiom.util.stax.XMLStreamWriterUtils.writeDataHandler(xmlWriter, localFingerprintTemplate, null, true);
                                       } catch (java.io.IOException ex) {
                                           throw new javax.xml.stream.XMLStreamException("Unable to read data handler for FingerprintTemplate", ex);
                                       }
                                    } else {
                                         
                                             writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                         
                                    }
                                 
                                   xmlWriter.writeEndElement();
                             } if (localNfiqScoresTracker){
                                    if (localNfiqScores==null){

                                        writeStartElement(null, "http://hspd12.gsa.gov/federated/enrollment", "NfiqScores", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localNfiqScores.serialize(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","NfiqScores"),
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

                 if (localFteReasonCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "FteReasonCode"));
                                 
                                         elementList.add(localFteReasonCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFteReasonCode));
                                    } if (localPrimaryPrintIndicatorTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "PrimaryPrintIndicator"));
                                 
                                         elementList.add(localPrimaryPrintIndicator==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrimaryPrintIndicator));
                                    } if (localSecondaryPrintIndicatorTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "SecondaryPrintIndicator"));
                                 
                                         elementList.add(localSecondaryPrintIndicator==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecondaryPrintIndicator));
                                    } if (localFingerprintTemplateTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                        "FingerprintTemplate"));
                                
                            elementList.add(localFingerprintTemplate);
                        } if (localNfiqScoresTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "NfiqScores"));
                            
                            
                                    elementList.add(localNfiqScores==null?null:
                                    localNfiqScores);
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
        public static FingerprintInformation parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            FingerprintInformation object =
                new FingerprintInformation();

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
                    
                            if (!"FingerprintInformation".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (FingerprintInformation)gov.gsa.hspd12.federated.enrollment.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","FteReasonCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFteReasonCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","PrimaryPrintIndicator").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPrimaryPrintIndicator(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","SecondaryPrintIndicator").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSecondaryPrintIndicator(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","FingerprintTemplate").equals(reader.getName())){
                                
                                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                        if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                             object.setFingerprintTemplate(null);
                                             reader.next();
                                        } else {
                                    
                                            object.setFingerprintTemplate(org.apache.axiom.util.stax.XMLStreamReaderUtils.getDataHandlerFromElement(reader));
                                    
                                        }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","NfiqScores").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setNfiqScores(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setNfiqScores(gov.gsa.hspd12.federated.enrollment.ArrayOfFingerprintScore.Factory.parse(reader));
                                              
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
           
    
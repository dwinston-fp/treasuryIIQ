
/**
 * QueryApplicantExistsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */

            
                package gov.gsa.hspd12.federated.enrollment;
            

            /**
            *  QueryApplicantExistsResponse bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class QueryApplicantExistsResponse
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://hspd12.gsa.gov/federated/enrollment",
                "QueryApplicantExistsResponse",
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
                            localPersonIDTracker = true;
                                   
                                            this.localPersonID=param;
                                    

                               }
                            

                        /**
                        * field for Exists
                        */

                        
                                    protected java.lang.String localExists ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExistsTracker = false ;

                           public boolean isExistsSpecified(){
                               return localExistsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getExists(){
                               return localExists;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Exists
                               */
                               public void setExists(java.lang.String param){
                            localExistsTracker = true;
                                   
                                            this.localExists=param;
                                    

                               }
                            

                        /**
                        * field for ExistsInRequestingAgency
                        */

                        
                                    protected java.lang.String localExistsInRequestingAgency ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExistsInRequestingAgencyTracker = false ;

                           public boolean isExistsInRequestingAgencySpecified(){
                               return localExistsInRequestingAgencyTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getExistsInRequestingAgency(){
                               return localExistsInRequestingAgency;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExistsInRequestingAgency
                               */
                               public void setExistsInRequestingAgency(java.lang.String param){
                            localExistsInRequestingAgencyTracker = true;
                                   
                                            this.localExistsInRequestingAgency=param;
                                    

                               }
                            

                        /**
                        * field for IsEnrolled
                        */

                        
                                    protected java.lang.String localIsEnrolled ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIsEnrolledTracker = false ;

                           public boolean isIsEnrolledSpecified(){
                               return localIsEnrolledTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getIsEnrolled(){
                               return localIsEnrolled;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IsEnrolled
                               */
                               public void setIsEnrolled(java.lang.String param){
                            localIsEnrolledTracker = true;
                                   
                                            this.localIsEnrolled=param;
                                    

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
                           namespacePrefix+":QueryApplicantExistsResponse",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "QueryApplicantExistsResponse",
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
                                } if (localPersonIDTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "personID", xmlWriter);
                             

                                          if (localPersonID==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPersonID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localExistsTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "exists", xmlWriter);
                             

                                          if (localExists==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localExists);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localExistsInRequestingAgencyTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "existsInRequestingAgency", xmlWriter);
                             

                                          if (localExistsInRequestingAgency==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localExistsInRequestingAgency);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIsEnrolledTracker){
                                    namespace = "http://hspd12.gsa.gov/federated/enrollment";
                                    writeStartElement(null, namespace, "isEnrolled", xmlWriter);
                             

                                          if (localIsEnrolled==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIsEnrolled);
                                            
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

                 if (localTransactionHeaderTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "transactionHeader"));
                            
                            
                                    elementList.add(localTransactionHeader==null?null:
                                    localTransactionHeader);
                                } if (localTransactionStatusTracker){
                            elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "transactionStatus"));
                            
                            
                                    elementList.add(localTransactionStatus==null?null:
                                    localTransactionStatus);
                                } if (localPersonIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "personID"));
                                 
                                         elementList.add(localPersonID==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPersonID));
                                    } if (localExistsTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "exists"));
                                 
                                         elementList.add(localExists==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExists));
                                    } if (localExistsInRequestingAgencyTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "existsInRequestingAgency"));
                                 
                                         elementList.add(localExistsInRequestingAgency==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExistsInRequestingAgency));
                                    } if (localIsEnrolledTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                                      "isEnrolled"));
                                 
                                         elementList.add(localIsEnrolled==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsEnrolled));
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
        public static QueryApplicantExistsResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            QueryApplicantExistsResponse object =
                new QueryApplicantExistsResponse();

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
                    
                            if (!"QueryApplicantExistsResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (QueryApplicantExistsResponse)gov.gsa.hspd12.federated.enrollment.ExtensionMapper.getTypeObject(
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
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","personID").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPersonID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","exists").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setExists(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","existsInRequestingAgency").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setExistsInRequestingAgency(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment","isEnrolled").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIsEnrolled(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
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
           
    
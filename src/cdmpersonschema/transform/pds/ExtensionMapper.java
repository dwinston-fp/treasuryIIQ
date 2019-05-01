
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */

        
            package cdmpersonschema.transform.pds;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "hrc:pds:transform:CDMpersonschema".equals(namespaceURI) &&
                  "TrustInformationType".equals(typeName)){
                   
                            return  cdmpersonschema.transform.pds.TrustInformationType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "hrc:pds:transform:CDMpersonschema".equals(namespaceURI) &&
                  "ErrorInformationType".equals(typeName)){
                   
                            return  cdmpersonschema.transform.pds.ErrorInformationType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "hrc:pds:transform:CDMpersonschema".equals(namespaceURI) &&
                  "TrustType".equals(typeName)){
                   
                            return  cdmpersonschema.transform.pds.TrustType.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
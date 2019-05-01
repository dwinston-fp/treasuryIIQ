
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */

        
            package gov.gsa.hspd12.federated.enrollment;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "IssuanceValidationResult".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.IssuanceValidationResult.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "PersonalInformation".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.PersonalInformation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "TempCredentialInformation".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.TempCredentialInformation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "PersonIdentifier".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.PersonIdentifier.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://schemas.microsoft.com/2003/10/Serialization/".equals(namespaceURI) &&
                  "duration".equals(typeName)){
                   
                            return  com.microsoft.schemas._2003._10.serialization.Duration.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "ArrayOfTempCredentialInformation".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.ArrayOfTempCredentialInformation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.eds.com/AssuredIdentity/".equals(namespaceURI) &&
                  "ArrayOfRoleholderInformation".equals(typeName)){
                   
                            return  com.eds.www.assuredidentity.ArrayOfRoleholderInformation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "AliasInformation".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.AliasInformation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "ArrayOfAliasInformation".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.ArrayOfAliasInformation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "FingerprintScore".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.FingerprintScore.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "StatusInformation".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.StatusInformation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "ProcessStatus".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.ProcessStatus.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "ArrayOfProcessStatus".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.ArrayOfProcessStatus.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://schemas.microsoft.com/2003/10/Serialization/Arrays".equals(namespaceURI) &&
                  "ArrayOfstring".equals(typeName)){
                   
                            return  com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "CardActionInformation".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.CardActionInformation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "CredentialInformation".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.CredentialInformation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "CardActionReason".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.CardActionReason.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "PhotographInformation".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.PhotographInformation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "ArrayOfCredentialInformation".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.ArrayOfCredentialInformation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "TransactionStatus".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.TransactionStatus.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "AgencySpecificCriteria".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.AgencySpecificCriteria.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://schemas.microsoft.com/2003/10/Serialization/".equals(namespaceURI) &&
                  "char".equals(typeName)){
                   
                            return  com.microsoft.schemas._2003._10.serialization._char.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://schemas.microsoft.com/2003/10/Serialization/".equals(namespaceURI) &&
                  "guid".equals(typeName)){
                   
                            return  com.microsoft.schemas._2003._10.serialization.Guid.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "EftsRequestStatus".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.EftsRequestStatus.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "CardActionDataChange".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.CardActionDataChange.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "EnrollmentInformation".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.EnrollmentInformation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "SponsorshipInformation".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.SponsorshipInformation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.eds.com/AssuredIdentity/".equals(namespaceURI) &&
                  "RoleholderInformation".equals(typeName)){
                   
                            return  com.eds.www.assuredidentity.RoleholderInformation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "ArrayOfFingerprintScore".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.ArrayOfFingerprintScore.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "CreateUpdateOptions".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.CreateUpdateOptions.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "ArrayOfCardActionDataChange".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.ArrayOfCardActionDataChange.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "AdjudicationInformation".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.AdjudicationInformation.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "CredentialCheckInStatus".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.CredentialCheckInStatus.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "IssuanceValidationStatus".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.IssuanceValidationStatus.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "ArrayOfIssuanceValidationResult".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.ArrayOfIssuanceValidationResult.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "TransactionHeader".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.TransactionHeader.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "ArrayOfCardActionReason".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.ArrayOfCardActionReason.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://hspd12.gsa.gov/federated/enrollment".equals(namespaceURI) &&
                  "FingerprintInformation".equals(typeName)){
                   
                            return  gov.gsa.hspd12.federated.enrollment.FingerprintInformation.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
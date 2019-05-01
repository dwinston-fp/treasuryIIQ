
/**
 * AgencyServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
        package gov.gsa.hspd12.federated.enrollment;
        import org.apache.axiom.om.OMElement;  
        import org.apache.axiom.om.impl.builder.StAXOMBuilder; 
        

        /*
        *  AgencyServiceStub java implementation
        */

        
        public class AgencyServiceStub extends org.apache.axis2.client.Stub
        implements AgencyService{
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("AgencyService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[17];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment", "requestDNSync"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment", "queryCredentialStatus"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment", "queryCardActionState"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment", "terminateIssuance"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment", "createNewEmployeeContractor"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment", "queryModifiedList"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment", "updateEmployeeContractor"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment", "querySIP"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment", "suspendIssuance"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[8]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment", "requestEftsSubmission"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[9]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment", "reactivateIssuance"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[10]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment", "queryApplicantExists"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[11]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment", "cancelCardAction"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[12]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment", "deleteEmployeeContractor"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[13]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment", "queryCredentialStatusBySerialNumber"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[14]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment", "requestCardAction"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[15]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment", "queryRoleholders"));
	    _service.addOperation(__operation);
	    

	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_OUT_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    (__operation).getMessage(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE).getPolicySubject().attachPolicy(getPolicy("<wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><wsp:ExactlyOne><wsp:All><sp:SignedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /><sp:Header Name=\"To\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"From\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"FaultTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"ReplyTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"MessageID\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"RelatesTo\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /><sp:Header Name=\"Action\" Namespace=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\" /></sp:SignedParts><sp:EncryptedParts xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><sp:Body /></sp:EncryptedParts><sp:SymmetricBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:ProtectionToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireDerivedKeys /><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:ProtectionToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /><sp:EncryptSignature /><sp:OnlySignEntireHeadersAndBody /></wsp:Policy></sp:SymmetricBinding><sp:EndorsingSupportingTokens xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:X509Token><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:RequireThumbprintReference /><sp:WssX509V3Token10 /></wsp:Policy></sp:X509Token></wsp:Policy></sp:EndorsingSupportingTokens><sp:Wss11 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportRefThumbprint /><sp:MustSupportRefEncryptedKey /><sp:RequireSignatureConfirmation /></wsp:Policy></sp:Wss11><sp:Trust10 xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:MustSupportIssuedTokens /><sp:RequireClientEntropy /><sp:RequireServerEntropy /></wsp:Policy></sp:Trust10><sp:TransportBinding xmlns:sp=\"http://schemas.xmlsoap.org/ws/2005/07/securitypolicy\"><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:TransportToken><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:HttpsToken RequireClientCertificate=\"false\"></sp:HttpsToken></wsp:Policy></sp:TransportToken><sp:AlgorithmSuite><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Basic256 /></wsp:Policy></sp:AlgorithmSuite><sp:Layout><wsp:Policy xmlns:wsp=\"http://schemas.xmlsoap.org/ws/2004/09/policy\"><sp:Strict /></wsp:Policy></sp:Layout><sp:IncludeTimestamp /></wsp:Policy></sp:TransportBinding><wsap:UsingAddressing xmlns:wsap=\"http://schemas.xmlsoap.org/ws/2004/08/addressing/policy\"></wsap:UsingAddressing></wsp:All></wsp:ExactlyOne></wsp:Policy>"));
	    
	    
            _operations[16]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         


    }

    /**
      *Constructor that takes in a configContext
      */

    public AgencyServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public AgencyServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
        _service.applyPolicy();
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
            //Set the soap version
            _serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
        
    
    }

    /**
     * Default Constructor
     */
    public AgencyServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"https://wsgsa.usaccess.gsa.gov/SIPWebService2015/AgencyService.svc" );
                
    }

    /**
     * Default Constructor
     */
    public AgencyServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("https://wsgsa.usaccess.gsa.gov/SIPWebService2015/AgencyService.svc" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public AgencyServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see gov.gsa.hspd12.federated.enrollment.AgencyService#requestDNSync
                     * @param requestDNSync0
                    
                     */

                    

                            public  gov.gsa.hspd12.federated.enrollment.RequestDNSyncResponse requestDNSync(

                            gov.gsa.hspd12.federated.enrollment.RequestDNSync requestDNSync0)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("http://hspd12.gsa.gov/federated/enrollment/IAgencyService/RequestDNSync");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    requestDNSync0,
                                                    optimizeContent(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "requestDNSync")), new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "requestDNSync"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             gov.gsa.hspd12.federated.enrollment.RequestDNSyncResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (gov.gsa.hspd12.federated.enrollment.RequestDNSyncResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"RequestDNSync"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"RequestDNSync"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"RequestDNSync"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see gov.gsa.hspd12.federated.enrollment.AgencyService#queryCredentialStatus
                     * @param queryCredentialStatus2
                    
                     */

                    

                            public  gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusResponse queryCredentialStatus(

                            gov.gsa.hspd12.federated.enrollment.QueryCredentialStatus queryCredentialStatus2)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("http://hspd12.gsa.gov/federated/enrollment/IAgencyService/QueryCredentialStatus");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryCredentialStatus2,
                                                    optimizeContent(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "queryCredentialStatus")), new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "queryCredentialStatus"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"QueryCredentialStatus"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"QueryCredentialStatus"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"QueryCredentialStatus"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see gov.gsa.hspd12.federated.enrollment.AgencyService#queryCardActionState
                     * @param queryCardActionState4
                    
                     */

                    

                            public  gov.gsa.hspd12.federated.enrollment.QueryCardActionStateResponse queryCardActionState(

                            gov.gsa.hspd12.federated.enrollment.QueryCardActionState queryCardActionState4)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("http://hspd12.gsa.gov/federated/enrollment/IAgencyService/QueryCardActionState");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryCardActionState4,
                                                    optimizeContent(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "queryCardActionState")), new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "queryCardActionState"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             gov.gsa.hspd12.federated.enrollment.QueryCardActionStateResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (gov.gsa.hspd12.federated.enrollment.QueryCardActionStateResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"QueryCardActionState"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"QueryCardActionState"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"QueryCardActionState"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see gov.gsa.hspd12.federated.enrollment.AgencyService#terminateIssuance
                     * @param terminateIssuance6
                    
                     */

                    

                            public  gov.gsa.hspd12.federated.enrollment.TerminateIssuanceResponse terminateIssuance(

                            gov.gsa.hspd12.federated.enrollment.TerminateIssuance terminateIssuance6)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("http://hspd12.gsa.gov/federated/enrollment/IAgencyService/TerminateIssuance");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    terminateIssuance6,
                                                    optimizeContent(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "terminateIssuance")), new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "terminateIssuance"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             gov.gsa.hspd12.federated.enrollment.TerminateIssuanceResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (gov.gsa.hspd12.federated.enrollment.TerminateIssuanceResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"TerminateIssuance"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"TerminateIssuance"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"TerminateIssuance"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see gov.gsa.hspd12.federated.enrollment.AgencyService#createNewEmployeeContractor
                     * @param createNewEmployeeContractor8
                    
                     */

                    

                            public  gov.gsa.hspd12.federated.enrollment.CreateNewEmployeeContractorResponse createNewEmployeeContractor(

                            gov.gsa.hspd12.federated.enrollment.CreateNewEmployeeContractor createNewEmployeeContractor8)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("http://hspd12.gsa.gov/federated/enrollment/IAgencyService/CreateNewEmployeeContractor");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createNewEmployeeContractor8,
                                                    optimizeContent(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "createNewEmployeeContractor")), new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "createNewEmployeeContractor"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             gov.gsa.hspd12.federated.enrollment.CreateNewEmployeeContractorResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (gov.gsa.hspd12.federated.enrollment.CreateNewEmployeeContractorResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"CreateNewEmployeeContractor"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"CreateNewEmployeeContractor"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"CreateNewEmployeeContractor"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see gov.gsa.hspd12.federated.enrollment.AgencyService#queryModifiedList
                     * @param queryModifiedList10
                    
                     */

                    

                            public  gov.gsa.hspd12.federated.enrollment.QueryModifiedListResponse queryModifiedList(

                            gov.gsa.hspd12.federated.enrollment.QueryModifiedList queryModifiedList10)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("http://hspd12.gsa.gov/federated/enrollment/IAgencyService/QueryModifiedList");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryModifiedList10,
                                                    optimizeContent(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "queryModifiedList")), new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "queryModifiedList"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             gov.gsa.hspd12.federated.enrollment.QueryModifiedListResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (gov.gsa.hspd12.federated.enrollment.QueryModifiedListResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"QueryModifiedList"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"QueryModifiedList"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"QueryModifiedList"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see gov.gsa.hspd12.federated.enrollment.AgencyService#updateEmployeeContractor
                     * @param updateEmployeeContractor12
                    
                     */

                    

                            public  gov.gsa.hspd12.federated.enrollment.UpdateEmployeeContractorResponse updateEmployeeContractor(

                            gov.gsa.hspd12.federated.enrollment.UpdateEmployeeContractor updateEmployeeContractor12)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("http://hspd12.gsa.gov/federated/enrollment/IAgencyService/UpdateEmployeeContractor");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    updateEmployeeContractor12,
                                                    optimizeContent(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "updateEmployeeContractor")), new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "updateEmployeeContractor"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             gov.gsa.hspd12.federated.enrollment.UpdateEmployeeContractorResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (gov.gsa.hspd12.federated.enrollment.UpdateEmployeeContractorResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"UpdateEmployeeContractor"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"UpdateEmployeeContractor"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"UpdateEmployeeContractor"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see gov.gsa.hspd12.federated.enrollment.AgencyService#querySIP
                     * @param querySIP14
                    
                     */

                    

                            public  gov.gsa.hspd12.federated.enrollment.QuerySIPResponse querySIP(

                            gov.gsa.hspd12.federated.enrollment.QuerySIP querySIP14)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("http://hspd12.gsa.gov/federated/enrollment/IAgencyService/QuerySIP");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    querySIP14,
                                                    optimizeContent(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "querySIP")), new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "querySIP"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             gov.gsa.hspd12.federated.enrollment.QuerySIPResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (gov.gsa.hspd12.federated.enrollment.QuerySIPResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"QuerySIP"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"QuerySIP"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"QuerySIP"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see gov.gsa.hspd12.federated.enrollment.AgencyService#suspendIssuance
                     * @param suspendIssuance16
                    
                     */

                    

                            public  gov.gsa.hspd12.federated.enrollment.SuspendIssuanceResponse suspendIssuance(

                            gov.gsa.hspd12.federated.enrollment.SuspendIssuance suspendIssuance16)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("http://hspd12.gsa.gov/federated/enrollment/IAgencyService/SuspendIssuance");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    suspendIssuance16,
                                                    optimizeContent(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "suspendIssuance")), new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "suspendIssuance"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             gov.gsa.hspd12.federated.enrollment.SuspendIssuanceResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (gov.gsa.hspd12.federated.enrollment.SuspendIssuanceResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"SuspendIssuance"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"SuspendIssuance"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"SuspendIssuance"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see gov.gsa.hspd12.federated.enrollment.AgencyService#requestEftsSubmission
                     * @param requestEftsSubmission18
                    
                     */

                    

                            public  gov.gsa.hspd12.federated.enrollment.RequestEftsSubmissionResponse requestEftsSubmission(

                            gov.gsa.hspd12.federated.enrollment.RequestEftsSubmission requestEftsSubmission18)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
              _operationClient.getOptions().setAction("http://hspd12.gsa.gov/federated/enrollment/IAgencyService/RequestEftsSubmission");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    requestEftsSubmission18,
                                                    optimizeContent(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "requestEftsSubmission")), new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "requestEftsSubmission"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             gov.gsa.hspd12.federated.enrollment.RequestEftsSubmissionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (gov.gsa.hspd12.federated.enrollment.RequestEftsSubmissionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"RequestEftsSubmission"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"RequestEftsSubmission"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"RequestEftsSubmission"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see gov.gsa.hspd12.federated.enrollment.AgencyService#reactivateIssuance
                     * @param reactivateIssuance20
                    
                     */

                    

                            public  gov.gsa.hspd12.federated.enrollment.ReactivateIssuanceResponse reactivateIssuance(

                            gov.gsa.hspd12.federated.enrollment.ReactivateIssuance reactivateIssuance20)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
              _operationClient.getOptions().setAction("http://hspd12.gsa.gov/federated/enrollment/IAgencyService/ReactivateIssuance");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    reactivateIssuance20,
                                                    optimizeContent(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "reactivateIssuance")), new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "reactivateIssuance"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             gov.gsa.hspd12.federated.enrollment.ReactivateIssuanceResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (gov.gsa.hspd12.federated.enrollment.ReactivateIssuanceResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"ReactivateIssuance"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"ReactivateIssuance"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"ReactivateIssuance"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see gov.gsa.hspd12.federated.enrollment.AgencyService#queryApplicantExists
                     * @param queryApplicantExists22
                    
                     */

                    

                            public  gov.gsa.hspd12.federated.enrollment.QueryApplicantExistsResponse queryApplicantExists(

                            gov.gsa.hspd12.federated.enrollment.QueryApplicantExists queryApplicantExists22)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
              _operationClient.getOptions().setAction("http://hspd12.gsa.gov/federated/enrollment/IAgencyService/QueryApplicantExists");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryApplicantExists22,
                                                    optimizeContent(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "queryApplicantExists")), new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "queryApplicantExists"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             gov.gsa.hspd12.federated.enrollment.QueryApplicantExistsResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (gov.gsa.hspd12.federated.enrollment.QueryApplicantExistsResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"QueryApplicantExists"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"QueryApplicantExists"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"QueryApplicantExists"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see gov.gsa.hspd12.federated.enrollment.AgencyService#cancelCardAction
                     * @param cancelCardAction24
                    
                     */

                    

                            public  gov.gsa.hspd12.federated.enrollment.CancelCardActionResponse cancelCardAction(

                            gov.gsa.hspd12.federated.enrollment.CancelCardAction cancelCardAction24)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
              _operationClient.getOptions().setAction("http://hspd12.gsa.gov/federated/enrollment/IAgencyService/CancelCardAction");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cancelCardAction24,
                                                    optimizeContent(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "cancelCardAction")), new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "cancelCardAction"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             gov.gsa.hspd12.federated.enrollment.CancelCardActionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (gov.gsa.hspd12.federated.enrollment.CancelCardActionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"CancelCardAction"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"CancelCardAction"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"CancelCardAction"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see gov.gsa.hspd12.federated.enrollment.AgencyService#deleteEmployeeContractor
                     * @param deleteEmployeeContractor26
                    
                     */

                    

                            public  gov.gsa.hspd12.federated.enrollment.DeleteEmployeeContractorResponse deleteEmployeeContractor(

                            gov.gsa.hspd12.federated.enrollment.DeleteEmployeeContractor deleteEmployeeContractor26)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
              _operationClient.getOptions().setAction("http://hspd12.gsa.gov/federated/enrollment/IAgencyService/DeleteEmployeeContractor");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    deleteEmployeeContractor26,
                                                    optimizeContent(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "deleteEmployeeContractor")), new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "deleteEmployeeContractor"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             gov.gsa.hspd12.federated.enrollment.DeleteEmployeeContractorResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (gov.gsa.hspd12.federated.enrollment.DeleteEmployeeContractorResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"DeleteEmployeeContractor"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"DeleteEmployeeContractor"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"DeleteEmployeeContractor"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see gov.gsa.hspd12.federated.enrollment.AgencyService#queryCredentialStatusBySerialNumber
                     * @param queryCredentialStatusBySerialNumber28
                    
                     */

                    

                            public  gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusBySerialNumberResponse queryCredentialStatusBySerialNumber(

                            gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusBySerialNumber queryCredentialStatusBySerialNumber28)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
              _operationClient.getOptions().setAction("http://hspd12.gsa.gov/federated/enrollment/IAgencyService/QueryCredentialStatusBySerialNumber");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryCredentialStatusBySerialNumber28,
                                                    optimizeContent(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "queryCredentialStatusBySerialNumber")), new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "queryCredentialStatusBySerialNumber"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusBySerialNumberResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusBySerialNumberResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"QueryCredentialStatusBySerialNumber"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"QueryCredentialStatusBySerialNumber"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"QueryCredentialStatusBySerialNumber"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see gov.gsa.hspd12.federated.enrollment.AgencyService#requestCardAction
                     * @param requestCardAction30
                    
                     */

                    

                            public  gov.gsa.hspd12.federated.enrollment.RequestCardActionResponse requestCardAction(

                            gov.gsa.hspd12.federated.enrollment.RequestCardAction requestCardAction30)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
              _operationClient.getOptions().setAction("http://hspd12.gsa.gov/federated/enrollment/IAgencyService/RequestCardAction");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    requestCardAction30,
                                                    optimizeContent(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "requestCardAction")), new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "requestCardAction"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             gov.gsa.hspd12.federated.enrollment.RequestCardActionResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (gov.gsa.hspd12.federated.enrollment.RequestCardActionResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"RequestCardAction"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"RequestCardAction"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"RequestCardAction"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see gov.gsa.hspd12.federated.enrollment.AgencyService#queryRoleholders
                     * @param queryRoleholders32
                    
                     */

                    

                            public  gov.gsa.hspd12.federated.enrollment.QueryRoleholdersResponse queryRoleholders(

                            gov.gsa.hspd12.federated.enrollment.QueryRoleholders queryRoleholders32)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
              _operationClient.getOptions().setAction("http://hspd12.gsa.gov/federated/enrollment/IAgencyService/QueryRoleholders");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryRoleholders32,
                                                    optimizeContent(new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "queryRoleholders")), new javax.xml.namespace.QName("http://hspd12.gsa.gov/federated/enrollment",
                                                    "queryRoleholders"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             gov.gsa.hspd12.federated.enrollment.QueryRoleholdersResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (gov.gsa.hspd12.federated.enrollment.QueryRoleholdersResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"QueryRoleholders"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"QueryRoleholders"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"QueryRoleholders"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    ////////////////////////////////////////////////////////////////////////
    
    /*private static org.apache.neethi.Policy getPolicy (java.lang.String policyString) {
    	java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(policyString.getBytes());
    	return org.apache.neethi.PolicyEngine.getPolicy(bais);
    }*/
       
    private static org.apache.neethi.Policy getPolicy (java.lang.String policyString)  
    { 
        java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(policyString.getBytes()); 
        try  
        { 
            StAXOMBuilder builder = new StAXOMBuilder(bais); 
            OMElement documentElement = builder.getDocumentElement(); 
            return org.apache.neethi.PolicyEngine.getPolicy(documentElement); 
        }  
        catch (Exception e)  
        { 
            e.printStackTrace(); 
        } 
        return null; 
    } 
    
    /////////////////////////////////////////////////////////////////////////

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //https://wsgsa.usaccess.gsa.gov/SIPWebService2015/AgencyService.svc
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.RequestDNSync param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.RequestDNSync.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.RequestDNSyncResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.RequestDNSyncResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.QueryCredentialStatus param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.QueryCredentialStatus.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.QueryCardActionState param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.QueryCardActionState.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.QueryCardActionStateResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.QueryCardActionStateResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.TerminateIssuance param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.TerminateIssuance.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.TerminateIssuanceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.TerminateIssuanceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.CreateNewEmployeeContractor param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.CreateNewEmployeeContractor.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.CreateNewEmployeeContractorResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.CreateNewEmployeeContractorResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.QueryModifiedList param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.QueryModifiedList.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.QueryModifiedListResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.QueryModifiedListResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.UpdateEmployeeContractor param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.UpdateEmployeeContractor.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.UpdateEmployeeContractorResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.UpdateEmployeeContractorResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.QuerySIP param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.QuerySIP.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.QuerySIPResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.QuerySIPResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.SuspendIssuance param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.SuspendIssuance.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.SuspendIssuanceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.SuspendIssuanceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.RequestEftsSubmission param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.RequestEftsSubmission.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.RequestEftsSubmissionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.RequestEftsSubmissionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.ReactivateIssuance param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.ReactivateIssuance.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.ReactivateIssuanceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.ReactivateIssuanceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.QueryApplicantExists param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.QueryApplicantExists.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.QueryApplicantExistsResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.QueryApplicantExistsResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.CancelCardAction param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.CancelCardAction.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.CancelCardActionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.CancelCardActionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.DeleteEmployeeContractor param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.DeleteEmployeeContractor.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.DeleteEmployeeContractorResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.DeleteEmployeeContractorResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusBySerialNumber param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusBySerialNumber.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusBySerialNumberResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusBySerialNumberResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.RequestCardAction param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.RequestCardAction.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.RequestCardActionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.RequestCardActionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.QueryRoleholders param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.QueryRoleholders.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(gov.gsa.hspd12.federated.enrollment.QueryRoleholdersResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(gov.gsa.hspd12.federated.enrollment.QueryRoleholdersResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.gsa.hspd12.federated.enrollment.RequestDNSync param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(gov.gsa.hspd12.federated.enrollment.RequestDNSync.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.gsa.hspd12.federated.enrollment.QueryCredentialStatus param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(gov.gsa.hspd12.federated.enrollment.QueryCredentialStatus.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.gsa.hspd12.federated.enrollment.QueryCardActionState param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(gov.gsa.hspd12.federated.enrollment.QueryCardActionState.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.gsa.hspd12.federated.enrollment.TerminateIssuance param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(gov.gsa.hspd12.federated.enrollment.TerminateIssuance.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.gsa.hspd12.federated.enrollment.CreateNewEmployeeContractor param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(gov.gsa.hspd12.federated.enrollment.CreateNewEmployeeContractor.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.gsa.hspd12.federated.enrollment.QueryModifiedList param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(gov.gsa.hspd12.federated.enrollment.QueryModifiedList.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.gsa.hspd12.federated.enrollment.UpdateEmployeeContractor param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(gov.gsa.hspd12.federated.enrollment.UpdateEmployeeContractor.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.gsa.hspd12.federated.enrollment.QuerySIP param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(gov.gsa.hspd12.federated.enrollment.QuerySIP.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.gsa.hspd12.federated.enrollment.SuspendIssuance param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(gov.gsa.hspd12.federated.enrollment.SuspendIssuance.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.gsa.hspd12.federated.enrollment.RequestEftsSubmission param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(gov.gsa.hspd12.federated.enrollment.RequestEftsSubmission.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.gsa.hspd12.federated.enrollment.ReactivateIssuance param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(gov.gsa.hspd12.federated.enrollment.ReactivateIssuance.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.gsa.hspd12.federated.enrollment.QueryApplicantExists param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(gov.gsa.hspd12.federated.enrollment.QueryApplicantExists.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.gsa.hspd12.federated.enrollment.CancelCardAction param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(gov.gsa.hspd12.federated.enrollment.CancelCardAction.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.gsa.hspd12.federated.enrollment.DeleteEmployeeContractor param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(gov.gsa.hspd12.federated.enrollment.DeleteEmployeeContractor.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusBySerialNumber param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusBySerialNumber.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.gsa.hspd12.federated.enrollment.RequestCardAction param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(gov.gsa.hspd12.federated.enrollment.RequestCardAction.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, gov.gsa.hspd12.federated.enrollment.QueryRoleholders param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(gov.gsa.hspd12.federated.enrollment.QueryRoleholders.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (gov.gsa.hspd12.federated.enrollment.RequestDNSync.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.RequestDNSync.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.RequestDNSyncResponse.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.RequestDNSyncResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.QueryCredentialStatus.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.QueryCredentialStatus.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusResponse.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.QueryCardActionState.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.QueryCardActionState.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.QueryCardActionStateResponse.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.QueryCardActionStateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.TerminateIssuance.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.TerminateIssuance.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.TerminateIssuanceResponse.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.TerminateIssuanceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.CreateNewEmployeeContractor.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.CreateNewEmployeeContractor.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.CreateNewEmployeeContractorResponse.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.CreateNewEmployeeContractorResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.QueryModifiedList.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.QueryModifiedList.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.QueryModifiedListResponse.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.QueryModifiedListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.UpdateEmployeeContractor.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.UpdateEmployeeContractor.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.UpdateEmployeeContractorResponse.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.UpdateEmployeeContractorResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.QuerySIP.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.QuerySIP.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.QuerySIPResponse.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.QuerySIPResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.SuspendIssuance.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.SuspendIssuance.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.SuspendIssuanceResponse.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.SuspendIssuanceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.RequestEftsSubmission.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.RequestEftsSubmission.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.RequestEftsSubmissionResponse.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.RequestEftsSubmissionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.ReactivateIssuance.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.ReactivateIssuance.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.ReactivateIssuanceResponse.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.ReactivateIssuanceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.QueryApplicantExists.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.QueryApplicantExists.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.QueryApplicantExistsResponse.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.QueryApplicantExistsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.CancelCardAction.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.CancelCardAction.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.CancelCardActionResponse.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.CancelCardActionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.DeleteEmployeeContractor.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.DeleteEmployeeContractor.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.DeleteEmployeeContractorResponse.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.DeleteEmployeeContractorResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusBySerialNumber.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusBySerialNumber.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusBySerialNumberResponse.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusBySerialNumberResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.RequestCardAction.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.RequestCardAction.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.RequestCardActionResponse.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.RequestCardActionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.QueryRoleholders.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.QueryRoleholders.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (gov.gsa.hspd12.federated.enrollment.QueryRoleholdersResponse.class.equals(type)){
                
                           return gov.gsa.hspd12.federated.enrollment.QueryRoleholdersResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   
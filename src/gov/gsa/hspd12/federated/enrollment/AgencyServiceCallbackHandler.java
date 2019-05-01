
/**
 * AgencyServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */

    package gov.gsa.hspd12.federated.enrollment;

    /**
     *  AgencyServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class AgencyServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public AgencyServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public AgencyServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for requestDNSync method
            * override this method for handling normal response from requestDNSync operation
            */
           public void receiveResultrequestDNSync(
                    gov.gsa.hspd12.federated.enrollment.RequestDNSyncResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from requestDNSync operation
           */
            public void receiveErrorrequestDNSync(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryCredentialStatus method
            * override this method for handling normal response from queryCredentialStatus operation
            */
           public void receiveResultqueryCredentialStatus(
                    gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryCredentialStatus operation
           */
            public void receiveErrorqueryCredentialStatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryCardActionState method
            * override this method for handling normal response from queryCardActionState operation
            */
           public void receiveResultqueryCardActionState(
                    gov.gsa.hspd12.federated.enrollment.QueryCardActionStateResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryCardActionState operation
           */
            public void receiveErrorqueryCardActionState(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for terminateIssuance method
            * override this method for handling normal response from terminateIssuance operation
            */
           public void receiveResultterminateIssuance(
                    gov.gsa.hspd12.federated.enrollment.TerminateIssuanceResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from terminateIssuance operation
           */
            public void receiveErrorterminateIssuance(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createNewEmployeeContractor method
            * override this method for handling normal response from createNewEmployeeContractor operation
            */
           public void receiveResultcreateNewEmployeeContractor(
                    gov.gsa.hspd12.federated.enrollment.CreateNewEmployeeContractorResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createNewEmployeeContractor operation
           */
            public void receiveErrorcreateNewEmployeeContractor(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryModifiedList method
            * override this method for handling normal response from queryModifiedList operation
            */
           public void receiveResultqueryModifiedList(
                    gov.gsa.hspd12.federated.enrollment.QueryModifiedListResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryModifiedList operation
           */
            public void receiveErrorqueryModifiedList(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for updateEmployeeContractor method
            * override this method for handling normal response from updateEmployeeContractor operation
            */
           public void receiveResultupdateEmployeeContractor(
                    gov.gsa.hspd12.federated.enrollment.UpdateEmployeeContractorResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from updateEmployeeContractor operation
           */
            public void receiveErrorupdateEmployeeContractor(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for querySIP method
            * override this method for handling normal response from querySIP operation
            */
           public void receiveResultquerySIP(
                    gov.gsa.hspd12.federated.enrollment.QuerySIPResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from querySIP operation
           */
            public void receiveErrorquerySIP(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for suspendIssuance method
            * override this method for handling normal response from suspendIssuance operation
            */
           public void receiveResultsuspendIssuance(
                    gov.gsa.hspd12.federated.enrollment.SuspendIssuanceResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from suspendIssuance operation
           */
            public void receiveErrorsuspendIssuance(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for requestEftsSubmission method
            * override this method for handling normal response from requestEftsSubmission operation
            */
           public void receiveResultrequestEftsSubmission(
                    gov.gsa.hspd12.federated.enrollment.RequestEftsSubmissionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from requestEftsSubmission operation
           */
            public void receiveErrorrequestEftsSubmission(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for reactivateIssuance method
            * override this method for handling normal response from reactivateIssuance operation
            */
           public void receiveResultreactivateIssuance(
                    gov.gsa.hspd12.federated.enrollment.ReactivateIssuanceResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from reactivateIssuance operation
           */
            public void receiveErrorreactivateIssuance(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryApplicantExists method
            * override this method for handling normal response from queryApplicantExists operation
            */
           public void receiveResultqueryApplicantExists(
                    gov.gsa.hspd12.federated.enrollment.QueryApplicantExistsResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryApplicantExists operation
           */
            public void receiveErrorqueryApplicantExists(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for cancelCardAction method
            * override this method for handling normal response from cancelCardAction operation
            */
           public void receiveResultcancelCardAction(
                    gov.gsa.hspd12.federated.enrollment.CancelCardActionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cancelCardAction operation
           */
            public void receiveErrorcancelCardAction(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryCredentialStatusBySerialNumber method
            * override this method for handling normal response from queryCredentialStatusBySerialNumber operation
            */
           public void receiveResultqueryCredentialStatusBySerialNumber(
                    gov.gsa.hspd12.federated.enrollment.QueryCredentialStatusBySerialNumberResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryCredentialStatusBySerialNumber operation
           */
            public void receiveErrorqueryCredentialStatusBySerialNumber(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for requestCardAction method
            * override this method for handling normal response from requestCardAction operation
            */
           public void receiveResultrequestCardAction(
                    gov.gsa.hspd12.federated.enrollment.RequestCardActionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from requestCardAction operation
           */
            public void receiveErrorrequestCardAction(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryRoleholders method
            * override this method for handling normal response from queryRoleholders operation
            */
           public void receiveResultqueryRoleholders(
                    gov.gsa.hspd12.federated.enrollment.QueryRoleholdersResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryRoleholders operation
           */
            public void receiveErrorqueryRoleholders(java.lang.Exception e) {
            }
                


    }
    
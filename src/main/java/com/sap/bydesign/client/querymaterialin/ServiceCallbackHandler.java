/**
 * ServiceCallbackHandler.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.2 Built on : Jul 13,
 * 2022 (06:38:03 EDT)
 */
package com.sap.bydesign.client.querymaterialin;

/**
 * ServiceCallbackHandler Callback class, Users can extend this class and implement their own
 * receiveResult and receiveError methods.
 */
public abstract class ServiceCallbackHandler {

  protected Object clientData;

  /**
   * User can pass in any object that needs to be accessed once the NonBlocking Web service call is
   * finished and appropriate method of this CallBack is called.
   *
   * @param clientData Object mechanism by which the user can pass in user data that will be
   *     avilable at the time this callback is called.
   */
  public ServiceCallbackHandler(Object clientData) {
    this.clientData = clientData;
  }

  /** Please use this constructor if you don't want to set any clientData */
  public ServiceCallbackHandler() {
    this.clientData = null;
  }

  /** Get the client data */
  public Object getClientData() {
    return clientData;
  }

  /**
   * auto generated Axis2 call back method for findByElements method override this method for
   * handling normal response from findByElements operation
   */
  public void receiveResultfindByElements(
      com.sap.xi.sapglobal20.global.MaterialByElementsResponseSyncDocument result) {}

  /**
   * auto generated Axis2 Error handler override this method for handling error response from
   * findByElements operation
   */
  public void receiveErrorfindByElements(java.lang.Exception e) {}
}

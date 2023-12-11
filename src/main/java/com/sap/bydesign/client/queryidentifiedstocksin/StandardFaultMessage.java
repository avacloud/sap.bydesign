/**
 * StandardFaultMessage.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.2 Built on : Jul 13,
 * 2022 (06:38:03 EDT)
 */
package com.sap.bydesign.client.queryidentifiedstocksin;

public class StandardFaultMessage extends java.lang.Exception {

  private static final long serialVersionUID = 1748332190917L;

  private com.sap.xi.ap.common.global.StandardFaultMessageDocument faultMessage;

  public StandardFaultMessage() {
    super("StandardFaultMessage");
  }

  public StandardFaultMessage(java.lang.String s) {
    super(s);
  }

  public StandardFaultMessage(java.lang.String s, java.lang.Throwable ex) {
    super(s, ex);
  }

  public StandardFaultMessage(java.lang.Throwable cause) {
    super(cause);
  }

  public void setFaultMessage(com.sap.xi.ap.common.global.StandardFaultMessageDocument msg) {
    faultMessage = msg;
  }

  public com.sap.xi.ap.common.global.StandardFaultMessageDocument getFaultMessage() {
    return faultMessage;
  }
}

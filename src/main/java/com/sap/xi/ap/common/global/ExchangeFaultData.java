/*
 * XML Type:  ExchangeFaultData
 * Namespace: http://sap.com/xi/AP/Common/Global
 * Java type: com.sap.xi.ap.common.global.ExchangeFaultData
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.global;


/**
 * An XML ExchangeFaultData(@http://sap.com/xi/AP/Common/Global).
 *
 * This is a complex type.
 */
public interface ExchangeFaultData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExchangeFaultData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1B636237ED4970D2FF229DCFE319F552").resolveHandle("exchangefaultdata0a79type");
    
    /**
     * Gets the "faultText" element
     */
    java.lang.String getFaultText();
    
    /**
     * Gets (as xml) the "faultText" element
     */
    org.apache.xmlbeans.XmlString xgetFaultText();
    
    /**
     * Sets the "faultText" element
     */
    void setFaultText(java.lang.String faultText);
    
    /**
     * Sets (as xml) the "faultText" element
     */
    void xsetFaultText(org.apache.xmlbeans.XmlString faultText);
    
    /**
     * Gets the "faultUrl" element
     */
    java.lang.String getFaultUrl();
    
    /**
     * Gets (as xml) the "faultUrl" element
     */
    org.apache.xmlbeans.XmlString xgetFaultUrl();
    
    /**
     * True if has "faultUrl" element
     */
    boolean isSetFaultUrl();
    
    /**
     * Sets the "faultUrl" element
     */
    void setFaultUrl(java.lang.String faultUrl);
    
    /**
     * Sets (as xml) the "faultUrl" element
     */
    void xsetFaultUrl(org.apache.xmlbeans.XmlString faultUrl);
    
    /**
     * Unsets the "faultUrl" element
     */
    void unsetFaultUrl();
    
    /**
     * Gets array of all "faultDetail" elements
     */
    com.sap.xi.ap.common.global.ExchangeLogData[] getFaultDetailArray();
    
    /**
     * Gets ith "faultDetail" element
     */
    com.sap.xi.ap.common.global.ExchangeLogData getFaultDetailArray(int i);
    
    /**
     * Returns number of "faultDetail" element
     */
    int sizeOfFaultDetailArray();
    
    /**
     * Sets array of all "faultDetail" element
     */
    void setFaultDetailArray(com.sap.xi.ap.common.global.ExchangeLogData[] faultDetailArray);
    
    /**
     * Sets ith "faultDetail" element
     */
    void setFaultDetailArray(int i, com.sap.xi.ap.common.global.ExchangeLogData faultDetail);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "faultDetail" element
     */
    com.sap.xi.ap.common.global.ExchangeLogData insertNewFaultDetail(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "faultDetail" element
     */
    com.sap.xi.ap.common.global.ExchangeLogData addNewFaultDetail();
    
    /**
     * Removes the ith "faultDetail" element
     */
    void removeFaultDetail(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.ap.common.global.ExchangeFaultData newInstance() {
          return (com.sap.xi.ap.common.global.ExchangeFaultData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.ap.common.global.ExchangeFaultData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.ap.common.global.ExchangeFaultData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.ap.common.global.ExchangeFaultData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.ExchangeFaultData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.ap.common.global.ExchangeFaultData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.ExchangeFaultData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.ap.common.global.ExchangeFaultData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.ExchangeFaultData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.ap.common.global.ExchangeFaultData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.ExchangeFaultData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.ap.common.global.ExchangeFaultData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.ExchangeFaultData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.ap.common.global.ExchangeFaultData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.ExchangeFaultData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.ap.common.global.ExchangeFaultData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.ExchangeFaultData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.ap.common.global.ExchangeFaultData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.ExchangeFaultData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.ap.common.global.ExchangeFaultData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.ExchangeFaultData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.ap.common.global.ExchangeFaultData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.ExchangeFaultData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.ap.common.global.ExchangeFaultData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.ExchangeFaultData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.ap.common.global.ExchangeFaultData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.ExchangeFaultData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.ap.common.global.ExchangeFaultData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.ExchangeFaultData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.ap.common.global.ExchangeFaultData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.ExchangeFaultData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.global.ExchangeFaultData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.global.ExchangeFaultData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.global.ExchangeFaultData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.global.ExchangeFaultData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

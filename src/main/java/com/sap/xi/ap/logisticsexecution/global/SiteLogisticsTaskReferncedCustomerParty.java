/*
 * XML Type:  SiteLogisticsTaskReferncedCustomerParty
 * Namespace: http://sap.com/xi/AP/LogisticsExecution/Global
 * Java type: com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.logisticsexecution.global;


/**
 * An XML SiteLogisticsTaskReferncedCustomerParty(@http://sap.com/xi/AP/LogisticsExecution/Global).
 *
 * This is a complex type.
 */
public interface SiteLogisticsTaskReferncedCustomerParty extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SiteLogisticsTaskReferncedCustomerParty.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1B636237ED4970D2FF229DCFE319F552").resolveHandle("sitelogisticstaskreferncedcustomerparty43a3type");
    
    /**
     * Gets the "CustomerPartyKey" element
     */
    com.sap.xi.ap.common.global.PartyKey getCustomerPartyKey();
    
    /**
     * True if has "CustomerPartyKey" element
     */
    boolean isSetCustomerPartyKey();
    
    /**
     * Sets the "CustomerPartyKey" element
     */
    void setCustomerPartyKey(com.sap.xi.ap.common.global.PartyKey customerPartyKey);
    
    /**
     * Appends and returns a new empty "CustomerPartyKey" element
     */
    com.sap.xi.ap.common.global.PartyKey addNewCustomerPartyKey();
    
    /**
     * Unsets the "CustomerPartyKey" element
     */
    void unsetCustomerPartyKey();
    
    /**
     * Gets the "CustomerPartyName" element
     */
    com.sap.xi.ap.common.gdt.LONGName getCustomerPartyName();
    
    /**
     * True if has "CustomerPartyName" element
     */
    boolean isSetCustomerPartyName();
    
    /**
     * Sets the "CustomerPartyName" element
     */
    void setCustomerPartyName(com.sap.xi.ap.common.gdt.LONGName customerPartyName);
    
    /**
     * Appends and returns a new empty "CustomerPartyName" element
     */
    com.sap.xi.ap.common.gdt.LONGName addNewCustomerPartyName();
    
    /**
     * Unsets the "CustomerPartyName" element
     */
    void unsetCustomerPartyName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty newInstance() {
          return (com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

/*
 * XML Type:  SiteLogisticsLotLogisticPackageOutput
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML SiteLogisticsLotLogisticPackageOutput(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface SiteLogisticsLotLogisticPackageOutput extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SiteLogisticsLotLogisticPackageOutput.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1B636237ED4970D2FF229DCFE319F552").resolveHandle("sitelogisticslotlogisticpackageoutputa288type");
    
    /**
     * Gets the "LogisticUnitUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getLogisticUnitUUID();
    
    /**
     * True if has "LogisticUnitUUID" element
     */
    boolean isSetLogisticUnitUUID();
    
    /**
     * Sets the "LogisticUnitUUID" element
     */
    void setLogisticUnitUUID(com.sap.xi.ap.common.gdt.UUID logisticUnitUUID);
    
    /**
     * Appends and returns a new empty "LogisticUnitUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewLogisticUnitUUID();
    
    /**
     * Unsets the "LogisticUnitUUID" element
     */
    void unsetLogisticUnitUUID();
    
    /**
     * Gets the "LogisticUnitID" element
     */
    com.sap.xi.ap.common.gdt.LogisticUnitID getLogisticUnitID();
    
    /**
     * True if has "LogisticUnitID" element
     */
    boolean isSetLogisticUnitID();
    
    /**
     * Sets the "LogisticUnitID" element
     */
    void setLogisticUnitID(com.sap.xi.ap.common.gdt.LogisticUnitID logisticUnitID);
    
    /**
     * Appends and returns a new empty "LogisticUnitID" element
     */
    com.sap.xi.ap.common.gdt.LogisticUnitID addNewLogisticUnitID();
    
    /**
     * Unsets the "LogisticUnitID" element
     */
    void unsetLogisticUnitID();
    
    /**
     * Gets the "LogisticUnitTotalConfirmedQuantity" element
     */
    com.sap.xi.ap.common.gdt.INTEGERQuantity getLogisticUnitTotalConfirmedQuantity();
    
    /**
     * True if has "LogisticUnitTotalConfirmedQuantity" element
     */
    boolean isSetLogisticUnitTotalConfirmedQuantity();
    
    /**
     * Sets the "LogisticUnitTotalConfirmedQuantity" element
     */
    void setLogisticUnitTotalConfirmedQuantity(com.sap.xi.ap.common.gdt.INTEGERQuantity logisticUnitTotalConfirmedQuantity);
    
    /**
     * Appends and returns a new empty "LogisticUnitTotalConfirmedQuantity" element
     */
    com.sap.xi.ap.common.gdt.INTEGERQuantity addNewLogisticUnitTotalConfirmedQuantity();
    
    /**
     * Unsets the "LogisticUnitTotalConfirmedQuantity" element
     */
    void unsetLogisticUnitTotalConfirmedQuantity();
    
    /**
     * Gets the "LogisticUnitOpenQuantity" element
     */
    com.sap.xi.ap.common.gdt.INTEGERQuantity getLogisticUnitOpenQuantity();
    
    /**
     * True if has "LogisticUnitOpenQuantity" element
     */
    boolean isSetLogisticUnitOpenQuantity();
    
    /**
     * Sets the "LogisticUnitOpenQuantity" element
     */
    void setLogisticUnitOpenQuantity(com.sap.xi.ap.common.gdt.INTEGERQuantity logisticUnitOpenQuantity);
    
    /**
     * Appends and returns a new empty "LogisticUnitOpenQuantity" element
     */
    com.sap.xi.ap.common.gdt.INTEGERQuantity addNewLogisticUnitOpenQuantity();
    
    /**
     * Unsets the "LogisticUnitOpenQuantity" element
     */
    void unsetLogisticUnitOpenQuantity();
    
    /**
     * Gets the "LogisticUnitPlanQuantity" element
     */
    com.sap.xi.ap.common.gdt.INTEGERQuantity getLogisticUnitPlanQuantity();
    
    /**
     * True if has "LogisticUnitPlanQuantity" element
     */
    boolean isSetLogisticUnitPlanQuantity();
    
    /**
     * Sets the "LogisticUnitPlanQuantity" element
     */
    void setLogisticUnitPlanQuantity(com.sap.xi.ap.common.gdt.INTEGERQuantity logisticUnitPlanQuantity);
    
    /**
     * Appends and returns a new empty "LogisticUnitPlanQuantity" element
     */
    com.sap.xi.ap.common.gdt.INTEGERQuantity addNewLogisticUnitPlanQuantity();
    
    /**
     * Unsets the "LogisticUnitPlanQuantity" element
     */
    void unsetLogisticUnitPlanQuantity();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput newInstance() {
          return (com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

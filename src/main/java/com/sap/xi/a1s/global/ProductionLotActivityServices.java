/*
 * XML Type:  ProductionLotActivityServices
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotActivityServices
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML ProductionLotActivityServices(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface ProductionLotActivityServices extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductionLotActivityServices.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3516FCF9D95E9E30AE8D4E360678AF8D").resolveHandle("productionlotactivityservices1025type");
    
    /**
     * Gets the "ServiceUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getServiceUUID();
    
    /**
     * True if has "ServiceUUID" element
     */
    boolean isSetServiceUUID();
    
    /**
     * Sets the "ServiceUUID" element
     */
    void setServiceUUID(com.sap.xi.ap.common.gdt.UUID serviceUUID);
    
    /**
     * Appends and returns a new empty "ServiceUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewServiceUUID();
    
    /**
     * Unsets the "ServiceUUID" element
     */
    void unsetServiceUUID();
    
    /**
     * Gets the "Service_ID" element
     */
    com.sap.xi.ap.common.gdt.ProductID getServiceID();
    
    /**
     * True if has "Service_ID" element
     */
    boolean isSetServiceID();
    
    /**
     * Sets the "Service_ID" element
     */
    void setServiceID(com.sap.xi.ap.common.gdt.ProductID serviceID);
    
    /**
     * Appends and returns a new empty "Service_ID" element
     */
    com.sap.xi.ap.common.gdt.ProductID addNewServiceID();
    
    /**
     * Unsets the "Service_ID" element
     */
    void unsetServiceID();
    
    /**
     * Gets the "Resource_ID" element
     */
    com.sap.xi.ap.common.gdt.ResourceID getResourceID();
    
    /**
     * True if has "Resource_ID" element
     */
    boolean isSetResourceID();
    
    /**
     * Sets the "Resource_ID" element
     */
    void setResourceID(com.sap.xi.ap.common.gdt.ResourceID resourceID);
    
    /**
     * Appends and returns a new empty "Resource_ID" element
     */
    com.sap.xi.ap.common.gdt.ResourceID addNewResourceID();
    
    /**
     * Unsets the "Resource_ID" element
     */
    void unsetResourceID();
    
    /**
     * Gets the "Confirmed_Quantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity getConfirmedQuantity();
    
    /**
     * True if has "Confirmed_Quantity" element
     */
    boolean isSetConfirmedQuantity();
    
    /**
     * Sets the "Confirmed_Quantity" element
     */
    void setConfirmedQuantity(com.sap.xi.ap.common.gdt.Quantity confirmedQuantity);
    
    /**
     * Appends and returns a new empty "Confirmed_Quantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity addNewConfirmedQuantity();
    
    /**
     * Unsets the "Confirmed_Quantity" element
     */
    void unsetConfirmedQuantity();
    
    /**
     * Gets the "ServiceConsumptionCalculationMethodCode" element
     */
    com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode getServiceConsumptionCalculationMethodCode();
    
    /**
     * True if has "ServiceConsumptionCalculationMethodCode" element
     */
    boolean isSetServiceConsumptionCalculationMethodCode();
    
    /**
     * Sets the "ServiceConsumptionCalculationMethodCode" element
     */
    void setServiceConsumptionCalculationMethodCode(com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode serviceConsumptionCalculationMethodCode);
    
    /**
     * Appends and returns a new empty "ServiceConsumptionCalculationMethodCode" element
     */
    com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode addNewServiceConsumptionCalculationMethodCode();
    
    /**
     * Unsets the "ServiceConsumptionCalculationMethodCode" element
     */
    void unsetServiceConsumptionCalculationMethodCode();
    
    /**
     * Gets the "ActionCode" attribute
     */
    com.sap.xi.ap.common.gdt.ActionCode.Enum getActionCode();
    
    /**
     * Gets (as xml) the "ActionCode" attribute
     */
    com.sap.xi.ap.common.gdt.ActionCode xgetActionCode();
    
    /**
     * True if has "ActionCode" attribute
     */
    boolean isSetActionCode();
    
    /**
     * Sets the "ActionCode" attribute
     */
    void setActionCode(com.sap.xi.ap.common.gdt.ActionCode.Enum actionCode);
    
    /**
     * Sets (as xml) the "ActionCode" attribute
     */
    void xsetActionCode(com.sap.xi.ap.common.gdt.ActionCode actionCode);
    
    /**
     * Unsets the "ActionCode" attribute
     */
    void unsetActionCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.ProductionLotActivityServices newInstance() {
          return (com.sap.xi.a1s.global.ProductionLotActivityServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotActivityServices newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.ProductionLotActivityServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.ProductionLotActivityServices parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotActivityServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotActivityServices parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotActivityServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.ProductionLotActivityServices parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotActivityServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotActivityServices parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotActivityServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotActivityServices parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotActivityServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotActivityServices parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotActivityServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotActivityServices parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotActivityServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotActivityServices parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotActivityServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotActivityServices parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotActivityServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotActivityServices parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotActivityServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotActivityServices parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotActivityServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotActivityServices parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotActivityServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotActivityServices parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotActivityServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotActivityServices parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotActivityServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotActivityServices parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotActivityServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotActivityServices parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotActivityServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

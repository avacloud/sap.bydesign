/*
 * XML Type:  ProductionLotServices
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotServices
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML ProductionLotServices(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface ProductionLotServices extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductionLotServices.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE7274E74C1D219A67E80FDE53A95800C").resolveHandle("productionlotservices46f4type");
    
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
     * Gets the "ServiceID" element
     */
    com.sap.xi.ap.common.gdt.ProductID getServiceID();
    
    /**
     * True if has "ServiceID" element
     */
    boolean isSetServiceID();
    
    /**
     * Sets the "ServiceID" element
     */
    void setServiceID(com.sap.xi.ap.common.gdt.ProductID serviceID);
    
    /**
     * Appends and returns a new empty "ServiceID" element
     */
    com.sap.xi.ap.common.gdt.ProductID addNewServiceID();
    
    /**
     * Unsets the "ServiceID" element
     */
    void unsetServiceID();
    
    /**
     * Gets the "ServiceDescription" element
     */
    java.lang.String getServiceDescription();
    
    /**
     * Gets (as xml) the "ServiceDescription" element
     */
    com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTSHORTDescription xgetServiceDescription();
    
    /**
     * True if has "ServiceDescription" element
     */
    boolean isSetServiceDescription();
    
    /**
     * Sets the "ServiceDescription" element
     */
    void setServiceDescription(java.lang.String serviceDescription);
    
    /**
     * Sets (as xml) the "ServiceDescription" element
     */
    void xsetServiceDescription(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTSHORTDescription serviceDescription);
    
    /**
     * Unsets the "ServiceDescription" element
     */
    void unsetServiceDescription();
    
    /**
     * Gets the "ResourceID" element
     */
    com.sap.xi.ap.common.gdt.ResourceID getResourceID();
    
    /**
     * True if has "ResourceID" element
     */
    boolean isSetResourceID();
    
    /**
     * Sets the "ResourceID" element
     */
    void setResourceID(com.sap.xi.ap.common.gdt.ResourceID resourceID);
    
    /**
     * Appends and returns a new empty "ResourceID" element
     */
    com.sap.xi.ap.common.gdt.ResourceID addNewResourceID();
    
    /**
     * Unsets the "ResourceID" element
     */
    void unsetResourceID();
    
    /**
     * Gets array of all "ResourceDescription" elements
     */
    com.sap.xi.a1s.global.ServiceResourceDescription[] getResourceDescriptionArray();
    
    /**
     * Gets ith "ResourceDescription" element
     */
    com.sap.xi.a1s.global.ServiceResourceDescription getResourceDescriptionArray(int i);
    
    /**
     * Returns number of "ResourceDescription" element
     */
    int sizeOfResourceDescriptionArray();
    
    /**
     * Sets array of all "ResourceDescription" element
     */
    void setResourceDescriptionArray(com.sap.xi.a1s.global.ServiceResourceDescription[] resourceDescriptionArray);
    
    /**
     * Sets ith "ResourceDescription" element
     */
    void setResourceDescriptionArray(int i, com.sap.xi.a1s.global.ServiceResourceDescription resourceDescription);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ResourceDescription" element
     */
    com.sap.xi.a1s.global.ServiceResourceDescription insertNewResourceDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ResourceDescription" element
     */
    com.sap.xi.a1s.global.ServiceResourceDescription addNewResourceDescription();
    
    /**
     * Removes the ith "ResourceDescription" element
     */
    void removeResourceDescription(int i);
    
    /**
     * Gets the "MainResource" element
     */
    boolean getMainResource();
    
    /**
     * Gets (as xml) the "MainResource" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetMainResource();
    
    /**
     * True if has "MainResource" element
     */
    boolean isSetMainResource();
    
    /**
     * Sets the "MainResource" element
     */
    void setMainResource(boolean mainResource);
    
    /**
     * Sets (as xml) the "MainResource" element
     */
    void xsetMainResource(com.sap.xi.ap.common.gdt.Indicator mainResource);
    
    /**
     * Unsets the "MainResource" element
     */
    void unsetMainResource();
    
    /**
     * Gets the "TotalConfirmedQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity getTotalConfirmedQuantity();
    
    /**
     * True if has "TotalConfirmedQuantity" element
     */
    boolean isSetTotalConfirmedQuantity();
    
    /**
     * Sets the "TotalConfirmedQuantity" element
     */
    void setTotalConfirmedQuantity(com.sap.xi.ap.common.gdt.Quantity totalConfirmedQuantity);
    
    /**
     * Appends and returns a new empty "TotalConfirmedQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity addNewTotalConfirmedQuantity();
    
    /**
     * Unsets the "TotalConfirmedQuantity" element
     */
    void unsetTotalConfirmedQuantity();
    
    /**
     * Gets the "ConfirmedQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity getConfirmedQuantity();
    
    /**
     * True if has "ConfirmedQuantity" element
     */
    boolean isSetConfirmedQuantity();
    
    /**
     * Sets the "ConfirmedQuantity" element
     */
    void setConfirmedQuantity(com.sap.xi.ap.common.gdt.Quantity confirmedQuantity);
    
    /**
     * Appends and returns a new empty "ConfirmedQuantity" element
     */
    com.sap.xi.ap.common.gdt.Quantity addNewConfirmedQuantity();
    
    /**
     * Unsets the "ConfirmedQuantity" element
     */
    void unsetConfirmedQuantity();
    
    /**
     * Gets the "ConfirmationFinished" element
     */
    boolean getConfirmationFinished();
    
    /**
     * Gets (as xml) the "ConfirmationFinished" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetConfirmationFinished();
    
    /**
     * True if has "ConfirmationFinished" element
     */
    boolean isSetConfirmationFinished();
    
    /**
     * Sets the "ConfirmationFinished" element
     */
    void setConfirmationFinished(boolean confirmationFinished);
    
    /**
     * Sets (as xml) the "ConfirmationFinished" element
     */
    void xsetConfirmationFinished(com.sap.xi.ap.common.gdt.Indicator confirmationFinished);
    
    /**
     * Unsets the "ConfirmationFinished" element
     */
    void unsetConfirmationFinished();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.ProductionLotServices newInstance() {
          return (com.sap.xi.a1s.global.ProductionLotServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotServices newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.ProductionLotServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.ProductionLotServices parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotServices parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.ProductionLotServices parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotServices parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotServices parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotServices parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotServices parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotServices parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotServices parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotServices parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotServices parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotServices parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotServices parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotServices parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotServices parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotServices parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotServices) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

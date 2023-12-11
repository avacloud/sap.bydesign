/*
 * XML Type:  MaterialOutputInspectionDetails
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialOutputInspectionDetails
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML MaterialOutputInspectionDetails(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface MaterialOutputInspectionDetails extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MaterialOutputInspectionDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE7274E74C1D219A67E80FDE53A95800C").resolveHandle("materialoutputinspectiondetailsdc04type");
    
    /**
     * Gets the "InspectionId" element
     */
    com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID getInspectionId();
    
    /**
     * True if has "InspectionId" element
     */
    boolean isSetInspectionId();
    
    /**
     * Sets the "InspectionId" element
     */
    void setInspectionId(com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID inspectionId);
    
    /**
     * Appends and returns a new empty "InspectionId" element
     */
    com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID addNewInspectionId();
    
    /**
     * Unsets the "InspectionId" element
     */
    void unsetInspectionId();
    
    /**
     * Gets the "InspectionTypeCode" element
     */
    com.sap.xi.ap.common.gdt.InspectionTypeCode getInspectionTypeCode();
    
    /**
     * True if has "InspectionTypeCode" element
     */
    boolean isSetInspectionTypeCode();
    
    /**
     * Sets the "InspectionTypeCode" element
     */
    void setInspectionTypeCode(com.sap.xi.ap.common.gdt.InspectionTypeCode inspectionTypeCode);
    
    /**
     * Appends and returns a new empty "InspectionTypeCode" element
     */
    com.sap.xi.ap.common.gdt.InspectionTypeCode addNewInspectionTypeCode();
    
    /**
     * Unsets the "InspectionTypeCode" element
     */
    void unsetInspectionTypeCode();
    
    /**
     * Gets the "LifeCycleStatusCode" element
     */
    com.sap.xi.ap.common.gdt.MaterialInspectionLifeCycleStatusCode.Enum getLifeCycleStatusCode();
    
    /**
     * Gets (as xml) the "LifeCycleStatusCode" element
     */
    com.sap.xi.ap.common.gdt.MaterialInspectionLifeCycleStatusCode xgetLifeCycleStatusCode();
    
    /**
     * True if has "LifeCycleStatusCode" element
     */
    boolean isSetLifeCycleStatusCode();
    
    /**
     * Sets the "LifeCycleStatusCode" element
     */
    void setLifeCycleStatusCode(com.sap.xi.ap.common.gdt.MaterialInspectionLifeCycleStatusCode.Enum lifeCycleStatusCode);
    
    /**
     * Sets (as xml) the "LifeCycleStatusCode" element
     */
    void xsetLifeCycleStatusCode(com.sap.xi.ap.common.gdt.MaterialInspectionLifeCycleStatusCode lifeCycleStatusCode);
    
    /**
     * Unsets the "LifeCycleStatusCode" element
     */
    void unsetLifeCycleStatusCode();
    
    /**
     * Gets the "InspectionSamplingDetails" element
     */
    com.sap.xi.a1s.global.InspectionSamplingDetails getInspectionSamplingDetails();
    
    /**
     * True if has "InspectionSamplingDetails" element
     */
    boolean isSetInspectionSamplingDetails();
    
    /**
     * Sets the "InspectionSamplingDetails" element
     */
    void setInspectionSamplingDetails(com.sap.xi.a1s.global.InspectionSamplingDetails inspectionSamplingDetails);
    
    /**
     * Appends and returns a new empty "InspectionSamplingDetails" element
     */
    com.sap.xi.a1s.global.InspectionSamplingDetails addNewInspectionSamplingDetails();
    
    /**
     * Unsets the "InspectionSamplingDetails" element
     */
    void unsetInspectionSamplingDetails();
    
    /**
     * Gets the "InspectionDetails" element
     */
    com.sap.xi.a1s.global.ProductionLotInspectionDetails getInspectionDetails();
    
    /**
     * True if has "InspectionDetails" element
     */
    boolean isSetInspectionDetails();
    
    /**
     * Sets the "InspectionDetails" element
     */
    void setInspectionDetails(com.sap.xi.a1s.global.ProductionLotInspectionDetails inspectionDetails);
    
    /**
     * Appends and returns a new empty "InspectionDetails" element
     */
    com.sap.xi.a1s.global.ProductionLotInspectionDetails addNewInspectionDetails();
    
    /**
     * Unsets the "InspectionDetails" element
     */
    void unsetInspectionDetails();
    
    /**
     * Gets the "InspectionDefects" element
     */
    com.sap.xi.a1s.global.ProductionLotDefects getInspectionDefects();
    
    /**
     * True if has "InspectionDefects" element
     */
    boolean isSetInspectionDefects();
    
    /**
     * Sets the "InspectionDefects" element
     */
    void setInspectionDefects(com.sap.xi.a1s.global.ProductionLotDefects inspectionDefects);
    
    /**
     * Appends and returns a new empty "InspectionDefects" element
     */
    com.sap.xi.a1s.global.ProductionLotDefects addNewInspectionDefects();
    
    /**
     * Unsets the "InspectionDefects" element
     */
    void unsetInspectionDefects();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.MaterialOutputInspectionDetails newInstance() {
          return (com.sap.xi.a1s.global.MaterialOutputInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputInspectionDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.MaterialOutputInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.MaterialOutputInspectionDetails parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialOutputInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputInspectionDetails parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialOutputInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.MaterialOutputInspectionDetails parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialOutputInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputInspectionDetails parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialOutputInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputInspectionDetails parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialOutputInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputInspectionDetails parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialOutputInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputInspectionDetails parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialOutputInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputInspectionDetails parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialOutputInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputInspectionDetails parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialOutputInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputInspectionDetails parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialOutputInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputInspectionDetails parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialOutputInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputInspectionDetails parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialOutputInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputInspectionDetails parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialOutputInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialOutputInspectionDetails parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialOutputInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialOutputInspectionDetails parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialOutputInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialOutputInspectionDetails parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialOutputInspectionDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

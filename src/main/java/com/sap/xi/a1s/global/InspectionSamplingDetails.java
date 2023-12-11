/*
 * XML Type:  InspectionSamplingDetails
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.InspectionSamplingDetails
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML InspectionSamplingDetails(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface InspectionSamplingDetails extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InspectionSamplingDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE7274E74C1D219A67E80FDE53A95800C").resolveHandle("inspectionsamplingdetailsf023type");
    
    /**
     * Gets the "ProductId" element
     */
    com.sap.xi.ap.common.gdt.ProductID getProductId();
    
    /**
     * True if has "ProductId" element
     */
    boolean isSetProductId();
    
    /**
     * Sets the "ProductId" element
     */
    void setProductId(com.sap.xi.ap.common.gdt.ProductID productId);
    
    /**
     * Appends and returns a new empty "ProductId" element
     */
    com.sap.xi.ap.common.gdt.ProductID addNewProductId();
    
    /**
     * Unsets the "ProductId" element
     */
    void unsetProductId();
    
    /**
     * Gets the "ProductDescription" element
     */
    java.lang.String getProductDescription();
    
    /**
     * Gets (as xml) the "ProductDescription" element
     */
    com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTSHORTDescription xgetProductDescription();
    
    /**
     * True if has "ProductDescription" element
     */
    boolean isSetProductDescription();
    
    /**
     * Sets the "ProductDescription" element
     */
    void setProductDescription(java.lang.String productDescription);
    
    /**
     * Sets (as xml) the "ProductDescription" element
     */
    void xsetProductDescription(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTSHORTDescription productDescription);
    
    /**
     * Unsets the "ProductDescription" element
     */
    void unsetProductDescription();
    
    /**
     * Gets the "IdentifiedStockId" element
     */
    com.sap.xi.ap.common.gdt.IdentifiedStockID getIdentifiedStockId();
    
    /**
     * True if has "IdentifiedStockId" element
     */
    boolean isSetIdentifiedStockId();
    
    /**
     * Sets the "IdentifiedStockId" element
     */
    void setIdentifiedStockId(com.sap.xi.ap.common.gdt.IdentifiedStockID identifiedStockId);
    
    /**
     * Appends and returns a new empty "IdentifiedStockId" element
     */
    com.sap.xi.ap.common.gdt.IdentifiedStockID addNewIdentifiedStockId();
    
    /**
     * Unsets the "IdentifiedStockId" element
     */
    void unsetIdentifiedStockId();
    
    /**
     * Gets the "IdentifiedStockType" element
     */
    com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode getIdentifiedStockType();
    
    /**
     * True if has "IdentifiedStockType" element
     */
    boolean isSetIdentifiedStockType();
    
    /**
     * Sets the "IdentifiedStockType" element
     */
    void setIdentifiedStockType(com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode identifiedStockType);
    
    /**
     * Appends and returns a new empty "IdentifiedStockType" element
     */
    com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode addNewIdentifiedStockType();
    
    /**
     * Unsets the "IdentifiedStockType" element
     */
    void unsetIdentifiedStockType();
    
    /**
     * Gets the "LotQuantity" element
     */
    com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity getLotQuantity();
    
    /**
     * True if has "LotQuantity" element
     */
    boolean isSetLotQuantity();
    
    /**
     * Sets the "LotQuantity" element
     */
    void setLotQuantity(com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity lotQuantity);
    
    /**
     * Appends and returns a new empty "LotQuantity" element
     */
    com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity addNewLotQuantity();
    
    /**
     * Unsets the "LotQuantity" element
     */
    void unsetLotQuantity();
    
    /**
     * Gets the "LotSize" element
     */
    com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity getLotSize();
    
    /**
     * True if has "LotSize" element
     */
    boolean isSetLotSize();
    
    /**
     * Sets the "LotSize" element
     */
    void setLotSize(com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity lotSize);
    
    /**
     * Appends and returns a new empty "LotSize" element
     */
    com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity addNewLotSize();
    
    /**
     * Unsets the "LotSize" element
     */
    void unsetLotSize();
    
    /**
     * Gets the "SampleSize" element
     */
    com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity getSampleSize();
    
    /**
     * True if has "SampleSize" element
     */
    boolean isSetSampleSize();
    
    /**
     * Sets the "SampleSize" element
     */
    void setSampleSize(com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity sampleSize);
    
    /**
     * Appends and returns a new empty "SampleSize" element
     */
    com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity addNewSampleSize();
    
    /**
     * Unsets the "SampleSize" element
     */
    void unsetSampleSize();
    
    /**
     * Gets the "SampleQuantity" element
     */
    com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity getSampleQuantity();
    
    /**
     * True if has "SampleQuantity" element
     */
    boolean isSetSampleQuantity();
    
    /**
     * Sets the "SampleQuantity" element
     */
    void setSampleQuantity(com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity sampleQuantity);
    
    /**
     * Appends and returns a new empty "SampleQuantity" element
     */
    com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity addNewSampleQuantity();
    
    /**
     * Unsets the "SampleQuantity" element
     */
    void unsetSampleQuantity();
    
    /**
     * Gets the "SampleRecords" element
     */
    boolean getSampleRecords();
    
    /**
     * Gets (as xml) the "SampleRecords" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetSampleRecords();
    
    /**
     * True if has "SampleRecords" element
     */
    boolean isSetSampleRecords();
    
    /**
     * Sets the "SampleRecords" element
     */
    void setSampleRecords(boolean sampleRecords);
    
    /**
     * Sets (as xml) the "SampleRecords" element
     */
    void xsetSampleRecords(com.sap.xi.ap.common.gdt.Indicator sampleRecords);
    
    /**
     * Unsets the "SampleRecords" element
     */
    void unsetSampleRecords();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.InspectionSamplingDetails newInstance() {
          return (com.sap.xi.a1s.global.InspectionSamplingDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.InspectionSamplingDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.InspectionSamplingDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.InspectionSamplingDetails parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.InspectionSamplingDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.InspectionSamplingDetails parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.InspectionSamplingDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.InspectionSamplingDetails parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.InspectionSamplingDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.InspectionSamplingDetails parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.InspectionSamplingDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.InspectionSamplingDetails parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.InspectionSamplingDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.InspectionSamplingDetails parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.InspectionSamplingDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.InspectionSamplingDetails parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.InspectionSamplingDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.InspectionSamplingDetails parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.InspectionSamplingDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.InspectionSamplingDetails parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.InspectionSamplingDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.InspectionSamplingDetails parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.InspectionSamplingDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.InspectionSamplingDetails parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.InspectionSamplingDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.InspectionSamplingDetails parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.InspectionSamplingDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.InspectionSamplingDetails parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.InspectionSamplingDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.InspectionSamplingDetails parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.InspectionSamplingDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.InspectionSamplingDetails parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.InspectionSamplingDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.InspectionSamplingDetails parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.InspectionSamplingDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

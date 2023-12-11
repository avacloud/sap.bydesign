/*
 * XML Type:  SiteLogisticsTaskSelectionByLabelID
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML SiteLogisticsTaskSelectionByLabelID(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface SiteLogisticsTaskSelectionByLabelID extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SiteLogisticsTaskSelectionByLabelID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE9B0AE413170F661B617BBDCDD60B0F1").resolveHandle("sitelogisticstaskselectionbylabelidfa4dtype");
    
    /**
     * Gets the "InclusionExclusionCode" element
     */
    java.lang.String getInclusionExclusionCode();
    
    /**
     * Gets (as xml) the "InclusionExclusionCode" element
     */
    com.sap.xi.ap.common.gdt.InclusionExclusionCode xgetInclusionExclusionCode();
    
    /**
     * True if has "InclusionExclusionCode" element
     */
    boolean isSetInclusionExclusionCode();
    
    /**
     * Sets the "InclusionExclusionCode" element
     */
    void setInclusionExclusionCode(java.lang.String inclusionExclusionCode);
    
    /**
     * Sets (as xml) the "InclusionExclusionCode" element
     */
    void xsetInclusionExclusionCode(com.sap.xi.ap.common.gdt.InclusionExclusionCode inclusionExclusionCode);
    
    /**
     * Unsets the "InclusionExclusionCode" element
     */
    void unsetInclusionExclusionCode();
    
    /**
     * Gets the "IntervalBoundaryTypeCode" element
     */
    java.lang.String getIntervalBoundaryTypeCode();
    
    /**
     * Gets (as xml) the "IntervalBoundaryTypeCode" element
     */
    com.sap.xi.ap.common.gdt.IntervalBoundaryTypeCode xgetIntervalBoundaryTypeCode();
    
    /**
     * True if has "IntervalBoundaryTypeCode" element
     */
    boolean isSetIntervalBoundaryTypeCode();
    
    /**
     * Sets the "IntervalBoundaryTypeCode" element
     */
    void setIntervalBoundaryTypeCode(java.lang.String intervalBoundaryTypeCode);
    
    /**
     * Sets (as xml) the "IntervalBoundaryTypeCode" element
     */
    void xsetIntervalBoundaryTypeCode(com.sap.xi.ap.common.gdt.IntervalBoundaryTypeCode intervalBoundaryTypeCode);
    
    /**
     * Unsets the "IntervalBoundaryTypeCode" element
     */
    void unsetIntervalBoundaryTypeCode();
    
    /**
     * Gets the "LowerBoundaryLabelID" element
     */
    com.sap.xi.ap.common.gdt.GoodsTagID getLowerBoundaryLabelID();
    
    /**
     * True if has "LowerBoundaryLabelID" element
     */
    boolean isSetLowerBoundaryLabelID();
    
    /**
     * Sets the "LowerBoundaryLabelID" element
     */
    void setLowerBoundaryLabelID(com.sap.xi.ap.common.gdt.GoodsTagID lowerBoundaryLabelID);
    
    /**
     * Appends and returns a new empty "LowerBoundaryLabelID" element
     */
    com.sap.xi.ap.common.gdt.GoodsTagID addNewLowerBoundaryLabelID();
    
    /**
     * Unsets the "LowerBoundaryLabelID" element
     */
    void unsetLowerBoundaryLabelID();
    
    /**
     * Gets the "UpperBoundaryLabelID" element
     */
    com.sap.xi.ap.common.gdt.GoodsTagID getUpperBoundaryLabelID();
    
    /**
     * True if has "UpperBoundaryLabelID" element
     */
    boolean isSetUpperBoundaryLabelID();
    
    /**
     * Sets the "UpperBoundaryLabelID" element
     */
    void setUpperBoundaryLabelID(com.sap.xi.ap.common.gdt.GoodsTagID upperBoundaryLabelID);
    
    /**
     * Appends and returns a new empty "UpperBoundaryLabelID" element
     */
    com.sap.xi.ap.common.gdt.GoodsTagID addNewUpperBoundaryLabelID();
    
    /**
     * Unsets the "UpperBoundaryLabelID" element
     */
    void unsetUpperBoundaryLabelID();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID newInstance() {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

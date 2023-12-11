/*
 * XML Type:  SiteLogisticsTaskSelectionByProcessingStatusCode
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML SiteLogisticsTaskSelectionByProcessingStatusCode(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface SiteLogisticsTaskSelectionByProcessingStatusCode extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SiteLogisticsTaskSelectionByProcessingStatusCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE9B0AE413170F661B617BBDCDD60B0F1").resolveHandle("sitelogisticstaskselectionbyprocessingstatuscodea034type");
    
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
     * Gets the "LowerBoundarySiteLogisticsProcessingStatusCode" element
     */
    com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum getLowerBoundarySiteLogisticsProcessingStatusCode();
    
    /**
     * Gets (as xml) the "LowerBoundarySiteLogisticsProcessingStatusCode" element
     */
    com.sap.xi.ap.common.gdt.ProcessingStatusCode xgetLowerBoundarySiteLogisticsProcessingStatusCode();
    
    /**
     * True if has "LowerBoundarySiteLogisticsProcessingStatusCode" element
     */
    boolean isSetLowerBoundarySiteLogisticsProcessingStatusCode();
    
    /**
     * Sets the "LowerBoundarySiteLogisticsProcessingStatusCode" element
     */
    void setLowerBoundarySiteLogisticsProcessingStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum lowerBoundarySiteLogisticsProcessingStatusCode);
    
    /**
     * Sets (as xml) the "LowerBoundarySiteLogisticsProcessingStatusCode" element
     */
    void xsetLowerBoundarySiteLogisticsProcessingStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode lowerBoundarySiteLogisticsProcessingStatusCode);
    
    /**
     * Unsets the "LowerBoundarySiteLogisticsProcessingStatusCode" element
     */
    void unsetLowerBoundarySiteLogisticsProcessingStatusCode();
    
    /**
     * Gets the "UpperBoundarySiteLogisticsProcessingStatusCode" element
     */
    com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum getUpperBoundarySiteLogisticsProcessingStatusCode();
    
    /**
     * Gets (as xml) the "UpperBoundarySiteLogisticsProcessingStatusCode" element
     */
    com.sap.xi.ap.common.gdt.ProcessingStatusCode xgetUpperBoundarySiteLogisticsProcessingStatusCode();
    
    /**
     * True if has "UpperBoundarySiteLogisticsProcessingStatusCode" element
     */
    boolean isSetUpperBoundarySiteLogisticsProcessingStatusCode();
    
    /**
     * Sets the "UpperBoundarySiteLogisticsProcessingStatusCode" element
     */
    void setUpperBoundarySiteLogisticsProcessingStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum upperBoundarySiteLogisticsProcessingStatusCode);
    
    /**
     * Sets (as xml) the "UpperBoundarySiteLogisticsProcessingStatusCode" element
     */
    void xsetUpperBoundarySiteLogisticsProcessingStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode upperBoundarySiteLogisticsProcessingStatusCode);
    
    /**
     * Unsets the "UpperBoundarySiteLogisticsProcessingStatusCode" element
     */
    void unsetUpperBoundarySiteLogisticsProcessingStatusCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode newInstance() {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

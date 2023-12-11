/*
 * XML Type:  SiteLogisticsTaskSelectionByBarCodeText
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML SiteLogisticsTaskSelectionByBarCodeText(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface SiteLogisticsTaskSelectionByBarCodeText extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SiteLogisticsTaskSelectionByBarCodeText.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1B636237ED4970D2FF229DCFE319F552").resolveHandle("sitelogisticstaskselectionbybarcodetext8eaftype");
    
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
     * Gets the "LowerBoundaryBarCodeText" element
     */
    java.lang.String getLowerBoundaryBarCodeText();
    
    /**
     * Gets (as xml) the "LowerBoundaryBarCodeText" element
     */
    com.sap.xi.ap.common.gdt.BarCodeText xgetLowerBoundaryBarCodeText();
    
    /**
     * True if has "LowerBoundaryBarCodeText" element
     */
    boolean isSetLowerBoundaryBarCodeText();
    
    /**
     * Sets the "LowerBoundaryBarCodeText" element
     */
    void setLowerBoundaryBarCodeText(java.lang.String lowerBoundaryBarCodeText);
    
    /**
     * Sets (as xml) the "LowerBoundaryBarCodeText" element
     */
    void xsetLowerBoundaryBarCodeText(com.sap.xi.ap.common.gdt.BarCodeText lowerBoundaryBarCodeText);
    
    /**
     * Unsets the "LowerBoundaryBarCodeText" element
     */
    void unsetLowerBoundaryBarCodeText();
    
    /**
     * Gets the "UpperBoundaryBarCodeText" element
     */
    java.lang.String getUpperBoundaryBarCodeText();
    
    /**
     * Gets (as xml) the "UpperBoundaryBarCodeText" element
     */
    com.sap.xi.ap.common.gdt.BarCodeText xgetUpperBoundaryBarCodeText();
    
    /**
     * True if has "UpperBoundaryBarCodeText" element
     */
    boolean isSetUpperBoundaryBarCodeText();
    
    /**
     * Sets the "UpperBoundaryBarCodeText" element
     */
    void setUpperBoundaryBarCodeText(java.lang.String upperBoundaryBarCodeText);
    
    /**
     * Sets (as xml) the "UpperBoundaryBarCodeText" element
     */
    void xsetUpperBoundaryBarCodeText(com.sap.xi.ap.common.gdt.BarCodeText upperBoundaryBarCodeText);
    
    /**
     * Unsets the "UpperBoundaryBarCodeText" element
     */
    void unsetUpperBoundaryBarCodeText();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText newInstance() {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

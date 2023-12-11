/*
 * XML Type:  MaterialByElementsResponseMaterialDeviantTaxClassification
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML MaterialByElementsResponseMaterialDeviantTaxClassification(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface MaterialByElementsResponseMaterialDeviantTaxClassification extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MaterialByElementsResponseMaterialDeviantTaxClassification.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B8FAE3D556F3A1A6A1FE3D414B4E0DE").resolveHandle("materialbyelementsresponsematerialdevianttaxclassification997dtype");
    
    /**
     * Gets the "CountryCode" element
     */
    java.lang.String getCountryCode();
    
    /**
     * Gets (as xml) the "CountryCode" element
     */
    com.sap.xi.ap.common.gdt.CountryCode xgetCountryCode();
    
    /**
     * True if has "CountryCode" element
     */
    boolean isSetCountryCode();
    
    /**
     * Sets the "CountryCode" element
     */
    void setCountryCode(java.lang.String countryCode);
    
    /**
     * Sets (as xml) the "CountryCode" element
     */
    void xsetCountryCode(com.sap.xi.ap.common.gdt.CountryCode countryCode);
    
    /**
     * Unsets the "CountryCode" element
     */
    void unsetCountryCode();
    
    /**
     * Gets the "RegionCode" element
     */
    com.sap.xi.ap.common.gdt.RegionCode getRegionCode();
    
    /**
     * True if has "RegionCode" element
     */
    boolean isSetRegionCode();
    
    /**
     * Sets the "RegionCode" element
     */
    void setRegionCode(com.sap.xi.ap.common.gdt.RegionCode regionCode);
    
    /**
     * Appends and returns a new empty "RegionCode" element
     */
    com.sap.xi.ap.common.gdt.RegionCode addNewRegionCode();
    
    /**
     * Unsets the "RegionCode" element
     */
    void unsetRegionCode();
    
    /**
     * Gets the "TaxTypeCode" element
     */
    com.sap.xi.ap.common.gdt.TaxTypeCode getTaxTypeCode();
    
    /**
     * True if has "TaxTypeCode" element
     */
    boolean isSetTaxTypeCode();
    
    /**
     * Sets the "TaxTypeCode" element
     */
    void setTaxTypeCode(com.sap.xi.ap.common.gdt.TaxTypeCode taxTypeCode);
    
    /**
     * Appends and returns a new empty "TaxTypeCode" element
     */
    com.sap.xi.ap.common.gdt.TaxTypeCode addNewTaxTypeCode();
    
    /**
     * Unsets the "TaxTypeCode" element
     */
    void unsetTaxTypeCode();
    
    /**
     * Gets the "TaxRateTypeCode" element
     */
    com.sap.xi.ap.common.gdt.TaxRateTypeCode getTaxRateTypeCode();
    
    /**
     * True if has "TaxRateTypeCode" element
     */
    boolean isSetTaxRateTypeCode();
    
    /**
     * Sets the "TaxRateTypeCode" element
     */
    void setTaxRateTypeCode(com.sap.xi.ap.common.gdt.TaxRateTypeCode taxRateTypeCode);
    
    /**
     * Appends and returns a new empty "TaxRateTypeCode" element
     */
    com.sap.xi.ap.common.gdt.TaxRateTypeCode addNewTaxRateTypeCode();
    
    /**
     * Unsets the "TaxRateTypeCode" element
     */
    void unsetTaxRateTypeCode();
    
    /**
     * Gets the "TaxExemptionReasonCode" element
     */
    com.sap.xi.ap.common.gdt.TaxExemptionReasonCode getTaxExemptionReasonCode();
    
    /**
     * True if has "TaxExemptionReasonCode" element
     */
    boolean isSetTaxExemptionReasonCode();
    
    /**
     * Sets the "TaxExemptionReasonCode" element
     */
    void setTaxExemptionReasonCode(com.sap.xi.ap.common.gdt.TaxExemptionReasonCode taxExemptionReasonCode);
    
    /**
     * Appends and returns a new empty "TaxExemptionReasonCode" element
     */
    com.sap.xi.ap.common.gdt.TaxExemptionReasonCode addNewTaxExemptionReasonCode();
    
    /**
     * Unsets the "TaxExemptionReasonCode" element
     */
    void unsetTaxExemptionReasonCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification newInstance() {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

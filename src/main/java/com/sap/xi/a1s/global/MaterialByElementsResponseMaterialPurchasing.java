/*
 * XML Type:  MaterialByElementsResponseMaterialPurchasing
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML MaterialByElementsResponseMaterialPurchasing(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface MaterialByElementsResponseMaterialPurchasing extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MaterialByElementsResponseMaterialPurchasing.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B8FAE3D556F3A1A6A1FE3D414B4E0DE").resolveHandle("materialbyelementsresponsematerialpurchasing8fbdtype");
    
    /**
     * Gets the "LifeCycleStatusCode" element
     */
    com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode.Enum getLifeCycleStatusCode();
    
    /**
     * Gets (as xml) the "LifeCycleStatusCode" element
     */
    com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode xgetLifeCycleStatusCode();
    
    /**
     * True if has "LifeCycleStatusCode" element
     */
    boolean isSetLifeCycleStatusCode();
    
    /**
     * Sets the "LifeCycleStatusCode" element
     */
    void setLifeCycleStatusCode(com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode.Enum lifeCycleStatusCode);
    
    /**
     * Sets (as xml) the "LifeCycleStatusCode" element
     */
    void xsetLifeCycleStatusCode(com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode lifeCycleStatusCode);
    
    /**
     * Unsets the "LifeCycleStatusCode" element
     */
    void unsetLifeCycleStatusCode();
    
    /**
     * Gets the "PurchasingMeasureUnitCode" element
     */
    java.lang.String getPurchasingMeasureUnitCode();
    
    /**
     * Gets (as xml) the "PurchasingMeasureUnitCode" element
     */
    com.sap.xi.ap.common.gdt.MeasureUnitCode xgetPurchasingMeasureUnitCode();
    
    /**
     * True if has "PurchasingMeasureUnitCode" element
     */
    boolean isSetPurchasingMeasureUnitCode();
    
    /**
     * Sets the "PurchasingMeasureUnitCode" element
     */
    void setPurchasingMeasureUnitCode(java.lang.String purchasingMeasureUnitCode);
    
    /**
     * Sets (as xml) the "PurchasingMeasureUnitCode" element
     */
    void xsetPurchasingMeasureUnitCode(com.sap.xi.ap.common.gdt.MeasureUnitCode purchasingMeasureUnitCode);
    
    /**
     * Unsets the "PurchasingMeasureUnitCode" element
     */
    void unsetPurchasingMeasureUnitCode();
    
    /**
     * Gets array of all "InternalNote" elements
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText[] getInternalNoteArray();
    
    /**
     * Gets ith "InternalNote" element
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText getInternalNoteArray(int i);
    
    /**
     * Returns number of "InternalNote" element
     */
    int sizeOfInternalNoteArray();
    
    /**
     * Sets array of all "InternalNote" element
     */
    void setInternalNoteArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText[] internalNoteArray);
    
    /**
     * Sets ith "InternalNote" element
     */
    void setInternalNoteArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText internalNote);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "InternalNote" element
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText insertNewInternalNote(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "InternalNote" element
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText addNewInternalNote();
    
    /**
     * Removes the ith "InternalNote" element
     */
    void removeInternalNote(int i);
    
    /**
     * Gets array of all "PurchasingNote" elements
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText[] getPurchasingNoteArray();
    
    /**
     * Gets ith "PurchasingNote" element
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText getPurchasingNoteArray(int i);
    
    /**
     * Returns number of "PurchasingNote" element
     */
    int sizeOfPurchasingNoteArray();
    
    /**
     * Sets array of all "PurchasingNote" element
     */
    void setPurchasingNoteArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText[] purchasingNoteArray);
    
    /**
     * Sets ith "PurchasingNote" element
     */
    void setPurchasingNoteArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText purchasingNote);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PurchasingNote" element
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText insertNewPurchasingNote(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PurchasingNote" element
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText addNewPurchasingNote();
    
    /**
     * Removes the ith "PurchasingNote" element
     */
    void removePurchasingNote(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing newInstance() {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPurchasing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

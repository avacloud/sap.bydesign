/*
 * XML Type:  SiteLogisticsTaskSelectionByElements
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML SiteLogisticsTaskSelectionByElements(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface SiteLogisticsTaskSelectionByElements extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SiteLogisticsTaskSelectionByElements.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1B636237ED4970D2FF229DCFE319F552").resolveHandle("sitelogisticstaskselectionbyelements914ftype");
    
    /**
     * Gets array of all "SelectionBySiteLogisticsTaskID" elements
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByTaskId[] getSelectionBySiteLogisticsTaskIDArray();
    
    /**
     * Gets ith "SelectionBySiteLogisticsTaskID" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByTaskId getSelectionBySiteLogisticsTaskIDArray(int i);
    
    /**
     * Returns number of "SelectionBySiteLogisticsTaskID" element
     */
    int sizeOfSelectionBySiteLogisticsTaskIDArray();
    
    /**
     * Sets array of all "SelectionBySiteLogisticsTaskID" element
     */
    void setSelectionBySiteLogisticsTaskIDArray(com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByTaskId[] selectionBySiteLogisticsTaskIDArray);
    
    /**
     * Sets ith "SelectionBySiteLogisticsTaskID" element
     */
    void setSelectionBySiteLogisticsTaskIDArray(int i, com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByTaskId selectionBySiteLogisticsTaskID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionBySiteLogisticsTaskID" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByTaskId insertNewSelectionBySiteLogisticsTaskID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionBySiteLogisticsTaskID" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByTaskId addNewSelectionBySiteLogisticsTaskID();
    
    /**
     * Removes the ith "SelectionBySiteLogisticsTaskID" element
     */
    void removeSelectionBySiteLogisticsTaskID(int i);
    
    /**
     * Gets array of all "SelectionByReferenceDocumentID" elements
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLotID[] getSelectionByReferenceDocumentIDArray();
    
    /**
     * Gets ith "SelectionByReferenceDocumentID" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLotID getSelectionByReferenceDocumentIDArray(int i);
    
    /**
     * Returns number of "SelectionByReferenceDocumentID" element
     */
    int sizeOfSelectionByReferenceDocumentIDArray();
    
    /**
     * Sets array of all "SelectionByReferenceDocumentID" element
     */
    void setSelectionByReferenceDocumentIDArray(com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLotID[] selectionByReferenceDocumentIDArray);
    
    /**
     * Sets ith "SelectionByReferenceDocumentID" element
     */
    void setSelectionByReferenceDocumentIDArray(int i, com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLotID selectionByReferenceDocumentID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByReferenceDocumentID" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLotID insertNewSelectionByReferenceDocumentID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByReferenceDocumentID" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLotID addNewSelectionByReferenceDocumentID();
    
    /**
     * Removes the ith "SelectionByReferenceDocumentID" element
     */
    void removeSelectionByReferenceDocumentID(int i);
    
    /**
     * Gets array of all "SelectionByReferenceDocumentTypeCode" elements
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByRefDocTypeCode[] getSelectionByReferenceDocumentTypeCodeArray();
    
    /**
     * Gets ith "SelectionByReferenceDocumentTypeCode" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByRefDocTypeCode getSelectionByReferenceDocumentTypeCodeArray(int i);
    
    /**
     * Returns number of "SelectionByReferenceDocumentTypeCode" element
     */
    int sizeOfSelectionByReferenceDocumentTypeCodeArray();
    
    /**
     * Sets array of all "SelectionByReferenceDocumentTypeCode" element
     */
    void setSelectionByReferenceDocumentTypeCodeArray(com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByRefDocTypeCode[] selectionByReferenceDocumentTypeCodeArray);
    
    /**
     * Sets ith "SelectionByReferenceDocumentTypeCode" element
     */
    void setSelectionByReferenceDocumentTypeCodeArray(int i, com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByRefDocTypeCode selectionByReferenceDocumentTypeCode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByReferenceDocumentTypeCode" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByRefDocTypeCode insertNewSelectionByReferenceDocumentTypeCode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByReferenceDocumentTypeCode" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByRefDocTypeCode addNewSelectionByReferenceDocumentTypeCode();
    
    /**
     * Removes the ith "SelectionByReferenceDocumentTypeCode" element
     */
    void removeSelectionByReferenceDocumentTypeCode(int i);
    
    /**
     * Gets the "SelectionByProcessTypeCode" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessTypeCode getSelectionByProcessTypeCode();
    
    /**
     * True if has "SelectionByProcessTypeCode" element
     */
    boolean isSetSelectionByProcessTypeCode();
    
    /**
     * Sets the "SelectionByProcessTypeCode" element
     */
    void setSelectionByProcessTypeCode(com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessTypeCode selectionByProcessTypeCode);
    
    /**
     * Appends and returns a new empty "SelectionByProcessTypeCode" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessTypeCode addNewSelectionByProcessTypeCode();
    
    /**
     * Unsets the "SelectionByProcessTypeCode" element
     */
    void unsetSelectionByProcessTypeCode();
    
    /**
     * Gets array of all "SelectionByMaterialDescription" elements
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByMaterialDescription[] getSelectionByMaterialDescriptionArray();
    
    /**
     * Gets ith "SelectionByMaterialDescription" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByMaterialDescription getSelectionByMaterialDescriptionArray(int i);
    
    /**
     * Returns number of "SelectionByMaterialDescription" element
     */
    int sizeOfSelectionByMaterialDescriptionArray();
    
    /**
     * Sets array of all "SelectionByMaterialDescription" element
     */
    void setSelectionByMaterialDescriptionArray(com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByMaterialDescription[] selectionByMaterialDescriptionArray);
    
    /**
     * Sets ith "SelectionByMaterialDescription" element
     */
    void setSelectionByMaterialDescriptionArray(int i, com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByMaterialDescription selectionByMaterialDescription);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByMaterialDescription" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByMaterialDescription insertNewSelectionByMaterialDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByMaterialDescription" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByMaterialDescription addNewSelectionByMaterialDescription();
    
    /**
     * Removes the ith "SelectionByMaterialDescription" element
     */
    void removeSelectionByMaterialDescription(int i);
    
    /**
     * Gets array of all "SelectionByBarCodeText" elements
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText[] getSelectionByBarCodeTextArray();
    
    /**
     * Gets ith "SelectionByBarCodeText" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText getSelectionByBarCodeTextArray(int i);
    
    /**
     * Returns number of "SelectionByBarCodeText" element
     */
    int sizeOfSelectionByBarCodeTextArray();
    
    /**
     * Sets array of all "SelectionByBarCodeText" element
     */
    void setSelectionByBarCodeTextArray(com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText[] selectionByBarCodeTextArray);
    
    /**
     * Sets ith "SelectionByBarCodeText" element
     */
    void setSelectionByBarCodeTextArray(int i, com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText selectionByBarCodeText);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByBarCodeText" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText insertNewSelectionByBarCodeText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByBarCodeText" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByBarCodeText addNewSelectionByBarCodeText();
    
    /**
     * Removes the ith "SelectionByBarCodeText" element
     */
    void removeSelectionByBarCodeText(int i);
    
    /**
     * Gets array of all "SelectionByLabelID" elements
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID[] getSelectionByLabelIDArray();
    
    /**
     * Gets ith "SelectionByLabelID" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID getSelectionByLabelIDArray(int i);
    
    /**
     * Returns number of "SelectionByLabelID" element
     */
    int sizeOfSelectionByLabelIDArray();
    
    /**
     * Sets array of all "SelectionByLabelID" element
     */
    void setSelectionByLabelIDArray(com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID[] selectionByLabelIDArray);
    
    /**
     * Sets ith "SelectionByLabelID" element
     */
    void setSelectionByLabelIDArray(int i, com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID selectionByLabelID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByLabelID" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID insertNewSelectionByLabelID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByLabelID" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByLabelID addNewSelectionByLabelID();
    
    /**
     * Removes the ith "SelectionByLabelID" element
     */
    void removeSelectionByLabelID(int i);
    
    /**
     * Gets array of all "SelectionByResponsibleEmployeeID" elements
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByResponsibleEmployeeID[] getSelectionByResponsibleEmployeeIDArray();
    
    /**
     * Gets ith "SelectionByResponsibleEmployeeID" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByResponsibleEmployeeID getSelectionByResponsibleEmployeeIDArray(int i);
    
    /**
     * Returns number of "SelectionByResponsibleEmployeeID" element
     */
    int sizeOfSelectionByResponsibleEmployeeIDArray();
    
    /**
     * Sets array of all "SelectionByResponsibleEmployeeID" element
     */
    void setSelectionByResponsibleEmployeeIDArray(com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByResponsibleEmployeeID[] selectionByResponsibleEmployeeIDArray);
    
    /**
     * Sets ith "SelectionByResponsibleEmployeeID" element
     */
    void setSelectionByResponsibleEmployeeIDArray(int i, com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByResponsibleEmployeeID selectionByResponsibleEmployeeID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByResponsibleEmployeeID" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByResponsibleEmployeeID insertNewSelectionByResponsibleEmployeeID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByResponsibleEmployeeID" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByResponsibleEmployeeID addNewSelectionByResponsibleEmployeeID();
    
    /**
     * Removes the ith "SelectionByResponsibleEmployeeID" element
     */
    void removeSelectionByResponsibleEmployeeID(int i);
    
    /**
     * Gets array of all "SelectionByProcessingStatusCode" elements
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode[] getSelectionByProcessingStatusCodeArray();
    
    /**
     * Gets ith "SelectionByProcessingStatusCode" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode getSelectionByProcessingStatusCodeArray(int i);
    
    /**
     * Returns number of "SelectionByProcessingStatusCode" element
     */
    int sizeOfSelectionByProcessingStatusCodeArray();
    
    /**
     * Sets array of all "SelectionByProcessingStatusCode" element
     */
    void setSelectionByProcessingStatusCodeArray(com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode[] selectionByProcessingStatusCodeArray);
    
    /**
     * Sets ith "SelectionByProcessingStatusCode" element
     */
    void setSelectionByProcessingStatusCodeArray(int i, com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode selectionByProcessingStatusCode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByProcessingStatusCode" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode insertNewSelectionByProcessingStatusCode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByProcessingStatusCode" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByProcessingStatusCode addNewSelectionByProcessingStatusCode();
    
    /**
     * Removes the ith "SelectionByProcessingStatusCode" element
     */
    void removeSelectionByProcessingStatusCode(int i);
    
    /**
     * Gets array of all "SelectionBySiteID" elements
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionBySiteID[] getSelectionBySiteIDArray();
    
    /**
     * Gets ith "SelectionBySiteID" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionBySiteID getSelectionBySiteIDArray(int i);
    
    /**
     * Returns number of "SelectionBySiteID" element
     */
    int sizeOfSelectionBySiteIDArray();
    
    /**
     * Sets array of all "SelectionBySiteID" element
     */
    void setSelectionBySiteIDArray(com.sap.xi.a1s.global.SiteLogisticsTaskSelectionBySiteID[] selectionBySiteIDArray);
    
    /**
     * Sets ith "SelectionBySiteID" element
     */
    void setSelectionBySiteIDArray(int i, com.sap.xi.a1s.global.SiteLogisticsTaskSelectionBySiteID selectionBySiteID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionBySiteID" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionBySiteID insertNewSelectionBySiteID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionBySiteID" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskSelectionBySiteID addNewSelectionBySiteID();
    
    /**
     * Removes the ith "SelectionBySiteID" element
     */
    void removeSelectionBySiteID(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements newInstance() {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskSelectionByElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

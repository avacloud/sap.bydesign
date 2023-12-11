/*
 * XML Type:  MaintenanceAttachmentFolderDocumentProperty
 * Namespace: http://sap.com/xi/DocumentServices/Global
 * Java type: com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.documentservices.global;


/**
 * An XML MaintenanceAttachmentFolderDocumentProperty(@http://sap.com/xi/DocumentServices/Global).
 *
 * This is a complex type.
 */
public interface MaintenanceAttachmentFolderDocumentProperty extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MaintenanceAttachmentFolderDocumentProperty.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB771E6A4E5734821943EC48117D8A797").resolveHandle("maintenanceattachmentfolderdocumentproperty21d2type");
    
    /**
     * Gets the "TechnicalID" element
     */
    java.lang.String getTechnicalID();
    
    /**
     * Gets (as xml) the "TechnicalID" element
     */
    com.sap.xi.ap.common.gdt.ObjectNodeTechnicalID xgetTechnicalID();
    
    /**
     * True if has "TechnicalID" element
     */
    boolean isSetTechnicalID();
    
    /**
     * Sets the "TechnicalID" element
     */
    void setTechnicalID(java.lang.String technicalID);
    
    /**
     * Sets (as xml) the "TechnicalID" element
     */
    void xsetTechnicalID(com.sap.xi.ap.common.gdt.ObjectNodeTechnicalID technicalID);
    
    /**
     * Unsets the "TechnicalID" element
     */
    void unsetTechnicalID();
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName xgetName();
    
    /**
     * True if has "Name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName name);
    
    /**
     * Unsets the "Name" element
     */
    void unsetName();
    
    /**
     * Gets the "DataTypeFormatCode" element
     */
    java.lang.String getDataTypeFormatCode();
    
    /**
     * Gets (as xml) the "DataTypeFormatCode" element
     */
    com.sap.xi.ap.common.gdt.PropertyDataTypeFormatCode xgetDataTypeFormatCode();
    
    /**
     * True if has "DataTypeFormatCode" element
     */
    boolean isSetDataTypeFormatCode();
    
    /**
     * Sets the "DataTypeFormatCode" element
     */
    void setDataTypeFormatCode(java.lang.String dataTypeFormatCode);
    
    /**
     * Sets (as xml) the "DataTypeFormatCode" element
     */
    void xsetDataTypeFormatCode(com.sap.xi.ap.common.gdt.PropertyDataTypeFormatCode dataTypeFormatCode);
    
    /**
     * Unsets the "DataTypeFormatCode" element
     */
    void unsetDataTypeFormatCode();
    
    /**
     * Gets the "VisibleIndicator" element
     */
    boolean getVisibleIndicator();
    
    /**
     * Gets (as xml) the "VisibleIndicator" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetVisibleIndicator();
    
    /**
     * True if has "VisibleIndicator" element
     */
    boolean isSetVisibleIndicator();
    
    /**
     * Sets the "VisibleIndicator" element
     */
    void setVisibleIndicator(boolean visibleIndicator);
    
    /**
     * Sets (as xml) the "VisibleIndicator" element
     */
    void xsetVisibleIndicator(com.sap.xi.ap.common.gdt.Indicator visibleIndicator);
    
    /**
     * Unsets the "VisibleIndicator" element
     */
    void unsetVisibleIndicator();
    
    /**
     * Gets the "ChangeAllowedIndicator" element
     */
    boolean getChangeAllowedIndicator();
    
    /**
     * Gets (as xml) the "ChangeAllowedIndicator" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetChangeAllowedIndicator();
    
    /**
     * True if has "ChangeAllowedIndicator" element
     */
    boolean isSetChangeAllowedIndicator();
    
    /**
     * Sets the "ChangeAllowedIndicator" element
     */
    void setChangeAllowedIndicator(boolean changeAllowedIndicator);
    
    /**
     * Sets (as xml) the "ChangeAllowedIndicator" element
     */
    void xsetChangeAllowedIndicator(com.sap.xi.ap.common.gdt.Indicator changeAllowedIndicator);
    
    /**
     * Unsets the "ChangeAllowedIndicator" element
     */
    void unsetChangeAllowedIndicator();
    
    /**
     * Gets the "MultipleValueIndicator" element
     */
    boolean getMultipleValueIndicator();
    
    /**
     * Gets (as xml) the "MultipleValueIndicator" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetMultipleValueIndicator();
    
    /**
     * True if has "MultipleValueIndicator" element
     */
    boolean isSetMultipleValueIndicator();
    
    /**
     * Sets the "MultipleValueIndicator" element
     */
    void setMultipleValueIndicator(boolean multipleValueIndicator);
    
    /**
     * Sets (as xml) the "MultipleValueIndicator" element
     */
    void xsetMultipleValueIndicator(com.sap.xi.ap.common.gdt.Indicator multipleValueIndicator);
    
    /**
     * Unsets the "MultipleValueIndicator" element
     */
    void unsetMultipleValueIndicator();
    
    /**
     * Gets the "NamespaceURI" element
     */
    com.sap.xi.ap.common.gdt.NamespaceURI getNamespaceURI();
    
    /**
     * True if has "NamespaceURI" element
     */
    boolean isSetNamespaceURI();
    
    /**
     * Sets the "NamespaceURI" element
     */
    void setNamespaceURI(com.sap.xi.ap.common.gdt.NamespaceURI namespaceURI);
    
    /**
     * Appends and returns a new empty "NamespaceURI" element
     */
    com.sap.xi.ap.common.gdt.NamespaceURI addNewNamespaceURI();
    
    /**
     * Unsets the "NamespaceURI" element
     */
    void unsetNamespaceURI();
    
    /**
     * Gets the "Description" element
     */
    com.sap.xi.ap.common.gdt.Description getDescription();
    
    /**
     * True if has "Description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "Description" element
     */
    void setDescription(com.sap.xi.ap.common.gdt.Description description);
    
    /**
     * Appends and returns a new empty "Description" element
     */
    com.sap.xi.ap.common.gdt.Description addNewDescription();
    
    /**
     * Unsets the "Description" element
     */
    void unsetDescription();
    
    /**
     * Gets array of all "PropertyValue" elements
     */
    com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentPropertyPropertyValue[] getPropertyValueArray();
    
    /**
     * Gets ith "PropertyValue" element
     */
    com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentPropertyPropertyValue getPropertyValueArray(int i);
    
    /**
     * Returns number of "PropertyValue" element
     */
    int sizeOfPropertyValueArray();
    
    /**
     * Sets array of all "PropertyValue" element
     */
    void setPropertyValueArray(com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentPropertyPropertyValue[] propertyValueArray);
    
    /**
     * Sets ith "PropertyValue" element
     */
    void setPropertyValueArray(int i, com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentPropertyPropertyValue propertyValue);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PropertyValue" element
     */
    com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentPropertyPropertyValue insertNewPropertyValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PropertyValue" element
     */
    com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentPropertyPropertyValue addNewPropertyValue();
    
    /**
     * Removes the ith "PropertyValue" element
     */
    void removePropertyValue(int i);
    
    /**
     * Gets the "PropertyValueListCompleteTransmissionIndicator" attribute
     */
    boolean getPropertyValueListCompleteTransmissionIndicator();
    
    /**
     * Gets (as xml) the "PropertyValueListCompleteTransmissionIndicator" attribute
     */
    com.sap.xi.ap.common.gdt.Indicator xgetPropertyValueListCompleteTransmissionIndicator();
    
    /**
     * True if has "PropertyValueListCompleteTransmissionIndicator" attribute
     */
    boolean isSetPropertyValueListCompleteTransmissionIndicator();
    
    /**
     * Sets the "PropertyValueListCompleteTransmissionIndicator" attribute
     */
    void setPropertyValueListCompleteTransmissionIndicator(boolean propertyValueListCompleteTransmissionIndicator);
    
    /**
     * Sets (as xml) the "PropertyValueListCompleteTransmissionIndicator" attribute
     */
    void xsetPropertyValueListCompleteTransmissionIndicator(com.sap.xi.ap.common.gdt.Indicator propertyValueListCompleteTransmissionIndicator);
    
    /**
     * Unsets the "PropertyValueListCompleteTransmissionIndicator" attribute
     */
    void unsetPropertyValueListCompleteTransmissionIndicator();
    
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
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty newInstance() {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

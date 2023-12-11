/*
 * XML Type:  MaintenanceAttachmentFolderDocument
 * Namespace: http://sap.com/xi/DocumentServices/Global
 * Java type: com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.documentservices.global;


/**
 * An XML MaintenanceAttachmentFolderDocument(@http://sap.com/xi/DocumentServices/Global).
 *
 * This is a complex type.
 */
public interface MaintenanceAttachmentFolderDocument1 extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MaintenanceAttachmentFolderDocument1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB771E6A4E5734821943EC48117D8A797").resolveHandle("maintenanceattachmentfolderdocumentb81dtype");
    
    /**
     * Gets the "UUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getUUID();
    
    /**
     * True if has "UUID" element
     */
    boolean isSetUUID();
    
    /**
     * Sets the "UUID" element
     */
    void setUUID(com.sap.xi.ap.common.gdt.UUID uuid);
    
    /**
     * Appends and returns a new empty "UUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewUUID();
    
    /**
     * Unsets the "UUID" element
     */
    void unsetUUID();
    
    /**
     * Gets the "LinkInternalIndicator" element
     */
    boolean getLinkInternalIndicator();
    
    /**
     * Gets (as xml) the "LinkInternalIndicator" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetLinkInternalIndicator();
    
    /**
     * True if has "LinkInternalIndicator" element
     */
    boolean isSetLinkInternalIndicator();
    
    /**
     * Sets the "LinkInternalIndicator" element
     */
    void setLinkInternalIndicator(boolean linkInternalIndicator);
    
    /**
     * Sets (as xml) the "LinkInternalIndicator" element
     */
    void xsetLinkInternalIndicator(com.sap.xi.ap.common.gdt.Indicator linkInternalIndicator);
    
    /**
     * Unsets the "LinkInternalIndicator" element
     */
    void unsetLinkInternalIndicator();
    
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
     * Gets the "CategoryCode" element
     */
    java.lang.String getCategoryCode();
    
    /**
     * Gets (as xml) the "CategoryCode" element
     */
    com.sap.xi.ap.common.gdt.DocumentCategoryCode xgetCategoryCode();
    
    /**
     * True if has "CategoryCode" element
     */
    boolean isSetCategoryCode();
    
    /**
     * Sets the "CategoryCode" element
     */
    void setCategoryCode(java.lang.String categoryCode);
    
    /**
     * Sets (as xml) the "CategoryCode" element
     */
    void xsetCategoryCode(com.sap.xi.ap.common.gdt.DocumentCategoryCode categoryCode);
    
    /**
     * Unsets the "CategoryCode" element
     */
    void unsetCategoryCode();
    
    /**
     * Gets the "TypeCode" element
     */
    com.sap.xi.ap.common.gdt.DocumentTypeCode getTypeCode();
    
    /**
     * True if has "TypeCode" element
     */
    boolean isSetTypeCode();
    
    /**
     * Sets the "TypeCode" element
     */
    void setTypeCode(com.sap.xi.ap.common.gdt.DocumentTypeCode typeCode);
    
    /**
     * Appends and returns a new empty "TypeCode" element
     */
    com.sap.xi.ap.common.gdt.DocumentTypeCode addNewTypeCode();
    
    /**
     * Unsets the "TypeCode" element
     */
    void unsetTypeCode();
    
    /**
     * Gets the "MIMECode" element
     */
    java.lang.String getMIMECode();
    
    /**
     * Gets (as xml) the "MIMECode" element
     */
    com.sap.xi.ap.common.gdt.MIMECode xgetMIMECode();
    
    /**
     * True if has "MIMECode" element
     */
    boolean isSetMIMECode();
    
    /**
     * Sets the "MIMECode" element
     */
    void setMIMECode(java.lang.String mimeCode);
    
    /**
     * Sets (as xml) the "MIMECode" element
     */
    void xsetMIMECode(com.sap.xi.ap.common.gdt.MIMECode mimeCode);
    
    /**
     * Unsets the "MIMECode" element
     */
    void unsetMIMECode();
    
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
     * Gets the "AlternativeName" element
     */
    java.lang.String getAlternativeName();
    
    /**
     * Gets (as xml) the "AlternativeName" element
     */
    com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName xgetAlternativeName();
    
    /**
     * True if has "AlternativeName" element
     */
    boolean isSetAlternativeName();
    
    /**
     * Sets the "AlternativeName" element
     */
    void setAlternativeName(java.lang.String alternativeName);
    
    /**
     * Sets (as xml) the "AlternativeName" element
     */
    void xsetAlternativeName(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName alternativeName);
    
    /**
     * Unsets the "AlternativeName" element
     */
    void unsetAlternativeName();
    
    /**
     * Gets the "InternalLinkUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getInternalLinkUUID();
    
    /**
     * True if has "InternalLinkUUID" element
     */
    boolean isSetInternalLinkUUID();
    
    /**
     * Sets the "InternalLinkUUID" element
     */
    void setInternalLinkUUID(com.sap.xi.ap.common.gdt.UUID internalLinkUUID);
    
    /**
     * Appends and returns a new empty "InternalLinkUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewInternalLinkUUID();
    
    /**
     * Unsets the "InternalLinkUUID" element
     */
    void unsetInternalLinkUUID();
    
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
     * Gets the "ExternalLinkWebURI" element
     */
    java.lang.String getExternalLinkWebURI();
    
    /**
     * Gets (as xml) the "ExternalLinkWebURI" element
     */
    com.sap.xi.ap.common.gdt.WebURI xgetExternalLinkWebURI();
    
    /**
     * True if has "ExternalLinkWebURI" element
     */
    boolean isSetExternalLinkWebURI();
    
    /**
     * Sets the "ExternalLinkWebURI" element
     */
    void setExternalLinkWebURI(java.lang.String externalLinkWebURI);
    
    /**
     * Sets (as xml) the "ExternalLinkWebURI" element
     */
    void xsetExternalLinkWebURI(com.sap.xi.ap.common.gdt.WebURI externalLinkWebURI);
    
    /**
     * Unsets the "ExternalLinkWebURI" element
     */
    void unsetExternalLinkWebURI();
    
    /**
     * Gets array of all "Property" elements
     */
    com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty[] getPropertyArray();
    
    /**
     * Gets ith "Property" element
     */
    com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty getPropertyArray(int i);
    
    /**
     * Returns number of "Property" element
     */
    int sizeOfPropertyArray();
    
    /**
     * Sets array of all "Property" element
     */
    void setPropertyArray(com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty[] propertyArray);
    
    /**
     * Sets ith "Property" element
     */
    void setPropertyArray(int i, com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty property);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Property" element
     */
    com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty insertNewProperty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Property" element
     */
    com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentProperty addNewProperty();
    
    /**
     * Removes the ith "Property" element
     */
    void removeProperty(int i);
    
    /**
     * Gets the "FileContent" element
     */
    com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentFileContent getFileContent();
    
    /**
     * True if has "FileContent" element
     */
    boolean isSetFileContent();
    
    /**
     * Sets the "FileContent" element
     */
    void setFileContent(com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentFileContent fileContent);
    
    /**
     * Appends and returns a new empty "FileContent" element
     */
    com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocumentFileContent addNewFileContent();
    
    /**
     * Unsets the "FileContent" element
     */
    void unsetFileContent();
    
    /**
     * Gets the "PropertyListCompleteTransmissionIndicator" attribute
     */
    boolean getPropertyListCompleteTransmissionIndicator();
    
    /**
     * Gets (as xml) the "PropertyListCompleteTransmissionIndicator" attribute
     */
    com.sap.xi.ap.common.gdt.Indicator xgetPropertyListCompleteTransmissionIndicator();
    
    /**
     * True if has "PropertyListCompleteTransmissionIndicator" attribute
     */
    boolean isSetPropertyListCompleteTransmissionIndicator();
    
    /**
     * Sets the "PropertyListCompleteTransmissionIndicator" attribute
     */
    void setPropertyListCompleteTransmissionIndicator(boolean propertyListCompleteTransmissionIndicator);
    
    /**
     * Sets (as xml) the "PropertyListCompleteTransmissionIndicator" attribute
     */
    void xsetPropertyListCompleteTransmissionIndicator(com.sap.xi.ap.common.gdt.Indicator propertyListCompleteTransmissionIndicator);
    
    /**
     * Unsets the "PropertyListCompleteTransmissionIndicator" attribute
     */
    void unsetPropertyListCompleteTransmissionIndicator();
    
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
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 newInstance() {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.documentservices.global.MaintenanceAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

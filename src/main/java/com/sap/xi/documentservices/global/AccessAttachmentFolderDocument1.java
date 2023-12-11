/*
 * XML Type:  AccessAttachmentFolderDocument
 * Namespace: http://sap.com/xi/DocumentServices/Global
 * Java type: com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.documentservices.global;


/**
 * An XML AccessAttachmentFolderDocument(@http://sap.com/xi/DocumentServices/Global).
 *
 * This is a complex type.
 */
public interface AccessAttachmentFolderDocument1 extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AccessAttachmentFolderDocument1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B8FAE3D556F3A1A6A1FE3D414B4E0DE").resolveHandle("accessattachmentfolderdocument6fa0type");
    
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
     * Gets the "VersionID" element
     */
    java.lang.String getVersionID();
    
    /**
     * Gets (as xml) the "VersionID" element
     */
    com.sap.xi.ap.common.gdt.VersionID xgetVersionID();
    
    /**
     * True if has "VersionID" element
     */
    boolean isSetVersionID();
    
    /**
     * Sets the "VersionID" element
     */
    void setVersionID(java.lang.String versionID);
    
    /**
     * Sets (as xml) the "VersionID" element
     */
    void xsetVersionID(com.sap.xi.ap.common.gdt.VersionID versionID);
    
    /**
     * Unsets the "VersionID" element
     */
    void unsetVersionID();
    
    /**
     * Gets the "SystemAdministrativeData" element
     */
    com.sap.xi.ap.common.gdt.SystemAdministrativeData getSystemAdministrativeData();
    
    /**
     * True if has "SystemAdministrativeData" element
     */
    boolean isSetSystemAdministrativeData();
    
    /**
     * Sets the "SystemAdministrativeData" element
     */
    void setSystemAdministrativeData(com.sap.xi.ap.common.gdt.SystemAdministrativeData systemAdministrativeData);
    
    /**
     * Appends and returns a new empty "SystemAdministrativeData" element
     */
    com.sap.xi.ap.common.gdt.SystemAdministrativeData addNewSystemAdministrativeData();
    
    /**
     * Unsets the "SystemAdministrativeData" element
     */
    void unsetSystemAdministrativeData();
    
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
     * Gets the "CheckedOutIndicator" element
     */
    boolean getCheckedOutIndicator();
    
    /**
     * Gets (as xml) the "CheckedOutIndicator" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetCheckedOutIndicator();
    
    /**
     * True if has "CheckedOutIndicator" element
     */
    boolean isSetCheckedOutIndicator();
    
    /**
     * Sets the "CheckedOutIndicator" element
     */
    void setCheckedOutIndicator(boolean checkedOutIndicator);
    
    /**
     * Sets (as xml) the "CheckedOutIndicator" element
     */
    void xsetCheckedOutIndicator(com.sap.xi.ap.common.gdt.Indicator checkedOutIndicator);
    
    /**
     * Unsets the "CheckedOutIndicator" element
     */
    void unsetCheckedOutIndicator();
    
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
     * Gets the "VersioningEnabledIndicator" element
     */
    boolean getVersioningEnabledIndicator();
    
    /**
     * Gets (as xml) the "VersioningEnabledIndicator" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetVersioningEnabledIndicator();
    
    /**
     * True if has "VersioningEnabledIndicator" element
     */
    boolean isSetVersioningEnabledIndicator();
    
    /**
     * Sets the "VersioningEnabledIndicator" element
     */
    void setVersioningEnabledIndicator(boolean versioningEnabledIndicator);
    
    /**
     * Sets (as xml) the "VersioningEnabledIndicator" element
     */
    void xsetVersioningEnabledIndicator(com.sap.xi.ap.common.gdt.Indicator versioningEnabledIndicator);
    
    /**
     * Unsets the "VersioningEnabledIndicator" element
     */
    void unsetVersioningEnabledIndicator();
    
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
     * Gets the "CategoryName" element
     */
    java.lang.String getCategoryName();
    
    /**
     * Gets (as xml) the "CategoryName" element
     */
    com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName xgetCategoryName();
    
    /**
     * True if has "CategoryName" element
     */
    boolean isSetCategoryName();
    
    /**
     * Sets the "CategoryName" element
     */
    void setCategoryName(java.lang.String categoryName);
    
    /**
     * Sets (as xml) the "CategoryName" element
     */
    void xsetCategoryName(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName categoryName);
    
    /**
     * Unsets the "CategoryName" element
     */
    void unsetCategoryName();
    
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
     * Gets the "TypeName" element
     */
    java.lang.String getTypeName();
    
    /**
     * Gets (as xml) the "TypeName" element
     */
    com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName xgetTypeName();
    
    /**
     * True if has "TypeName" element
     */
    boolean isSetTypeName();
    
    /**
     * Sets the "TypeName" element
     */
    void setTypeName(java.lang.String typeName);
    
    /**
     * Sets (as xml) the "TypeName" element
     */
    void xsetTypeName(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName typeName);
    
    /**
     * Unsets the "TypeName" element
     */
    void unsetTypeName();
    
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
     * Gets the "MIMEName" element
     */
    java.lang.String getMIMEName();
    
    /**
     * Gets (as xml) the "MIMEName" element
     */
    com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName xgetMIMEName();
    
    /**
     * True if has "MIMEName" element
     */
    boolean isSetMIMEName();
    
    /**
     * Sets the "MIMEName" element
     */
    void setMIMEName(java.lang.String mimeName);
    
    /**
     * Sets (as xml) the "MIMEName" element
     */
    void xsetMIMEName(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName mimeName);
    
    /**
     * Unsets the "MIMEName" element
     */
    void unsetMIMEName();
    
    /**
     * Gets the "PathName" element
     */
    java.lang.String getPathName();
    
    /**
     * Gets (as xml) the "PathName" element
     */
    com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName xgetPathName();
    
    /**
     * True if has "PathName" element
     */
    boolean isSetPathName();
    
    /**
     * Sets the "PathName" element
     */
    void setPathName(java.lang.String pathName);
    
    /**
     * Sets (as xml) the "PathName" element
     */
    void xsetPathName(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName pathName);
    
    /**
     * Unsets the "PathName" element
     */
    void unsetPathName();
    
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
     * Gets the "FileContentURI" element
     */
    com.sap.xi.ap.common.gdt.URI getFileContentURI();
    
    /**
     * True if has "FileContentURI" element
     */
    boolean isSetFileContentURI();
    
    /**
     * Sets the "FileContentURI" element
     */
    void setFileContentURI(com.sap.xi.ap.common.gdt.URI fileContentURI);
    
    /**
     * Appends and returns a new empty "FileContentURI" element
     */
    com.sap.xi.ap.common.gdt.URI addNewFileContentURI();
    
    /**
     * Unsets the "FileContentURI" element
     */
    void unsetFileContentURI();
    
    /**
     * Gets the "FilesizeMeasure" element
     */
    com.sap.xi.ap.common.gdt.Measure getFilesizeMeasure();
    
    /**
     * True if has "FilesizeMeasure" element
     */
    boolean isSetFilesizeMeasure();
    
    /**
     * Sets the "FilesizeMeasure" element
     */
    void setFilesizeMeasure(com.sap.xi.ap.common.gdt.Measure filesizeMeasure);
    
    /**
     * Appends and returns a new empty "FilesizeMeasure" element
     */
    com.sap.xi.ap.common.gdt.Measure addNewFilesizeMeasure();
    
    /**
     * Unsets the "FilesizeMeasure" element
     */
    void unsetFilesizeMeasure();
    
    /**
     * Gets array of all "Property" elements
     */
    com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty[] getPropertyArray();
    
    /**
     * Gets ith "Property" element
     */
    com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty getPropertyArray(int i);
    
    /**
     * Returns number of "Property" element
     */
    int sizeOfPropertyArray();
    
    /**
     * Sets array of all "Property" element
     */
    void setPropertyArray(com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty[] propertyArray);
    
    /**
     * Sets ith "Property" element
     */
    void setPropertyArray(int i, com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty property);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Property" element
     */
    com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty insertNewProperty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Property" element
     */
    com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentProperty addNewProperty();
    
    /**
     * Removes the ith "Property" element
     */
    void removeProperty(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 newInstance() {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

/*
 * XML Type:  AccessAttachmentFolder
 * Namespace: http://sap.com/xi/DocumentServices/Global
 * Java type: com.sap.xi.documentservices.global.AccessAttachmentFolder
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.documentservices.global;


/**
 * An XML AccessAttachmentFolder(@http://sap.com/xi/DocumentServices/Global).
 *
 * This is a complex type.
 */
public interface AccessAttachmentFolder extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AccessAttachmentFolder.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B8FAE3D556F3A1A6A1FE3D414B4E0DE").resolveHandle("accessattachmentfolder1225type");
    
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
     * Gets array of all "Document" elements
     */
    com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1[] getDocumentArray();
    
    /**
     * Gets ith "Document" element
     */
    com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 getDocumentArray(int i);
    
    /**
     * Returns number of "Document" element
     */
    int sizeOfDocumentArray();
    
    /**
     * Sets array of all "Document" element
     */
    void setDocumentArray(com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1[] documentArray);
    
    /**
     * Sets ith "Document" element
     */
    void setDocumentArray(int i, com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 document);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Document" element
     */
    com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 insertNewDocument(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Document" element
     */
    com.sap.xi.documentservices.global.AccessAttachmentFolderDocument1 addNewDocument();
    
    /**
     * Removes the ith "Document" element
     */
    void removeDocument(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.documentservices.global.AccessAttachmentFolder newInstance() {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolder newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.documentservices.global.AccessAttachmentFolder parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolder parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.documentservices.global.AccessAttachmentFolder parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolder parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolder parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolder parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolder parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolder parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolder parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolder parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolder parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolder parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolder parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.documentservices.global.AccessAttachmentFolder parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.documentservices.global.AccessAttachmentFolder parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.documentservices.global.AccessAttachmentFolder parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.documentservices.global.AccessAttachmentFolder) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

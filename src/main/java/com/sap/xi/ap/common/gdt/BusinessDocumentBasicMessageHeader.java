/*
 * XML Type:  BusinessDocumentBasicMessageHeader
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt;


/**
 * An XML BusinessDocumentBasicMessageHeader(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is a complex type.
 */
public interface BusinessDocumentBasicMessageHeader extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BusinessDocumentBasicMessageHeader.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3516FCF9D95E9E30AE8D4E360678AF8D").resolveHandle("businessdocumentbasicmessageheaderfa0btype");
    
    /**
     * Gets the "ID" element
     */
    com.sap.xi.ap.common.gdt.BusinessDocumentMessageID getID();
    
    /**
     * True if has "ID" element
     */
    boolean isSetID();
    
    /**
     * Sets the "ID" element
     */
    void setID(com.sap.xi.ap.common.gdt.BusinessDocumentMessageID id);
    
    /**
     * Appends and returns a new empty "ID" element
     */
    com.sap.xi.ap.common.gdt.BusinessDocumentMessageID addNewID();
    
    /**
     * Unsets the "ID" element
     */
    void unsetID();
    
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
     * Gets the "ReferenceID" element
     */
    com.sap.xi.ap.common.gdt.BusinessDocumentMessageID getReferenceID();
    
    /**
     * True if has "ReferenceID" element
     */
    boolean isSetReferenceID();
    
    /**
     * Sets the "ReferenceID" element
     */
    void setReferenceID(com.sap.xi.ap.common.gdt.BusinessDocumentMessageID referenceID);
    
    /**
     * Appends and returns a new empty "ReferenceID" element
     */
    com.sap.xi.ap.common.gdt.BusinessDocumentMessageID addNewReferenceID();
    
    /**
     * Unsets the "ReferenceID" element
     */
    void unsetReferenceID();
    
    /**
     * Gets the "ReferenceUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getReferenceUUID();
    
    /**
     * True if has "ReferenceUUID" element
     */
    boolean isSetReferenceUUID();
    
    /**
     * Sets the "ReferenceUUID" element
     */
    void setReferenceUUID(com.sap.xi.ap.common.gdt.UUID referenceUUID);
    
    /**
     * Appends and returns a new empty "ReferenceUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewReferenceUUID();
    
    /**
     * Unsets the "ReferenceUUID" element
     */
    void unsetReferenceUUID();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader newInstance() {
          return (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.gdt.BusinessDocumentBasicMessageHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

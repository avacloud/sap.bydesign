/*
 * XML Type:  SystemAdministrativeData
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.SystemAdministrativeData
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt;


/**
 * An XML SystemAdministrativeData(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is a complex type.
 */
public interface SystemAdministrativeData extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SystemAdministrativeData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B8FAE3D556F3A1A6A1FE3D414B4E0DE").resolveHandle("systemadministrativedata6b91type");
    
    /**
     * Gets the "CreationDateTime" element
     */
    java.util.Calendar getCreationDateTime();
    
    /**
     * Gets (as xml) the "CreationDateTime" element
     */
    com.sap.xi.basis.global.GLOBALDateTime xgetCreationDateTime();
    
    /**
     * Sets the "CreationDateTime" element
     */
    void setCreationDateTime(java.util.Calendar creationDateTime);
    
    /**
     * Sets (as xml) the "CreationDateTime" element
     */
    void xsetCreationDateTime(com.sap.xi.basis.global.GLOBALDateTime creationDateTime);
    
    /**
     * Gets the "CreationIdentityUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getCreationIdentityUUID();
    
    /**
     * True if has "CreationIdentityUUID" element
     */
    boolean isSetCreationIdentityUUID();
    
    /**
     * Sets the "CreationIdentityUUID" element
     */
    void setCreationIdentityUUID(com.sap.xi.ap.common.gdt.UUID creationIdentityUUID);
    
    /**
     * Appends and returns a new empty "CreationIdentityUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewCreationIdentityUUID();
    
    /**
     * Unsets the "CreationIdentityUUID" element
     */
    void unsetCreationIdentityUUID();
    
    /**
     * Gets the "LastChangeDateTime" element
     */
    java.util.Calendar getLastChangeDateTime();
    
    /**
     * Gets (as xml) the "LastChangeDateTime" element
     */
    com.sap.xi.basis.global.GLOBALDateTime xgetLastChangeDateTime();
    
    /**
     * True if has "LastChangeDateTime" element
     */
    boolean isSetLastChangeDateTime();
    
    /**
     * Sets the "LastChangeDateTime" element
     */
    void setLastChangeDateTime(java.util.Calendar lastChangeDateTime);
    
    /**
     * Sets (as xml) the "LastChangeDateTime" element
     */
    void xsetLastChangeDateTime(com.sap.xi.basis.global.GLOBALDateTime lastChangeDateTime);
    
    /**
     * Unsets the "LastChangeDateTime" element
     */
    void unsetLastChangeDateTime();
    
    /**
     * Gets the "LastChangeIdentityUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getLastChangeIdentityUUID();
    
    /**
     * True if has "LastChangeIdentityUUID" element
     */
    boolean isSetLastChangeIdentityUUID();
    
    /**
     * Sets the "LastChangeIdentityUUID" element
     */
    void setLastChangeIdentityUUID(com.sap.xi.ap.common.gdt.UUID lastChangeIdentityUUID);
    
    /**
     * Appends and returns a new empty "LastChangeIdentityUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewLastChangeIdentityUUID();
    
    /**
     * Unsets the "LastChangeIdentityUUID" element
     */
    void unsetLastChangeIdentityUUID();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.ap.common.gdt.SystemAdministrativeData newInstance() {
          return (com.sap.xi.ap.common.gdt.SystemAdministrativeData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.ap.common.gdt.SystemAdministrativeData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.ap.common.gdt.SystemAdministrativeData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.ap.common.gdt.SystemAdministrativeData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.SystemAdministrativeData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.SystemAdministrativeData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.SystemAdministrativeData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.ap.common.gdt.SystemAdministrativeData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.SystemAdministrativeData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.SystemAdministrativeData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.SystemAdministrativeData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.SystemAdministrativeData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.SystemAdministrativeData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.SystemAdministrativeData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.SystemAdministrativeData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.SystemAdministrativeData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.SystemAdministrativeData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.SystemAdministrativeData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.SystemAdministrativeData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.SystemAdministrativeData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.SystemAdministrativeData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.SystemAdministrativeData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.SystemAdministrativeData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.SystemAdministrativeData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.SystemAdministrativeData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.SystemAdministrativeData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.SystemAdministrativeData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.SystemAdministrativeData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.SystemAdministrativeData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.SystemAdministrativeData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.SystemAdministrativeData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.gdt.SystemAdministrativeData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.gdt.SystemAdministrativeData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.gdt.SystemAdministrativeData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.gdt.SystemAdministrativeData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

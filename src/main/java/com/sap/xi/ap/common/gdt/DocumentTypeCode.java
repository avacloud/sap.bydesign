/*
 * XML Type:  DocumentTypeCode
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.DocumentTypeCode
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt;


/**
 * An XML DocumentTypeCode(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.DocumentTypeCode.
 */
public interface DocumentTypeCode extends com.sap.xi.ap.common.gdt.DocumentTypeCodeContent
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentTypeCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B8FAE3D556F3A1A6A1FE3D414B4E0DE").resolveHandle("documenttypecode888ctype");
    
    /**
     * Gets the "listID" attribute
     */
    java.lang.String getListID();
    
    /**
     * Gets (as xml) the "listID" attribute
     */
    com.sap.xi.ap.common.gdt.DocumentTypeCode.ListID xgetListID();
    
    /**
     * True if has "listID" attribute
     */
    boolean isSetListID();
    
    /**
     * Sets the "listID" attribute
     */
    void setListID(java.lang.String listID);
    
    /**
     * Sets (as xml) the "listID" attribute
     */
    void xsetListID(com.sap.xi.ap.common.gdt.DocumentTypeCode.ListID listID);
    
    /**
     * Unsets the "listID" attribute
     */
    void unsetListID();
    
    /**
     * Gets the "listVersionID" attribute
     */
    java.lang.String getListVersionID();
    
    /**
     * Gets (as xml) the "listVersionID" attribute
     */
    com.sap.xi.ap.common.gdt.DocumentTypeCode.ListVersionID xgetListVersionID();
    
    /**
     * True if has "listVersionID" attribute
     */
    boolean isSetListVersionID();
    
    /**
     * Sets the "listVersionID" attribute
     */
    void setListVersionID(java.lang.String listVersionID);
    
    /**
     * Sets (as xml) the "listVersionID" attribute
     */
    void xsetListVersionID(com.sap.xi.ap.common.gdt.DocumentTypeCode.ListVersionID listVersionID);
    
    /**
     * Unsets the "listVersionID" attribute
     */
    void unsetListVersionID();
    
    /**
     * Gets the "listAgencyID" attribute
     */
    java.lang.String getListAgencyID();
    
    /**
     * Gets (as xml) the "listAgencyID" attribute
     */
    com.sap.xi.ap.common.gdt.DocumentTypeCode.ListAgencyID xgetListAgencyID();
    
    /**
     * True if has "listAgencyID" attribute
     */
    boolean isSetListAgencyID();
    
    /**
     * Sets the "listAgencyID" attribute
     */
    void setListAgencyID(java.lang.String listAgencyID);
    
    /**
     * Sets (as xml) the "listAgencyID" attribute
     */
    void xsetListAgencyID(com.sap.xi.ap.common.gdt.DocumentTypeCode.ListAgencyID listAgencyID);
    
    /**
     * Unsets the "listAgencyID" attribute
     */
    void unsetListAgencyID();
    
    /**
     * Gets the "listAgencySchemeID" attribute
     */
    java.lang.String getListAgencySchemeID();
    
    /**
     * Gets (as xml) the "listAgencySchemeID" attribute
     */
    com.sap.xi.ap.common.gdt.DocumentTypeCode.ListAgencySchemeID xgetListAgencySchemeID();
    
    /**
     * True if has "listAgencySchemeID" attribute
     */
    boolean isSetListAgencySchemeID();
    
    /**
     * Sets the "listAgencySchemeID" attribute
     */
    void setListAgencySchemeID(java.lang.String listAgencySchemeID);
    
    /**
     * Sets (as xml) the "listAgencySchemeID" attribute
     */
    void xsetListAgencySchemeID(com.sap.xi.ap.common.gdt.DocumentTypeCode.ListAgencySchemeID listAgencySchemeID);
    
    /**
     * Unsets the "listAgencySchemeID" attribute
     */
    void unsetListAgencySchemeID();
    
    /**
     * Gets the "listAgencySchemeAgencyID" attribute
     */
    com.sap.xi.basis.global.AgencyIdentificationCode.Enum getListAgencySchemeAgencyID();
    
    /**
     * Gets (as xml) the "listAgencySchemeAgencyID" attribute
     */
    com.sap.xi.basis.global.AgencyIdentificationCode xgetListAgencySchemeAgencyID();
    
    /**
     * True if has "listAgencySchemeAgencyID" attribute
     */
    boolean isSetListAgencySchemeAgencyID();
    
    /**
     * Sets the "listAgencySchemeAgencyID" attribute
     */
    void setListAgencySchemeAgencyID(com.sap.xi.basis.global.AgencyIdentificationCode.Enum listAgencySchemeAgencyID);
    
    /**
     * Sets (as xml) the "listAgencySchemeAgencyID" attribute
     */
    void xsetListAgencySchemeAgencyID(com.sap.xi.basis.global.AgencyIdentificationCode listAgencySchemeAgencyID);
    
    /**
     * Unsets the "listAgencySchemeAgencyID" attribute
     */
    void unsetListAgencySchemeAgencyID();
    
    /**
     * An XML listID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.DocumentTypeCode$ListID.
     */
    public interface ListID extends org.apache.xmlbeans.XmlToken
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B8FAE3D556F3A1A6A1FE3D414B4E0DE").resolveHandle("listid8693attrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sap.xi.ap.common.gdt.DocumentTypeCode.ListID newValue(java.lang.Object obj) {
              return (com.sap.xi.ap.common.gdt.DocumentTypeCode.ListID) type.newValue( obj ); }
            
            public static com.sap.xi.ap.common.gdt.DocumentTypeCode.ListID newInstance() {
              return (com.sap.xi.ap.common.gdt.DocumentTypeCode.ListID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sap.xi.ap.common.gdt.DocumentTypeCode.ListID newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sap.xi.ap.common.gdt.DocumentTypeCode.ListID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML listVersionID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.DocumentTypeCode$ListVersionID.
     */
    public interface ListVersionID extends org.apache.xmlbeans.XmlToken
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListVersionID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B8FAE3D556F3A1A6A1FE3D414B4E0DE").resolveHandle("listversionid470fattrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sap.xi.ap.common.gdt.DocumentTypeCode.ListVersionID newValue(java.lang.Object obj) {
              return (com.sap.xi.ap.common.gdt.DocumentTypeCode.ListVersionID) type.newValue( obj ); }
            
            public static com.sap.xi.ap.common.gdt.DocumentTypeCode.ListVersionID newInstance() {
              return (com.sap.xi.ap.common.gdt.DocumentTypeCode.ListVersionID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sap.xi.ap.common.gdt.DocumentTypeCode.ListVersionID newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sap.xi.ap.common.gdt.DocumentTypeCode.ListVersionID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML listAgencyID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.DocumentTypeCode$ListAgencyID.
     */
    public interface ListAgencyID extends org.apache.xmlbeans.XmlToken
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListAgencyID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B8FAE3D556F3A1A6A1FE3D414B4E0DE").resolveHandle("listagencyid0f0eattrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sap.xi.ap.common.gdt.DocumentTypeCode.ListAgencyID newValue(java.lang.Object obj) {
              return (com.sap.xi.ap.common.gdt.DocumentTypeCode.ListAgencyID) type.newValue( obj ); }
            
            public static com.sap.xi.ap.common.gdt.DocumentTypeCode.ListAgencyID newInstance() {
              return (com.sap.xi.ap.common.gdt.DocumentTypeCode.ListAgencyID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sap.xi.ap.common.gdt.DocumentTypeCode.ListAgencyID newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sap.xi.ap.common.gdt.DocumentTypeCode.ListAgencyID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML listAgencySchemeID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.DocumentTypeCode$ListAgencySchemeID.
     */
    public interface ListAgencySchemeID extends org.apache.xmlbeans.XmlToken
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListAgencySchemeID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B8FAE3D556F3A1A6A1FE3D414B4E0DE").resolveHandle("listagencyschemeidb9a9attrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sap.xi.ap.common.gdt.DocumentTypeCode.ListAgencySchemeID newValue(java.lang.Object obj) {
              return (com.sap.xi.ap.common.gdt.DocumentTypeCode.ListAgencySchemeID) type.newValue( obj ); }
            
            public static com.sap.xi.ap.common.gdt.DocumentTypeCode.ListAgencySchemeID newInstance() {
              return (com.sap.xi.ap.common.gdt.DocumentTypeCode.ListAgencySchemeID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sap.xi.ap.common.gdt.DocumentTypeCode.ListAgencySchemeID newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sap.xi.ap.common.gdt.DocumentTypeCode.ListAgencySchemeID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.ap.common.gdt.DocumentTypeCode newInstance() {
          return (com.sap.xi.ap.common.gdt.DocumentTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.ap.common.gdt.DocumentTypeCode newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.ap.common.gdt.DocumentTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.ap.common.gdt.DocumentTypeCode parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.DocumentTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.DocumentTypeCode parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.DocumentTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.ap.common.gdt.DocumentTypeCode parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.DocumentTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.DocumentTypeCode parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.DocumentTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.DocumentTypeCode parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.DocumentTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.DocumentTypeCode parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.DocumentTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.DocumentTypeCode parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.DocumentTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.DocumentTypeCode parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.DocumentTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.DocumentTypeCode parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.DocumentTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.DocumentTypeCode parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.DocumentTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.DocumentTypeCode parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.DocumentTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.DocumentTypeCode parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.DocumentTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.DocumentTypeCode parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.DocumentTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.DocumentTypeCode parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.DocumentTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.gdt.DocumentTypeCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.gdt.DocumentTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.gdt.DocumentTypeCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.gdt.DocumentTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

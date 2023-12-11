/*
 * XML Type:  BusinessTransactionDocumentID
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt;


/**
 * An XML BusinessTransactionDocumentID(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID.
 */
public interface BusinessTransactionDocumentID extends com.sap.xi.ap.common.gdt.BusinessTransactionDocumentIDContent
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BusinessTransactionDocumentID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1B636237ED4970D2FF229DCFE319F552").resolveHandle("businesstransactiondocumentid60actype");
    
    /**
     * Gets the "schemeID" attribute
     */
    java.lang.String getSchemeID();
    
    /**
     * Gets (as xml) the "schemeID" attribute
     */
    com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID.SchemeID xgetSchemeID();
    
    /**
     * True if has "schemeID" attribute
     */
    boolean isSetSchemeID();
    
    /**
     * Sets the "schemeID" attribute
     */
    void setSchemeID(java.lang.String schemeID);
    
    /**
     * Sets (as xml) the "schemeID" attribute
     */
    void xsetSchemeID(com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID.SchemeID schemeID);
    
    /**
     * Unsets the "schemeID" attribute
     */
    void unsetSchemeID();
    
    /**
     * Gets the "schemeAgencyID" attribute
     */
    java.lang.String getSchemeAgencyID();
    
    /**
     * Gets (as xml) the "schemeAgencyID" attribute
     */
    com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID.SchemeAgencyID xgetSchemeAgencyID();
    
    /**
     * True if has "schemeAgencyID" attribute
     */
    boolean isSetSchemeAgencyID();
    
    /**
     * Sets the "schemeAgencyID" attribute
     */
    void setSchemeAgencyID(java.lang.String schemeAgencyID);
    
    /**
     * Sets (as xml) the "schemeAgencyID" attribute
     */
    void xsetSchemeAgencyID(com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID.SchemeAgencyID schemeAgencyID);
    
    /**
     * Unsets the "schemeAgencyID" attribute
     */
    void unsetSchemeAgencyID();
    
    /**
     * Gets the "schemeAgencySchemeAgencyID" attribute
     */
    java.lang.String getSchemeAgencySchemeAgencyID();
    
    /**
     * Gets (as xml) the "schemeAgencySchemeAgencyID" attribute
     */
    org.apache.xmlbeans.XmlString xgetSchemeAgencySchemeAgencyID();
    
    /**
     * True if has "schemeAgencySchemeAgencyID" attribute
     */
    boolean isSetSchemeAgencySchemeAgencyID();
    
    /**
     * Sets the "schemeAgencySchemeAgencyID" attribute
     */
    void setSchemeAgencySchemeAgencyID(java.lang.String schemeAgencySchemeAgencyID);
    
    /**
     * Sets (as xml) the "schemeAgencySchemeAgencyID" attribute
     */
    void xsetSchemeAgencySchemeAgencyID(org.apache.xmlbeans.XmlString schemeAgencySchemeAgencyID);
    
    /**
     * Unsets the "schemeAgencySchemeAgencyID" attribute
     */
    void unsetSchemeAgencySchemeAgencyID();
    
    /**
     * An XML schemeID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID$SchemeID.
     */
    public interface SchemeID extends org.apache.xmlbeans.XmlToken
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SchemeID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1B636237ED4970D2FF229DCFE319F552").resolveHandle("schemeidf64cattrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID.SchemeID newValue(java.lang.Object obj) {
              return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID.SchemeID) type.newValue( obj ); }
            
            public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID.SchemeID newInstance() {
              return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID.SchemeID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID.SchemeID newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID.SchemeID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML schemeAgencyID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID$SchemeAgencyID.
     */
    public interface SchemeAgencyID extends org.apache.xmlbeans.XmlToken
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SchemeAgencyID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1B636237ED4970D2FF229DCFE319F552").resolveHandle("schemeagencyidbc71attrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID.SchemeAgencyID newValue(java.lang.Object obj) {
              return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID.SchemeAgencyID) type.newValue( obj ); }
            
            public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID.SchemeAgencyID newInstance() {
              return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID.SchemeAgencyID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID.SchemeAgencyID newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID.SchemeAgencyID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID newInstance() {
          return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

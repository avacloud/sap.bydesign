/*
 * XML Type:  ServiceProductConsumptionCalculationMethodCode
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt;


/**
 * An XML ServiceProductConsumptionCalculationMethodCode(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.
 */
public interface ServiceProductConsumptionCalculationMethodCode extends com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCodeContent
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceProductConsumptionCalculationMethodCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s96DEC7DD933DAEBB03DFF861936C486A").resolveHandle("serviceproductconsumptioncalculationmethodcode9220type");
    
    /**
     * Gets the "listID" attribute
     */
    java.lang.String getListID();
    
    /**
     * Gets (as xml) the "listID" attribute
     */
    com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListID xgetListID();
    
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
    void xsetListID(com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListID listID);
    
    /**
     * Unsets the "listID" attribute
     */
    void unsetListID();
    
    /**
     * Gets the "listAgencyID" attribute
     */
    java.lang.String getListAgencyID();
    
    /**
     * Gets (as xml) the "listAgencyID" attribute
     */
    com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListAgencyID xgetListAgencyID();
    
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
    void xsetListAgencyID(com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListAgencyID listAgencyID);
    
    /**
     * Unsets the "listAgencyID" attribute
     */
    void unsetListAgencyID();
    
    /**
     * An XML listID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode$ListID.
     */
    public interface ListID extends org.apache.xmlbeans.XmlToken
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s96DEC7DD933DAEBB03DFF861936C486A").resolveHandle("listid89e7attrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListID newValue(java.lang.Object obj) {
              return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListID) type.newValue( obj ); }
            
            public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListID newInstance() {
              return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListID newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML listAgencyID(@).
     *
     * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode$ListAgencyID.
     */
    public interface ListAgencyID extends org.apache.xmlbeans.XmlToken
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListAgencyID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s96DEC7DD933DAEBB03DFF861936C486A").resolveHandle("listagencyid4922attrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListAgencyID newValue(java.lang.Object obj) {
              return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListAgencyID) type.newValue( obj ); }
            
            public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListAgencyID newInstance() {
              return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListAgencyID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListAgencyID newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode.ListAgencyID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode newInstance() {
          return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

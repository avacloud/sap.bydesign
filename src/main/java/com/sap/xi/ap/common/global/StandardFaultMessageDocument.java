/*
 * An XML document type.
 * Localname: StandardFaultMessage
 * Namespace: http://sap.com/xi/AP/Common/Global
 * Java type: com.sap.xi.ap.common.global.StandardFaultMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.global;


/**
 * A document containing one StandardFaultMessage(@http://sap.com/xi/AP/Common/Global) element.
 *
 * This is a complex type.
 */
public interface StandardFaultMessageDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StandardFaultMessageDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1B636237ED4970D2FF229DCFE319F552").resolveHandle("standardfaultmessage763edoctype");
    
    /**
     * Gets the "StandardFaultMessage" element
     */
    com.sap.xi.ap.common.global.StandardFaultMessageDocument.StandardFaultMessage getStandardFaultMessage();
    
    /**
     * Sets the "StandardFaultMessage" element
     */
    void setStandardFaultMessage(com.sap.xi.ap.common.global.StandardFaultMessageDocument.StandardFaultMessage standardFaultMessage);
    
    /**
     * Appends and returns a new empty "StandardFaultMessage" element
     */
    com.sap.xi.ap.common.global.StandardFaultMessageDocument.StandardFaultMessage addNewStandardFaultMessage();
    
    /**
     * An XML StandardFaultMessage(@http://sap.com/xi/AP/Common/Global).
     *
     * This is a complex type.
     */
    public interface StandardFaultMessage extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StandardFaultMessage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1B636237ED4970D2FF229DCFE319F552").resolveHandle("standardfaultmessage685celemtype");
        
        /**
         * Gets the "standard" element
         */
        com.sap.xi.ap.common.global.ExchangeFaultData getStandard();
        
        /**
         * Sets the "standard" element
         */
        void setStandard(com.sap.xi.ap.common.global.ExchangeFaultData standard);
        
        /**
         * Appends and returns a new empty "standard" element
         */
        com.sap.xi.ap.common.global.ExchangeFaultData addNewStandard();
        
        /**
         * Gets the "addition" element
         */
        com.sap.xi.ap.common.global.StandardFaultMessageExtension getAddition();
        
        /**
         * Sets the "addition" element
         */
        void setAddition(com.sap.xi.ap.common.global.StandardFaultMessageExtension addition);
        
        /**
         * Appends and returns a new empty "addition" element
         */
        com.sap.xi.ap.common.global.StandardFaultMessageExtension addNewAddition();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sap.xi.ap.common.global.StandardFaultMessageDocument.StandardFaultMessage newInstance() {
              return (com.sap.xi.ap.common.global.StandardFaultMessageDocument.StandardFaultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sap.xi.ap.common.global.StandardFaultMessageDocument.StandardFaultMessage newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sap.xi.ap.common.global.StandardFaultMessageDocument.StandardFaultMessage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.ap.common.global.StandardFaultMessageDocument newInstance() {
          return (com.sap.xi.ap.common.global.StandardFaultMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.ap.common.global.StandardFaultMessageDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.ap.common.global.StandardFaultMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.ap.common.global.StandardFaultMessageDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.StandardFaultMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.ap.common.global.StandardFaultMessageDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.StandardFaultMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.ap.common.global.StandardFaultMessageDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.StandardFaultMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.ap.common.global.StandardFaultMessageDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.StandardFaultMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.ap.common.global.StandardFaultMessageDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.StandardFaultMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.ap.common.global.StandardFaultMessageDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.StandardFaultMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.ap.common.global.StandardFaultMessageDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.StandardFaultMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.ap.common.global.StandardFaultMessageDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.StandardFaultMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.ap.common.global.StandardFaultMessageDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.StandardFaultMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.ap.common.global.StandardFaultMessageDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.global.StandardFaultMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.ap.common.global.StandardFaultMessageDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.StandardFaultMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.ap.common.global.StandardFaultMessageDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.StandardFaultMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.ap.common.global.StandardFaultMessageDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.StandardFaultMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.ap.common.global.StandardFaultMessageDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.global.StandardFaultMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.global.StandardFaultMessageDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.global.StandardFaultMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.global.StandardFaultMessageDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.global.StandardFaultMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

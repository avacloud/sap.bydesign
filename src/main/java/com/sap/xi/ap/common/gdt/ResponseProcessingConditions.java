/*
 * XML Type:  ResponseProcessingConditions
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.ResponseProcessingConditions
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt;


/**
 * An XML ResponseProcessingConditions(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is a complex type.
 */
public interface ResponseProcessingConditions extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseProcessingConditions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1B636237ED4970D2FF229DCFE319F552").resolveHandle("responseprocessingconditions5096type");
    
    /**
     * Gets the "ReturnedQueryHitsNumberValue" element
     */
    int getReturnedQueryHitsNumberValue();
    
    /**
     * Gets (as xml) the "ReturnedQueryHitsNumberValue" element
     */
    com.sap.xi.ap.common.gdt.NumberValue xgetReturnedQueryHitsNumberValue();
    
    /**
     * Sets the "ReturnedQueryHitsNumberValue" element
     */
    void setReturnedQueryHitsNumberValue(int returnedQueryHitsNumberValue);
    
    /**
     * Sets (as xml) the "ReturnedQueryHitsNumberValue" element
     */
    void xsetReturnedQueryHitsNumberValue(com.sap.xi.ap.common.gdt.NumberValue returnedQueryHitsNumberValue);
    
    /**
     * Gets the "MoreHitsAvailableIndicator" element
     */
    boolean getMoreHitsAvailableIndicator();
    
    /**
     * Gets (as xml) the "MoreHitsAvailableIndicator" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetMoreHitsAvailableIndicator();
    
    /**
     * Sets the "MoreHitsAvailableIndicator" element
     */
    void setMoreHitsAvailableIndicator(boolean moreHitsAvailableIndicator);
    
    /**
     * Sets (as xml) the "MoreHitsAvailableIndicator" element
     */
    void xsetMoreHitsAvailableIndicator(com.sap.xi.ap.common.gdt.Indicator moreHitsAvailableIndicator);
    
    /**
     * Gets the "LastReturnedObjectID" element
     */
    com.sap.xi.ap.common.gdt.ObjectID getLastReturnedObjectID();
    
    /**
     * True if has "LastReturnedObjectID" element
     */
    boolean isSetLastReturnedObjectID();
    
    /**
     * Sets the "LastReturnedObjectID" element
     */
    void setLastReturnedObjectID(com.sap.xi.ap.common.gdt.ObjectID lastReturnedObjectID);
    
    /**
     * Appends and returns a new empty "LastReturnedObjectID" element
     */
    com.sap.xi.ap.common.gdt.ObjectID addNewLastReturnedObjectID();
    
    /**
     * Unsets the "LastReturnedObjectID" element
     */
    void unsetLastReturnedObjectID();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.ap.common.gdt.ResponseProcessingConditions newInstance() {
          return (com.sap.xi.ap.common.gdt.ResponseProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.ap.common.gdt.ResponseProcessingConditions newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.ap.common.gdt.ResponseProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.ap.common.gdt.ResponseProcessingConditions parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.ResponseProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.ResponseProcessingConditions parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.ResponseProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.ap.common.gdt.ResponseProcessingConditions parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.ResponseProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.ResponseProcessingConditions parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.ResponseProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.ResponseProcessingConditions parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.ResponseProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.ResponseProcessingConditions parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.ResponseProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.ResponseProcessingConditions parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.ResponseProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.ResponseProcessingConditions parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.ResponseProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.ResponseProcessingConditions parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.ResponseProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.ResponseProcessingConditions parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.ResponseProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.ResponseProcessingConditions parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.ResponseProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.ResponseProcessingConditions parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.ResponseProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.ResponseProcessingConditions parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.ResponseProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.ResponseProcessingConditions parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.ResponseProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.gdt.ResponseProcessingConditions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.gdt.ResponseProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.gdt.ResponseProcessingConditions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.gdt.ResponseProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

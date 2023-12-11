/*
 * XML Type:  QueryProcessingConditions
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.QueryProcessingConditions
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt;


/**
 * An XML QueryProcessingConditions(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is a complex type.
 */
public interface QueryProcessingConditions extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QueryProcessingConditions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1B636237ED4970D2FF229DCFE319F552").resolveHandle("queryprocessingconditions0e2btype");
    
    /**
     * Gets the "QueryHitsMaximumNumberValue" element
     */
    int getQueryHitsMaximumNumberValue();
    
    /**
     * Gets (as xml) the "QueryHitsMaximumNumberValue" element
     */
    com.sap.xi.ap.common.gdt.NumberValue xgetQueryHitsMaximumNumberValue();
    
    /**
     * True if has "QueryHitsMaximumNumberValue" element
     */
    boolean isSetQueryHitsMaximumNumberValue();
    
    /**
     * Sets the "QueryHitsMaximumNumberValue" element
     */
    void setQueryHitsMaximumNumberValue(int queryHitsMaximumNumberValue);
    
    /**
     * Sets (as xml) the "QueryHitsMaximumNumberValue" element
     */
    void xsetQueryHitsMaximumNumberValue(com.sap.xi.ap.common.gdt.NumberValue queryHitsMaximumNumberValue);
    
    /**
     * Unsets the "QueryHitsMaximumNumberValue" element
     */
    void unsetQueryHitsMaximumNumberValue();
    
    /**
     * Gets the "QueryHitsUnlimitedIndicator" element
     */
    boolean getQueryHitsUnlimitedIndicator();
    
    /**
     * Gets (as xml) the "QueryHitsUnlimitedIndicator" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetQueryHitsUnlimitedIndicator();
    
    /**
     * Sets the "QueryHitsUnlimitedIndicator" element
     */
    void setQueryHitsUnlimitedIndicator(boolean queryHitsUnlimitedIndicator);
    
    /**
     * Sets (as xml) the "QueryHitsUnlimitedIndicator" element
     */
    void xsetQueryHitsUnlimitedIndicator(com.sap.xi.ap.common.gdt.Indicator queryHitsUnlimitedIndicator);
    
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
        public static com.sap.xi.ap.common.gdt.QueryProcessingConditions newInstance() {
          return (com.sap.xi.ap.common.gdt.QueryProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.ap.common.gdt.QueryProcessingConditions newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.ap.common.gdt.QueryProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.ap.common.gdt.QueryProcessingConditions parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.QueryProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.QueryProcessingConditions parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.QueryProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.ap.common.gdt.QueryProcessingConditions parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.QueryProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.QueryProcessingConditions parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.QueryProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.QueryProcessingConditions parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.QueryProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.QueryProcessingConditions parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.QueryProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.QueryProcessingConditions parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.QueryProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.QueryProcessingConditions parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.QueryProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.QueryProcessingConditions parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.QueryProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.QueryProcessingConditions parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.ap.common.gdt.QueryProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.QueryProcessingConditions parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.QueryProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.QueryProcessingConditions parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.QueryProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.ap.common.gdt.QueryProcessingConditions parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.QueryProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.ap.common.gdt.QueryProcessingConditions parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.ap.common.gdt.QueryProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.gdt.QueryProcessingConditions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.gdt.QueryProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.ap.common.gdt.QueryProcessingConditions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.ap.common.gdt.QueryProcessingConditions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

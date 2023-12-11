/*
 * XML Type:  MaintenanceTextCollection
 * Namespace: http://sap.com/xi/DocumentServices/Global
 * Java type: com.sap.xi.documentservices.global.MaintenanceTextCollection
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.documentservices.global;


/**
 * An XML MaintenanceTextCollection(@http://sap.com/xi/DocumentServices/Global).
 *
 * This is a complex type.
 */
public interface MaintenanceTextCollection extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MaintenanceTextCollection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB771E6A4E5734821943EC48117D8A797").resolveHandle("maintenancetextcollection19dctype");
    
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
     * Gets array of all "Text" elements
     */
    com.sap.xi.documentservices.global.MaintenanceTextCollectionText[] getTextArray();
    
    /**
     * Gets ith "Text" element
     */
    com.sap.xi.documentservices.global.MaintenanceTextCollectionText getTextArray(int i);
    
    /**
     * Returns number of "Text" element
     */
    int sizeOfTextArray();
    
    /**
     * Sets array of all "Text" element
     */
    void setTextArray(com.sap.xi.documentservices.global.MaintenanceTextCollectionText[] textArray);
    
    /**
     * Sets ith "Text" element
     */
    void setTextArray(int i, com.sap.xi.documentservices.global.MaintenanceTextCollectionText text);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Text" element
     */
    com.sap.xi.documentservices.global.MaintenanceTextCollectionText insertNewText(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Text" element
     */
    com.sap.xi.documentservices.global.MaintenanceTextCollectionText addNewText();
    
    /**
     * Removes the ith "Text" element
     */
    void removeText(int i);
    
    /**
     * Gets the "TextListCompleteTransmissionIndicator" attribute
     */
    boolean getTextListCompleteTransmissionIndicator();
    
    /**
     * Gets (as xml) the "TextListCompleteTransmissionIndicator" attribute
     */
    com.sap.xi.ap.common.gdt.Indicator xgetTextListCompleteTransmissionIndicator();
    
    /**
     * True if has "TextListCompleteTransmissionIndicator" attribute
     */
    boolean isSetTextListCompleteTransmissionIndicator();
    
    /**
     * Sets the "TextListCompleteTransmissionIndicator" attribute
     */
    void setTextListCompleteTransmissionIndicator(boolean textListCompleteTransmissionIndicator);
    
    /**
     * Sets (as xml) the "TextListCompleteTransmissionIndicator" attribute
     */
    void xsetTextListCompleteTransmissionIndicator(com.sap.xi.ap.common.gdt.Indicator textListCompleteTransmissionIndicator);
    
    /**
     * Unsets the "TextListCompleteTransmissionIndicator" attribute
     */
    void unsetTextListCompleteTransmissionIndicator();
    
    /**
     * Gets the "ActionCode" attribute
     */
    com.sap.xi.ap.common.gdt.ActionCode.Enum getActionCode();
    
    /**
     * Gets (as xml) the "ActionCode" attribute
     */
    com.sap.xi.ap.common.gdt.ActionCode xgetActionCode();
    
    /**
     * True if has "ActionCode" attribute
     */
    boolean isSetActionCode();
    
    /**
     * Sets the "ActionCode" attribute
     */
    void setActionCode(com.sap.xi.ap.common.gdt.ActionCode.Enum actionCode);
    
    /**
     * Sets (as xml) the "ActionCode" attribute
     */
    void xsetActionCode(com.sap.xi.ap.common.gdt.ActionCode actionCode);
    
    /**
     * Unsets the "ActionCode" attribute
     */
    void unsetActionCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.documentservices.global.MaintenanceTextCollection newInstance() {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollection newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.documentservices.global.MaintenanceTextCollection parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollection parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.documentservices.global.MaintenanceTextCollection parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollection parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollection parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollection parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollection parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollection parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollection parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollection parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollection parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollection parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollection parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.documentservices.global.MaintenanceTextCollection parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.documentservices.global.MaintenanceTextCollection parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.documentservices.global.MaintenanceTextCollection parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.documentservices.global.MaintenanceTextCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

/*
 * XML Type:  OperationResponseMDT
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.OperationResponseMDT
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML OperationResponseMDT(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface OperationResponseMDT extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperationResponseMDT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE7274E74C1D219A67E80FDE53A95800C").resolveHandle("operationresponsemdtbc23type");
    
    /**
     * Gets the "OperationID" element
     */
    java.lang.String getOperationID();
    
    /**
     * Gets (as xml) the "OperationID" element
     */
    com.sap.xi.ap.common.gdt.OperationID xgetOperationID();
    
    /**
     * True if has "OperationID" element
     */
    boolean isSetOperationID();
    
    /**
     * Sets the "OperationID" element
     */
    void setOperationID(java.lang.String operationID);
    
    /**
     * Sets (as xml) the "OperationID" element
     */
    void xsetOperationID(com.sap.xi.ap.common.gdt.OperationID operationID);
    
    /**
     * Unsets the "OperationID" element
     */
    void unsetOperationID();
    
    /**
     * Gets the "OperationUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getOperationUUID();
    
    /**
     * True if has "OperationUUID" element
     */
    boolean isSetOperationUUID();
    
    /**
     * Sets the "OperationUUID" element
     */
    void setOperationUUID(com.sap.xi.ap.common.gdt.UUID operationUUID);
    
    /**
     * Appends and returns a new empty "OperationUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewOperationUUID();
    
    /**
     * Unsets the "OperationUUID" element
     */
    void unsetOperationUUID();
    
    /**
     * Gets the "TypeCode" element
     */
    com.sap.xi.ap.common.gdt.OperationTypeCode getTypeCode();
    
    /**
     * True if has "TypeCode" element
     */
    boolean isSetTypeCode();
    
    /**
     * Sets the "TypeCode" element
     */
    void setTypeCode(com.sap.xi.ap.common.gdt.OperationTypeCode typeCode);
    
    /**
     * Appends and returns a new empty "TypeCode" element
     */
    com.sap.xi.ap.common.gdt.OperationTypeCode addNewTypeCode();
    
    /**
     * Unsets the "TypeCode" element
     */
    void unsetTypeCode();
    
    /**
     * Gets the "CategoryCode" element
     */
    java.lang.String getCategoryCode();
    
    /**
     * Gets (as xml) the "CategoryCode" element
     */
    com.sap.xi.ap.common.gdt.OperationCategoryCode xgetCategoryCode();
    
    /**
     * True if has "CategoryCode" element
     */
    boolean isSetCategoryCode();
    
    /**
     * Sets the "CategoryCode" element
     */
    void setCategoryCode(java.lang.String categoryCode);
    
    /**
     * Sets (as xml) the "CategoryCode" element
     */
    void xsetCategoryCode(com.sap.xi.ap.common.gdt.OperationCategoryCode categoryCode);
    
    /**
     * Unsets the "CategoryCode" element
     */
    void unsetCategoryCode();
    
    /**
     * Gets the "OperationStatus" element
     */
    com.sap.xi.a1s.global.OperationStatusCode getOperationStatus();
    
    /**
     * True if has "OperationStatus" element
     */
    boolean isSetOperationStatus();
    
    /**
     * Sets the "OperationStatus" element
     */
    void setOperationStatus(com.sap.xi.a1s.global.OperationStatusCode operationStatus);
    
    /**
     * Appends and returns a new empty "OperationStatus" element
     */
    com.sap.xi.a1s.global.OperationStatusCode addNewOperationStatus();
    
    /**
     * Unsets the "OperationStatus" element
     */
    void unsetOperationStatus();
    
    /**
     * Gets the "StartDateTime" element
     */
    java.util.Calendar getStartDateTime();
    
    /**
     * Gets (as xml) the "StartDateTime" element
     */
    com.sap.xi.basis.global.GLOBALDateTime xgetStartDateTime();
    
    /**
     * True if has "StartDateTime" element
     */
    boolean isSetStartDateTime();
    
    /**
     * Sets the "StartDateTime" element
     */
    void setStartDateTime(java.util.Calendar startDateTime);
    
    /**
     * Sets (as xml) the "StartDateTime" element
     */
    void xsetStartDateTime(com.sap.xi.basis.global.GLOBALDateTime startDateTime);
    
    /**
     * Unsets the "StartDateTime" element
     */
    void unsetStartDateTime();
    
    /**
     * Gets the "EndDateTime" element
     */
    java.util.Calendar getEndDateTime();
    
    /**
     * Gets (as xml) the "EndDateTime" element
     */
    com.sap.xi.basis.global.GLOBALDateTime xgetEndDateTime();
    
    /**
     * True if has "EndDateTime" element
     */
    boolean isSetEndDateTime();
    
    /**
     * Sets the "EndDateTime" element
     */
    void setEndDateTime(java.util.Calendar endDateTime);
    
    /**
     * Sets (as xml) the "EndDateTime" element
     */
    void xsetEndDateTime(com.sap.xi.basis.global.GLOBALDateTime endDateTime);
    
    /**
     * Unsets the "EndDateTime" element
     */
    void unsetEndDateTime();
    
    /**
     * Gets the "ConfirmMainResourceID" element
     */
    com.sap.xi.ap.common.gdt.ResourceID getConfirmMainResourceID();
    
    /**
     * True if has "ConfirmMainResourceID" element
     */
    boolean isSetConfirmMainResourceID();
    
    /**
     * Sets the "ConfirmMainResourceID" element
     */
    void setConfirmMainResourceID(com.sap.xi.ap.common.gdt.ResourceID confirmMainResourceID);
    
    /**
     * Appends and returns a new empty "ConfirmMainResourceID" element
     */
    com.sap.xi.ap.common.gdt.ResourceID addNewConfirmMainResourceID();
    
    /**
     * Unsets the "ConfirmMainResourceID" element
     */
    void unsetConfirmMainResourceID();
    
    /**
     * Gets the "ConfirmMainResourceUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getConfirmMainResourceUUID();
    
    /**
     * True if has "ConfirmMainResourceUUID" element
     */
    boolean isSetConfirmMainResourceUUID();
    
    /**
     * Sets the "ConfirmMainResourceUUID" element
     */
    void setConfirmMainResourceUUID(com.sap.xi.ap.common.gdt.UUID confirmMainResourceUUID);
    
    /**
     * Appends and returns a new empty "ConfirmMainResourceUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewConfirmMainResourceUUID();
    
    /**
     * Unsets the "ConfirmMainResourceUUID" element
     */
    void unsetConfirmMainResourceUUID();
    
    /**
     * Gets the "ConfirmationGroupUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getConfirmationGroupUUID();
    
    /**
     * True if has "ConfirmationGroupUUID" element
     */
    boolean isSetConfirmationGroupUUID();
    
    /**
     * Sets the "ConfirmationGroupUUID" element
     */
    void setConfirmationGroupUUID(com.sap.xi.ap.common.gdt.UUID confirmationGroupUUID);
    
    /**
     * Appends and returns a new empty "ConfirmationGroupUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewConfirmationGroupUUID();
    
    /**
     * Unsets the "ConfirmationGroupUUID" element
     */
    void unsetConfirmationGroupUUID();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.OperationResponseMDT newInstance() {
          return (com.sap.xi.a1s.global.OperationResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.OperationResponseMDT newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.OperationResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.OperationResponseMDT parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.OperationResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.OperationResponseMDT parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.OperationResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.OperationResponseMDT parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.OperationResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.OperationResponseMDT parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.OperationResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.OperationResponseMDT parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.OperationResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.OperationResponseMDT parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.OperationResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.OperationResponseMDT parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.OperationResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.OperationResponseMDT parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.OperationResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.OperationResponseMDT parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.OperationResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.OperationResponseMDT parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.OperationResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.OperationResponseMDT parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.OperationResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.OperationResponseMDT parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.OperationResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.OperationResponseMDT parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.OperationResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.OperationResponseMDT parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.OperationResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.OperationResponseMDT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.OperationResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.OperationResponseMDT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.OperationResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

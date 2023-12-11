/*
 * XML Type:  ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE7274E74C1D219A67E80FDE53A95800C").resolveHandle("productionlotserialnumberassignmentwithserialnumberhierarchye288type");
    
    /**
     * Gets the "SerialID" element
     */
    java.lang.String getSerialID();
    
    /**
     * Gets (as xml) the "SerialID" element
     */
    com.sap.xi.ap.common.gdt.SerialID xgetSerialID();
    
    /**
     * True if has "SerialID" element
     */
    boolean isSetSerialID();
    
    /**
     * Sets the "SerialID" element
     */
    void setSerialID(java.lang.String serialID);
    
    /**
     * Sets (as xml) the "SerialID" element
     */
    void xsetSerialID(com.sap.xi.ap.common.gdt.SerialID serialID);
    
    /**
     * Unsets the "SerialID" element
     */
    void unsetSerialID();
    
    /**
     * Gets the "IndividualProductUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getIndividualProductUUID();
    
    /**
     * True if has "IndividualProductUUID" element
     */
    boolean isSetIndividualProductUUID();
    
    /**
     * Sets the "IndividualProductUUID" element
     */
    void setIndividualProductUUID(com.sap.xi.ap.common.gdt.UUID individualProductUUID);
    
    /**
     * Appends and returns a new empty "IndividualProductUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewIndividualProductUUID();
    
    /**
     * Unsets the "IndividualProductUUID" element
     */
    void unsetIndividualProductUUID();
    
    /**
     * Gets array of all "SerialNumberHierarchy" elements
     */
    com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy[] getSerialNumberHierarchyArray();
    
    /**
     * Gets ith "SerialNumberHierarchy" element
     */
    com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy getSerialNumberHierarchyArray(int i);
    
    /**
     * Returns number of "SerialNumberHierarchy" element
     */
    int sizeOfSerialNumberHierarchyArray();
    
    /**
     * Sets array of all "SerialNumberHierarchy" element
     */
    void setSerialNumberHierarchyArray(com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy[] serialNumberHierarchyArray);
    
    /**
     * Sets ith "SerialNumberHierarchy" element
     */
    void setSerialNumberHierarchyArray(int i, com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy serialNumberHierarchy);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SerialNumberHierarchy" element
     */
    com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy insertNewSerialNumberHierarchy(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SerialNumberHierarchy" element
     */
    com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy addNewSerialNumberHierarchy();
    
    /**
     * Removes the ith "SerialNumberHierarchy" element
     */
    void removeSerialNumberHierarchy(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy newInstance() {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

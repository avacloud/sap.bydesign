/*
 * XML Type:  ProdLotMaintainRequestBundleMaterial_sync_V1
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML ProdLotMaintainRequestBundleMaterial_sync_V1(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface ProdLotMaintainRequestBundleMaterialSyncV1 extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProdLotMaintainRequestBundleMaterialSyncV1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3516FCF9D95E9E30AE8D4E360678AF8D").resolveHandle("prodlotmaintainrequestbundlematerialsyncv11225type");
    
    /**
     * Gets the "ProductionLotID" element
     */
    com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID getProductionLotID();
    
    /**
     * True if has "ProductionLotID" element
     */
    boolean isSetProductionLotID();
    
    /**
     * Sets the "ProductionLotID" element
     */
    void setProductionLotID(com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID productionLotID);
    
    /**
     * Appends and returns a new empty "ProductionLotID" element
     */
    com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID addNewProductionLotID();
    
    /**
     * Unsets the "ProductionLotID" element
     */
    void unsetProductionLotID();
    
    /**
     * Gets the "ProductionLotUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getProductionLotUUID();
    
    /**
     * True if has "ProductionLotUUID" element
     */
    boolean isSetProductionLotUUID();
    
    /**
     * Sets the "ProductionLotUUID" element
     */
    void setProductionLotUUID(com.sap.xi.ap.common.gdt.UUID productionLotUUID);
    
    /**
     * Appends and returns a new empty "ProductionLotUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewProductionLotUUID();
    
    /**
     * Unsets the "ProductionLotUUID" element
     */
    void unsetProductionLotUUID();
    
    /**
     * Gets array of all "ConfirmationGroup" elements
     */
    com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup[] getConfirmationGroupArray();
    
    /**
     * Gets ith "ConfirmationGroup" element
     */
    com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup getConfirmationGroupArray(int i);
    
    /**
     * Returns number of "ConfirmationGroup" element
     */
    int sizeOfConfirmationGroupArray();
    
    /**
     * Sets array of all "ConfirmationGroup" element
     */
    void setConfirmationGroupArray(com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup[] confirmationGroupArray);
    
    /**
     * Sets ith "ConfirmationGroup" element
     */
    void setConfirmationGroupArray(int i, com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup confirmationGroup);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConfirmationGroup" element
     */
    com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup insertNewConfirmationGroup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConfirmationGroup" element
     */
    com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup addNewConfirmationGroup();
    
    /**
     * Removes the ith "ConfirmationGroup" element
     */
    void removeConfirmationGroup(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 newInstance() {
          return (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMaterialSyncV1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

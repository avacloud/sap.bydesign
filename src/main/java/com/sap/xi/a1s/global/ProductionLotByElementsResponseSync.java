/*
 * XML Type:  ProductionLotByElementsResponse_sync
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotByElementsResponseSync
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML ProductionLotByElementsResponse_sync(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface ProductionLotByElementsResponseSync extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductionLotByElementsResponseSync.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE7274E74C1D219A67E80FDE53A95800C").resolveHandle("productionlotbyelementsresponsesync63a5type");
    
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
     * Gets the "ProductionOrderID" element
     */
    com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID getProductionOrderID();
    
    /**
     * True if has "ProductionOrderID" element
     */
    boolean isSetProductionOrderID();
    
    /**
     * Sets the "ProductionOrderID" element
     */
    void setProductionOrderID(com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID productionOrderID);
    
    /**
     * Appends and returns a new empty "ProductionOrderID" element
     */
    com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID addNewProductionOrderID();
    
    /**
     * Unsets the "ProductionOrderID" element
     */
    void unsetProductionOrderID();
    
    /**
     * Gets the "ProductionOrderUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getProductionOrderUUID();
    
    /**
     * True if has "ProductionOrderUUID" element
     */
    boolean isSetProductionOrderUUID();
    
    /**
     * Sets the "ProductionOrderUUID" element
     */
    void setProductionOrderUUID(com.sap.xi.ap.common.gdt.UUID productionOrderUUID);
    
    /**
     * Appends and returns a new empty "ProductionOrderUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewProductionOrderUUID();
    
    /**
     * Unsets the "ProductionOrderUUID" element
     */
    void unsetProductionOrderUUID();
    
    /**
     * Gets the "ProductionOrderStatus" element
     */
    com.sap.xi.ap.logisticsexecution.global.LogisticsOrderStatus getProductionOrderStatus();
    
    /**
     * True if has "ProductionOrderStatus" element
     */
    boolean isSetProductionOrderStatus();
    
    /**
     * Sets the "ProductionOrderStatus" element
     */
    void setProductionOrderStatus(com.sap.xi.ap.logisticsexecution.global.LogisticsOrderStatus productionOrderStatus);
    
    /**
     * Appends and returns a new empty "ProductionOrderStatus" element
     */
    com.sap.xi.ap.logisticsexecution.global.LogisticsOrderStatus addNewProductionOrderStatus();
    
    /**
     * Unsets the "ProductionOrderStatus" element
     */
    void unsetProductionOrderStatus();
    
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
     * Gets the "ProductionLotStatus" element
     */
    com.sap.xi.a1s.global.ProductionLotStatus getProductionLotStatus();
    
    /**
     * True if has "ProductionLotStatus" element
     */
    boolean isSetProductionLotStatus();
    
    /**
     * Sets the "ProductionLotStatus" element
     */
    void setProductionLotStatus(com.sap.xi.a1s.global.ProductionLotStatus productionLotStatus);
    
    /**
     * Appends and returns a new empty "ProductionLotStatus" element
     */
    com.sap.xi.a1s.global.ProductionLotStatus addNewProductionLotStatus();
    
    /**
     * Unsets the "ProductionLotStatus" element
     */
    void unsetProductionLotStatus();
    
    /**
     * Gets the "MainOutputProductSiteID" element
     */
    com.sap.xi.ap.common.gdt.SupplyPlanningAreaID getMainOutputProductSiteID();
    
    /**
     * True if has "MainOutputProductSiteID" element
     */
    boolean isSetMainOutputProductSiteID();
    
    /**
     * Sets the "MainOutputProductSiteID" element
     */
    void setMainOutputProductSiteID(com.sap.xi.ap.common.gdt.SupplyPlanningAreaID mainOutputProductSiteID);
    
    /**
     * Appends and returns a new empty "MainOutputProductSiteID" element
     */
    com.sap.xi.ap.common.gdt.SupplyPlanningAreaID addNewMainOutputProductSiteID();
    
    /**
     * Unsets the "MainOutputProductSiteID" element
     */
    void unsetMainOutputProductSiteID();
    
    /**
     * Gets the "MainOutputProduct" element
     */
    com.sap.xi.ap.common.gdt.ProductID getMainOutputProduct();
    
    /**
     * True if has "MainOutputProduct" element
     */
    boolean isSetMainOutputProduct();
    
    /**
     * Sets the "MainOutputProduct" element
     */
    void setMainOutputProduct(com.sap.xi.ap.common.gdt.ProductID mainOutputProduct);
    
    /**
     * Appends and returns a new empty "MainOutputProduct" element
     */
    com.sap.xi.ap.common.gdt.ProductID addNewMainOutputProduct();
    
    /**
     * Unsets the "MainOutputProduct" element
     */
    void unsetMainOutputProduct();
    
    /**
     * Gets the "ProductionStartDate" element
     */
    java.util.Calendar getProductionStartDate();
    
    /**
     * Gets (as xml) the "ProductionStartDate" element
     */
    com.sap.xi.basis.global.GLOBALDateTime xgetProductionStartDate();
    
    /**
     * True if has "ProductionStartDate" element
     */
    boolean isSetProductionStartDate();
    
    /**
     * Sets the "ProductionStartDate" element
     */
    void setProductionStartDate(java.util.Calendar productionStartDate);
    
    /**
     * Sets (as xml) the "ProductionStartDate" element
     */
    void xsetProductionStartDate(com.sap.xi.basis.global.GLOBALDateTime productionStartDate);
    
    /**
     * Unsets the "ProductionStartDate" element
     */
    void unsetProductionStartDate();
    
    /**
     * Gets the "ProductionEndDate" element
     */
    java.util.Calendar getProductionEndDate();
    
    /**
     * Gets (as xml) the "ProductionEndDate" element
     */
    com.sap.xi.basis.global.GLOBALDateTime xgetProductionEndDate();
    
    /**
     * True if has "ProductionEndDate" element
     */
    boolean isSetProductionEndDate();
    
    /**
     * Sets the "ProductionEndDate" element
     */
    void setProductionEndDate(java.util.Calendar productionEndDate);
    
    /**
     * Sets (as xml) the "ProductionEndDate" element
     */
    void xsetProductionEndDate(com.sap.xi.basis.global.GLOBALDateTime productionEndDate);
    
    /**
     * Unsets the "ProductionEndDate" element
     */
    void unsetProductionEndDate();
    
    /**
     * Gets array of all "ConfirmationGroup" elements
     */
    com.sap.xi.a1s.global.ProductionLotConfirmationGroup[] getConfirmationGroupArray();
    
    /**
     * Gets ith "ConfirmationGroup" element
     */
    com.sap.xi.a1s.global.ProductionLotConfirmationGroup getConfirmationGroupArray(int i);
    
    /**
     * Returns number of "ConfirmationGroup" element
     */
    int sizeOfConfirmationGroupArray();
    
    /**
     * Sets array of all "ConfirmationGroup" element
     */
    void setConfirmationGroupArray(com.sap.xi.a1s.global.ProductionLotConfirmationGroup[] confirmationGroupArray);
    
    /**
     * Sets ith "ConfirmationGroup" element
     */
    void setConfirmationGroupArray(int i, com.sap.xi.a1s.global.ProductionLotConfirmationGroup confirmationGroup);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConfirmationGroup" element
     */
    com.sap.xi.a1s.global.ProductionLotConfirmationGroup insertNewConfirmationGroup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConfirmationGroup" element
     */
    com.sap.xi.a1s.global.ProductionLotConfirmationGroup addNewConfirmationGroup();
    
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
        public static com.sap.xi.a1s.global.ProductionLotByElementsResponseSync newInstance() {
          return (com.sap.xi.a1s.global.ProductionLotByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotByElementsResponseSync newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.ProductionLotByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.ProductionLotByElementsResponseSync parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotByElementsResponseSync parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.ProductionLotByElementsResponseSync parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotByElementsResponseSync parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotByElementsResponseSync parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotByElementsResponseSync parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotByElementsResponseSync parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotByElementsResponseSync parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotByElementsResponseSync parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotByElementsResponseSync parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotByElementsResponseSync parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotByElementsResponseSync parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotByElementsResponseSync parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotByElementsResponseSync parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotByElementsResponseSync parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotByElementsResponseSync parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

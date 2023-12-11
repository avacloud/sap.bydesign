/*
 * XML Type:  SiteLogisticsTaskByElementsResponse_sync
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML SiteLogisticsTaskByElementsResponse_sync(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface SiteLogisticsTaskByElementsResponseSync extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SiteLogisticsTaskByElementsResponseSync.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1B636237ED4970D2FF229DCFE319F552").resolveHandle("sitelogisticstaskbyelementsresponsesync7ffetype");
    
    /**
     * Gets the "SiteLogisticsTaskID" element
     */
    com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID getSiteLogisticsTaskID();
    
    /**
     * True if has "SiteLogisticsTaskID" element
     */
    boolean isSetSiteLogisticsTaskID();
    
    /**
     * Sets the "SiteLogisticsTaskID" element
     */
    void setSiteLogisticsTaskID(com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID siteLogisticsTaskID);
    
    /**
     * Appends and returns a new empty "SiteLogisticsTaskID" element
     */
    com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID addNewSiteLogisticsTaskID();
    
    /**
     * Unsets the "SiteLogisticsTaskID" element
     */
    void unsetSiteLogisticsTaskID();
    
    /**
     * Gets the "SiteLogisticsTaskUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getSiteLogisticsTaskUUID();
    
    /**
     * True if has "SiteLogisticsTaskUUID" element
     */
    boolean isSetSiteLogisticsTaskUUID();
    
    /**
     * Sets the "SiteLogisticsTaskUUID" element
     */
    void setSiteLogisticsTaskUUID(com.sap.xi.ap.common.gdt.UUID siteLogisticsTaskUUID);
    
    /**
     * Appends and returns a new empty "SiteLogisticsTaskUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewSiteLogisticsTaskUUID();
    
    /**
     * Unsets the "SiteLogisticsTaskUUID" element
     */
    void unsetSiteLogisticsTaskUUID();
    
    /**
     * Gets the "OperationTypeCode" element
     */
    com.sap.xi.ap.common.gdt.OperationTypeCode getOperationTypeCode();
    
    /**
     * True if has "OperationTypeCode" element
     */
    boolean isSetOperationTypeCode();
    
    /**
     * Sets the "OperationTypeCode" element
     */
    void setOperationTypeCode(com.sap.xi.ap.common.gdt.OperationTypeCode operationTypeCode);
    
    /**
     * Appends and returns a new empty "OperationTypeCode" element
     */
    com.sap.xi.ap.common.gdt.OperationTypeCode addNewOperationTypeCode();
    
    /**
     * Unsets the "OperationTypeCode" element
     */
    void unsetOperationTypeCode();
    
    /**
     * Gets the "BusinessTransactionDocumentReferenceID" element
     */
    com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID getBusinessTransactionDocumentReferenceID();
    
    /**
     * True if has "BusinessTransactionDocumentReferenceID" element
     */
    boolean isSetBusinessTransactionDocumentReferenceID();
    
    /**
     * Sets the "BusinessTransactionDocumentReferenceID" element
     */
    void setBusinessTransactionDocumentReferenceID(com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID businessTransactionDocumentReferenceID);
    
    /**
     * Appends and returns a new empty "BusinessTransactionDocumentReferenceID" element
     */
    com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID addNewBusinessTransactionDocumentReferenceID();
    
    /**
     * Unsets the "BusinessTransactionDocumentReferenceID" element
     */
    void unsetBusinessTransactionDocumentReferenceID();
    
    /**
     * Gets the "SiteLogisticsTaskReferencedObject" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskReferencedObject getSiteLogisticsTaskReferencedObject();
    
    /**
     * True if has "SiteLogisticsTaskReferencedObject" element
     */
    boolean isSetSiteLogisticsTaskReferencedObject();
    
    /**
     * Sets the "SiteLogisticsTaskReferencedObject" element
     */
    void setSiteLogisticsTaskReferencedObject(com.sap.xi.a1s.global.SiteLogisticsTaskReferencedObject siteLogisticsTaskReferencedObject);
    
    /**
     * Appends and returns a new empty "SiteLogisticsTaskReferencedObject" element
     */
    com.sap.xi.a1s.global.SiteLogisticsTaskReferencedObject addNewSiteLogisticsTaskReferencedObject();
    
    /**
     * Unsets the "SiteLogisticsTaskReferencedObject" element
     */
    void unsetSiteLogisticsTaskReferencedObject();
    
    /**
     * Gets the "CustomerParty" element
     */
    com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty getCustomerParty();
    
    /**
     * True if has "CustomerParty" element
     */
    boolean isSetCustomerParty();
    
    /**
     * Sets the "CustomerParty" element
     */
    void setCustomerParty(com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty customerParty);
    
    /**
     * Appends and returns a new empty "CustomerParty" element
     */
    com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty addNewCustomerParty();
    
    /**
     * Unsets the "CustomerParty" element
     */
    void unsetCustomerParty();
    
    /**
     * Gets the "EarliestExecutionStartDate" element
     */
    java.util.Calendar getEarliestExecutionStartDate();
    
    /**
     * Gets (as xml) the "EarliestExecutionStartDate" element
     */
    com.sap.xi.basis.global.GLOBALDateTime xgetEarliestExecutionStartDate();
    
    /**
     * True if has "EarliestExecutionStartDate" element
     */
    boolean isSetEarliestExecutionStartDate();
    
    /**
     * Sets the "EarliestExecutionStartDate" element
     */
    void setEarliestExecutionStartDate(java.util.Calendar earliestExecutionStartDate);
    
    /**
     * Sets (as xml) the "EarliestExecutionStartDate" element
     */
    void xsetEarliestExecutionStartDate(com.sap.xi.basis.global.GLOBALDateTime earliestExecutionStartDate);
    
    /**
     * Unsets the "EarliestExecutionStartDate" element
     */
    void unsetEarliestExecutionStartDate();
    
    /**
     * Gets the "LatestExecutionEndDate" element
     */
    java.util.Calendar getLatestExecutionEndDate();
    
    /**
     * Gets (as xml) the "LatestExecutionEndDate" element
     */
    com.sap.xi.basis.global.GLOBALDateTime xgetLatestExecutionEndDate();
    
    /**
     * True if has "LatestExecutionEndDate" element
     */
    boolean isSetLatestExecutionEndDate();
    
    /**
     * Sets the "LatestExecutionEndDate" element
     */
    void setLatestExecutionEndDate(java.util.Calendar latestExecutionEndDate);
    
    /**
     * Sets (as xml) the "LatestExecutionEndDate" element
     */
    void xsetLatestExecutionEndDate(com.sap.xi.basis.global.GLOBALDateTime latestExecutionEndDate);
    
    /**
     * Unsets the "LatestExecutionEndDate" element
     */
    void unsetLatestExecutionEndDate();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync newInstance() {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

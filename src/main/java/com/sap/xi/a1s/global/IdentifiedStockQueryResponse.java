/*
 * XML Type:  IdentifiedStockQueryResponse
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.IdentifiedStockQueryResponse
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML IdentifiedStockQueryResponse(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface IdentifiedStockQueryResponse extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdentifiedStockQueryResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE54F276BEA9A330AB693E7CF92C67E6A").resolveHandle("identifiedstockqueryresponse9featype");
    
    /**
     * Gets the "IdentifiedStockID" element
     */
    com.sap.xi.ap.common.gdt.IdentifiedStockID getIdentifiedStockID();
    
    /**
     * True if has "IdentifiedStockID" element
     */
    boolean isSetIdentifiedStockID();
    
    /**
     * Sets the "IdentifiedStockID" element
     */
    void setIdentifiedStockID(com.sap.xi.ap.common.gdt.IdentifiedStockID identifiedStockID);
    
    /**
     * Appends and returns a new empty "IdentifiedStockID" element
     */
    com.sap.xi.ap.common.gdt.IdentifiedStockID addNewIdentifiedStockID();
    
    /**
     * Unsets the "IdentifiedStockID" element
     */
    void unsetIdentifiedStockID();
    
    /**
     * Gets the "ExternalIdentifiedStockID" element
     */
    com.sap.xi.ap.common.gdt.IdentifiedStockID getExternalIdentifiedStockID();
    
    /**
     * True if has "ExternalIdentifiedStockID" element
     */
    boolean isSetExternalIdentifiedStockID();
    
    /**
     * Sets the "ExternalIdentifiedStockID" element
     */
    void setExternalIdentifiedStockID(com.sap.xi.ap.common.gdt.IdentifiedStockID externalIdentifiedStockID);
    
    /**
     * Appends and returns a new empty "ExternalIdentifiedStockID" element
     */
    com.sap.xi.ap.common.gdt.IdentifiedStockID addNewExternalIdentifiedStockID();
    
    /**
     * Unsets the "ExternalIdentifiedStockID" element
     */
    void unsetExternalIdentifiedStockID();
    
    /**
     * Gets the "ProductID" element
     */
    com.sap.xi.ap.common.gdt.ProductID getProductID();
    
    /**
     * True if has "ProductID" element
     */
    boolean isSetProductID();
    
    /**
     * Sets the "ProductID" element
     */
    void setProductID(com.sap.xi.ap.common.gdt.ProductID productID);
    
    /**
     * Appends and returns a new empty "ProductID" element
     */
    com.sap.xi.ap.common.gdt.ProductID addNewProductID();
    
    /**
     * Unsets the "ProductID" element
     */
    void unsetProductID();
    
    /**
     * Gets the "ProductionDateTime" element
     */
    java.util.Calendar getProductionDateTime();
    
    /**
     * Gets (as xml) the "ProductionDateTime" element
     */
    com.sap.xi.basis.global.GLOBALDateTime xgetProductionDateTime();
    
    /**
     * True if has "ProductionDateTime" element
     */
    boolean isSetProductionDateTime();
    
    /**
     * Sets the "ProductionDateTime" element
     */
    void setProductionDateTime(java.util.Calendar productionDateTime);
    
    /**
     * Sets (as xml) the "ProductionDateTime" element
     */
    void xsetProductionDateTime(com.sap.xi.basis.global.GLOBALDateTime productionDateTime);
    
    /**
     * Unsets the "ProductionDateTime" element
     */
    void unsetProductionDateTime();
    
    /**
     * Gets the "ExpirationDateTime" element
     */
    java.util.Calendar getExpirationDateTime();
    
    /**
     * Gets (as xml) the "ExpirationDateTime" element
     */
    com.sap.xi.basis.global.GLOBALDateTime xgetExpirationDateTime();
    
    /**
     * True if has "ExpirationDateTime" element
     */
    boolean isSetExpirationDateTime();
    
    /**
     * Sets the "ExpirationDateTime" element
     */
    void setExpirationDateTime(java.util.Calendar expirationDateTime);
    
    /**
     * Sets (as xml) the "ExpirationDateTime" element
     */
    void xsetExpirationDateTime(com.sap.xi.basis.global.GLOBALDateTime expirationDateTime);
    
    /**
     * Unsets the "ExpirationDateTime" element
     */
    void unsetExpirationDateTime();
    
    /**
     * Gets the "SupplierID" element
     */
    com.sap.xi.ap.common.global.PartyKey getSupplierID();
    
    /**
     * True if has "SupplierID" element
     */
    boolean isSetSupplierID();
    
    /**
     * Sets the "SupplierID" element
     */
    void setSupplierID(com.sap.xi.ap.common.global.PartyKey supplierID);
    
    /**
     * Appends and returns a new empty "SupplierID" element
     */
    com.sap.xi.ap.common.global.PartyKey addNewSupplierID();
    
    /**
     * Unsets the "SupplierID" element
     */
    void unsetSupplierID();
    
    /**
     * Gets the "ProductRequirementSpecificationKey" element
     */
    com.sap.xi.ap.common.global.RequirementSpecificationKey getProductRequirementSpecificationKey();
    
    /**
     * True if has "ProductRequirementSpecificationKey" element
     */
    boolean isSetProductRequirementSpecificationKey();
    
    /**
     * Sets the "ProductRequirementSpecificationKey" element
     */
    void setProductRequirementSpecificationKey(com.sap.xi.ap.common.global.RequirementSpecificationKey productRequirementSpecificationKey);
    
    /**
     * Appends and returns a new empty "ProductRequirementSpecificationKey" element
     */
    com.sap.xi.ap.common.global.RequirementSpecificationKey addNewProductRequirementSpecificationKey();
    
    /**
     * Unsets the "ProductRequirementSpecificationKey" element
     */
    void unsetProductRequirementSpecificationKey();
    
    /**
     * Gets the "LifeCycleStatusCode" element
     */
    com.sap.xi.ap.fo.identifiedstock.global.IdentifiedStockStatus getLifeCycleStatusCode();
    
    /**
     * True if has "LifeCycleStatusCode" element
     */
    boolean isSetLifeCycleStatusCode();
    
    /**
     * Sets the "LifeCycleStatusCode" element
     */
    void setLifeCycleStatusCode(com.sap.xi.ap.fo.identifiedstock.global.IdentifiedStockStatus lifeCycleStatusCode);
    
    /**
     * Appends and returns a new empty "LifeCycleStatusCode" element
     */
    com.sap.xi.ap.fo.identifiedstock.global.IdentifiedStockStatus addNewLifeCycleStatusCode();
    
    /**
     * Unsets the "LifeCycleStatusCode" element
     */
    void unsetLifeCycleStatusCode();
    
    /**
     * Gets array of all "Description" elements
     */
    com.sap.xi.ap.common.gdt.MEDIUMDescription[] getDescriptionArray();
    
    /**
     * Gets ith "Description" element
     */
    com.sap.xi.ap.common.gdt.MEDIUMDescription getDescriptionArray(int i);
    
    /**
     * Returns number of "Description" element
     */
    int sizeOfDescriptionArray();
    
    /**
     * Sets array of all "Description" element
     */
    void setDescriptionArray(com.sap.xi.ap.common.gdt.MEDIUMDescription[] descriptionArray);
    
    /**
     * Sets ith "Description" element
     */
    void setDescriptionArray(int i, com.sap.xi.ap.common.gdt.MEDIUMDescription description);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Description" element
     */
    com.sap.xi.ap.common.gdt.MEDIUMDescription insertNewDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Description" element
     */
    com.sap.xi.ap.common.gdt.MEDIUMDescription addNewDescription();
    
    /**
     * Removes the ith "Description" element
     */
    void removeDescription(int i);
    
    /**
     * Gets array of all "QuantityConversion" elements
     */
    com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest[] getQuantityConversionArray();
    
    /**
     * Gets ith "QuantityConversion" element
     */
    com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest getQuantityConversionArray(int i);
    
    /**
     * Returns number of "QuantityConversion" element
     */
    int sizeOfQuantityConversionArray();
    
    /**
     * Sets array of all "QuantityConversion" element
     */
    void setQuantityConversionArray(com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest[] quantityConversionArray);
    
    /**
     * Sets ith "QuantityConversion" element
     */
    void setQuantityConversionArray(int i, com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest quantityConversion);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QuantityConversion" element
     */
    com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest insertNewQuantityConversion(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QuantityConversion" element
     */
    com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest addNewQuantityConversion();
    
    /**
     * Removes the ith "QuantityConversion" element
     */
    void removeQuantityConversion(int i);
    
    /**
     * Gets the "AttachmentFolder" element
     */
    com.sap.xi.documentservices.global.AccessAttachmentFolder getAttachmentFolder();
    
    /**
     * True if has "AttachmentFolder" element
     */
    boolean isSetAttachmentFolder();
    
    /**
     * Sets the "AttachmentFolder" element
     */
    void setAttachmentFolder(com.sap.xi.documentservices.global.AccessAttachmentFolder attachmentFolder);
    
    /**
     * Appends and returns a new empty "AttachmentFolder" element
     */
    com.sap.xi.documentservices.global.AccessAttachmentFolder addNewAttachmentFolder();
    
    /**
     * Unsets the "AttachmentFolder" element
     */
    void unsetAttachmentFolder();
    
    /**
     * Gets the "TextCollection" element
     */
    com.sap.xi.documentservices.global.AccessTextCollection getTextCollection();
    
    /**
     * True if has "TextCollection" element
     */
    boolean isSetTextCollection();
    
    /**
     * Sets the "TextCollection" element
     */
    void setTextCollection(com.sap.xi.documentservices.global.AccessTextCollection textCollection);
    
    /**
     * Appends and returns a new empty "TextCollection" element
     */
    com.sap.xi.documentservices.global.AccessTextCollection addNewTextCollection();
    
    /**
     * Unsets the "TextCollection" element
     */
    void unsetTextCollection();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponse newInstance() {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponse parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponse parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.IdentifiedStockQueryResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.IdentifiedStockQueryResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

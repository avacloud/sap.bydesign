/*
 * XML Type:  ManageIdentifiedStocksRequest
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ManageIdentifiedStocksRequest
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML ManageIdentifiedStocksRequest(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface ManageIdentifiedStocksRequest extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ManageIdentifiedStocksRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sB771E6A4E5734821943EC48117D8A797").resolveHandle("manageidentifiedstocksrequesta818type");
    
    /**
     * Gets the "ObjectNodeSenderTechnicalID" element
     */
    java.lang.String getObjectNodeSenderTechnicalID();
    
    /**
     * Gets (as xml) the "ObjectNodeSenderTechnicalID" element
     */
    com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID xgetObjectNodeSenderTechnicalID();
    
    /**
     * True if has "ObjectNodeSenderTechnicalID" element
     */
    boolean isSetObjectNodeSenderTechnicalID();
    
    /**
     * Sets the "ObjectNodeSenderTechnicalID" element
     */
    void setObjectNodeSenderTechnicalID(java.lang.String objectNodeSenderTechnicalID);
    
    /**
     * Sets (as xml) the "ObjectNodeSenderTechnicalID" element
     */
    void xsetObjectNodeSenderTechnicalID(com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID objectNodeSenderTechnicalID);
    
    /**
     * Unsets the "ObjectNodeSenderTechnicalID" element
     */
    void unsetObjectNodeSenderTechnicalID();
    
    /**
     * Gets the "ChangeStateID" element
     */
    java.lang.String getChangeStateID();
    
    /**
     * Gets (as xml) the "ChangeStateID" element
     */
    com.sap.xi.ap.common.gdt.ChangeStateID xgetChangeStateID();
    
    /**
     * True if has "ChangeStateID" element
     */
    boolean isSetChangeStateID();
    
    /**
     * Sets the "ChangeStateID" element
     */
    void setChangeStateID(java.lang.String changeStateID);
    
    /**
     * Sets (as xml) the "ChangeStateID" element
     */
    void xsetChangeStateID(com.sap.xi.ap.common.gdt.ChangeStateID changeStateID);
    
    /**
     * Unsets the "ChangeStateID" element
     */
    void unsetChangeStateID();
    
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
     * Gets the "IdentifiedStockUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getIdentifiedStockUUID();
    
    /**
     * True if has "IdentifiedStockUUID" element
     */
    boolean isSetIdentifiedStockUUID();
    
    /**
     * Sets the "IdentifiedStockUUID" element
     */
    void setIdentifiedStockUUID(com.sap.xi.ap.common.gdt.UUID identifiedStockUUID);
    
    /**
     * Appends and returns a new empty "IdentifiedStockUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewIdentifiedStockUUID();
    
    /**
     * Unsets the "IdentifiedStockUUID" element
     */
    void unsetIdentifiedStockUUID();
    
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
     * Gets the "AttachmentFolder" element
     */
    com.sap.xi.documentservices.global.MaintenanceAttachmentFolder getAttachmentFolder();
    
    /**
     * True if has "AttachmentFolder" element
     */
    boolean isSetAttachmentFolder();
    
    /**
     * Sets the "AttachmentFolder" element
     */
    void setAttachmentFolder(com.sap.xi.documentservices.global.MaintenanceAttachmentFolder attachmentFolder);
    
    /**
     * Appends and returns a new empty "AttachmentFolder" element
     */
    com.sap.xi.documentservices.global.MaintenanceAttachmentFolder addNewAttachmentFolder();
    
    /**
     * Unsets the "AttachmentFolder" element
     */
    void unsetAttachmentFolder();
    
    /**
     * Gets the "TextCollection" element
     */
    com.sap.xi.documentservices.global.MaintenanceTextCollection getTextCollection();
    
    /**
     * True if has "TextCollection" element
     */
    boolean isSetTextCollection();
    
    /**
     * Sets the "TextCollection" element
     */
    void setTextCollection(com.sap.xi.documentservices.global.MaintenanceTextCollection textCollection);
    
    /**
     * Appends and returns a new empty "TextCollection" element
     */
    com.sap.xi.documentservices.global.MaintenanceTextCollection addNewTextCollection();
    
    /**
     * Unsets the "TextCollection" element
     */
    void unsetTextCollection();
    
    /**
     * Gets array of all "Description" elements
     */
    com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle[] getDescriptionArray();
    
    /**
     * Gets ith "Description" element
     */
    com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle getDescriptionArray(int i);
    
    /**
     * Returns number of "Description" element
     */
    int sizeOfDescriptionArray();
    
    /**
     * Sets array of all "Description" element
     */
    void setDescriptionArray(com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle[] descriptionArray);
    
    /**
     * Sets ith "Description" element
     */
    void setDescriptionArray(int i, com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle description);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Description" element
     */
    com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle insertNewDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Description" element
     */
    com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle addNewDescription();
    
    /**
     * Removes the ith "Description" element
     */
    void removeDescription(int i);
    
    /**
     * Gets array of all "QuantityConversion" elements
     */
    com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle[] getQuantityConversionArray();
    
    /**
     * Gets ith "QuantityConversion" element
     */
    com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle getQuantityConversionArray(int i);
    
    /**
     * Returns number of "QuantityConversion" element
     */
    int sizeOfQuantityConversionArray();
    
    /**
     * Sets array of all "QuantityConversion" element
     */
    void setQuantityConversionArray(com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle[] quantityConversionArray);
    
    /**
     * Sets ith "QuantityConversion" element
     */
    void setQuantityConversionArray(int i, com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle quantityConversion);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QuantityConversion" element
     */
    com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle insertNewQuantityConversion(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QuantityConversion" element
     */
    com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle addNewQuantityConversion();
    
    /**
     * Removes the ith "QuantityConversion" element
     */
    void removeQuantityConversion(int i);
    
    /**
     * Gets the "actionCode" attribute
     */
    com.sap.xi.ap.common.gdt.ActionCode.Enum getActionCode();
    
    /**
     * Gets (as xml) the "actionCode" attribute
     */
    com.sap.xi.ap.common.gdt.ActionCode xgetActionCode();
    
    /**
     * True if has "actionCode" attribute
     */
    boolean isSetActionCode();
    
    /**
     * Sets the "actionCode" attribute
     */
    void setActionCode(com.sap.xi.ap.common.gdt.ActionCode.Enum actionCode);
    
    /**
     * Sets (as xml) the "actionCode" attribute
     */
    void xsetActionCode(com.sap.xi.ap.common.gdt.ActionCode actionCode);
    
    /**
     * Unsets the "actionCode" attribute
     */
    void unsetActionCode();
    
    /**
     * Gets the "activateIdentifiedStockIndicator" attribute
     */
    boolean getActivateIdentifiedStockIndicator();
    
    /**
     * Gets (as xml) the "activateIdentifiedStockIndicator" attribute
     */
    com.sap.xi.ap.common.gdt.Indicator xgetActivateIdentifiedStockIndicator();
    
    /**
     * True if has "activateIdentifiedStockIndicator" attribute
     */
    boolean isSetActivateIdentifiedStockIndicator();
    
    /**
     * Sets the "activateIdentifiedStockIndicator" attribute
     */
    void setActivateIdentifiedStockIndicator(boolean activateIdentifiedStockIndicator);
    
    /**
     * Sets (as xml) the "activateIdentifiedStockIndicator" attribute
     */
    void xsetActivateIdentifiedStockIndicator(com.sap.xi.ap.common.gdt.Indicator activateIdentifiedStockIndicator);
    
    /**
     * Unsets the "activateIdentifiedStockIndicator" attribute
     */
    void unsetActivateIdentifiedStockIndicator();
    
    /**
     * Gets the "blockIdentifiedStockIndicator" attribute
     */
    boolean getBlockIdentifiedStockIndicator();
    
    /**
     * Gets (as xml) the "blockIdentifiedStockIndicator" attribute
     */
    com.sap.xi.ap.common.gdt.Indicator xgetBlockIdentifiedStockIndicator();
    
    /**
     * True if has "blockIdentifiedStockIndicator" attribute
     */
    boolean isSetBlockIdentifiedStockIndicator();
    
    /**
     * Sets the "blockIdentifiedStockIndicator" attribute
     */
    void setBlockIdentifiedStockIndicator(boolean blockIdentifiedStockIndicator);
    
    /**
     * Sets (as xml) the "blockIdentifiedStockIndicator" attribute
     */
    void xsetBlockIdentifiedStockIndicator(com.sap.xi.ap.common.gdt.Indicator blockIdentifiedStockIndicator);
    
    /**
     * Unsets the "blockIdentifiedStockIndicator" attribute
     */
    void unsetBlockIdentifiedStockIndicator();
    
    /**
     * Gets the "unblockIdentifiedStockIndicator" attribute
     */
    boolean getUnblockIdentifiedStockIndicator();
    
    /**
     * Gets (as xml) the "unblockIdentifiedStockIndicator" attribute
     */
    com.sap.xi.ap.common.gdt.Indicator xgetUnblockIdentifiedStockIndicator();
    
    /**
     * True if has "unblockIdentifiedStockIndicator" attribute
     */
    boolean isSetUnblockIdentifiedStockIndicator();
    
    /**
     * Sets the "unblockIdentifiedStockIndicator" attribute
     */
    void setUnblockIdentifiedStockIndicator(boolean unblockIdentifiedStockIndicator);
    
    /**
     * Sets (as xml) the "unblockIdentifiedStockIndicator" attribute
     */
    void xsetUnblockIdentifiedStockIndicator(com.sap.xi.ap.common.gdt.Indicator unblockIdentifiedStockIndicator);
    
    /**
     * Unsets the "unblockIdentifiedStockIndicator" attribute
     */
    void unsetUnblockIdentifiedStockIndicator();
    
    /**
     * Gets the "setObsoleteIdentifiedStockIndicator" attribute
     */
    boolean getSetObsoleteIdentifiedStockIndicator();
    
    /**
     * Gets (as xml) the "setObsoleteIdentifiedStockIndicator" attribute
     */
    com.sap.xi.ap.common.gdt.Indicator xgetSetObsoleteIdentifiedStockIndicator();
    
    /**
     * True if has "setObsoleteIdentifiedStockIndicator" attribute
     */
    boolean isSetSetObsoleteIdentifiedStockIndicator();
    
    /**
     * Sets the "setObsoleteIdentifiedStockIndicator" attribute
     */
    void setSetObsoleteIdentifiedStockIndicator(boolean setObsoleteIdentifiedStockIndicator);
    
    /**
     * Sets (as xml) the "setObsoleteIdentifiedStockIndicator" attribute
     */
    void xsetSetObsoleteIdentifiedStockIndicator(com.sap.xi.ap.common.gdt.Indicator setObsoleteIdentifiedStockIndicator);
    
    /**
     * Unsets the "setObsoleteIdentifiedStockIndicator" attribute
     */
    void unsetSetObsoleteIdentifiedStockIndicator();
    
    /**
     * Gets the "undoObsoleteIdentifiedStockIndicator" attribute
     */
    boolean getUndoObsoleteIdentifiedStockIndicator();
    
    /**
     * Gets (as xml) the "undoObsoleteIdentifiedStockIndicator" attribute
     */
    com.sap.xi.ap.common.gdt.Indicator xgetUndoObsoleteIdentifiedStockIndicator();
    
    /**
     * True if has "undoObsoleteIdentifiedStockIndicator" attribute
     */
    boolean isSetUndoObsoleteIdentifiedStockIndicator();
    
    /**
     * Sets the "undoObsoleteIdentifiedStockIndicator" attribute
     */
    void setUndoObsoleteIdentifiedStockIndicator(boolean undoObsoleteIdentifiedStockIndicator);
    
    /**
     * Sets (as xml) the "undoObsoleteIdentifiedStockIndicator" attribute
     */
    void xsetUndoObsoleteIdentifiedStockIndicator(com.sap.xi.ap.common.gdt.Indicator undoObsoleteIdentifiedStockIndicator);
    
    /**
     * Unsets the "undoObsoleteIdentifiedStockIndicator" attribute
     */
    void unsetUndoObsoleteIdentifiedStockIndicator();
    
    /**
     * Gets the "descriptionListCompleteTransmissionIndicator" attribute
     */
    boolean getDescriptionListCompleteTransmissionIndicator();
    
    /**
     * Gets (as xml) the "descriptionListCompleteTransmissionIndicator" attribute
     */
    com.sap.xi.ap.common.gdt.Indicator xgetDescriptionListCompleteTransmissionIndicator();
    
    /**
     * True if has "descriptionListCompleteTransmissionIndicator" attribute
     */
    boolean isSetDescriptionListCompleteTransmissionIndicator();
    
    /**
     * Sets the "descriptionListCompleteTransmissionIndicator" attribute
     */
    void setDescriptionListCompleteTransmissionIndicator(boolean descriptionListCompleteTransmissionIndicator);
    
    /**
     * Sets (as xml) the "descriptionListCompleteTransmissionIndicator" attribute
     */
    void xsetDescriptionListCompleteTransmissionIndicator(com.sap.xi.ap.common.gdt.Indicator descriptionListCompleteTransmissionIndicator);
    
    /**
     * Unsets the "descriptionListCompleteTransmissionIndicator" attribute
     */
    void unsetDescriptionListCompleteTransmissionIndicator();
    
    /**
     * Gets the "quantityConversionListCompleteTransmissionIndicator" attribute
     */
    boolean getQuantityConversionListCompleteTransmissionIndicator();
    
    /**
     * Gets (as xml) the "quantityConversionListCompleteTransmissionIndicator" attribute
     */
    com.sap.xi.ap.common.gdt.Indicator xgetQuantityConversionListCompleteTransmissionIndicator();
    
    /**
     * True if has "quantityConversionListCompleteTransmissionIndicator" attribute
     */
    boolean isSetQuantityConversionListCompleteTransmissionIndicator();
    
    /**
     * Sets the "quantityConversionListCompleteTransmissionIndicator" attribute
     */
    void setQuantityConversionListCompleteTransmissionIndicator(boolean quantityConversionListCompleteTransmissionIndicator);
    
    /**
     * Sets (as xml) the "quantityConversionListCompleteTransmissionIndicator" attribute
     */
    void xsetQuantityConversionListCompleteTransmissionIndicator(com.sap.xi.ap.common.gdt.Indicator quantityConversionListCompleteTransmissionIndicator);
    
    /**
     * Unsets the "quantityConversionListCompleteTransmissionIndicator" attribute
     */
    void unsetQuantityConversionListCompleteTransmissionIndicator();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.ManageIdentifiedStocksRequest newInstance() {
          return (com.sap.xi.a1s.global.ManageIdentifiedStocksRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStocksRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.ManageIdentifiedStocksRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.ManageIdentifiedStocksRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStocksRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStocksRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStocksRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.ManageIdentifiedStocksRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStocksRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStocksRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStocksRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStocksRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStocksRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStocksRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStocksRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStocksRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStocksRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStocksRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStocksRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStocksRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStocksRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStocksRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStocksRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStocksRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStocksRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStocksRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStocksRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStocksRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStocksRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.ManageIdentifiedStocksRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStocksRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ManageIdentifiedStocksRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStocksRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ManageIdentifiedStocksRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ManageIdentifiedStocksRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

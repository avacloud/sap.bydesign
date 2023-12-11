/*
 * XML Type:  IdentifiedStockRequestQuery
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.IdentifiedStockRequestQuery
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML IdentifiedStockRequestQuery(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface IdentifiedStockRequestQuery extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdentifiedStockRequestQuery.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE54F276BEA9A330AB693E7CF92C67E6A").resolveHandle("identifiedstockrequestqueryb6f6type");
    
    /**
     * Gets array of all "SelectionByIdentifiedStockID" elements
     */
    com.sap.xi.ap.common.global.SelectionByIdentifier[] getSelectionByIdentifiedStockIDArray();
    
    /**
     * Gets ith "SelectionByIdentifiedStockID" element
     */
    com.sap.xi.ap.common.global.SelectionByIdentifier getSelectionByIdentifiedStockIDArray(int i);
    
    /**
     * Returns number of "SelectionByIdentifiedStockID" element
     */
    int sizeOfSelectionByIdentifiedStockIDArray();
    
    /**
     * Sets array of all "SelectionByIdentifiedStockID" element
     */
    void setSelectionByIdentifiedStockIDArray(com.sap.xi.ap.common.global.SelectionByIdentifier[] selectionByIdentifiedStockIDArray);
    
    /**
     * Sets ith "SelectionByIdentifiedStockID" element
     */
    void setSelectionByIdentifiedStockIDArray(int i, com.sap.xi.ap.common.global.SelectionByIdentifier selectionByIdentifiedStockID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByIdentifiedStockID" element
     */
    com.sap.xi.ap.common.global.SelectionByIdentifier insertNewSelectionByIdentifiedStockID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByIdentifiedStockID" element
     */
    com.sap.xi.ap.common.global.SelectionByIdentifier addNewSelectionByIdentifiedStockID();
    
    /**
     * Removes the ith "SelectionByIdentifiedStockID" element
     */
    void removeSelectionByIdentifiedStockID(int i);
    
    /**
     * Gets array of all "SelectionByExternalIdentifiedStockID" elements
     */
    com.sap.xi.ap.common.global.SelectionByIdentifier[] getSelectionByExternalIdentifiedStockIDArray();
    
    /**
     * Gets ith "SelectionByExternalIdentifiedStockID" element
     */
    com.sap.xi.ap.common.global.SelectionByIdentifier getSelectionByExternalIdentifiedStockIDArray(int i);
    
    /**
     * Returns number of "SelectionByExternalIdentifiedStockID" element
     */
    int sizeOfSelectionByExternalIdentifiedStockIDArray();
    
    /**
     * Sets array of all "SelectionByExternalIdentifiedStockID" element
     */
    void setSelectionByExternalIdentifiedStockIDArray(com.sap.xi.ap.common.global.SelectionByIdentifier[] selectionByExternalIdentifiedStockIDArray);
    
    /**
     * Sets ith "SelectionByExternalIdentifiedStockID" element
     */
    void setSelectionByExternalIdentifiedStockIDArray(int i, com.sap.xi.ap.common.global.SelectionByIdentifier selectionByExternalIdentifiedStockID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByExternalIdentifiedStockID" element
     */
    com.sap.xi.ap.common.global.SelectionByIdentifier insertNewSelectionByExternalIdentifiedStockID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByExternalIdentifiedStockID" element
     */
    com.sap.xi.ap.common.global.SelectionByIdentifier addNewSelectionByExternalIdentifiedStockID();
    
    /**
     * Removes the ith "SelectionByExternalIdentifiedStockID" element
     */
    void removeSelectionByExternalIdentifiedStockID(int i);
    
    /**
     * Gets the "SelectionBySearchText" element
     */
    java.lang.String getSelectionBySearchText();
    
    /**
     * Gets (as xml) the "SelectionBySearchText" element
     */
    com.sap.xi.ap.common.gdt.SearchText xgetSelectionBySearchText();
    
    /**
     * True if has "SelectionBySearchText" element
     */
    boolean isSetSelectionBySearchText();
    
    /**
     * Sets the "SelectionBySearchText" element
     */
    void setSelectionBySearchText(java.lang.String selectionBySearchText);
    
    /**
     * Sets (as xml) the "SelectionBySearchText" element
     */
    void xsetSelectionBySearchText(com.sap.xi.ap.common.gdt.SearchText selectionBySearchText);
    
    /**
     * Unsets the "SelectionBySearchText" element
     */
    void unsetSelectionBySearchText();
    
    /**
     * Gets array of all "SelectionByIdentifiedStockDescription" elements
     */
    com.sap.xi.ap.common.global.SelectionByText[] getSelectionByIdentifiedStockDescriptionArray();
    
    /**
     * Gets ith "SelectionByIdentifiedStockDescription" element
     */
    com.sap.xi.ap.common.global.SelectionByText getSelectionByIdentifiedStockDescriptionArray(int i);
    
    /**
     * Returns number of "SelectionByIdentifiedStockDescription" element
     */
    int sizeOfSelectionByIdentifiedStockDescriptionArray();
    
    /**
     * Sets array of all "SelectionByIdentifiedStockDescription" element
     */
    void setSelectionByIdentifiedStockDescriptionArray(com.sap.xi.ap.common.global.SelectionByText[] selectionByIdentifiedStockDescriptionArray);
    
    /**
     * Sets ith "SelectionByIdentifiedStockDescription" element
     */
    void setSelectionByIdentifiedStockDescriptionArray(int i, com.sap.xi.ap.common.global.SelectionByText selectionByIdentifiedStockDescription);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByIdentifiedStockDescription" element
     */
    com.sap.xi.ap.common.global.SelectionByText insertNewSelectionByIdentifiedStockDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByIdentifiedStockDescription" element
     */
    com.sap.xi.ap.common.global.SelectionByText addNewSelectionByIdentifiedStockDescription();
    
    /**
     * Removes the ith "SelectionByIdentifiedStockDescription" element
     */
    void removeSelectionByIdentifiedStockDescription(int i);
    
    /**
     * Gets array of all "SelectionBySupplierIDPartyID" elements
     */
    com.sap.xi.ap.common.global.SelectionByIdentifier[] getSelectionBySupplierIDPartyIDArray();
    
    /**
     * Gets ith "SelectionBySupplierIDPartyID" element
     */
    com.sap.xi.ap.common.global.SelectionByIdentifier getSelectionBySupplierIDPartyIDArray(int i);
    
    /**
     * Returns number of "SelectionBySupplierIDPartyID" element
     */
    int sizeOfSelectionBySupplierIDPartyIDArray();
    
    /**
     * Sets array of all "SelectionBySupplierIDPartyID" element
     */
    void setSelectionBySupplierIDPartyIDArray(com.sap.xi.ap.common.global.SelectionByIdentifier[] selectionBySupplierIDPartyIDArray);
    
    /**
     * Sets ith "SelectionBySupplierIDPartyID" element
     */
    void setSelectionBySupplierIDPartyIDArray(int i, com.sap.xi.ap.common.global.SelectionByIdentifier selectionBySupplierIDPartyID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionBySupplierIDPartyID" element
     */
    com.sap.xi.ap.common.global.SelectionByIdentifier insertNewSelectionBySupplierIDPartyID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionBySupplierIDPartyID" element
     */
    com.sap.xi.ap.common.global.SelectionByIdentifier addNewSelectionBySupplierIDPartyID();
    
    /**
     * Removes the ith "SelectionBySupplierIDPartyID" element
     */
    void removeSelectionBySupplierIDPartyID(int i);
    
    /**
     * Gets array of all "SelectionByLifeCycleStatusCode" elements
     */
    com.sap.xi.ap.common.global.SelectionByCode[] getSelectionByLifeCycleStatusCodeArray();
    
    /**
     * Gets ith "SelectionByLifeCycleStatusCode" element
     */
    com.sap.xi.ap.common.global.SelectionByCode getSelectionByLifeCycleStatusCodeArray(int i);
    
    /**
     * Returns number of "SelectionByLifeCycleStatusCode" element
     */
    int sizeOfSelectionByLifeCycleStatusCodeArray();
    
    /**
     * Sets array of all "SelectionByLifeCycleStatusCode" element
     */
    void setSelectionByLifeCycleStatusCodeArray(com.sap.xi.ap.common.global.SelectionByCode[] selectionByLifeCycleStatusCodeArray);
    
    /**
     * Sets ith "SelectionByLifeCycleStatusCode" element
     */
    void setSelectionByLifeCycleStatusCodeArray(int i, com.sap.xi.ap.common.global.SelectionByCode selectionByLifeCycleStatusCode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByLifeCycleStatusCode" element
     */
    com.sap.xi.ap.common.global.SelectionByCode insertNewSelectionByLifeCycleStatusCode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByLifeCycleStatusCode" element
     */
    com.sap.xi.ap.common.global.SelectionByCode addNewSelectionByLifeCycleStatusCode();
    
    /**
     * Removes the ith "SelectionByLifeCycleStatusCode" element
     */
    void removeSelectionByLifeCycleStatusCode(int i);
    
    /**
     * Gets array of all "SelectionByIdentifiedStockTypeCode" elements
     */
    com.sap.xi.ap.common.global.SelectionByCode[] getSelectionByIdentifiedStockTypeCodeArray();
    
    /**
     * Gets ith "SelectionByIdentifiedStockTypeCode" element
     */
    com.sap.xi.ap.common.global.SelectionByCode getSelectionByIdentifiedStockTypeCodeArray(int i);
    
    /**
     * Returns number of "SelectionByIdentifiedStockTypeCode" element
     */
    int sizeOfSelectionByIdentifiedStockTypeCodeArray();
    
    /**
     * Sets array of all "SelectionByIdentifiedStockTypeCode" element
     */
    void setSelectionByIdentifiedStockTypeCodeArray(com.sap.xi.ap.common.global.SelectionByCode[] selectionByIdentifiedStockTypeCodeArray);
    
    /**
     * Sets ith "SelectionByIdentifiedStockTypeCode" element
     */
    void setSelectionByIdentifiedStockTypeCodeArray(int i, com.sap.xi.ap.common.global.SelectionByCode selectionByIdentifiedStockTypeCode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByIdentifiedStockTypeCode" element
     */
    com.sap.xi.ap.common.global.SelectionByCode insertNewSelectionByIdentifiedStockTypeCode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByIdentifiedStockTypeCode" element
     */
    com.sap.xi.ap.common.global.SelectionByCode addNewSelectionByIdentifiedStockTypeCode();
    
    /**
     * Removes the ith "SelectionByIdentifiedStockTypeCode" element
     */
    void removeSelectionByIdentifiedStockTypeCode(int i);
    
    /**
     * Gets array of all "SelectionByProductValuationLevelTypeCode" elements
     */
    com.sap.xi.ap.common.global.SelectionByCode[] getSelectionByProductValuationLevelTypeCodeArray();
    
    /**
     * Gets ith "SelectionByProductValuationLevelTypeCode" element
     */
    com.sap.xi.ap.common.global.SelectionByCode getSelectionByProductValuationLevelTypeCodeArray(int i);
    
    /**
     * Returns number of "SelectionByProductValuationLevelTypeCode" element
     */
    int sizeOfSelectionByProductValuationLevelTypeCodeArray();
    
    /**
     * Sets array of all "SelectionByProductValuationLevelTypeCode" element
     */
    void setSelectionByProductValuationLevelTypeCodeArray(com.sap.xi.ap.common.global.SelectionByCode[] selectionByProductValuationLevelTypeCodeArray);
    
    /**
     * Sets ith "SelectionByProductValuationLevelTypeCode" element
     */
    void setSelectionByProductValuationLevelTypeCodeArray(int i, com.sap.xi.ap.common.global.SelectionByCode selectionByProductValuationLevelTypeCode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByProductValuationLevelTypeCode" element
     */
    com.sap.xi.ap.common.global.SelectionByCode insertNewSelectionByProductValuationLevelTypeCode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByProductValuationLevelTypeCode" element
     */
    com.sap.xi.ap.common.global.SelectionByCode addNewSelectionByProductValuationLevelTypeCode();
    
    /**
     * Removes the ith "SelectionByProductValuationLevelTypeCode" element
     */
    void removeSelectionByProductValuationLevelTypeCode(int i);
    
    /**
     * Gets array of all "SelectionByProductionDateTime" elements
     */
    com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[] getSelectionByProductionDateTimeArray();
    
    /**
     * Gets ith "SelectionByProductionDateTime" element
     */
    com.sap.xi.ap.common.global.GLOBALSelectionByDateTime getSelectionByProductionDateTimeArray(int i);
    
    /**
     * Returns number of "SelectionByProductionDateTime" element
     */
    int sizeOfSelectionByProductionDateTimeArray();
    
    /**
     * Sets array of all "SelectionByProductionDateTime" element
     */
    void setSelectionByProductionDateTimeArray(com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[] selectionByProductionDateTimeArray);
    
    /**
     * Sets ith "SelectionByProductionDateTime" element
     */
    void setSelectionByProductionDateTimeArray(int i, com.sap.xi.ap.common.global.GLOBALSelectionByDateTime selectionByProductionDateTime);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByProductionDateTime" element
     */
    com.sap.xi.ap.common.global.GLOBALSelectionByDateTime insertNewSelectionByProductionDateTime(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByProductionDateTime" element
     */
    com.sap.xi.ap.common.global.GLOBALSelectionByDateTime addNewSelectionByProductionDateTime();
    
    /**
     * Removes the ith "SelectionByProductionDateTime" element
     */
    void removeSelectionByProductionDateTime(int i);
    
    /**
     * Gets array of all "SelectionByExpirationDateTime" elements
     */
    com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[] getSelectionByExpirationDateTimeArray();
    
    /**
     * Gets ith "SelectionByExpirationDateTime" element
     */
    com.sap.xi.ap.common.global.GLOBALSelectionByDateTime getSelectionByExpirationDateTimeArray(int i);
    
    /**
     * Returns number of "SelectionByExpirationDateTime" element
     */
    int sizeOfSelectionByExpirationDateTimeArray();
    
    /**
     * Sets array of all "SelectionByExpirationDateTime" element
     */
    void setSelectionByExpirationDateTimeArray(com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[] selectionByExpirationDateTimeArray);
    
    /**
     * Sets ith "SelectionByExpirationDateTime" element
     */
    void setSelectionByExpirationDateTimeArray(int i, com.sap.xi.ap.common.global.GLOBALSelectionByDateTime selectionByExpirationDateTime);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByExpirationDateTime" element
     */
    com.sap.xi.ap.common.global.GLOBALSelectionByDateTime insertNewSelectionByExpirationDateTime(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByExpirationDateTime" element
     */
    com.sap.xi.ap.common.global.GLOBALSelectionByDateTime addNewSelectionByExpirationDateTime();
    
    /**
     * Removes the ith "SelectionByExpirationDateTime" element
     */
    void removeSelectionByExpirationDateTime(int i);
    
    /**
     * Gets array of all "SelectionByMaterialKeyProductID" elements
     */
    com.sap.xi.ap.common.global.SelectionByIdentifier[] getSelectionByMaterialKeyProductIDArray();
    
    /**
     * Gets ith "SelectionByMaterialKeyProductID" element
     */
    com.sap.xi.ap.common.global.SelectionByIdentifier getSelectionByMaterialKeyProductIDArray(int i);
    
    /**
     * Returns number of "SelectionByMaterialKeyProductID" element
     */
    int sizeOfSelectionByMaterialKeyProductIDArray();
    
    /**
     * Sets array of all "SelectionByMaterialKeyProductID" element
     */
    void setSelectionByMaterialKeyProductIDArray(com.sap.xi.ap.common.global.SelectionByIdentifier[] selectionByMaterialKeyProductIDArray);
    
    /**
     * Sets ith "SelectionByMaterialKeyProductID" element
     */
    void setSelectionByMaterialKeyProductIDArray(int i, com.sap.xi.ap.common.global.SelectionByIdentifier selectionByMaterialKeyProductID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByMaterialKeyProductID" element
     */
    com.sap.xi.ap.common.global.SelectionByIdentifier insertNewSelectionByMaterialKeyProductID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByMaterialKeyProductID" element
     */
    com.sap.xi.ap.common.global.SelectionByIdentifier addNewSelectionByMaterialKeyProductID();
    
    /**
     * Removes the ith "SelectionByMaterialKeyProductID" element
     */
    void removeSelectionByMaterialKeyProductID(int i);
    
    /**
     * Gets array of all "SelectionByProductRequirementSpecificationKeyRequirementSpecificationID" elements
     */
    com.sap.xi.ap.common.global.SelectionByIdentifier[] getSelectionByProductRequirementSpecificationKeyRequirementSpecificationIDArray();
    
    /**
     * Gets ith "SelectionByProductRequirementSpecificationKeyRequirementSpecificationID" element
     */
    com.sap.xi.ap.common.global.SelectionByIdentifier getSelectionByProductRequirementSpecificationKeyRequirementSpecificationIDArray(int i);
    
    /**
     * Returns number of "SelectionByProductRequirementSpecificationKeyRequirementSpecificationID" element
     */
    int sizeOfSelectionByProductRequirementSpecificationKeyRequirementSpecificationIDArray();
    
    /**
     * Sets array of all "SelectionByProductRequirementSpecificationKeyRequirementSpecificationID" element
     */
    void setSelectionByProductRequirementSpecificationKeyRequirementSpecificationIDArray(com.sap.xi.ap.common.global.SelectionByIdentifier[] selectionByProductRequirementSpecificationKeyRequirementSpecificationIDArray);
    
    /**
     * Sets ith "SelectionByProductRequirementSpecificationKeyRequirementSpecificationID" element
     */
    void setSelectionByProductRequirementSpecificationKeyRequirementSpecificationIDArray(int i, com.sap.xi.ap.common.global.SelectionByIdentifier selectionByProductRequirementSpecificationKeyRequirementSpecificationID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByProductRequirementSpecificationKeyRequirementSpecificationID" element
     */
    com.sap.xi.ap.common.global.SelectionByIdentifier insertNewSelectionByProductRequirementSpecificationKeyRequirementSpecificationID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByProductRequirementSpecificationKeyRequirementSpecificationID" element
     */
    com.sap.xi.ap.common.global.SelectionByIdentifier addNewSelectionByProductRequirementSpecificationKeyRequirementSpecificationID();
    
    /**
     * Removes the ith "SelectionByProductRequirementSpecificationKeyRequirementSpecificationID" element
     */
    void removeSelectionByProductRequirementSpecificationKeyRequirementSpecificationID(int i);
    
    /**
     * Gets array of all "SelectionByAdministrativeDataCreationDateTime" elements
     */
    com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[] getSelectionByAdministrativeDataCreationDateTimeArray();
    
    /**
     * Gets ith "SelectionByAdministrativeDataCreationDateTime" element
     */
    com.sap.xi.ap.common.global.GLOBALSelectionByDateTime getSelectionByAdministrativeDataCreationDateTimeArray(int i);
    
    /**
     * Returns number of "SelectionByAdministrativeDataCreationDateTime" element
     */
    int sizeOfSelectionByAdministrativeDataCreationDateTimeArray();
    
    /**
     * Sets array of all "SelectionByAdministrativeDataCreationDateTime" element
     */
    void setSelectionByAdministrativeDataCreationDateTimeArray(com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[] selectionByAdministrativeDataCreationDateTimeArray);
    
    /**
     * Sets ith "SelectionByAdministrativeDataCreationDateTime" element
     */
    void setSelectionByAdministrativeDataCreationDateTimeArray(int i, com.sap.xi.ap.common.global.GLOBALSelectionByDateTime selectionByAdministrativeDataCreationDateTime);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByAdministrativeDataCreationDateTime" element
     */
    com.sap.xi.ap.common.global.GLOBALSelectionByDateTime insertNewSelectionByAdministrativeDataCreationDateTime(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByAdministrativeDataCreationDateTime" element
     */
    com.sap.xi.ap.common.global.GLOBALSelectionByDateTime addNewSelectionByAdministrativeDataCreationDateTime();
    
    /**
     * Removes the ith "SelectionByAdministrativeDataCreationDateTime" element
     */
    void removeSelectionByAdministrativeDataCreationDateTime(int i);
    
    /**
     * Gets array of all "SelectionByAdministrativeDataLastChangeDateTime" elements
     */
    com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[] getSelectionByAdministrativeDataLastChangeDateTimeArray();
    
    /**
     * Gets ith "SelectionByAdministrativeDataLastChangeDateTime" element
     */
    com.sap.xi.ap.common.global.GLOBALSelectionByDateTime getSelectionByAdministrativeDataLastChangeDateTimeArray(int i);
    
    /**
     * Returns number of "SelectionByAdministrativeDataLastChangeDateTime" element
     */
    int sizeOfSelectionByAdministrativeDataLastChangeDateTimeArray();
    
    /**
     * Sets array of all "SelectionByAdministrativeDataLastChangeDateTime" element
     */
    void setSelectionByAdministrativeDataLastChangeDateTimeArray(com.sap.xi.ap.common.global.GLOBALSelectionByDateTime[] selectionByAdministrativeDataLastChangeDateTimeArray);
    
    /**
     * Sets ith "SelectionByAdministrativeDataLastChangeDateTime" element
     */
    void setSelectionByAdministrativeDataLastChangeDateTimeArray(int i, com.sap.xi.ap.common.global.GLOBALSelectionByDateTime selectionByAdministrativeDataLastChangeDateTime);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SelectionByAdministrativeDataLastChangeDateTime" element
     */
    com.sap.xi.ap.common.global.GLOBALSelectionByDateTime insertNewSelectionByAdministrativeDataLastChangeDateTime(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SelectionByAdministrativeDataLastChangeDateTime" element
     */
    com.sap.xi.ap.common.global.GLOBALSelectionByDateTime addNewSelectionByAdministrativeDataLastChangeDateTime();
    
    /**
     * Removes the ith "SelectionByAdministrativeDataLastChangeDateTime" element
     */
    void removeSelectionByAdministrativeDataLastChangeDateTime(int i);
    
    /**
     * Gets the "selectionByBatchManagedIndicator" element
     */
    boolean getSelectionByBatchManagedIndicator();
    
    /**
     * Gets (as xml) the "selectionByBatchManagedIndicator" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetSelectionByBatchManagedIndicator();
    
    /**
     * True if has "selectionByBatchManagedIndicator" element
     */
    boolean isSetSelectionByBatchManagedIndicator();
    
    /**
     * Sets the "selectionByBatchManagedIndicator" element
     */
    void setSelectionByBatchManagedIndicator(boolean selectionByBatchManagedIndicator);
    
    /**
     * Sets (as xml) the "selectionByBatchManagedIndicator" element
     */
    void xsetSelectionByBatchManagedIndicator(com.sap.xi.ap.common.gdt.Indicator selectionByBatchManagedIndicator);
    
    /**
     * Unsets the "selectionByBatchManagedIndicator" element
     */
    void unsetSelectionByBatchManagedIndicator();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.IdentifiedStockRequestQuery newInstance() {
          return (com.sap.xi.a1s.global.IdentifiedStockRequestQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockRequestQuery newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.IdentifiedStockRequestQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.IdentifiedStockRequestQuery parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockRequestQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockRequestQuery parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockRequestQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.IdentifiedStockRequestQuery parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockRequestQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockRequestQuery parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockRequestQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockRequestQuery parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockRequestQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockRequestQuery parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockRequestQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockRequestQuery parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockRequestQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockRequestQuery parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockRequestQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockRequestQuery parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockRequestQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockRequestQuery parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.IdentifiedStockRequestQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockRequestQuery parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockRequestQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockRequestQuery parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockRequestQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockRequestQuery parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockRequestQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.IdentifiedStockRequestQuery parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.IdentifiedStockRequestQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.IdentifiedStockRequestQuery parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.IdentifiedStockRequestQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.IdentifiedStockRequestQuery parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.IdentifiedStockRequestQuery) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

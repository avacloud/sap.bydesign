/*
 * XML Type:  MaterialByElementsResponseMaterialSales
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML MaterialByElementsResponseMaterialSales(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface MaterialByElementsResponseMaterialSales extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MaterialByElementsResponseMaterialSales.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7B8FAE3D556F3A1A6A1FE3D414B4E0DE").resolveHandle("materialbyelementsresponsematerialsales943btype");
    
    /**
     * Gets the "SalesOrganisationID" element
     */
    java.lang.String getSalesOrganisationID();
    
    /**
     * Gets (as xml) the "SalesOrganisationID" element
     */
    com.sap.xi.ap.common.gdt.OrganisationalCentreID xgetSalesOrganisationID();
    
    /**
     * True if has "SalesOrganisationID" element
     */
    boolean isSetSalesOrganisationID();
    
    /**
     * Sets the "SalesOrganisationID" element
     */
    void setSalesOrganisationID(java.lang.String salesOrganisationID);
    
    /**
     * Sets (as xml) the "SalesOrganisationID" element
     */
    void xsetSalesOrganisationID(com.sap.xi.ap.common.gdt.OrganisationalCentreID salesOrganisationID);
    
    /**
     * Unsets the "SalesOrganisationID" element
     */
    void unsetSalesOrganisationID();
    
    /**
     * Gets the "DistributionChannelCode" element
     */
    com.sap.xi.ap.common.gdt.DistributionChannelCode getDistributionChannelCode();
    
    /**
     * True if has "DistributionChannelCode" element
     */
    boolean isSetDistributionChannelCode();
    
    /**
     * Sets the "DistributionChannelCode" element
     */
    void setDistributionChannelCode(com.sap.xi.ap.common.gdt.DistributionChannelCode distributionChannelCode);
    
    /**
     * Appends and returns a new empty "DistributionChannelCode" element
     */
    com.sap.xi.ap.common.gdt.DistributionChannelCode addNewDistributionChannelCode();
    
    /**
     * Unsets the "DistributionChannelCode" element
     */
    void unsetDistributionChannelCode();
    
    /**
     * Gets the "LifeCycleStatusCode" element
     */
    com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode.Enum getLifeCycleStatusCode();
    
    /**
     * Gets (as xml) the "LifeCycleStatusCode" element
     */
    com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode xgetLifeCycleStatusCode();
    
    /**
     * True if has "LifeCycleStatusCode" element
     */
    boolean isSetLifeCycleStatusCode();
    
    /**
     * Sets the "LifeCycleStatusCode" element
     */
    void setLifeCycleStatusCode(com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode.Enum lifeCycleStatusCode);
    
    /**
     * Sets (as xml) the "LifeCycleStatusCode" element
     */
    void xsetLifeCycleStatusCode(com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode lifeCycleStatusCode);
    
    /**
     * Unsets the "LifeCycleStatusCode" element
     */
    void unsetLifeCycleStatusCode();
    
    /**
     * Gets the "SalesMeasureUnitCode" element
     */
    java.lang.String getSalesMeasureUnitCode();
    
    /**
     * Gets (as xml) the "SalesMeasureUnitCode" element
     */
    com.sap.xi.ap.common.gdt.MeasureUnitCode xgetSalesMeasureUnitCode();
    
    /**
     * True if has "SalesMeasureUnitCode" element
     */
    boolean isSetSalesMeasureUnitCode();
    
    /**
     * Sets the "SalesMeasureUnitCode" element
     */
    void setSalesMeasureUnitCode(java.lang.String salesMeasureUnitCode);
    
    /**
     * Sets (as xml) the "SalesMeasureUnitCode" element
     */
    void xsetSalesMeasureUnitCode(com.sap.xi.ap.common.gdt.MeasureUnitCode salesMeasureUnitCode);
    
    /**
     * Unsets the "SalesMeasureUnitCode" element
     */
    void unsetSalesMeasureUnitCode();
    
    /**
     * Gets the "MinimumOrderQuantityValue" element
     */
    java.math.BigDecimal getMinimumOrderQuantityValue();
    
    /**
     * Gets (as xml) the "MinimumOrderQuantityValue" element
     */
    com.sap.xi.ap.common.gdt.DecimalValue xgetMinimumOrderQuantityValue();
    
    /**
     * True if has "MinimumOrderQuantityValue" element
     */
    boolean isSetMinimumOrderQuantityValue();
    
    /**
     * Sets the "MinimumOrderQuantityValue" element
     */
    void setMinimumOrderQuantityValue(java.math.BigDecimal minimumOrderQuantityValue);
    
    /**
     * Sets (as xml) the "MinimumOrderQuantityValue" element
     */
    void xsetMinimumOrderQuantityValue(com.sap.xi.ap.common.gdt.DecimalValue minimumOrderQuantityValue);
    
    /**
     * Unsets the "MinimumOrderQuantityValue" element
     */
    void unsetMinimumOrderQuantityValue();
    
    /**
     * Gets the "ItemGroupCode" element
     */
    java.lang.String getItemGroupCode();
    
    /**
     * Gets (as xml) the "ItemGroupCode" element
     */
    com.sap.xi.ap.common.gdt.CustomerTransactionDocumentItemProcessingTypeDeterminationProductGroupCode xgetItemGroupCode();
    
    /**
     * True if has "ItemGroupCode" element
     */
    boolean isSetItemGroupCode();
    
    /**
     * Sets the "ItemGroupCode" element
     */
    void setItemGroupCode(java.lang.String itemGroupCode);
    
    /**
     * Sets (as xml) the "ItemGroupCode" element
     */
    void xsetItemGroupCode(com.sap.xi.ap.common.gdt.CustomerTransactionDocumentItemProcessingTypeDeterminationProductGroupCode itemGroupCode);
    
    /**
     * Unsets the "ItemGroupCode" element
     */
    void unsetItemGroupCode();
    
    /**
     * Gets the "CashDiscountDeductibleIndicator" element
     */
    boolean getCashDiscountDeductibleIndicator();
    
    /**
     * Gets (as xml) the "CashDiscountDeductibleIndicator" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetCashDiscountDeductibleIndicator();
    
    /**
     * True if has "CashDiscountDeductibleIndicator" element
     */
    boolean isSetCashDiscountDeductibleIndicator();
    
    /**
     * Sets the "CashDiscountDeductibleIndicator" element
     */
    void setCashDiscountDeductibleIndicator(boolean cashDiscountDeductibleIndicator);
    
    /**
     * Sets (as xml) the "CashDiscountDeductibleIndicator" element
     */
    void xsetCashDiscountDeductibleIndicator(com.sap.xi.ap.common.gdt.Indicator cashDiscountDeductibleIndicator);
    
    /**
     * Unsets the "CashDiscountDeductibleIndicator" element
     */
    void unsetCashDiscountDeductibleIndicator();
    
    /**
     * Gets the "ReferencePriceMaterialInternalID" element
     */
    com.sap.xi.ap.common.gdt.ProductInternalID getReferencePriceMaterialInternalID();
    
    /**
     * True if has "ReferencePriceMaterialInternalID" element
     */
    boolean isSetReferencePriceMaterialInternalID();
    
    /**
     * Sets the "ReferencePriceMaterialInternalID" element
     */
    void setReferencePriceMaterialInternalID(com.sap.xi.ap.common.gdt.ProductInternalID referencePriceMaterialInternalID);
    
    /**
     * Appends and returns a new empty "ReferencePriceMaterialInternalID" element
     */
    com.sap.xi.ap.common.gdt.ProductInternalID addNewReferencePriceMaterialInternalID();
    
    /**
     * Unsets the "ReferencePriceMaterialInternalID" element
     */
    void unsetReferencePriceMaterialInternalID();
    
    /**
     * Gets array of all "Warranty" elements
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty[] getWarrantyArray();
    
    /**
     * Gets ith "Warranty" element
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty getWarrantyArray(int i);
    
    /**
     * Returns number of "Warranty" element
     */
    int sizeOfWarrantyArray();
    
    /**
     * Sets array of all "Warranty" element
     */
    void setWarrantyArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty[] warrantyArray);
    
    /**
     * Sets ith "Warranty" element
     */
    void setWarrantyArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty warranty);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Warranty" element
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty insertNewWarranty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Warranty" element
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty addNewWarranty();
    
    /**
     * Removes the ith "Warranty" element
     */
    void removeWarranty(int i);
    
    /**
     * Gets array of all "InternalNote" elements
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText[] getInternalNoteArray();
    
    /**
     * Gets ith "InternalNote" element
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText getInternalNoteArray(int i);
    
    /**
     * Returns number of "InternalNote" element
     */
    int sizeOfInternalNoteArray();
    
    /**
     * Sets array of all "InternalNote" element
     */
    void setInternalNoteArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText[] internalNoteArray);
    
    /**
     * Sets ith "InternalNote" element
     */
    void setInternalNoteArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText internalNote);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "InternalNote" element
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText insertNewInternalNote(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "InternalNote" element
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText addNewInternalNote();
    
    /**
     * Removes the ith "InternalNote" element
     */
    void removeInternalNote(int i);
    
    /**
     * Gets array of all "SalesNote" elements
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText[] getSalesNoteArray();
    
    /**
     * Gets ith "SalesNote" element
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText getSalesNoteArray(int i);
    
    /**
     * Returns number of "SalesNote" element
     */
    int sizeOfSalesNoteArray();
    
    /**
     * Sets array of all "SalesNote" element
     */
    void setSalesNoteArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText[] salesNoteArray);
    
    /**
     * Sets ith "SalesNote" element
     */
    void setSalesNoteArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText salesNote);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SalesNote" element
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText insertNewSalesNote(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SalesNote" element
     */
    com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText addNewSalesNote();
    
    /**
     * Removes the ith "SalesNote" element
     */
    void removeSalesNote(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales newInstance() {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

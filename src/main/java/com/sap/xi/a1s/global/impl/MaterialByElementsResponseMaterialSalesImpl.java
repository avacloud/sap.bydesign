/*
 * XML Type:  MaterialByElementsResponseMaterialSales
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsResponseMaterialSales(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsResponseMaterialSalesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSales
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsResponseMaterialSalesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SALESORGANISATIONID$0 = 
        new javax.xml.namespace.QName("", "SalesOrganisationID");
    private static final javax.xml.namespace.QName DISTRIBUTIONCHANNELCODE$2 = 
        new javax.xml.namespace.QName("", "DistributionChannelCode");
    private static final javax.xml.namespace.QName LIFECYCLESTATUSCODE$4 = 
        new javax.xml.namespace.QName("", "LifeCycleStatusCode");
    private static final javax.xml.namespace.QName SALESMEASUREUNITCODE$6 = 
        new javax.xml.namespace.QName("", "SalesMeasureUnitCode");
    private static final javax.xml.namespace.QName MINIMUMORDERQUANTITYVALUE$8 = 
        new javax.xml.namespace.QName("", "MinimumOrderQuantityValue");
    private static final javax.xml.namespace.QName ITEMGROUPCODE$10 = 
        new javax.xml.namespace.QName("", "ItemGroupCode");
    private static final javax.xml.namespace.QName CASHDISCOUNTDEDUCTIBLEINDICATOR$12 = 
        new javax.xml.namespace.QName("", "CashDiscountDeductibleIndicator");
    private static final javax.xml.namespace.QName REFERENCEPRICEMATERIALINTERNALID$14 = 
        new javax.xml.namespace.QName("", "ReferencePriceMaterialInternalID");
    private static final javax.xml.namespace.QName WARRANTY$16 = 
        new javax.xml.namespace.QName("", "Warranty");
    private static final javax.xml.namespace.QName INTERNALNOTE$18 = 
        new javax.xml.namespace.QName("", "InternalNote");
    private static final javax.xml.namespace.QName SALESNOTE$20 = 
        new javax.xml.namespace.QName("", "SalesNote");
    
    
    /**
     * Gets the "SalesOrganisationID" element
     */
    public java.lang.String getSalesOrganisationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALESORGANISATIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SalesOrganisationID" element
     */
    public com.sap.xi.ap.common.gdt.OrganisationalCentreID xgetSalesOrganisationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OrganisationalCentreID target = null;
            target = (com.sap.xi.ap.common.gdt.OrganisationalCentreID)get_store().find_element_user(SALESORGANISATIONID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "SalesOrganisationID" element
     */
    public boolean isSetSalesOrganisationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SALESORGANISATIONID$0) != 0;
        }
    }
    
    /**
     * Sets the "SalesOrganisationID" element
     */
    public void setSalesOrganisationID(java.lang.String salesOrganisationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALESORGANISATIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALESORGANISATIONID$0);
            }
            target.setStringValue(salesOrganisationID);
        }
    }
    
    /**
     * Sets (as xml) the "SalesOrganisationID" element
     */
    public void xsetSalesOrganisationID(com.sap.xi.ap.common.gdt.OrganisationalCentreID salesOrganisationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OrganisationalCentreID target = null;
            target = (com.sap.xi.ap.common.gdt.OrganisationalCentreID)get_store().find_element_user(SALESORGANISATIONID$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.OrganisationalCentreID)get_store().add_element_user(SALESORGANISATIONID$0);
            }
            target.set(salesOrganisationID);
        }
    }
    
    /**
     * Unsets the "SalesOrganisationID" element
     */
    public void unsetSalesOrganisationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SALESORGANISATIONID$0, 0);
        }
    }
    
    /**
     * Gets the "DistributionChannelCode" element
     */
    public com.sap.xi.ap.common.gdt.DistributionChannelCode getDistributionChannelCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DistributionChannelCode target = null;
            target = (com.sap.xi.ap.common.gdt.DistributionChannelCode)get_store().find_element_user(DISTRIBUTIONCHANNELCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DistributionChannelCode" element
     */
    public boolean isSetDistributionChannelCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTRIBUTIONCHANNELCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "DistributionChannelCode" element
     */
    public void setDistributionChannelCode(com.sap.xi.ap.common.gdt.DistributionChannelCode distributionChannelCode)
    {
        generatedSetterHelperImpl(distributionChannelCode, DISTRIBUTIONCHANNELCODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DistributionChannelCode" element
     */
    public com.sap.xi.ap.common.gdt.DistributionChannelCode addNewDistributionChannelCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DistributionChannelCode target = null;
            target = (com.sap.xi.ap.common.gdt.DistributionChannelCode)get_store().add_element_user(DISTRIBUTIONCHANNELCODE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "DistributionChannelCode" element
     */
    public void unsetDistributionChannelCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTRIBUTIONCHANNELCODE$2, 0);
        }
    }
    
    /**
     * Gets the "LifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode.Enum getLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIFECYCLESTATUSCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "LifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode xgetLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode)get_store().find_element_user(LIFECYCLESTATUSCODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "LifeCycleStatusCode" element
     */
    public boolean isSetLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIFECYCLESTATUSCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "LifeCycleStatusCode" element
     */
    public void setLifeCycleStatusCode(com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode.Enum lifeCycleStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIFECYCLESTATUSCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIFECYCLESTATUSCODE$4);
            }
            target.setEnumValue(lifeCycleStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "LifeCycleStatusCode" element
     */
    public void xsetLifeCycleStatusCode(com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode lifeCycleStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode)get_store().find_element_user(LIFECYCLESTATUSCODE$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProductProcessUsabilityLifeCycleStatusCode)get_store().add_element_user(LIFECYCLESTATUSCODE$4);
            }
            target.set(lifeCycleStatusCode);
        }
    }
    
    /**
     * Unsets the "LifeCycleStatusCode" element
     */
    public void unsetLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIFECYCLESTATUSCODE$4, 0);
        }
    }
    
    /**
     * Gets the "SalesMeasureUnitCode" element
     */
    public java.lang.String getSalesMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALESMEASUREUNITCODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SalesMeasureUnitCode" element
     */
    public com.sap.xi.ap.common.gdt.MeasureUnitCode xgetSalesMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MeasureUnitCode target = null;
            target = (com.sap.xi.ap.common.gdt.MeasureUnitCode)get_store().find_element_user(SALESMEASUREUNITCODE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "SalesMeasureUnitCode" element
     */
    public boolean isSetSalesMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SALESMEASUREUNITCODE$6) != 0;
        }
    }
    
    /**
     * Sets the "SalesMeasureUnitCode" element
     */
    public void setSalesMeasureUnitCode(java.lang.String salesMeasureUnitCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALESMEASUREUNITCODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALESMEASUREUNITCODE$6);
            }
            target.setStringValue(salesMeasureUnitCode);
        }
    }
    
    /**
     * Sets (as xml) the "SalesMeasureUnitCode" element
     */
    public void xsetSalesMeasureUnitCode(com.sap.xi.ap.common.gdt.MeasureUnitCode salesMeasureUnitCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MeasureUnitCode target = null;
            target = (com.sap.xi.ap.common.gdt.MeasureUnitCode)get_store().find_element_user(SALESMEASUREUNITCODE$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.MeasureUnitCode)get_store().add_element_user(SALESMEASUREUNITCODE$6);
            }
            target.set(salesMeasureUnitCode);
        }
    }
    
    /**
     * Unsets the "SalesMeasureUnitCode" element
     */
    public void unsetSalesMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SALESMEASUREUNITCODE$6, 0);
        }
    }
    
    /**
     * Gets the "MinimumOrderQuantityValue" element
     */
    public java.math.BigDecimal getMinimumOrderQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMORDERQUANTITYVALUE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "MinimumOrderQuantityValue" element
     */
    public com.sap.xi.ap.common.gdt.DecimalValue xgetMinimumOrderQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DecimalValue target = null;
            target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().find_element_user(MINIMUMORDERQUANTITYVALUE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "MinimumOrderQuantityValue" element
     */
    public boolean isSetMinimumOrderQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MINIMUMORDERQUANTITYVALUE$8) != 0;
        }
    }
    
    /**
     * Sets the "MinimumOrderQuantityValue" element
     */
    public void setMinimumOrderQuantityValue(java.math.BigDecimal minimumOrderQuantityValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMORDERQUANTITYVALUE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINIMUMORDERQUANTITYVALUE$8);
            }
            target.setBigDecimalValue(minimumOrderQuantityValue);
        }
    }
    
    /**
     * Sets (as xml) the "MinimumOrderQuantityValue" element
     */
    public void xsetMinimumOrderQuantityValue(com.sap.xi.ap.common.gdt.DecimalValue minimumOrderQuantityValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DecimalValue target = null;
            target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().find_element_user(MINIMUMORDERQUANTITYVALUE$8, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DecimalValue)get_store().add_element_user(MINIMUMORDERQUANTITYVALUE$8);
            }
            target.set(minimumOrderQuantityValue);
        }
    }
    
    /**
     * Unsets the "MinimumOrderQuantityValue" element
     */
    public void unsetMinimumOrderQuantityValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MINIMUMORDERQUANTITYVALUE$8, 0);
        }
    }
    
    /**
     * Gets the "ItemGroupCode" element
     */
    public java.lang.String getItemGroupCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ITEMGROUPCODE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ItemGroupCode" element
     */
    public com.sap.xi.ap.common.gdt.CustomerTransactionDocumentItemProcessingTypeDeterminationProductGroupCode xgetItemGroupCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.CustomerTransactionDocumentItemProcessingTypeDeterminationProductGroupCode target = null;
            target = (com.sap.xi.ap.common.gdt.CustomerTransactionDocumentItemProcessingTypeDeterminationProductGroupCode)get_store().find_element_user(ITEMGROUPCODE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "ItemGroupCode" element
     */
    public boolean isSetItemGroupCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITEMGROUPCODE$10) != 0;
        }
    }
    
    /**
     * Sets the "ItemGroupCode" element
     */
    public void setItemGroupCode(java.lang.String itemGroupCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ITEMGROUPCODE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ITEMGROUPCODE$10);
            }
            target.setStringValue(itemGroupCode);
        }
    }
    
    /**
     * Sets (as xml) the "ItemGroupCode" element
     */
    public void xsetItemGroupCode(com.sap.xi.ap.common.gdt.CustomerTransactionDocumentItemProcessingTypeDeterminationProductGroupCode itemGroupCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.CustomerTransactionDocumentItemProcessingTypeDeterminationProductGroupCode target = null;
            target = (com.sap.xi.ap.common.gdt.CustomerTransactionDocumentItemProcessingTypeDeterminationProductGroupCode)get_store().find_element_user(ITEMGROUPCODE$10, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.CustomerTransactionDocumentItemProcessingTypeDeterminationProductGroupCode)get_store().add_element_user(ITEMGROUPCODE$10);
            }
            target.set(itemGroupCode);
        }
    }
    
    /**
     * Unsets the "ItemGroupCode" element
     */
    public void unsetItemGroupCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITEMGROUPCODE$10, 0);
        }
    }
    
    /**
     * Gets the "CashDiscountDeductibleIndicator" element
     */
    public boolean getCashDiscountDeductibleIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASHDISCOUNTDEDUCTIBLEINDICATOR$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "CashDiscountDeductibleIndicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetCashDiscountDeductibleIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CASHDISCOUNTDEDUCTIBLEINDICATOR$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "CashDiscountDeductibleIndicator" element
     */
    public boolean isSetCashDiscountDeductibleIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CASHDISCOUNTDEDUCTIBLEINDICATOR$12) != 0;
        }
    }
    
    /**
     * Sets the "CashDiscountDeductibleIndicator" element
     */
    public void setCashDiscountDeductibleIndicator(boolean cashDiscountDeductibleIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASHDISCOUNTDEDUCTIBLEINDICATOR$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CASHDISCOUNTDEDUCTIBLEINDICATOR$12);
            }
            target.setBooleanValue(cashDiscountDeductibleIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "CashDiscountDeductibleIndicator" element
     */
    public void xsetCashDiscountDeductibleIndicator(com.sap.xi.ap.common.gdt.Indicator cashDiscountDeductibleIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CASHDISCOUNTDEDUCTIBLEINDICATOR$12, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(CASHDISCOUNTDEDUCTIBLEINDICATOR$12);
            }
            target.set(cashDiscountDeductibleIndicator);
        }
    }
    
    /**
     * Unsets the "CashDiscountDeductibleIndicator" element
     */
    public void unsetCashDiscountDeductibleIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CASHDISCOUNTDEDUCTIBLEINDICATOR$12, 0);
        }
    }
    
    /**
     * Gets the "ReferencePriceMaterialInternalID" element
     */
    public com.sap.xi.ap.common.gdt.ProductInternalID getReferencePriceMaterialInternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductInternalID)get_store().find_element_user(REFERENCEPRICEMATERIALINTERNALID$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReferencePriceMaterialInternalID" element
     */
    public boolean isSetReferencePriceMaterialInternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCEPRICEMATERIALINTERNALID$14) != 0;
        }
    }
    
    /**
     * Sets the "ReferencePriceMaterialInternalID" element
     */
    public void setReferencePriceMaterialInternalID(com.sap.xi.ap.common.gdt.ProductInternalID referencePriceMaterialInternalID)
    {
        generatedSetterHelperImpl(referencePriceMaterialInternalID, REFERENCEPRICEMATERIALINTERNALID$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ReferencePriceMaterialInternalID" element
     */
    public com.sap.xi.ap.common.gdt.ProductInternalID addNewReferencePriceMaterialInternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductInternalID)get_store().add_element_user(REFERENCEPRICEMATERIALINTERNALID$14);
            return target;
        }
    }
    
    /**
     * Unsets the "ReferencePriceMaterialInternalID" element
     */
    public void unsetReferencePriceMaterialInternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCEPRICEMATERIALINTERNALID$14, 0);
        }
    }
    
    /**
     * Gets array of all "Warranty" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty[] getWarrantyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WARRANTY$16, targetList);
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty[] result = new com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Warranty" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty getWarrantyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty)get_store().find_element_user(WARRANTY$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Warranty" element
     */
    public int sizeOfWarrantyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WARRANTY$16);
        }
    }
    
    /**
     * Sets array of all "Warranty" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setWarrantyArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty[] warrantyArray)
    {
        check_orphaned();
        arraySetterHelper(warrantyArray, WARRANTY$16);
    }
    
    /**
     * Sets ith "Warranty" element
     */
    public void setWarrantyArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty warranty)
    {
        generatedSetterHelperImpl(warranty, WARRANTY$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Warranty" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty insertNewWarranty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty)get_store().insert_element_user(WARRANTY$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Warranty" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty addNewWarranty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty)get_store().add_element_user(WARRANTY$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "Warranty" element
     */
    public void removeWarranty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WARRANTY$16, i);
        }
    }
    
    /**
     * Gets array of all "InternalNote" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText[] getInternalNoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INTERNALNOTE$18, targetList);
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText[] result = new com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "InternalNote" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText getInternalNoteArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText)get_store().find_element_user(INTERNALNOTE$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "InternalNote" element
     */
    public int sizeOfInternalNoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERNALNOTE$18);
        }
    }
    
    /**
     * Sets array of all "InternalNote" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setInternalNoteArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText[] internalNoteArray)
    {
        check_orphaned();
        arraySetterHelper(internalNoteArray, INTERNALNOTE$18);
    }
    
    /**
     * Sets ith "InternalNote" element
     */
    public void setInternalNoteArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText internalNote)
    {
        generatedSetterHelperImpl(internalNote, INTERNALNOTE$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "InternalNote" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText insertNewInternalNote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText)get_store().insert_element_user(INTERNALNOTE$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "InternalNote" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText addNewInternalNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText)get_store().add_element_user(INTERNALNOTE$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "InternalNote" element
     */
    public void removeInternalNote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERNALNOTE$18, i);
        }
    }
    
    /**
     * Gets array of all "SalesNote" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText[] getSalesNoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SALESNOTE$20, targetList);
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText[] result = new com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SalesNote" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText getSalesNoteArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText)get_store().find_element_user(SALESNOTE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SalesNote" element
     */
    public int sizeOfSalesNoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SALESNOTE$20);
        }
    }
    
    /**
     * Sets array of all "SalesNote" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSalesNoteArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText[] salesNoteArray)
    {
        check_orphaned();
        arraySetterHelper(salesNoteArray, SALESNOTE$20);
    }
    
    /**
     * Sets ith "SalesNote" element
     */
    public void setSalesNoteArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText salesNote)
    {
        generatedSetterHelperImpl(salesNote, SALESNOTE$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SalesNote" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText insertNewSalesNote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText)get_store().insert_element_user(SALESNOTE$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SalesNote" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText addNewSalesNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText)get_store().add_element_user(SALESNOTE$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "SalesNote" element
     */
    public void removeSalesNote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SALESNOTE$20, i);
        }
    }
}

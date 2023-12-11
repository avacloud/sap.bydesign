/*
 * XML Type:  MaterialByElementsResponseMaterialDeviantTaxClassification
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsResponseMaterialDeviantTaxClassification(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsResponseMaterialDeviantTaxClassificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsResponseMaterialDeviantTaxClassification
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsResponseMaterialDeviantTaxClassificationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRYCODE$0 = 
        new javax.xml.namespace.QName("", "CountryCode");
    private static final javax.xml.namespace.QName REGIONCODE$2 = 
        new javax.xml.namespace.QName("", "RegionCode");
    private static final javax.xml.namespace.QName TAXTYPECODE$4 = 
        new javax.xml.namespace.QName("", "TaxTypeCode");
    private static final javax.xml.namespace.QName TAXRATETYPECODE$6 = 
        new javax.xml.namespace.QName("", "TaxRateTypeCode");
    private static final javax.xml.namespace.QName TAXEXEMPTIONREASONCODE$8 = 
        new javax.xml.namespace.QName("", "TaxExemptionReasonCode");
    
    
    /**
     * Gets the "CountryCode" element
     */
    public java.lang.String getCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CountryCode" element
     */
    public com.sap.xi.ap.common.gdt.CountryCode xgetCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.CountryCode target = null;
            target = (com.sap.xi.ap.common.gdt.CountryCode)get_store().find_element_user(COUNTRYCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "CountryCode" element
     */
    public boolean isSetCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRYCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "CountryCode" element
     */
    public void setCountryCode(java.lang.String countryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRYCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRYCODE$0);
            }
            target.setStringValue(countryCode);
        }
    }
    
    /**
     * Sets (as xml) the "CountryCode" element
     */
    public void xsetCountryCode(com.sap.xi.ap.common.gdt.CountryCode countryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.CountryCode target = null;
            target = (com.sap.xi.ap.common.gdt.CountryCode)get_store().find_element_user(COUNTRYCODE$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.CountryCode)get_store().add_element_user(COUNTRYCODE$0);
            }
            target.set(countryCode);
        }
    }
    
    /**
     * Unsets the "CountryCode" element
     */
    public void unsetCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRYCODE$0, 0);
        }
    }
    
    /**
     * Gets the "RegionCode" element
     */
    public com.sap.xi.ap.common.gdt.RegionCode getRegionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.RegionCode target = null;
            target = (com.sap.xi.ap.common.gdt.RegionCode)get_store().find_element_user(REGIONCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RegionCode" element
     */
    public boolean isSetRegionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGIONCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "RegionCode" element
     */
    public void setRegionCode(com.sap.xi.ap.common.gdt.RegionCode regionCode)
    {
        generatedSetterHelperImpl(regionCode, REGIONCODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RegionCode" element
     */
    public com.sap.xi.ap.common.gdt.RegionCode addNewRegionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.RegionCode target = null;
            target = (com.sap.xi.ap.common.gdt.RegionCode)get_store().add_element_user(REGIONCODE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "RegionCode" element
     */
    public void unsetRegionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGIONCODE$2, 0);
        }
    }
    
    /**
     * Gets the "TaxTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.TaxTypeCode getTaxTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TaxTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.TaxTypeCode)get_store().find_element_user(TAXTYPECODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TaxTypeCode" element
     */
    public boolean isSetTaxTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAXTYPECODE$4) != 0;
        }
    }
    
    /**
     * Sets the "TaxTypeCode" element
     */
    public void setTaxTypeCode(com.sap.xi.ap.common.gdt.TaxTypeCode taxTypeCode)
    {
        generatedSetterHelperImpl(taxTypeCode, TAXTYPECODE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TaxTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.TaxTypeCode addNewTaxTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TaxTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.TaxTypeCode)get_store().add_element_user(TAXTYPECODE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "TaxTypeCode" element
     */
    public void unsetTaxTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAXTYPECODE$4, 0);
        }
    }
    
    /**
     * Gets the "TaxRateTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.TaxRateTypeCode getTaxRateTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TaxRateTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.TaxRateTypeCode)get_store().find_element_user(TAXRATETYPECODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TaxRateTypeCode" element
     */
    public boolean isSetTaxRateTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAXRATETYPECODE$6) != 0;
        }
    }
    
    /**
     * Sets the "TaxRateTypeCode" element
     */
    public void setTaxRateTypeCode(com.sap.xi.ap.common.gdt.TaxRateTypeCode taxRateTypeCode)
    {
        generatedSetterHelperImpl(taxRateTypeCode, TAXRATETYPECODE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TaxRateTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.TaxRateTypeCode addNewTaxRateTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TaxRateTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.TaxRateTypeCode)get_store().add_element_user(TAXRATETYPECODE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "TaxRateTypeCode" element
     */
    public void unsetTaxRateTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAXRATETYPECODE$6, 0);
        }
    }
    
    /**
     * Gets the "TaxExemptionReasonCode" element
     */
    public com.sap.xi.ap.common.gdt.TaxExemptionReasonCode getTaxExemptionReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TaxExemptionReasonCode target = null;
            target = (com.sap.xi.ap.common.gdt.TaxExemptionReasonCode)get_store().find_element_user(TAXEXEMPTIONREASONCODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TaxExemptionReasonCode" element
     */
    public boolean isSetTaxExemptionReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAXEXEMPTIONREASONCODE$8) != 0;
        }
    }
    
    /**
     * Sets the "TaxExemptionReasonCode" element
     */
    public void setTaxExemptionReasonCode(com.sap.xi.ap.common.gdt.TaxExemptionReasonCode taxExemptionReasonCode)
    {
        generatedSetterHelperImpl(taxExemptionReasonCode, TAXEXEMPTIONREASONCODE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TaxExemptionReasonCode" element
     */
    public com.sap.xi.ap.common.gdt.TaxExemptionReasonCode addNewTaxExemptionReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TaxExemptionReasonCode target = null;
            target = (com.sap.xi.ap.common.gdt.TaxExemptionReasonCode)get_store().add_element_user(TAXEXEMPTIONREASONCODE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "TaxExemptionReasonCode" element
     */
    public void unsetTaxExemptionReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAXEXEMPTIONREASONCODE$8, 0);
        }
    }
}

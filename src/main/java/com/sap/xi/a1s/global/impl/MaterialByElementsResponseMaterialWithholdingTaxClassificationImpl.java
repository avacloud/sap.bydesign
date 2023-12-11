/*
 * XML Type:  MaterialByElementsResponseMaterialWithholdingTaxClassification
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialWithholdingTaxClassification
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsResponseMaterialWithholdingTaxClassification(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsResponseMaterialWithholdingTaxClassificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsResponseMaterialWithholdingTaxClassification
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsResponseMaterialWithholdingTaxClassificationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRYCODE$0 = 
        new javax.xml.namespace.QName("", "CountryCode");
    private static final javax.xml.namespace.QName TAXTYPECODE$2 = 
        new javax.xml.namespace.QName("", "TaxTypeCode");
    private static final javax.xml.namespace.QName WITHHOLDINGTAXINCOMETYPECODE$4 = 
        new javax.xml.namespace.QName("", "WithholdingTaxIncomeTypeCode");
    
    
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
     * Gets the "TaxTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.TaxTypeCode getTaxTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TaxTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.TaxTypeCode)get_store().find_element_user(TAXTYPECODE$2, 0);
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
            return get_store().count_elements(TAXTYPECODE$2) != 0;
        }
    }
    
    /**
     * Sets the "TaxTypeCode" element
     */
    public void setTaxTypeCode(com.sap.xi.ap.common.gdt.TaxTypeCode taxTypeCode)
    {
        generatedSetterHelperImpl(taxTypeCode, TAXTYPECODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.TaxTypeCode)get_store().add_element_user(TAXTYPECODE$2);
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
            get_store().remove_element(TAXTYPECODE$2, 0);
        }
    }
    
    /**
     * Gets the "WithholdingTaxIncomeTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.WithholdingTaxIncomeTypeCode getWithholdingTaxIncomeTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.WithholdingTaxIncomeTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.WithholdingTaxIncomeTypeCode)get_store().find_element_user(WITHHOLDINGTAXINCOMETYPECODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "WithholdingTaxIncomeTypeCode" element
     */
    public boolean isSetWithholdingTaxIncomeTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WITHHOLDINGTAXINCOMETYPECODE$4) != 0;
        }
    }
    
    /**
     * Sets the "WithholdingTaxIncomeTypeCode" element
     */
    public void setWithholdingTaxIncomeTypeCode(com.sap.xi.ap.common.gdt.WithholdingTaxIncomeTypeCode withholdingTaxIncomeTypeCode)
    {
        generatedSetterHelperImpl(withholdingTaxIncomeTypeCode, WITHHOLDINGTAXINCOMETYPECODE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "WithholdingTaxIncomeTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.WithholdingTaxIncomeTypeCode addNewWithholdingTaxIncomeTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.WithholdingTaxIncomeTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.WithholdingTaxIncomeTypeCode)get_store().add_element_user(WITHHOLDINGTAXINCOMETYPECODE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "WithholdingTaxIncomeTypeCode" element
     */
    public void unsetWithholdingTaxIncomeTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WITHHOLDINGTAXINCOMETYPECODE$4, 0);
        }
    }
}

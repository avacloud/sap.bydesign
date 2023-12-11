/*
 * XML Type:  MaterialByElementsResponseMaterialSalesWarranty
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsResponseMaterialSalesWarranty(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsResponseMaterialSalesWarrantyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSalesWarranty
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsResponseMaterialSalesWarrantyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTINTERNALID$0 = 
        new javax.xml.namespace.QName("", "ProductInternalID");
    private static final javax.xml.namespace.QName VALIDITYPERIOD$2 = 
        new javax.xml.namespace.QName("", "ValidityPeriod");
    
    
    /**
     * Gets the "ProductInternalID" element
     */
    public com.sap.xi.ap.common.gdt.ProductInternalID getProductInternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductInternalID)get_store().find_element_user(PRODUCTINTERNALID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductInternalID" element
     */
    public boolean isSetProductInternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTINTERNALID$0) != 0;
        }
    }
    
    /**
     * Sets the "ProductInternalID" element
     */
    public void setProductInternalID(com.sap.xi.ap.common.gdt.ProductInternalID productInternalID)
    {
        generatedSetterHelperImpl(productInternalID, PRODUCTINTERNALID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductInternalID" element
     */
    public com.sap.xi.ap.common.gdt.ProductInternalID addNewProductInternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductInternalID)get_store().add_element_user(PRODUCTINTERNALID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductInternalID" element
     */
    public void unsetProductInternalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTINTERNALID$0, 0);
        }
    }
    
    /**
     * Gets the "ValidityPeriod" element
     */
    public com.sap.xi.ap.common.gdt.CLOSEDDatePeriod getValidityPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.CLOSEDDatePeriod target = null;
            target = (com.sap.xi.ap.common.gdt.CLOSEDDatePeriod)get_store().find_element_user(VALIDITYPERIOD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ValidityPeriod" element
     */
    public boolean isSetValidityPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDITYPERIOD$2) != 0;
        }
    }
    
    /**
     * Sets the "ValidityPeriod" element
     */
    public void setValidityPeriod(com.sap.xi.ap.common.gdt.CLOSEDDatePeriod validityPeriod)
    {
        generatedSetterHelperImpl(validityPeriod, VALIDITYPERIOD$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ValidityPeriod" element
     */
    public com.sap.xi.ap.common.gdt.CLOSEDDatePeriod addNewValidityPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.CLOSEDDatePeriod target = null;
            target = (com.sap.xi.ap.common.gdt.CLOSEDDatePeriod)get_store().add_element_user(VALIDITYPERIOD$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ValidityPeriod" element
     */
    public void unsetValidityPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDITYPERIOD$2, 0);
        }
    }
}

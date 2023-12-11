/*
 * XML Type:  IdentifiedStockQuantityConversionQueryRequest
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML IdentifiedStockQuantityConversionQueryRequest(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class IdentifiedStockQuantityConversionQueryRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.IdentifiedStockQuantityConversionQueryRequest
{
    private static final long serialVersionUID = 1L;
    
    public IdentifiedStockQuantityConversionQueryRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASEQUANTITY$0 = 
        new javax.xml.namespace.QName("", "BaseQuantity");
    private static final javax.xml.namespace.QName CORRESPONDINGQUANTITY$2 = 
        new javax.xml.namespace.QName("", "CorrespondingQuantity");
    
    
    /**
     * Gets the "BaseQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity getBaseQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(BASEQUANTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BaseQuantity" element
     */
    public boolean isSetBaseQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BASEQUANTITY$0) != 0;
        }
    }
    
    /**
     * Sets the "BaseQuantity" element
     */
    public void setBaseQuantity(com.sap.xi.ap.common.gdt.Quantity baseQuantity)
    {
        generatedSetterHelperImpl(baseQuantity, BASEQUANTITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BaseQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity addNewBaseQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(BASEQUANTITY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "BaseQuantity" element
     */
    public void unsetBaseQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BASEQUANTITY$0, 0);
        }
    }
    
    /**
     * Gets the "CorrespondingQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity getCorrespondingQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(CORRESPONDINGQUANTITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CorrespondingQuantity" element
     */
    public boolean isSetCorrespondingQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORRESPONDINGQUANTITY$2) != 0;
        }
    }
    
    /**
     * Sets the "CorrespondingQuantity" element
     */
    public void setCorrespondingQuantity(com.sap.xi.ap.common.gdt.Quantity correspondingQuantity)
    {
        generatedSetterHelperImpl(correspondingQuantity, CORRESPONDINGQUANTITY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CorrespondingQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity addNewCorrespondingQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(CORRESPONDINGQUANTITY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "CorrespondingQuantity" element
     */
    public void unsetCorrespondingQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORRESPONDINGQUANTITY$2, 0);
        }
    }
}

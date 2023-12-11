/*
 * XML Type:  MaterialByElementsResponseMaterialQuantityConversion
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQuantityConversion
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsResponseMaterialQuantityConversion(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsResponseMaterialQuantityConversionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQuantityConversion
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsResponseMaterialQuantityConversionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUANTITY$0 = 
        new javax.xml.namespace.QName("", "Quantity");
    private static final javax.xml.namespace.QName CORRESPONDINGQUANTITY$2 = 
        new javax.xml.namespace.QName("", "CorrespondingQuantity");
    
    
    /**
     * Gets the "Quantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity getQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(QUANTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Quantity" element
     */
    public boolean isSetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITY$0) != 0;
        }
    }
    
    /**
     * Sets the "Quantity" element
     */
    public void setQuantity(com.sap.xi.ap.common.gdt.Quantity quantity)
    {
        generatedSetterHelperImpl(quantity, QUANTITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Quantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity addNewQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(QUANTITY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Quantity" element
     */
    public void unsetQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITY$0, 0);
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

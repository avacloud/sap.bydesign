/*
 * XML Type:  MaterialByElementsResponseMaterialQunantityCharacteristics
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQunantityCharacteristics
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsResponseMaterialQunantityCharacteristics(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsResponseMaterialQunantityCharacteristicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsResponseMaterialQunantityCharacteristics
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsResponseMaterialQunantityCharacteristicsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUANTITYMEASUREUNITCODE$0 = 
        new javax.xml.namespace.QName("", "QuantityMeasureUnitCode");
    private static final javax.xml.namespace.QName CHARACTERISTICQUANTITY$2 = 
        new javax.xml.namespace.QName("", "CharacteristicQuantity");
    private static final javax.xml.namespace.QName CHARACTERISTICQUANTITYTYPECODE$4 = 
        new javax.xml.namespace.QName("", "CharacteristicQuantityTypeCode");
    
    
    /**
     * Gets the "QuantityMeasureUnitCode" element
     */
    public java.lang.String getQuantityMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITYMEASUREUNITCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "QuantityMeasureUnitCode" element
     */
    public com.sap.xi.ap.common.gdt.MeasureUnitCode xgetQuantityMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MeasureUnitCode target = null;
            target = (com.sap.xi.ap.common.gdt.MeasureUnitCode)get_store().find_element_user(QUANTITYMEASUREUNITCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "QuantityMeasureUnitCode" element
     */
    public boolean isSetQuantityMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITYMEASUREUNITCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "QuantityMeasureUnitCode" element
     */
    public void setQuantityMeasureUnitCode(java.lang.String quantityMeasureUnitCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITYMEASUREUNITCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANTITYMEASUREUNITCODE$0);
            }
            target.setStringValue(quantityMeasureUnitCode);
        }
    }
    
    /**
     * Sets (as xml) the "QuantityMeasureUnitCode" element
     */
    public void xsetQuantityMeasureUnitCode(com.sap.xi.ap.common.gdt.MeasureUnitCode quantityMeasureUnitCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MeasureUnitCode target = null;
            target = (com.sap.xi.ap.common.gdt.MeasureUnitCode)get_store().find_element_user(QUANTITYMEASUREUNITCODE$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.MeasureUnitCode)get_store().add_element_user(QUANTITYMEASUREUNITCODE$0);
            }
            target.set(quantityMeasureUnitCode);
        }
    }
    
    /**
     * Unsets the "QuantityMeasureUnitCode" element
     */
    public void unsetQuantityMeasureUnitCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITYMEASUREUNITCODE$0, 0);
        }
    }
    
    /**
     * Gets the "CharacteristicQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity getCharacteristicQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(CHARACTERISTICQUANTITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CharacteristicQuantity" element
     */
    public boolean isSetCharacteristicQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARACTERISTICQUANTITY$2) != 0;
        }
    }
    
    /**
     * Sets the "CharacteristicQuantity" element
     */
    public void setCharacteristicQuantity(com.sap.xi.ap.common.gdt.Quantity characteristicQuantity)
    {
        generatedSetterHelperImpl(characteristicQuantity, CHARACTERISTICQUANTITY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CharacteristicQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity addNewCharacteristicQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(CHARACTERISTICQUANTITY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "CharacteristicQuantity" element
     */
    public void unsetCharacteristicQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARACTERISTICQUANTITY$2, 0);
        }
    }
    
    /**
     * Gets the "CharacteristicQuantityTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.QuantityTypeCode getCharacteristicQuantityTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.QuantityTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.QuantityTypeCode)get_store().find_element_user(CHARACTERISTICQUANTITYTYPECODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CharacteristicQuantityTypeCode" element
     */
    public boolean isSetCharacteristicQuantityTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHARACTERISTICQUANTITYTYPECODE$4) != 0;
        }
    }
    
    /**
     * Sets the "CharacteristicQuantityTypeCode" element
     */
    public void setCharacteristicQuantityTypeCode(com.sap.xi.ap.common.gdt.QuantityTypeCode characteristicQuantityTypeCode)
    {
        generatedSetterHelperImpl(characteristicQuantityTypeCode, CHARACTERISTICQUANTITYTYPECODE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CharacteristicQuantityTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.QuantityTypeCode addNewCharacteristicQuantityTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.QuantityTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.QuantityTypeCode)get_store().add_element_user(CHARACTERISTICQUANTITYTYPECODE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "CharacteristicQuantityTypeCode" element
     */
    public void unsetCharacteristicQuantityTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHARACTERISTICQUANTITYTYPECODE$4, 0);
        }
    }
}

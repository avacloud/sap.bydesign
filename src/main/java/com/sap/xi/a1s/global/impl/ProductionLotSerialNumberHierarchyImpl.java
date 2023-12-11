/*
 * XML Type:  ProductionLotSerialNumberHierarchy
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotSerialNumberHierarchy(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotSerialNumberHierarchyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotSerialNumberHierarchyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INPUTPRODUCTID$0 = 
        new javax.xml.namespace.QName("", "InputProductID");
    private static final javax.xml.namespace.QName INPUTPRODUCTUUID$2 = 
        new javax.xml.namespace.QName("", "InputProductUUID");
    private static final javax.xml.namespace.QName INPUTPRODUCTSERIALID$4 = 
        new javax.xml.namespace.QName("", "InputProductSerialID");
    private static final javax.xml.namespace.QName INPUTPRODUCTSERIALUUID$6 = 
        new javax.xml.namespace.QName("", "InputProductSerialUUID");
    
    
    /**
     * Gets the "InputProductID" element
     */
    public com.sap.xi.ap.common.gdt.ProductID getInputProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductID)get_store().find_element_user(INPUTPRODUCTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "InputProductID" element
     */
    public boolean isSetInputProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INPUTPRODUCTID$0) != 0;
        }
    }
    
    /**
     * Sets the "InputProductID" element
     */
    public void setInputProductID(com.sap.xi.ap.common.gdt.ProductID inputProductID)
    {
        generatedSetterHelperImpl(inputProductID, INPUTPRODUCTID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "InputProductID" element
     */
    public com.sap.xi.ap.common.gdt.ProductID addNewInputProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductID)get_store().add_element_user(INPUTPRODUCTID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "InputProductID" element
     */
    public void unsetInputProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INPUTPRODUCTID$0, 0);
        }
    }
    
    /**
     * Gets the "InputProductUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getInputProductUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(INPUTPRODUCTUUID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "InputProductUUID" element
     */
    public boolean isSetInputProductUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INPUTPRODUCTUUID$2) != 0;
        }
    }
    
    /**
     * Sets the "InputProductUUID" element
     */
    public void setInputProductUUID(com.sap.xi.ap.common.gdt.UUID inputProductUUID)
    {
        generatedSetterHelperImpl(inputProductUUID, INPUTPRODUCTUUID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "InputProductUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewInputProductUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(INPUTPRODUCTUUID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "InputProductUUID" element
     */
    public void unsetInputProductUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INPUTPRODUCTUUID$2, 0);
        }
    }
    
    /**
     * Gets the "InputProductSerialID" element
     */
    public java.lang.String getInputProductSerialID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INPUTPRODUCTSERIALID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InputProductSerialID" element
     */
    public com.sap.xi.ap.common.gdt.SerialID xgetInputProductSerialID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SerialID target = null;
            target = (com.sap.xi.ap.common.gdt.SerialID)get_store().find_element_user(INPUTPRODUCTSERIALID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "InputProductSerialID" element
     */
    public boolean isSetInputProductSerialID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INPUTPRODUCTSERIALID$4) != 0;
        }
    }
    
    /**
     * Sets the "InputProductSerialID" element
     */
    public void setInputProductSerialID(java.lang.String inputProductSerialID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INPUTPRODUCTSERIALID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INPUTPRODUCTSERIALID$4);
            }
            target.setStringValue(inputProductSerialID);
        }
    }
    
    /**
     * Sets (as xml) the "InputProductSerialID" element
     */
    public void xsetInputProductSerialID(com.sap.xi.ap.common.gdt.SerialID inputProductSerialID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SerialID target = null;
            target = (com.sap.xi.ap.common.gdt.SerialID)get_store().find_element_user(INPUTPRODUCTSERIALID$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.SerialID)get_store().add_element_user(INPUTPRODUCTSERIALID$4);
            }
            target.set(inputProductSerialID);
        }
    }
    
    /**
     * Unsets the "InputProductSerialID" element
     */
    public void unsetInputProductSerialID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INPUTPRODUCTSERIALID$4, 0);
        }
    }
    
    /**
     * Gets the "InputProductSerialUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getInputProductSerialUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(INPUTPRODUCTSERIALUUID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "InputProductSerialUUID" element
     */
    public boolean isSetInputProductSerialUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INPUTPRODUCTSERIALUUID$6) != 0;
        }
    }
    
    /**
     * Sets the "InputProductSerialUUID" element
     */
    public void setInputProductSerialUUID(com.sap.xi.ap.common.gdt.UUID inputProductSerialUUID)
    {
        generatedSetterHelperImpl(inputProductSerialUUID, INPUTPRODUCTSERIALUUID$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "InputProductSerialUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewInputProductSerialUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(INPUTPRODUCTSERIALUUID$6);
            return target;
        }
    }
    
    /**
     * Unsets the "InputProductSerialUUID" element
     */
    public void unsetInputProductSerialUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INPUTPRODUCTSERIALUUID$6, 0);
        }
    }
}

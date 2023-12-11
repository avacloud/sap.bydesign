/*
 * XML Type:  ProductionLotSerialNumberHierarchyManageBundle_Request
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchyManageBundleRequest
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotSerialNumberHierarchyManageBundle_Request(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotSerialNumberHierarchyManageBundleRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchyManageBundleRequest
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotSerialNumberHierarchyManageBundleRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INPUTPRODUCTID$0 = 
        new javax.xml.namespace.QName("", "InputProductID");
    private static final javax.xml.namespace.QName INPUTPRODUCTSERIALID$2 = 
        new javax.xml.namespace.QName("", "InputProductSerialID");
    
    
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
     * Gets the "InputProductSerialID" element
     */
    public java.lang.String getInputProductSerialID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INPUTPRODUCTSERIALID$2, 0);
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
            target = (com.sap.xi.ap.common.gdt.SerialID)get_store().find_element_user(INPUTPRODUCTSERIALID$2, 0);
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
            return get_store().count_elements(INPUTPRODUCTSERIALID$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INPUTPRODUCTSERIALID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INPUTPRODUCTSERIALID$2);
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
            target = (com.sap.xi.ap.common.gdt.SerialID)get_store().find_element_user(INPUTPRODUCTSERIALID$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.SerialID)get_store().add_element_user(INPUTPRODUCTSERIALID$2);
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
            get_store().remove_element(INPUTPRODUCTSERIALID$2, 0);
        }
    }
}

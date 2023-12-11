/*
 * XML Type:  IdentifiedStockQuantityConversionMaintainRequestBundle
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML IdentifiedStockQuantityConversionMaintainRequestBundle(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class IdentifiedStockQuantityConversionMaintainRequestBundleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle
{
    private static final long serialVersionUID = 1L;
    
    public IdentifiedStockQuantityConversionMaintainRequestBundleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTNODESENDERTECHNICALID$0 = 
        new javax.xml.namespace.QName("", "ObjectNodeSenderTechnicalID");
    private static final javax.xml.namespace.QName BASEQUANTITY$2 = 
        new javax.xml.namespace.QName("", "BaseQuantity");
    private static final javax.xml.namespace.QName CORRESPONDINGQUANTITY$4 = 
        new javax.xml.namespace.QName("", "CorrespondingQuantity");
    private static final javax.xml.namespace.QName ACTIONCODE$6 = 
        new javax.xml.namespace.QName("", "ActionCode");
    
    
    /**
     * Gets the "ObjectNodeSenderTechnicalID" element
     */
    public java.lang.String getObjectNodeSenderTechnicalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTNODESENDERTECHNICALID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ObjectNodeSenderTechnicalID" element
     */
    public com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID xgetObjectNodeSenderTechnicalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID)get_store().find_element_user(OBJECTNODESENDERTECHNICALID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ObjectNodeSenderTechnicalID" element
     */
    public boolean isSetObjectNodeSenderTechnicalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTNODESENDERTECHNICALID$0) != 0;
        }
    }
    
    /**
     * Sets the "ObjectNodeSenderTechnicalID" element
     */
    public void setObjectNodeSenderTechnicalID(java.lang.String objectNodeSenderTechnicalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTNODESENDERTECHNICALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTNODESENDERTECHNICALID$0);
            }
            target.setStringValue(objectNodeSenderTechnicalID);
        }
    }
    
    /**
     * Sets (as xml) the "ObjectNodeSenderTechnicalID" element
     */
    public void xsetObjectNodeSenderTechnicalID(com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID objectNodeSenderTechnicalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID)get_store().find_element_user(OBJECTNODESENDERTECHNICALID$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID)get_store().add_element_user(OBJECTNODESENDERTECHNICALID$0);
            }
            target.set(objectNodeSenderTechnicalID);
        }
    }
    
    /**
     * Unsets the "ObjectNodeSenderTechnicalID" element
     */
    public void unsetObjectNodeSenderTechnicalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTNODESENDERTECHNICALID$0, 0);
        }
    }
    
    /**
     * Gets the "BaseQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity getBaseQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(BASEQUANTITY$2, 0);
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
            return get_store().count_elements(BASEQUANTITY$2) != 0;
        }
    }
    
    /**
     * Sets the "BaseQuantity" element
     */
    public void setBaseQuantity(com.sap.xi.ap.common.gdt.Quantity baseQuantity)
    {
        generatedSetterHelperImpl(baseQuantity, BASEQUANTITY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(BASEQUANTITY$2);
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
            get_store().remove_element(BASEQUANTITY$2, 0);
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
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(CORRESPONDINGQUANTITY$4, 0);
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
            return get_store().count_elements(CORRESPONDINGQUANTITY$4) != 0;
        }
    }
    
    /**
     * Sets the "CorrespondingQuantity" element
     */
    public void setCorrespondingQuantity(com.sap.xi.ap.common.gdt.Quantity correspondingQuantity)
    {
        generatedSetterHelperImpl(correspondingQuantity, CORRESPONDINGQUANTITY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(CORRESPONDINGQUANTITY$4);
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
            get_store().remove_element(CORRESPONDINGQUANTITY$4, 0);
        }
    }
    
    /**
     * Gets the "ActionCode" attribute
     */
    public com.sap.xi.ap.common.gdt.ActionCode.Enum getActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$6);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.ActionCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ActionCode" attribute
     */
    public com.sap.xi.ap.common.gdt.ActionCode xgetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ActionCode target = null;
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$6);
            return target;
        }
    }
    
    /**
     * True if has "ActionCode" attribute
     */
    public boolean isSetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTIONCODE$6) != null;
        }
    }
    
    /**
     * Sets the "ActionCode" attribute
     */
    public void setActionCode(com.sap.xi.ap.common.gdt.ActionCode.Enum actionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIONCODE$6);
            }
            target.setEnumValue(actionCode);
        }
    }
    
    /**
     * Sets (as xml) the "ActionCode" attribute
     */
    public void xsetActionCode(com.sap.xi.ap.common.gdt.ActionCode actionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ActionCode target = null;
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$6);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().add_attribute_user(ACTIONCODE$6);
            }
            target.set(actionCode);
        }
    }
    
    /**
     * Unsets the "ActionCode" attribute
     */
    public void unsetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTIONCODE$6);
        }
    }
}

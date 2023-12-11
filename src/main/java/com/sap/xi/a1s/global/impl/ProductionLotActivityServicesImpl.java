/*
 * XML Type:  ProductionLotActivityServices
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotActivityServices
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotActivityServices(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotActivityServicesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotActivityServices
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotActivityServicesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEUUID$0 = 
        new javax.xml.namespace.QName("", "ServiceUUID");
    private static final javax.xml.namespace.QName SERVICEID$2 = 
        new javax.xml.namespace.QName("", "Service_ID");
    private static final javax.xml.namespace.QName RESOURCEID$4 = 
        new javax.xml.namespace.QName("", "Resource_ID");
    private static final javax.xml.namespace.QName CONFIRMEDQUANTITY$6 = 
        new javax.xml.namespace.QName("", "Confirmed_Quantity");
    private static final javax.xml.namespace.QName SERVICECONSUMPTIONCALCULATIONMETHODCODE$8 = 
        new javax.xml.namespace.QName("", "ServiceConsumptionCalculationMethodCode");
    private static final javax.xml.namespace.QName ACTIONCODE$10 = 
        new javax.xml.namespace.QName("", "ActionCode");
    
    
    /**
     * Gets the "ServiceUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getServiceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(SERVICEUUID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ServiceUUID" element
     */
    public boolean isSetServiceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEUUID$0) != 0;
        }
    }
    
    /**
     * Sets the "ServiceUUID" element
     */
    public void setServiceUUID(com.sap.xi.ap.common.gdt.UUID serviceUUID)
    {
        generatedSetterHelperImpl(serviceUUID, SERVICEUUID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ServiceUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewServiceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(SERVICEUUID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ServiceUUID" element
     */
    public void unsetServiceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEUUID$0, 0);
        }
    }
    
    /**
     * Gets the "Service_ID" element
     */
    public com.sap.xi.ap.common.gdt.ProductID getServiceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductID)get_store().find_element_user(SERVICEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Service_ID" element
     */
    public boolean isSetServiceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEID$2) != 0;
        }
    }
    
    /**
     * Sets the "Service_ID" element
     */
    public void setServiceID(com.sap.xi.ap.common.gdt.ProductID serviceID)
    {
        generatedSetterHelperImpl(serviceID, SERVICEID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Service_ID" element
     */
    public com.sap.xi.ap.common.gdt.ProductID addNewServiceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductID)get_store().add_element_user(SERVICEID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Service_ID" element
     */
    public void unsetServiceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEID$2, 0);
        }
    }
    
    /**
     * Gets the "Resource_ID" element
     */
    public com.sap.xi.ap.common.gdt.ResourceID getResourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ResourceID target = null;
            target = (com.sap.xi.ap.common.gdt.ResourceID)get_store().find_element_user(RESOURCEID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Resource_ID" element
     */
    public boolean isSetResourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEID$4) != 0;
        }
    }
    
    /**
     * Sets the "Resource_ID" element
     */
    public void setResourceID(com.sap.xi.ap.common.gdt.ResourceID resourceID)
    {
        generatedSetterHelperImpl(resourceID, RESOURCEID$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Resource_ID" element
     */
    public com.sap.xi.ap.common.gdt.ResourceID addNewResourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ResourceID target = null;
            target = (com.sap.xi.ap.common.gdt.ResourceID)get_store().add_element_user(RESOURCEID$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Resource_ID" element
     */
    public void unsetResourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEID$4, 0);
        }
    }
    
    /**
     * Gets the "Confirmed_Quantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity getConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(CONFIRMEDQUANTITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Confirmed_Quantity" element
     */
    public boolean isSetConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIRMEDQUANTITY$6) != 0;
        }
    }
    
    /**
     * Sets the "Confirmed_Quantity" element
     */
    public void setConfirmedQuantity(com.sap.xi.ap.common.gdt.Quantity confirmedQuantity)
    {
        generatedSetterHelperImpl(confirmedQuantity, CONFIRMEDQUANTITY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Confirmed_Quantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity addNewConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(CONFIRMEDQUANTITY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Confirmed_Quantity" element
     */
    public void unsetConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIRMEDQUANTITY$6, 0);
        }
    }
    
    /**
     * Gets the "ServiceConsumptionCalculationMethodCode" element
     */
    public com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode getServiceConsumptionCalculationMethodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode target = null;
            target = (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode)get_store().find_element_user(SERVICECONSUMPTIONCALCULATIONMETHODCODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ServiceConsumptionCalculationMethodCode" element
     */
    public boolean isSetServiceConsumptionCalculationMethodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICECONSUMPTIONCALCULATIONMETHODCODE$8) != 0;
        }
    }
    
    /**
     * Sets the "ServiceConsumptionCalculationMethodCode" element
     */
    public void setServiceConsumptionCalculationMethodCode(com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode serviceConsumptionCalculationMethodCode)
    {
        generatedSetterHelperImpl(serviceConsumptionCalculationMethodCode, SERVICECONSUMPTIONCALCULATIONMETHODCODE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ServiceConsumptionCalculationMethodCode" element
     */
    public com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode addNewServiceConsumptionCalculationMethodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode target = null;
            target = (com.sap.xi.ap.common.gdt.ServiceProductConsumptionCalculationMethodCode)get_store().add_element_user(SERVICECONSUMPTIONCALCULATIONMETHODCODE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ServiceConsumptionCalculationMethodCode" element
     */
    public void unsetServiceConsumptionCalculationMethodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICECONSUMPTIONCALCULATIONMETHODCODE$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$10);
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
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$10);
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
            return get_store().find_attribute_user(ACTIONCODE$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIONCODE$10);
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
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$10);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().add_attribute_user(ACTIONCODE$10);
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
            get_store().remove_attribute(ACTIONCODE$10);
        }
    }
}

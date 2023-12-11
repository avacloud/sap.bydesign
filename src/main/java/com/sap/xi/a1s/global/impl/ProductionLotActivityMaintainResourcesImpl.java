/*
 * XML Type:  ProductionLotActivityMaintainResources
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotActivityMaintainResources
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotActivityMaintainResources(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotActivityMaintainResourcesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotActivityMaintainResources
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotActivityMaintainResourcesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEID$0 = 
        new javax.xml.namespace.QName("", "ResourceID");
    private static final javax.xml.namespace.QName RESOURCEUUID$2 = 
        new javax.xml.namespace.QName("", "ResourceUUID");
    private static final javax.xml.namespace.QName CONFIRMEDDURATION$4 = 
        new javax.xml.namespace.QName("", "ConfirmedDuration");
    private static final javax.xml.namespace.QName ACTIONCODE$6 = 
        new javax.xml.namespace.QName("", "ActionCode");
    
    
    /**
     * Gets the "ResourceID" element
     */
    public com.sap.xi.ap.common.gdt.ResourceID getResourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ResourceID target = null;
            target = (com.sap.xi.ap.common.gdt.ResourceID)get_store().find_element_user(RESOURCEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ResourceID" element
     */
    public boolean isSetResourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEID$0) != 0;
        }
    }
    
    /**
     * Sets the "ResourceID" element
     */
    public void setResourceID(com.sap.xi.ap.common.gdt.ResourceID resourceID)
    {
        generatedSetterHelperImpl(resourceID, RESOURCEID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ResourceID" element
     */
    public com.sap.xi.ap.common.gdt.ResourceID addNewResourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ResourceID target = null;
            target = (com.sap.xi.ap.common.gdt.ResourceID)get_store().add_element_user(RESOURCEID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ResourceID" element
     */
    public void unsetResourceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEID$0, 0);
        }
    }
    
    /**
     * Gets the "ResourceUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getResourceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(RESOURCEUUID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ResourceUUID" element
     */
    public boolean isSetResourceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEUUID$2) != 0;
        }
    }
    
    /**
     * Sets the "ResourceUUID" element
     */
    public void setResourceUUID(com.sap.xi.ap.common.gdt.UUID resourceUUID)
    {
        generatedSetterHelperImpl(resourceUUID, RESOURCEUUID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ResourceUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewResourceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(RESOURCEUUID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ResourceUUID" element
     */
    public void unsetResourceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEUUID$2, 0);
        }
    }
    
    /**
     * Gets the "ConfirmedDuration" element
     */
    public org.apache.xmlbeans.GDuration getConfirmedDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMEDDURATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConfirmedDuration" element
     */
    public com.sap.xi.ap.common.gdt.TIMEDuration xgetConfirmedDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TIMEDuration target = null;
            target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().find_element_user(CONFIRMEDDURATION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ConfirmedDuration" element
     */
    public boolean isSetConfirmedDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIRMEDDURATION$4) != 0;
        }
    }
    
    /**
     * Sets the "ConfirmedDuration" element
     */
    public void setConfirmedDuration(org.apache.xmlbeans.GDuration confirmedDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMEDDURATION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFIRMEDDURATION$4);
            }
            target.setGDurationValue(confirmedDuration);
        }
    }
    
    /**
     * Sets (as xml) the "ConfirmedDuration" element
     */
    public void xsetConfirmedDuration(com.sap.xi.ap.common.gdt.TIMEDuration confirmedDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TIMEDuration target = null;
            target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().find_element_user(CONFIRMEDDURATION$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TIMEDuration)get_store().add_element_user(CONFIRMEDDURATION$4);
            }
            target.set(confirmedDuration);
        }
    }
    
    /**
     * Unsets the "ConfirmedDuration" element
     */
    public void unsetConfirmedDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIRMEDDURATION$4, 0);
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

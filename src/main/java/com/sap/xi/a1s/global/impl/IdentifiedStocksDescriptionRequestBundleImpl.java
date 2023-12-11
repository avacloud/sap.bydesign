/*
 * XML Type:  IdentifiedStocksDescriptionRequestBundle
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML IdentifiedStocksDescriptionRequestBundle(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class IdentifiedStocksDescriptionRequestBundleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle
{
    private static final long serialVersionUID = 1L;
    
    public IdentifiedStocksDescriptionRequestBundleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTNODESENDERTECHNICALID$0 = 
        new javax.xml.namespace.QName("", "ObjectNodeSenderTechnicalID");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("", "Description");
    private static final javax.xml.namespace.QName ACTIONCODE$4 = 
        new javax.xml.namespace.QName("", "actionCode");
    
    
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
     * Gets the "Description" element
     */
    public com.sap.xi.ap.common.gdt.SHORTDescription getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SHORTDescription target = null;
            target = (com.sap.xi.ap.common.gdt.SHORTDescription)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(com.sap.xi.ap.common.gdt.SHORTDescription description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Description" element
     */
    public com.sap.xi.ap.common.gdt.SHORTDescription addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SHORTDescription target = null;
            target = (com.sap.xi.ap.common.gdt.SHORTDescription)get_store().add_element_user(DESCRIPTION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets the "actionCode" attribute
     */
    public com.sap.xi.ap.common.gdt.ActionCode.Enum getActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$4);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.ActionCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "actionCode" attribute
     */
    public com.sap.xi.ap.common.gdt.ActionCode xgetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ActionCode target = null;
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$4);
            return target;
        }
    }
    
    /**
     * True if has "actionCode" attribute
     */
    public boolean isSetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTIONCODE$4) != null;
        }
    }
    
    /**
     * Sets the "actionCode" attribute
     */
    public void setActionCode(com.sap.xi.ap.common.gdt.ActionCode.Enum actionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIONCODE$4);
            }
            target.setEnumValue(actionCode);
        }
    }
    
    /**
     * Sets (as xml) the "actionCode" attribute
     */
    public void xsetActionCode(com.sap.xi.ap.common.gdt.ActionCode actionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ActionCode target = null;
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$4);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().add_attribute_user(ACTIONCODE$4);
            }
            target.set(actionCode);
        }
    }
    
    /**
     * Unsets the "actionCode" attribute
     */
    public void unsetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTIONCODE$4);
        }
    }
}

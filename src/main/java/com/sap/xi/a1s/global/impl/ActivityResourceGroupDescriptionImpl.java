/*
 * XML Type:  ActivityResourceGroupDescription
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ActivityResourceGroupDescription
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ActivityResourceGroupDescription(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ActivityResourceGroupDescriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ActivityResourceGroupDescription
{
    private static final long serialVersionUID = 1L;
    
    public ActivityResourceGroupDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEGROUPDESCRIPTION$0 = 
        new javax.xml.namespace.QName("", "ResourceGroupDescription");
    
    
    /**
     * Gets the "ResourceGroupDescription" element
     */
    public com.sap.xi.ap.common.gdt.SHORTDescription getResourceGroupDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SHORTDescription target = null;
            target = (com.sap.xi.ap.common.gdt.SHORTDescription)get_store().find_element_user(RESOURCEGROUPDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ResourceGroupDescription" element
     */
    public boolean isSetResourceGroupDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEGROUPDESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "ResourceGroupDescription" element
     */
    public void setResourceGroupDescription(com.sap.xi.ap.common.gdt.SHORTDescription resourceGroupDescription)
    {
        generatedSetterHelperImpl(resourceGroupDescription, RESOURCEGROUPDESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ResourceGroupDescription" element
     */
    public com.sap.xi.ap.common.gdt.SHORTDescription addNewResourceGroupDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SHORTDescription target = null;
            target = (com.sap.xi.ap.common.gdt.SHORTDescription)get_store().add_element_user(RESOURCEGROUPDESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ResourceGroupDescription" element
     */
    public void unsetResourceGroupDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEGROUPDESCRIPTION$0, 0);
        }
    }
}

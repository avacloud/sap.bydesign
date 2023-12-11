/*
 * XML Type:  ServiceResourceDescription
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ServiceResourceDescription
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ServiceResourceDescription(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ServiceResourceDescriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ServiceResourceDescription
{
    private static final long serialVersionUID = 1L;
    
    public ServiceResourceDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICERESOURCEDESCRIPTION$0 = 
        new javax.xml.namespace.QName("", "ServiceResourceDescription");
    
    
    /**
     * Gets the "ServiceResourceDescription" element
     */
    public com.sap.xi.ap.common.gdt.SHORTDescription getServiceResourceDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SHORTDescription target = null;
            target = (com.sap.xi.ap.common.gdt.SHORTDescription)get_store().find_element_user(SERVICERESOURCEDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ServiceResourceDescription" element
     */
    public boolean isSetServiceResourceDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICERESOURCEDESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "ServiceResourceDescription" element
     */
    public void setServiceResourceDescription(com.sap.xi.ap.common.gdt.SHORTDescription serviceResourceDescription)
    {
        generatedSetterHelperImpl(serviceResourceDescription, SERVICERESOURCEDESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ServiceResourceDescription" element
     */
    public com.sap.xi.ap.common.gdt.SHORTDescription addNewServiceResourceDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SHORTDescription target = null;
            target = (com.sap.xi.ap.common.gdt.SHORTDescription)get_store().add_element_user(SERVICERESOURCEDESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ServiceResourceDescription" element
     */
    public void unsetServiceResourceDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICERESOURCEDESCRIPTION$0, 0);
        }
    }
}

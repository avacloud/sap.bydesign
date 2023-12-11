/*
 * XML Type:  SiteDescription
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.SiteDescription
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML SiteDescription(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class SiteDescriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.SiteDescription
{
    private static final long serialVersionUID = 1L;
    
    public SiteDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SITEDESCRIPTION$0 = 
        new javax.xml.namespace.QName("", "SiteDescription");
    
    
    /**
     * Gets the "SiteDescription" element
     */
    public com.sap.xi.ap.common.gdt.SHORTDescription getSiteDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SHORTDescription target = null;
            target = (com.sap.xi.ap.common.gdt.SHORTDescription)get_store().find_element_user(SITEDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SiteDescription" element
     */
    public boolean isSetSiteDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITEDESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "SiteDescription" element
     */
    public void setSiteDescription(com.sap.xi.ap.common.gdt.SHORTDescription siteDescription)
    {
        generatedSetterHelperImpl(siteDescription, SITEDESCRIPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SiteDescription" element
     */
    public com.sap.xi.ap.common.gdt.SHORTDescription addNewSiteDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SHORTDescription target = null;
            target = (com.sap.xi.ap.common.gdt.SHORTDescription)get_store().add_element_user(SITEDESCRIPTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "SiteDescription" element
     */
    public void unsetSiteDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITEDESCRIPTION$0, 0);
        }
    }
}

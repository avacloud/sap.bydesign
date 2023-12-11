/*
 * XML Type:  StandardFaultMessageExtension
 * Namespace: http://sap.com/xi/AP/Common/Global
 * Java type: com.sap.xi.ap.common.global.StandardFaultMessageExtension
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.global.impl;
/**
 * An XML StandardFaultMessageExtension(@http://sap.com/xi/AP/Common/Global).
 *
 * This is a complex type.
 */
public class StandardFaultMessageExtensionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.ap.common.global.StandardFaultMessageExtension
{
    private static final long serialVersionUID = 1L;
    
    public StandardFaultMessageExtensionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOG$0 = 
        new javax.xml.namespace.QName("", "Log");
    
    
    /**
     * Gets the "Log" element
     */
    public com.sap.xi.ap.common.gdt.Log getLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Log target = null;
            target = (com.sap.xi.ap.common.gdt.Log)get_store().find_element_user(LOG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Log" element
     */
    public boolean isSetLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOG$0) != 0;
        }
    }
    
    /**
     * Sets the "Log" element
     */
    public void setLog(com.sap.xi.ap.common.gdt.Log log)
    {
        generatedSetterHelperImpl(log, LOG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Log" element
     */
    public com.sap.xi.ap.common.gdt.Log addNewLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Log target = null;
            target = (com.sap.xi.ap.common.gdt.Log)get_store().add_element_user(LOG$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Log" element
     */
    public void unsetLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOG$0, 0);
        }
    }
}

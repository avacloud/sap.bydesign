/*
 * XML Type:  MEDIUM_Name
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.MEDIUMName
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt.impl;
/**
 * An XML MEDIUM_Name(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is an atomic type that is a restriction of com.sap.xi.ap.common.gdt.MEDIUMName.
 */
public class MEDIUMNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.ap.common.gdt.MEDIUMName
{
    private static final long serialVersionUID = 1L;
    
    public MEDIUMNameImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected MEDIUMNameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName LANGUAGECODE$0 = 
        new javax.xml.namespace.QName("", "languageCode");
    
    
    /**
     * Gets the "languageCode" attribute
     */
    public java.lang.String getLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGECODE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "languageCode" attribute
     */
    public com.sap.xi.basis.global.LanguageCode xgetLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.LanguageCode target = null;
            target = (com.sap.xi.basis.global.LanguageCode)get_store().find_attribute_user(LANGUAGECODE$0);
            return target;
        }
    }
    
    /**
     * True if has "languageCode" attribute
     */
    public boolean isSetLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANGUAGECODE$0) != null;
        }
    }
    
    /**
     * Sets the "languageCode" attribute
     */
    public void setLanguageCode(java.lang.String languageCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGECODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGECODE$0);
            }
            target.setStringValue(languageCode);
        }
    }
    
    /**
     * Sets (as xml) the "languageCode" attribute
     */
    public void xsetLanguageCode(com.sap.xi.basis.global.LanguageCode languageCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.LanguageCode target = null;
            target = (com.sap.xi.basis.global.LanguageCode)get_store().find_attribute_user(LANGUAGECODE$0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.LanguageCode)get_store().add_attribute_user(LANGUAGECODE$0);
            }
            target.set(languageCode);
        }
    }
    
    /**
     * Unsets the "languageCode" attribute
     */
    public void unsetLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANGUAGECODE$0);
        }
    }
}

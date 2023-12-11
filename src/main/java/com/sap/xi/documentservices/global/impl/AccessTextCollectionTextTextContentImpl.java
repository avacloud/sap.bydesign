/*
 * XML Type:  AccessTextCollectionTextTextContent
 * Namespace: http://sap.com/xi/DocumentServices/Global
 * Java type: com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.documentservices.global.impl;
/**
 * An XML AccessTextCollectionTextTextContent(@http://sap.com/xi/DocumentServices/Global).
 *
 * This is a complex type.
 */
public class AccessTextCollectionTextTextContentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent
{
    private static final long serialVersionUID = 1L;
    
    public AccessTextCollectionTextTextContentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TECHNICALID$0 = 
        new javax.xml.namespace.QName("", "TechnicalID");
    private static final javax.xml.namespace.QName TEXT$2 = 
        new javax.xml.namespace.QName("", "Text");
    
    
    /**
     * Gets the "TechnicalID" element
     */
    public java.lang.String getTechnicalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TECHNICALID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TechnicalID" element
     */
    public com.sap.xi.ap.common.gdt.ObjectNodeTechnicalID xgetTechnicalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectNodeTechnicalID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectNodeTechnicalID)get_store().find_element_user(TECHNICALID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "TechnicalID" element
     */
    public boolean isSetTechnicalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TECHNICALID$0) != 0;
        }
    }
    
    /**
     * Sets the "TechnicalID" element
     */
    public void setTechnicalID(java.lang.String technicalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TECHNICALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TECHNICALID$0);
            }
            target.setStringValue(technicalID);
        }
    }
    
    /**
     * Sets (as xml) the "TechnicalID" element
     */
    public void xsetTechnicalID(com.sap.xi.ap.common.gdt.ObjectNodeTechnicalID technicalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectNodeTechnicalID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectNodeTechnicalID)get_store().find_element_user(TECHNICALID$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ObjectNodeTechnicalID)get_store().add_element_user(TECHNICALID$0);
            }
            target.set(technicalID);
        }
    }
    
    /**
     * Unsets the "TechnicalID" element
     */
    public void unsetTechnicalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TECHNICALID$0, 0);
        }
    }
    
    /**
     * Gets the "Text" element
     */
    public com.sap.xi.ap.common.gdt.Text getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Text target = null;
            target = (com.sap.xi.ap.common.gdt.Text)get_store().find_element_user(TEXT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Text" element
     */
    public boolean isSetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXT$2) != 0;
        }
    }
    
    /**
     * Sets the "Text" element
     */
    public void setText(com.sap.xi.ap.common.gdt.Text text)
    {
        generatedSetterHelperImpl(text, TEXT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Text" element
     */
    public com.sap.xi.ap.common.gdt.Text addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Text target = null;
            target = (com.sap.xi.ap.common.gdt.Text)get_store().add_element_user(TEXT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Text" element
     */
    public void unsetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXT$2, 0);
        }
    }
}

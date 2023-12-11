/*
 * XML Type:  MaterialByElementsResponseMaterialLanguateIndependentText
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsResponseMaterialLanguateIndependentText(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsResponseMaterialLanguateIndependentTextImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsResponseMaterialLanguateIndependentText
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsResponseMaterialLanguateIndependentTextImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTENTTEXT$0 = 
        new javax.xml.namespace.QName("", "ContentText");
    
    
    /**
     * Gets the "ContentText" element
     */
    public java.lang.String getContentText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContentText" element
     */
    public com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTText xgetContentText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTText target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTText)get_store().find_element_user(CONTENTTEXT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContentText" element
     */
    public boolean isSetContentText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENTTEXT$0) != 0;
        }
    }
    
    /**
     * Sets the "ContentText" element
     */
    public void setContentText(java.lang.String contentText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTENTTEXT$0);
            }
            target.setStringValue(contentText);
        }
    }
    
    /**
     * Sets (as xml) the "ContentText" element
     */
    public void xsetContentText(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTText contentText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTText target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTText)get_store().find_element_user(CONTENTTEXT$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTText)get_store().add_element_user(CONTENTTEXT$0);
            }
            target.set(contentText);
        }
    }
    
    /**
     * Unsets the "ContentText" element
     */
    public void unsetContentText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENTTEXT$0, 0);
        }
    }
}

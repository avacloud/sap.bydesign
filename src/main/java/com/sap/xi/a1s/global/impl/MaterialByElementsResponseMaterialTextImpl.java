/*
 * XML Type:  MaterialByElementsResponseMaterialText
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsResponseMaterialText(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsResponseMaterialTextImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsResponseMaterialText
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsResponseMaterialTextImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTENTTEXT$0 = 
        new javax.xml.namespace.QName("", "ContentText");
    
    
    /**
     * Gets the "ContentText" element
     */
    public com.sap.xi.ap.common.gdt.Text getContentText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Text target = null;
            target = (com.sap.xi.ap.common.gdt.Text)get_store().find_element_user(CONTENTTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
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
    public void setContentText(com.sap.xi.ap.common.gdt.Text contentText)
    {
        generatedSetterHelperImpl(contentText, CONTENTTEXT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ContentText" element
     */
    public com.sap.xi.ap.common.gdt.Text addNewContentText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Text target = null;
            target = (com.sap.xi.ap.common.gdt.Text)get_store().add_element_user(CONTENTTEXT$0);
            return target;
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

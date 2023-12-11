/*
 * XML Type:  AccessTextCollection
 * Namespace: http://sap.com/xi/DocumentServices/Global
 * Java type: com.sap.xi.documentservices.global.AccessTextCollection
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.documentservices.global.impl;
/**
 * An XML AccessTextCollection(@http://sap.com/xi/DocumentServices/Global).
 *
 * This is a complex type.
 */
public class AccessTextCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.documentservices.global.AccessTextCollection
{
    private static final long serialVersionUID = 1L;
    
    public AccessTextCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UUID$0 = 
        new javax.xml.namespace.QName("", "UUID");
    private static final javax.xml.namespace.QName TEXT$2 = 
        new javax.xml.namespace.QName("", "Text");
    
    
    /**
     * Gets the "UUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(UUID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "UUID" element
     */
    public boolean isSetUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UUID$0) != 0;
        }
    }
    
    /**
     * Sets the "UUID" element
     */
    public void setUUID(com.sap.xi.ap.common.gdt.UUID uuid)
    {
        generatedSetterHelperImpl(uuid, UUID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(UUID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "UUID" element
     */
    public void unsetUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UUID$0, 0);
        }
    }
    
    /**
     * Gets array of all "Text" elements
     */
    public com.sap.xi.documentservices.global.AccessTextCollectionText[] getTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TEXT$2, targetList);
            com.sap.xi.documentservices.global.AccessTextCollectionText[] result = new com.sap.xi.documentservices.global.AccessTextCollectionText[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Text" element
     */
    public com.sap.xi.documentservices.global.AccessTextCollectionText getTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.AccessTextCollectionText target = null;
            target = (com.sap.xi.documentservices.global.AccessTextCollectionText)get_store().find_element_user(TEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Text" element
     */
    public int sizeOfTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXT$2);
        }
    }
    
    /**
     * Sets array of all "Text" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTextArray(com.sap.xi.documentservices.global.AccessTextCollectionText[] textArray)
    {
        check_orphaned();
        arraySetterHelper(textArray, TEXT$2);
    }
    
    /**
     * Sets ith "Text" element
     */
    public void setTextArray(int i, com.sap.xi.documentservices.global.AccessTextCollectionText text)
    {
        generatedSetterHelperImpl(text, TEXT$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Text" element
     */
    public com.sap.xi.documentservices.global.AccessTextCollectionText insertNewText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.AccessTextCollectionText target = null;
            target = (com.sap.xi.documentservices.global.AccessTextCollectionText)get_store().insert_element_user(TEXT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Text" element
     */
    public com.sap.xi.documentservices.global.AccessTextCollectionText addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.AccessTextCollectionText target = null;
            target = (com.sap.xi.documentservices.global.AccessTextCollectionText)get_store().add_element_user(TEXT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Text" element
     */
    public void removeText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXT$2, i);
        }
    }
}

/*
 * XML Type:  MaintenanceTextCollection
 * Namespace: http://sap.com/xi/DocumentServices/Global
 * Java type: com.sap.xi.documentservices.global.MaintenanceTextCollection
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.documentservices.global.impl;
/**
 * An XML MaintenanceTextCollection(@http://sap.com/xi/DocumentServices/Global).
 *
 * This is a complex type.
 */
public class MaintenanceTextCollectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.documentservices.global.MaintenanceTextCollection
{
    private static final long serialVersionUID = 1L;
    
    public MaintenanceTextCollectionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UUID$0 = 
        new javax.xml.namespace.QName("", "UUID");
    private static final javax.xml.namespace.QName TEXT$2 = 
        new javax.xml.namespace.QName("", "Text");
    private static final javax.xml.namespace.QName TEXTLISTCOMPLETETRANSMISSIONINDICATOR$4 = 
        new javax.xml.namespace.QName("", "TextListCompleteTransmissionIndicator");
    private static final javax.xml.namespace.QName ACTIONCODE$6 = 
        new javax.xml.namespace.QName("", "ActionCode");
    
    
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
    public com.sap.xi.documentservices.global.MaintenanceTextCollectionText[] getTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TEXT$2, targetList);
            com.sap.xi.documentservices.global.MaintenanceTextCollectionText[] result = new com.sap.xi.documentservices.global.MaintenanceTextCollectionText[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Text" element
     */
    public com.sap.xi.documentservices.global.MaintenanceTextCollectionText getTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.MaintenanceTextCollectionText target = null;
            target = (com.sap.xi.documentservices.global.MaintenanceTextCollectionText)get_store().find_element_user(TEXT$2, i);
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
    public void setTextArray(com.sap.xi.documentservices.global.MaintenanceTextCollectionText[] textArray)
    {
        check_orphaned();
        arraySetterHelper(textArray, TEXT$2);
    }
    
    /**
     * Sets ith "Text" element
     */
    public void setTextArray(int i, com.sap.xi.documentservices.global.MaintenanceTextCollectionText text)
    {
        generatedSetterHelperImpl(text, TEXT$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Text" element
     */
    public com.sap.xi.documentservices.global.MaintenanceTextCollectionText insertNewText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.MaintenanceTextCollectionText target = null;
            target = (com.sap.xi.documentservices.global.MaintenanceTextCollectionText)get_store().insert_element_user(TEXT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Text" element
     */
    public com.sap.xi.documentservices.global.MaintenanceTextCollectionText addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.MaintenanceTextCollectionText target = null;
            target = (com.sap.xi.documentservices.global.MaintenanceTextCollectionText)get_store().add_element_user(TEXT$2);
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
    
    /**
     * Gets the "TextListCompleteTransmissionIndicator" attribute
     */
    public boolean getTextListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTLISTCOMPLETETRANSMISSIONINDICATOR$4);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "TextListCompleteTransmissionIndicator" attribute
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetTextListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(TEXTLISTCOMPLETETRANSMISSIONINDICATOR$4);
            return target;
        }
    }
    
    /**
     * True if has "TextListCompleteTransmissionIndicator" attribute
     */
    public boolean isSetTextListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEXTLISTCOMPLETETRANSMISSIONINDICATOR$4) != null;
        }
    }
    
    /**
     * Sets the "TextListCompleteTransmissionIndicator" attribute
     */
    public void setTextListCompleteTransmissionIndicator(boolean textListCompleteTransmissionIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTLISTCOMPLETETRANSMISSIONINDICATOR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTLISTCOMPLETETRANSMISSIONINDICATOR$4);
            }
            target.setBooleanValue(textListCompleteTransmissionIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "TextListCompleteTransmissionIndicator" attribute
     */
    public void xsetTextListCompleteTransmissionIndicator(com.sap.xi.ap.common.gdt.Indicator textListCompleteTransmissionIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(TEXTLISTCOMPLETETRANSMISSIONINDICATOR$4);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_attribute_user(TEXTLISTCOMPLETETRANSMISSIONINDICATOR$4);
            }
            target.set(textListCompleteTransmissionIndicator);
        }
    }
    
    /**
     * Unsets the "TextListCompleteTransmissionIndicator" attribute
     */
    public void unsetTextListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEXTLISTCOMPLETETRANSMISSIONINDICATOR$4);
        }
    }
    
    /**
     * Gets the "ActionCode" attribute
     */
    public com.sap.xi.ap.common.gdt.ActionCode.Enum getActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$6);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.ActionCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ActionCode" attribute
     */
    public com.sap.xi.ap.common.gdt.ActionCode xgetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ActionCode target = null;
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$6);
            return target;
        }
    }
    
    /**
     * True if has "ActionCode" attribute
     */
    public boolean isSetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTIONCODE$6) != null;
        }
    }
    
    /**
     * Sets the "ActionCode" attribute
     */
    public void setActionCode(com.sap.xi.ap.common.gdt.ActionCode.Enum actionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIONCODE$6);
            }
            target.setEnumValue(actionCode);
        }
    }
    
    /**
     * Sets (as xml) the "ActionCode" attribute
     */
    public void xsetActionCode(com.sap.xi.ap.common.gdt.ActionCode actionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ActionCode target = null;
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$6);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().add_attribute_user(ACTIONCODE$6);
            }
            target.set(actionCode);
        }
    }
    
    /**
     * Unsets the "ActionCode" attribute
     */
    public void unsetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTIONCODE$6);
        }
    }
}

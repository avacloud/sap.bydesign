/*
 * XML Type:  MaintenanceTextCollectionText
 * Namespace: http://sap.com/xi/DocumentServices/Global
 * Java type: com.sap.xi.documentservices.global.MaintenanceTextCollectionText
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.documentservices.global.impl;
/**
 * An XML MaintenanceTextCollectionText(@http://sap.com/xi/DocumentServices/Global).
 *
 * This is a complex type.
 */
public class MaintenanceTextCollectionTextImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.documentservices.global.MaintenanceTextCollectionText
{
    private static final long serialVersionUID = 1L;
    
    public MaintenanceTextCollectionTextImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TECHNICALID$0 = 
        new javax.xml.namespace.QName("", "TechnicalID");
    private static final javax.xml.namespace.QName TYPECODE$2 = 
        new javax.xml.namespace.QName("", "TypeCode");
    private static final javax.xml.namespace.QName LANGUAGECODE$4 = 
        new javax.xml.namespace.QName("", "LanguageCode");
    private static final javax.xml.namespace.QName CREATIONDATETIME$6 = 
        new javax.xml.namespace.QName("", "CreationDateTime");
    private static final javax.xml.namespace.QName TEXTCONTENT$8 = 
        new javax.xml.namespace.QName("", "TextContent");
    private static final javax.xml.namespace.QName ACTIONCODE$10 = 
        new javax.xml.namespace.QName("", "ActionCode");
    
    
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
     * Gets the "TypeCode" element
     */
    public com.sap.xi.ap.common.gdt.TextCollectionTextTypeCode getTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TextCollectionTextTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.TextCollectionTextTypeCode)get_store().find_element_user(TYPECODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TypeCode" element
     */
    public boolean isSetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPECODE$2) != 0;
        }
    }
    
    /**
     * Sets the "TypeCode" element
     */
    public void setTypeCode(com.sap.xi.ap.common.gdt.TextCollectionTextTypeCode typeCode)
    {
        generatedSetterHelperImpl(typeCode, TYPECODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TypeCode" element
     */
    public com.sap.xi.ap.common.gdt.TextCollectionTextTypeCode addNewTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TextCollectionTextTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.TextCollectionTextTypeCode)get_store().add_element_user(TYPECODE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "TypeCode" element
     */
    public void unsetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPECODE$2, 0);
        }
    }
    
    /**
     * Gets the "LanguageCode" element
     */
    public java.lang.String getLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGECODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LanguageCode" element
     */
    public com.sap.xi.basis.global.LanguageCode xgetLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.LanguageCode target = null;
            target = (com.sap.xi.basis.global.LanguageCode)get_store().find_element_user(LANGUAGECODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "LanguageCode" element
     */
    public boolean isSetLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANGUAGECODE$4) != 0;
        }
    }
    
    /**
     * Sets the "LanguageCode" element
     */
    public void setLanguageCode(java.lang.String languageCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGECODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGECODE$4);
            }
            target.setStringValue(languageCode);
        }
    }
    
    /**
     * Sets (as xml) the "LanguageCode" element
     */
    public void xsetLanguageCode(com.sap.xi.basis.global.LanguageCode languageCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.LanguageCode target = null;
            target = (com.sap.xi.basis.global.LanguageCode)get_store().find_element_user(LANGUAGECODE$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.LanguageCode)get_store().add_element_user(LANGUAGECODE$4);
            }
            target.set(languageCode);
        }
    }
    
    /**
     * Unsets the "LanguageCode" element
     */
    public void unsetLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANGUAGECODE$4, 0);
        }
    }
    
    /**
     * Gets the "CreationDateTime" element
     */
    public java.util.Calendar getCreationDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATIONDATETIME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CreationDateTime" element
     */
    public com.sap.xi.basis.global.GLOBALDateTime xgetCreationDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(CREATIONDATETIME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "CreationDateTime" element
     */
    public boolean isSetCreationDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATIONDATETIME$6) != 0;
        }
    }
    
    /**
     * Sets the "CreationDateTime" element
     */
    public void setCreationDateTime(java.util.Calendar creationDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATIONDATETIME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATIONDATETIME$6);
            }
            target.setCalendarValue(creationDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "CreationDateTime" element
     */
    public void xsetCreationDateTime(com.sap.xi.basis.global.GLOBALDateTime creationDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(CREATIONDATETIME$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(CREATIONDATETIME$6);
            }
            target.set(creationDateTime);
        }
    }
    
    /**
     * Unsets the "CreationDateTime" element
     */
    public void unsetCreationDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATIONDATETIME$6, 0);
        }
    }
    
    /**
     * Gets the "TextContent" element
     */
    public com.sap.xi.documentservices.global.MaintenanceTextCollectionTextTextContent getTextContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.MaintenanceTextCollectionTextTextContent target = null;
            target = (com.sap.xi.documentservices.global.MaintenanceTextCollectionTextTextContent)get_store().find_element_user(TEXTCONTENT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TextContent" element
     */
    public boolean isSetTextContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXTCONTENT$8) != 0;
        }
    }
    
    /**
     * Sets the "TextContent" element
     */
    public void setTextContent(com.sap.xi.documentservices.global.MaintenanceTextCollectionTextTextContent textContent)
    {
        generatedSetterHelperImpl(textContent, TEXTCONTENT$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TextContent" element
     */
    public com.sap.xi.documentservices.global.MaintenanceTextCollectionTextTextContent addNewTextContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.MaintenanceTextCollectionTextTextContent target = null;
            target = (com.sap.xi.documentservices.global.MaintenanceTextCollectionTextTextContent)get_store().add_element_user(TEXTCONTENT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "TextContent" element
     */
    public void unsetTextContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXTCONTENT$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$10);
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
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$10);
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
            return get_store().find_attribute_user(ACTIONCODE$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIONCODE$10);
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
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$10);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().add_attribute_user(ACTIONCODE$10);
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
            get_store().remove_attribute(ACTIONCODE$10);
        }
    }
}

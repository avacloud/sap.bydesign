/*
 * XML Type:  AccessTextCollectionText
 * Namespace: http://sap.com/xi/DocumentServices/Global
 * Java type: com.sap.xi.documentservices.global.AccessTextCollectionText
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.documentservices.global.impl;
/**
 * An XML AccessTextCollectionText(@http://sap.com/xi/DocumentServices/Global).
 *
 * This is a complex type.
 */
public class AccessTextCollectionTextImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.documentservices.global.AccessTextCollectionText
{
    private static final long serialVersionUID = 1L;
    
    public AccessTextCollectionTextImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TECHNICALID$0 = 
        new javax.xml.namespace.QName("", "TechnicalID");
    private static final javax.xml.namespace.QName TYPECODE$2 = 
        new javax.xml.namespace.QName("", "TypeCode");
    private static final javax.xml.namespace.QName TYPENAME$4 = 
        new javax.xml.namespace.QName("", "TypeName");
    private static final javax.xml.namespace.QName LANGUAGECODE$6 = 
        new javax.xml.namespace.QName("", "LanguageCode");
    private static final javax.xml.namespace.QName LANGUAGENAME$8 = 
        new javax.xml.namespace.QName("", "LanguageName");
    private static final javax.xml.namespace.QName SYSTEMADMINISTRATIVEDATA$10 = 
        new javax.xml.namespace.QName("", "SystemAdministrativeData");
    private static final javax.xml.namespace.QName CREATIONDATETIME$12 = 
        new javax.xml.namespace.QName("", "CreationDateTime");
    private static final javax.xml.namespace.QName TEXTCONTENT$14 = 
        new javax.xml.namespace.QName("", "TextContent");
    
    
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
     * Gets the "TypeName" element
     */
    public java.lang.String getTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPENAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TypeName" element
     */
    public com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName xgetTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().find_element_user(TYPENAME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "TypeName" element
     */
    public boolean isSetTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPENAME$4) != 0;
        }
    }
    
    /**
     * Sets the "TypeName" element
     */
    public void setTypeName(java.lang.String typeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPENAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPENAME$4);
            }
            target.setStringValue(typeName);
        }
    }
    
    /**
     * Sets (as xml) the "TypeName" element
     */
    public void xsetTypeName(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName typeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().find_element_user(TYPENAME$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().add_element_user(TYPENAME$4);
            }
            target.set(typeName);
        }
    }
    
    /**
     * Unsets the "TypeName" element
     */
    public void unsetTypeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPENAME$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGECODE$6, 0);
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
            target = (com.sap.xi.basis.global.LanguageCode)get_store().find_element_user(LANGUAGECODE$6, 0);
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
            return get_store().count_elements(LANGUAGECODE$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGECODE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGECODE$6);
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
            target = (com.sap.xi.basis.global.LanguageCode)get_store().find_element_user(LANGUAGECODE$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.LanguageCode)get_store().add_element_user(LANGUAGECODE$6);
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
            get_store().remove_element(LANGUAGECODE$6, 0);
        }
    }
    
    /**
     * Gets the "LanguageName" element
     */
    public java.lang.String getLanguageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGENAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LanguageName" element
     */
    public com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName xgetLanguageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().find_element_user(LANGUAGENAME$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "LanguageName" element
     */
    public boolean isSetLanguageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANGUAGENAME$8) != 0;
        }
    }
    
    /**
     * Sets the "LanguageName" element
     */
    public void setLanguageName(java.lang.String languageName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGENAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGENAME$8);
            }
            target.setStringValue(languageName);
        }
    }
    
    /**
     * Sets (as xml) the "LanguageName" element
     */
    public void xsetLanguageName(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName languageName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().find_element_user(LANGUAGENAME$8, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().add_element_user(LANGUAGENAME$8);
            }
            target.set(languageName);
        }
    }
    
    /**
     * Unsets the "LanguageName" element
     */
    public void unsetLanguageName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANGUAGENAME$8, 0);
        }
    }
    
    /**
     * Gets the "SystemAdministrativeData" element
     */
    public com.sap.xi.ap.common.gdt.SystemAdministrativeData getSystemAdministrativeData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SystemAdministrativeData target = null;
            target = (com.sap.xi.ap.common.gdt.SystemAdministrativeData)get_store().find_element_user(SYSTEMADMINISTRATIVEDATA$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SystemAdministrativeData" element
     */
    public boolean isSetSystemAdministrativeData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYSTEMADMINISTRATIVEDATA$10) != 0;
        }
    }
    
    /**
     * Sets the "SystemAdministrativeData" element
     */
    public void setSystemAdministrativeData(com.sap.xi.ap.common.gdt.SystemAdministrativeData systemAdministrativeData)
    {
        generatedSetterHelperImpl(systemAdministrativeData, SYSTEMADMINISTRATIVEDATA$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SystemAdministrativeData" element
     */
    public com.sap.xi.ap.common.gdt.SystemAdministrativeData addNewSystemAdministrativeData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SystemAdministrativeData target = null;
            target = (com.sap.xi.ap.common.gdt.SystemAdministrativeData)get_store().add_element_user(SYSTEMADMINISTRATIVEDATA$10);
            return target;
        }
    }
    
    /**
     * Unsets the "SystemAdministrativeData" element
     */
    public void unsetSystemAdministrativeData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYSTEMADMINISTRATIVEDATA$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATIONDATETIME$12, 0);
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
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(CREATIONDATETIME$12, 0);
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
            return get_store().count_elements(CREATIONDATETIME$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATIONDATETIME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATIONDATETIME$12);
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
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(CREATIONDATETIME$12, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(CREATIONDATETIME$12);
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
            get_store().remove_element(CREATIONDATETIME$12, 0);
        }
    }
    
    /**
     * Gets the "TextContent" element
     */
    public com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent getTextContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent target = null;
            target = (com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent)get_store().find_element_user(TEXTCONTENT$14, 0);
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
            return get_store().count_elements(TEXTCONTENT$14) != 0;
        }
    }
    
    /**
     * Sets the "TextContent" element
     */
    public void setTextContent(com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent textContent)
    {
        generatedSetterHelperImpl(textContent, TEXTCONTENT$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TextContent" element
     */
    public com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent addNewTextContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent target = null;
            target = (com.sap.xi.documentservices.global.AccessTextCollectionTextTextContent)get_store().add_element_user(TEXTCONTENT$14);
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
            get_store().remove_element(TEXTCONTENT$14, 0);
        }
    }
}

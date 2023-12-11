/*
 * XML Type:  LogItem
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.LogItem
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt.impl;
/**
 * An XML LogItem(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is a complex type.
 */
public class LogItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.ap.common.gdt.LogItem
{
    private static final long serialVersionUID = 1L;
    
    public LogItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPEID$0 = 
        new javax.xml.namespace.QName("", "TypeID");
    private static final javax.xml.namespace.QName CATEGORYCODE$2 = 
        new javax.xml.namespace.QName("", "CategoryCode");
    private static final javax.xml.namespace.QName SEVERITYCODE$4 = 
        new javax.xml.namespace.QName("", "SeverityCode");
    private static final javax.xml.namespace.QName REFERENCEOBJECTNODESENDERTECHNICALID$6 = 
        new javax.xml.namespace.QName("", "ReferenceObjectNodeSenderTechnicalID");
    private static final javax.xml.namespace.QName REFERENCEMESSAGEELEMENTNAME$8 = 
        new javax.xml.namespace.QName("", "ReferenceMessageElementName");
    private static final javax.xml.namespace.QName NOTE$10 = 
        new javax.xml.namespace.QName("", "Note");
    private static final javax.xml.namespace.QName NOTETEMPLATETEXT$12 = 
        new javax.xml.namespace.QName("", "NoteTemplateText");
    private static final javax.xml.namespace.QName LOGITEMNOTEPLACEHOLDERSUBSTITUTIONLIST$14 = 
        new javax.xml.namespace.QName("", "LogItemNotePlaceholderSubstitutionList");
    private static final javax.xml.namespace.QName WEBURI$16 = 
        new javax.xml.namespace.QName("", "WebURI");
    
    
    /**
     * Gets the "TypeID" element
     */
    public java.lang.String getTypeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TypeID" element
     */
    public com.sap.xi.ap.common.gdt.LogItemTypeID xgetTypeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemTypeID target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemTypeID)get_store().find_element_user(TYPEID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "TypeID" element
     */
    public boolean isSetTypeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPEID$0) != 0;
        }
    }
    
    /**
     * Sets the "TypeID" element
     */
    public void setTypeID(java.lang.String typeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPEID$0);
            }
            target.setStringValue(typeID);
        }
    }
    
    /**
     * Sets (as xml) the "TypeID" element
     */
    public void xsetTypeID(com.sap.xi.ap.common.gdt.LogItemTypeID typeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemTypeID target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemTypeID)get_store().find_element_user(TYPEID$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogItemTypeID)get_store().add_element_user(TYPEID$0);
            }
            target.set(typeID);
        }
    }
    
    /**
     * Unsets the "TypeID" element
     */
    public void unsetTypeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPEID$0, 0);
        }
    }
    
    /**
     * Gets the "CategoryCode" element
     */
    public com.sap.xi.ap.common.gdt.LogItemCategoryCode getCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemCategoryCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemCategoryCode)get_store().find_element_user(CATEGORYCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CategoryCode" element
     */
    public boolean isSetCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "CategoryCode" element
     */
    public void setCategoryCode(com.sap.xi.ap.common.gdt.LogItemCategoryCode categoryCode)
    {
        generatedSetterHelperImpl(categoryCode, CATEGORYCODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CategoryCode" element
     */
    public com.sap.xi.ap.common.gdt.LogItemCategoryCode addNewCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemCategoryCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemCategoryCode)get_store().add_element_user(CATEGORYCODE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "CategoryCode" element
     */
    public void unsetCategoryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYCODE$2, 0);
        }
    }
    
    /**
     * Gets the "SeverityCode" element
     */
    public java.lang.String getSeverityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEVERITYCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SeverityCode" element
     */
    public com.sap.xi.ap.common.gdt.LogItemSeverityCode xgetSeverityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemSeverityCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemSeverityCode)get_store().find_element_user(SEVERITYCODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "SeverityCode" element
     */
    public boolean isSetSeverityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEVERITYCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "SeverityCode" element
     */
    public void setSeverityCode(java.lang.String severityCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEVERITYCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEVERITYCODE$4);
            }
            target.setStringValue(severityCode);
        }
    }
    
    /**
     * Sets (as xml) the "SeverityCode" element
     */
    public void xsetSeverityCode(com.sap.xi.ap.common.gdt.LogItemSeverityCode severityCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemSeverityCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemSeverityCode)get_store().find_element_user(SEVERITYCODE$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogItemSeverityCode)get_store().add_element_user(SEVERITYCODE$4);
            }
            target.set(severityCode);
        }
    }
    
    /**
     * Unsets the "SeverityCode" element
     */
    public void unsetSeverityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEVERITYCODE$4, 0);
        }
    }
    
    /**
     * Gets the "ReferenceObjectNodeSenderTechnicalID" element
     */
    public java.lang.String getReferenceObjectNodeSenderTechnicalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCEOBJECTNODESENDERTECHNICALID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReferenceObjectNodeSenderTechnicalID" element
     */
    public com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID xgetReferenceObjectNodeSenderTechnicalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID)get_store().find_element_user(REFERENCEOBJECTNODESENDERTECHNICALID$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReferenceObjectNodeSenderTechnicalID" element
     */
    public boolean isSetReferenceObjectNodeSenderTechnicalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCEOBJECTNODESENDERTECHNICALID$6) != 0;
        }
    }
    
    /**
     * Sets the "ReferenceObjectNodeSenderTechnicalID" element
     */
    public void setReferenceObjectNodeSenderTechnicalID(java.lang.String referenceObjectNodeSenderTechnicalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCEOBJECTNODESENDERTECHNICALID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCEOBJECTNODESENDERTECHNICALID$6);
            }
            target.setStringValue(referenceObjectNodeSenderTechnicalID);
        }
    }
    
    /**
     * Sets (as xml) the "ReferenceObjectNodeSenderTechnicalID" element
     */
    public void xsetReferenceObjectNodeSenderTechnicalID(com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID referenceObjectNodeSenderTechnicalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID)get_store().find_element_user(REFERENCEOBJECTNODESENDERTECHNICALID$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID)get_store().add_element_user(REFERENCEOBJECTNODESENDERTECHNICALID$6);
            }
            target.set(referenceObjectNodeSenderTechnicalID);
        }
    }
    
    /**
     * Unsets the "ReferenceObjectNodeSenderTechnicalID" element
     */
    public void unsetReferenceObjectNodeSenderTechnicalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCEOBJECTNODESENDERTECHNICALID$6, 0);
        }
    }
    
    /**
     * Gets the "ReferenceMessageElementName" element
     */
    public java.lang.String getReferenceMessageElementName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCEMESSAGEELEMENTNAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReferenceMessageElementName" element
     */
    public com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName xgetReferenceMessageElementName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName)get_store().find_element_user(REFERENCEMESSAGEELEMENTNAME$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReferenceMessageElementName" element
     */
    public boolean isSetReferenceMessageElementName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCEMESSAGEELEMENTNAME$8) != 0;
        }
    }
    
    /**
     * Sets the "ReferenceMessageElementName" element
     */
    public void setReferenceMessageElementName(java.lang.String referenceMessageElementName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCEMESSAGEELEMENTNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCEMESSAGEELEMENTNAME$8);
            }
            target.setStringValue(referenceMessageElementName);
        }
    }
    
    /**
     * Sets (as xml) the "ReferenceMessageElementName" element
     */
    public void xsetReferenceMessageElementName(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName referenceMessageElementName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName)get_store().find_element_user(REFERENCEMESSAGEELEMENTNAME$8, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTName)get_store().add_element_user(REFERENCEMESSAGEELEMENTNAME$8);
            }
            target.set(referenceMessageElementName);
        }
    }
    
    /**
     * Unsets the "ReferenceMessageElementName" element
     */
    public void unsetReferenceMessageElementName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCEMESSAGEELEMENTNAME$8, 0);
        }
    }
    
    /**
     * Gets the "Note" element
     */
    public java.lang.String getNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Note" element
     */
    public com.sap.xi.ap.common.gdt.LogItemNote xgetNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemNote target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemNote)get_store().find_element_user(NOTE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Note" element
     */
    public void setNote(java.lang.String note)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTE$10);
            }
            target.setStringValue(note);
        }
    }
    
    /**
     * Sets (as xml) the "Note" element
     */
    public void xsetNote(com.sap.xi.ap.common.gdt.LogItemNote note)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemNote target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemNote)get_store().find_element_user(NOTE$10, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogItemNote)get_store().add_element_user(NOTE$10);
            }
            target.set(note);
        }
    }
    
    /**
     * Gets the "NoteTemplateText" element
     */
    public java.lang.String getNoteTemplateText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTETEMPLATETEXT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NoteTemplateText" element
     */
    public com.sap.xi.ap.common.gdt.LogItemNoteTemplateText xgetNoteTemplateText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemNoteTemplateText target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemNoteTemplateText)get_store().find_element_user(NOTETEMPLATETEXT$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "NoteTemplateText" element
     */
    public boolean isSetNoteTemplateText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTETEMPLATETEXT$12) != 0;
        }
    }
    
    /**
     * Sets the "NoteTemplateText" element
     */
    public void setNoteTemplateText(java.lang.String noteTemplateText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTETEMPLATETEXT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTETEMPLATETEXT$12);
            }
            target.setStringValue(noteTemplateText);
        }
    }
    
    /**
     * Sets (as xml) the "NoteTemplateText" element
     */
    public void xsetNoteTemplateText(com.sap.xi.ap.common.gdt.LogItemNoteTemplateText noteTemplateText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemNoteTemplateText target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemNoteTemplateText)get_store().find_element_user(NOTETEMPLATETEXT$12, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogItemNoteTemplateText)get_store().add_element_user(NOTETEMPLATETEXT$12);
            }
            target.set(noteTemplateText);
        }
    }
    
    /**
     * Unsets the "NoteTemplateText" element
     */
    public void unsetNoteTemplateText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTETEMPLATETEXT$12, 0);
        }
    }
    
    /**
     * Gets the "LogItemNotePlaceholderSubstitutionList" element
     */
    public com.sap.xi.ap.common.gdt.LogItemNotePlaceholderSubstitutionList getLogItemNotePlaceholderSubstitutionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemNotePlaceholderSubstitutionList target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemNotePlaceholderSubstitutionList)get_store().find_element_user(LOGITEMNOTEPLACEHOLDERSUBSTITUTIONLIST$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LogItemNotePlaceholderSubstitutionList" element
     */
    public boolean isSetLogItemNotePlaceholderSubstitutionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGITEMNOTEPLACEHOLDERSUBSTITUTIONLIST$14) != 0;
        }
    }
    
    /**
     * Sets the "LogItemNotePlaceholderSubstitutionList" element
     */
    public void setLogItemNotePlaceholderSubstitutionList(com.sap.xi.ap.common.gdt.LogItemNotePlaceholderSubstitutionList logItemNotePlaceholderSubstitutionList)
    {
        generatedSetterHelperImpl(logItemNotePlaceholderSubstitutionList, LOGITEMNOTEPLACEHOLDERSUBSTITUTIONLIST$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LogItemNotePlaceholderSubstitutionList" element
     */
    public com.sap.xi.ap.common.gdt.LogItemNotePlaceholderSubstitutionList addNewLogItemNotePlaceholderSubstitutionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemNotePlaceholderSubstitutionList target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemNotePlaceholderSubstitutionList)get_store().add_element_user(LOGITEMNOTEPLACEHOLDERSUBSTITUTIONLIST$14);
            return target;
        }
    }
    
    /**
     * Unsets the "LogItemNotePlaceholderSubstitutionList" element
     */
    public void unsetLogItemNotePlaceholderSubstitutionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGITEMNOTEPLACEHOLDERSUBSTITUTIONLIST$14, 0);
        }
    }
    
    /**
     * Gets the "WebURI" element
     */
    public java.lang.String getWebURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBURI$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "WebURI" element
     */
    public com.sap.xi.ap.common.gdt.WebURI xgetWebURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.WebURI target = null;
            target = (com.sap.xi.ap.common.gdt.WebURI)get_store().find_element_user(WEBURI$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "WebURI" element
     */
    public boolean isSetWebURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEBURI$16) != 0;
        }
    }
    
    /**
     * Sets the "WebURI" element
     */
    public void setWebURI(java.lang.String webURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEBURI$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEBURI$16);
            }
            target.setStringValue(webURI);
        }
    }
    
    /**
     * Sets (as xml) the "WebURI" element
     */
    public void xsetWebURI(com.sap.xi.ap.common.gdt.WebURI webURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.WebURI target = null;
            target = (com.sap.xi.ap.common.gdt.WebURI)get_store().find_element_user(WEBURI$16, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.WebURI)get_store().add_element_user(WEBURI$16);
            }
            target.set(webURI);
        }
    }
    
    /**
     * Unsets the "WebURI" element
     */
    public void unsetWebURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEBURI$16, 0);
        }
    }
}

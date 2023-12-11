/*
 * XML Type:  AccessAttachmentFolderDocumentPropertyPropertyValue
 * Namespace: http://sap.com/xi/DocumentServices/Global
 * Java type: com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.documentservices.global.impl;
/**
 * An XML AccessAttachmentFolderDocumentPropertyPropertyValue(@http://sap.com/xi/DocumentServices/Global).
 *
 * This is a complex type.
 */
public class AccessAttachmentFolderDocumentPropertyPropertyValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.documentservices.global.AccessAttachmentFolderDocumentPropertyPropertyValue
{
    private static final long serialVersionUID = 1L;
    
    public AccessAttachmentFolderDocumentPropertyPropertyValueImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TECHNICALID$0 = 
        new javax.xml.namespace.QName("", "TechnicalID");
    private static final javax.xml.namespace.QName TEXT$2 = 
        new javax.xml.namespace.QName("", "Text");
    private static final javax.xml.namespace.QName INDICATOR$4 = 
        new javax.xml.namespace.QName("", "Indicator");
    private static final javax.xml.namespace.QName DATETIME$6 = 
        new javax.xml.namespace.QName("", "DateTime");
    private static final javax.xml.namespace.QName INTEGERVALUE$8 = 
        new javax.xml.namespace.QName("", "IntegerValue");
    
    
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
    public java.lang.String getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Text" element
     */
    public com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTText xgetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTText target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTText)get_store().find_element_user(TEXT$2, 0);
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
    public void setText(java.lang.String text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXT$2);
            }
            target.setStringValue(text);
        }
    }
    
    /**
     * Sets (as xml) the "Text" element
     */
    public void xsetText(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTText text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTText target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTText)get_store().find_element_user(TEXT$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTText)get_store().add_element_user(TEXT$2);
            }
            target.set(text);
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
    
    /**
     * Gets the "Indicator" element
     */
    public boolean getIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDICATOR$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Indicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(INDICATOR$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Indicator" element
     */
    public boolean isSetIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDICATOR$4) != 0;
        }
    }
    
    /**
     * Sets the "Indicator" element
     */
    public void setIndicator(boolean indicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDICATOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDICATOR$4);
            }
            target.setBooleanValue(indicator);
        }
    }
    
    /**
     * Sets (as xml) the "Indicator" element
     */
    public void xsetIndicator(com.sap.xi.ap.common.gdt.Indicator indicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(INDICATOR$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(INDICATOR$4);
            }
            target.set(indicator);
        }
    }
    
    /**
     * Unsets the "Indicator" element
     */
    public void unsetIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDICATOR$4, 0);
        }
    }
    
    /**
     * Gets the "DateTime" element
     */
    public java.util.Calendar getDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DateTime" element
     */
    public com.sap.xi.basis.global.GLOBALDateTime xgetDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(DATETIME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "DateTime" element
     */
    public boolean isSetDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATETIME$6) != 0;
        }
    }
    
    /**
     * Sets the "DateTime" element
     */
    public void setDateTime(java.util.Calendar dateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATETIME$6);
            }
            target.setCalendarValue(dateTime);
        }
    }
    
    /**
     * Sets (as xml) the "DateTime" element
     */
    public void xsetDateTime(com.sap.xi.basis.global.GLOBALDateTime dateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(DATETIME$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(DATETIME$6);
            }
            target.set(dateTime);
        }
    }
    
    /**
     * Unsets the "DateTime" element
     */
    public void unsetDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATETIME$6, 0);
        }
    }
    
    /**
     * Gets the "IntegerValue" element
     */
    public int getIntegerValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERVALUE$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "IntegerValue" element
     */
    public com.sap.xi.ap.common.gdt.IntegerValue xgetIntegerValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IntegerValue target = null;
            target = (com.sap.xi.ap.common.gdt.IntegerValue)get_store().find_element_user(INTEGERVALUE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "IntegerValue" element
     */
    public boolean isSetIntegerValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTEGERVALUE$8) != 0;
        }
    }
    
    /**
     * Sets the "IntegerValue" element
     */
    public void setIntegerValue(int integerValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTEGERVALUE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTEGERVALUE$8);
            }
            target.setIntValue(integerValue);
        }
    }
    
    /**
     * Sets (as xml) the "IntegerValue" element
     */
    public void xsetIntegerValue(com.sap.xi.ap.common.gdt.IntegerValue integerValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IntegerValue target = null;
            target = (com.sap.xi.ap.common.gdt.IntegerValue)get_store().find_element_user(INTEGERVALUE$8, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.IntegerValue)get_store().add_element_user(INTEGERVALUE$8);
            }
            target.set(integerValue);
        }
    }
    
    /**
     * Unsets the "IntegerValue" element
     */
    public void unsetIntegerValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTEGERVALUE$8, 0);
        }
    }
}

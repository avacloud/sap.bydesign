/*
 * XML Type:  ProductionLotBundleException
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotBundleException
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotBundleException(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotBundleExceptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotBundleException
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotBundleExceptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGE$0 = 
        new javax.xml.namespace.QName("", "Message");
    private static final javax.xml.namespace.QName SEVERITYCODE$2 = 
        new javax.xml.namespace.QName("", "SeverityCode");
    
    
    /**
     * Gets the "Message" element
     */
    public java.lang.String getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Message" element
     */
    public com.sap.xi.ap.common.gdt.LogItemNote xgetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemNote target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemNote)get_store().find_element_user(MESSAGE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Message" element
     */
    public boolean isSetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGE$0) != 0;
        }
    }
    
    /**
     * Sets the "Message" element
     */
    public void setMessage(java.lang.String message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$0);
            }
            target.setStringValue(message);
        }
    }
    
    /**
     * Sets (as xml) the "Message" element
     */
    public void xsetMessage(com.sap.xi.ap.common.gdt.LogItemNote message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemNote target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemNote)get_store().find_element_user(MESSAGE$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogItemNote)get_store().add_element_user(MESSAGE$0);
            }
            target.set(message);
        }
    }
    
    /**
     * Unsets the "Message" element
     */
    public void unsetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGE$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEVERITYCODE$2, 0);
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
            target = (com.sap.xi.ap.common.gdt.LogItemSeverityCode)get_store().find_element_user(SEVERITYCODE$2, 0);
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
            return get_store().count_elements(SEVERITYCODE$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEVERITYCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEVERITYCODE$2);
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
            target = (com.sap.xi.ap.common.gdt.LogItemSeverityCode)get_store().find_element_user(SEVERITYCODE$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogItemSeverityCode)get_store().add_element_user(SEVERITYCODE$2);
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
            get_store().remove_element(SEVERITYCODE$2, 0);
        }
    }
}

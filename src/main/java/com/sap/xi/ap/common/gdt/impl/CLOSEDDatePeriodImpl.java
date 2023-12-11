/*
 * XML Type:  CLOSED_DatePeriod
 * Namespace: http://sap.com/xi/AP/Common/GDT
 * Java type: com.sap.xi.ap.common.gdt.CLOSEDDatePeriod
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.common.gdt.impl;
/**
 * An XML CLOSED_DatePeriod(@http://sap.com/xi/AP/Common/GDT).
 *
 * This is a complex type.
 */
public class CLOSEDDatePeriodImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.ap.common.gdt.CLOSEDDatePeriod
{
    private static final long serialVersionUID = 1L;
    
    public CLOSEDDatePeriodImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTDATE$0 = 
        new javax.xml.namespace.QName("", "StartDate");
    private static final javax.xml.namespace.QName ENDDATE$2 = 
        new javax.xml.namespace.QName("", "EndDate");
    
    
    /**
     * Gets the "StartDate" element
     */
    public java.util.Calendar getStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "StartDate" element
     */
    public com.sap.xi.ap.common.gdt.Date xgetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Date target = null;
            target = (com.sap.xi.ap.common.gdt.Date)get_store().find_element_user(STARTDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "StartDate" element
     */
    public void setStartDate(java.util.Calendar startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$0);
            }
            target.setCalendarValue(startDate);
        }
    }
    
    /**
     * Sets (as xml) the "StartDate" element
     */
    public void xsetStartDate(com.sap.xi.ap.common.gdt.Date startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Date target = null;
            target = (com.sap.xi.ap.common.gdt.Date)get_store().find_element_user(STARTDATE$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Date)get_store().add_element_user(STARTDATE$0);
            }
            target.set(startDate);
        }
    }
    
    /**
     * Gets the "EndDate" element
     */
    public java.util.Calendar getEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndDate" element
     */
    public com.sap.xi.ap.common.gdt.Date xgetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Date target = null;
            target = (com.sap.xi.ap.common.gdt.Date)get_store().find_element_user(ENDDATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EndDate" element
     */
    public void setEndDate(java.util.Calendar endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$2);
            }
            target.setCalendarValue(endDate);
        }
    }
    
    /**
     * Sets (as xml) the "EndDate" element
     */
    public void xsetEndDate(com.sap.xi.ap.common.gdt.Date endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Date target = null;
            target = (com.sap.xi.ap.common.gdt.Date)get_store().find_element_user(ENDDATE$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Date)get_store().add_element_user(ENDDATE$2);
            }
            target.set(endDate);
        }
    }
}

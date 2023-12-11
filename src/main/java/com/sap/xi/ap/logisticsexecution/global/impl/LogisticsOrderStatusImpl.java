/*
 * XML Type:  LogisticsOrderStatus
 * Namespace: http://sap.com/xi/AP/LogisticsExecution/Global
 * Java type: com.sap.xi.ap.logisticsexecution.global.LogisticsOrderStatus
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.logisticsexecution.global.impl;
/**
 * An XML LogisticsOrderStatus(@http://sap.com/xi/AP/LogisticsExecution/Global).
 *
 * This is a complex type.
 */
public class LogisticsOrderStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.ap.logisticsexecution.global.LogisticsOrderStatus
{
    private static final long serialVersionUID = 1L;
    
    public LogisticsOrderStatusImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIFECYCLESTATUSCODE$0 = 
        new javax.xml.namespace.QName("", "LifeCycleStatusCode");
    private static final javax.xml.namespace.QName SCHEDULINGSTATUSCODE$2 = 
        new javax.xml.namespace.QName("", "SchedulingStatusCode");
    
    
    /**
     * Gets the "LifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode.Enum getLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIFECYCLESTATUSCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "LifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode xgetLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode)get_store().find_element_user(LIFECYCLESTATUSCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LifeCycleStatusCode" element
     */
    public void setLifeCycleStatusCode(com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode.Enum lifeCycleStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIFECYCLESTATUSCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIFECYCLESTATUSCODE$0);
            }
            target.setEnumValue(lifeCycleStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "LifeCycleStatusCode" element
     */
    public void xsetLifeCycleStatusCode(com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode lifeCycleStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode)get_store().find_element_user(LIFECYCLESTATUSCODE$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogisticsLifeCycleStatusCode)get_store().add_element_user(LIFECYCLESTATUSCODE$0);
            }
            target.set(lifeCycleStatusCode);
        }
    }
    
    /**
     * Gets the "SchedulingStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.LogisticsOrderSchedulingStatusCode.Enum getSchedulingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULINGSTATUSCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.LogisticsOrderSchedulingStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SchedulingStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.LogisticsOrderSchedulingStatusCode xgetSchedulingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsOrderSchedulingStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsOrderSchedulingStatusCode)get_store().find_element_user(SCHEDULINGSTATUSCODE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "SchedulingStatusCode" element
     */
    public boolean isSetSchedulingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEDULINGSTATUSCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "SchedulingStatusCode" element
     */
    public void setSchedulingStatusCode(com.sap.xi.ap.common.gdt.LogisticsOrderSchedulingStatusCode.Enum schedulingStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULINGSTATUSCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEDULINGSTATUSCODE$2);
            }
            target.setEnumValue(schedulingStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "SchedulingStatusCode" element
     */
    public void xsetSchedulingStatusCode(com.sap.xi.ap.common.gdt.LogisticsOrderSchedulingStatusCode schedulingStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsOrderSchedulingStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsOrderSchedulingStatusCode)get_store().find_element_user(SCHEDULINGSTATUSCODE$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogisticsOrderSchedulingStatusCode)get_store().add_element_user(SCHEDULINGSTATUSCODE$2);
            }
            target.set(schedulingStatusCode);
        }
    }
    
    /**
     * Unsets the "SchedulingStatusCode" element
     */
    public void unsetSchedulingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEDULINGSTATUSCODE$2, 0);
        }
    }
}

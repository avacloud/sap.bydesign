/*
 * XML Type:  LogisticsTaskStatus
 * Namespace: http://sap.com/xi/AP/LogisticsExecution/Global
 * Java type: com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.logisticsexecution.global.impl;
/**
 * An XML LogisticsTaskStatus(@http://sap.com/xi/AP/LogisticsExecution/Global).
 *
 * This is a complex type.
 */
public class LogisticsTaskStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus
{
    private static final long serialVersionUID = 1L;
    
    public LogisticsTaskStatusImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCESSINGSTATUSCODE$0 = 
        new javax.xml.namespace.QName("", "ProcessingStatusCode");
    private static final javax.xml.namespace.QName STARTFEASIBILITYSTATUSCODE$2 = 
        new javax.xml.namespace.QName("", "StartFeasibilityStatusCode");
    
    
    /**
     * Gets the "ProcessingStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum getProcessingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSINGSTATUSCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProcessingStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.ProcessingStatusCode xgetProcessingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProcessingStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().find_element_user(PROCESSINGSTATUSCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ProcessingStatusCode" element
     */
    public void setProcessingStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum processingStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSINGSTATUSCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCESSINGSTATUSCODE$0);
            }
            target.setEnumValue(processingStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "ProcessingStatusCode" element
     */
    public void xsetProcessingStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode processingStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProcessingStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().find_element_user(PROCESSINGSTATUSCODE$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().add_element_user(PROCESSINGSTATUSCODE$0);
            }
            target.set(processingStatusCode);
        }
    }
    
    /**
     * Gets the "StartFeasibilityStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.FeasibilityStatusCode.Enum getStartFeasibilityStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTFEASIBILITYSTATUSCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.FeasibilityStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "StartFeasibilityStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.FeasibilityStatusCode xgetStartFeasibilityStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.FeasibilityStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.FeasibilityStatusCode)get_store().find_element_user(STARTFEASIBILITYSTATUSCODE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "StartFeasibilityStatusCode" element
     */
    public void setStartFeasibilityStatusCode(com.sap.xi.ap.common.gdt.FeasibilityStatusCode.Enum startFeasibilityStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTFEASIBILITYSTATUSCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTFEASIBILITYSTATUSCODE$2);
            }
            target.setEnumValue(startFeasibilityStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "StartFeasibilityStatusCode" element
     */
    public void xsetStartFeasibilityStatusCode(com.sap.xi.ap.common.gdt.FeasibilityStatusCode startFeasibilityStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.FeasibilityStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.FeasibilityStatusCode)get_store().find_element_user(STARTFEASIBILITYSTATUSCODE$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.FeasibilityStatusCode)get_store().add_element_user(STARTFEASIBILITYSTATUSCODE$2);
            }
            target.set(startFeasibilityStatusCode);
        }
    }
}

/*
 * XML Type:  LogisticsLotReportingPointStatus
 * Namespace: http://sap.com/xi/AP/LogisticsExecution/Global
 * Java type: com.sap.xi.ap.logisticsexecution.global.LogisticsLotReportingPointStatus
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.ap.logisticsexecution.global.impl;
/**
 * An XML LogisticsLotReportingPointStatus(@http://sap.com/xi/AP/LogisticsExecution/Global).
 *
 * This is a complex type.
 */
public class LogisticsLotReportingPointStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.ap.logisticsexecution.global.LogisticsLotReportingPointStatus
{
    private static final long serialVersionUID = 1L;
    
    public LogisticsLotReportingPointStatusImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIFECYCLESTATUSCODE$0 = 
        new javax.xml.namespace.QName("", "LifeCycleStatusCode");
    private static final javax.xml.namespace.QName REPORTINGPOINTPROCESSINGSTATUSCODE$2 = 
        new javax.xml.namespace.QName("", "ReportingPointProcessingStatusCode");
    
    
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
     * Gets the "ReportingPointProcessingStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum getReportingPointProcessingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGPOINTPROCESSINGSTATUSCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReportingPointProcessingStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.ProcessingStatusCode xgetReportingPointProcessingStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProcessingStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().find_element_user(REPORTINGPOINTPROCESSINGSTATUSCODE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ReportingPointProcessingStatusCode" element
     */
    public void setReportingPointProcessingStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode.Enum reportingPointProcessingStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGPOINTPROCESSINGSTATUSCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTINGPOINTPROCESSINGSTATUSCODE$2);
            }
            target.setEnumValue(reportingPointProcessingStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "ReportingPointProcessingStatusCode" element
     */
    public void xsetReportingPointProcessingStatusCode(com.sap.xi.ap.common.gdt.ProcessingStatusCode reportingPointProcessingStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProcessingStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().find_element_user(REPORTINGPOINTPROCESSINGSTATUSCODE$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProcessingStatusCode)get_store().add_element_user(REPORTINGPOINTPROCESSINGSTATUSCODE$2);
            }
            target.set(reportingPointProcessingStatusCode);
        }
    }
}

/*
 * XML Type:  SiteLogisticsTaskByElementsResponse_sync
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML SiteLogisticsTaskByElementsResponse_sync(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class SiteLogisticsTaskByElementsResponseSyncImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.SiteLogisticsTaskByElementsResponseSync
{
    private static final long serialVersionUID = 1L;
    
    public SiteLogisticsTaskByElementsResponseSyncImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SITELOGISTICSTASKID$0 = 
        new javax.xml.namespace.QName("", "SiteLogisticsTaskID");
    private static final javax.xml.namespace.QName SITELOGISTICSTASKUUID$2 = 
        new javax.xml.namespace.QName("", "SiteLogisticsTaskUUID");
    private static final javax.xml.namespace.QName OPERATIONTYPECODE$4 = 
        new javax.xml.namespace.QName("", "OperationTypeCode");
    private static final javax.xml.namespace.QName BUSINESSTRANSACTIONDOCUMENTREFERENCEID$6 = 
        new javax.xml.namespace.QName("", "BusinessTransactionDocumentReferenceID");
    private static final javax.xml.namespace.QName SITELOGISTICSTASKREFERENCEDOBJECT$8 = 
        new javax.xml.namespace.QName("", "SiteLogisticsTaskReferencedObject");
    private static final javax.xml.namespace.QName CUSTOMERPARTY$10 = 
        new javax.xml.namespace.QName("", "CustomerParty");
    private static final javax.xml.namespace.QName EARLIESTEXECUTIONSTARTDATE$12 = 
        new javax.xml.namespace.QName("", "EarliestExecutionStartDate");
    private static final javax.xml.namespace.QName LATESTEXECUTIONENDDATE$14 = 
        new javax.xml.namespace.QName("", "LatestExecutionEndDate");
    
    
    /**
     * Gets the "SiteLogisticsTaskID" element
     */
    public com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID getSiteLogisticsTaskID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID)get_store().find_element_user(SITELOGISTICSTASKID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SiteLogisticsTaskID" element
     */
    public boolean isSetSiteLogisticsTaskID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITELOGISTICSTASKID$0) != 0;
        }
    }
    
    /**
     * Sets the "SiteLogisticsTaskID" element
     */
    public void setSiteLogisticsTaskID(com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID siteLogisticsTaskID)
    {
        generatedSetterHelperImpl(siteLogisticsTaskID, SITELOGISTICSTASKID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SiteLogisticsTaskID" element
     */
    public com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID addNewSiteLogisticsTaskID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID)get_store().add_element_user(SITELOGISTICSTASKID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "SiteLogisticsTaskID" element
     */
    public void unsetSiteLogisticsTaskID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITELOGISTICSTASKID$0, 0);
        }
    }
    
    /**
     * Gets the "SiteLogisticsTaskUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getSiteLogisticsTaskUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(SITELOGISTICSTASKUUID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SiteLogisticsTaskUUID" element
     */
    public boolean isSetSiteLogisticsTaskUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITELOGISTICSTASKUUID$2) != 0;
        }
    }
    
    /**
     * Sets the "SiteLogisticsTaskUUID" element
     */
    public void setSiteLogisticsTaskUUID(com.sap.xi.ap.common.gdt.UUID siteLogisticsTaskUUID)
    {
        generatedSetterHelperImpl(siteLogisticsTaskUUID, SITELOGISTICSTASKUUID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SiteLogisticsTaskUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewSiteLogisticsTaskUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(SITELOGISTICSTASKUUID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "SiteLogisticsTaskUUID" element
     */
    public void unsetSiteLogisticsTaskUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITELOGISTICSTASKUUID$2, 0);
        }
    }
    
    /**
     * Gets the "OperationTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.OperationTypeCode getOperationTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.OperationTypeCode)get_store().find_element_user(OPERATIONTYPECODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OperationTypeCode" element
     */
    public boolean isSetOperationTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATIONTYPECODE$4) != 0;
        }
    }
    
    /**
     * Sets the "OperationTypeCode" element
     */
    public void setOperationTypeCode(com.sap.xi.ap.common.gdt.OperationTypeCode operationTypeCode)
    {
        generatedSetterHelperImpl(operationTypeCode, OPERATIONTYPECODE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OperationTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.OperationTypeCode addNewOperationTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.OperationTypeCode)get_store().add_element_user(OPERATIONTYPECODE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "OperationTypeCode" element
     */
    public void unsetOperationTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATIONTYPECODE$4, 0);
        }
    }
    
    /**
     * Gets the "BusinessTransactionDocumentReferenceID" element
     */
    public com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID getBusinessTransactionDocumentReferenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID)get_store().find_element_user(BUSINESSTRANSACTIONDOCUMENTREFERENCEID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BusinessTransactionDocumentReferenceID" element
     */
    public boolean isSetBusinessTransactionDocumentReferenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUSINESSTRANSACTIONDOCUMENTREFERENCEID$6) != 0;
        }
    }
    
    /**
     * Sets the "BusinessTransactionDocumentReferenceID" element
     */
    public void setBusinessTransactionDocumentReferenceID(com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID businessTransactionDocumentReferenceID)
    {
        generatedSetterHelperImpl(businessTransactionDocumentReferenceID, BUSINESSTRANSACTIONDOCUMENTREFERENCEID$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BusinessTransactionDocumentReferenceID" element
     */
    public com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID addNewBusinessTransactionDocumentReferenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID)get_store().add_element_user(BUSINESSTRANSACTIONDOCUMENTREFERENCEID$6);
            return target;
        }
    }
    
    /**
     * Unsets the "BusinessTransactionDocumentReferenceID" element
     */
    public void unsetBusinessTransactionDocumentReferenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUSINESSTRANSACTIONDOCUMENTREFERENCEID$6, 0);
        }
    }
    
    /**
     * Gets the "SiteLogisticsTaskReferencedObject" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskReferencedObject getSiteLogisticsTaskReferencedObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskReferencedObject target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskReferencedObject)get_store().find_element_user(SITELOGISTICSTASKREFERENCEDOBJECT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SiteLogisticsTaskReferencedObject" element
     */
    public boolean isSetSiteLogisticsTaskReferencedObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITELOGISTICSTASKREFERENCEDOBJECT$8) != 0;
        }
    }
    
    /**
     * Sets the "SiteLogisticsTaskReferencedObject" element
     */
    public void setSiteLogisticsTaskReferencedObject(com.sap.xi.a1s.global.SiteLogisticsTaskReferencedObject siteLogisticsTaskReferencedObject)
    {
        generatedSetterHelperImpl(siteLogisticsTaskReferencedObject, SITELOGISTICSTASKREFERENCEDOBJECT$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SiteLogisticsTaskReferencedObject" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskReferencedObject addNewSiteLogisticsTaskReferencedObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskReferencedObject target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskReferencedObject)get_store().add_element_user(SITELOGISTICSTASKREFERENCEDOBJECT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "SiteLogisticsTaskReferencedObject" element
     */
    public void unsetSiteLogisticsTaskReferencedObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITELOGISTICSTASKREFERENCEDOBJECT$8, 0);
        }
    }
    
    /**
     * Gets the "CustomerParty" element
     */
    public com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty getCustomerParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty target = null;
            target = (com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty)get_store().find_element_user(CUSTOMERPARTY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CustomerParty" element
     */
    public boolean isSetCustomerParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERPARTY$10) != 0;
        }
    }
    
    /**
     * Sets the "CustomerParty" element
     */
    public void setCustomerParty(com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty customerParty)
    {
        generatedSetterHelperImpl(customerParty, CUSTOMERPARTY$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CustomerParty" element
     */
    public com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty addNewCustomerParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty target = null;
            target = (com.sap.xi.ap.logisticsexecution.global.SiteLogisticsTaskReferncedCustomerParty)get_store().add_element_user(CUSTOMERPARTY$10);
            return target;
        }
    }
    
    /**
     * Unsets the "CustomerParty" element
     */
    public void unsetCustomerParty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERPARTY$10, 0);
        }
    }
    
    /**
     * Gets the "EarliestExecutionStartDate" element
     */
    public java.util.Calendar getEarliestExecutionStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EARLIESTEXECUTIONSTARTDATE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EarliestExecutionStartDate" element
     */
    public com.sap.xi.basis.global.GLOBALDateTime xgetEarliestExecutionStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(EARLIESTEXECUTIONSTARTDATE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "EarliestExecutionStartDate" element
     */
    public boolean isSetEarliestExecutionStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EARLIESTEXECUTIONSTARTDATE$12) != 0;
        }
    }
    
    /**
     * Sets the "EarliestExecutionStartDate" element
     */
    public void setEarliestExecutionStartDate(java.util.Calendar earliestExecutionStartDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EARLIESTEXECUTIONSTARTDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EARLIESTEXECUTIONSTARTDATE$12);
            }
            target.setCalendarValue(earliestExecutionStartDate);
        }
    }
    
    /**
     * Sets (as xml) the "EarliestExecutionStartDate" element
     */
    public void xsetEarliestExecutionStartDate(com.sap.xi.basis.global.GLOBALDateTime earliestExecutionStartDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(EARLIESTEXECUTIONSTARTDATE$12, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(EARLIESTEXECUTIONSTARTDATE$12);
            }
            target.set(earliestExecutionStartDate);
        }
    }
    
    /**
     * Unsets the "EarliestExecutionStartDate" element
     */
    public void unsetEarliestExecutionStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EARLIESTEXECUTIONSTARTDATE$12, 0);
        }
    }
    
    /**
     * Gets the "LatestExecutionEndDate" element
     */
    public java.util.Calendar getLatestExecutionEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATESTEXECUTIONENDDATE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "LatestExecutionEndDate" element
     */
    public com.sap.xi.basis.global.GLOBALDateTime xgetLatestExecutionEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(LATESTEXECUTIONENDDATE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "LatestExecutionEndDate" element
     */
    public boolean isSetLatestExecutionEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LATESTEXECUTIONENDDATE$14) != 0;
        }
    }
    
    /**
     * Sets the "LatestExecutionEndDate" element
     */
    public void setLatestExecutionEndDate(java.util.Calendar latestExecutionEndDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATESTEXECUTIONENDDATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATESTEXECUTIONENDDATE$14);
            }
            target.setCalendarValue(latestExecutionEndDate);
        }
    }
    
    /**
     * Sets (as xml) the "LatestExecutionEndDate" element
     */
    public void xsetLatestExecutionEndDate(com.sap.xi.basis.global.GLOBALDateTime latestExecutionEndDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(LATESTEXECUTIONENDDATE$14, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(LATESTEXECUTIONENDDATE$14);
            }
            target.set(latestExecutionEndDate);
        }
    }
    
    /**
     * Unsets the "LatestExecutionEndDate" element
     */
    public void unsetLatestExecutionEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LATESTEXECUTIONENDDATE$14, 0);
        }
    }
}

/*
 * XML Type:  ProductionTaskManageResponseMDT
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionTaskManageResponseMDT
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionTaskManageResponseMDT(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionTaskManageResponseMDTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionTaskManageResponseMDT
{
    private static final long serialVersionUID = 1L;
    
    public ProductionTaskManageResponseMDTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTIONTASKID$0 = 
        new javax.xml.namespace.QName("", "ProductionTaskID");
    private static final javax.xml.namespace.QName PRODUCIONTASKUUID$2 = 
        new javax.xml.namespace.QName("", "ProducionTaskUUID");
    private static final javax.xml.namespace.QName OPERATIONTYPECODE$4 = 
        new javax.xml.namespace.QName("", "OperationTypeCode");
    private static final javax.xml.namespace.QName OPERATIONACTIVITYTYPECODE$6 = 
        new javax.xml.namespace.QName("", "OperationActivityTypeCode");
    private static final javax.xml.namespace.QName RESOURCEUUID$8 = 
        new javax.xml.namespace.QName("", "ResourceUUID");
    private static final javax.xml.namespace.QName PROCESSOREMPLOYEEID$10 = 
        new javax.xml.namespace.QName("", "ProcessorEmployeeID");
    private static final javax.xml.namespace.QName EXECUTIONDATETIME$12 = 
        new javax.xml.namespace.QName("", "ExecutionDateTime");
    private static final javax.xml.namespace.QName CONFIRMATIONCOMPLETEDREQUIREDINDICATOR$14 = 
        new javax.xml.namespace.QName("", "ConfirmationCompletedRequiredIndicator");
    private static final javax.xml.namespace.QName RESTARTOFTASKINDICATOR$16 = 
        new javax.xml.namespace.QName("", "RestartOfTaskIndicator");
    private static final javax.xml.namespace.QName ASSIGNRESPONSIBLEINDICATOR$18 = 
        new javax.xml.namespace.QName("", "AssignResponsibleIndicator");
    private static final javax.xml.namespace.QName PROCESSEDONDATETIME$20 = 
        new javax.xml.namespace.QName("", "ProcessedOnDateTime");
    
    
    /**
     * Gets the "ProductionTaskID" element
     */
    public com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID getProductionTaskID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID)get_store().find_element_user(PRODUCTIONTASKID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductionTaskID" element
     */
    public boolean isSetProductionTaskID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTIONTASKID$0) != 0;
        }
    }
    
    /**
     * Sets the "ProductionTaskID" element
     */
    public void setProductionTaskID(com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID productionTaskID)
    {
        generatedSetterHelperImpl(productionTaskID, PRODUCTIONTASKID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductionTaskID" element
     */
    public com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID addNewProductionTaskID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID)get_store().add_element_user(PRODUCTIONTASKID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductionTaskID" element
     */
    public void unsetProductionTaskID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTIONTASKID$0, 0);
        }
    }
    
    /**
     * Gets the "ProducionTaskUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getProducionTaskUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(PRODUCIONTASKUUID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProducionTaskUUID" element
     */
    public boolean isSetProducionTaskUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCIONTASKUUID$2) != 0;
        }
    }
    
    /**
     * Sets the "ProducionTaskUUID" element
     */
    public void setProducionTaskUUID(com.sap.xi.ap.common.gdt.UUID producionTaskUUID)
    {
        generatedSetterHelperImpl(producionTaskUUID, PRODUCIONTASKUUID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProducionTaskUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewProducionTaskUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(PRODUCIONTASKUUID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ProducionTaskUUID" element
     */
    public void unsetProducionTaskUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCIONTASKUUID$2, 0);
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
     * Gets the "OperationActivityTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.OperationActivityTypeCode getOperationActivityTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationActivityTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.OperationActivityTypeCode)get_store().find_element_user(OPERATIONACTIVITYTYPECODE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OperationActivityTypeCode" element
     */
    public boolean isSetOperationActivityTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATIONACTIVITYTYPECODE$6) != 0;
        }
    }
    
    /**
     * Sets the "OperationActivityTypeCode" element
     */
    public void setOperationActivityTypeCode(com.sap.xi.ap.common.gdt.OperationActivityTypeCode operationActivityTypeCode)
    {
        generatedSetterHelperImpl(operationActivityTypeCode, OPERATIONACTIVITYTYPECODE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OperationActivityTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.OperationActivityTypeCode addNewOperationActivityTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OperationActivityTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.OperationActivityTypeCode)get_store().add_element_user(OPERATIONACTIVITYTYPECODE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "OperationActivityTypeCode" element
     */
    public void unsetOperationActivityTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATIONACTIVITYTYPECODE$6, 0);
        }
    }
    
    /**
     * Gets the "ResourceUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getResourceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(RESOURCEUUID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ResourceUUID" element
     */
    public boolean isSetResourceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEUUID$8) != 0;
        }
    }
    
    /**
     * Sets the "ResourceUUID" element
     */
    public void setResourceUUID(com.sap.xi.ap.common.gdt.UUID resourceUUID)
    {
        generatedSetterHelperImpl(resourceUUID, RESOURCEUUID$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ResourceUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewResourceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(RESOURCEUUID$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ResourceUUID" element
     */
    public void unsetResourceUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEUUID$8, 0);
        }
    }
    
    /**
     * Gets the "ProcessorEmployeeID" element
     */
    public com.sap.xi.ap.common.gdt.EmployeeID getProcessorEmployeeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.EmployeeID target = null;
            target = (com.sap.xi.ap.common.gdt.EmployeeID)get_store().find_element_user(PROCESSOREMPLOYEEID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProcessorEmployeeID" element
     */
    public boolean isSetProcessorEmployeeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSOREMPLOYEEID$10) != 0;
        }
    }
    
    /**
     * Sets the "ProcessorEmployeeID" element
     */
    public void setProcessorEmployeeID(com.sap.xi.ap.common.gdt.EmployeeID processorEmployeeID)
    {
        generatedSetterHelperImpl(processorEmployeeID, PROCESSOREMPLOYEEID$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProcessorEmployeeID" element
     */
    public com.sap.xi.ap.common.gdt.EmployeeID addNewProcessorEmployeeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.EmployeeID target = null;
            target = (com.sap.xi.ap.common.gdt.EmployeeID)get_store().add_element_user(PROCESSOREMPLOYEEID$10);
            return target;
        }
    }
    
    /**
     * Unsets the "ProcessorEmployeeID" element
     */
    public void unsetProcessorEmployeeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSOREMPLOYEEID$10, 0);
        }
    }
    
    /**
     * Gets the "ExecutionDateTime" element
     */
    public java.util.Calendar getExecutionDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXECUTIONDATETIME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExecutionDateTime" element
     */
    public com.sap.xi.basis.global.GLOBALDateTime xgetExecutionDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(EXECUTIONDATETIME$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "ExecutionDateTime" element
     */
    public boolean isSetExecutionDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXECUTIONDATETIME$12) != 0;
        }
    }
    
    /**
     * Sets the "ExecutionDateTime" element
     */
    public void setExecutionDateTime(java.util.Calendar executionDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXECUTIONDATETIME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXECUTIONDATETIME$12);
            }
            target.setCalendarValue(executionDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "ExecutionDateTime" element
     */
    public void xsetExecutionDateTime(com.sap.xi.basis.global.GLOBALDateTime executionDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(EXECUTIONDATETIME$12, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(EXECUTIONDATETIME$12);
            }
            target.set(executionDateTime);
        }
    }
    
    /**
     * Unsets the "ExecutionDateTime" element
     */
    public void unsetExecutionDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXECUTIONDATETIME$12, 0);
        }
    }
    
    /**
     * Gets the "ConfirmationCompletedRequiredIndicator" element
     */
    public boolean getConfirmationCompletedRequiredIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONCOMPLETEDREQUIREDINDICATOR$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConfirmationCompletedRequiredIndicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetConfirmationCompletedRequiredIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CONFIRMATIONCOMPLETEDREQUIREDINDICATOR$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "ConfirmationCompletedRequiredIndicator" element
     */
    public boolean isSetConfirmationCompletedRequiredIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIRMATIONCOMPLETEDREQUIREDINDICATOR$14) != 0;
        }
    }
    
    /**
     * Sets the "ConfirmationCompletedRequiredIndicator" element
     */
    public void setConfirmationCompletedRequiredIndicator(boolean confirmationCompletedRequiredIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONCOMPLETEDREQUIREDINDICATOR$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFIRMATIONCOMPLETEDREQUIREDINDICATOR$14);
            }
            target.setBooleanValue(confirmationCompletedRequiredIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "ConfirmationCompletedRequiredIndicator" element
     */
    public void xsetConfirmationCompletedRequiredIndicator(com.sap.xi.ap.common.gdt.Indicator confirmationCompletedRequiredIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CONFIRMATIONCOMPLETEDREQUIREDINDICATOR$14, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(CONFIRMATIONCOMPLETEDREQUIREDINDICATOR$14);
            }
            target.set(confirmationCompletedRequiredIndicator);
        }
    }
    
    /**
     * Unsets the "ConfirmationCompletedRequiredIndicator" element
     */
    public void unsetConfirmationCompletedRequiredIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIRMATIONCOMPLETEDREQUIREDINDICATOR$14, 0);
        }
    }
    
    /**
     * Gets the "RestartOfTaskIndicator" element
     */
    public boolean getRestartOfTaskIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESTARTOFTASKINDICATOR$16, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "RestartOfTaskIndicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetRestartOfTaskIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(RESTARTOFTASKINDICATOR$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "RestartOfTaskIndicator" element
     */
    public boolean isSetRestartOfTaskIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESTARTOFTASKINDICATOR$16) != 0;
        }
    }
    
    /**
     * Sets the "RestartOfTaskIndicator" element
     */
    public void setRestartOfTaskIndicator(boolean restartOfTaskIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESTARTOFTASKINDICATOR$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESTARTOFTASKINDICATOR$16);
            }
            target.setBooleanValue(restartOfTaskIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "RestartOfTaskIndicator" element
     */
    public void xsetRestartOfTaskIndicator(com.sap.xi.ap.common.gdt.Indicator restartOfTaskIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(RESTARTOFTASKINDICATOR$16, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(RESTARTOFTASKINDICATOR$16);
            }
            target.set(restartOfTaskIndicator);
        }
    }
    
    /**
     * Unsets the "RestartOfTaskIndicator" element
     */
    public void unsetRestartOfTaskIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESTARTOFTASKINDICATOR$16, 0);
        }
    }
    
    /**
     * Gets the "AssignResponsibleIndicator" element
     */
    public boolean getAssignResponsibleIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNRESPONSIBLEINDICATOR$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "AssignResponsibleIndicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetAssignResponsibleIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(ASSIGNRESPONSIBLEINDICATOR$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "AssignResponsibleIndicator" element
     */
    public boolean isSetAssignResponsibleIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSIGNRESPONSIBLEINDICATOR$18) != 0;
        }
    }
    
    /**
     * Sets the "AssignResponsibleIndicator" element
     */
    public void setAssignResponsibleIndicator(boolean assignResponsibleIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNRESPONSIBLEINDICATOR$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSIGNRESPONSIBLEINDICATOR$18);
            }
            target.setBooleanValue(assignResponsibleIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "AssignResponsibleIndicator" element
     */
    public void xsetAssignResponsibleIndicator(com.sap.xi.ap.common.gdt.Indicator assignResponsibleIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(ASSIGNRESPONSIBLEINDICATOR$18, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(ASSIGNRESPONSIBLEINDICATOR$18);
            }
            target.set(assignResponsibleIndicator);
        }
    }
    
    /**
     * Unsets the "AssignResponsibleIndicator" element
     */
    public void unsetAssignResponsibleIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSIGNRESPONSIBLEINDICATOR$18, 0);
        }
    }
    
    /**
     * Gets the "ProcessedOnDateTime" element
     */
    public java.util.Calendar getProcessedOnDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSEDONDATETIME$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProcessedOnDateTime" element
     */
    public com.sap.xi.basis.global.GLOBALDateTime xgetProcessedOnDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(PROCESSEDONDATETIME$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProcessedOnDateTime" element
     */
    public boolean isSetProcessedOnDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSEDONDATETIME$20) != 0;
        }
    }
    
    /**
     * Sets the "ProcessedOnDateTime" element
     */
    public void setProcessedOnDateTime(java.util.Calendar processedOnDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESSEDONDATETIME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCESSEDONDATETIME$20);
            }
            target.setCalendarValue(processedOnDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "ProcessedOnDateTime" element
     */
    public void xsetProcessedOnDateTime(com.sap.xi.basis.global.GLOBALDateTime processedOnDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(PROCESSEDONDATETIME$20, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(PROCESSEDONDATETIME$20);
            }
            target.set(processedOnDateTime);
        }
    }
    
    /**
     * Unsets the "ProcessedOnDateTime" element
     */
    public void unsetProcessedOnDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSEDONDATETIME$20, 0);
        }
    }
}

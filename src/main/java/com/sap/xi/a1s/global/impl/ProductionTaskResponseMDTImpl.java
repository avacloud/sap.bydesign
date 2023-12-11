/*
 * XML Type:  ProductionTaskResponseMDT
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionTaskResponseMDT
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionTaskResponseMDT(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionTaskResponseMDTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionTaskResponseMDT
{
    private static final long serialVersionUID = 1L;
    
    public ProductionTaskResponseMDTImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName STATUS$10 = 
        new javax.xml.namespace.QName("", "Status");
    
    
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
     * Gets the "Status" element
     */
    public com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus target = null;
            target = (com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus)get_store().find_element_user(STATUS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$10) != 0;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Status" element
     */
    public com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus target = null;
            target = (com.sap.xi.ap.logisticsexecution.global.LogisticsTaskStatus)get_store().add_element_user(STATUS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "Status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$10, 0);
        }
    }
}

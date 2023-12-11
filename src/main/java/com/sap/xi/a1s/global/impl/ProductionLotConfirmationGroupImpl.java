/*
 * XML Type:  ProductionLotConfirmationGroup
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotConfirmationGroup
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotConfirmationGroup(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotConfirmationGroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotConfirmationGroup
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotConfirmationGroupImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFIRMATIONGROUPUUID$0 = 
        new javax.xml.namespace.QName("", "ConfirmationGroupUUID");
    private static final javax.xml.namespace.QName PROCESSOROBJECTTYPECODE$2 = 
        new javax.xml.namespace.QName("", "ProcessorObjectTypeCode");
    private static final javax.xml.namespace.QName PRODUCTIONTASK$4 = 
        new javax.xml.namespace.QName("", "ProductionTask");
    private static final javax.xml.namespace.QName OPERATION$6 = 
        new javax.xml.namespace.QName("", "Operation");
    private static final javax.xml.namespace.QName ACTIVITY$8 = 
        new javax.xml.namespace.QName("", "Activity");
    private static final javax.xml.namespace.QName MATERIALINPUT$10 = 
        new javax.xml.namespace.QName("", "MaterialInput");
    private static final javax.xml.namespace.QName MATERIALOUTPUT$12 = 
        new javax.xml.namespace.QName("", "MaterialOutput");
    private static final javax.xml.namespace.QName REPORTINGPOINT$14 = 
        new javax.xml.namespace.QName("", "ReportingPoint");
    
    
    /**
     * Gets the "ConfirmationGroupUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getConfirmationGroupUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(CONFIRMATIONGROUPUUID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ConfirmationGroupUUID" element
     */
    public boolean isSetConfirmationGroupUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIRMATIONGROUPUUID$0) != 0;
        }
    }
    
    /**
     * Sets the "ConfirmationGroupUUID" element
     */
    public void setConfirmationGroupUUID(com.sap.xi.ap.common.gdt.UUID confirmationGroupUUID)
    {
        generatedSetterHelperImpl(confirmationGroupUUID, CONFIRMATIONGROUPUUID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ConfirmationGroupUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewConfirmationGroupUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(CONFIRMATIONGROUPUUID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ConfirmationGroupUUID" element
     */
    public void unsetConfirmationGroupUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIRMATIONGROUPUUID$0, 0);
        }
    }
    
    /**
     * Gets the "ProcessorObjectTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.ObjectTypeCode getProcessorObjectTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectTypeCode)get_store().find_element_user(PROCESSOROBJECTTYPECODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProcessorObjectTypeCode" element
     */
    public boolean isSetProcessorObjectTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSOROBJECTTYPECODE$2) != 0;
        }
    }
    
    /**
     * Sets the "ProcessorObjectTypeCode" element
     */
    public void setProcessorObjectTypeCode(com.sap.xi.ap.common.gdt.ObjectTypeCode processorObjectTypeCode)
    {
        generatedSetterHelperImpl(processorObjectTypeCode, PROCESSOROBJECTTYPECODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProcessorObjectTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.ObjectTypeCode addNewProcessorObjectTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectTypeCode)get_store().add_element_user(PROCESSOROBJECTTYPECODE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ProcessorObjectTypeCode" element
     */
    public void unsetProcessorObjectTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSOROBJECTTYPECODE$2, 0);
        }
    }
    
    /**
     * Gets array of all "ProductionTask" elements
     */
    public com.sap.xi.a1s.global.ProductionTaskResponseMDT[] getProductionTaskArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTIONTASK$4, targetList);
            com.sap.xi.a1s.global.ProductionTaskResponseMDT[] result = new com.sap.xi.a1s.global.ProductionTaskResponseMDT[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProductionTask" element
     */
    public com.sap.xi.a1s.global.ProductionTaskResponseMDT getProductionTaskArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionTaskResponseMDT target = null;
            target = (com.sap.xi.a1s.global.ProductionTaskResponseMDT)get_store().find_element_user(PRODUCTIONTASK$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ProductionTask" element
     */
    public int sizeOfProductionTaskArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTIONTASK$4);
        }
    }
    
    /**
     * Sets array of all "ProductionTask" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProductionTaskArray(com.sap.xi.a1s.global.ProductionTaskResponseMDT[] productionTaskArray)
    {
        check_orphaned();
        arraySetterHelper(productionTaskArray, PRODUCTIONTASK$4);
    }
    
    /**
     * Sets ith "ProductionTask" element
     */
    public void setProductionTaskArray(int i, com.sap.xi.a1s.global.ProductionTaskResponseMDT productionTask)
    {
        generatedSetterHelperImpl(productionTask, PRODUCTIONTASK$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductionTask" element
     */
    public com.sap.xi.a1s.global.ProductionTaskResponseMDT insertNewProductionTask(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionTaskResponseMDT target = null;
            target = (com.sap.xi.a1s.global.ProductionTaskResponseMDT)get_store().insert_element_user(PRODUCTIONTASK$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductionTask" element
     */
    public com.sap.xi.a1s.global.ProductionTaskResponseMDT addNewProductionTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionTaskResponseMDT target = null;
            target = (com.sap.xi.a1s.global.ProductionTaskResponseMDT)get_store().add_element_user(PRODUCTIONTASK$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "ProductionTask" element
     */
    public void removeProductionTask(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTIONTASK$4, i);
        }
    }
    
    /**
     * Gets array of all "Operation" elements
     */
    public com.sap.xi.a1s.global.OperationResponseMDT[] getOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPERATION$6, targetList);
            com.sap.xi.a1s.global.OperationResponseMDT[] result = new com.sap.xi.a1s.global.OperationResponseMDT[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Operation" element
     */
    public com.sap.xi.a1s.global.OperationResponseMDT getOperationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.OperationResponseMDT target = null;
            target = (com.sap.xi.a1s.global.OperationResponseMDT)get_store().find_element_user(OPERATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Operation" element
     */
    public int sizeOfOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATION$6);
        }
    }
    
    /**
     * Sets array of all "Operation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOperationArray(com.sap.xi.a1s.global.OperationResponseMDT[] operationArray)
    {
        check_orphaned();
        arraySetterHelper(operationArray, OPERATION$6);
    }
    
    /**
     * Sets ith "Operation" element
     */
    public void setOperationArray(int i, com.sap.xi.a1s.global.OperationResponseMDT operation)
    {
        generatedSetterHelperImpl(operation, OPERATION$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Operation" element
     */
    public com.sap.xi.a1s.global.OperationResponseMDT insertNewOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.OperationResponseMDT target = null;
            target = (com.sap.xi.a1s.global.OperationResponseMDT)get_store().insert_element_user(OPERATION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Operation" element
     */
    public com.sap.xi.a1s.global.OperationResponseMDT addNewOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.OperationResponseMDT target = null;
            target = (com.sap.xi.a1s.global.OperationResponseMDT)get_store().add_element_user(OPERATION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "Operation" element
     */
    public void removeOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATION$6, i);
        }
    }
    
    /**
     * Gets array of all "Activity" elements
     */
    public com.sap.xi.a1s.global.ActivityResponseMDT[] getActivityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVITY$8, targetList);
            com.sap.xi.a1s.global.ActivityResponseMDT[] result = new com.sap.xi.a1s.global.ActivityResponseMDT[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Activity" element
     */
    public com.sap.xi.a1s.global.ActivityResponseMDT getActivityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ActivityResponseMDT target = null;
            target = (com.sap.xi.a1s.global.ActivityResponseMDT)get_store().find_element_user(ACTIVITY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Activity" element
     */
    public int sizeOfActivityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITY$8);
        }
    }
    
    /**
     * Sets array of all "Activity" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setActivityArray(com.sap.xi.a1s.global.ActivityResponseMDT[] activityArray)
    {
        check_orphaned();
        arraySetterHelper(activityArray, ACTIVITY$8);
    }
    
    /**
     * Sets ith "Activity" element
     */
    public void setActivityArray(int i, com.sap.xi.a1s.global.ActivityResponseMDT activity)
    {
        generatedSetterHelperImpl(activity, ACTIVITY$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Activity" element
     */
    public com.sap.xi.a1s.global.ActivityResponseMDT insertNewActivity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ActivityResponseMDT target = null;
            target = (com.sap.xi.a1s.global.ActivityResponseMDT)get_store().insert_element_user(ACTIVITY$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Activity" element
     */
    public com.sap.xi.a1s.global.ActivityResponseMDT addNewActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ActivityResponseMDT target = null;
            target = (com.sap.xi.a1s.global.ActivityResponseMDT)get_store().add_element_user(ACTIVITY$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "Activity" element
     */
    public void removeActivity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITY$8, i);
        }
    }
    
    /**
     * Gets array of all "MaterialInput" elements
     */
    public com.sap.xi.a1s.global.MaterialInputResponse[] getMaterialInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MATERIALINPUT$10, targetList);
            com.sap.xi.a1s.global.MaterialInputResponse[] result = new com.sap.xi.a1s.global.MaterialInputResponse[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MaterialInput" element
     */
    public com.sap.xi.a1s.global.MaterialInputResponse getMaterialInputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialInputResponse target = null;
            target = (com.sap.xi.a1s.global.MaterialInputResponse)get_store().find_element_user(MATERIALINPUT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MaterialInput" element
     */
    public int sizeOfMaterialInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATERIALINPUT$10);
        }
    }
    
    /**
     * Sets array of all "MaterialInput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMaterialInputArray(com.sap.xi.a1s.global.MaterialInputResponse[] materialInputArray)
    {
        check_orphaned();
        arraySetterHelper(materialInputArray, MATERIALINPUT$10);
    }
    
    /**
     * Sets ith "MaterialInput" element
     */
    public void setMaterialInputArray(int i, com.sap.xi.a1s.global.MaterialInputResponse materialInput)
    {
        generatedSetterHelperImpl(materialInput, MATERIALINPUT$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MaterialInput" element
     */
    public com.sap.xi.a1s.global.MaterialInputResponse insertNewMaterialInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialInputResponse target = null;
            target = (com.sap.xi.a1s.global.MaterialInputResponse)get_store().insert_element_user(MATERIALINPUT$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MaterialInput" element
     */
    public com.sap.xi.a1s.global.MaterialInputResponse addNewMaterialInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialInputResponse target = null;
            target = (com.sap.xi.a1s.global.MaterialInputResponse)get_store().add_element_user(MATERIALINPUT$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "MaterialInput" element
     */
    public void removeMaterialInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATERIALINPUT$10, i);
        }
    }
    
    /**
     * Gets array of all "MaterialOutput" elements
     */
    public com.sap.xi.a1s.global.MaterialOutputResponse[] getMaterialOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MATERIALOUTPUT$12, targetList);
            com.sap.xi.a1s.global.MaterialOutputResponse[] result = new com.sap.xi.a1s.global.MaterialOutputResponse[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MaterialOutput" element
     */
    public com.sap.xi.a1s.global.MaterialOutputResponse getMaterialOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialOutputResponse target = null;
            target = (com.sap.xi.a1s.global.MaterialOutputResponse)get_store().find_element_user(MATERIALOUTPUT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MaterialOutput" element
     */
    public int sizeOfMaterialOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATERIALOUTPUT$12);
        }
    }
    
    /**
     * Sets array of all "MaterialOutput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMaterialOutputArray(com.sap.xi.a1s.global.MaterialOutputResponse[] materialOutputArray)
    {
        check_orphaned();
        arraySetterHelper(materialOutputArray, MATERIALOUTPUT$12);
    }
    
    /**
     * Sets ith "MaterialOutput" element
     */
    public void setMaterialOutputArray(int i, com.sap.xi.a1s.global.MaterialOutputResponse materialOutput)
    {
        generatedSetterHelperImpl(materialOutput, MATERIALOUTPUT$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MaterialOutput" element
     */
    public com.sap.xi.a1s.global.MaterialOutputResponse insertNewMaterialOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialOutputResponse target = null;
            target = (com.sap.xi.a1s.global.MaterialOutputResponse)get_store().insert_element_user(MATERIALOUTPUT$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MaterialOutput" element
     */
    public com.sap.xi.a1s.global.MaterialOutputResponse addNewMaterialOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialOutputResponse target = null;
            target = (com.sap.xi.a1s.global.MaterialOutputResponse)get_store().add_element_user(MATERIALOUTPUT$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "MaterialOutput" element
     */
    public void removeMaterialOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATERIALOUTPUT$12, i);
        }
    }
    
    /**
     * Gets array of all "ReportingPoint" elements
     */
    public com.sap.xi.a1s.global.ProductionLotReportingPoint[] getReportingPointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORTINGPOINT$14, targetList);
            com.sap.xi.a1s.global.ProductionLotReportingPoint[] result = new com.sap.xi.a1s.global.ProductionLotReportingPoint[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ReportingPoint" element
     */
    public com.sap.xi.a1s.global.ProductionLotReportingPoint getReportingPointArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotReportingPoint target = null;
            target = (com.sap.xi.a1s.global.ProductionLotReportingPoint)get_store().find_element_user(REPORTINGPOINT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ReportingPoint" element
     */
    public int sizeOfReportingPointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGPOINT$14);
        }
    }
    
    /**
     * Sets array of all "ReportingPoint" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setReportingPointArray(com.sap.xi.a1s.global.ProductionLotReportingPoint[] reportingPointArray)
    {
        check_orphaned();
        arraySetterHelper(reportingPointArray, REPORTINGPOINT$14);
    }
    
    /**
     * Sets ith "ReportingPoint" element
     */
    public void setReportingPointArray(int i, com.sap.xi.a1s.global.ProductionLotReportingPoint reportingPoint)
    {
        generatedSetterHelperImpl(reportingPoint, REPORTINGPOINT$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingPoint" element
     */
    public com.sap.xi.a1s.global.ProductionLotReportingPoint insertNewReportingPoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotReportingPoint target = null;
            target = (com.sap.xi.a1s.global.ProductionLotReportingPoint)get_store().insert_element_user(REPORTINGPOINT$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingPoint" element
     */
    public com.sap.xi.a1s.global.ProductionLotReportingPoint addNewReportingPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotReportingPoint target = null;
            target = (com.sap.xi.a1s.global.ProductionLotReportingPoint)get_store().add_element_user(REPORTINGPOINT$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "ReportingPoint" element
     */
    public void removeReportingPoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGPOINT$14, i);
        }
    }
}

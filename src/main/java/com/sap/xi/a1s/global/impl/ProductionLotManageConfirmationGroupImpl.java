/*
 * XML Type:  ProductionLotManageConfirmationGroup
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotManageConfirmationGroup(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotManageConfirmationGroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotManageConfirmationGroupImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFIRMATIONGROUPUUID$0 = 
        new javax.xml.namespace.QName("", "ConfirmationGroupUUID");
    private static final javax.xml.namespace.QName PRODUCTIONTASK$2 = 
        new javax.xml.namespace.QName("", "ProductionTask");
    private static final javax.xml.namespace.QName ACTIVITY$4 = 
        new javax.xml.namespace.QName("", "Activity");
    private static final javax.xml.namespace.QName MATERIALINPUT$6 = 
        new javax.xml.namespace.QName("", "MaterialInput");
    private static final javax.xml.namespace.QName MATERIALOUTPUT$8 = 
        new javax.xml.namespace.QName("", "MaterialOutput");
    private static final javax.xml.namespace.QName REPORTINGPOINT$10 = 
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
     * Gets array of all "ProductionTask" elements
     */
    public com.sap.xi.a1s.global.ProductionTaskManageResponseMDT[] getProductionTaskArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTIONTASK$2, targetList);
            com.sap.xi.a1s.global.ProductionTaskManageResponseMDT[] result = new com.sap.xi.a1s.global.ProductionTaskManageResponseMDT[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ProductionTask" element
     */
    public com.sap.xi.a1s.global.ProductionTaskManageResponseMDT getProductionTaskArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionTaskManageResponseMDT target = null;
            target = (com.sap.xi.a1s.global.ProductionTaskManageResponseMDT)get_store().find_element_user(PRODUCTIONTASK$2, i);
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
            return get_store().count_elements(PRODUCTIONTASK$2);
        }
    }
    
    /**
     * Sets array of all "ProductionTask" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setProductionTaskArray(com.sap.xi.a1s.global.ProductionTaskManageResponseMDT[] productionTaskArray)
    {
        check_orphaned();
        arraySetterHelper(productionTaskArray, PRODUCTIONTASK$2);
    }
    
    /**
     * Sets ith "ProductionTask" element
     */
    public void setProductionTaskArray(int i, com.sap.xi.a1s.global.ProductionTaskManageResponseMDT productionTask)
    {
        generatedSetterHelperImpl(productionTask, PRODUCTIONTASK$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductionTask" element
     */
    public com.sap.xi.a1s.global.ProductionTaskManageResponseMDT insertNewProductionTask(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionTaskManageResponseMDT target = null;
            target = (com.sap.xi.a1s.global.ProductionTaskManageResponseMDT)get_store().insert_element_user(PRODUCTIONTASK$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductionTask" element
     */
    public com.sap.xi.a1s.global.ProductionTaskManageResponseMDT addNewProductionTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionTaskManageResponseMDT target = null;
            target = (com.sap.xi.a1s.global.ProductionTaskManageResponseMDT)get_store().add_element_user(PRODUCTIONTASK$2);
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
            get_store().remove_element(PRODUCTIONTASK$2, i);
        }
    }
    
    /**
     * Gets array of all "Activity" elements
     */
    public com.sap.xi.a1s.global.ActivityResponseManageMDT[] getActivityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVITY$4, targetList);
            com.sap.xi.a1s.global.ActivityResponseManageMDT[] result = new com.sap.xi.a1s.global.ActivityResponseManageMDT[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Activity" element
     */
    public com.sap.xi.a1s.global.ActivityResponseManageMDT getActivityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ActivityResponseManageMDT target = null;
            target = (com.sap.xi.a1s.global.ActivityResponseManageMDT)get_store().find_element_user(ACTIVITY$4, i);
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
            return get_store().count_elements(ACTIVITY$4);
        }
    }
    
    /**
     * Sets array of all "Activity" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setActivityArray(com.sap.xi.a1s.global.ActivityResponseManageMDT[] activityArray)
    {
        check_orphaned();
        arraySetterHelper(activityArray, ACTIVITY$4);
    }
    
    /**
     * Sets ith "Activity" element
     */
    public void setActivityArray(int i, com.sap.xi.a1s.global.ActivityResponseManageMDT activity)
    {
        generatedSetterHelperImpl(activity, ACTIVITY$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Activity" element
     */
    public com.sap.xi.a1s.global.ActivityResponseManageMDT insertNewActivity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ActivityResponseManageMDT target = null;
            target = (com.sap.xi.a1s.global.ActivityResponseManageMDT)get_store().insert_element_user(ACTIVITY$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Activity" element
     */
    public com.sap.xi.a1s.global.ActivityResponseManageMDT addNewActivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ActivityResponseManageMDT target = null;
            target = (com.sap.xi.a1s.global.ActivityResponseManageMDT)get_store().add_element_user(ACTIVITY$4);
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
            get_store().remove_element(ACTIVITY$4, i);
        }
    }
    
    /**
     * Gets array of all "MaterialInput" elements
     */
    public com.sap.xi.a1s.global.MaterialInputManageBundleResponse[] getMaterialInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MATERIALINPUT$6, targetList);
            com.sap.xi.a1s.global.MaterialInputManageBundleResponse[] result = new com.sap.xi.a1s.global.MaterialInputManageBundleResponse[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MaterialInput" element
     */
    public com.sap.xi.a1s.global.MaterialInputManageBundleResponse getMaterialInputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialInputManageBundleResponse target = null;
            target = (com.sap.xi.a1s.global.MaterialInputManageBundleResponse)get_store().find_element_user(MATERIALINPUT$6, i);
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
            return get_store().count_elements(MATERIALINPUT$6);
        }
    }
    
    /**
     * Sets array of all "MaterialInput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMaterialInputArray(com.sap.xi.a1s.global.MaterialInputManageBundleResponse[] materialInputArray)
    {
        check_orphaned();
        arraySetterHelper(materialInputArray, MATERIALINPUT$6);
    }
    
    /**
     * Sets ith "MaterialInput" element
     */
    public void setMaterialInputArray(int i, com.sap.xi.a1s.global.MaterialInputManageBundleResponse materialInput)
    {
        generatedSetterHelperImpl(materialInput, MATERIALINPUT$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MaterialInput" element
     */
    public com.sap.xi.a1s.global.MaterialInputManageBundleResponse insertNewMaterialInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialInputManageBundleResponse target = null;
            target = (com.sap.xi.a1s.global.MaterialInputManageBundleResponse)get_store().insert_element_user(MATERIALINPUT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MaterialInput" element
     */
    public com.sap.xi.a1s.global.MaterialInputManageBundleResponse addNewMaterialInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialInputManageBundleResponse target = null;
            target = (com.sap.xi.a1s.global.MaterialInputManageBundleResponse)get_store().add_element_user(MATERIALINPUT$6);
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
            get_store().remove_element(MATERIALINPUT$6, i);
        }
    }
    
    /**
     * Gets array of all "MaterialOutput" elements
     */
    public com.sap.xi.a1s.global.MaterialOutputManageBundleResponse[] getMaterialOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MATERIALOUTPUT$8, targetList);
            com.sap.xi.a1s.global.MaterialOutputManageBundleResponse[] result = new com.sap.xi.a1s.global.MaterialOutputManageBundleResponse[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MaterialOutput" element
     */
    public com.sap.xi.a1s.global.MaterialOutputManageBundleResponse getMaterialOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialOutputManageBundleResponse target = null;
            target = (com.sap.xi.a1s.global.MaterialOutputManageBundleResponse)get_store().find_element_user(MATERIALOUTPUT$8, i);
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
            return get_store().count_elements(MATERIALOUTPUT$8);
        }
    }
    
    /**
     * Sets array of all "MaterialOutput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMaterialOutputArray(com.sap.xi.a1s.global.MaterialOutputManageBundleResponse[] materialOutputArray)
    {
        check_orphaned();
        arraySetterHelper(materialOutputArray, MATERIALOUTPUT$8);
    }
    
    /**
     * Sets ith "MaterialOutput" element
     */
    public void setMaterialOutputArray(int i, com.sap.xi.a1s.global.MaterialOutputManageBundleResponse materialOutput)
    {
        generatedSetterHelperImpl(materialOutput, MATERIALOUTPUT$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MaterialOutput" element
     */
    public com.sap.xi.a1s.global.MaterialOutputManageBundleResponse insertNewMaterialOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialOutputManageBundleResponse target = null;
            target = (com.sap.xi.a1s.global.MaterialOutputManageBundleResponse)get_store().insert_element_user(MATERIALOUTPUT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MaterialOutput" element
     */
    public com.sap.xi.a1s.global.MaterialOutputManageBundleResponse addNewMaterialOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialOutputManageBundleResponse target = null;
            target = (com.sap.xi.a1s.global.MaterialOutputManageBundleResponse)get_store().add_element_user(MATERIALOUTPUT$8);
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
            get_store().remove_element(MATERIALOUTPUT$8, i);
        }
    }
    
    /**
     * Gets array of all "ReportingPoint" elements
     */
    public com.sap.xi.a1s.global.ProductionLotManageReportingPoint[] getReportingPointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REPORTINGPOINT$10, targetList);
            com.sap.xi.a1s.global.ProductionLotManageReportingPoint[] result = new com.sap.xi.a1s.global.ProductionLotManageReportingPoint[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ReportingPoint" element
     */
    public com.sap.xi.a1s.global.ProductionLotManageReportingPoint getReportingPointArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotManageReportingPoint target = null;
            target = (com.sap.xi.a1s.global.ProductionLotManageReportingPoint)get_store().find_element_user(REPORTINGPOINT$10, i);
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
            return get_store().count_elements(REPORTINGPOINT$10);
        }
    }
    
    /**
     * Sets array of all "ReportingPoint" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setReportingPointArray(com.sap.xi.a1s.global.ProductionLotManageReportingPoint[] reportingPointArray)
    {
        check_orphaned();
        arraySetterHelper(reportingPointArray, REPORTINGPOINT$10);
    }
    
    /**
     * Sets ith "ReportingPoint" element
     */
    public void setReportingPointArray(int i, com.sap.xi.a1s.global.ProductionLotManageReportingPoint reportingPoint)
    {
        generatedSetterHelperImpl(reportingPoint, REPORTINGPOINT$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingPoint" element
     */
    public com.sap.xi.a1s.global.ProductionLotManageReportingPoint insertNewReportingPoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotManageReportingPoint target = null;
            target = (com.sap.xi.a1s.global.ProductionLotManageReportingPoint)get_store().insert_element_user(REPORTINGPOINT$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingPoint" element
     */
    public com.sap.xi.a1s.global.ProductionLotManageReportingPoint addNewReportingPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotManageReportingPoint target = null;
            target = (com.sap.xi.a1s.global.ProductionLotManageReportingPoint)get_store().add_element_user(REPORTINGPOINT$10);
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
            get_store().remove_element(REPORTINGPOINT$10, i);
        }
    }
}

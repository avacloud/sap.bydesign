/*
 * XML Type:  SiteLogisticsLotOperationActivity
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML SiteLogisticsLotOperationActivity(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class SiteLogisticsLotOperationActivityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.SiteLogisticsLotOperationActivity
{
    private static final long serialVersionUID = 1L;
    
    public SiteLogisticsLotOperationActivityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SITELOGISTICSLOTOPERATIONACTIVITYUUID$0 = 
        new javax.xml.namespace.QName("", "SiteLogisticsLotOperationActivityUUID");
    private static final javax.xml.namespace.QName MATERIALINPUT$2 = 
        new javax.xml.namespace.QName("", "MaterialInput");
    private static final javax.xml.namespace.QName MATERIALOUTPUT$4 = 
        new javax.xml.namespace.QName("", "MaterialOutput");
    
    
    /**
     * Gets the "SiteLogisticsLotOperationActivityUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getSiteLogisticsLotOperationActivityUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(SITELOGISTICSLOTOPERATIONACTIVITYUUID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SiteLogisticsLotOperationActivityUUID" element
     */
    public boolean isSetSiteLogisticsLotOperationActivityUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITELOGISTICSLOTOPERATIONACTIVITYUUID$0) != 0;
        }
    }
    
    /**
     * Sets the "SiteLogisticsLotOperationActivityUUID" element
     */
    public void setSiteLogisticsLotOperationActivityUUID(com.sap.xi.ap.common.gdt.UUID siteLogisticsLotOperationActivityUUID)
    {
        generatedSetterHelperImpl(siteLogisticsLotOperationActivityUUID, SITELOGISTICSLOTOPERATIONACTIVITYUUID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SiteLogisticsLotOperationActivityUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewSiteLogisticsLotOperationActivityUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(SITELOGISTICSLOTOPERATIONACTIVITYUUID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "SiteLogisticsLotOperationActivityUUID" element
     */
    public void unsetSiteLogisticsLotOperationActivityUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITELOGISTICSLOTOPERATIONACTIVITYUUID$0, 0);
        }
    }
    
    /**
     * Gets array of all "MaterialInput" elements
     */
    public com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput[] getMaterialInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MATERIALINPUT$2, targetList);
            com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput[] result = new com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MaterialInput" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput getMaterialInputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput)get_store().find_element_user(MATERIALINPUT$2, i);
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
            return get_store().count_elements(MATERIALINPUT$2);
        }
    }
    
    /**
     * Sets array of all "MaterialInput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMaterialInputArray(com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput[] materialInputArray)
    {
        check_orphaned();
        arraySetterHelper(materialInputArray, MATERIALINPUT$2);
    }
    
    /**
     * Sets ith "MaterialInput" element
     */
    public void setMaterialInputArray(int i, com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput materialInput)
    {
        generatedSetterHelperImpl(materialInput, MATERIALINPUT$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MaterialInput" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput insertNewMaterialInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput)get_store().insert_element_user(MATERIALINPUT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MaterialInput" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput addNewMaterialInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput)get_store().add_element_user(MATERIALINPUT$2);
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
            get_store().remove_element(MATERIALINPUT$2, i);
        }
    }
    
    /**
     * Gets array of all "MaterialOutput" elements
     */
    public com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput[] getMaterialOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MATERIALOUTPUT$4, targetList);
            com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput[] result = new com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MaterialOutput" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput getMaterialOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput)get_store().find_element_user(MATERIALOUTPUT$4, i);
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
            return get_store().count_elements(MATERIALOUTPUT$4);
        }
    }
    
    /**
     * Sets array of all "MaterialOutput" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMaterialOutputArray(com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput[] materialOutputArray)
    {
        check_orphaned();
        arraySetterHelper(materialOutputArray, MATERIALOUTPUT$4);
    }
    
    /**
     * Sets ith "MaterialOutput" element
     */
    public void setMaterialOutputArray(int i, com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput materialOutput)
    {
        generatedSetterHelperImpl(materialOutput, MATERIALOUTPUT$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MaterialOutput" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput insertNewMaterialOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput)get_store().insert_element_user(MATERIALOUTPUT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MaterialOutput" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput addNewMaterialOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsLotMaterialOutput)get_store().add_element_user(MATERIALOUTPUT$4);
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
            get_store().remove_element(MATERIALOUTPUT$4, i);
        }
    }
}

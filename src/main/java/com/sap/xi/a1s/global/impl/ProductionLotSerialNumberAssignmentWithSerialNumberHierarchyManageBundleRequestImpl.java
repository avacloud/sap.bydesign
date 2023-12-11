/*
 * XML Type:  ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundle_Request
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundle_Request(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequest
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyManageBundleRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERIALID$0 = 
        new javax.xml.namespace.QName("", "SerialID");
    private static final javax.xml.namespace.QName SERIALNUMBERHIERARCHY$2 = 
        new javax.xml.namespace.QName("", "SerialNumberHierarchy");
    
    
    /**
     * Gets the "SerialID" element
     */
    public java.lang.String getSerialID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERIALID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SerialID" element
     */
    public com.sap.xi.ap.common.gdt.SerialID xgetSerialID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SerialID target = null;
            target = (com.sap.xi.ap.common.gdt.SerialID)get_store().find_element_user(SERIALID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "SerialID" element
     */
    public boolean isSetSerialID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERIALID$0) != 0;
        }
    }
    
    /**
     * Sets the "SerialID" element
     */
    public void setSerialID(java.lang.String serialID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERIALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERIALID$0);
            }
            target.setStringValue(serialID);
        }
    }
    
    /**
     * Sets (as xml) the "SerialID" element
     */
    public void xsetSerialID(com.sap.xi.ap.common.gdt.SerialID serialID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SerialID target = null;
            target = (com.sap.xi.ap.common.gdt.SerialID)get_store().find_element_user(SERIALID$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.SerialID)get_store().add_element_user(SERIALID$0);
            }
            target.set(serialID);
        }
    }
    
    /**
     * Unsets the "SerialID" element
     */
    public void unsetSerialID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERIALID$0, 0);
        }
    }
    
    /**
     * Gets array of all "SerialNumberHierarchy" elements
     */
    public com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchyManageBundleRequest[] getSerialNumberHierarchyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERIALNUMBERHIERARCHY$2, targetList);
            com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchyManageBundleRequest[] result = new com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchyManageBundleRequest[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SerialNumberHierarchy" element
     */
    public com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchyManageBundleRequest getSerialNumberHierarchyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchyManageBundleRequest target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchyManageBundleRequest)get_store().find_element_user(SERIALNUMBERHIERARCHY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SerialNumberHierarchy" element
     */
    public int sizeOfSerialNumberHierarchyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERIALNUMBERHIERARCHY$2);
        }
    }
    
    /**
     * Sets array of all "SerialNumberHierarchy" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSerialNumberHierarchyArray(com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchyManageBundleRequest[] serialNumberHierarchyArray)
    {
        check_orphaned();
        arraySetterHelper(serialNumberHierarchyArray, SERIALNUMBERHIERARCHY$2);
    }
    
    /**
     * Sets ith "SerialNumberHierarchy" element
     */
    public void setSerialNumberHierarchyArray(int i, com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchyManageBundleRequest serialNumberHierarchy)
    {
        generatedSetterHelperImpl(serialNumberHierarchy, SERIALNUMBERHIERARCHY$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SerialNumberHierarchy" element
     */
    public com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchyManageBundleRequest insertNewSerialNumberHierarchy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchyManageBundleRequest target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchyManageBundleRequest)get_store().insert_element_user(SERIALNUMBERHIERARCHY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SerialNumberHierarchy" element
     */
    public com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchyManageBundleRequest addNewSerialNumberHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchyManageBundleRequest target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchyManageBundleRequest)get_store().add_element_user(SERIALNUMBERHIERARCHY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "SerialNumberHierarchy" element
     */
    public void removeSerialNumberHierarchy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERIALNUMBERHIERARCHY$2, i);
        }
    }
}

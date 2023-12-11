/*
 * XML Type:  ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotSerialNumberAssignmentWithSerialNumberHierarchy
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotSerialNumberAssignmentWithSerialNumberHierarchyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERIALID$0 = 
        new javax.xml.namespace.QName("", "SerialID");
    private static final javax.xml.namespace.QName INDIVIDUALPRODUCTUUID$2 = 
        new javax.xml.namespace.QName("", "IndividualProductUUID");
    private static final javax.xml.namespace.QName SERIALNUMBERHIERARCHY$4 = 
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
     * Gets the "IndividualProductUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getIndividualProductUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(INDIVIDUALPRODUCTUUID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IndividualProductUUID" element
     */
    public boolean isSetIndividualProductUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDIVIDUALPRODUCTUUID$2) != 0;
        }
    }
    
    /**
     * Sets the "IndividualProductUUID" element
     */
    public void setIndividualProductUUID(com.sap.xi.ap.common.gdt.UUID individualProductUUID)
    {
        generatedSetterHelperImpl(individualProductUUID, INDIVIDUALPRODUCTUUID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IndividualProductUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewIndividualProductUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(INDIVIDUALPRODUCTUUID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "IndividualProductUUID" element
     */
    public void unsetIndividualProductUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDIVIDUALPRODUCTUUID$2, 0);
        }
    }
    
    /**
     * Gets array of all "SerialNumberHierarchy" elements
     */
    public com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy[] getSerialNumberHierarchyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERIALNUMBERHIERARCHY$4, targetList);
            com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy[] result = new com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SerialNumberHierarchy" element
     */
    public com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy getSerialNumberHierarchyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy)get_store().find_element_user(SERIALNUMBERHIERARCHY$4, i);
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
            return get_store().count_elements(SERIALNUMBERHIERARCHY$4);
        }
    }
    
    /**
     * Sets array of all "SerialNumberHierarchy" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSerialNumberHierarchyArray(com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy[] serialNumberHierarchyArray)
    {
        check_orphaned();
        arraySetterHelper(serialNumberHierarchyArray, SERIALNUMBERHIERARCHY$4);
    }
    
    /**
     * Sets ith "SerialNumberHierarchy" element
     */
    public void setSerialNumberHierarchyArray(int i, com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy serialNumberHierarchy)
    {
        generatedSetterHelperImpl(serialNumberHierarchy, SERIALNUMBERHIERARCHY$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SerialNumberHierarchy" element
     */
    public com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy insertNewSerialNumberHierarchy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy)get_store().insert_element_user(SERIALNUMBERHIERARCHY$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SerialNumberHierarchy" element
     */
    public com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy addNewSerialNumberHierarchy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSerialNumberHierarchy)get_store().add_element_user(SERIALNUMBERHIERARCHY$4);
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
            get_store().remove_element(SERIALNUMBERHIERARCHY$4, i);
        }
    }
}

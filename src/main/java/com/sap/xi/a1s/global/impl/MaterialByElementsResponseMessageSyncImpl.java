/*
 * XML Type:  MaterialByElementsResponseMessage_sync
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsResponseMessage_sync(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsResponseMessageSyncImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsResponseMessageSyncImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MATERIAL$0 = 
        new javax.xml.namespace.QName("", "Material");
    private static final javax.xml.namespace.QName PROCESSINGCONDITIONS$2 = 
        new javax.xml.namespace.QName("", "ProcessingConditions");
    private static final javax.xml.namespace.QName LOG$4 = 
        new javax.xml.namespace.QName("", "Log");
    
    
    /**
     * Gets array of all "Material" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync[] getMaterialArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MATERIAL$0, targetList);
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync[] result = new com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Material" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync getMaterialArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync)get_store().find_element_user(MATERIAL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Material" element
     */
    public int sizeOfMaterialArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATERIAL$0);
        }
    }
    
    /**
     * Sets array of all "Material" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMaterialArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync[] materialArray)
    {
        check_orphaned();
        arraySetterHelper(materialArray, MATERIAL$0);
    }
    
    /**
     * Sets ith "Material" element
     */
    public void setMaterialArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync material)
    {
        generatedSetterHelperImpl(material, MATERIAL$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Material" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync insertNewMaterial(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync)get_store().insert_element_user(MATERIAL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Material" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync addNewMaterial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSync)get_store().add_element_user(MATERIAL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Material" element
     */
    public void removeMaterial(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATERIAL$0, i);
        }
    }
    
    /**
     * Gets the "ProcessingConditions" element
     */
    public com.sap.xi.ap.common.gdt.ResponseProcessingConditions getProcessingConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ResponseProcessingConditions target = null;
            target = (com.sap.xi.ap.common.gdt.ResponseProcessingConditions)get_store().find_element_user(PROCESSINGCONDITIONS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProcessingConditions" element
     */
    public void setProcessingConditions(com.sap.xi.ap.common.gdt.ResponseProcessingConditions processingConditions)
    {
        generatedSetterHelperImpl(processingConditions, PROCESSINGCONDITIONS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProcessingConditions" element
     */
    public com.sap.xi.ap.common.gdt.ResponseProcessingConditions addNewProcessingConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ResponseProcessingConditions target = null;
            target = (com.sap.xi.ap.common.gdt.ResponseProcessingConditions)get_store().add_element_user(PROCESSINGCONDITIONS$2);
            return target;
        }
    }
    
    /**
     * Gets the "Log" element
     */
    public com.sap.xi.ap.common.gdt.Log getLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Log target = null;
            target = (com.sap.xi.ap.common.gdt.Log)get_store().find_element_user(LOG$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Log" element
     */
    public boolean isSetLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOG$4) != 0;
        }
    }
    
    /**
     * Sets the "Log" element
     */
    public void setLog(com.sap.xi.ap.common.gdt.Log log)
    {
        generatedSetterHelperImpl(log, LOG$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Log" element
     */
    public com.sap.xi.ap.common.gdt.Log addNewLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Log target = null;
            target = (com.sap.xi.ap.common.gdt.Log)get_store().add_element_user(LOG$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Log" element
     */
    public void unsetLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOG$4, 0);
        }
    }
}

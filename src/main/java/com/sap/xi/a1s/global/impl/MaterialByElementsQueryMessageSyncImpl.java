/*
 * XML Type:  MaterialByElementsQueryMessage_sync
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsQueryMessage_sync(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsQueryMessageSyncImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsQueryMessageSyncImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MATERIALSELECTIONBYELEMENTS$0 = 
        new javax.xml.namespace.QName("", "MaterialSelectionByElements");
    private static final javax.xml.namespace.QName PROCESSINGCONDITIONS$2 = 
        new javax.xml.namespace.QName("", "ProcessingConditions");
    private static final javax.xml.namespace.QName REQUESTEDELEMENTS$4 = 
        new javax.xml.namespace.QName("", "RequestedElements");
    
    
    /**
     * Gets the "MaterialSelectionByElements" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByElements getMaterialSelectionByElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByElements target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByElements)get_store().find_element_user(MATERIALSELECTIONBYELEMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MaterialSelectionByElements" element
     */
    public boolean isSetMaterialSelectionByElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATERIALSELECTIONBYELEMENTS$0) != 0;
        }
    }
    
    /**
     * Sets the "MaterialSelectionByElements" element
     */
    public void setMaterialSelectionByElements(com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByElements materialSelectionByElements)
    {
        generatedSetterHelperImpl(materialSelectionByElements, MATERIALSELECTIONBYELEMENTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MaterialSelectionByElements" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByElements addNewMaterialSelectionByElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByElements target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsQuerySelectionByElements)get_store().add_element_user(MATERIALSELECTIONBYELEMENTS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "MaterialSelectionByElements" element
     */
    public void unsetMaterialSelectionByElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATERIALSELECTIONBYELEMENTS$0, 0);
        }
    }
    
    /**
     * Gets the "ProcessingConditions" element
     */
    public com.sap.xi.ap.common.gdt.QueryProcessingConditions getProcessingConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.QueryProcessingConditions target = null;
            target = (com.sap.xi.ap.common.gdt.QueryProcessingConditions)get_store().find_element_user(PROCESSINGCONDITIONS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProcessingConditions" element
     */
    public boolean isSetProcessingConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCESSINGCONDITIONS$2) != 0;
        }
    }
    
    /**
     * Sets the "ProcessingConditions" element
     */
    public void setProcessingConditions(com.sap.xi.ap.common.gdt.QueryProcessingConditions processingConditions)
    {
        generatedSetterHelperImpl(processingConditions, PROCESSINGCONDITIONS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProcessingConditions" element
     */
    public com.sap.xi.ap.common.gdt.QueryProcessingConditions addNewProcessingConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.QueryProcessingConditions target = null;
            target = (com.sap.xi.ap.common.gdt.QueryProcessingConditions)get_store().add_element_user(PROCESSINGCONDITIONS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ProcessingConditions" element
     */
    public void unsetProcessingConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCESSINGCONDITIONS$2, 0);
        }
    }
    
    /**
     * Gets the "RequestedElements" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElements getRequestedElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElements target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElements)get_store().find_element_user(REQUESTEDELEMENTS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RequestedElements" element
     */
    public boolean isSetRequestedElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUESTEDELEMENTS$4) != 0;
        }
    }
    
    /**
     * Sets the "RequestedElements" element
     */
    public void setRequestedElements(com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElements requestedElements)
    {
        generatedSetterHelperImpl(requestedElements, REQUESTEDELEMENTS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RequestedElements" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElements addNewRequestedElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElements target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElements)get_store().add_element_user(REQUESTEDELEMENTS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "RequestedElements" element
     */
    public void unsetRequestedElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUESTEDELEMENTS$4, 0);
        }
    }
}

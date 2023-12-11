/*
 * XML Type:  ProductionLotByElementsQueryMessage
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotByElementsQueryMessage
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotByElementsQueryMessage(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotByElementsQueryMessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotByElementsQueryMessage
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotByElementsQueryMessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTIONLOTSELECTIONBYELEMENTS$0 = 
        new javax.xml.namespace.QName("", "ProductionLotSelectionByElements");
    private static final javax.xml.namespace.QName PROCESSINGCONDITIONS$2 = 
        new javax.xml.namespace.QName("", "ProcessingConditions");
    
    
    /**
     * Gets the "ProductionLotSelectionByElements" element
     */
    public com.sap.xi.a1s.global.ProductionLotSelectionByElements getProductionLotSelectionByElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSelectionByElements target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSelectionByElements)get_store().find_element_user(PRODUCTIONLOTSELECTIONBYELEMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductionLotSelectionByElements" element
     */
    public boolean isSetProductionLotSelectionByElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTIONLOTSELECTIONBYELEMENTS$0) != 0;
        }
    }
    
    /**
     * Sets the "ProductionLotSelectionByElements" element
     */
    public void setProductionLotSelectionByElements(com.sap.xi.a1s.global.ProductionLotSelectionByElements productionLotSelectionByElements)
    {
        generatedSetterHelperImpl(productionLotSelectionByElements, PRODUCTIONLOTSELECTIONBYELEMENTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductionLotSelectionByElements" element
     */
    public com.sap.xi.a1s.global.ProductionLotSelectionByElements addNewProductionLotSelectionByElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotSelectionByElements target = null;
            target = (com.sap.xi.a1s.global.ProductionLotSelectionByElements)get_store().add_element_user(PRODUCTIONLOTSELECTIONBYELEMENTS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductionLotSelectionByElements" element
     */
    public void unsetProductionLotSelectionByElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTIONLOTSELECTIONBYELEMENTS$0, 0);
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
}

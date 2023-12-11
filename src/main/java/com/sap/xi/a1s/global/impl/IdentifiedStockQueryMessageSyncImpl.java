/*
 * XML Type:  IdentifiedStockQueryMessage_sync
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.IdentifiedStockQueryMessageSync
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML IdentifiedStockQueryMessage_sync(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class IdentifiedStockQueryMessageSyncImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.IdentifiedStockQueryMessageSync
{
    private static final long serialVersionUID = 1L;
    
    public IdentifiedStockQueryMessageSyncImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIEDSTOCKSELECTIONBYELEMENTS$0 = 
        new javax.xml.namespace.QName("", "IdentifiedStockSelectionByElements");
    private static final javax.xml.namespace.QName PROCESSINGCONDITIONS$2 = 
        new javax.xml.namespace.QName("", "ProcessingConditions");
    
    
    /**
     * Gets the "IdentifiedStockSelectionByElements" element
     */
    public com.sap.xi.a1s.global.IdentifiedStockRequestQuery getIdentifiedStockSelectionByElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.IdentifiedStockRequestQuery target = null;
            target = (com.sap.xi.a1s.global.IdentifiedStockRequestQuery)get_store().find_element_user(IDENTIFIEDSTOCKSELECTIONBYELEMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IdentifiedStockSelectionByElements" element
     */
    public void setIdentifiedStockSelectionByElements(com.sap.xi.a1s.global.IdentifiedStockRequestQuery identifiedStockSelectionByElements)
    {
        generatedSetterHelperImpl(identifiedStockSelectionByElements, IDENTIFIEDSTOCKSELECTIONBYELEMENTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IdentifiedStockSelectionByElements" element
     */
    public com.sap.xi.a1s.global.IdentifiedStockRequestQuery addNewIdentifiedStockSelectionByElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.IdentifiedStockRequestQuery target = null;
            target = (com.sap.xi.a1s.global.IdentifiedStockRequestQuery)get_store().add_element_user(IDENTIFIEDSTOCKSELECTIONBYELEMENTS$0);
            return target;
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
}

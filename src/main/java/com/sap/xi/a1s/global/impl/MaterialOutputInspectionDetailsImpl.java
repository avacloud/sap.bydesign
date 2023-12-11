/*
 * XML Type:  MaterialOutputInspectionDetails
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialOutputInspectionDetails
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialOutputInspectionDetails(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialOutputInspectionDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialOutputInspectionDetails
{
    private static final long serialVersionUID = 1L;
    
    public MaterialOutputInspectionDetailsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSPECTIONID$0 = 
        new javax.xml.namespace.QName("", "InspectionId");
    private static final javax.xml.namespace.QName INSPECTIONTYPECODE$2 = 
        new javax.xml.namespace.QName("", "InspectionTypeCode");
    private static final javax.xml.namespace.QName LIFECYCLESTATUSCODE$4 = 
        new javax.xml.namespace.QName("", "LifeCycleStatusCode");
    private static final javax.xml.namespace.QName INSPECTIONSAMPLINGDETAILS$6 = 
        new javax.xml.namespace.QName("", "InspectionSamplingDetails");
    private static final javax.xml.namespace.QName INSPECTIONDETAILS$8 = 
        new javax.xml.namespace.QName("", "InspectionDetails");
    private static final javax.xml.namespace.QName INSPECTIONDEFECTS$10 = 
        new javax.xml.namespace.QName("", "InspectionDefects");
    
    
    /**
     * Gets the "InspectionId" element
     */
    public com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID getInspectionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID)get_store().find_element_user(INSPECTIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "InspectionId" element
     */
    public boolean isSetInspectionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSPECTIONID$0) != 0;
        }
    }
    
    /**
     * Sets the "InspectionId" element
     */
    public void setInspectionId(com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID inspectionId)
    {
        generatedSetterHelperImpl(inspectionId, INSPECTIONID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "InspectionId" element
     */
    public com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID addNewInspectionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID)get_store().add_element_user(INSPECTIONID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "InspectionId" element
     */
    public void unsetInspectionId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSPECTIONID$0, 0);
        }
    }
    
    /**
     * Gets the "InspectionTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.InspectionTypeCode getInspectionTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.InspectionTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.InspectionTypeCode)get_store().find_element_user(INSPECTIONTYPECODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "InspectionTypeCode" element
     */
    public boolean isSetInspectionTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSPECTIONTYPECODE$2) != 0;
        }
    }
    
    /**
     * Sets the "InspectionTypeCode" element
     */
    public void setInspectionTypeCode(com.sap.xi.ap.common.gdt.InspectionTypeCode inspectionTypeCode)
    {
        generatedSetterHelperImpl(inspectionTypeCode, INSPECTIONTYPECODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "InspectionTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.InspectionTypeCode addNewInspectionTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.InspectionTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.InspectionTypeCode)get_store().add_element_user(INSPECTIONTYPECODE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "InspectionTypeCode" element
     */
    public void unsetInspectionTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSPECTIONTYPECODE$2, 0);
        }
    }
    
    /**
     * Gets the "LifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.MaterialInspectionLifeCycleStatusCode.Enum getLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIFECYCLESTATUSCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.MaterialInspectionLifeCycleStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "LifeCycleStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.MaterialInspectionLifeCycleStatusCode xgetLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MaterialInspectionLifeCycleStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.MaterialInspectionLifeCycleStatusCode)get_store().find_element_user(LIFECYCLESTATUSCODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "LifeCycleStatusCode" element
     */
    public boolean isSetLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIFECYCLESTATUSCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "LifeCycleStatusCode" element
     */
    public void setLifeCycleStatusCode(com.sap.xi.ap.common.gdt.MaterialInspectionLifeCycleStatusCode.Enum lifeCycleStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIFECYCLESTATUSCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIFECYCLESTATUSCODE$4);
            }
            target.setEnumValue(lifeCycleStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "LifeCycleStatusCode" element
     */
    public void xsetLifeCycleStatusCode(com.sap.xi.ap.common.gdt.MaterialInspectionLifeCycleStatusCode lifeCycleStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MaterialInspectionLifeCycleStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.MaterialInspectionLifeCycleStatusCode)get_store().find_element_user(LIFECYCLESTATUSCODE$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.MaterialInspectionLifeCycleStatusCode)get_store().add_element_user(LIFECYCLESTATUSCODE$4);
            }
            target.set(lifeCycleStatusCode);
        }
    }
    
    /**
     * Unsets the "LifeCycleStatusCode" element
     */
    public void unsetLifeCycleStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIFECYCLESTATUSCODE$4, 0);
        }
    }
    
    /**
     * Gets the "InspectionSamplingDetails" element
     */
    public com.sap.xi.a1s.global.InspectionSamplingDetails getInspectionSamplingDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.InspectionSamplingDetails target = null;
            target = (com.sap.xi.a1s.global.InspectionSamplingDetails)get_store().find_element_user(INSPECTIONSAMPLINGDETAILS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "InspectionSamplingDetails" element
     */
    public boolean isSetInspectionSamplingDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSPECTIONSAMPLINGDETAILS$6) != 0;
        }
    }
    
    /**
     * Sets the "InspectionSamplingDetails" element
     */
    public void setInspectionSamplingDetails(com.sap.xi.a1s.global.InspectionSamplingDetails inspectionSamplingDetails)
    {
        generatedSetterHelperImpl(inspectionSamplingDetails, INSPECTIONSAMPLINGDETAILS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "InspectionSamplingDetails" element
     */
    public com.sap.xi.a1s.global.InspectionSamplingDetails addNewInspectionSamplingDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.InspectionSamplingDetails target = null;
            target = (com.sap.xi.a1s.global.InspectionSamplingDetails)get_store().add_element_user(INSPECTIONSAMPLINGDETAILS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "InspectionSamplingDetails" element
     */
    public void unsetInspectionSamplingDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSPECTIONSAMPLINGDETAILS$6, 0);
        }
    }
    
    /**
     * Gets the "InspectionDetails" element
     */
    public com.sap.xi.a1s.global.ProductionLotInspectionDetails getInspectionDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotInspectionDetails target = null;
            target = (com.sap.xi.a1s.global.ProductionLotInspectionDetails)get_store().find_element_user(INSPECTIONDETAILS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "InspectionDetails" element
     */
    public boolean isSetInspectionDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSPECTIONDETAILS$8) != 0;
        }
    }
    
    /**
     * Sets the "InspectionDetails" element
     */
    public void setInspectionDetails(com.sap.xi.a1s.global.ProductionLotInspectionDetails inspectionDetails)
    {
        generatedSetterHelperImpl(inspectionDetails, INSPECTIONDETAILS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "InspectionDetails" element
     */
    public com.sap.xi.a1s.global.ProductionLotInspectionDetails addNewInspectionDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotInspectionDetails target = null;
            target = (com.sap.xi.a1s.global.ProductionLotInspectionDetails)get_store().add_element_user(INSPECTIONDETAILS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "InspectionDetails" element
     */
    public void unsetInspectionDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSPECTIONDETAILS$8, 0);
        }
    }
    
    /**
     * Gets the "InspectionDefects" element
     */
    public com.sap.xi.a1s.global.ProductionLotDefects getInspectionDefects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotDefects target = null;
            target = (com.sap.xi.a1s.global.ProductionLotDefects)get_store().find_element_user(INSPECTIONDEFECTS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "InspectionDefects" element
     */
    public boolean isSetInspectionDefects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSPECTIONDEFECTS$10) != 0;
        }
    }
    
    /**
     * Sets the "InspectionDefects" element
     */
    public void setInspectionDefects(com.sap.xi.a1s.global.ProductionLotDefects inspectionDefects)
    {
        generatedSetterHelperImpl(inspectionDefects, INSPECTIONDEFECTS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "InspectionDefects" element
     */
    public com.sap.xi.a1s.global.ProductionLotDefects addNewInspectionDefects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotDefects target = null;
            target = (com.sap.xi.a1s.global.ProductionLotDefects)get_store().add_element_user(INSPECTIONDEFECTS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "InspectionDefects" element
     */
    public void unsetInspectionDefects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSPECTIONDEFECTS$10, 0);
        }
    }
}

/*
 * XML Type:  ProductionLotSelectByProductionRequestID
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotSelectByProductionRequestID
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotSelectByProductionRequestID(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotSelectByProductionRequestIDImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotSelectByProductionRequestID
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotSelectByProductionRequestIDImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUSIONEXCLUSIONCODE$0 = 
        new javax.xml.namespace.QName("", "InclusionExclusionCode");
    private static final javax.xml.namespace.QName INTERVALBOUNDARYTYPECODE$2 = 
        new javax.xml.namespace.QName("", "IntervalBoundaryTypeCode");
    private static final javax.xml.namespace.QName LOWERBOUNDARYPRODUCTIONREQUESTID$4 = 
        new javax.xml.namespace.QName("", "LowerBoundaryProductionRequestID");
    private static final javax.xml.namespace.QName UPPERBOUNDARYPRODUCTIONREQUESTID$6 = 
        new javax.xml.namespace.QName("", "UpperBoundaryProductionRequestID");
    
    
    /**
     * Gets the "InclusionExclusionCode" element
     */
    public java.lang.String getInclusionExclusionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUSIONEXCLUSIONCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InclusionExclusionCode" element
     */
    public com.sap.xi.ap.common.gdt.InclusionExclusionCode xgetInclusionExclusionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.InclusionExclusionCode target = null;
            target = (com.sap.xi.ap.common.gdt.InclusionExclusionCode)get_store().find_element_user(INCLUSIONEXCLUSIONCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "InclusionExclusionCode" element
     */
    public boolean isSetInclusionExclusionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCLUSIONEXCLUSIONCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "InclusionExclusionCode" element
     */
    public void setInclusionExclusionCode(java.lang.String inclusionExclusionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUSIONEXCLUSIONCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCLUSIONEXCLUSIONCODE$0);
            }
            target.setStringValue(inclusionExclusionCode);
        }
    }
    
    /**
     * Sets (as xml) the "InclusionExclusionCode" element
     */
    public void xsetInclusionExclusionCode(com.sap.xi.ap.common.gdt.InclusionExclusionCode inclusionExclusionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.InclusionExclusionCode target = null;
            target = (com.sap.xi.ap.common.gdt.InclusionExclusionCode)get_store().find_element_user(INCLUSIONEXCLUSIONCODE$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.InclusionExclusionCode)get_store().add_element_user(INCLUSIONEXCLUSIONCODE$0);
            }
            target.set(inclusionExclusionCode);
        }
    }
    
    /**
     * Unsets the "InclusionExclusionCode" element
     */
    public void unsetInclusionExclusionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCLUSIONEXCLUSIONCODE$0, 0);
        }
    }
    
    /**
     * Gets the "IntervalBoundaryTypeCode" element
     */
    public java.lang.String getIntervalBoundaryTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVALBOUNDARYTYPECODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IntervalBoundaryTypeCode" element
     */
    public com.sap.xi.ap.common.gdt.IntervalBoundaryTypeCode xgetIntervalBoundaryTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IntervalBoundaryTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.IntervalBoundaryTypeCode)get_store().find_element_user(INTERVALBOUNDARYTYPECODE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "IntervalBoundaryTypeCode" element
     */
    public boolean isSetIntervalBoundaryTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERVALBOUNDARYTYPECODE$2) != 0;
        }
    }
    
    /**
     * Sets the "IntervalBoundaryTypeCode" element
     */
    public void setIntervalBoundaryTypeCode(java.lang.String intervalBoundaryTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERVALBOUNDARYTYPECODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERVALBOUNDARYTYPECODE$2);
            }
            target.setStringValue(intervalBoundaryTypeCode);
        }
    }
    
    /**
     * Sets (as xml) the "IntervalBoundaryTypeCode" element
     */
    public void xsetIntervalBoundaryTypeCode(com.sap.xi.ap.common.gdt.IntervalBoundaryTypeCode intervalBoundaryTypeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IntervalBoundaryTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.IntervalBoundaryTypeCode)get_store().find_element_user(INTERVALBOUNDARYTYPECODE$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.IntervalBoundaryTypeCode)get_store().add_element_user(INTERVALBOUNDARYTYPECODE$2);
            }
            target.set(intervalBoundaryTypeCode);
        }
    }
    
    /**
     * Unsets the "IntervalBoundaryTypeCode" element
     */
    public void unsetIntervalBoundaryTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERVALBOUNDARYTYPECODE$2, 0);
        }
    }
    
    /**
     * Gets the "LowerBoundaryProductionRequestID" element
     */
    public com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID getLowerBoundaryProductionRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID)get_store().find_element_user(LOWERBOUNDARYPRODUCTIONREQUESTID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LowerBoundaryProductionRequestID" element
     */
    public boolean isSetLowerBoundaryProductionRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOWERBOUNDARYPRODUCTIONREQUESTID$4) != 0;
        }
    }
    
    /**
     * Sets the "LowerBoundaryProductionRequestID" element
     */
    public void setLowerBoundaryProductionRequestID(com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID lowerBoundaryProductionRequestID)
    {
        generatedSetterHelperImpl(lowerBoundaryProductionRequestID, LOWERBOUNDARYPRODUCTIONREQUESTID$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LowerBoundaryProductionRequestID" element
     */
    public com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID addNewLowerBoundaryProductionRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID)get_store().add_element_user(LOWERBOUNDARYPRODUCTIONREQUESTID$4);
            return target;
        }
    }
    
    /**
     * Unsets the "LowerBoundaryProductionRequestID" element
     */
    public void unsetLowerBoundaryProductionRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOWERBOUNDARYPRODUCTIONREQUESTID$4, 0);
        }
    }
    
    /**
     * Gets the "UpperBoundaryProductionRequestID" element
     */
    public com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID getUpperBoundaryProductionRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID)get_store().find_element_user(UPPERBOUNDARYPRODUCTIONREQUESTID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "UpperBoundaryProductionRequestID" element
     */
    public boolean isSetUpperBoundaryProductionRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPPERBOUNDARYPRODUCTIONREQUESTID$6) != 0;
        }
    }
    
    /**
     * Sets the "UpperBoundaryProductionRequestID" element
     */
    public void setUpperBoundaryProductionRequestID(com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID upperBoundaryProductionRequestID)
    {
        generatedSetterHelperImpl(upperBoundaryProductionRequestID, UPPERBOUNDARYPRODUCTIONREQUESTID$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "UpperBoundaryProductionRequestID" element
     */
    public com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID addNewUpperBoundaryProductionRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID target = null;
            target = (com.sap.xi.ap.common.gdt.BusinessTransactionDocumentID)get_store().add_element_user(UPPERBOUNDARYPRODUCTIONREQUESTID$6);
            return target;
        }
    }
    
    /**
     * Unsets the "UpperBoundaryProductionRequestID" element
     */
    public void unsetUpperBoundaryProductionRequestID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPPERBOUNDARYPRODUCTIONREQUESTID$6, 0);
        }
    }
}

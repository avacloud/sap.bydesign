/*
 * XML Type:  ProductionLotInspectionDetails
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotInspectionDetails
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotInspectionDetails(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotInspectionDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotInspectionDetails
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotInspectionDetailsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVALUATIONMODE$0 = 
        new javax.xml.namespace.QName("", "EvaluationMode");
    private static final javax.xml.namespace.QName INSPECTEDQUANTITY$2 = 
        new javax.xml.namespace.QName("", "InspectedQuantity");
    private static final javax.xml.namespace.QName DESTRUCTEDQUANTITY$4 = 
        new javax.xml.namespace.QName("", "DestructedQuantity");
    private static final javax.xml.namespace.QName NONCONFORMINGUNITS$6 = 
        new javax.xml.namespace.QName("", "NonConformingUnits");
    private static final javax.xml.namespace.QName INSPECTEDBY$8 = 
        new javax.xml.namespace.QName("", "InspectedBy");
    private static final javax.xml.namespace.QName EMPLOYEENAME$10 = 
        new javax.xml.namespace.QName("", "EmployeeName");
    private static final javax.xml.namespace.QName PROPOSEDEVALUATION$12 = 
        new javax.xml.namespace.QName("", "ProposedEvaluation");
    
    
    /**
     * Gets the "EvaluationMode" element
     */
    public java.lang.String getEvaluationMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVALUATIONMODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EvaluationMode" element
     */
    public com.sap.xi.ap.common.gdt.InspectionResultEvaluationTypeCode xgetEvaluationMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.InspectionResultEvaluationTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.InspectionResultEvaluationTypeCode)get_store().find_element_user(EVALUATIONMODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "EvaluationMode" element
     */
    public boolean isSetEvaluationMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVALUATIONMODE$0) != 0;
        }
    }
    
    /**
     * Sets the "EvaluationMode" element
     */
    public void setEvaluationMode(java.lang.String evaluationMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVALUATIONMODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVALUATIONMODE$0);
            }
            target.setStringValue(evaluationMode);
        }
    }
    
    /**
     * Sets (as xml) the "EvaluationMode" element
     */
    public void xsetEvaluationMode(com.sap.xi.ap.common.gdt.InspectionResultEvaluationTypeCode evaluationMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.InspectionResultEvaluationTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.InspectionResultEvaluationTypeCode)get_store().find_element_user(EVALUATIONMODE$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.InspectionResultEvaluationTypeCode)get_store().add_element_user(EVALUATIONMODE$0);
            }
            target.set(evaluationMode);
        }
    }
    
    /**
     * Unsets the "EvaluationMode" element
     */
    public void unsetEvaluationMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVALUATIONMODE$0, 0);
        }
    }
    
    /**
     * Gets the "InspectedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity getInspectedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity target = null;
            target = (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity)get_store().find_element_user(INSPECTEDQUANTITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "InspectedQuantity" element
     */
    public boolean isSetInspectedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSPECTEDQUANTITY$2) != 0;
        }
    }
    
    /**
     * Sets the "InspectedQuantity" element
     */
    public void setInspectedQuantity(com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity inspectedQuantity)
    {
        generatedSetterHelperImpl(inspectedQuantity, INSPECTEDQUANTITY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "InspectedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity addNewInspectedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity target = null;
            target = (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity)get_store().add_element_user(INSPECTEDQUANTITY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "InspectedQuantity" element
     */
    public void unsetInspectedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSPECTEDQUANTITY$2, 0);
        }
    }
    
    /**
     * Gets the "DestructedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity getDestructedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity target = null;
            target = (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity)get_store().find_element_user(DESTRUCTEDQUANTITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DestructedQuantity" element
     */
    public boolean isSetDestructedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESTRUCTEDQUANTITY$4) != 0;
        }
    }
    
    /**
     * Sets the "DestructedQuantity" element
     */
    public void setDestructedQuantity(com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity destructedQuantity)
    {
        generatedSetterHelperImpl(destructedQuantity, DESTRUCTEDQUANTITY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DestructedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity addNewDestructedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity target = null;
            target = (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity)get_store().add_element_user(DESTRUCTEDQUANTITY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "DestructedQuantity" element
     */
    public void unsetDestructedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESTRUCTEDQUANTITY$4, 0);
        }
    }
    
    /**
     * Gets the "NonConformingUnits" element
     */
    public int getNonConformingUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NONCONFORMINGUNITS$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NonConformingUnits" element
     */
    public com.sap.xi.ap.common.gdt.NumberValue xgetNonConformingUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NumberValue target = null;
            target = (com.sap.xi.ap.common.gdt.NumberValue)get_store().find_element_user(NONCONFORMINGUNITS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "NonConformingUnits" element
     */
    public boolean isSetNonConformingUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NONCONFORMINGUNITS$6) != 0;
        }
    }
    
    /**
     * Sets the "NonConformingUnits" element
     */
    public void setNonConformingUnits(int nonConformingUnits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NONCONFORMINGUNITS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NONCONFORMINGUNITS$6);
            }
            target.setIntValue(nonConformingUnits);
        }
    }
    
    /**
     * Sets (as xml) the "NonConformingUnits" element
     */
    public void xsetNonConformingUnits(com.sap.xi.ap.common.gdt.NumberValue nonConformingUnits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NumberValue target = null;
            target = (com.sap.xi.ap.common.gdt.NumberValue)get_store().find_element_user(NONCONFORMINGUNITS$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.NumberValue)get_store().add_element_user(NONCONFORMINGUNITS$6);
            }
            target.set(nonConformingUnits);
        }
    }
    
    /**
     * Unsets the "NonConformingUnits" element
     */
    public void unsetNonConformingUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NONCONFORMINGUNITS$6, 0);
        }
    }
    
    /**
     * Gets the "InspectedBy" element
     */
    public com.sap.xi.ap.common.gdt.EmployeeID getInspectedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.EmployeeID target = null;
            target = (com.sap.xi.ap.common.gdt.EmployeeID)get_store().find_element_user(INSPECTEDBY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "InspectedBy" element
     */
    public boolean isSetInspectedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INSPECTEDBY$8) != 0;
        }
    }
    
    /**
     * Sets the "InspectedBy" element
     */
    public void setInspectedBy(com.sap.xi.ap.common.gdt.EmployeeID inspectedBy)
    {
        generatedSetterHelperImpl(inspectedBy, INSPECTEDBY$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "InspectedBy" element
     */
    public com.sap.xi.ap.common.gdt.EmployeeID addNewInspectedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.EmployeeID target = null;
            target = (com.sap.xi.ap.common.gdt.EmployeeID)get_store().add_element_user(INSPECTEDBY$8);
            return target;
        }
    }
    
    /**
     * Unsets the "InspectedBy" element
     */
    public void unsetInspectedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INSPECTEDBY$8, 0);
        }
    }
    
    /**
     * Gets the "EmployeeName" element
     */
    public java.lang.String getEmployeeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYEENAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EmployeeName" element
     */
    public com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName xgetEmployeeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().find_element_user(EMPLOYEENAME$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "EmployeeName" element
     */
    public boolean isSetEmployeeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMPLOYEENAME$10) != 0;
        }
    }
    
    /**
     * Sets the "EmployeeName" element
     */
    public void setEmployeeName(java.lang.String employeeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMPLOYEENAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMPLOYEENAME$10);
            }
            target.setStringValue(employeeName);
        }
    }
    
    /**
     * Sets (as xml) the "EmployeeName" element
     */
    public void xsetEmployeeName(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName employeeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().find_element_user(EMPLOYEENAME$10, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().add_element_user(EMPLOYEENAME$10);
            }
            target.set(employeeName);
        }
    }
    
    /**
     * Unsets the "EmployeeName" element
     */
    public void unsetEmployeeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMPLOYEENAME$10, 0);
        }
    }
    
    /**
     * Gets the "ProposedEvaluation" element
     */
    public com.sap.xi.ap.common.gdt.AcceptanceStatusCode.Enum getProposedEvaluation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPOSEDEVALUATION$12, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.AcceptanceStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProposedEvaluation" element
     */
    public com.sap.xi.ap.common.gdt.AcceptanceStatusCode xgetProposedEvaluation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.AcceptanceStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.AcceptanceStatusCode)get_store().find_element_user(PROPOSEDEVALUATION$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProposedEvaluation" element
     */
    public boolean isSetProposedEvaluation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPOSEDEVALUATION$12) != 0;
        }
    }
    
    /**
     * Sets the "ProposedEvaluation" element
     */
    public void setProposedEvaluation(com.sap.xi.ap.common.gdt.AcceptanceStatusCode.Enum proposedEvaluation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPOSEDEVALUATION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPOSEDEVALUATION$12);
            }
            target.setEnumValue(proposedEvaluation);
        }
    }
    
    /**
     * Sets (as xml) the "ProposedEvaluation" element
     */
    public void xsetProposedEvaluation(com.sap.xi.ap.common.gdt.AcceptanceStatusCode proposedEvaluation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.AcceptanceStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.AcceptanceStatusCode)get_store().find_element_user(PROPOSEDEVALUATION$12, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.AcceptanceStatusCode)get_store().add_element_user(PROPOSEDEVALUATION$12);
            }
            target.set(proposedEvaluation);
        }
    }
    
    /**
     * Unsets the "ProposedEvaluation" element
     */
    public void unsetProposedEvaluation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPOSEDEVALUATION$12, 0);
        }
    }
}

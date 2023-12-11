/*
 * XML Type:  ProductionLotDefects
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotDefects
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotDefects(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotDefectsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotDefects
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotDefectsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFECTCODE$0 = 
        new javax.xml.namespace.QName("", "DefectCode");
    private static final javax.xml.namespace.QName DEFECTNAME$2 = 
        new javax.xml.namespace.QName("", "DefectName");
    private static final javax.xml.namespace.QName DEFECTDESCRIPTION$4 = 
        new javax.xml.namespace.QName("", "DefectDescription");
    private static final javax.xml.namespace.QName NUMBEROFDEFECTS$6 = 
        new javax.xml.namespace.QName("", "NumberOfDefects");
    private static final javax.xml.namespace.QName INTERNALDEFECTS$8 = 
        new javax.xml.namespace.QName("", "InternalDefects");
    private static final javax.xml.namespace.QName CHANGEDON$10 = 
        new javax.xml.namespace.QName("", "ChangedOn");
    private static final javax.xml.namespace.QName CHANGEDBY$12 = 
        new javax.xml.namespace.QName("", "ChangedBy");
    
    
    /**
     * Gets the "DefectCode" element
     */
    public com.sap.xi.ap.common.gdt.QualityIssueCategoryID getDefectCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.QualityIssueCategoryID target = null;
            target = (com.sap.xi.ap.common.gdt.QualityIssueCategoryID)get_store().find_element_user(DEFECTCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DefectCode" element
     */
    public boolean isSetDefectCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFECTCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "DefectCode" element
     */
    public void setDefectCode(com.sap.xi.ap.common.gdt.QualityIssueCategoryID defectCode)
    {
        generatedSetterHelperImpl(defectCode, DEFECTCODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DefectCode" element
     */
    public com.sap.xi.ap.common.gdt.QualityIssueCategoryID addNewDefectCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.QualityIssueCategoryID target = null;
            target = (com.sap.xi.ap.common.gdt.QualityIssueCategoryID)get_store().add_element_user(DEFECTCODE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "DefectCode" element
     */
    public void unsetDefectCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFECTCODE$0, 0);
        }
    }
    
    /**
     * Gets the "DefectName" element
     */
    public com.sap.xi.ap.common.gdt.MEDIUMName getDefectName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MEDIUMName target = null;
            target = (com.sap.xi.ap.common.gdt.MEDIUMName)get_store().find_element_user(DEFECTNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DefectName" element
     */
    public boolean isSetDefectName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFECTNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "DefectName" element
     */
    public void setDefectName(com.sap.xi.ap.common.gdt.MEDIUMName defectName)
    {
        generatedSetterHelperImpl(defectName, DEFECTNAME$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DefectName" element
     */
    public com.sap.xi.ap.common.gdt.MEDIUMName addNewDefectName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MEDIUMName target = null;
            target = (com.sap.xi.ap.common.gdt.MEDIUMName)get_store().add_element_user(DEFECTNAME$2);
            return target;
        }
    }
    
    /**
     * Unsets the "DefectName" element
     */
    public void unsetDefectName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFECTNAME$2, 0);
        }
    }
    
    /**
     * Gets the "DefectDescription" element
     */
    public com.sap.xi.ap.common.gdt.MEDIUMDescription getDefectDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MEDIUMDescription target = null;
            target = (com.sap.xi.ap.common.gdt.MEDIUMDescription)get_store().find_element_user(DEFECTDESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DefectDescription" element
     */
    public boolean isSetDefectDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFECTDESCRIPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "DefectDescription" element
     */
    public void setDefectDescription(com.sap.xi.ap.common.gdt.MEDIUMDescription defectDescription)
    {
        generatedSetterHelperImpl(defectDescription, DEFECTDESCRIPTION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DefectDescription" element
     */
    public com.sap.xi.ap.common.gdt.MEDIUMDescription addNewDefectDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MEDIUMDescription target = null;
            target = (com.sap.xi.ap.common.gdt.MEDIUMDescription)get_store().add_element_user(DEFECTDESCRIPTION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "DefectDescription" element
     */
    public void unsetDefectDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFECTDESCRIPTION$4, 0);
        }
    }
    
    /**
     * Gets the "NumberOfDefects" element
     */
    public int getNumberOfDefects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFDEFECTS$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberOfDefects" element
     */
    public com.sap.xi.ap.common.gdt.NumberValue xgetNumberOfDefects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NumberValue target = null;
            target = (com.sap.xi.ap.common.gdt.NumberValue)get_store().find_element_user(NUMBEROFDEFECTS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumberOfDefects" element
     */
    public boolean isSetNumberOfDefects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBEROFDEFECTS$6) != 0;
        }
    }
    
    /**
     * Sets the "NumberOfDefects" element
     */
    public void setNumberOfDefects(int numberOfDefects)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFDEFECTS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFDEFECTS$6);
            }
            target.setIntValue(numberOfDefects);
        }
    }
    
    /**
     * Sets (as xml) the "NumberOfDefects" element
     */
    public void xsetNumberOfDefects(com.sap.xi.ap.common.gdt.NumberValue numberOfDefects)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NumberValue target = null;
            target = (com.sap.xi.ap.common.gdt.NumberValue)get_store().find_element_user(NUMBEROFDEFECTS$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.NumberValue)get_store().add_element_user(NUMBEROFDEFECTS$6);
            }
            target.set(numberOfDefects);
        }
    }
    
    /**
     * Unsets the "NumberOfDefects" element
     */
    public void unsetNumberOfDefects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBEROFDEFECTS$6, 0);
        }
    }
    
    /**
     * Gets the "InternalDefects" element
     */
    public int getInternalDefects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERNALDEFECTS$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "InternalDefects" element
     */
    public com.sap.xi.ap.common.gdt.NumberValue xgetInternalDefects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NumberValue target = null;
            target = (com.sap.xi.ap.common.gdt.NumberValue)get_store().find_element_user(INTERNALDEFECTS$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "InternalDefects" element
     */
    public boolean isSetInternalDefects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERNALDEFECTS$8) != 0;
        }
    }
    
    /**
     * Sets the "InternalDefects" element
     */
    public void setInternalDefects(int internalDefects)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERNALDEFECTS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERNALDEFECTS$8);
            }
            target.setIntValue(internalDefects);
        }
    }
    
    /**
     * Sets (as xml) the "InternalDefects" element
     */
    public void xsetInternalDefects(com.sap.xi.ap.common.gdt.NumberValue internalDefects)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NumberValue target = null;
            target = (com.sap.xi.ap.common.gdt.NumberValue)get_store().find_element_user(INTERNALDEFECTS$8, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.NumberValue)get_store().add_element_user(INTERNALDEFECTS$8);
            }
            target.set(internalDefects);
        }
    }
    
    /**
     * Unsets the "InternalDefects" element
     */
    public void unsetInternalDefects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERNALDEFECTS$8, 0);
        }
    }
    
    /**
     * Gets the "ChangedOn" element
     */
    public java.util.Calendar getChangedOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEDON$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ChangedOn" element
     */
    public com.sap.xi.basis.global.GLOBALDateTime xgetChangedOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(CHANGEDON$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "ChangedOn" element
     */
    public boolean isSetChangedOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHANGEDON$10) != 0;
        }
    }
    
    /**
     * Sets the "ChangedOn" element
     */
    public void setChangedOn(java.util.Calendar changedOn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEDON$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGEDON$10);
            }
            target.setCalendarValue(changedOn);
        }
    }
    
    /**
     * Sets (as xml) the "ChangedOn" element
     */
    public void xsetChangedOn(com.sap.xi.basis.global.GLOBALDateTime changedOn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(CHANGEDON$10, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(CHANGEDON$10);
            }
            target.set(changedOn);
        }
    }
    
    /**
     * Unsets the "ChangedOn" element
     */
    public void unsetChangedOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHANGEDON$10, 0);
        }
    }
    
    /**
     * Gets the "ChangedBy" element
     */
    public java.lang.String getChangedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEDBY$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ChangedBy" element
     */
    public com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName xgetChangedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().find_element_user(CHANGEDBY$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "ChangedBy" element
     */
    public boolean isSetChangedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHANGEDBY$12) != 0;
        }
    }
    
    /**
     * Sets the "ChangedBy" element
     */
    public void setChangedBy(java.lang.String changedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGEDBY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGEDBY$12);
            }
            target.setStringValue(changedBy);
        }
    }
    
    /**
     * Sets (as xml) the "ChangedBy" element
     */
    public void xsetChangedBy(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName changedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().find_element_user(CHANGEDBY$12, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTLONGName)get_store().add_element_user(CHANGEDBY$12);
            }
            target.set(changedBy);
        }
    }
    
    /**
     * Unsets the "ChangedBy" element
     */
    public void unsetChangedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHANGEDBY$12, 0);
        }
    }
}

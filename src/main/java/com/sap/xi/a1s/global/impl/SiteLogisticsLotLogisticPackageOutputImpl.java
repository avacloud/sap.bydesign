/*
 * XML Type:  SiteLogisticsLotLogisticPackageOutput
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML SiteLogisticsLotLogisticPackageOutput(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class SiteLogisticsLotLogisticPackageOutputImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageOutput
{
    private static final long serialVersionUID = 1L;
    
    public SiteLogisticsLotLogisticPackageOutputImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOGISTICUNITUUID$0 = 
        new javax.xml.namespace.QName("", "LogisticUnitUUID");
    private static final javax.xml.namespace.QName LOGISTICUNITID$2 = 
        new javax.xml.namespace.QName("", "LogisticUnitID");
    private static final javax.xml.namespace.QName LOGISTICUNITTOTALCONFIRMEDQUANTITY$4 = 
        new javax.xml.namespace.QName("", "LogisticUnitTotalConfirmedQuantity");
    private static final javax.xml.namespace.QName LOGISTICUNITOPENQUANTITY$6 = 
        new javax.xml.namespace.QName("", "LogisticUnitOpenQuantity");
    private static final javax.xml.namespace.QName LOGISTICUNITPLANQUANTITY$8 = 
        new javax.xml.namespace.QName("", "LogisticUnitPlanQuantity");
    
    
    /**
     * Gets the "LogisticUnitUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getLogisticUnitUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(LOGISTICUNITUUID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LogisticUnitUUID" element
     */
    public boolean isSetLogisticUnitUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGISTICUNITUUID$0) != 0;
        }
    }
    
    /**
     * Sets the "LogisticUnitUUID" element
     */
    public void setLogisticUnitUUID(com.sap.xi.ap.common.gdt.UUID logisticUnitUUID)
    {
        generatedSetterHelperImpl(logisticUnitUUID, LOGISTICUNITUUID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LogisticUnitUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewLogisticUnitUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(LOGISTICUNITUUID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "LogisticUnitUUID" element
     */
    public void unsetLogisticUnitUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGISTICUNITUUID$0, 0);
        }
    }
    
    /**
     * Gets the "LogisticUnitID" element
     */
    public com.sap.xi.ap.common.gdt.LogisticUnitID getLogisticUnitID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticUnitID target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticUnitID)get_store().find_element_user(LOGISTICUNITID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LogisticUnitID" element
     */
    public boolean isSetLogisticUnitID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGISTICUNITID$2) != 0;
        }
    }
    
    /**
     * Sets the "LogisticUnitID" element
     */
    public void setLogisticUnitID(com.sap.xi.ap.common.gdt.LogisticUnitID logisticUnitID)
    {
        generatedSetterHelperImpl(logisticUnitID, LOGISTICUNITID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LogisticUnitID" element
     */
    public com.sap.xi.ap.common.gdt.LogisticUnitID addNewLogisticUnitID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticUnitID target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticUnitID)get_store().add_element_user(LOGISTICUNITID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "LogisticUnitID" element
     */
    public void unsetLogisticUnitID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGISTICUNITID$2, 0);
        }
    }
    
    /**
     * Gets the "LogisticUnitTotalConfirmedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.INTEGERQuantity getLogisticUnitTotalConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.INTEGERQuantity target = null;
            target = (com.sap.xi.ap.common.gdt.INTEGERQuantity)get_store().find_element_user(LOGISTICUNITTOTALCONFIRMEDQUANTITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LogisticUnitTotalConfirmedQuantity" element
     */
    public boolean isSetLogisticUnitTotalConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGISTICUNITTOTALCONFIRMEDQUANTITY$4) != 0;
        }
    }
    
    /**
     * Sets the "LogisticUnitTotalConfirmedQuantity" element
     */
    public void setLogisticUnitTotalConfirmedQuantity(com.sap.xi.ap.common.gdt.INTEGERQuantity logisticUnitTotalConfirmedQuantity)
    {
        generatedSetterHelperImpl(logisticUnitTotalConfirmedQuantity, LOGISTICUNITTOTALCONFIRMEDQUANTITY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LogisticUnitTotalConfirmedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.INTEGERQuantity addNewLogisticUnitTotalConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.INTEGERQuantity target = null;
            target = (com.sap.xi.ap.common.gdt.INTEGERQuantity)get_store().add_element_user(LOGISTICUNITTOTALCONFIRMEDQUANTITY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "LogisticUnitTotalConfirmedQuantity" element
     */
    public void unsetLogisticUnitTotalConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGISTICUNITTOTALCONFIRMEDQUANTITY$4, 0);
        }
    }
    
    /**
     * Gets the "LogisticUnitOpenQuantity" element
     */
    public com.sap.xi.ap.common.gdt.INTEGERQuantity getLogisticUnitOpenQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.INTEGERQuantity target = null;
            target = (com.sap.xi.ap.common.gdt.INTEGERQuantity)get_store().find_element_user(LOGISTICUNITOPENQUANTITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LogisticUnitOpenQuantity" element
     */
    public boolean isSetLogisticUnitOpenQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGISTICUNITOPENQUANTITY$6) != 0;
        }
    }
    
    /**
     * Sets the "LogisticUnitOpenQuantity" element
     */
    public void setLogisticUnitOpenQuantity(com.sap.xi.ap.common.gdt.INTEGERQuantity logisticUnitOpenQuantity)
    {
        generatedSetterHelperImpl(logisticUnitOpenQuantity, LOGISTICUNITOPENQUANTITY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LogisticUnitOpenQuantity" element
     */
    public com.sap.xi.ap.common.gdt.INTEGERQuantity addNewLogisticUnitOpenQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.INTEGERQuantity target = null;
            target = (com.sap.xi.ap.common.gdt.INTEGERQuantity)get_store().add_element_user(LOGISTICUNITOPENQUANTITY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "LogisticUnitOpenQuantity" element
     */
    public void unsetLogisticUnitOpenQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGISTICUNITOPENQUANTITY$6, 0);
        }
    }
    
    /**
     * Gets the "LogisticUnitPlanQuantity" element
     */
    public com.sap.xi.ap.common.gdt.INTEGERQuantity getLogisticUnitPlanQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.INTEGERQuantity target = null;
            target = (com.sap.xi.ap.common.gdt.INTEGERQuantity)get_store().find_element_user(LOGISTICUNITPLANQUANTITY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LogisticUnitPlanQuantity" element
     */
    public boolean isSetLogisticUnitPlanQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGISTICUNITPLANQUANTITY$8) != 0;
        }
    }
    
    /**
     * Sets the "LogisticUnitPlanQuantity" element
     */
    public void setLogisticUnitPlanQuantity(com.sap.xi.ap.common.gdt.INTEGERQuantity logisticUnitPlanQuantity)
    {
        generatedSetterHelperImpl(logisticUnitPlanQuantity, LOGISTICUNITPLANQUANTITY$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LogisticUnitPlanQuantity" element
     */
    public com.sap.xi.ap.common.gdt.INTEGERQuantity addNewLogisticUnitPlanQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.INTEGERQuantity target = null;
            target = (com.sap.xi.ap.common.gdt.INTEGERQuantity)get_store().add_element_user(LOGISTICUNITPLANQUANTITY$8);
            return target;
        }
    }
    
    /**
     * Unsets the "LogisticUnitPlanQuantity" element
     */
    public void unsetLogisticUnitPlanQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGISTICUNITPLANQUANTITY$8, 0);
        }
    }
}

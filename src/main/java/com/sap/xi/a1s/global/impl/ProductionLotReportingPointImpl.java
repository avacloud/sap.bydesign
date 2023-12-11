/*
 * XML Type:  ProductionLotReportingPoint
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotReportingPoint
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotReportingPoint(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotReportingPointImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotReportingPoint
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotReportingPointImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTINGPOINTID$0 = 
        new javax.xml.namespace.QName("", "ReportingPointID");
    private static final javax.xml.namespace.QName REPORTINGPOINTUUID$2 = 
        new javax.xml.namespace.QName("", "ReportingPointUUID");
    private static final javax.xml.namespace.QName REPORTINGPOINTSTATUS$4 = 
        new javax.xml.namespace.QName("", "ReportingPointStatus");
    private static final javax.xml.namespace.QName TOTALCONFIRMEDQUANTITY$6 = 
        new javax.xml.namespace.QName("", "TotalConfirmedQuantity");
    private static final javax.xml.namespace.QName CONFIRMEDQUANTITY$8 = 
        new javax.xml.namespace.QName("", "ConfirmedQuantity");
    private static final javax.xml.namespace.QName TOTALCONFIRMEDSCRAP$10 = 
        new javax.xml.namespace.QName("", "TotalConfirmedScrap");
    private static final javax.xml.namespace.QName CONFIRMEDSCRAP$12 = 
        new javax.xml.namespace.QName("", "ConfirmedScrap");
    private static final javax.xml.namespace.QName OPENQUANTITY$14 = 
        new javax.xml.namespace.QName("", "OpenQuantity");
    private static final javax.xml.namespace.QName DEVIATIONREASON$16 = 
        new javax.xml.namespace.QName("", "DeviationReason");
    private static final javax.xml.namespace.QName PLANNEDQUANTITY$18 = 
        new javax.xml.namespace.QName("", "PlannedQuantity");
    private static final javax.xml.namespace.QName CONFIRMATIONFINISHEDINDICATOR$20 = 
        new javax.xml.namespace.QName("", "ConfirmationFinishedIndicator");
    
    
    /**
     * Gets the "ReportingPointID" element
     */
    public java.lang.String getReportingPointID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGPOINTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReportingPointID" element
     */
    public com.sap.xi.ap.common.gdt.ReportingPointID xgetReportingPointID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ReportingPointID target = null;
            target = (com.sap.xi.ap.common.gdt.ReportingPointID)get_store().find_element_user(REPORTINGPOINTID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReportingPointID" element
     */
    public boolean isSetReportingPointID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGPOINTID$0) != 0;
        }
    }
    
    /**
     * Sets the "ReportingPointID" element
     */
    public void setReportingPointID(java.lang.String reportingPointID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGPOINTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTINGPOINTID$0);
            }
            target.setStringValue(reportingPointID);
        }
    }
    
    /**
     * Sets (as xml) the "ReportingPointID" element
     */
    public void xsetReportingPointID(com.sap.xi.ap.common.gdt.ReportingPointID reportingPointID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ReportingPointID target = null;
            target = (com.sap.xi.ap.common.gdt.ReportingPointID)get_store().find_element_user(REPORTINGPOINTID$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ReportingPointID)get_store().add_element_user(REPORTINGPOINTID$0);
            }
            target.set(reportingPointID);
        }
    }
    
    /**
     * Unsets the "ReportingPointID" element
     */
    public void unsetReportingPointID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGPOINTID$0, 0);
        }
    }
    
    /**
     * Gets the "ReportingPointUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getReportingPointUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(REPORTINGPOINTUUID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReportingPointUUID" element
     */
    public boolean isSetReportingPointUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGPOINTUUID$2) != 0;
        }
    }
    
    /**
     * Sets the "ReportingPointUUID" element
     */
    public void setReportingPointUUID(com.sap.xi.ap.common.gdt.UUID reportingPointUUID)
    {
        generatedSetterHelperImpl(reportingPointUUID, REPORTINGPOINTUUID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ReportingPointUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewReportingPointUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(REPORTINGPOINTUUID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ReportingPointUUID" element
     */
    public void unsetReportingPointUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGPOINTUUID$2, 0);
        }
    }
    
    /**
     * Gets the "ReportingPointStatus" element
     */
    public com.sap.xi.ap.logisticsexecution.global.LogisticsLotReportingPointStatus getReportingPointStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.logisticsexecution.global.LogisticsLotReportingPointStatus target = null;
            target = (com.sap.xi.ap.logisticsexecution.global.LogisticsLotReportingPointStatus)get_store().find_element_user(REPORTINGPOINTSTATUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReportingPointStatus" element
     */
    public boolean isSetReportingPointStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGPOINTSTATUS$4) != 0;
        }
    }
    
    /**
     * Sets the "ReportingPointStatus" element
     */
    public void setReportingPointStatus(com.sap.xi.ap.logisticsexecution.global.LogisticsLotReportingPointStatus reportingPointStatus)
    {
        generatedSetterHelperImpl(reportingPointStatus, REPORTINGPOINTSTATUS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ReportingPointStatus" element
     */
    public com.sap.xi.ap.logisticsexecution.global.LogisticsLotReportingPointStatus addNewReportingPointStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.logisticsexecution.global.LogisticsLotReportingPointStatus target = null;
            target = (com.sap.xi.ap.logisticsexecution.global.LogisticsLotReportingPointStatus)get_store().add_element_user(REPORTINGPOINTSTATUS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ReportingPointStatus" element
     */
    public void unsetReportingPointStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGPOINTSTATUS$4, 0);
        }
    }
    
    /**
     * Gets the "TotalConfirmedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity getTotalConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(TOTALCONFIRMEDQUANTITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TotalConfirmedQuantity" element
     */
    public boolean isSetTotalConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALCONFIRMEDQUANTITY$6) != 0;
        }
    }
    
    /**
     * Sets the "TotalConfirmedQuantity" element
     */
    public void setTotalConfirmedQuantity(com.sap.xi.ap.common.gdt.Quantity totalConfirmedQuantity)
    {
        generatedSetterHelperImpl(totalConfirmedQuantity, TOTALCONFIRMEDQUANTITY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TotalConfirmedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity addNewTotalConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(TOTALCONFIRMEDQUANTITY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "TotalConfirmedQuantity" element
     */
    public void unsetTotalConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALCONFIRMEDQUANTITY$6, 0);
        }
    }
    
    /**
     * Gets the "ConfirmedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity getConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(CONFIRMEDQUANTITY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ConfirmedQuantity" element
     */
    public boolean isSetConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIRMEDQUANTITY$8) != 0;
        }
    }
    
    /**
     * Sets the "ConfirmedQuantity" element
     */
    public void setConfirmedQuantity(com.sap.xi.ap.common.gdt.Quantity confirmedQuantity)
    {
        generatedSetterHelperImpl(confirmedQuantity, CONFIRMEDQUANTITY$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ConfirmedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity addNewConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(CONFIRMEDQUANTITY$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ConfirmedQuantity" element
     */
    public void unsetConfirmedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIRMEDQUANTITY$8, 0);
        }
    }
    
    /**
     * Gets the "TotalConfirmedScrap" element
     */
    public com.sap.xi.ap.common.gdt.Quantity getTotalConfirmedScrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(TOTALCONFIRMEDSCRAP$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TotalConfirmedScrap" element
     */
    public boolean isSetTotalConfirmedScrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALCONFIRMEDSCRAP$10) != 0;
        }
    }
    
    /**
     * Sets the "TotalConfirmedScrap" element
     */
    public void setTotalConfirmedScrap(com.sap.xi.ap.common.gdt.Quantity totalConfirmedScrap)
    {
        generatedSetterHelperImpl(totalConfirmedScrap, TOTALCONFIRMEDSCRAP$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TotalConfirmedScrap" element
     */
    public com.sap.xi.ap.common.gdt.Quantity addNewTotalConfirmedScrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(TOTALCONFIRMEDSCRAP$10);
            return target;
        }
    }
    
    /**
     * Unsets the "TotalConfirmedScrap" element
     */
    public void unsetTotalConfirmedScrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALCONFIRMEDSCRAP$10, 0);
        }
    }
    
    /**
     * Gets the "ConfirmedScrap" element
     */
    public com.sap.xi.ap.common.gdt.Quantity getConfirmedScrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(CONFIRMEDSCRAP$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ConfirmedScrap" element
     */
    public boolean isSetConfirmedScrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIRMEDSCRAP$12) != 0;
        }
    }
    
    /**
     * Sets the "ConfirmedScrap" element
     */
    public void setConfirmedScrap(com.sap.xi.ap.common.gdt.Quantity confirmedScrap)
    {
        generatedSetterHelperImpl(confirmedScrap, CONFIRMEDSCRAP$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ConfirmedScrap" element
     */
    public com.sap.xi.ap.common.gdt.Quantity addNewConfirmedScrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(CONFIRMEDSCRAP$12);
            return target;
        }
    }
    
    /**
     * Unsets the "ConfirmedScrap" element
     */
    public void unsetConfirmedScrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIRMEDSCRAP$12, 0);
        }
    }
    
    /**
     * Gets the "OpenQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity getOpenQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(OPENQUANTITY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OpenQuantity" element
     */
    public boolean isSetOpenQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPENQUANTITY$14) != 0;
        }
    }
    
    /**
     * Sets the "OpenQuantity" element
     */
    public void setOpenQuantity(com.sap.xi.ap.common.gdt.Quantity openQuantity)
    {
        generatedSetterHelperImpl(openQuantity, OPENQUANTITY$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OpenQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity addNewOpenQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(OPENQUANTITY$14);
            return target;
        }
    }
    
    /**
     * Unsets the "OpenQuantity" element
     */
    public void unsetOpenQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPENQUANTITY$14, 0);
        }
    }
    
    /**
     * Gets the "DeviationReason" element
     */
    public com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode getDeviationReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode)get_store().find_element_user(DEVIATIONREASON$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DeviationReason" element
     */
    public boolean isSetDeviationReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEVIATIONREASON$16) != 0;
        }
    }
    
    /**
     * Sets the "DeviationReason" element
     */
    public void setDeviationReason(com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode deviationReason)
    {
        generatedSetterHelperImpl(deviationReason, DEVIATIONREASON$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DeviationReason" element
     */
    public com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode addNewDeviationReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode)get_store().add_element_user(DEVIATIONREASON$16);
            return target;
        }
    }
    
    /**
     * Unsets the "DeviationReason" element
     */
    public void unsetDeviationReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEVIATIONREASON$16, 0);
        }
    }
    
    /**
     * Gets the "PlannedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity getPlannedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(PLANNEDQUANTITY$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PlannedQuantity" element
     */
    public boolean isSetPlannedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLANNEDQUANTITY$18) != 0;
        }
    }
    
    /**
     * Sets the "PlannedQuantity" element
     */
    public void setPlannedQuantity(com.sap.xi.ap.common.gdt.Quantity plannedQuantity)
    {
        generatedSetterHelperImpl(plannedQuantity, PLANNEDQUANTITY$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PlannedQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity addNewPlannedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(PLANNEDQUANTITY$18);
            return target;
        }
    }
    
    /**
     * Unsets the "PlannedQuantity" element
     */
    public void unsetPlannedQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLANNEDQUANTITY$18, 0);
        }
    }
    
    /**
     * Gets the "ConfirmationFinishedIndicator" element
     */
    public boolean getConfirmationFinishedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONFINISHEDINDICATOR$20, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConfirmationFinishedIndicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetConfirmationFinishedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CONFIRMATIONFINISHEDINDICATOR$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "ConfirmationFinishedIndicator" element
     */
    public boolean isSetConfirmationFinishedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIRMATIONFINISHEDINDICATOR$20) != 0;
        }
    }
    
    /**
     * Sets the "ConfirmationFinishedIndicator" element
     */
    public void setConfirmationFinishedIndicator(boolean confirmationFinishedIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIRMATIONFINISHEDINDICATOR$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFIRMATIONFINISHEDINDICATOR$20);
            }
            target.setBooleanValue(confirmationFinishedIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "ConfirmationFinishedIndicator" element
     */
    public void xsetConfirmationFinishedIndicator(com.sap.xi.ap.common.gdt.Indicator confirmationFinishedIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(CONFIRMATIONFINISHEDINDICATOR$20, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(CONFIRMATIONFINISHEDINDICATOR$20);
            }
            target.set(confirmationFinishedIndicator);
        }
    }
    
    /**
     * Unsets the "ConfirmationFinishedIndicator" element
     */
    public void unsetConfirmationFinishedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIRMATIONFINISHEDINDICATOR$20, 0);
        }
    }
}

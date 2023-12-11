/*
 * XML Type:  MaterialByElementsQueryRequestedElementsMaterial
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElementsMaterial
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsQueryRequestedElementsMaterial(@http://sap.com/xi/A1S/Global).
 *
 * This is an atomic type that is a restriction of com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElementsMaterial.
 */
public class MaterialByElementsQueryRequestedElementsMaterialImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sap.xi.a1s.global.MaterialByElementsQueryRequestedElementsMaterial
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsQueryRequestedElementsMaterialImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected MaterialByElementsQueryRequestedElementsMaterialImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTIONTRANSMISSIONREQUESTCODE$0 = 
        new javax.xml.namespace.QName("", "descriptionTransmissionRequestCode");
    private static final javax.xml.namespace.QName DETAILTRANSMISSIONREQUESTCODE$2 = 
        new javax.xml.namespace.QName("", "detailTransmissionRequestCode");
    private static final javax.xml.namespace.QName QUANTITYCONVERSIONTRANSMISSIONREQUESTCODE$4 = 
        new javax.xml.namespace.QName("", "quantityConversionTransmissionRequestCode");
    private static final javax.xml.namespace.QName QUANTITYCHARACTERISTICTRANSMISSIONREQUESTCODE$6 = 
        new javax.xml.namespace.QName("", "quantityCharacteristicTransmissionRequestCode");
    private static final javax.xml.namespace.QName GLOBALTRADEITEMNUMBERTRANSMISSIONREQUESTCODE$8 = 
        new javax.xml.namespace.QName("", "globalTradeItemNumberTransmissionRequestCode");
    private static final javax.xml.namespace.QName PLANNINGTRANSMISSIONREQUESTCODE$10 = 
        new javax.xml.namespace.QName("", "planningTransmissionRequestCode");
    private static final javax.xml.namespace.QName PURCHASINGTRANSMISSIONREQUESTCODE$12 = 
        new javax.xml.namespace.QName("", "purchasingTransmissionRequestCode");
    private static final javax.xml.namespace.QName AVAILABILITYCONFIRMATIONTRANSMISSIONREQUESTCODE$14 = 
        new javax.xml.namespace.QName("", "availabilityConfirmationTransmissionRequestCode");
    private static final javax.xml.namespace.QName SALESTRANSMISSIONREQUESTCODE$16 = 
        new javax.xml.namespace.QName("", "salesTransmissionRequestCode");
    private static final javax.xml.namespace.QName LOGISTICSTRANSMISSIONREQUESTCODE$18 = 
        new javax.xml.namespace.QName("", "logisticsTransmissionRequestCode");
    private static final javax.xml.namespace.QName DEVIANTTAXCLASSIFICATIONTRANSMISSIONREQUESTCODE$20 = 
        new javax.xml.namespace.QName("", "deviantTaxClassificationTransmissionRequestCode");
    private static final javax.xml.namespace.QName WITHHOLDINGTAXCLASSIFICATIONTRANSMISSIONREQUESTCODE$22 = 
        new javax.xml.namespace.QName("", "withholdingTaxClassificationTransmissionRequestCode");
    private static final javax.xml.namespace.QName VALUATIONTRANSMISSIONREQUESTCODE$24 = 
        new javax.xml.namespace.QName("", "valuationTransmissionRequestCode");
    private static final javax.xml.namespace.QName CUSTOMERPARTNUMBERTRANSMISSIONREQUESTCODE$26 = 
        new javax.xml.namespace.QName("", "customerPartNumberTransmissionRequestCode");
    private static final javax.xml.namespace.QName SUPPLIERPARTNUMBERTRANSMISSIONREQUESTCODE$28 = 
        new javax.xml.namespace.QName("", "supplierPartNumberTransmissionRequestCode");
    private static final javax.xml.namespace.QName ATTACHMENTFOLDERTRANSMISSIONREQUESTCODE$30 = 
        new javax.xml.namespace.QName("", "attachmentFolderTransmissionRequestCode");
    
    
    /**
     * Gets the "descriptionTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum getDescriptionTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTIONTRANSMISSIONREQUESTCODE$0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "descriptionTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode xgetDescriptionTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(DESCRIPTIONTRANSMISSIONREQUESTCODE$0);
            return target;
        }
    }
    
    /**
     * True if has "descriptionTransmissionRequestCode" attribute
     */
    public boolean isSetDescriptionTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DESCRIPTIONTRANSMISSIONREQUESTCODE$0) != null;
        }
    }
    
    /**
     * Sets the "descriptionTransmissionRequestCode" attribute
     */
    public void setDescriptionTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum descriptionTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTIONTRANSMISSIONREQUESTCODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTIONTRANSMISSIONREQUESTCODE$0);
            }
            target.setEnumValue(descriptionTransmissionRequestCode);
        }
    }
    
    /**
     * Sets (as xml) the "descriptionTransmissionRequestCode" attribute
     */
    public void xsetDescriptionTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode descriptionTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(DESCRIPTIONTRANSMISSIONREQUESTCODE$0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().add_attribute_user(DESCRIPTIONTRANSMISSIONREQUESTCODE$0);
            }
            target.set(descriptionTransmissionRequestCode);
        }
    }
    
    /**
     * Unsets the "descriptionTransmissionRequestCode" attribute
     */
    public void unsetDescriptionTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DESCRIPTIONTRANSMISSIONREQUESTCODE$0);
        }
    }
    
    /**
     * Gets the "detailTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum getDetailTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETAILTRANSMISSIONREQUESTCODE$2);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "detailTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode xgetDetailTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(DETAILTRANSMISSIONREQUESTCODE$2);
            return target;
        }
    }
    
    /**
     * True if has "detailTransmissionRequestCode" attribute
     */
    public boolean isSetDetailTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DETAILTRANSMISSIONREQUESTCODE$2) != null;
        }
    }
    
    /**
     * Sets the "detailTransmissionRequestCode" attribute
     */
    public void setDetailTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum detailTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETAILTRANSMISSIONREQUESTCODE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DETAILTRANSMISSIONREQUESTCODE$2);
            }
            target.setEnumValue(detailTransmissionRequestCode);
        }
    }
    
    /**
     * Sets (as xml) the "detailTransmissionRequestCode" attribute
     */
    public void xsetDetailTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode detailTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(DETAILTRANSMISSIONREQUESTCODE$2);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().add_attribute_user(DETAILTRANSMISSIONREQUESTCODE$2);
            }
            target.set(detailTransmissionRequestCode);
        }
    }
    
    /**
     * Unsets the "detailTransmissionRequestCode" attribute
     */
    public void unsetDetailTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DETAILTRANSMISSIONREQUESTCODE$2);
        }
    }
    
    /**
     * Gets the "quantityConversionTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum getQuantityConversionTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUANTITYCONVERSIONTRANSMISSIONREQUESTCODE$4);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "quantityConversionTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode xgetQuantityConversionTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(QUANTITYCONVERSIONTRANSMISSIONREQUESTCODE$4);
            return target;
        }
    }
    
    /**
     * True if has "quantityConversionTransmissionRequestCode" attribute
     */
    public boolean isSetQuantityConversionTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(QUANTITYCONVERSIONTRANSMISSIONREQUESTCODE$4) != null;
        }
    }
    
    /**
     * Sets the "quantityConversionTransmissionRequestCode" attribute
     */
    public void setQuantityConversionTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum quantityConversionTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUANTITYCONVERSIONTRANSMISSIONREQUESTCODE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUANTITYCONVERSIONTRANSMISSIONREQUESTCODE$4);
            }
            target.setEnumValue(quantityConversionTransmissionRequestCode);
        }
    }
    
    /**
     * Sets (as xml) the "quantityConversionTransmissionRequestCode" attribute
     */
    public void xsetQuantityConversionTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode quantityConversionTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(QUANTITYCONVERSIONTRANSMISSIONREQUESTCODE$4);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().add_attribute_user(QUANTITYCONVERSIONTRANSMISSIONREQUESTCODE$4);
            }
            target.set(quantityConversionTransmissionRequestCode);
        }
    }
    
    /**
     * Unsets the "quantityConversionTransmissionRequestCode" attribute
     */
    public void unsetQuantityConversionTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(QUANTITYCONVERSIONTRANSMISSIONREQUESTCODE$4);
        }
    }
    
    /**
     * Gets the "quantityCharacteristicTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum getQuantityCharacteristicTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUANTITYCHARACTERISTICTRANSMISSIONREQUESTCODE$6);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "quantityCharacteristicTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode xgetQuantityCharacteristicTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(QUANTITYCHARACTERISTICTRANSMISSIONREQUESTCODE$6);
            return target;
        }
    }
    
    /**
     * True if has "quantityCharacteristicTransmissionRequestCode" attribute
     */
    public boolean isSetQuantityCharacteristicTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(QUANTITYCHARACTERISTICTRANSMISSIONREQUESTCODE$6) != null;
        }
    }
    
    /**
     * Sets the "quantityCharacteristicTransmissionRequestCode" attribute
     */
    public void setQuantityCharacteristicTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum quantityCharacteristicTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUANTITYCHARACTERISTICTRANSMISSIONREQUESTCODE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUANTITYCHARACTERISTICTRANSMISSIONREQUESTCODE$6);
            }
            target.setEnumValue(quantityCharacteristicTransmissionRequestCode);
        }
    }
    
    /**
     * Sets (as xml) the "quantityCharacteristicTransmissionRequestCode" attribute
     */
    public void xsetQuantityCharacteristicTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode quantityCharacteristicTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(QUANTITYCHARACTERISTICTRANSMISSIONREQUESTCODE$6);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().add_attribute_user(QUANTITYCHARACTERISTICTRANSMISSIONREQUESTCODE$6);
            }
            target.set(quantityCharacteristicTransmissionRequestCode);
        }
    }
    
    /**
     * Unsets the "quantityCharacteristicTransmissionRequestCode" attribute
     */
    public void unsetQuantityCharacteristicTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(QUANTITYCHARACTERISTICTRANSMISSIONREQUESTCODE$6);
        }
    }
    
    /**
     * Gets the "globalTradeItemNumberTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum getGlobalTradeItemNumberTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GLOBALTRADEITEMNUMBERTRANSMISSIONREQUESTCODE$8);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "globalTradeItemNumberTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode xgetGlobalTradeItemNumberTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(GLOBALTRADEITEMNUMBERTRANSMISSIONREQUESTCODE$8);
            return target;
        }
    }
    
    /**
     * True if has "globalTradeItemNumberTransmissionRequestCode" attribute
     */
    public boolean isSetGlobalTradeItemNumberTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GLOBALTRADEITEMNUMBERTRANSMISSIONREQUESTCODE$8) != null;
        }
    }
    
    /**
     * Sets the "globalTradeItemNumberTransmissionRequestCode" attribute
     */
    public void setGlobalTradeItemNumberTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum globalTradeItemNumberTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GLOBALTRADEITEMNUMBERTRANSMISSIONREQUESTCODE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GLOBALTRADEITEMNUMBERTRANSMISSIONREQUESTCODE$8);
            }
            target.setEnumValue(globalTradeItemNumberTransmissionRequestCode);
        }
    }
    
    /**
     * Sets (as xml) the "globalTradeItemNumberTransmissionRequestCode" attribute
     */
    public void xsetGlobalTradeItemNumberTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode globalTradeItemNumberTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(GLOBALTRADEITEMNUMBERTRANSMISSIONREQUESTCODE$8);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().add_attribute_user(GLOBALTRADEITEMNUMBERTRANSMISSIONREQUESTCODE$8);
            }
            target.set(globalTradeItemNumberTransmissionRequestCode);
        }
    }
    
    /**
     * Unsets the "globalTradeItemNumberTransmissionRequestCode" attribute
     */
    public void unsetGlobalTradeItemNumberTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GLOBALTRADEITEMNUMBERTRANSMISSIONREQUESTCODE$8);
        }
    }
    
    /**
     * Gets the "planningTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum getPlanningTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLANNINGTRANSMISSIONREQUESTCODE$10);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "planningTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode xgetPlanningTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(PLANNINGTRANSMISSIONREQUESTCODE$10);
            return target;
        }
    }
    
    /**
     * True if has "planningTransmissionRequestCode" attribute
     */
    public boolean isSetPlanningTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PLANNINGTRANSMISSIONREQUESTCODE$10) != null;
        }
    }
    
    /**
     * Sets the "planningTransmissionRequestCode" attribute
     */
    public void setPlanningTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum planningTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PLANNINGTRANSMISSIONREQUESTCODE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PLANNINGTRANSMISSIONREQUESTCODE$10);
            }
            target.setEnumValue(planningTransmissionRequestCode);
        }
    }
    
    /**
     * Sets (as xml) the "planningTransmissionRequestCode" attribute
     */
    public void xsetPlanningTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode planningTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(PLANNINGTRANSMISSIONREQUESTCODE$10);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().add_attribute_user(PLANNINGTRANSMISSIONREQUESTCODE$10);
            }
            target.set(planningTransmissionRequestCode);
        }
    }
    
    /**
     * Unsets the "planningTransmissionRequestCode" attribute
     */
    public void unsetPlanningTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PLANNINGTRANSMISSIONREQUESTCODE$10);
        }
    }
    
    /**
     * Gets the "purchasingTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum getPurchasingTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PURCHASINGTRANSMISSIONREQUESTCODE$12);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "purchasingTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode xgetPurchasingTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(PURCHASINGTRANSMISSIONREQUESTCODE$12);
            return target;
        }
    }
    
    /**
     * True if has "purchasingTransmissionRequestCode" attribute
     */
    public boolean isSetPurchasingTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PURCHASINGTRANSMISSIONREQUESTCODE$12) != null;
        }
    }
    
    /**
     * Sets the "purchasingTransmissionRequestCode" attribute
     */
    public void setPurchasingTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum purchasingTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PURCHASINGTRANSMISSIONREQUESTCODE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PURCHASINGTRANSMISSIONREQUESTCODE$12);
            }
            target.setEnumValue(purchasingTransmissionRequestCode);
        }
    }
    
    /**
     * Sets (as xml) the "purchasingTransmissionRequestCode" attribute
     */
    public void xsetPurchasingTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode purchasingTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(PURCHASINGTRANSMISSIONREQUESTCODE$12);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().add_attribute_user(PURCHASINGTRANSMISSIONREQUESTCODE$12);
            }
            target.set(purchasingTransmissionRequestCode);
        }
    }
    
    /**
     * Unsets the "purchasingTransmissionRequestCode" attribute
     */
    public void unsetPurchasingTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PURCHASINGTRANSMISSIONREQUESTCODE$12);
        }
    }
    
    /**
     * Gets the "availabilityConfirmationTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum getAvailabilityConfirmationTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AVAILABILITYCONFIRMATIONTRANSMISSIONREQUESTCODE$14);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "availabilityConfirmationTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode xgetAvailabilityConfirmationTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(AVAILABILITYCONFIRMATIONTRANSMISSIONREQUESTCODE$14);
            return target;
        }
    }
    
    /**
     * True if has "availabilityConfirmationTransmissionRequestCode" attribute
     */
    public boolean isSetAvailabilityConfirmationTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AVAILABILITYCONFIRMATIONTRANSMISSIONREQUESTCODE$14) != null;
        }
    }
    
    /**
     * Sets the "availabilityConfirmationTransmissionRequestCode" attribute
     */
    public void setAvailabilityConfirmationTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum availabilityConfirmationTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AVAILABILITYCONFIRMATIONTRANSMISSIONREQUESTCODE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AVAILABILITYCONFIRMATIONTRANSMISSIONREQUESTCODE$14);
            }
            target.setEnumValue(availabilityConfirmationTransmissionRequestCode);
        }
    }
    
    /**
     * Sets (as xml) the "availabilityConfirmationTransmissionRequestCode" attribute
     */
    public void xsetAvailabilityConfirmationTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode availabilityConfirmationTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(AVAILABILITYCONFIRMATIONTRANSMISSIONREQUESTCODE$14);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().add_attribute_user(AVAILABILITYCONFIRMATIONTRANSMISSIONREQUESTCODE$14);
            }
            target.set(availabilityConfirmationTransmissionRequestCode);
        }
    }
    
    /**
     * Unsets the "availabilityConfirmationTransmissionRequestCode" attribute
     */
    public void unsetAvailabilityConfirmationTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AVAILABILITYCONFIRMATIONTRANSMISSIONREQUESTCODE$14);
        }
    }
    
    /**
     * Gets the "salesTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum getSalesTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SALESTRANSMISSIONREQUESTCODE$16);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "salesTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode xgetSalesTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(SALESTRANSMISSIONREQUESTCODE$16);
            return target;
        }
    }
    
    /**
     * True if has "salesTransmissionRequestCode" attribute
     */
    public boolean isSetSalesTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SALESTRANSMISSIONREQUESTCODE$16) != null;
        }
    }
    
    /**
     * Sets the "salesTransmissionRequestCode" attribute
     */
    public void setSalesTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum salesTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SALESTRANSMISSIONREQUESTCODE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SALESTRANSMISSIONREQUESTCODE$16);
            }
            target.setEnumValue(salesTransmissionRequestCode);
        }
    }
    
    /**
     * Sets (as xml) the "salesTransmissionRequestCode" attribute
     */
    public void xsetSalesTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode salesTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(SALESTRANSMISSIONREQUESTCODE$16);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().add_attribute_user(SALESTRANSMISSIONREQUESTCODE$16);
            }
            target.set(salesTransmissionRequestCode);
        }
    }
    
    /**
     * Unsets the "salesTransmissionRequestCode" attribute
     */
    public void unsetSalesTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SALESTRANSMISSIONREQUESTCODE$16);
        }
    }
    
    /**
     * Gets the "logisticsTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum getLogisticsTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOGISTICSTRANSMISSIONREQUESTCODE$18);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "logisticsTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode xgetLogisticsTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(LOGISTICSTRANSMISSIONREQUESTCODE$18);
            return target;
        }
    }
    
    /**
     * True if has "logisticsTransmissionRequestCode" attribute
     */
    public boolean isSetLogisticsTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOGISTICSTRANSMISSIONREQUESTCODE$18) != null;
        }
    }
    
    /**
     * Sets the "logisticsTransmissionRequestCode" attribute
     */
    public void setLogisticsTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum logisticsTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOGISTICSTRANSMISSIONREQUESTCODE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOGISTICSTRANSMISSIONREQUESTCODE$18);
            }
            target.setEnumValue(logisticsTransmissionRequestCode);
        }
    }
    
    /**
     * Sets (as xml) the "logisticsTransmissionRequestCode" attribute
     */
    public void xsetLogisticsTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode logisticsTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(LOGISTICSTRANSMISSIONREQUESTCODE$18);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().add_attribute_user(LOGISTICSTRANSMISSIONREQUESTCODE$18);
            }
            target.set(logisticsTransmissionRequestCode);
        }
    }
    
    /**
     * Unsets the "logisticsTransmissionRequestCode" attribute
     */
    public void unsetLogisticsTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOGISTICSTRANSMISSIONREQUESTCODE$18);
        }
    }
    
    /**
     * Gets the "deviantTaxClassificationTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum getDeviantTaxClassificationTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEVIANTTAXCLASSIFICATIONTRANSMISSIONREQUESTCODE$20);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "deviantTaxClassificationTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode xgetDeviantTaxClassificationTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(DEVIANTTAXCLASSIFICATIONTRANSMISSIONREQUESTCODE$20);
            return target;
        }
    }
    
    /**
     * True if has "deviantTaxClassificationTransmissionRequestCode" attribute
     */
    public boolean isSetDeviantTaxClassificationTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEVIANTTAXCLASSIFICATIONTRANSMISSIONREQUESTCODE$20) != null;
        }
    }
    
    /**
     * Sets the "deviantTaxClassificationTransmissionRequestCode" attribute
     */
    public void setDeviantTaxClassificationTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum deviantTaxClassificationTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEVIANTTAXCLASSIFICATIONTRANSMISSIONREQUESTCODE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEVIANTTAXCLASSIFICATIONTRANSMISSIONREQUESTCODE$20);
            }
            target.setEnumValue(deviantTaxClassificationTransmissionRequestCode);
        }
    }
    
    /**
     * Sets (as xml) the "deviantTaxClassificationTransmissionRequestCode" attribute
     */
    public void xsetDeviantTaxClassificationTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode deviantTaxClassificationTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(DEVIANTTAXCLASSIFICATIONTRANSMISSIONREQUESTCODE$20);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().add_attribute_user(DEVIANTTAXCLASSIFICATIONTRANSMISSIONREQUESTCODE$20);
            }
            target.set(deviantTaxClassificationTransmissionRequestCode);
        }
    }
    
    /**
     * Unsets the "deviantTaxClassificationTransmissionRequestCode" attribute
     */
    public void unsetDeviantTaxClassificationTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEVIANTTAXCLASSIFICATIONTRANSMISSIONREQUESTCODE$20);
        }
    }
    
    /**
     * Gets the "withholdingTaxClassificationTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum getWithholdingTaxClassificationTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WITHHOLDINGTAXCLASSIFICATIONTRANSMISSIONREQUESTCODE$22);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "withholdingTaxClassificationTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode xgetWithholdingTaxClassificationTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(WITHHOLDINGTAXCLASSIFICATIONTRANSMISSIONREQUESTCODE$22);
            return target;
        }
    }
    
    /**
     * True if has "withholdingTaxClassificationTransmissionRequestCode" attribute
     */
    public boolean isSetWithholdingTaxClassificationTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WITHHOLDINGTAXCLASSIFICATIONTRANSMISSIONREQUESTCODE$22) != null;
        }
    }
    
    /**
     * Sets the "withholdingTaxClassificationTransmissionRequestCode" attribute
     */
    public void setWithholdingTaxClassificationTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum withholdingTaxClassificationTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WITHHOLDINGTAXCLASSIFICATIONTRANSMISSIONREQUESTCODE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WITHHOLDINGTAXCLASSIFICATIONTRANSMISSIONREQUESTCODE$22);
            }
            target.setEnumValue(withholdingTaxClassificationTransmissionRequestCode);
        }
    }
    
    /**
     * Sets (as xml) the "withholdingTaxClassificationTransmissionRequestCode" attribute
     */
    public void xsetWithholdingTaxClassificationTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode withholdingTaxClassificationTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(WITHHOLDINGTAXCLASSIFICATIONTRANSMISSIONREQUESTCODE$22);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().add_attribute_user(WITHHOLDINGTAXCLASSIFICATIONTRANSMISSIONREQUESTCODE$22);
            }
            target.set(withholdingTaxClassificationTransmissionRequestCode);
        }
    }
    
    /**
     * Unsets the "withholdingTaxClassificationTransmissionRequestCode" attribute
     */
    public void unsetWithholdingTaxClassificationTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WITHHOLDINGTAXCLASSIFICATIONTRANSMISSIONREQUESTCODE$22);
        }
    }
    
    /**
     * Gets the "valuationTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum getValuationTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUATIONTRANSMISSIONREQUESTCODE$24);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "valuationTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode xgetValuationTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(VALUATIONTRANSMISSIONREQUESTCODE$24);
            return target;
        }
    }
    
    /**
     * True if has "valuationTransmissionRequestCode" attribute
     */
    public boolean isSetValuationTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALUATIONTRANSMISSIONREQUESTCODE$24) != null;
        }
    }
    
    /**
     * Sets the "valuationTransmissionRequestCode" attribute
     */
    public void setValuationTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum valuationTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUATIONTRANSMISSIONREQUESTCODE$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUATIONTRANSMISSIONREQUESTCODE$24);
            }
            target.setEnumValue(valuationTransmissionRequestCode);
        }
    }
    
    /**
     * Sets (as xml) the "valuationTransmissionRequestCode" attribute
     */
    public void xsetValuationTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode valuationTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(VALUATIONTRANSMISSIONREQUESTCODE$24);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().add_attribute_user(VALUATIONTRANSMISSIONREQUESTCODE$24);
            }
            target.set(valuationTransmissionRequestCode);
        }
    }
    
    /**
     * Unsets the "valuationTransmissionRequestCode" attribute
     */
    public void unsetValuationTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALUATIONTRANSMISSIONREQUESTCODE$24);
        }
    }
    
    /**
     * Gets the "customerPartNumberTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum getCustomerPartNumberTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMERPARTNUMBERTRANSMISSIONREQUESTCODE$26);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "customerPartNumberTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode xgetCustomerPartNumberTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(CUSTOMERPARTNUMBERTRANSMISSIONREQUESTCODE$26);
            return target;
        }
    }
    
    /**
     * True if has "customerPartNumberTransmissionRequestCode" attribute
     */
    public boolean isSetCustomerPartNumberTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CUSTOMERPARTNUMBERTRANSMISSIONREQUESTCODE$26) != null;
        }
    }
    
    /**
     * Sets the "customerPartNumberTransmissionRequestCode" attribute
     */
    public void setCustomerPartNumberTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum customerPartNumberTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CUSTOMERPARTNUMBERTRANSMISSIONREQUESTCODE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CUSTOMERPARTNUMBERTRANSMISSIONREQUESTCODE$26);
            }
            target.setEnumValue(customerPartNumberTransmissionRequestCode);
        }
    }
    
    /**
     * Sets (as xml) the "customerPartNumberTransmissionRequestCode" attribute
     */
    public void xsetCustomerPartNumberTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode customerPartNumberTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(CUSTOMERPARTNUMBERTRANSMISSIONREQUESTCODE$26);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().add_attribute_user(CUSTOMERPARTNUMBERTRANSMISSIONREQUESTCODE$26);
            }
            target.set(customerPartNumberTransmissionRequestCode);
        }
    }
    
    /**
     * Unsets the "customerPartNumberTransmissionRequestCode" attribute
     */
    public void unsetCustomerPartNumberTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CUSTOMERPARTNUMBERTRANSMISSIONREQUESTCODE$26);
        }
    }
    
    /**
     * Gets the "supplierPartNumberTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum getSupplierPartNumberTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPLIERPARTNUMBERTRANSMISSIONREQUESTCODE$28);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "supplierPartNumberTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode xgetSupplierPartNumberTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(SUPPLIERPARTNUMBERTRANSMISSIONREQUESTCODE$28);
            return target;
        }
    }
    
    /**
     * True if has "supplierPartNumberTransmissionRequestCode" attribute
     */
    public boolean isSetSupplierPartNumberTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUPPLIERPARTNUMBERTRANSMISSIONREQUESTCODE$28) != null;
        }
    }
    
    /**
     * Sets the "supplierPartNumberTransmissionRequestCode" attribute
     */
    public void setSupplierPartNumberTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum supplierPartNumberTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPPLIERPARTNUMBERTRANSMISSIONREQUESTCODE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUPPLIERPARTNUMBERTRANSMISSIONREQUESTCODE$28);
            }
            target.setEnumValue(supplierPartNumberTransmissionRequestCode);
        }
    }
    
    /**
     * Sets (as xml) the "supplierPartNumberTransmissionRequestCode" attribute
     */
    public void xsetSupplierPartNumberTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode supplierPartNumberTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(SUPPLIERPARTNUMBERTRANSMISSIONREQUESTCODE$28);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().add_attribute_user(SUPPLIERPARTNUMBERTRANSMISSIONREQUESTCODE$28);
            }
            target.set(supplierPartNumberTransmissionRequestCode);
        }
    }
    
    /**
     * Unsets the "supplierPartNumberTransmissionRequestCode" attribute
     */
    public void unsetSupplierPartNumberTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUPPLIERPARTNUMBERTRANSMISSIONREQUESTCODE$28);
        }
    }
    
    /**
     * Gets the "attachmentFolderTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum getAttachmentFolderTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTACHMENTFOLDERTRANSMISSIONREQUESTCODE$30);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "attachmentFolderTransmissionRequestCode" attribute
     */
    public com.sap.xi.ap.common.gdt.TransmissionRequestCode xgetAttachmentFolderTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(ATTACHMENTFOLDERTRANSMISSIONREQUESTCODE$30);
            return target;
        }
    }
    
    /**
     * True if has "attachmentFolderTransmissionRequestCode" attribute
     */
    public boolean isSetAttachmentFolderTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ATTACHMENTFOLDERTRANSMISSIONREQUESTCODE$30) != null;
        }
    }
    
    /**
     * Sets the "attachmentFolderTransmissionRequestCode" attribute
     */
    public void setAttachmentFolderTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode.Enum attachmentFolderTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTACHMENTFOLDERTRANSMISSIONREQUESTCODE$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ATTACHMENTFOLDERTRANSMISSIONREQUESTCODE$30);
            }
            target.setEnumValue(attachmentFolderTransmissionRequestCode);
        }
    }
    
    /**
     * Sets (as xml) the "attachmentFolderTransmissionRequestCode" attribute
     */
    public void xsetAttachmentFolderTransmissionRequestCode(com.sap.xi.ap.common.gdt.TransmissionRequestCode attachmentFolderTransmissionRequestCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.TransmissionRequestCode target = null;
            target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().find_attribute_user(ATTACHMENTFOLDERTRANSMISSIONREQUESTCODE$30);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.TransmissionRequestCode)get_store().add_attribute_user(ATTACHMENTFOLDERTRANSMISSIONREQUESTCODE$30);
            }
            target.set(attachmentFolderTransmissionRequestCode);
        }
    }
    
    /**
     * Unsets the "attachmentFolderTransmissionRequestCode" attribute
     */
    public void unsetAttachmentFolderTransmissionRequestCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ATTACHMENTFOLDERTRANSMISSIONREQUESTCODE$30);
        }
    }
}

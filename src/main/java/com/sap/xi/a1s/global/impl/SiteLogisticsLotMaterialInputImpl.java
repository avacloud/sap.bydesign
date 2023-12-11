/*
 * XML Type:  SiteLogisticsLotMaterialInput
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML SiteLogisticsLotMaterialInput(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class SiteLogisticsLotMaterialInputImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.SiteLogisticsLotMaterialInput
{
    private static final long serialVersionUID = 1L;
    
    public SiteLogisticsLotMaterialInputImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SITELOGISTICSLOTMATERIALINPUTUUID$0 = 
        new javax.xml.namespace.QName("", "SiteLogisticsLotMaterialInputUUID");
    private static final javax.xml.namespace.QName SOURCELOGISTICSAREAID$2 = 
        new javax.xml.namespace.QName("", "SourceLogisticsAreaID");
    private static final javax.xml.namespace.QName PRODUCTID$4 = 
        new javax.xml.namespace.QName("", "ProductID");
    private static final javax.xml.namespace.QName PRODUCTDESCRIPTION$6 = 
        new javax.xml.namespace.QName("", "ProductDescription");
    private static final javax.xml.namespace.QName PLANQUANTITY$8 = 
        new javax.xml.namespace.QName("", "PlanQuantity");
    private static final javax.xml.namespace.QName OPENQUANTITY$10 = 
        new javax.xml.namespace.QName("", "OpenQuantity");
    private static final javax.xml.namespace.QName CONFIRMQUANTITY$12 = 
        new javax.xml.namespace.QName("", "ConfirmQuantity");
    private static final javax.xml.namespace.QName TOTALCONFIRMEDQUANTITY$14 = 
        new javax.xml.namespace.QName("", "TotalConfirmedQuantity");
    private static final javax.xml.namespace.QName IDENTIFIEDSTOCKID$16 = 
        new javax.xml.namespace.QName("", "IdentifiedStockID");
    private static final javax.xml.namespace.QName PRODUCTSPECIFICATIONID$18 = 
        new javax.xml.namespace.QName("", "ProductSpecificationID");
    private static final javax.xml.namespace.QName PRODUCTREQUIREMENTSPECIFICATIONDESCRIPTION$20 = 
        new javax.xml.namespace.QName("", "ProductRequirementSpecificationDescription");
    private static final javax.xml.namespace.QName LOGISTICSDEVIATIONREASONCODE$22 = 
        new javax.xml.namespace.QName("", "LogisticsDeviationReasonCode");
    private static final javax.xml.namespace.QName RESTRICTEDINDICATOR$24 = 
        new javax.xml.namespace.QName("", "RestrictedIndicator");
    private static final javax.xml.namespace.QName LINEITEMID$26 = 
        new javax.xml.namespace.QName("", "LineItemID");
    private static final javax.xml.namespace.QName LOGISTICPACKAGEINPUT$28 = 
        new javax.xml.namespace.QName("", "LogisticPackageInput");
    private static final javax.xml.namespace.QName MATERIALDEVIATIONSTATUSCODE$30 = 
        new javax.xml.namespace.QName("", "MaterialDeviationStatusCode");
    
    
    /**
     * Gets the "SiteLogisticsLotMaterialInputUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getSiteLogisticsLotMaterialInputUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(SITELOGISTICSLOTMATERIALINPUTUUID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SiteLogisticsLotMaterialInputUUID" element
     */
    public boolean isSetSiteLogisticsLotMaterialInputUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SITELOGISTICSLOTMATERIALINPUTUUID$0) != 0;
        }
    }
    
    /**
     * Sets the "SiteLogisticsLotMaterialInputUUID" element
     */
    public void setSiteLogisticsLotMaterialInputUUID(com.sap.xi.ap.common.gdt.UUID siteLogisticsLotMaterialInputUUID)
    {
        generatedSetterHelperImpl(siteLogisticsLotMaterialInputUUID, SITELOGISTICSLOTMATERIALINPUTUUID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SiteLogisticsLotMaterialInputUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewSiteLogisticsLotMaterialInputUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(SITELOGISTICSLOTMATERIALINPUTUUID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "SiteLogisticsLotMaterialInputUUID" element
     */
    public void unsetSiteLogisticsLotMaterialInputUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SITELOGISTICSLOTMATERIALINPUTUUID$0, 0);
        }
    }
    
    /**
     * Gets the "SourceLogisticsAreaID" element
     */
    public java.lang.String getSourceLogisticsAreaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCELOGISTICSAREAID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SourceLogisticsAreaID" element
     */
    public com.sap.xi.ap.common.gdt.LogisticsAreaID xgetSourceLogisticsAreaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsAreaID target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsAreaID)get_store().find_element_user(SOURCELOGISTICSAREAID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "SourceLogisticsAreaID" element
     */
    public boolean isSetSourceLogisticsAreaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCELOGISTICSAREAID$2) != 0;
        }
    }
    
    /**
     * Sets the "SourceLogisticsAreaID" element
     */
    public void setSourceLogisticsAreaID(java.lang.String sourceLogisticsAreaID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCELOGISTICSAREAID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCELOGISTICSAREAID$2);
            }
            target.setStringValue(sourceLogisticsAreaID);
        }
    }
    
    /**
     * Sets (as xml) the "SourceLogisticsAreaID" element
     */
    public void xsetSourceLogisticsAreaID(com.sap.xi.ap.common.gdt.LogisticsAreaID sourceLogisticsAreaID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsAreaID target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsAreaID)get_store().find_element_user(SOURCELOGISTICSAREAID$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogisticsAreaID)get_store().add_element_user(SOURCELOGISTICSAREAID$2);
            }
            target.set(sourceLogisticsAreaID);
        }
    }
    
    /**
     * Unsets the "SourceLogisticsAreaID" element
     */
    public void unsetSourceLogisticsAreaID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCELOGISTICSAREAID$2, 0);
        }
    }
    
    /**
     * Gets the "ProductID" element
     */
    public com.sap.xi.ap.common.gdt.ProductID getProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductID)get_store().find_element_user(PRODUCTID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductID" element
     */
    public boolean isSetProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTID$4) != 0;
        }
    }
    
    /**
     * Sets the "ProductID" element
     */
    public void setProductID(com.sap.xi.ap.common.gdt.ProductID productID)
    {
        generatedSetterHelperImpl(productID, PRODUCTID$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductID" element
     */
    public com.sap.xi.ap.common.gdt.ProductID addNewProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductID)get_store().add_element_user(PRODUCTID$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductID" element
     */
    public void unsetProductID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTID$4, 0);
        }
    }
    
    /**
     * Gets the "ProductDescription" element
     */
    public com.sap.xi.ap.common.gdt.SHORTDescription getProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SHORTDescription target = null;
            target = (com.sap.xi.ap.common.gdt.SHORTDescription)get_store().find_element_user(PRODUCTDESCRIPTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductDescription" element
     */
    public boolean isSetProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTDESCRIPTION$6) != 0;
        }
    }
    
    /**
     * Sets the "ProductDescription" element
     */
    public void setProductDescription(com.sap.xi.ap.common.gdt.SHORTDescription productDescription)
    {
        generatedSetterHelperImpl(productDescription, PRODUCTDESCRIPTION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductDescription" element
     */
    public com.sap.xi.ap.common.gdt.SHORTDescription addNewProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.SHORTDescription target = null;
            target = (com.sap.xi.ap.common.gdt.SHORTDescription)get_store().add_element_user(PRODUCTDESCRIPTION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductDescription" element
     */
    public void unsetProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTDESCRIPTION$6, 0);
        }
    }
    
    /**
     * Gets the "PlanQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity getPlanQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(PLANQUANTITY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PlanQuantity" element
     */
    public boolean isSetPlanQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PLANQUANTITY$8) != 0;
        }
    }
    
    /**
     * Sets the "PlanQuantity" element
     */
    public void setPlanQuantity(com.sap.xi.ap.common.gdt.Quantity planQuantity)
    {
        generatedSetterHelperImpl(planQuantity, PLANQUANTITY$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PlanQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity addNewPlanQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(PLANQUANTITY$8);
            return target;
        }
    }
    
    /**
     * Unsets the "PlanQuantity" element
     */
    public void unsetPlanQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PLANQUANTITY$8, 0);
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
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(OPENQUANTITY$10, 0);
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
            return get_store().count_elements(OPENQUANTITY$10) != 0;
        }
    }
    
    /**
     * Sets the "OpenQuantity" element
     */
    public void setOpenQuantity(com.sap.xi.ap.common.gdt.Quantity openQuantity)
    {
        generatedSetterHelperImpl(openQuantity, OPENQUANTITY$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(OPENQUANTITY$10);
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
            get_store().remove_element(OPENQUANTITY$10, 0);
        }
    }
    
    /**
     * Gets the "ConfirmQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity getConfirmQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(CONFIRMQUANTITY$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ConfirmQuantity" element
     */
    public boolean isSetConfirmQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIRMQUANTITY$12) != 0;
        }
    }
    
    /**
     * Sets the "ConfirmQuantity" element
     */
    public void setConfirmQuantity(com.sap.xi.ap.common.gdt.Quantity confirmQuantity)
    {
        generatedSetterHelperImpl(confirmQuantity, CONFIRMQUANTITY$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ConfirmQuantity" element
     */
    public com.sap.xi.ap.common.gdt.Quantity addNewConfirmQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Quantity target = null;
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(CONFIRMQUANTITY$12);
            return target;
        }
    }
    
    /**
     * Unsets the "ConfirmQuantity" element
     */
    public void unsetConfirmQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIRMQUANTITY$12, 0);
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
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().find_element_user(TOTALCONFIRMEDQUANTITY$14, 0);
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
            return get_store().count_elements(TOTALCONFIRMEDQUANTITY$14) != 0;
        }
    }
    
    /**
     * Sets the "TotalConfirmedQuantity" element
     */
    public void setTotalConfirmedQuantity(com.sap.xi.ap.common.gdt.Quantity totalConfirmedQuantity)
    {
        generatedSetterHelperImpl(totalConfirmedQuantity, TOTALCONFIRMEDQUANTITY$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.Quantity)get_store().add_element_user(TOTALCONFIRMEDQUANTITY$14);
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
            get_store().remove_element(TOTALCONFIRMEDQUANTITY$14, 0);
        }
    }
    
    /**
     * Gets the "IdentifiedStockID" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockID getIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockID target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID)get_store().find_element_user(IDENTIFIEDSTOCKID$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IdentifiedStockID" element
     */
    public boolean isSetIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIEDSTOCKID$16) != 0;
        }
    }
    
    /**
     * Sets the "IdentifiedStockID" element
     */
    public void setIdentifiedStockID(com.sap.xi.ap.common.gdt.IdentifiedStockID identifiedStockID)
    {
        generatedSetterHelperImpl(identifiedStockID, IDENTIFIEDSTOCKID$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IdentifiedStockID" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockID addNewIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockID target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID)get_store().add_element_user(IDENTIFIEDSTOCKID$16);
            return target;
        }
    }
    
    /**
     * Unsets the "IdentifiedStockID" element
     */
    public void unsetIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIEDSTOCKID$16, 0);
        }
    }
    
    /**
     * Gets the "ProductSpecificationID" element
     */
    public com.sap.xi.ap.common.gdt.RequirementSpecificationID getProductSpecificationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.RequirementSpecificationID target = null;
            target = (com.sap.xi.ap.common.gdt.RequirementSpecificationID)get_store().find_element_user(PRODUCTSPECIFICATIONID$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductSpecificationID" element
     */
    public boolean isSetProductSpecificationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTSPECIFICATIONID$18) != 0;
        }
    }
    
    /**
     * Sets the "ProductSpecificationID" element
     */
    public void setProductSpecificationID(com.sap.xi.ap.common.gdt.RequirementSpecificationID productSpecificationID)
    {
        generatedSetterHelperImpl(productSpecificationID, PRODUCTSPECIFICATIONID$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductSpecificationID" element
     */
    public com.sap.xi.ap.common.gdt.RequirementSpecificationID addNewProductSpecificationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.RequirementSpecificationID target = null;
            target = (com.sap.xi.ap.common.gdt.RequirementSpecificationID)get_store().add_element_user(PRODUCTSPECIFICATIONID$18);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductSpecificationID" element
     */
    public void unsetProductSpecificationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTSPECIFICATIONID$18, 0);
        }
    }
    
    /**
     * Gets the "ProductRequirementSpecificationDescription" element
     */
    public com.sap.xi.ap.common.gdt.MEDIUMDescription getProductRequirementSpecificationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MEDIUMDescription target = null;
            target = (com.sap.xi.ap.common.gdt.MEDIUMDescription)get_store().find_element_user(PRODUCTREQUIREMENTSPECIFICATIONDESCRIPTION$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductRequirementSpecificationDescription" element
     */
    public boolean isSetProductRequirementSpecificationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTREQUIREMENTSPECIFICATIONDESCRIPTION$20) != 0;
        }
    }
    
    /**
     * Sets the "ProductRequirementSpecificationDescription" element
     */
    public void setProductRequirementSpecificationDescription(com.sap.xi.ap.common.gdt.MEDIUMDescription productRequirementSpecificationDescription)
    {
        generatedSetterHelperImpl(productRequirementSpecificationDescription, PRODUCTREQUIREMENTSPECIFICATIONDESCRIPTION$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductRequirementSpecificationDescription" element
     */
    public com.sap.xi.ap.common.gdt.MEDIUMDescription addNewProductRequirementSpecificationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.MEDIUMDescription target = null;
            target = (com.sap.xi.ap.common.gdt.MEDIUMDescription)get_store().add_element_user(PRODUCTREQUIREMENTSPECIFICATIONDESCRIPTION$20);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductRequirementSpecificationDescription" element
     */
    public void unsetProductRequirementSpecificationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTREQUIREMENTSPECIFICATIONDESCRIPTION$20, 0);
        }
    }
    
    /**
     * Gets the "LogisticsDeviationReasonCode" element
     */
    public com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode getLogisticsDeviationReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode)get_store().find_element_user(LOGISTICSDEVIATIONREASONCODE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LogisticsDeviationReasonCode" element
     */
    public boolean isSetLogisticsDeviationReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGISTICSDEVIATIONREASONCODE$22) != 0;
        }
    }
    
    /**
     * Sets the "LogisticsDeviationReasonCode" element
     */
    public void setLogisticsDeviationReasonCode(com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode logisticsDeviationReasonCode)
    {
        generatedSetterHelperImpl(logisticsDeviationReasonCode, LOGISTICSDEVIATIONREASONCODE$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LogisticsDeviationReasonCode" element
     */
    public com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode addNewLogisticsDeviationReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogisticsDeviationReasonCode)get_store().add_element_user(LOGISTICSDEVIATIONREASONCODE$22);
            return target;
        }
    }
    
    /**
     * Unsets the "LogisticsDeviationReasonCode" element
     */
    public void unsetLogisticsDeviationReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGISTICSDEVIATIONREASONCODE$22, 0);
        }
    }
    
    /**
     * Gets the "RestrictedIndicator" element
     */
    public boolean getRestrictedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESTRICTEDINDICATOR$24, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "RestrictedIndicator" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetRestrictedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(RESTRICTEDINDICATOR$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "RestrictedIndicator" element
     */
    public boolean isSetRestrictedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESTRICTEDINDICATOR$24) != 0;
        }
    }
    
    /**
     * Sets the "RestrictedIndicator" element
     */
    public void setRestrictedIndicator(boolean restrictedIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESTRICTEDINDICATOR$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESTRICTEDINDICATOR$24);
            }
            target.setBooleanValue(restrictedIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "RestrictedIndicator" element
     */
    public void xsetRestrictedIndicator(com.sap.xi.ap.common.gdt.Indicator restrictedIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(RESTRICTEDINDICATOR$24, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(RESTRICTEDINDICATOR$24);
            }
            target.set(restrictedIndicator);
        }
    }
    
    /**
     * Unsets the "RestrictedIndicator" element
     */
    public void unsetRestrictedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESTRICTEDINDICATOR$24, 0);
        }
    }
    
    /**
     * Gets the "LineItemID" element
     */
    public int getLineItemID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINEITEMID$26, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "LineItemID" element
     */
    public com.sap.xi.ap.common.gdt.OrdinalNumberValue xgetLineItemID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OrdinalNumberValue target = null;
            target = (com.sap.xi.ap.common.gdt.OrdinalNumberValue)get_store().find_element_user(LINEITEMID$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "LineItemID" element
     */
    public boolean isSetLineItemID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINEITEMID$26) != 0;
        }
    }
    
    /**
     * Sets the "LineItemID" element
     */
    public void setLineItemID(int lineItemID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINEITEMID$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINEITEMID$26);
            }
            target.setIntValue(lineItemID);
        }
    }
    
    /**
     * Sets (as xml) the "LineItemID" element
     */
    public void xsetLineItemID(com.sap.xi.ap.common.gdt.OrdinalNumberValue lineItemID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.OrdinalNumberValue target = null;
            target = (com.sap.xi.ap.common.gdt.OrdinalNumberValue)get_store().find_element_user(LINEITEMID$26, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.OrdinalNumberValue)get_store().add_element_user(LINEITEMID$26);
            }
            target.set(lineItemID);
        }
    }
    
    /**
     * Unsets the "LineItemID" element
     */
    public void unsetLineItemID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINEITEMID$26, 0);
        }
    }
    
    /**
     * Gets the "LogisticPackageInput" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageInput getLogisticPackageInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageInput target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageInput)get_store().find_element_user(LOGISTICPACKAGEINPUT$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LogisticPackageInput" element
     */
    public boolean isSetLogisticPackageInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGISTICPACKAGEINPUT$28) != 0;
        }
    }
    
    /**
     * Sets the "LogisticPackageInput" element
     */
    public void setLogisticPackageInput(com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageInput logisticPackageInput)
    {
        generatedSetterHelperImpl(logisticPackageInput, LOGISTICPACKAGEINPUT$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LogisticPackageInput" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageInput addNewLogisticPackageInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageInput target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsLotLogisticPackageInput)get_store().add_element_user(LOGISTICPACKAGEINPUT$28);
            return target;
        }
    }
    
    /**
     * Unsets the "LogisticPackageInput" element
     */
    public void unsetLogisticPackageInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGISTICPACKAGEINPUT$28, 0);
        }
    }
    
    /**
     * Gets the "MaterialDeviationStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.DeviationStatusCode.Enum getMaterialDeviationStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATERIALDEVIATIONSTATUSCODE$30, 0);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.DeviationStatusCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaterialDeviationStatusCode" element
     */
    public com.sap.xi.ap.common.gdt.DeviationStatusCode xgetMaterialDeviationStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DeviationStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.DeviationStatusCode)get_store().find_element_user(MATERIALDEVIATIONSTATUSCODE$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaterialDeviationStatusCode" element
     */
    public boolean isSetMaterialDeviationStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MATERIALDEVIATIONSTATUSCODE$30) != 0;
        }
    }
    
    /**
     * Sets the "MaterialDeviationStatusCode" element
     */
    public void setMaterialDeviationStatusCode(com.sap.xi.ap.common.gdt.DeviationStatusCode.Enum materialDeviationStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MATERIALDEVIATIONSTATUSCODE$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MATERIALDEVIATIONSTATUSCODE$30);
            }
            target.setEnumValue(materialDeviationStatusCode);
        }
    }
    
    /**
     * Sets (as xml) the "MaterialDeviationStatusCode" element
     */
    public void xsetMaterialDeviationStatusCode(com.sap.xi.ap.common.gdt.DeviationStatusCode materialDeviationStatusCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.DeviationStatusCode target = null;
            target = (com.sap.xi.ap.common.gdt.DeviationStatusCode)get_store().find_element_user(MATERIALDEVIATIONSTATUSCODE$30, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.DeviationStatusCode)get_store().add_element_user(MATERIALDEVIATIONSTATUSCODE$30);
            }
            target.set(materialDeviationStatusCode);
        }
    }
    
    /**
     * Unsets the "MaterialDeviationStatusCode" element
     */
    public void unsetMaterialDeviationStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MATERIALDEVIATIONSTATUSCODE$30, 0);
        }
    }
}

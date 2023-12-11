/*
 * XML Type:  ManageIdentifiedStocksRequest
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ManageIdentifiedStocksRequest
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ManageIdentifiedStocksRequest(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ManageIdentifiedStocksRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ManageIdentifiedStocksRequest
{
    private static final long serialVersionUID = 1L;
    
    public ManageIdentifiedStocksRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTNODESENDERTECHNICALID$0 = 
        new javax.xml.namespace.QName("", "ObjectNodeSenderTechnicalID");
    private static final javax.xml.namespace.QName CHANGESTATEID$2 = 
        new javax.xml.namespace.QName("", "ChangeStateID");
    private static final javax.xml.namespace.QName IDENTIFIEDSTOCKID$4 = 
        new javax.xml.namespace.QName("", "IdentifiedStockID");
    private static final javax.xml.namespace.QName IDENTIFIEDSTOCKUUID$6 = 
        new javax.xml.namespace.QName("", "IdentifiedStockUUID");
    private static final javax.xml.namespace.QName EXTERNALIDENTIFIEDSTOCKID$8 = 
        new javax.xml.namespace.QName("", "ExternalIdentifiedStockID");
    private static final javax.xml.namespace.QName PRODUCTID$10 = 
        new javax.xml.namespace.QName("", "ProductID");
    private static final javax.xml.namespace.QName PRODUCTIONDATETIME$12 = 
        new javax.xml.namespace.QName("", "ProductionDateTime");
    private static final javax.xml.namespace.QName EXPIRATIONDATETIME$14 = 
        new javax.xml.namespace.QName("", "ExpirationDateTime");
    private static final javax.xml.namespace.QName SUPPLIERID$16 = 
        new javax.xml.namespace.QName("", "SupplierID");
    private static final javax.xml.namespace.QName PRODUCTREQUIREMENTSPECIFICATIONKEY$18 = 
        new javax.xml.namespace.QName("", "ProductRequirementSpecificationKey");
    private static final javax.xml.namespace.QName ATTACHMENTFOLDER$20 = 
        new javax.xml.namespace.QName("", "AttachmentFolder");
    private static final javax.xml.namespace.QName TEXTCOLLECTION$22 = 
        new javax.xml.namespace.QName("", "TextCollection");
    private static final javax.xml.namespace.QName DESCRIPTION$24 = 
        new javax.xml.namespace.QName("", "Description");
    private static final javax.xml.namespace.QName QUANTITYCONVERSION$26 = 
        new javax.xml.namespace.QName("", "QuantityConversion");
    private static final javax.xml.namespace.QName ACTIONCODE$28 = 
        new javax.xml.namespace.QName("", "actionCode");
    private static final javax.xml.namespace.QName ACTIVATEIDENTIFIEDSTOCKINDICATOR$30 = 
        new javax.xml.namespace.QName("", "activateIdentifiedStockIndicator");
    private static final javax.xml.namespace.QName BLOCKIDENTIFIEDSTOCKINDICATOR$32 = 
        new javax.xml.namespace.QName("", "blockIdentifiedStockIndicator");
    private static final javax.xml.namespace.QName UNBLOCKIDENTIFIEDSTOCKINDICATOR$34 = 
        new javax.xml.namespace.QName("", "unblockIdentifiedStockIndicator");
    private static final javax.xml.namespace.QName SETOBSOLETEIDENTIFIEDSTOCKINDICATOR$36 = 
        new javax.xml.namespace.QName("", "setObsoleteIdentifiedStockIndicator");
    private static final javax.xml.namespace.QName UNDOOBSOLETEIDENTIFIEDSTOCKINDICATOR$38 = 
        new javax.xml.namespace.QName("", "undoObsoleteIdentifiedStockIndicator");
    private static final javax.xml.namespace.QName DESCRIPTIONLISTCOMPLETETRANSMISSIONINDICATOR$40 = 
        new javax.xml.namespace.QName("", "descriptionListCompleteTransmissionIndicator");
    private static final javax.xml.namespace.QName QUANTITYCONVERSIONLISTCOMPLETETRANSMISSIONINDICATOR$42 = 
        new javax.xml.namespace.QName("", "quantityConversionListCompleteTransmissionIndicator");
    
    
    /**
     * Gets the "ObjectNodeSenderTechnicalID" element
     */
    public java.lang.String getObjectNodeSenderTechnicalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTNODESENDERTECHNICALID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ObjectNodeSenderTechnicalID" element
     */
    public com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID xgetObjectNodeSenderTechnicalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID)get_store().find_element_user(OBJECTNODESENDERTECHNICALID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ObjectNodeSenderTechnicalID" element
     */
    public boolean isSetObjectNodeSenderTechnicalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTNODESENDERTECHNICALID$0) != 0;
        }
    }
    
    /**
     * Sets the "ObjectNodeSenderTechnicalID" element
     */
    public void setObjectNodeSenderTechnicalID(java.lang.String objectNodeSenderTechnicalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTNODESENDERTECHNICALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTNODESENDERTECHNICALID$0);
            }
            target.setStringValue(objectNodeSenderTechnicalID);
        }
    }
    
    /**
     * Sets (as xml) the "ObjectNodeSenderTechnicalID" element
     */
    public void xsetObjectNodeSenderTechnicalID(com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID objectNodeSenderTechnicalID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID)get_store().find_element_user(OBJECTNODESENDERTECHNICALID$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID)get_store().add_element_user(OBJECTNODESENDERTECHNICALID$0);
            }
            target.set(objectNodeSenderTechnicalID);
        }
    }
    
    /**
     * Unsets the "ObjectNodeSenderTechnicalID" element
     */
    public void unsetObjectNodeSenderTechnicalID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTNODESENDERTECHNICALID$0, 0);
        }
    }
    
    /**
     * Gets the "ChangeStateID" element
     */
    public java.lang.String getChangeStateID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGESTATEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ChangeStateID" element
     */
    public com.sap.xi.ap.common.gdt.ChangeStateID xgetChangeStateID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ChangeStateID target = null;
            target = (com.sap.xi.ap.common.gdt.ChangeStateID)get_store().find_element_user(CHANGESTATEID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ChangeStateID" element
     */
    public boolean isSetChangeStateID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHANGESTATEID$2) != 0;
        }
    }
    
    /**
     * Sets the "ChangeStateID" element
     */
    public void setChangeStateID(java.lang.String changeStateID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANGESTATEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANGESTATEID$2);
            }
            target.setStringValue(changeStateID);
        }
    }
    
    /**
     * Sets (as xml) the "ChangeStateID" element
     */
    public void xsetChangeStateID(com.sap.xi.ap.common.gdt.ChangeStateID changeStateID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ChangeStateID target = null;
            target = (com.sap.xi.ap.common.gdt.ChangeStateID)get_store().find_element_user(CHANGESTATEID$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ChangeStateID)get_store().add_element_user(CHANGESTATEID$2);
            }
            target.set(changeStateID);
        }
    }
    
    /**
     * Unsets the "ChangeStateID" element
     */
    public void unsetChangeStateID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHANGESTATEID$2, 0);
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
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID)get_store().find_element_user(IDENTIFIEDSTOCKID$4, 0);
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
            return get_store().count_elements(IDENTIFIEDSTOCKID$4) != 0;
        }
    }
    
    /**
     * Sets the "IdentifiedStockID" element
     */
    public void setIdentifiedStockID(com.sap.xi.ap.common.gdt.IdentifiedStockID identifiedStockID)
    {
        generatedSetterHelperImpl(identifiedStockID, IDENTIFIEDSTOCKID$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID)get_store().add_element_user(IDENTIFIEDSTOCKID$4);
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
            get_store().remove_element(IDENTIFIEDSTOCKID$4, 0);
        }
    }
    
    /**
     * Gets the "IdentifiedStockUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID getIdentifiedStockUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().find_element_user(IDENTIFIEDSTOCKUUID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IdentifiedStockUUID" element
     */
    public boolean isSetIdentifiedStockUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIEDSTOCKUUID$6) != 0;
        }
    }
    
    /**
     * Sets the "IdentifiedStockUUID" element
     */
    public void setIdentifiedStockUUID(com.sap.xi.ap.common.gdt.UUID identifiedStockUUID)
    {
        generatedSetterHelperImpl(identifiedStockUUID, IDENTIFIEDSTOCKUUID$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IdentifiedStockUUID" element
     */
    public com.sap.xi.ap.common.gdt.UUID addNewIdentifiedStockUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.UUID target = null;
            target = (com.sap.xi.ap.common.gdt.UUID)get_store().add_element_user(IDENTIFIEDSTOCKUUID$6);
            return target;
        }
    }
    
    /**
     * Unsets the "IdentifiedStockUUID" element
     */
    public void unsetIdentifiedStockUUID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIEDSTOCKUUID$6, 0);
        }
    }
    
    /**
     * Gets the "ExternalIdentifiedStockID" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockID getExternalIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockID target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID)get_store().find_element_user(EXTERNALIDENTIFIEDSTOCKID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ExternalIdentifiedStockID" element
     */
    public boolean isSetExternalIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALIDENTIFIEDSTOCKID$8) != 0;
        }
    }
    
    /**
     * Sets the "ExternalIdentifiedStockID" element
     */
    public void setExternalIdentifiedStockID(com.sap.xi.ap.common.gdt.IdentifiedStockID externalIdentifiedStockID)
    {
        generatedSetterHelperImpl(externalIdentifiedStockID, EXTERNALIDENTIFIEDSTOCKID$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ExternalIdentifiedStockID" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockID addNewExternalIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockID target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID)get_store().add_element_user(EXTERNALIDENTIFIEDSTOCKID$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ExternalIdentifiedStockID" element
     */
    public void unsetExternalIdentifiedStockID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALIDENTIFIEDSTOCKID$8, 0);
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
            target = (com.sap.xi.ap.common.gdt.ProductID)get_store().find_element_user(PRODUCTID$10, 0);
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
            return get_store().count_elements(PRODUCTID$10) != 0;
        }
    }
    
    /**
     * Sets the "ProductID" element
     */
    public void setProductID(com.sap.xi.ap.common.gdt.ProductID productID)
    {
        generatedSetterHelperImpl(productID, PRODUCTID$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.sap.xi.ap.common.gdt.ProductID)get_store().add_element_user(PRODUCTID$10);
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
            get_store().remove_element(PRODUCTID$10, 0);
        }
    }
    
    /**
     * Gets the "ProductionDateTime" element
     */
    public java.util.Calendar getProductionDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTIONDATETIME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductionDateTime" element
     */
    public com.sap.xi.basis.global.GLOBALDateTime xgetProductionDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(PRODUCTIONDATETIME$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProductionDateTime" element
     */
    public boolean isSetProductionDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTIONDATETIME$12) != 0;
        }
    }
    
    /**
     * Sets the "ProductionDateTime" element
     */
    public void setProductionDateTime(java.util.Calendar productionDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTIONDATETIME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTIONDATETIME$12);
            }
            target.setCalendarValue(productionDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "ProductionDateTime" element
     */
    public void xsetProductionDateTime(com.sap.xi.basis.global.GLOBALDateTime productionDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(PRODUCTIONDATETIME$12, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(PRODUCTIONDATETIME$12);
            }
            target.set(productionDateTime);
        }
    }
    
    /**
     * Unsets the "ProductionDateTime" element
     */
    public void unsetProductionDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTIONDATETIME$12, 0);
        }
    }
    
    /**
     * Gets the "ExpirationDateTime" element
     */
    public java.util.Calendar getExpirationDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONDATETIME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExpirationDateTime" element
     */
    public com.sap.xi.basis.global.GLOBALDateTime xgetExpirationDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(EXPIRATIONDATETIME$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "ExpirationDateTime" element
     */
    public boolean isSetExpirationDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXPIRATIONDATETIME$14) != 0;
        }
    }
    
    /**
     * Sets the "ExpirationDateTime" element
     */
    public void setExpirationDateTime(java.util.Calendar expirationDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRATIONDATETIME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPIRATIONDATETIME$14);
            }
            target.setCalendarValue(expirationDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "ExpirationDateTime" element
     */
    public void xsetExpirationDateTime(com.sap.xi.basis.global.GLOBALDateTime expirationDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.basis.global.GLOBALDateTime target = null;
            target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().find_element_user(EXPIRATIONDATETIME$14, 0);
            if (target == null)
            {
                target = (com.sap.xi.basis.global.GLOBALDateTime)get_store().add_element_user(EXPIRATIONDATETIME$14);
            }
            target.set(expirationDateTime);
        }
    }
    
    /**
     * Unsets the "ExpirationDateTime" element
     */
    public void unsetExpirationDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXPIRATIONDATETIME$14, 0);
        }
    }
    
    /**
     * Gets the "SupplierID" element
     */
    public com.sap.xi.ap.common.global.PartyKey getSupplierID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.PartyKey target = null;
            target = (com.sap.xi.ap.common.global.PartyKey)get_store().find_element_user(SUPPLIERID$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SupplierID" element
     */
    public boolean isSetSupplierID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLIERID$16) != 0;
        }
    }
    
    /**
     * Sets the "SupplierID" element
     */
    public void setSupplierID(com.sap.xi.ap.common.global.PartyKey supplierID)
    {
        generatedSetterHelperImpl(supplierID, SUPPLIERID$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SupplierID" element
     */
    public com.sap.xi.ap.common.global.PartyKey addNewSupplierID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.PartyKey target = null;
            target = (com.sap.xi.ap.common.global.PartyKey)get_store().add_element_user(SUPPLIERID$16);
            return target;
        }
    }
    
    /**
     * Unsets the "SupplierID" element
     */
    public void unsetSupplierID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLIERID$16, 0);
        }
    }
    
    /**
     * Gets the "ProductRequirementSpecificationKey" element
     */
    public com.sap.xi.ap.common.global.RequirementSpecificationKey getProductRequirementSpecificationKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.RequirementSpecificationKey target = null;
            target = (com.sap.xi.ap.common.global.RequirementSpecificationKey)get_store().find_element_user(PRODUCTREQUIREMENTSPECIFICATIONKEY$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductRequirementSpecificationKey" element
     */
    public boolean isSetProductRequirementSpecificationKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTREQUIREMENTSPECIFICATIONKEY$18) != 0;
        }
    }
    
    /**
     * Sets the "ProductRequirementSpecificationKey" element
     */
    public void setProductRequirementSpecificationKey(com.sap.xi.ap.common.global.RequirementSpecificationKey productRequirementSpecificationKey)
    {
        generatedSetterHelperImpl(productRequirementSpecificationKey, PRODUCTREQUIREMENTSPECIFICATIONKEY$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductRequirementSpecificationKey" element
     */
    public com.sap.xi.ap.common.global.RequirementSpecificationKey addNewProductRequirementSpecificationKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.global.RequirementSpecificationKey target = null;
            target = (com.sap.xi.ap.common.global.RequirementSpecificationKey)get_store().add_element_user(PRODUCTREQUIREMENTSPECIFICATIONKEY$18);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductRequirementSpecificationKey" element
     */
    public void unsetProductRequirementSpecificationKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTREQUIREMENTSPECIFICATIONKEY$18, 0);
        }
    }
    
    /**
     * Gets the "AttachmentFolder" element
     */
    public com.sap.xi.documentservices.global.MaintenanceAttachmentFolder getAttachmentFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.MaintenanceAttachmentFolder target = null;
            target = (com.sap.xi.documentservices.global.MaintenanceAttachmentFolder)get_store().find_element_user(ATTACHMENTFOLDER$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AttachmentFolder" element
     */
    public boolean isSetAttachmentFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTACHMENTFOLDER$20) != 0;
        }
    }
    
    /**
     * Sets the "AttachmentFolder" element
     */
    public void setAttachmentFolder(com.sap.xi.documentservices.global.MaintenanceAttachmentFolder attachmentFolder)
    {
        generatedSetterHelperImpl(attachmentFolder, ATTACHMENTFOLDER$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AttachmentFolder" element
     */
    public com.sap.xi.documentservices.global.MaintenanceAttachmentFolder addNewAttachmentFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.MaintenanceAttachmentFolder target = null;
            target = (com.sap.xi.documentservices.global.MaintenanceAttachmentFolder)get_store().add_element_user(ATTACHMENTFOLDER$20);
            return target;
        }
    }
    
    /**
     * Unsets the "AttachmentFolder" element
     */
    public void unsetAttachmentFolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTACHMENTFOLDER$20, 0);
        }
    }
    
    /**
     * Gets the "TextCollection" element
     */
    public com.sap.xi.documentservices.global.MaintenanceTextCollection getTextCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.MaintenanceTextCollection target = null;
            target = (com.sap.xi.documentservices.global.MaintenanceTextCollection)get_store().find_element_user(TEXTCOLLECTION$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TextCollection" element
     */
    public boolean isSetTextCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXTCOLLECTION$22) != 0;
        }
    }
    
    /**
     * Sets the "TextCollection" element
     */
    public void setTextCollection(com.sap.xi.documentservices.global.MaintenanceTextCollection textCollection)
    {
        generatedSetterHelperImpl(textCollection, TEXTCOLLECTION$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TextCollection" element
     */
    public com.sap.xi.documentservices.global.MaintenanceTextCollection addNewTextCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.documentservices.global.MaintenanceTextCollection target = null;
            target = (com.sap.xi.documentservices.global.MaintenanceTextCollection)get_store().add_element_user(TEXTCOLLECTION$22);
            return target;
        }
    }
    
    /**
     * Unsets the "TextCollection" element
     */
    public void unsetTextCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXTCOLLECTION$22, 0);
        }
    }
    
    /**
     * Gets array of all "Description" elements
     */
    public com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESCRIPTION$24, targetList);
            com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle[] result = new com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Description" element
     */
    public com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle target = null;
            target = (com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle)get_store().find_element_user(DESCRIPTION$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Description" element
     */
    public int sizeOfDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$24);
        }
    }
    
    /**
     * Sets array of all "Description" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDescriptionArray(com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle[] descriptionArray)
    {
        check_orphaned();
        arraySetterHelper(descriptionArray, DESCRIPTION$24);
    }
    
    /**
     * Sets ith "Description" element
     */
    public void setDescriptionArray(int i, com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle description)
    {
        generatedSetterHelperImpl(description, DESCRIPTION$24, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Description" element
     */
    public com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle target = null;
            target = (com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle)get_store().insert_element_user(DESCRIPTION$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Description" element
     */
    public com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle target = null;
            target = (com.sap.xi.a1s.global.IdentifiedStocksDescriptionRequestBundle)get_store().add_element_user(DESCRIPTION$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "Description" element
     */
    public void removeDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$24, i);
        }
    }
    
    /**
     * Gets array of all "QuantityConversion" elements
     */
    public com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle[] getQuantityConversionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUANTITYCONVERSION$26, targetList);
            com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle[] result = new com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "QuantityConversion" element
     */
    public com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle getQuantityConversionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle target = null;
            target = (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle)get_store().find_element_user(QUANTITYCONVERSION$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "QuantityConversion" element
     */
    public int sizeOfQuantityConversionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITYCONVERSION$26);
        }
    }
    
    /**
     * Sets array of all "QuantityConversion" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setQuantityConversionArray(com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle[] quantityConversionArray)
    {
        check_orphaned();
        arraySetterHelper(quantityConversionArray, QUANTITYCONVERSION$26);
    }
    
    /**
     * Sets ith "QuantityConversion" element
     */
    public void setQuantityConversionArray(int i, com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle quantityConversion)
    {
        generatedSetterHelperImpl(quantityConversion, QUANTITYCONVERSION$26, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QuantityConversion" element
     */
    public com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle insertNewQuantityConversion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle target = null;
            target = (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle)get_store().insert_element_user(QUANTITYCONVERSION$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QuantityConversion" element
     */
    public com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle addNewQuantityConversion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle target = null;
            target = (com.sap.xi.a1s.global.IdentifiedStockQuantityConversionMaintainRequestBundle)get_store().add_element_user(QUANTITYCONVERSION$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "QuantityConversion" element
     */
    public void removeQuantityConversion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITYCONVERSION$26, i);
        }
    }
    
    /**
     * Gets the "actionCode" attribute
     */
    public com.sap.xi.ap.common.gdt.ActionCode.Enum getActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$28);
            if (target == null)
            {
                return null;
            }
            return (com.sap.xi.ap.common.gdt.ActionCode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "actionCode" attribute
     */
    public com.sap.xi.ap.common.gdt.ActionCode xgetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ActionCode target = null;
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$28);
            return target;
        }
    }
    
    /**
     * True if has "actionCode" attribute
     */
    public boolean isSetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTIONCODE$28) != null;
        }
    }
    
    /**
     * Sets the "actionCode" attribute
     */
    public void setActionCode(com.sap.xi.ap.common.gdt.ActionCode.Enum actionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIONCODE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIONCODE$28);
            }
            target.setEnumValue(actionCode);
        }
    }
    
    /**
     * Sets (as xml) the "actionCode" attribute
     */
    public void xsetActionCode(com.sap.xi.ap.common.gdt.ActionCode actionCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ActionCode target = null;
            target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().find_attribute_user(ACTIONCODE$28);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ActionCode)get_store().add_attribute_user(ACTIONCODE$28);
            }
            target.set(actionCode);
        }
    }
    
    /**
     * Unsets the "actionCode" attribute
     */
    public void unsetActionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTIONCODE$28);
        }
    }
    
    /**
     * Gets the "activateIdentifiedStockIndicator" attribute
     */
    public boolean getActivateIdentifiedStockIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVATEIDENTIFIEDSTOCKINDICATOR$30);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "activateIdentifiedStockIndicator" attribute
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetActivateIdentifiedStockIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(ACTIVATEIDENTIFIEDSTOCKINDICATOR$30);
            return target;
        }
    }
    
    /**
     * True if has "activateIdentifiedStockIndicator" attribute
     */
    public boolean isSetActivateIdentifiedStockIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTIVATEIDENTIFIEDSTOCKINDICATOR$30) != null;
        }
    }
    
    /**
     * Sets the "activateIdentifiedStockIndicator" attribute
     */
    public void setActivateIdentifiedStockIndicator(boolean activateIdentifiedStockIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVATEIDENTIFIEDSTOCKINDICATOR$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIVATEIDENTIFIEDSTOCKINDICATOR$30);
            }
            target.setBooleanValue(activateIdentifiedStockIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "activateIdentifiedStockIndicator" attribute
     */
    public void xsetActivateIdentifiedStockIndicator(com.sap.xi.ap.common.gdt.Indicator activateIdentifiedStockIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(ACTIVATEIDENTIFIEDSTOCKINDICATOR$30);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_attribute_user(ACTIVATEIDENTIFIEDSTOCKINDICATOR$30);
            }
            target.set(activateIdentifiedStockIndicator);
        }
    }
    
    /**
     * Unsets the "activateIdentifiedStockIndicator" attribute
     */
    public void unsetActivateIdentifiedStockIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTIVATEIDENTIFIEDSTOCKINDICATOR$30);
        }
    }
    
    /**
     * Gets the "blockIdentifiedStockIndicator" attribute
     */
    public boolean getBlockIdentifiedStockIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLOCKIDENTIFIEDSTOCKINDICATOR$32);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "blockIdentifiedStockIndicator" attribute
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetBlockIdentifiedStockIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(BLOCKIDENTIFIEDSTOCKINDICATOR$32);
            return target;
        }
    }
    
    /**
     * True if has "blockIdentifiedStockIndicator" attribute
     */
    public boolean isSetBlockIdentifiedStockIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BLOCKIDENTIFIEDSTOCKINDICATOR$32) != null;
        }
    }
    
    /**
     * Sets the "blockIdentifiedStockIndicator" attribute
     */
    public void setBlockIdentifiedStockIndicator(boolean blockIdentifiedStockIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLOCKIDENTIFIEDSTOCKINDICATOR$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLOCKIDENTIFIEDSTOCKINDICATOR$32);
            }
            target.setBooleanValue(blockIdentifiedStockIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "blockIdentifiedStockIndicator" attribute
     */
    public void xsetBlockIdentifiedStockIndicator(com.sap.xi.ap.common.gdt.Indicator blockIdentifiedStockIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(BLOCKIDENTIFIEDSTOCKINDICATOR$32);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_attribute_user(BLOCKIDENTIFIEDSTOCKINDICATOR$32);
            }
            target.set(blockIdentifiedStockIndicator);
        }
    }
    
    /**
     * Unsets the "blockIdentifiedStockIndicator" attribute
     */
    public void unsetBlockIdentifiedStockIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BLOCKIDENTIFIEDSTOCKINDICATOR$32);
        }
    }
    
    /**
     * Gets the "unblockIdentifiedStockIndicator" attribute
     */
    public boolean getUnblockIdentifiedStockIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNBLOCKIDENTIFIEDSTOCKINDICATOR$34);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "unblockIdentifiedStockIndicator" attribute
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetUnblockIdentifiedStockIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(UNBLOCKIDENTIFIEDSTOCKINDICATOR$34);
            return target;
        }
    }
    
    /**
     * True if has "unblockIdentifiedStockIndicator" attribute
     */
    public boolean isSetUnblockIdentifiedStockIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNBLOCKIDENTIFIEDSTOCKINDICATOR$34) != null;
        }
    }
    
    /**
     * Sets the "unblockIdentifiedStockIndicator" attribute
     */
    public void setUnblockIdentifiedStockIndicator(boolean unblockIdentifiedStockIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNBLOCKIDENTIFIEDSTOCKINDICATOR$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNBLOCKIDENTIFIEDSTOCKINDICATOR$34);
            }
            target.setBooleanValue(unblockIdentifiedStockIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "unblockIdentifiedStockIndicator" attribute
     */
    public void xsetUnblockIdentifiedStockIndicator(com.sap.xi.ap.common.gdt.Indicator unblockIdentifiedStockIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(UNBLOCKIDENTIFIEDSTOCKINDICATOR$34);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_attribute_user(UNBLOCKIDENTIFIEDSTOCKINDICATOR$34);
            }
            target.set(unblockIdentifiedStockIndicator);
        }
    }
    
    /**
     * Unsets the "unblockIdentifiedStockIndicator" attribute
     */
    public void unsetUnblockIdentifiedStockIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNBLOCKIDENTIFIEDSTOCKINDICATOR$34);
        }
    }
    
    /**
     * Gets the "setObsoleteIdentifiedStockIndicator" attribute
     */
    public boolean getSetObsoleteIdentifiedStockIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETOBSOLETEIDENTIFIEDSTOCKINDICATOR$36);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "setObsoleteIdentifiedStockIndicator" attribute
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetSetObsoleteIdentifiedStockIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(SETOBSOLETEIDENTIFIEDSTOCKINDICATOR$36);
            return target;
        }
    }
    
    /**
     * True if has "setObsoleteIdentifiedStockIndicator" attribute
     */
    public boolean isSetSetObsoleteIdentifiedStockIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SETOBSOLETEIDENTIFIEDSTOCKINDICATOR$36) != null;
        }
    }
    
    /**
     * Sets the "setObsoleteIdentifiedStockIndicator" attribute
     */
    public void setSetObsoleteIdentifiedStockIndicator(boolean setObsoleteIdentifiedStockIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SETOBSOLETEIDENTIFIEDSTOCKINDICATOR$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SETOBSOLETEIDENTIFIEDSTOCKINDICATOR$36);
            }
            target.setBooleanValue(setObsoleteIdentifiedStockIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "setObsoleteIdentifiedStockIndicator" attribute
     */
    public void xsetSetObsoleteIdentifiedStockIndicator(com.sap.xi.ap.common.gdt.Indicator setObsoleteIdentifiedStockIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(SETOBSOLETEIDENTIFIEDSTOCKINDICATOR$36);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_attribute_user(SETOBSOLETEIDENTIFIEDSTOCKINDICATOR$36);
            }
            target.set(setObsoleteIdentifiedStockIndicator);
        }
    }
    
    /**
     * Unsets the "setObsoleteIdentifiedStockIndicator" attribute
     */
    public void unsetSetObsoleteIdentifiedStockIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SETOBSOLETEIDENTIFIEDSTOCKINDICATOR$36);
        }
    }
    
    /**
     * Gets the "undoObsoleteIdentifiedStockIndicator" attribute
     */
    public boolean getUndoObsoleteIdentifiedStockIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNDOOBSOLETEIDENTIFIEDSTOCKINDICATOR$38);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "undoObsoleteIdentifiedStockIndicator" attribute
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetUndoObsoleteIdentifiedStockIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(UNDOOBSOLETEIDENTIFIEDSTOCKINDICATOR$38);
            return target;
        }
    }
    
    /**
     * True if has "undoObsoleteIdentifiedStockIndicator" attribute
     */
    public boolean isSetUndoObsoleteIdentifiedStockIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNDOOBSOLETEIDENTIFIEDSTOCKINDICATOR$38) != null;
        }
    }
    
    /**
     * Sets the "undoObsoleteIdentifiedStockIndicator" attribute
     */
    public void setUndoObsoleteIdentifiedStockIndicator(boolean undoObsoleteIdentifiedStockIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNDOOBSOLETEIDENTIFIEDSTOCKINDICATOR$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNDOOBSOLETEIDENTIFIEDSTOCKINDICATOR$38);
            }
            target.setBooleanValue(undoObsoleteIdentifiedStockIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "undoObsoleteIdentifiedStockIndicator" attribute
     */
    public void xsetUndoObsoleteIdentifiedStockIndicator(com.sap.xi.ap.common.gdt.Indicator undoObsoleteIdentifiedStockIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(UNDOOBSOLETEIDENTIFIEDSTOCKINDICATOR$38);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_attribute_user(UNDOOBSOLETEIDENTIFIEDSTOCKINDICATOR$38);
            }
            target.set(undoObsoleteIdentifiedStockIndicator);
        }
    }
    
    /**
     * Unsets the "undoObsoleteIdentifiedStockIndicator" attribute
     */
    public void unsetUndoObsoleteIdentifiedStockIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNDOOBSOLETEIDENTIFIEDSTOCKINDICATOR$38);
        }
    }
    
    /**
     * Gets the "descriptionListCompleteTransmissionIndicator" attribute
     */
    public boolean getDescriptionListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTIONLISTCOMPLETETRANSMISSIONINDICATOR$40);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "descriptionListCompleteTransmissionIndicator" attribute
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetDescriptionListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(DESCRIPTIONLISTCOMPLETETRANSMISSIONINDICATOR$40);
            return target;
        }
    }
    
    /**
     * True if has "descriptionListCompleteTransmissionIndicator" attribute
     */
    public boolean isSetDescriptionListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DESCRIPTIONLISTCOMPLETETRANSMISSIONINDICATOR$40) != null;
        }
    }
    
    /**
     * Sets the "descriptionListCompleteTransmissionIndicator" attribute
     */
    public void setDescriptionListCompleteTransmissionIndicator(boolean descriptionListCompleteTransmissionIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTIONLISTCOMPLETETRANSMISSIONINDICATOR$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTIONLISTCOMPLETETRANSMISSIONINDICATOR$40);
            }
            target.setBooleanValue(descriptionListCompleteTransmissionIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "descriptionListCompleteTransmissionIndicator" attribute
     */
    public void xsetDescriptionListCompleteTransmissionIndicator(com.sap.xi.ap.common.gdt.Indicator descriptionListCompleteTransmissionIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(DESCRIPTIONLISTCOMPLETETRANSMISSIONINDICATOR$40);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_attribute_user(DESCRIPTIONLISTCOMPLETETRANSMISSIONINDICATOR$40);
            }
            target.set(descriptionListCompleteTransmissionIndicator);
        }
    }
    
    /**
     * Unsets the "descriptionListCompleteTransmissionIndicator" attribute
     */
    public void unsetDescriptionListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DESCRIPTIONLISTCOMPLETETRANSMISSIONINDICATOR$40);
        }
    }
    
    /**
     * Gets the "quantityConversionListCompleteTransmissionIndicator" attribute
     */
    public boolean getQuantityConversionListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUANTITYCONVERSIONLISTCOMPLETETRANSMISSIONINDICATOR$42);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "quantityConversionListCompleteTransmissionIndicator" attribute
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetQuantityConversionListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(QUANTITYCONVERSIONLISTCOMPLETETRANSMISSIONINDICATOR$42);
            return target;
        }
    }
    
    /**
     * True if has "quantityConversionListCompleteTransmissionIndicator" attribute
     */
    public boolean isSetQuantityConversionListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(QUANTITYCONVERSIONLISTCOMPLETETRANSMISSIONINDICATOR$42) != null;
        }
    }
    
    /**
     * Sets the "quantityConversionListCompleteTransmissionIndicator" attribute
     */
    public void setQuantityConversionListCompleteTransmissionIndicator(boolean quantityConversionListCompleteTransmissionIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUANTITYCONVERSIONLISTCOMPLETETRANSMISSIONINDICATOR$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUANTITYCONVERSIONLISTCOMPLETETRANSMISSIONINDICATOR$42);
            }
            target.setBooleanValue(quantityConversionListCompleteTransmissionIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "quantityConversionListCompleteTransmissionIndicator" attribute
     */
    public void xsetQuantityConversionListCompleteTransmissionIndicator(com.sap.xi.ap.common.gdt.Indicator quantityConversionListCompleteTransmissionIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_attribute_user(QUANTITYCONVERSIONLISTCOMPLETETRANSMISSIONINDICATOR$42);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_attribute_user(QUANTITYCONVERSIONLISTCOMPLETETRANSMISSIONINDICATOR$42);
            }
            target.set(quantityConversionListCompleteTransmissionIndicator);
        }
    }
    
    /**
     * Unsets the "quantityConversionListCompleteTransmissionIndicator" attribute
     */
    public void unsetQuantityConversionListCompleteTransmissionIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(QUANTITYCONVERSIONLISTCOMPLETETRANSMISSIONINDICATOR$42);
        }
    }
}

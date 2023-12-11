/*
 * XML Type:  ManageIdentifiedStocksResponse
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ManageIdentifiedStocksResponse
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ManageIdentifiedStocksResponse(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ManageIdentifiedStocksResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ManageIdentifiedStocksResponse
{
    private static final long serialVersionUID = 1L;
    
    public ManageIdentifiedStocksResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
}

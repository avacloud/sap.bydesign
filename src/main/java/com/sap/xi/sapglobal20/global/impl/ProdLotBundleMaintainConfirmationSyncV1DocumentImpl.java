/*
 * An XML document type.
 * Localname: ProdLotBundleMaintainConfirmation_sync_V1
 * Namespace: http://sap.com/xi/SAPGlobal20/Global
 * Java type: com.sap.xi.sapglobal20.global.ProdLotBundleMaintainConfirmationSyncV1Document
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.sapglobal20.global.impl;
/**
 * A document containing one ProdLotBundleMaintainConfirmation_sync_V1(@http://sap.com/xi/SAPGlobal20/Global) element.
 *
 * This is a complex type.
 */
public class ProdLotBundleMaintainConfirmationSyncV1DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.sapglobal20.global.ProdLotBundleMaintainConfirmationSyncV1Document
{
    private static final long serialVersionUID = 1L;
    
    public ProdLotBundleMaintainConfirmationSyncV1DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODLOTBUNDLEMAINTAINCONFIRMATIONSYNCV1$0 = 
        new javax.xml.namespace.QName("http://sap.com/xi/SAPGlobal20/Global", "ProdLotBundleMaintainConfirmation_sync_V1");
    
    
    /**
     * Gets the "ProdLotBundleMaintainConfirmation_sync_V1" element
     */
    public com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync getProdLotBundleMaintainConfirmationSyncV1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync target = null;
            target = (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync)get_store().find_element_user(PRODLOTBUNDLEMAINTAINCONFIRMATIONSYNCV1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProdLotBundleMaintainConfirmation_sync_V1" element
     */
    public void setProdLotBundleMaintainConfirmationSyncV1(com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync prodLotBundleMaintainConfirmationSyncV1)
    {
        generatedSetterHelperImpl(prodLotBundleMaintainConfirmationSyncV1, PRODLOTBUNDLEMAINTAINCONFIRMATIONSYNCV1$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProdLotBundleMaintainConfirmation_sync_V1" element
     */
    public com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync addNewProdLotBundleMaintainConfirmationSyncV1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync target = null;
            target = (com.sap.xi.a1s.global.ProductionLotBundleMaintainConfirmationMessageSync)get_store().add_element_user(PRODLOTBUNDLEMAINTAINCONFIRMATIONSYNCV1$0);
            return target;
        }
    }
}

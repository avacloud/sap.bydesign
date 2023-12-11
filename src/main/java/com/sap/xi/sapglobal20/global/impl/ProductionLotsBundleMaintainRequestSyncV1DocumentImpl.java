/*
 * An XML document type.
 * Localname: ProductionLotsBundleMaintainRequest_sync_V1
 * Namespace: http://sap.com/xi/SAPGlobal20/Global
 * Java type: com.sap.xi.sapglobal20.global.ProductionLotsBundleMaintainRequestSyncV1Document
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.sapglobal20.global.impl;
/**
 * A document containing one ProductionLotsBundleMaintainRequest_sync_V1(@http://sap.com/xi/SAPGlobal20/Global) element.
 *
 * This is a complex type.
 */
public class ProductionLotsBundleMaintainRequestSyncV1DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.sapglobal20.global.ProductionLotsBundleMaintainRequestSyncV1Document
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotsBundleMaintainRequestSyncV1DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTIONLOTSBUNDLEMAINTAINREQUESTSYNCV1$0 = 
        new javax.xml.namespace.QName("http://sap.com/xi/SAPGlobal20/Global", "ProductionLotsBundleMaintainRequest_sync_V1");
    
    
    /**
     * Gets the "ProductionLotsBundleMaintainRequest_sync_V1" element
     */
    public com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMessageSyncV1 getProductionLotsBundleMaintainRequestSyncV1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMessageSyncV1 target = null;
            target = (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMessageSyncV1)get_store().find_element_user(PRODUCTIONLOTSBUNDLEMAINTAINREQUESTSYNCV1$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProductionLotsBundleMaintainRequest_sync_V1" element
     */
    public void setProductionLotsBundleMaintainRequestSyncV1(com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMessageSyncV1 productionLotsBundleMaintainRequestSyncV1)
    {
        generatedSetterHelperImpl(productionLotsBundleMaintainRequestSyncV1, PRODUCTIONLOTSBUNDLEMAINTAINREQUESTSYNCV1$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductionLotsBundleMaintainRequest_sync_V1" element
     */
    public com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMessageSyncV1 addNewProductionLotsBundleMaintainRequestSyncV1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMessageSyncV1 target = null;
            target = (com.sap.xi.a1s.global.ProdLotMaintainRequestBundleMessageSyncV1)get_store().add_element_user(PRODUCTIONLOTSBUNDLEMAINTAINREQUESTSYNCV1$0);
            return target;
        }
    }
}

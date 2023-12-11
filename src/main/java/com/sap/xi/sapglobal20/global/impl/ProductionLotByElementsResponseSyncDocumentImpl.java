/*
 * An XML document type.
 * Localname: ProductionLotByElementsResponse_sync
 * Namespace: http://sap.com/xi/SAPGlobal20/Global
 * Java type: com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.sapglobal20.global.impl;
/**
 * A document containing one ProductionLotByElementsResponse_sync(@http://sap.com/xi/SAPGlobal20/Global) element.
 *
 * This is a complex type.
 */
public class ProductionLotByElementsResponseSyncDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.sapglobal20.global.ProductionLotByElementsResponseSyncDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotByElementsResponseSyncDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTIONLOTBYELEMENTSRESPONSESYNC$0 = 
        new javax.xml.namespace.QName("http://sap.com/xi/SAPGlobal20/Global", "ProductionLotByElementsResponse_sync");
    
    
    /**
     * Gets the "ProductionLotByElementsResponse_sync" element
     */
    public com.sap.xi.a1s.global.ProductionLotResponseMessageSync getProductionLotByElementsResponseSync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotResponseMessageSync target = null;
            target = (com.sap.xi.a1s.global.ProductionLotResponseMessageSync)get_store().find_element_user(PRODUCTIONLOTBYELEMENTSRESPONSESYNC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProductionLotByElementsResponse_sync" element
     */
    public void setProductionLotByElementsResponseSync(com.sap.xi.a1s.global.ProductionLotResponseMessageSync productionLotByElementsResponseSync)
    {
        generatedSetterHelperImpl(productionLotByElementsResponseSync, PRODUCTIONLOTBYELEMENTSRESPONSESYNC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductionLotByElementsResponse_sync" element
     */
    public com.sap.xi.a1s.global.ProductionLotResponseMessageSync addNewProductionLotByElementsResponseSync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotResponseMessageSync target = null;
            target = (com.sap.xi.a1s.global.ProductionLotResponseMessageSync)get_store().add_element_user(PRODUCTIONLOTBYELEMENTSRESPONSESYNC$0);
            return target;
        }
    }
}

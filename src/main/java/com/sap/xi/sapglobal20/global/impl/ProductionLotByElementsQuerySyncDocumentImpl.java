/*
 * An XML document type.
 * Localname: ProductionLotByElementsQuery_sync
 * Namespace: http://sap.com/xi/SAPGlobal20/Global
 * Java type: com.sap.xi.sapglobal20.global.ProductionLotByElementsQuerySyncDocument
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.sapglobal20.global.impl;
/**
 * A document containing one ProductionLotByElementsQuery_sync(@http://sap.com/xi/SAPGlobal20/Global) element.
 *
 * This is a complex type.
 */
public class ProductionLotByElementsQuerySyncDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.sapglobal20.global.ProductionLotByElementsQuerySyncDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotByElementsQuerySyncDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTIONLOTBYELEMENTSQUERYSYNC$0 = 
        new javax.xml.namespace.QName("http://sap.com/xi/SAPGlobal20/Global", "ProductionLotByElementsQuery_sync");
    
    
    /**
     * Gets the "ProductionLotByElementsQuery_sync" element
     */
    public com.sap.xi.a1s.global.ProductionLotByElementsQueryMessage getProductionLotByElementsQuerySync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotByElementsQueryMessage target = null;
            target = (com.sap.xi.a1s.global.ProductionLotByElementsQueryMessage)get_store().find_element_user(PRODUCTIONLOTBYELEMENTSQUERYSYNC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ProductionLotByElementsQuery_sync" element
     */
    public void setProductionLotByElementsQuerySync(com.sap.xi.a1s.global.ProductionLotByElementsQueryMessage productionLotByElementsQuerySync)
    {
        generatedSetterHelperImpl(productionLotByElementsQuerySync, PRODUCTIONLOTBYELEMENTSQUERYSYNC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductionLotByElementsQuery_sync" element
     */
    public com.sap.xi.a1s.global.ProductionLotByElementsQueryMessage addNewProductionLotByElementsQuerySync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.ProductionLotByElementsQueryMessage target = null;
            target = (com.sap.xi.a1s.global.ProductionLotByElementsQueryMessage)get_store().add_element_user(PRODUCTIONLOTBYELEMENTSQUERYSYNC$0);
            return target;
        }
    }
}

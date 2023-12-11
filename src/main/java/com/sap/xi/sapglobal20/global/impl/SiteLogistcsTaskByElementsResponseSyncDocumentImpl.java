/*
 * An XML document type.
 * Localname: SiteLogistcsTaskByElementsResponse_sync
 * Namespace: http://sap.com/xi/SAPGlobal20/Global
 * Java type: com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.sapglobal20.global.impl;
/**
 * A document containing one SiteLogistcsTaskByElementsResponse_sync(@http://sap.com/xi/SAPGlobal20/Global) element.
 *
 * This is a complex type.
 */
public class SiteLogistcsTaskByElementsResponseSyncDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.sapglobal20.global.SiteLogistcsTaskByElementsResponseSyncDocument
{
    private static final long serialVersionUID = 1L;
    
    public SiteLogistcsTaskByElementsResponseSyncDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SITELOGISTCSTASKBYELEMENTSRESPONSESYNC$0 = 
        new javax.xml.namespace.QName("http://sap.com/xi/SAPGlobal20/Global", "SiteLogistcsTaskByElementsResponse_sync");
    
    
    /**
     * Gets the "SiteLogistcsTaskByElementsResponse_sync" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskResponseMessageSync getSiteLogistcsTaskByElementsResponseSync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskResponseMessageSync target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskResponseMessageSync)get_store().find_element_user(SITELOGISTCSTASKBYELEMENTSRESPONSESYNC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SiteLogistcsTaskByElementsResponse_sync" element
     */
    public void setSiteLogistcsTaskByElementsResponseSync(com.sap.xi.a1s.global.SiteLogisticsTaskResponseMessageSync siteLogistcsTaskByElementsResponseSync)
    {
        generatedSetterHelperImpl(siteLogistcsTaskByElementsResponseSync, SITELOGISTCSTASKBYELEMENTSRESPONSESYNC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SiteLogistcsTaskByElementsResponse_sync" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskResponseMessageSync addNewSiteLogistcsTaskByElementsResponseSync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskResponseMessageSync target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskResponseMessageSync)get_store().add_element_user(SITELOGISTCSTASKBYELEMENTSRESPONSESYNC$0);
            return target;
        }
    }
}

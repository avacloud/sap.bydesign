/*
 * An XML document type.
 * Localname: SiteLogisticsTaskByElementsQuery_sync
 * Namespace: http://sap.com/xi/SAPGlobal20/Global
 * Java type: com.sap.xi.sapglobal20.global.SiteLogisticsTaskByElementsQuerySyncDocument
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.sapglobal20.global.impl;
/**
 * A document containing one SiteLogisticsTaskByElementsQuery_sync(@http://sap.com/xi/SAPGlobal20/Global) element.
 *
 * This is a complex type.
 */
public class SiteLogisticsTaskByElementsQuerySyncDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.sapglobal20.global.SiteLogisticsTaskByElementsQuerySyncDocument
{
    private static final long serialVersionUID = 1L;
    
    public SiteLogisticsTaskByElementsQuerySyncDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SITELOGISTICSTASKBYELEMENTSQUERYSYNC$0 = 
        new javax.xml.namespace.QName("http://sap.com/xi/SAPGlobal20/Global", "SiteLogisticsTaskByElementsQuery_sync");
    
    
    /**
     * Gets the "SiteLogisticsTaskByElementsQuery_sync" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskByElementsQueryMessage getSiteLogisticsTaskByElementsQuerySync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskByElementsQueryMessage target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskByElementsQueryMessage)get_store().find_element_user(SITELOGISTICSTASKBYELEMENTSQUERYSYNC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SiteLogisticsTaskByElementsQuery_sync" element
     */
    public void setSiteLogisticsTaskByElementsQuerySync(com.sap.xi.a1s.global.SiteLogisticsTaskByElementsQueryMessage siteLogisticsTaskByElementsQuerySync)
    {
        generatedSetterHelperImpl(siteLogisticsTaskByElementsQuerySync, SITELOGISTICSTASKBYELEMENTSQUERYSYNC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SiteLogisticsTaskByElementsQuery_sync" element
     */
    public com.sap.xi.a1s.global.SiteLogisticsTaskByElementsQueryMessage addNewSiteLogisticsTaskByElementsQuerySync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.SiteLogisticsTaskByElementsQueryMessage target = null;
            target = (com.sap.xi.a1s.global.SiteLogisticsTaskByElementsQueryMessage)get_store().add_element_user(SITELOGISTICSTASKBYELEMENTSQUERYSYNC$0);
            return target;
        }
    }
}

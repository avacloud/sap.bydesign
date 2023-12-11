/*
 * An XML document type.
 * Localname: MaterialByElementsResponse_sync
 * Namespace: http://sap.com/xi/SAPGlobal20/Global
 * Java type: com.sap.xi.sapglobal20.global.MaterialByElementsResponseSyncDocument
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.sapglobal20.global.impl;
/**
 * A document containing one MaterialByElementsResponse_sync(@http://sap.com/xi/SAPGlobal20/Global) element.
 *
 * This is a complex type.
 */
public class MaterialByElementsResponseSyncDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.sapglobal20.global.MaterialByElementsResponseSyncDocument
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsResponseSyncDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MATERIALBYELEMENTSRESPONSESYNC$0 = 
        new javax.xml.namespace.QName("http://sap.com/xi/SAPGlobal20/Global", "MaterialByElementsResponse_sync");
    
    
    /**
     * Gets the "MaterialByElementsResponse_sync" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync getMaterialByElementsResponseSync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync)get_store().find_element_user(MATERIALBYELEMENTSRESPONSESYNC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MaterialByElementsResponse_sync" element
     */
    public void setMaterialByElementsResponseSync(com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync materialByElementsResponseSync)
    {
        generatedSetterHelperImpl(materialByElementsResponseSync, MATERIALBYELEMENTSRESPONSESYNC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MaterialByElementsResponse_sync" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync addNewMaterialByElementsResponseSync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMessageSync)get_store().add_element_user(MATERIALBYELEMENTSRESPONSESYNC$0);
            return target;
        }
    }
}

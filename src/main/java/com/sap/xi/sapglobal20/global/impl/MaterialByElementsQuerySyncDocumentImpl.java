/*
 * An XML document type.
 * Localname: MaterialByElementsQuery_sync
 * Namespace: http://sap.com/xi/SAPGlobal20/Global
 * Java type: com.sap.xi.sapglobal20.global.MaterialByElementsQuerySyncDocument
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.sapglobal20.global.impl;
/**
 * A document containing one MaterialByElementsQuery_sync(@http://sap.com/xi/SAPGlobal20/Global) element.
 *
 * This is a complex type.
 */
public class MaterialByElementsQuerySyncDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.sapglobal20.global.MaterialByElementsQuerySyncDocument
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsQuerySyncDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MATERIALBYELEMENTSQUERYSYNC$0 = 
        new javax.xml.namespace.QName("http://sap.com/xi/SAPGlobal20/Global", "MaterialByElementsQuery_sync");
    
    
    /**
     * Gets the "MaterialByElementsQuery_sync" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync getMaterialByElementsQuerySync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync)get_store().find_element_user(MATERIALBYELEMENTSQUERYSYNC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MaterialByElementsQuery_sync" element
     */
    public void setMaterialByElementsQuerySync(com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync materialByElementsQuerySync)
    {
        generatedSetterHelperImpl(materialByElementsQuerySync, MATERIALBYELEMENTSQUERYSYNC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MaterialByElementsQuery_sync" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync addNewMaterialByElementsQuerySync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsQueryMessageSync)get_store().add_element_user(MATERIALBYELEMENTSQUERYSYNC$0);
            return target;
        }
    }
}

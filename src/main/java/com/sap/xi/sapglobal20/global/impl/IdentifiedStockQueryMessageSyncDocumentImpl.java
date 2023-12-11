/*
 * An XML document type.
 * Localname: IdentifiedStockQueryMessage_sync
 * Namespace: http://sap.com/xi/SAPGlobal20/Global
 * Java type: com.sap.xi.sapglobal20.global.IdentifiedStockQueryMessageSyncDocument
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.sapglobal20.global.impl;
/**
 * A document containing one IdentifiedStockQueryMessage_sync(@http://sap.com/xi/SAPGlobal20/Global) element.
 *
 * This is a complex type.
 */
public class IdentifiedStockQueryMessageSyncDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.sapglobal20.global.IdentifiedStockQueryMessageSyncDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdentifiedStockQueryMessageSyncDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIEDSTOCKQUERYMESSAGESYNC$0 = 
        new javax.xml.namespace.QName("http://sap.com/xi/SAPGlobal20/Global", "IdentifiedStockQueryMessage_sync");
    
    
    /**
     * Gets the "IdentifiedStockQueryMessage_sync" element
     */
    public com.sap.xi.a1s.global.IdentifiedStockQueryMessageSync getIdentifiedStockQueryMessageSync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.IdentifiedStockQueryMessageSync target = null;
            target = (com.sap.xi.a1s.global.IdentifiedStockQueryMessageSync)get_store().find_element_user(IDENTIFIEDSTOCKQUERYMESSAGESYNC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IdentifiedStockQueryMessage_sync" element
     */
    public void setIdentifiedStockQueryMessageSync(com.sap.xi.a1s.global.IdentifiedStockQueryMessageSync identifiedStockQueryMessageSync)
    {
        generatedSetterHelperImpl(identifiedStockQueryMessageSync, IDENTIFIEDSTOCKQUERYMESSAGESYNC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IdentifiedStockQueryMessage_sync" element
     */
    public com.sap.xi.a1s.global.IdentifiedStockQueryMessageSync addNewIdentifiedStockQueryMessageSync()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.IdentifiedStockQueryMessageSync target = null;
            target = (com.sap.xi.a1s.global.IdentifiedStockQueryMessageSync)get_store().add_element_user(IDENTIFIEDSTOCKQUERYMESSAGESYNC$0);
            return target;
        }
    }
}

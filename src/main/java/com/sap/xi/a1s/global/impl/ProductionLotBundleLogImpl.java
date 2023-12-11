/*
 * XML Type:  ProductionLotBundleLog
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotBundleLog
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML ProductionLotBundleLog(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class ProductionLotBundleLogImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.ProductionLotBundleLog
{
    private static final long serialVersionUID = 1L;
    
    public ProductionLotBundleLogImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NODENAME$0 = 
        new javax.xml.namespace.QName("", "NodeName");
    private static final javax.xml.namespace.QName NODEID$2 = 
        new javax.xml.namespace.QName("", "NodeID");
    private static final javax.xml.namespace.QName SEVERITYCODE$4 = 
        new javax.xml.namespace.QName("", "SeverityCode");
    private static final javax.xml.namespace.QName NOTE$6 = 
        new javax.xml.namespace.QName("", "Note");
    
    
    /**
     * Gets the "NodeName" element
     */
    public java.lang.String getNodeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NODENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NodeName" element
     */
    public com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTMEDIUMName xgetNodeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTMEDIUMName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTMEDIUMName)get_store().find_element_user(NODENAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "NodeName" element
     */
    public boolean isSetNodeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NODENAME$0) != 0;
        }
    }
    
    /**
     * Sets the "NodeName" element
     */
    public void setNodeName(java.lang.String nodeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NODENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NODENAME$0);
            }
            target.setStringValue(nodeName);
        }
    }
    
    /**
     * Sets (as xml) the "NodeName" element
     */
    public void xsetNodeName(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTMEDIUMName nodeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTMEDIUMName target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTMEDIUMName)get_store().find_element_user(NODENAME$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTMEDIUMName)get_store().add_element_user(NODENAME$0);
            }
            target.set(nodeName);
        }
    }
    
    /**
     * Unsets the "NodeName" element
     */
    public void unsetNodeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NODENAME$0, 0);
        }
    }
    
    /**
     * Gets the "NodeID" element
     */
    public java.lang.String getNodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NODEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NodeID" element
     */
    public com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID xgetNodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID)get_store().find_element_user(NODEID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "NodeID" element
     */
    public boolean isSetNodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NODEID$2) != 0;
        }
    }
    
    /**
     * Sets the "NodeID" element
     */
    public void setNodeID(java.lang.String nodeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NODEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NODEID$2);
            }
            target.setStringValue(nodeID);
        }
    }
    
    /**
     * Sets (as xml) the "NodeID" element
     */
    public void xsetNodeID(com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID nodeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID target = null;
            target = (com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID)get_store().find_element_user(NODEID$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ObjectNodePartyTechnicalID)get_store().add_element_user(NODEID$2);
            }
            target.set(nodeID);
        }
    }
    
    /**
     * Unsets the "NodeID" element
     */
    public void unsetNodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NODEID$2, 0);
        }
    }
    
    /**
     * Gets the "SeverityCode" element
     */
    public java.lang.String getSeverityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEVERITYCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SeverityCode" element
     */
    public com.sap.xi.ap.common.gdt.LogItemSeverityCode xgetSeverityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemSeverityCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemSeverityCode)get_store().find_element_user(SEVERITYCODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "SeverityCode" element
     */
    public boolean isSetSeverityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEVERITYCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "SeverityCode" element
     */
    public void setSeverityCode(java.lang.String severityCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEVERITYCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEVERITYCODE$4);
            }
            target.setStringValue(severityCode);
        }
    }
    
    /**
     * Sets (as xml) the "SeverityCode" element
     */
    public void xsetSeverityCode(com.sap.xi.ap.common.gdt.LogItemSeverityCode severityCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemSeverityCode target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemSeverityCode)get_store().find_element_user(SEVERITYCODE$4, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogItemSeverityCode)get_store().add_element_user(SEVERITYCODE$4);
            }
            target.set(severityCode);
        }
    }
    
    /**
     * Unsets the "SeverityCode" element
     */
    public void unsetSeverityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEVERITYCODE$4, 0);
        }
    }
    
    /**
     * Gets the "Note" element
     */
    public java.lang.String getNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Note" element
     */
    public com.sap.xi.ap.common.gdt.LogItemNote xgetNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemNote target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemNote)get_store().find_element_user(NOTE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Note" element
     */
    public boolean isSetNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTE$6) != 0;
        }
    }
    
    /**
     * Sets the "Note" element
     */
    public void setNote(java.lang.String note)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTE$6);
            }
            target.setStringValue(note);
        }
    }
    
    /**
     * Sets (as xml) the "Note" element
     */
    public void xsetNote(com.sap.xi.ap.common.gdt.LogItemNote note)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LogItemNote target = null;
            target = (com.sap.xi.ap.common.gdt.LogItemNote)get_store().find_element_user(NOTE$6, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LogItemNote)get_store().add_element_user(NOTE$6);
            }
            target.set(note);
        }
    }
    
    /**
     * Unsets the "Note" element
     */
    public void unsetNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTE$6, 0);
        }
    }
}

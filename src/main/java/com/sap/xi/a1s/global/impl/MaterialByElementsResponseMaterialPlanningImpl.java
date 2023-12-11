/*
 * XML Type:  MaterialByElementsResponseMaterialPlanning
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPlanning
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML MaterialByElementsResponseMaterialPlanning(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class MaterialByElementsResponseMaterialPlanningImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.MaterialByElementsResponseMaterialPlanning
{
    private static final long serialVersionUID = 1L;
    
    public MaterialByElementsResponseMaterialPlanningImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORECASTCATEGORYID$0 = 
        new javax.xml.namespace.QName("", "ForecastCategoryID");
    private static final javax.xml.namespace.QName SUPPLYPLANNING$2 = 
        new javax.xml.namespace.QName("", "SupplyPlanning");
    
    
    /**
     * Gets the "ForecastCategoryID" element
     */
    public java.lang.String getForecastCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORECASTCATEGORYID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ForecastCategoryID" element
     */
    public com.sap.xi.ap.common.gdt.ProductCategoryInternalID xgetForecastCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductCategoryInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductCategoryInternalID)get_store().find_element_user(FORECASTCATEGORYID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ForecastCategoryID" element
     */
    public boolean isSetForecastCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORECASTCATEGORYID$0) != 0;
        }
    }
    
    /**
     * Sets the "ForecastCategoryID" element
     */
    public void setForecastCategoryID(java.lang.String forecastCategoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORECASTCATEGORYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORECASTCATEGORYID$0);
            }
            target.setStringValue(forecastCategoryID);
        }
    }
    
    /**
     * Sets (as xml) the "ForecastCategoryID" element
     */
    public void xsetForecastCategoryID(com.sap.xi.ap.common.gdt.ProductCategoryInternalID forecastCategoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductCategoryInternalID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductCategoryInternalID)get_store().find_element_user(FORECASTCATEGORYID$0, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.ProductCategoryInternalID)get_store().add_element_user(FORECASTCATEGORYID$0);
            }
            target.set(forecastCategoryID);
        }
    }
    
    /**
     * Unsets the "ForecastCategoryID" element
     */
    public void unsetForecastCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORECASTCATEGORYID$0, 0);
        }
    }
    
    /**
     * Gets array of all "SupplyPlanning" elements
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning[] getSupplyPlanningArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUPPLYPLANNING$2, targetList);
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning[] result = new com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SupplyPlanning" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning getSupplyPlanningArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning)get_store().find_element_user(SUPPLYPLANNING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SupplyPlanning" element
     */
    public int sizeOfSupplyPlanningArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLYPLANNING$2);
        }
    }
    
    /**
     * Sets array of all "SupplyPlanning" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSupplyPlanningArray(com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning[] supplyPlanningArray)
    {
        check_orphaned();
        arraySetterHelper(supplyPlanningArray, SUPPLYPLANNING$2);
    }
    
    /**
     * Sets ith "SupplyPlanning" element
     */
    public void setSupplyPlanningArray(int i, com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning supplyPlanning)
    {
        generatedSetterHelperImpl(supplyPlanning, SUPPLYPLANNING$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SupplyPlanning" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning insertNewSupplyPlanning(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning)get_store().insert_element_user(SUPPLYPLANNING$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SupplyPlanning" element
     */
    public com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning addNewSupplyPlanning()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning target = null;
            target = (com.sap.xi.a1s.global.MaterialByElementsResponseMaterialSupplyPlanning)get_store().add_element_user(SUPPLYPLANNING$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "SupplyPlanning" element
     */
    public void removeSupplyPlanning(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLYPLANNING$2, i);
        }
    }
}

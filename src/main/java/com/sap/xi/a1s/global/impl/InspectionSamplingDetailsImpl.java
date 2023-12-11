/*
 * XML Type:  InspectionSamplingDetails
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.InspectionSamplingDetails
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global.impl;
/**
 * An XML InspectionSamplingDetails(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public class InspectionSamplingDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sap.xi.a1s.global.InspectionSamplingDetails
{
    private static final long serialVersionUID = 1L;
    
    public InspectionSamplingDetailsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTID$0 = 
        new javax.xml.namespace.QName("", "ProductId");
    private static final javax.xml.namespace.QName PRODUCTDESCRIPTION$2 = 
        new javax.xml.namespace.QName("", "ProductDescription");
    private static final javax.xml.namespace.QName IDENTIFIEDSTOCKID$4 = 
        new javax.xml.namespace.QName("", "IdentifiedStockId");
    private static final javax.xml.namespace.QName IDENTIFIEDSTOCKTYPE$6 = 
        new javax.xml.namespace.QName("", "IdentifiedStockType");
    private static final javax.xml.namespace.QName LOTQUANTITY$8 = 
        new javax.xml.namespace.QName("", "LotQuantity");
    private static final javax.xml.namespace.QName LOTSIZE$10 = 
        new javax.xml.namespace.QName("", "LotSize");
    private static final javax.xml.namespace.QName SAMPLESIZE$12 = 
        new javax.xml.namespace.QName("", "SampleSize");
    private static final javax.xml.namespace.QName SAMPLEQUANTITY$14 = 
        new javax.xml.namespace.QName("", "SampleQuantity");
    private static final javax.xml.namespace.QName SAMPLERECORDS$16 = 
        new javax.xml.namespace.QName("", "SampleRecords");
    
    
    /**
     * Gets the "ProductId" element
     */
    public com.sap.xi.ap.common.gdt.ProductID getProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductID)get_store().find_element_user(PRODUCTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProductId" element
     */
    public boolean isSetProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTID$0) != 0;
        }
    }
    
    /**
     * Sets the "ProductId" element
     */
    public void setProductId(com.sap.xi.ap.common.gdt.ProductID productId)
    {
        generatedSetterHelperImpl(productId, PRODUCTID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ProductId" element
     */
    public com.sap.xi.ap.common.gdt.ProductID addNewProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.ProductID target = null;
            target = (com.sap.xi.ap.common.gdt.ProductID)get_store().add_element_user(PRODUCTID$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ProductId" element
     */
    public void unsetProductId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTID$0, 0);
        }
    }
    
    /**
     * Gets the "ProductDescription" element
     */
    public java.lang.String getProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTDESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProductDescription" element
     */
    public com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTSHORTDescription xgetProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTSHORTDescription target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTSHORTDescription)get_store().find_element_user(PRODUCTDESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProductDescription" element
     */
    public boolean isSetProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTDESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "ProductDescription" element
     */
    public void setProductDescription(java.lang.String productDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTDESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTDESCRIPTION$2);
            }
            target.setStringValue(productDescription);
        }
    }
    
    /**
     * Sets (as xml) the "ProductDescription" element
     */
    public void xsetProductDescription(com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTSHORTDescription productDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTSHORTDescription target = null;
            target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTSHORTDescription)get_store().find_element_user(PRODUCTDESCRIPTION$2, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.LANGUAGEINDEPENDENTSHORTDescription)get_store().add_element_user(PRODUCTDESCRIPTION$2);
            }
            target.set(productDescription);
        }
    }
    
    /**
     * Unsets the "ProductDescription" element
     */
    public void unsetProductDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTDESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets the "IdentifiedStockId" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockID getIdentifiedStockId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockID target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID)get_store().find_element_user(IDENTIFIEDSTOCKID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IdentifiedStockId" element
     */
    public boolean isSetIdentifiedStockId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIEDSTOCKID$4) != 0;
        }
    }
    
    /**
     * Sets the "IdentifiedStockId" element
     */
    public void setIdentifiedStockId(com.sap.xi.ap.common.gdt.IdentifiedStockID identifiedStockId)
    {
        generatedSetterHelperImpl(identifiedStockId, IDENTIFIEDSTOCKID$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IdentifiedStockId" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockID addNewIdentifiedStockId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockID target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockID)get_store().add_element_user(IDENTIFIEDSTOCKID$4);
            return target;
        }
    }
    
    /**
     * Unsets the "IdentifiedStockId" element
     */
    public void unsetIdentifiedStockId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIEDSTOCKID$4, 0);
        }
    }
    
    /**
     * Gets the "IdentifiedStockType" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode getIdentifiedStockType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode)get_store().find_element_user(IDENTIFIEDSTOCKTYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IdentifiedStockType" element
     */
    public boolean isSetIdentifiedStockType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIEDSTOCKTYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "IdentifiedStockType" element
     */
    public void setIdentifiedStockType(com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode identifiedStockType)
    {
        generatedSetterHelperImpl(identifiedStockType, IDENTIFIEDSTOCKTYPE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IdentifiedStockType" element
     */
    public com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode addNewIdentifiedStockType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode target = null;
            target = (com.sap.xi.ap.common.gdt.IdentifiedStockTypeCode)get_store().add_element_user(IDENTIFIEDSTOCKTYPE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "IdentifiedStockType" element
     */
    public void unsetIdentifiedStockType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIEDSTOCKTYPE$6, 0);
        }
    }
    
    /**
     * Gets the "LotQuantity" element
     */
    public com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity getLotQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity target = null;
            target = (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity)get_store().find_element_user(LOTQUANTITY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LotQuantity" element
     */
    public boolean isSetLotQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOTQUANTITY$8) != 0;
        }
    }
    
    /**
     * Sets the "LotQuantity" element
     */
    public void setLotQuantity(com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity lotQuantity)
    {
        generatedSetterHelperImpl(lotQuantity, LOTQUANTITY$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LotQuantity" element
     */
    public com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity addNewLotQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity target = null;
            target = (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity)get_store().add_element_user(LOTQUANTITY$8);
            return target;
        }
    }
    
    /**
     * Unsets the "LotQuantity" element
     */
    public void unsetLotQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOTQUANTITY$8, 0);
        }
    }
    
    /**
     * Gets the "LotSize" element
     */
    public com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity getLotSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity target = null;
            target = (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity)get_store().find_element_user(LOTSIZE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LotSize" element
     */
    public boolean isSetLotSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOTSIZE$10) != 0;
        }
    }
    
    /**
     * Sets the "LotSize" element
     */
    public void setLotSize(com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity lotSize)
    {
        generatedSetterHelperImpl(lotSize, LOTSIZE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "LotSize" element
     */
    public com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity addNewLotSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity target = null;
            target = (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity)get_store().add_element_user(LOTSIZE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "LotSize" element
     */
    public void unsetLotSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOTSIZE$10, 0);
        }
    }
    
    /**
     * Gets the "SampleSize" element
     */
    public com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity getSampleSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity target = null;
            target = (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity)get_store().find_element_user(SAMPLESIZE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SampleSize" element
     */
    public boolean isSetSampleSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAMPLESIZE$12) != 0;
        }
    }
    
    /**
     * Sets the "SampleSize" element
     */
    public void setSampleSize(com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity sampleSize)
    {
        generatedSetterHelperImpl(sampleSize, SAMPLESIZE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SampleSize" element
     */
    public com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity addNewSampleSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity target = null;
            target = (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity)get_store().add_element_user(SAMPLESIZE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "SampleSize" element
     */
    public void unsetSampleSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAMPLESIZE$12, 0);
        }
    }
    
    /**
     * Gets the "SampleQuantity" element
     */
    public com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity getSampleQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity target = null;
            target = (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity)get_store().find_element_user(SAMPLEQUANTITY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SampleQuantity" element
     */
    public boolean isSetSampleQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAMPLEQUANTITY$14) != 0;
        }
    }
    
    /**
     * Sets the "SampleQuantity" element
     */
    public void setSampleQuantity(com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity sampleQuantity)
    {
        generatedSetterHelperImpl(sampleQuantity, SAMPLEQUANTITY$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "SampleQuantity" element
     */
    public com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity addNewSampleQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity target = null;
            target = (com.sap.xi.ap.common.gdt.NONNEGATIVEQuantity)get_store().add_element_user(SAMPLEQUANTITY$14);
            return target;
        }
    }
    
    /**
     * Unsets the "SampleQuantity" element
     */
    public void unsetSampleQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAMPLEQUANTITY$14, 0);
        }
    }
    
    /**
     * Gets the "SampleRecords" element
     */
    public boolean getSampleRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAMPLERECORDS$16, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SampleRecords" element
     */
    public com.sap.xi.ap.common.gdt.Indicator xgetSampleRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(SAMPLERECORDS$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "SampleRecords" element
     */
    public boolean isSetSampleRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAMPLERECORDS$16) != 0;
        }
    }
    
    /**
     * Sets the "SampleRecords" element
     */
    public void setSampleRecords(boolean sampleRecords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAMPLERECORDS$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAMPLERECORDS$16);
            }
            target.setBooleanValue(sampleRecords);
        }
    }
    
    /**
     * Sets (as xml) the "SampleRecords" element
     */
    public void xsetSampleRecords(com.sap.xi.ap.common.gdt.Indicator sampleRecords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sap.xi.ap.common.gdt.Indicator target = null;
            target = (com.sap.xi.ap.common.gdt.Indicator)get_store().find_element_user(SAMPLERECORDS$16, 0);
            if (target == null)
            {
                target = (com.sap.xi.ap.common.gdt.Indicator)get_store().add_element_user(SAMPLERECORDS$16);
            }
            target.set(sampleRecords);
        }
    }
    
    /**
     * Unsets the "SampleRecords" element
     */
    public void unsetSampleRecords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAMPLERECORDS$16, 0);
        }
    }
}

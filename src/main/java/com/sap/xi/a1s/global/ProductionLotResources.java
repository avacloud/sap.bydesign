/*
 * XML Type:  ProductionLotResources
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotResources
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML ProductionLotResources(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface ProductionLotResources extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductionLotResources.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE7274E74C1D219A67E80FDE53A95800C").resolveHandle("productionlotresources520btype");
    
    /**
     * Gets the "ResourceGroupID" element
     */
    com.sap.xi.ap.common.gdt.ResourceID getResourceGroupID();
    
    /**
     * True if has "ResourceGroupID" element
     */
    boolean isSetResourceGroupID();
    
    /**
     * Sets the "ResourceGroupID" element
     */
    void setResourceGroupID(com.sap.xi.ap.common.gdt.ResourceID resourceGroupID);
    
    /**
     * Appends and returns a new empty "ResourceGroupID" element
     */
    com.sap.xi.ap.common.gdt.ResourceID addNewResourceGroupID();
    
    /**
     * Unsets the "ResourceGroupID" element
     */
    void unsetResourceGroupID();
    
    /**
     * Gets array of all "ResourceGroupDescription" elements
     */
    com.sap.xi.a1s.global.ActivityResourceGroupDescription[] getResourceGroupDescriptionArray();
    
    /**
     * Gets ith "ResourceGroupDescription" element
     */
    com.sap.xi.a1s.global.ActivityResourceGroupDescription getResourceGroupDescriptionArray(int i);
    
    /**
     * Returns number of "ResourceGroupDescription" element
     */
    int sizeOfResourceGroupDescriptionArray();
    
    /**
     * Sets array of all "ResourceGroupDescription" element
     */
    void setResourceGroupDescriptionArray(com.sap.xi.a1s.global.ActivityResourceGroupDescription[] resourceGroupDescriptionArray);
    
    /**
     * Sets ith "ResourceGroupDescription" element
     */
    void setResourceGroupDescriptionArray(int i, com.sap.xi.a1s.global.ActivityResourceGroupDescription resourceGroupDescription);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ResourceGroupDescription" element
     */
    com.sap.xi.a1s.global.ActivityResourceGroupDescription insertNewResourceGroupDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ResourceGroupDescription" element
     */
    com.sap.xi.a1s.global.ActivityResourceGroupDescription addNewResourceGroupDescription();
    
    /**
     * Removes the ith "ResourceGroupDescription" element
     */
    void removeResourceGroupDescription(int i);
    
    /**
     * Gets the "ResourceID" element
     */
    com.sap.xi.ap.common.gdt.ResourceID getResourceID();
    
    /**
     * Sets the "ResourceID" element
     */
    void setResourceID(com.sap.xi.ap.common.gdt.ResourceID resourceID);
    
    /**
     * Appends and returns a new empty "ResourceID" element
     */
    com.sap.xi.ap.common.gdt.ResourceID addNewResourceID();
    
    /**
     * Gets the "ResourceType" element
     */
    java.lang.String getResourceType();
    
    /**
     * Gets (as xml) the "ResourceType" element
     */
    com.sap.xi.ap.common.gdt.ResourceCategoryCode xgetResourceType();
    
    /**
     * Sets the "ResourceType" element
     */
    void setResourceType(java.lang.String resourceType);
    
    /**
     * Sets (as xml) the "ResourceType" element
     */
    void xsetResourceType(com.sap.xi.ap.common.gdt.ResourceCategoryCode resourceType);
    
    /**
     * Gets the "MainResource" element
     */
    boolean getMainResource();
    
    /**
     * Gets (as xml) the "MainResource" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetMainResource();
    
    /**
     * Sets the "MainResource" element
     */
    void setMainResource(boolean mainResource);
    
    /**
     * Sets (as xml) the "MainResource" element
     */
    void xsetMainResource(com.sap.xi.ap.common.gdt.Indicator mainResource);
    
    /**
     * Gets the "NumberOfResources" element
     */
    int getNumberOfResources();
    
    /**
     * Gets (as xml) the "NumberOfResources" element
     */
    com.sap.xi.ap.common.gdt.NumberValue xgetNumberOfResources();
    
    /**
     * Sets the "NumberOfResources" element
     */
    void setNumberOfResources(int numberOfResources);
    
    /**
     * Sets (as xml) the "NumberOfResources" element
     */
    void xsetNumberOfResources(com.sap.xi.ap.common.gdt.NumberValue numberOfResources);
    
    /**
     * Gets the "TotalConfirmedCapacityConsumption" element
     */
    org.apache.xmlbeans.GDuration getTotalConfirmedCapacityConsumption();
    
    /**
     * Gets (as xml) the "TotalConfirmedCapacityConsumption" element
     */
    com.sap.xi.ap.common.gdt.TIMEDuration xgetTotalConfirmedCapacityConsumption();
    
    /**
     * Sets the "TotalConfirmedCapacityConsumption" element
     */
    void setTotalConfirmedCapacityConsumption(org.apache.xmlbeans.GDuration totalConfirmedCapacityConsumption);
    
    /**
     * Sets (as xml) the "TotalConfirmedCapacityConsumption" element
     */
    void xsetTotalConfirmedCapacityConsumption(com.sap.xi.ap.common.gdt.TIMEDuration totalConfirmedCapacityConsumption);
    
    /**
     * Gets the "ConfirmedDuration" element
     */
    org.apache.xmlbeans.GDuration getConfirmedDuration();
    
    /**
     * Gets (as xml) the "ConfirmedDuration" element
     */
    com.sap.xi.ap.common.gdt.TIMEDuration xgetConfirmedDuration();
    
    /**
     * Sets the "ConfirmedDuration" element
     */
    void setConfirmedDuration(org.apache.xmlbeans.GDuration confirmedDuration);
    
    /**
     * Sets (as xml) the "ConfirmedDuration" element
     */
    void xsetConfirmedDuration(com.sap.xi.ap.common.gdt.TIMEDuration confirmedDuration);
    
    /**
     * Gets the "ConfirmationFinished" element
     */
    boolean getConfirmationFinished();
    
    /**
     * Gets (as xml) the "ConfirmationFinished" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetConfirmationFinished();
    
    /**
     * Sets the "ConfirmationFinished" element
     */
    void setConfirmationFinished(boolean confirmationFinished);
    
    /**
     * Sets (as xml) the "ConfirmationFinished" element
     */
    void xsetConfirmationFinished(com.sap.xi.ap.common.gdt.Indicator confirmationFinished);
    
    /**
     * Gets the "ResourceUtilisationUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getResourceUtilisationUUID();
    
    /**
     * Sets the "ResourceUtilisationUUID" element
     */
    void setResourceUtilisationUUID(com.sap.xi.ap.common.gdt.UUID resourceUtilisationUUID);
    
    /**
     * Appends and returns a new empty "ResourceUtilisationUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewResourceUtilisationUUID();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.ProductionLotResources newInstance() {
          return (com.sap.xi.a1s.global.ProductionLotResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotResources newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.ProductionLotResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.ProductionLotResources parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotResources parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.ProductionLotResources parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotResources parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotResources parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotResources parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotResources parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotResources parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotResources parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotResources parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotResources parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotResources parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotResources parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotResources parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotResources parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotResources parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotResources) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

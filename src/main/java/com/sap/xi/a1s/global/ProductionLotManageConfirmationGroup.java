/*
 * XML Type:  ProductionLotManageConfirmationGroup
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML ProductionLotManageConfirmationGroup(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface ProductionLotManageConfirmationGroup extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProductionLotManageConfirmationGroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3516FCF9D95E9E30AE8D4E360678AF8D").resolveHandle("productionlotmanageconfirmationgroup558btype");
    
    /**
     * Gets the "ConfirmationGroupUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getConfirmationGroupUUID();
    
    /**
     * True if has "ConfirmationGroupUUID" element
     */
    boolean isSetConfirmationGroupUUID();
    
    /**
     * Sets the "ConfirmationGroupUUID" element
     */
    void setConfirmationGroupUUID(com.sap.xi.ap.common.gdt.UUID confirmationGroupUUID);
    
    /**
     * Appends and returns a new empty "ConfirmationGroupUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewConfirmationGroupUUID();
    
    /**
     * Unsets the "ConfirmationGroupUUID" element
     */
    void unsetConfirmationGroupUUID();
    
    /**
     * Gets array of all "ProductionTask" elements
     */
    com.sap.xi.a1s.global.ProductionTaskManageResponseMDT[] getProductionTaskArray();
    
    /**
     * Gets ith "ProductionTask" element
     */
    com.sap.xi.a1s.global.ProductionTaskManageResponseMDT getProductionTaskArray(int i);
    
    /**
     * Returns number of "ProductionTask" element
     */
    int sizeOfProductionTaskArray();
    
    /**
     * Sets array of all "ProductionTask" element
     */
    void setProductionTaskArray(com.sap.xi.a1s.global.ProductionTaskManageResponseMDT[] productionTaskArray);
    
    /**
     * Sets ith "ProductionTask" element
     */
    void setProductionTaskArray(int i, com.sap.xi.a1s.global.ProductionTaskManageResponseMDT productionTask);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ProductionTask" element
     */
    com.sap.xi.a1s.global.ProductionTaskManageResponseMDT insertNewProductionTask(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ProductionTask" element
     */
    com.sap.xi.a1s.global.ProductionTaskManageResponseMDT addNewProductionTask();
    
    /**
     * Removes the ith "ProductionTask" element
     */
    void removeProductionTask(int i);
    
    /**
     * Gets array of all "Activity" elements
     */
    com.sap.xi.a1s.global.ActivityResponseManageMDT[] getActivityArray();
    
    /**
     * Gets ith "Activity" element
     */
    com.sap.xi.a1s.global.ActivityResponseManageMDT getActivityArray(int i);
    
    /**
     * Returns number of "Activity" element
     */
    int sizeOfActivityArray();
    
    /**
     * Sets array of all "Activity" element
     */
    void setActivityArray(com.sap.xi.a1s.global.ActivityResponseManageMDT[] activityArray);
    
    /**
     * Sets ith "Activity" element
     */
    void setActivityArray(int i, com.sap.xi.a1s.global.ActivityResponseManageMDT activity);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Activity" element
     */
    com.sap.xi.a1s.global.ActivityResponseManageMDT insertNewActivity(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Activity" element
     */
    com.sap.xi.a1s.global.ActivityResponseManageMDT addNewActivity();
    
    /**
     * Removes the ith "Activity" element
     */
    void removeActivity(int i);
    
    /**
     * Gets array of all "MaterialInput" elements
     */
    com.sap.xi.a1s.global.MaterialInputManageBundleResponse[] getMaterialInputArray();
    
    /**
     * Gets ith "MaterialInput" element
     */
    com.sap.xi.a1s.global.MaterialInputManageBundleResponse getMaterialInputArray(int i);
    
    /**
     * Returns number of "MaterialInput" element
     */
    int sizeOfMaterialInputArray();
    
    /**
     * Sets array of all "MaterialInput" element
     */
    void setMaterialInputArray(com.sap.xi.a1s.global.MaterialInputManageBundleResponse[] materialInputArray);
    
    /**
     * Sets ith "MaterialInput" element
     */
    void setMaterialInputArray(int i, com.sap.xi.a1s.global.MaterialInputManageBundleResponse materialInput);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MaterialInput" element
     */
    com.sap.xi.a1s.global.MaterialInputManageBundleResponse insertNewMaterialInput(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MaterialInput" element
     */
    com.sap.xi.a1s.global.MaterialInputManageBundleResponse addNewMaterialInput();
    
    /**
     * Removes the ith "MaterialInput" element
     */
    void removeMaterialInput(int i);
    
    /**
     * Gets array of all "MaterialOutput" elements
     */
    com.sap.xi.a1s.global.MaterialOutputManageBundleResponse[] getMaterialOutputArray();
    
    /**
     * Gets ith "MaterialOutput" element
     */
    com.sap.xi.a1s.global.MaterialOutputManageBundleResponse getMaterialOutputArray(int i);
    
    /**
     * Returns number of "MaterialOutput" element
     */
    int sizeOfMaterialOutputArray();
    
    /**
     * Sets array of all "MaterialOutput" element
     */
    void setMaterialOutputArray(com.sap.xi.a1s.global.MaterialOutputManageBundleResponse[] materialOutputArray);
    
    /**
     * Sets ith "MaterialOutput" element
     */
    void setMaterialOutputArray(int i, com.sap.xi.a1s.global.MaterialOutputManageBundleResponse materialOutput);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MaterialOutput" element
     */
    com.sap.xi.a1s.global.MaterialOutputManageBundleResponse insertNewMaterialOutput(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MaterialOutput" element
     */
    com.sap.xi.a1s.global.MaterialOutputManageBundleResponse addNewMaterialOutput();
    
    /**
     * Removes the ith "MaterialOutput" element
     */
    void removeMaterialOutput(int i);
    
    /**
     * Gets array of all "ReportingPoint" elements
     */
    com.sap.xi.a1s.global.ProductionLotManageReportingPoint[] getReportingPointArray();
    
    /**
     * Gets ith "ReportingPoint" element
     */
    com.sap.xi.a1s.global.ProductionLotManageReportingPoint getReportingPointArray(int i);
    
    /**
     * Returns number of "ReportingPoint" element
     */
    int sizeOfReportingPointArray();
    
    /**
     * Sets array of all "ReportingPoint" element
     */
    void setReportingPointArray(com.sap.xi.a1s.global.ProductionLotManageReportingPoint[] reportingPointArray);
    
    /**
     * Sets ith "ReportingPoint" element
     */
    void setReportingPointArray(int i, com.sap.xi.a1s.global.ProductionLotManageReportingPoint reportingPoint);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ReportingPoint" element
     */
    com.sap.xi.a1s.global.ProductionLotManageReportingPoint insertNewReportingPoint(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ReportingPoint" element
     */
    com.sap.xi.a1s.global.ProductionLotManageReportingPoint addNewReportingPoint();
    
    /**
     * Removes the ith "ReportingPoint" element
     */
    void removeReportingPoint(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup newInstance() {
          return (com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ProductionLotManageConfirmationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

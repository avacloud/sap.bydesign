/*
 * XML Type:  ActivityResponseManageMDT
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ActivityResponseManageMDT
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML ActivityResponseManageMDT(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface ActivityResponseManageMDT extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActivityResponseManageMDT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3516FCF9D95E9E30AE8D4E360678AF8D").resolveHandle("activityresponsemanagemdtc882type");
    
    /**
     * Gets the "ActivityID" element
     */
    java.lang.String getActivityID();
    
    /**
     * Gets (as xml) the "ActivityID" element
     */
    com.sap.xi.ap.common.gdt.OperationActivityID xgetActivityID();
    
    /**
     * True if has "ActivityID" element
     */
    boolean isSetActivityID();
    
    /**
     * Sets the "ActivityID" element
     */
    void setActivityID(java.lang.String activityID);
    
    /**
     * Sets (as xml) the "ActivityID" element
     */
    void xsetActivityID(com.sap.xi.ap.common.gdt.OperationActivityID activityID);
    
    /**
     * Unsets the "ActivityID" element
     */
    void unsetActivityID();
    
    /**
     * Gets the "ActivityUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getActivityUUID();
    
    /**
     * True if has "ActivityUUID" element
     */
    boolean isSetActivityUUID();
    
    /**
     * Sets the "ActivityUUID" element
     */
    void setActivityUUID(com.sap.xi.ap.common.gdt.UUID activityUUID);
    
    /**
     * Appends and returns a new empty "ActivityUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewActivityUUID();
    
    /**
     * Unsets the "ActivityUUID" element
     */
    void unsetActivityUUID();
    
    /**
     * Gets the "TypeCode" element
     */
    com.sap.xi.ap.common.gdt.OperationActivityTypeCode getTypeCode();
    
    /**
     * True if has "TypeCode" element
     */
    boolean isSetTypeCode();
    
    /**
     * Sets the "TypeCode" element
     */
    void setTypeCode(com.sap.xi.ap.common.gdt.OperationActivityTypeCode typeCode);
    
    /**
     * Appends and returns a new empty "TypeCode" element
     */
    com.sap.xi.ap.common.gdt.OperationActivityTypeCode addNewTypeCode();
    
    /**
     * Unsets the "TypeCode" element
     */
    void unsetTypeCode();
    
    /**
     * Gets the "CategoryCode" element
     */
    java.lang.String getCategoryCode();
    
    /**
     * Gets (as xml) the "CategoryCode" element
     */
    com.sap.xi.ap.common.gdt.OperationActivityCategoryCode xgetCategoryCode();
    
    /**
     * True if has "CategoryCode" element
     */
    boolean isSetCategoryCode();
    
    /**
     * Sets the "CategoryCode" element
     */
    void setCategoryCode(java.lang.String categoryCode);
    
    /**
     * Sets (as xml) the "CategoryCode" element
     */
    void xsetCategoryCode(com.sap.xi.ap.common.gdt.OperationActivityCategoryCode categoryCode);
    
    /**
     * Unsets the "CategoryCode" element
     */
    void unsetCategoryCode();
    
    /**
     * Gets the "ConfirmationCompletedIndicator" element
     */
    boolean getConfirmationCompletedIndicator();
    
    /**
     * Gets (as xml) the "ConfirmationCompletedIndicator" element
     */
    com.sap.xi.ap.common.gdt.Indicator xgetConfirmationCompletedIndicator();
    
    /**
     * True if has "ConfirmationCompletedIndicator" element
     */
    boolean isSetConfirmationCompletedIndicator();
    
    /**
     * Sets the "ConfirmationCompletedIndicator" element
     */
    void setConfirmationCompletedIndicator(boolean confirmationCompletedIndicator);
    
    /**
     * Sets (as xml) the "ConfirmationCompletedIndicator" element
     */
    void xsetConfirmationCompletedIndicator(com.sap.xi.ap.common.gdt.Indicator confirmationCompletedIndicator);
    
    /**
     * Unsets the "ConfirmationCompletedIndicator" element
     */
    void unsetConfirmationCompletedIndicator();
    
    /**
     * Gets array of all "ResourceUtilization" elements
     */
    com.sap.xi.a1s.global.ProductionLotActivityMaintainResources[] getResourceUtilizationArray();
    
    /**
     * Gets ith "ResourceUtilization" element
     */
    com.sap.xi.a1s.global.ProductionLotActivityMaintainResources getResourceUtilizationArray(int i);
    
    /**
     * Returns number of "ResourceUtilization" element
     */
    int sizeOfResourceUtilizationArray();
    
    /**
     * Sets array of all "ResourceUtilization" element
     */
    void setResourceUtilizationArray(com.sap.xi.a1s.global.ProductionLotActivityMaintainResources[] resourceUtilizationArray);
    
    /**
     * Sets ith "ResourceUtilization" element
     */
    void setResourceUtilizationArray(int i, com.sap.xi.a1s.global.ProductionLotActivityMaintainResources resourceUtilization);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ResourceUtilization" element
     */
    com.sap.xi.a1s.global.ProductionLotActivityMaintainResources insertNewResourceUtilization(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ResourceUtilization" element
     */
    com.sap.xi.a1s.global.ProductionLotActivityMaintainResources addNewResourceUtilization();
    
    /**
     * Removes the ith "ResourceUtilization" element
     */
    void removeResourceUtilization(int i);
    
    /**
     * Gets the "ConfirmDuration" element
     */
    org.apache.xmlbeans.GDuration getConfirmDuration();
    
    /**
     * Gets (as xml) the "ConfirmDuration" element
     */
    com.sap.xi.ap.common.gdt.TIMEDuration xgetConfirmDuration();
    
    /**
     * True if has "ConfirmDuration" element
     */
    boolean isSetConfirmDuration();
    
    /**
     * Sets the "ConfirmDuration" element
     */
    void setConfirmDuration(org.apache.xmlbeans.GDuration confirmDuration);
    
    /**
     * Sets (as xml) the "ConfirmDuration" element
     */
    void xsetConfirmDuration(com.sap.xi.ap.common.gdt.TIMEDuration confirmDuration);
    
    /**
     * Unsets the "ConfirmDuration" element
     */
    void unsetConfirmDuration();
    
    /**
     * Gets the "ConfirmationMethodCode" element
     */
    java.lang.String getConfirmationMethodCode();
    
    /**
     * Gets (as xml) the "ConfirmationMethodCode" element
     */
    com.sap.xi.ap.common.gdt.LogisticsConfirmationMethodCode xgetConfirmationMethodCode();
    
    /**
     * True if has "ConfirmationMethodCode" element
     */
    boolean isSetConfirmationMethodCode();
    
    /**
     * Sets the "ConfirmationMethodCode" element
     */
    void setConfirmationMethodCode(java.lang.String confirmationMethodCode);
    
    /**
     * Sets (as xml) the "ConfirmationMethodCode" element
     */
    void xsetConfirmationMethodCode(com.sap.xi.ap.common.gdt.LogisticsConfirmationMethodCode confirmationMethodCode);
    
    /**
     * Unsets the "ConfirmationMethodCode" element
     */
    void unsetConfirmationMethodCode();
    
    /**
     * Gets array of all "Service" elements
     */
    com.sap.xi.a1s.global.ProductionLotActivityServices[] getServiceArray();
    
    /**
     * Gets ith "Service" element
     */
    com.sap.xi.a1s.global.ProductionLotActivityServices getServiceArray(int i);
    
    /**
     * Returns number of "Service" element
     */
    int sizeOfServiceArray();
    
    /**
     * Sets array of all "Service" element
     */
    void setServiceArray(com.sap.xi.a1s.global.ProductionLotActivityServices[] serviceArray);
    
    /**
     * Sets ith "Service" element
     */
    void setServiceArray(int i, com.sap.xi.a1s.global.ProductionLotActivityServices service);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Service" element
     */
    com.sap.xi.a1s.global.ProductionLotActivityServices insertNewService(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Service" element
     */
    com.sap.xi.a1s.global.ProductionLotActivityServices addNewService();
    
    /**
     * Removes the ith "Service" element
     */
    void removeService(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sap.xi.a1s.global.ActivityResponseManageMDT newInstance() {
          return (com.sap.xi.a1s.global.ActivityResponseManageMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseManageMDT newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.ActivityResponseManageMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.ActivityResponseManageMDT parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ActivityResponseManageMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseManageMDT parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ActivityResponseManageMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.ActivityResponseManageMDT parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ActivityResponseManageMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseManageMDT parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ActivityResponseManageMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseManageMDT parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ActivityResponseManageMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseManageMDT parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ActivityResponseManageMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseManageMDT parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ActivityResponseManageMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseManageMDT parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ActivityResponseManageMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseManageMDT parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ActivityResponseManageMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseManageMDT parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ActivityResponseManageMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseManageMDT parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ActivityResponseManageMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseManageMDT parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ActivityResponseManageMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseManageMDT parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ActivityResponseManageMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseManageMDT parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ActivityResponseManageMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ActivityResponseManageMDT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ActivityResponseManageMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ActivityResponseManageMDT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ActivityResponseManageMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

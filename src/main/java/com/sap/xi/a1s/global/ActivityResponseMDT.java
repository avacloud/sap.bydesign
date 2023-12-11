/*
 * XML Type:  ActivityResponseMDT
 * Namespace: http://sap.com/xi/A1S/Global
 * Java type: com.sap.xi.a1s.global.ActivityResponseMDT
 *
 * Automatically generated - do not modify.
 */
package com.sap.xi.a1s.global;


/**
 * An XML ActivityResponseMDT(@http://sap.com/xi/A1S/Global).
 *
 * This is a complex type.
 */
public interface ActivityResponseMDT extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActivityResponseMDT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE7274E74C1D219A67E80FDE53A95800C").resolveHandle("activityresponsemdtf1bdtype");
    
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
     * Gets the "ActivityStatus" element
     */
    com.sap.xi.a1s.global.ActivityStatus getActivityStatus();
    
    /**
     * True if has "ActivityStatus" element
     */
    boolean isSetActivityStatus();
    
    /**
     * Sets the "ActivityStatus" element
     */
    void setActivityStatus(com.sap.xi.a1s.global.ActivityStatus activityStatus);
    
    /**
     * Appends and returns a new empty "ActivityStatus" element
     */
    com.sap.xi.a1s.global.ActivityStatus addNewActivityStatus();
    
    /**
     * Unsets the "ActivityStatus" element
     */
    void unsetActivityStatus();
    
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
     * Gets the "MaterialInspectionUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID getMaterialInspectionUUID();
    
    /**
     * True if has "MaterialInspectionUUID" element
     */
    boolean isSetMaterialInspectionUUID();
    
    /**
     * Sets the "MaterialInspectionUUID" element
     */
    void setMaterialInspectionUUID(com.sap.xi.ap.common.gdt.UUID materialInspectionUUID);
    
    /**
     * Appends and returns a new empty "MaterialInspectionUUID" element
     */
    com.sap.xi.ap.common.gdt.UUID addNewMaterialInspectionUUID();
    
    /**
     * Unsets the "MaterialInspectionUUID" element
     */
    void unsetMaterialInspectionUUID();
    
    /**
     * Gets the "StartDateTime" element
     */
    java.util.Calendar getStartDateTime();
    
    /**
     * Gets (as xml) the "StartDateTime" element
     */
    com.sap.xi.basis.global.GLOBALDateTime xgetStartDateTime();
    
    /**
     * True if has "StartDateTime" element
     */
    boolean isSetStartDateTime();
    
    /**
     * Sets the "StartDateTime" element
     */
    void setStartDateTime(java.util.Calendar startDateTime);
    
    /**
     * Sets (as xml) the "StartDateTime" element
     */
    void xsetStartDateTime(com.sap.xi.basis.global.GLOBALDateTime startDateTime);
    
    /**
     * Unsets the "StartDateTime" element
     */
    void unsetStartDateTime();
    
    /**
     * Gets the "PlannedDuration" element
     */
    org.apache.xmlbeans.GDuration getPlannedDuration();
    
    /**
     * Gets (as xml) the "PlannedDuration" element
     */
    com.sap.xi.ap.common.gdt.TIMEDuration xgetPlannedDuration();
    
    /**
     * True if has "PlannedDuration" element
     */
    boolean isSetPlannedDuration();
    
    /**
     * Sets the "PlannedDuration" element
     */
    void setPlannedDuration(org.apache.xmlbeans.GDuration plannedDuration);
    
    /**
     * Sets (as xml) the "PlannedDuration" element
     */
    void xsetPlannedDuration(com.sap.xi.ap.common.gdt.TIMEDuration plannedDuration);
    
    /**
     * Unsets the "PlannedDuration" element
     */
    void unsetPlannedDuration();
    
    /**
     * Gets the "OpenDuration" element
     */
    org.apache.xmlbeans.GDuration getOpenDuration();
    
    /**
     * Gets (as xml) the "OpenDuration" element
     */
    com.sap.xi.ap.common.gdt.TIMEDuration xgetOpenDuration();
    
    /**
     * True if has "OpenDuration" element
     */
    boolean isSetOpenDuration();
    
    /**
     * Sets the "OpenDuration" element
     */
    void setOpenDuration(org.apache.xmlbeans.GDuration openDuration);
    
    /**
     * Sets (as xml) the "OpenDuration" element
     */
    void xsetOpenDuration(com.sap.xi.ap.common.gdt.TIMEDuration openDuration);
    
    /**
     * Unsets the "OpenDuration" element
     */
    void unsetOpenDuration();
    
    /**
     * Gets the "TotalConfirmedDuration" element
     */
    org.apache.xmlbeans.GDuration getTotalConfirmedDuration();
    
    /**
     * Gets (as xml) the "TotalConfirmedDuration" element
     */
    com.sap.xi.ap.common.gdt.TIMEDuration xgetTotalConfirmedDuration();
    
    /**
     * True if has "TotalConfirmedDuration" element
     */
    boolean isSetTotalConfirmedDuration();
    
    /**
     * Sets the "TotalConfirmedDuration" element
     */
    void setTotalConfirmedDuration(org.apache.xmlbeans.GDuration totalConfirmedDuration);
    
    /**
     * Sets (as xml) the "TotalConfirmedDuration" element
     */
    void xsetTotalConfirmedDuration(com.sap.xi.ap.common.gdt.TIMEDuration totalConfirmedDuration);
    
    /**
     * Unsets the "TotalConfirmedDuration" element
     */
    void unsetTotalConfirmedDuration();
    
    /**
     * Gets the "EndDateTime" element
     */
    java.util.Calendar getEndDateTime();
    
    /**
     * Gets (as xml) the "EndDateTime" element
     */
    com.sap.xi.basis.global.GLOBALDateTime xgetEndDateTime();
    
    /**
     * True if has "EndDateTime" element
     */
    boolean isSetEndDateTime();
    
    /**
     * Sets the "EndDateTime" element
     */
    void setEndDateTime(java.util.Calendar endDateTime);
    
    /**
     * Sets (as xml) the "EndDateTime" element
     */
    void xsetEndDateTime(com.sap.xi.basis.global.GLOBALDateTime endDateTime);
    
    /**
     * Unsets the "EndDateTime" element
     */
    void unsetEndDateTime();
    
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
     * Gets array of all "ResourceUtilization" elements
     */
    com.sap.xi.a1s.global.ProductionLotResources[] getResourceUtilizationArray();
    
    /**
     * Gets ith "ResourceUtilization" element
     */
    com.sap.xi.a1s.global.ProductionLotResources getResourceUtilizationArray(int i);
    
    /**
     * Returns number of "ResourceUtilization" element
     */
    int sizeOfResourceUtilizationArray();
    
    /**
     * Sets array of all "ResourceUtilization" element
     */
    void setResourceUtilizationArray(com.sap.xi.a1s.global.ProductionLotResources[] resourceUtilizationArray);
    
    /**
     * Sets ith "ResourceUtilization" element
     */
    void setResourceUtilizationArray(int i, com.sap.xi.a1s.global.ProductionLotResources resourceUtilization);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ResourceUtilization" element
     */
    com.sap.xi.a1s.global.ProductionLotResources insertNewResourceUtilization(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ResourceUtilization" element
     */
    com.sap.xi.a1s.global.ProductionLotResources addNewResourceUtilization();
    
    /**
     * Removes the ith "ResourceUtilization" element
     */
    void removeResourceUtilization(int i);
    
    /**
     * Gets array of all "Service" elements
     */
    com.sap.xi.a1s.global.ProductionLotServices[] getServiceArray();
    
    /**
     * Gets ith "Service" element
     */
    com.sap.xi.a1s.global.ProductionLotServices getServiceArray(int i);
    
    /**
     * Returns number of "Service" element
     */
    int sizeOfServiceArray();
    
    /**
     * Sets array of all "Service" element
     */
    void setServiceArray(com.sap.xi.a1s.global.ProductionLotServices[] serviceArray);
    
    /**
     * Sets ith "Service" element
     */
    void setServiceArray(int i, com.sap.xi.a1s.global.ProductionLotServices service);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Service" element
     */
    com.sap.xi.a1s.global.ProductionLotServices insertNewService(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Service" element
     */
    com.sap.xi.a1s.global.ProductionLotServices addNewService();
    
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
        public static com.sap.xi.a1s.global.ActivityResponseMDT newInstance() {
          return (com.sap.xi.a1s.global.ActivityResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseMDT newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sap.xi.a1s.global.ActivityResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sap.xi.a1s.global.ActivityResponseMDT parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ActivityResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseMDT parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ActivityResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sap.xi.a1s.global.ActivityResponseMDT parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ActivityResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseMDT parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ActivityResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseMDT parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ActivityResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseMDT parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ActivityResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseMDT parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ActivityResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseMDT parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ActivityResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseMDT parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ActivityResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseMDT parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sap.xi.a1s.global.ActivityResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseMDT parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ActivityResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseMDT parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ActivityResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseMDT parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ActivityResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sap.xi.a1s.global.ActivityResponseMDT parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sap.xi.a1s.global.ActivityResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ActivityResponseMDT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ActivityResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sap.xi.a1s.global.ActivityResponseMDT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sap.xi.a1s.global.ActivityResponseMDT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}

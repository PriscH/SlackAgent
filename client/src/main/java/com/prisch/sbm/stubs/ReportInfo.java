
package com.prisch.sbm.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReportInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="report" type="{urn:sbmappservices72}ReportIdentifier" minOccurs="0"/>
 *         &lt;element name="reportURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportType" type="{urn:sbmappservices72}ReportType"/>
 *         &lt;element name="reportCategory" type="{urn:sbmappservices72}ReportCategory"/>
 *         &lt;element name="reportAccessLevel" type="{urn:sbmappservices72}ReportAccessLevel"/>
 *         &lt;element name="solution" type="{urn:sbmappservices72}SolutionIdentifier" minOccurs="0"/>
 *         &lt;element name="table" type="{urn:sbmappservices72}TableIdentifier" minOccurs="0"/>
 *         &lt;element name="project" type="{urn:sbmappservices72}ProjectIdentifier" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{urn:sbmappservices72}UserIdentifier"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="modifiedBy" type="{urn:sbmappservices72}UserIdentifier" minOccurs="0"/>
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="execDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="isQueryAtRuntime" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="extendedData" type="{urn:sbmappservices72}ExtendedData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportInfo", propOrder = {
    "report",
    "reportURL",
    "reportType",
    "reportCategory",
    "reportAccessLevel",
    "solution",
    "table",
    "project",
    "createdBy",
    "createDate",
    "modifiedBy",
    "modifiedDate",
    "execDate",
    "isQueryAtRuntime",
    "extendedData"
})
public class ReportInfo {

    @XmlElementRef(name = "report", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ReportIdentifier> report;
    @XmlElement(required = true, nillable = true)
    protected String reportURL;
    @XmlElement(required = true, defaultValue = "LISTING")
    @XmlSchemaType(name = "string")
    protected ReportType reportType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ReportCategory reportCategory;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ReportAccessLevel reportAccessLevel;
    @XmlElementRef(name = "solution", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<SolutionIdentifier> solution;
    @XmlElementRef(name = "table", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<TableIdentifier> table;
    @XmlElementRef(name = "project", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ProjectIdentifier> project;
    @XmlElement(required = true, nillable = true)
    protected UserIdentifier createdBy;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlElementRef(name = "modifiedBy", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<UserIdentifier> modifiedBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar execDate;
    protected boolean isQueryAtRuntime;
    @XmlElementRef(name = "extendedData", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtendedData> extendedData;

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReportIdentifier }{@code >}
     *     
     */
    public JAXBElement<ReportIdentifier> getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReportIdentifier }{@code >}
     *     
     */
    public void setReport(JAXBElement<ReportIdentifier> value) {
        this.report = value;
    }

    /**
     * Gets the value of the reportURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportURL() {
        return reportURL;
    }

    /**
     * Sets the value of the reportURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportURL(String value) {
        this.reportURL = value;
    }

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link ReportType }
     *     
     */
    public ReportType getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportType }
     *     
     */
    public void setReportType(ReportType value) {
        this.reportType = value;
    }

    /**
     * Gets the value of the reportCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ReportCategory }
     *     
     */
    public ReportCategory getReportCategory() {
        return reportCategory;
    }

    /**
     * Sets the value of the reportCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportCategory }
     *     
     */
    public void setReportCategory(ReportCategory value) {
        this.reportCategory = value;
    }

    /**
     * Gets the value of the reportAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ReportAccessLevel }
     *     
     */
    public ReportAccessLevel getReportAccessLevel() {
        return reportAccessLevel;
    }

    /**
     * Sets the value of the reportAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportAccessLevel }
     *     
     */
    public void setReportAccessLevel(ReportAccessLevel value) {
        this.reportAccessLevel = value;
    }

    /**
     * Gets the value of the solution property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SolutionIdentifier }{@code >}
     *     
     */
    public JAXBElement<SolutionIdentifier> getSolution() {
        return solution;
    }

    /**
     * Sets the value of the solution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SolutionIdentifier }{@code >}
     *     
     */
    public void setSolution(JAXBElement<SolutionIdentifier> value) {
        this.solution = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TableIdentifier }{@code >}
     *     
     */
    public JAXBElement<TableIdentifier> getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TableIdentifier }{@code >}
     *     
     */
    public void setTable(JAXBElement<TableIdentifier> value) {
        this.table = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProjectIdentifier }{@code >}
     *     
     */
    public JAXBElement<ProjectIdentifier> getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProjectIdentifier }{@code >}
     *     
     */
    public void setProject(JAXBElement<ProjectIdentifier> value) {
        this.project = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentifier }
     *     
     */
    public UserIdentifier getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentifier }
     *     
     */
    public void setCreatedBy(UserIdentifier value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the modifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}
     *     
     */
    public JAXBElement<UserIdentifier> getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Sets the value of the modifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}
     *     
     */
    public void setModifiedBy(JAXBElement<UserIdentifier> value) {
        this.modifiedBy = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDate(XMLGregorianCalendar value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the execDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExecDate() {
        return execDate;
    }

    /**
     * Sets the value of the execDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExecDate(XMLGregorianCalendar value) {
        this.execDate = value;
    }

    /**
     * Gets the value of the isQueryAtRuntime property.
     * 
     */
    public boolean isIsQueryAtRuntime() {
        return isQueryAtRuntime;
    }

    /**
     * Sets the value of the isQueryAtRuntime property.
     * 
     */
    public void setIsQueryAtRuntime(boolean value) {
        this.isQueryAtRuntime = value;
    }

    /**
     * Gets the value of the extendedData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}
     *     
     */
    public JAXBElement<ExtendedData> getExtendedData() {
        return extendedData;
    }

    /**
     * Sets the value of the extendedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtendedData }{@code >}
     *     
     */
    public void setExtendedData(JAXBElement<ExtendedData> value) {
        this.extendedData = value;
    }

}

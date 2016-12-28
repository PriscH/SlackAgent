
package com.prisch.sbm.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReportsFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportsFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="solution" type="{urn:sbmappservices72}SolutionIdentifier" minOccurs="0"/>
 *         &lt;element name="project" type="{urn:sbmappservices72}ProjectIdentifier" minOccurs="0"/>
 *         &lt;element name="table" type="{urn:sbmappservices72}TableIdentifier" minOccurs="0"/>
 *         &lt;element name="author" type="{urn:sbmappservices72}UserIdentifier" minOccurs="0"/>
 *         &lt;element name="reportType" type="{urn:sbmappservices72}ReportType" minOccurs="0"/>
 *         &lt;element name="reportCategory" type="{urn:sbmappservices72}ReportCategory" minOccurs="0"/>
 *         &lt;element name="reportAccessLevel" type="{urn:sbmappservices72}ReportAccessLevel" minOccurs="0"/>
 *         &lt;element name="report" type="{urn:sbmappservices72}ReportIdentifier" minOccurs="0"/>
 *         &lt;element name="searchByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeSubProjects" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="createdDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="createdDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "ReportsFilter", propOrder = {
    "solution",
    "project",
    "table",
    "author",
    "reportType",
    "reportCategory",
    "reportAccessLevel",
    "report",
    "searchByName",
    "includeSubProjects",
    "createdDateFrom",
    "createdDateTo",
    "extendedData"
})
public class ReportsFilter {

    @XmlElementRef(name = "solution", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<SolutionIdentifier> solution;
    @XmlElementRef(name = "project", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ProjectIdentifier> project;
    @XmlElementRef(name = "table", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<TableIdentifier> table;
    @XmlElementRef(name = "author", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<UserIdentifier> author;
    @XmlElement(defaultValue = "LISTING")
    @XmlSchemaType(name = "string")
    protected ReportType reportType;
    @XmlElement(defaultValue = "ALL")
    @XmlSchemaType(name = "string")
    protected ReportCategory reportCategory;
    @XmlSchemaType(name = "string")
    protected ReportAccessLevel reportAccessLevel;
    @XmlElementRef(name = "report", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ReportIdentifier> report;
    @XmlElementRef(name = "searchByName", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<String> searchByName;
    @XmlElement(defaultValue = "false")
    protected Boolean includeSubProjects;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDateFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDateTo;
    @XmlElementRef(name = "extendedData", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtendedData> extendedData;

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
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}
     *     
     */
    public JAXBElement<UserIdentifier> getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}
     *     
     */
    public void setAuthor(JAXBElement<UserIdentifier> value) {
        this.author = value;
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
     * Gets the value of the searchByName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSearchByName() {
        return searchByName;
    }

    /**
     * Sets the value of the searchByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSearchByName(JAXBElement<String> value) {
        this.searchByName = value;
    }

    /**
     * Gets the value of the includeSubProjects property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSubProjects() {
        return includeSubProjects;
    }

    /**
     * Sets the value of the includeSubProjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSubProjects(Boolean value) {
        this.includeSubProjects = value;
    }

    /**
     * Gets the value of the createdDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDateFrom() {
        return createdDateFrom;
    }

    /**
     * Sets the value of the createdDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDateFrom(XMLGregorianCalendar value) {
        this.createdDateFrom = value;
    }

    /**
     * Gets the value of the createdDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDateTo() {
        return createdDateTo;
    }

    /**
     * Sets the value of the createdDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDateTo(XMLGregorianCalendar value) {
        this.createdDateTo = value;
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

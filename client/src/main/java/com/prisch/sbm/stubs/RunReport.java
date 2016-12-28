
package com.prisch.sbm.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auth" type="{urn:sbmappservices72}Auth" minOccurs="0"/>
 *         &lt;element name="queryRange" type="{urn:sbmappservices72}QueryRange" minOccurs="0"/>
 *         &lt;element name="report" type="{urn:sbmappservices72}ReportIdentifier" minOccurs="0"/>
 *         &lt;element name="solution" type="{urn:sbmappservices72}SolutionIdentifier" minOccurs="0"/>
 *         &lt;element name="project" type="{urn:sbmappservices72}ProjectIdentifier" minOccurs="0"/>
 *         &lt;element name="table" type="{urn:sbmappservices72}TableIdentifier" minOccurs="0"/>
 *         &lt;element name="reportCategory" type="{urn:sbmappservices72}ReportCategory" minOccurs="0"/>
 *         &lt;element name="reportAccessLevel" type="{urn:sbmappservices72}ReportAccessLevel" minOccurs="0"/>
 *         &lt;element name="options" type="{urn:sbmappservices72}Options" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "auth",
    "queryRange",
    "report",
    "solution",
    "project",
    "table",
    "reportCategory",
    "reportAccessLevel",
    "options"
})
@XmlRootElement(name = "RunReport")
public class RunReport {

    @XmlElementRef(name = "auth", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<Auth> auth;
    @XmlElementRef(name = "queryRange", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryRange> queryRange;
    @XmlElementRef(name = "report", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ReportIdentifier> report;
    @XmlElementRef(name = "solution", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<SolutionIdentifier> solution;
    @XmlElementRef(name = "project", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ProjectIdentifier> project;
    @XmlElementRef(name = "table", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<TableIdentifier> table;
    @XmlSchemaType(name = "string")
    protected ReportCategory reportCategory;
    @XmlSchemaType(name = "string")
    protected ReportAccessLevel reportAccessLevel;
    @XmlElementRef(name = "options", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<Options> options;

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Auth }{@code >}
     *     
     */
    public JAXBElement<Auth> getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Auth }{@code >}
     *     
     */
    public void setAuth(JAXBElement<Auth> value) {
        this.auth = value;
    }

    /**
     * Gets the value of the queryRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryRange }{@code >}
     *     
     */
    public JAXBElement<QueryRange> getQueryRange() {
        return queryRange;
    }

    /**
     * Sets the value of the queryRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryRange }{@code >}
     *     
     */
    public void setQueryRange(JAXBElement<QueryRange> value) {
        this.queryRange = value;
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
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Options }{@code >}
     *     
     */
    public JAXBElement<Options> getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Options }{@code >}
     *     
     */
    public void setOptions(JAXBElement<Options> value) {
        this.options = value;
    }

}

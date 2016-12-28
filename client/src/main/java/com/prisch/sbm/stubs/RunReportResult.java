
package com.prisch.sbm.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for RunReportResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RunReportResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryRange" type="{urn:sbmappservices72}QueryRange"/>
 *         &lt;element name="reportInfo" type="{urn:sbmappservices72}ReportInfo"/>
 *         &lt;element name="reportDefinition" type="{urn:sbmappservices72}ReportDefinition"/>
 *         &lt;element name="result" type="{urn:sbmappservices72}ReportResult" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RunReportResult", propOrder = {
    "queryRange",
    "reportInfo",
    "reportDefinition",
    "result",
    "extendedData"
})
public class RunReportResult {

    @XmlElement(required = true, nillable = true)
    protected QueryRange queryRange;
    @XmlElement(required = true, nillable = true)
    protected ReportInfo reportInfo;
    @XmlElement(required = true, nillable = true)
    protected ReportDefinition reportDefinition;
    protected List<ReportResult> result;
    @XmlElementRef(name = "extendedData", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtendedData> extendedData;

    /**
     * Gets the value of the queryRange property.
     * 
     * @return
     *     possible object is
     *     {@link QueryRange }
     *     
     */
    public QueryRange getQueryRange() {
        return queryRange;
    }

    /**
     * Sets the value of the queryRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryRange }
     *     
     */
    public void setQueryRange(QueryRange value) {
        this.queryRange = value;
    }

    /**
     * Gets the value of the reportInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReportInfo }
     *     
     */
    public ReportInfo getReportInfo() {
        return reportInfo;
    }

    /**
     * Sets the value of the reportInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportInfo }
     *     
     */
    public void setReportInfo(ReportInfo value) {
        this.reportInfo = value;
    }

    /**
     * Gets the value of the reportDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link ReportDefinition }
     *     
     */
    public ReportDefinition getReportDefinition() {
        return reportDefinition;
    }

    /**
     * Sets the value of the reportDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportDefinition }
     *     
     */
    public void setReportDefinition(ReportDefinition value) {
        this.reportDefinition = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportResult }
     * 
     * 
     */
    public List<ReportResult> getResult() {
        if (result == null) {
            result = new ArrayList<ReportResult>();
        }
        return this.result;
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

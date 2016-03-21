
package com.prisch.sbm.stubs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserSolutionData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserSolutionData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="solution" type="{urn:sbmappservices72}SolutionIdentifier" minOccurs="0"/>
 *         &lt;element name="homeReport" type="{urn:sbmappservices72}ReportIdentifier" minOccurs="0"/>
 *         &lt;element name="preferredProject" type="{urn:sbmappservices72}ProjectIdentifier" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "UserSolutionData", propOrder = {
    "solution",
    "homeReport",
    "preferredProject",
    "extendedData"
})
public class UserSolutionData {

    @XmlElementRef(name = "solution", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<SolutionIdentifier> solution;
    @XmlElementRef(name = "homeReport", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ReportIdentifier> homeReport;
    protected List<ProjectIdentifier> preferredProject;
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
     * Gets the value of the homeReport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReportIdentifier }{@code >}
     *     
     */
    public JAXBElement<ReportIdentifier> getHomeReport() {
        return homeReport;
    }

    /**
     * Sets the value of the homeReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReportIdentifier }{@code >}
     *     
     */
    public void setHomeReport(JAXBElement<ReportIdentifier> value) {
        this.homeReport = value;
    }

    /**
     * Gets the value of the preferredProject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredProject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredProject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectIdentifier }
     * 
     * 
     */
    public List<ProjectIdentifier> getPreferredProject() {
        if (preferredProject == null) {
            preferredProject = new ArrayList<ProjectIdentifier>();
        }
        return this.preferredProject;
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

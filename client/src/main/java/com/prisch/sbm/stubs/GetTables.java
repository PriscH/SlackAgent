
package com.prisch.sbm.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="solution" type="{urn:sbmappservices72}SolutionIdentifier" minOccurs="0"/>
 *         &lt;element name="tableType" type="{urn:sbmappservices72}Table-Type"/>
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
    "solution",
    "tableType",
    "options"
})
@XmlRootElement(name = "GetTables")
public class GetTables {

    @XmlElementRef(name = "auth", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<Auth> auth;
    @XmlElementRef(name = "solution", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<SolutionIdentifier> solution;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TableType tableType;
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
     * Gets the value of the tableType property.
     * 
     * @return
     *     possible object is
     *     {@link TableType }
     *     
     */
    public TableType getTableType() {
        return tableType;
    }

    /**
     * Sets the value of the tableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableType }
     *     
     */
    public void setTableType(TableType value) {
        this.tableType = value;
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

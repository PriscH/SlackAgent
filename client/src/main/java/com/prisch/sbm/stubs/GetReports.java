
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
 *         &lt;element name="reportsFilter" type="{urn:sbmappservices72}ReportsFilter" minOccurs="0"/>
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
    "reportsFilter",
    "options"
})
@XmlRootElement(name = "GetReports")
public class GetReports {

    @XmlElementRef(name = "auth", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<Auth> auth;
    @XmlElementRef(name = "queryRange", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryRange> queryRange;
    @XmlElementRef(name = "reportsFilter", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ReportsFilter> reportsFilter;
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
     * Gets the value of the reportsFilter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReportsFilter }{@code >}
     *     
     */
    public JAXBElement<ReportsFilter> getReportsFilter() {
        return reportsFilter;
    }

    /**
     * Sets the value of the reportsFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReportsFilter }{@code >}
     *     
     */
    public void setReportsFilter(JAXBElement<ReportsFilter> value) {
        this.reportsFilter = value;
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

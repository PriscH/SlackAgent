
package com.prisch.sbm.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="table" type="{urn:sbmappservices72}TableIdentifier" minOccurs="0"/>
 *         &lt;element name="item" type="{urn:sbmappservices72}TTItem"/>
 *         &lt;element name="options" type="{urn:sbmappservices72}ResponseItemOptions" minOccurs="0"/>
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
    "table",
    "item",
    "options"
})
@XmlRootElement(name = "CreateAuxItem")
public class CreateAuxItem {

    @XmlElementRef(name = "auth", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<Auth> auth;
    @XmlElementRef(name = "table", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<TableIdentifier> table;
    @XmlElement(required = true, nillable = true)
    protected TTItem item;
    @XmlElementRef(name = "options", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ResponseItemOptions> options;

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
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link TTItem }
     *     
     */
    public TTItem getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTItem }
     *     
     */
    public void setItem(TTItem value) {
        this.item = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResponseItemOptions }{@code >}
     *     
     */
    public JAXBElement<ResponseItemOptions> getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResponseItemOptions }{@code >}
     *     
     */
    public void setOptions(JAXBElement<ResponseItemOptions> value) {
        this.options = value;
    }

}


package com.prisch.sbm.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.math.BigInteger;


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
 *         &lt;element name="queryWhereClause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderByClause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstRecord" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="maxReturnSize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="options" type="{urn:sbmappservices72}MultipleResponseItemOptions" minOccurs="0"/>
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
    "queryWhereClause",
    "orderByClause",
    "firstRecord",
    "maxReturnSize",
    "options"
})
@XmlRootElement(name = "GetItemsByQuery")
public class GetItemsByQuery {

    @XmlElementRef(name = "auth", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<Auth> auth;
    @XmlElementRef(name = "table", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<TableIdentifier> table;
    @XmlElementRef(name = "queryWhereClause", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<String> queryWhereClause;
    @XmlElementRef(name = "orderByClause", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderByClause;
    protected BigInteger firstRecord;
    protected BigInteger maxReturnSize;
    @XmlElementRef(name = "options", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<MultipleResponseItemOptions> options;

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
     * Gets the value of the queryWhereClause property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQueryWhereClause() {
        return queryWhereClause;
    }

    /**
     * Sets the value of the queryWhereClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQueryWhereClause(JAXBElement<String> value) {
        this.queryWhereClause = value;
    }

    /**
     * Gets the value of the orderByClause property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderByClause() {
        return orderByClause;
    }

    /**
     * Sets the value of the orderByClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderByClause(JAXBElement<String> value) {
        this.orderByClause = value;
    }

    /**
     * Gets the value of the firstRecord property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstRecord() {
        return firstRecord;
    }

    /**
     * Sets the value of the firstRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstRecord(BigInteger value) {
        this.firstRecord = value;
    }

    /**
     * Gets the value of the maxReturnSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxReturnSize() {
        return maxReturnSize;
    }

    /**
     * Sets the value of the maxReturnSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxReturnSize(BigInteger value) {
        this.maxReturnSize = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MultipleResponseItemOptions }{@code >}
     *     
     */
    public JAXBElement<MultipleResponseItemOptions> getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MultipleResponseItemOptions }{@code >}
     *     
     */
    public void setOptions(JAXBElement<MultipleResponseItemOptions> value) {
        this.options = value;
    }

}

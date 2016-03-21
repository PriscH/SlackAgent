
package com.prisch.sbm.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailedItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemId" type="{urn:sbmappservices72}ItemIdentifier" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:sbmappservices72}Status" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailedItem", propOrder = {
    "itemId",
    "status"
})
public class FailedItem {

    @XmlElementRef(name = "itemId", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ItemIdentifier> itemId;
    @XmlElementRef(name = "status", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<Status> status;

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}
     *     
     */
    public JAXBElement<ItemIdentifier> getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}
     *     
     */
    public void setItemId(JAXBElement<ItemIdentifier> value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Status }{@code >}
     *     
     */
    public JAXBElement<Status> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Status }{@code >}
     *     
     */
    public void setStatus(JAXBElement<Status> value) {
        this.status = value;
    }

}

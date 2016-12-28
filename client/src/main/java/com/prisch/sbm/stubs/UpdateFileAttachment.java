
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
 *         &lt;element name="item" type="{urn:sbmappservices72}ItemIdentifier" minOccurs="0"/>
 *         &lt;element name="attachmentContents" type="{urn:sbmappservices72}FileAttachmentContents" minOccurs="0"/>
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
    "item",
    "attachmentContents",
    "options"
})
@XmlRootElement(name = "UpdateFileAttachment")
public class UpdateFileAttachment {

    @XmlElementRef(name = "auth", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<Auth> auth;
    @XmlElementRef(name = "item", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ItemIdentifier> item;
    @XmlElementRef(name = "attachmentContents", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<FileAttachmentContents> attachmentContents;
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
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}
     *     
     */
    public JAXBElement<ItemIdentifier> getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}
     *     
     */
    public void setItem(JAXBElement<ItemIdentifier> value) {
        this.item = value;
    }

    /**
     * Gets the value of the attachmentContents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentContents }{@code >}
     *     
     */
    public JAXBElement<FileAttachmentContents> getAttachmentContents() {
        return attachmentContents;
    }

    /**
     * Sets the value of the attachmentContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileAttachmentContents }{@code >}
     *     
     */
    public void setAttachmentContents(JAXBElement<FileAttachmentContents> value) {
        this.attachmentContents = value;
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

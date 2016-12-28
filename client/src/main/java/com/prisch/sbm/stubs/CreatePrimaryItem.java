
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
 *         &lt;element name="project" type="{urn:sbmappservices72}ProjectIdentifier" minOccurs="0"/>
 *         &lt;element name="parentItem" type="{urn:sbmappservices72}ItemIdentifier" minOccurs="0"/>
 *         &lt;element name="item" type="{urn:sbmappservices72}TTItem"/>
 *         &lt;element name="submitTransition" type="{urn:sbmappservices72}TransitionIdentifier" minOccurs="0"/>
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
    "project",
    "parentItem",
    "item",
    "submitTransition",
    "options"
})
@XmlRootElement(name = "CreatePrimaryItem")
public class CreatePrimaryItem {

    @XmlElementRef(name = "auth", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<Auth> auth;
    @XmlElementRef(name = "project", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ProjectIdentifier> project;
    @XmlElementRef(name = "parentItem", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ItemIdentifier> parentItem;
    @XmlElement(required = true, nillable = true)
    protected TTItem item;
    @XmlElementRef(name = "submitTransition", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<TransitionIdentifier> submitTransition;
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
     * Gets the value of the parentItem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}
     *     
     */
    public JAXBElement<ItemIdentifier> getParentItem() {
        return parentItem;
    }

    /**
     * Sets the value of the parentItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}
     *     
     */
    public void setParentItem(JAXBElement<ItemIdentifier> value) {
        this.parentItem = value;
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
     * Gets the value of the submitTransition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransitionIdentifier }{@code >}
     *     
     */
    public JAXBElement<TransitionIdentifier> getSubmitTransition() {
        return submitTransition;
    }

    /**
     * Sets the value of the submitTransition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransitionIdentifier }{@code >}
     *     
     */
    public void setSubmitTransition(JAXBElement<TransitionIdentifier> value) {
        this.submitTransition = value;
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

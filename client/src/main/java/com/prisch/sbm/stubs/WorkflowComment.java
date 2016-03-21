
package com.prisch.sbm.stubs;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowComment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowComment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="center" type="{urn:sbmappservices72}Point" minOccurs="0"/>
 *         &lt;element name="size" type="{urn:sbmappservices72}Size" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="styleClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="styleOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerTransition" type="{urn:sbmappservices72}TransitionIdentifier" minOccurs="0"/>
 *         &lt;element name="ownerState" type="{urn:sbmappservices72}StateIdentifier" minOccurs="0"/>
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
@XmlType(name = "WorkflowComment", propOrder = {
    "id",
    "center",
    "size",
    "text",
    "styleClass",
    "styleOverride",
    "ownerTransition",
    "ownerState",
    "extendedData"
})
public class WorkflowComment {

    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElementRef(name = "center", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<Point> center;
    @XmlElementRef(name = "size", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<Size> size;
    @XmlElementRef(name = "text", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<String> text;
    @XmlElementRef(name = "styleClass", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<String> styleClass;
    @XmlElementRef(name = "styleOverride", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<String> styleOverride;
    @XmlElementRef(name = "ownerTransition", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<TransitionIdentifier> ownerTransition;
    @XmlElementRef(name = "ownerState", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<StateIdentifier> ownerState;
    @XmlElementRef(name = "extendedData", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtendedData> extendedData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the center property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Point }{@code >}
     *     
     */
    public JAXBElement<Point> getCenter() {
        return center;
    }

    /**
     * Sets the value of the center property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Point }{@code >}
     *     
     */
    public void setCenter(JAXBElement<Point> value) {
        this.center = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Size }{@code >}
     *     
     */
    public JAXBElement<Size> getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Size }{@code >}
     *     
     */
    public void setSize(JAXBElement<Size> value) {
        this.size = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setText(JAXBElement<String> value) {
        this.text = value;
    }

    /**
     * Gets the value of the styleClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStyleClass() {
        return styleClass;
    }

    /**
     * Sets the value of the styleClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStyleClass(JAXBElement<String> value) {
        this.styleClass = value;
    }

    /**
     * Gets the value of the styleOverride property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStyleOverride() {
        return styleOverride;
    }

    /**
     * Sets the value of the styleOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStyleOverride(JAXBElement<String> value) {
        this.styleOverride = value;
    }

    /**
     * Gets the value of the ownerTransition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransitionIdentifier }{@code >}
     *     
     */
    public JAXBElement<TransitionIdentifier> getOwnerTransition() {
        return ownerTransition;
    }

    /**
     * Sets the value of the ownerTransition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransitionIdentifier }{@code >}
     *     
     */
    public void setOwnerTransition(JAXBElement<TransitionIdentifier> value) {
        this.ownerTransition = value;
    }

    /**
     * Gets the value of the ownerState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateIdentifier }{@code >}
     *     
     */
    public JAXBElement<StateIdentifier> getOwnerState() {
        return ownerState;
    }

    /**
     * Sets the value of the ownerState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateIdentifier }{@code >}
     *     
     */
    public void setOwnerState(JAXBElement<StateIdentifier> value) {
        this.ownerState = value;
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

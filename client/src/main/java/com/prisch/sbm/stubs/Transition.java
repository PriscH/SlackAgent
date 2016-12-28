
package com.prisch.sbm.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Transition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transition" type="{urn:sbmappservices72}TransitionIdentifier" minOccurs="0"/>
 *         &lt;element name="fromState" type="{urn:sbmappservices72}StateIdentifier" minOccurs="0"/>
 *         &lt;element name="toState" type="{urn:sbmappservices72}StateIdentifier" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:sbmappservices72}Transition-Type"/>
 *         &lt;element name="project" type="{urn:sbmappservices72}ProjectIdentifier" minOccurs="0"/>
 *         &lt;element name="transitionAttribute" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "Transition", propOrder = {
    "transition",
    "fromState",
    "toState",
    "type",
    "project",
    "transitionAttribute",
    "extendedData"
})
public class Transition {

    @XmlElementRef(name = "transition", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<TransitionIdentifier> transition;
    @XmlElementRef(name = "fromState", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<StateIdentifier> fromState;
    @XmlElementRef(name = "toState", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<StateIdentifier> toState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TransitionType type;
    @XmlElementRef(name = "project", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ProjectIdentifier> project;
    protected List<String> transitionAttribute;
    @XmlElementRef(name = "extendedData", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtendedData> extendedData;

    /**
     * Gets the value of the transition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransitionIdentifier }{@code >}
     *     
     */
    public JAXBElement<TransitionIdentifier> getTransition() {
        return transition;
    }

    /**
     * Sets the value of the transition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransitionIdentifier }{@code >}
     *     
     */
    public void setTransition(JAXBElement<TransitionIdentifier> value) {
        this.transition = value;
    }

    /**
     * Gets the value of the fromState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateIdentifier }{@code >}
     *     
     */
    public JAXBElement<StateIdentifier> getFromState() {
        return fromState;
    }

    /**
     * Sets the value of the fromState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateIdentifier }{@code >}
     *     
     */
    public void setFromState(JAXBElement<StateIdentifier> value) {
        this.fromState = value;
    }

    /**
     * Gets the value of the toState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateIdentifier }{@code >}
     *     
     */
    public JAXBElement<StateIdentifier> getToState() {
        return toState;
    }

    /**
     * Sets the value of the toState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateIdentifier }{@code >}
     *     
     */
    public void setToState(JAXBElement<StateIdentifier> value) {
        this.toState = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TransitionType }
     *     
     */
    public TransitionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitionType }
     *     
     */
    public void setType(TransitionType value) {
        this.type = value;
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
     * Gets the value of the transitionAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transitionAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitionAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTransitionAttribute() {
        if (transitionAttribute == null) {
            transitionAttribute = new ArrayList<String>();
        }
        return this.transitionAttribute;
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

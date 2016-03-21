
package com.prisch.sbm.stubs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{urn:sbmappservices72}FieldIdentifier" minOccurs="0"/>
 *         &lt;element name="setValueBy" type="{urn:sbmappservices72}Set-Value-By" minOccurs="0"/>
 *         &lt;element name="setValueMethod" type="{urn:sbmappservices72}Set-Value-Method" minOccurs="0"/>
 *         &lt;element name="value" type="{urn:sbmappservices72}FieldValue" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameValue", propOrder = {
    "id",
    "setValueBy",
    "setValueMethod",
    "value"
})
public class NameValue {

    @XmlElementRef(name = "id", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<FieldIdentifier> id;
    @XmlElementRef(name = "setValueBy", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<SetValueBy> setValueBy;
    @XmlElementRef(name = "setValueMethod", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<SetValueMethod> setValueMethod;
    @XmlElement(required = true)
    protected List<FieldValue> value;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FieldIdentifier }{@code >}
     *     
     */
    public JAXBElement<FieldIdentifier> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FieldIdentifier }{@code >}
     *     
     */
    public void setId(JAXBElement<FieldIdentifier> value) {
        this.id = value;
    }

    /**
     * Gets the value of the setValueBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SetValueBy }{@code >}
     *     
     */
    public JAXBElement<SetValueBy> getSetValueBy() {
        return setValueBy;
    }

    /**
     * Sets the value of the setValueBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SetValueBy }{@code >}
     *     
     */
    public void setSetValueBy(JAXBElement<SetValueBy> value) {
        this.setValueBy = value;
    }

    /**
     * Gets the value of the setValueMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SetValueMethod }{@code >}
     *     
     */
    public JAXBElement<SetValueMethod> getSetValueMethod() {
        return setValueMethod;
    }

    /**
     * Sets the value of the setValueMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SetValueMethod }{@code >}
     *     
     */
    public void setSetValueMethod(JAXBElement<SetValueMethod> value) {
        this.setValueMethod = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldValue }
     * 
     * 
     */
    public List<FieldValue> getValue() {
        if (value == null) {
            value = new ArrayList<FieldValue>();
        }
        return this.value;
    }

}

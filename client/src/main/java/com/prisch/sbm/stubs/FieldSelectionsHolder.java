
package com.prisch.sbm.stubs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldSelectionsHolder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldSelectionsHolder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="field" type="{urn:sbmappservices72}FieldIdentifier" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:sbmappservices72}Selection-Type"/>
 *         &lt;element name="attribute" type="{urn:sbmappservices72}Field-Attribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="option" type="{urn:sbmappservices72}SelectionOption" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:sbmappservices72}Status" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "FieldSelectionsHolder", propOrder = {
    "field",
    "type",
    "attribute",
    "option",
    "status",
    "extendedData"
})
public class FieldSelectionsHolder {

    @XmlElementRef(name = "field", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<FieldIdentifier> field;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SelectionType type;
    @XmlSchemaType(name = "string")
    protected List<FieldAttribute> attribute;
    protected List<SelectionOption> option;
    protected List<Status> status;
    @XmlElementRef(name = "extendedData", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtendedData> extendedData;

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FieldIdentifier }{@code >}
     *     
     */
    public JAXBElement<FieldIdentifier> getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FieldIdentifier }{@code >}
     *     
     */
    public void setField(JAXBElement<FieldIdentifier> value) {
        this.field = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionType }
     *     
     */
    public SelectionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionType }
     *     
     */
    public void setType(SelectionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldAttribute }
     * 
     * 
     */
    public List<FieldAttribute> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<FieldAttribute>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the option property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the option property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionOption }
     * 
     * 
     */
    public List<SelectionOption> getOption() {
        if (option == null) {
            option = new ArrayList<SelectionOption>();
        }
        return this.option;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Status }
     * 
     * 
     */
    public List<Status> getStatus() {
        if (status == null) {
            status = new ArrayList<Status>();
        }
        return this.status;
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

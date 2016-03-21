
package com.prisch.sbm.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{urn:sbmappservices72}GroupIdentifier" minOccurs="0"/>
 *         &lt;element name="accessType" type="{urn:sbmappservices72}AccessType" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "GroupInfo", propOrder = {
    "id",
    "accessType",
    "memo",
    "isDeleted",
    "extendedData"
})
public class GroupInfo {

    @XmlElementRef(name = "id", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<GroupIdentifier> id;
    @XmlElement(defaultValue = "ACCESS-LEAVE-UNCHANGED")
    @XmlSchemaType(name = "string")
    protected AccessType accessType;
    @XmlElementRef(name = "memo", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<String> memo;
    protected boolean isDeleted;
    @XmlElementRef(name = "extendedData", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtendedData> extendedData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GroupIdentifier }{@code >}
     *     
     */
    public JAXBElement<GroupIdentifier> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GroupIdentifier }{@code >}
     *     
     */
    public void setId(JAXBElement<GroupIdentifier> value) {
        this.id = value;
    }

    /**
     * Gets the value of the accessType property.
     * 
     * @return
     *     possible object is
     *     {@link AccessType }
     *     
     */
    public AccessType getAccessType() {
        return accessType;
    }

    /**
     * Sets the value of the accessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessType }
     *     
     */
    public void setAccessType(AccessType value) {
        this.accessType = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMemo(JAXBElement<String> value) {
        this.memo = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     */
    public boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     */
    public void setIsDeleted(boolean value) {
        this.isDeleted = value;
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

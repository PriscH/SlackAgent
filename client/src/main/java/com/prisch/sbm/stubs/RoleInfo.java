
package com.prisch.sbm.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoleInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{urn:sbmappservices72}RoleIdentifier"/>
 *         &lt;element name="access" type="{urn:sbmappservices72}GrantState"/>
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
@XmlType(name = "RoleInfo", propOrder = {
    "id",
    "access",
    "extendedData"
})
public class RoleInfo {

    @XmlElement(required = true, nillable = true)
    protected RoleIdentifier id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected GrantState access;
    @XmlElementRef(name = "extendedData", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtendedData> extendedData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link RoleIdentifier }
     *     
     */
    public RoleIdentifier getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleIdentifier }
     *     
     */
    public void setId(RoleIdentifier value) {
        this.id = value;
    }

    /**
     * Gets the value of the access property.
     * 
     * @return
     *     possible object is
     *     {@link GrantState }
     *     
     */
    public GrantState getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrantState }
     *     
     */
    public void setAccess(GrantState value) {
        this.access = value;
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

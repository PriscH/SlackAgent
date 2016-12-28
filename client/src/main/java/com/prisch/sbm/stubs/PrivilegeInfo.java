
package com.prisch.sbm.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for PrivilegeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrivilegeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="privilegeId" type="{urn:sbmappservices72}PrivilegeIdentifier"/>
 *         &lt;element name="access" type="{urn:sbmappservices72}GrantState"/>
 *         &lt;element name="objectId" type="{urn:sbmappservices72}Identifier" minOccurs="0"/>
 *         &lt;element name="projectId" type="{urn:sbmappservices72}ProjectIdentifier" minOccurs="0"/>
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
@XmlType(name = "PrivilegeInfo", propOrder = {
    "privilegeId",
    "access",
    "objectId",
    "projectId",
    "extendedData"
})
public class PrivilegeInfo {

    @XmlElement(required = true, nillable = true)
    protected PrivilegeIdentifier privilegeId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected GrantState access;
    @XmlElementRef(name = "objectId", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<Identifier> objectId;
    @XmlElementRef(name = "projectId", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ProjectIdentifier> projectId;
    @XmlElementRef(name = "extendedData", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtendedData> extendedData;

    /**
     * Gets the value of the privilegeId property.
     * 
     * @return
     *     possible object is
     *     {@link PrivilegeIdentifier }
     *     
     */
    public PrivilegeIdentifier getPrivilegeId() {
        return privilegeId;
    }

    /**
     * Sets the value of the privilegeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivilegeIdentifier }
     *     
     */
    public void setPrivilegeId(PrivilegeIdentifier value) {
        this.privilegeId = value;
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
     * Gets the value of the objectId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Identifier }{@code >}
     *     
     */
    public JAXBElement<Identifier> getObjectId() {
        return objectId;
    }

    /**
     * Sets the value of the objectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Identifier }{@code >}
     *     
     */
    public void setObjectId(JAXBElement<Identifier> value) {
        this.objectId = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProjectIdentifier }{@code >}
     *     
     */
    public JAXBElement<ProjectIdentifier> getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProjectIdentifier }{@code >}
     *     
     */
    public void setProjectId(JAXBElement<ProjectIdentifier> value) {
        this.projectId = value;
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

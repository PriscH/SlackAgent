
package com.prisch.sbm.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserSingleResponseOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserSingleResponseOptions">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sbmappservices72}Options">
 *       &lt;sequence>
 *         &lt;element name="sections" type="{urn:sbmappservices72}SectionsOption"/>
 *         &lt;element name="specifiedSections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserSingleResponseOptions", propOrder = {
    "sections",
    "specifiedSections"
})
@XmlSeeAlso({
    UserResponseOptions.class
})
public class UserSingleResponseOptions
    extends Options
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SectionsOption sections;
    @XmlElementRef(name = "specifiedSections", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specifiedSections;

    /**
     * Gets the value of the sections property.
     * 
     * @return
     *     possible object is
     *     {@link SectionsOption }
     *     
     */
    public SectionsOption getSections() {
        return sections;
    }

    /**
     * Sets the value of the sections property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionsOption }
     *     
     */
    public void setSections(SectionsOption value) {
        this.sections = value;
    }

    /**
     * Gets the value of the specifiedSections property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecifiedSections() {
        return specifiedSections;
    }

    /**
     * Sets the value of the specifiedSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecifiedSections(JAXBElement<String> value) {
        this.specifiedSections = value;
    }

}


package com.prisch.sbm.stubs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseItemOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseItemOptions">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sbmappservices72}Options">
 *       &lt;sequence>
 *         &lt;element name="sections" type="{urn:sbmappservices72}SectionsOption"/>
 *         &lt;element name="specifiedSections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limitedField" type="{urn:sbmappservices72}FieldIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseItemOptions", propOrder = {
    "sections",
    "specifiedSections",
    "limitedField"
})
@XmlSeeAlso({
    MultipleResponseItemOptions.class
})
public class ResponseItemOptions
    extends Options
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SectionsOption sections;
    @XmlElementRef(name = "specifiedSections", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specifiedSections;
    protected List<FieldIdentifier> limitedField;

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

    /**
     * Gets the value of the limitedField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limitedField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimitedField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldIdentifier }
     * 
     * 
     */
    public List<FieldIdentifier> getLimitedField() {
        if (limitedField == null) {
            limitedField = new ArrayList<FieldIdentifier>();
        }
        return this.limitedField;
    }

}

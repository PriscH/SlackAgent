
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SerenaDiagnostics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SerenaDiagnostics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:SerenaDiagnostics}XId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerenaDiagnostics", namespace = "urn:SerenaDiagnostics", propOrder = {
    "xId"
})
public class SerenaDiagnostics {

    @XmlElement(name = "XId")
    protected String xId;

    /**
     * Gets the value of the xId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXId() {
        return xId;
    }

    /**
     * Sets the value of the xId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXId(String value) {
        this.xId = value;
    }

}

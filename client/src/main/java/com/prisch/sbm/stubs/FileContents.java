
package com.prisch.sbm.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileContents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileContents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contentsBase64" type="{urn:sbmappservices72}FileBufferBase64" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileContents", propOrder = {
    "contentsBase64"
})
public class FileContents {

    @XmlElementRef(name = "contentsBase64", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<FileBufferBase64> contentsBase64;

    /**
     * Gets the value of the contentsBase64 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileBufferBase64 }{@code >}
     *     
     */
    public JAXBElement<FileBufferBase64> getContentsBase64() {
        return contentsBase64;
    }

    /**
     * Sets the value of the contentsBase64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileBufferBase64 }{@code >}
     *     
     */
    public void setContentsBase64(JAXBElement<FileBufferBase64> value) {
        this.contentsBase64 = value;
    }

}

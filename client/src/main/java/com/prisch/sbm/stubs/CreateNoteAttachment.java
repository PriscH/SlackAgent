
package com.prisch.sbm.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auth" type="{urn:sbmappservices72}Auth" minOccurs="0"/>
 *         &lt;element name="item" type="{urn:sbmappservices72}ItemIdentifier" minOccurs="0"/>
 *         &lt;element name="author" type="{urn:sbmappservices72}UserIdentifier" minOccurs="0"/>
 *         &lt;element name="noteContents" type="{urn:sbmappservices72}NoteAttachmentContents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "auth",
    "item",
    "author",
    "noteContents"
})
@XmlRootElement(name = "CreateNoteAttachment")
public class CreateNoteAttachment {

    @XmlElementRef(name = "auth", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<Auth> auth;
    @XmlElementRef(name = "item", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ItemIdentifier> item;
    @XmlElementRef(name = "author", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<UserIdentifier> author;
    @XmlElementRef(name = "noteContents", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<NoteAttachmentContents> noteContents;

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Auth }{@code >}
     *     
     */
    public JAXBElement<Auth> getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Auth }{@code >}
     *     
     */
    public void setAuth(JAXBElement<Auth> value) {
        this.auth = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}
     *     
     */
    public JAXBElement<ItemIdentifier> getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}
     *     
     */
    public void setItem(JAXBElement<ItemIdentifier> value) {
        this.item = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}
     *     
     */
    public JAXBElement<UserIdentifier> getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}
     *     
     */
    public void setAuthor(JAXBElement<UserIdentifier> value) {
        this.author = value;
    }

    /**
     * Gets the value of the noteContents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NoteAttachmentContents }{@code >}
     *     
     */
    public JAXBElement<NoteAttachmentContents> getNoteContents() {
        return noteContents;
    }

    /**
     * Sets the value of the noteContents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NoteAttachmentContents }{@code >}
     *     
     */
    public void setNoteContents(JAXBElement<NoteAttachmentContents> value) {
        this.noteContents = value;
    }

}

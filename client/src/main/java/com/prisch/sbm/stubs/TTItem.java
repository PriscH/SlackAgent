
package com.prisch.sbm.stubs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * <p>Java class for TTItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TTItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{urn:sbmappservices72}ItemIdentifier" minOccurs="0"/>
 *         &lt;element name="itemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="project" type="{urn:sbmappservices72}ProjectIdentifier" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{urn:sbmappservices72}UserIdentifier" minOccurs="0"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="modifiedBy" type="{urn:sbmappservices72}UserIdentifier" minOccurs="0"/>
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="activeInactive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{urn:sbmappservices72}StateIdentifier" minOccurs="0"/>
 *         &lt;element name="owner" type="{urn:sbmappservices72}UserIdentifier" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extendedField" type="{urn:sbmappservices72}NameValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="note" type="{urn:sbmappservices72}Note" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="itemLink" type="{urn:sbmappservices72}ItemLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="urlAttachment" type="{urn:sbmappservices72}URLAttachment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fileAttachment" type="{urn:sbmappservices72}FileAttachment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subtasks" type="{urn:sbmappservices72}SubTasks" minOccurs="0"/>
 *         &lt;element name="extendedData" type="{urn:sbmappservices72}ExtendedData" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTItem", propOrder = {
    "id",
    "itemType",
    "project",
    "title",
    "description",
    "createdBy",
    "createDate",
    "modifiedBy",
    "modifiedDate",
    "activeInactive",
    "state",
    "owner",
    "url",
    "extendedField",
    "note",
    "itemLink",
    "urlAttachment",
    "fileAttachment",
    "subtasks",
    "extendedData",
    "any"
})
public class TTItem {

    @XmlElementRef(name = "id", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ItemIdentifier> id;
    @XmlElementRef(name = "itemType", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemType;
    @XmlElementRef(name = "project", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ProjectIdentifier> project;
    @XmlElementRef(name = "title", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "description", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "createdBy", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<UserIdentifier> createdBy;
    @XmlElementRef(name = "createDate", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createDate;
    @XmlElementRef(name = "modifiedBy", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<UserIdentifier> modifiedBy;
    @XmlElementRef(name = "modifiedDate", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> modifiedDate;
    @XmlElementRef(name = "activeInactive", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activeInactive;
    @XmlElementRef(name = "state", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<StateIdentifier> state;
    @XmlElementRef(name = "owner", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<UserIdentifier> owner;
    @XmlElementRef(name = "url", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<String> url;
    protected List<NameValue> extendedField;
    protected List<Note> note;
    protected List<ItemLink> itemLink;
    protected List<URLAttachment> urlAttachment;
    protected List<FileAttachment> fileAttachment;
    @XmlElementRef(name = "subtasks", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<SubTasks> subtasks;
    @XmlElementRef(name = "extendedData", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtendedData> extendedData;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}
     *     
     */
    public JAXBElement<ItemIdentifier> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ItemIdentifier }{@code >}
     *     
     */
    public void setId(JAXBElement<ItemIdentifier> value) {
        this.id = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemType(JAXBElement<String> value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProjectIdentifier }{@code >}
     *     
     */
    public JAXBElement<ProjectIdentifier> getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProjectIdentifier }{@code >}
     *     
     */
    public void setProject(JAXBElement<ProjectIdentifier> value) {
        this.project = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}
     *     
     */
    public JAXBElement<UserIdentifier> getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}
     *     
     */
    public void setCreatedBy(JAXBElement<UserIdentifier> value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the modifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}
     *     
     */
    public JAXBElement<UserIdentifier> getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Sets the value of the modifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}
     *     
     */
    public void setModifiedBy(JAXBElement<UserIdentifier> value) {
        this.modifiedBy = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setModifiedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the activeInactive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActiveInactive() {
        return activeInactive;
    }

    /**
     * Sets the value of the activeInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActiveInactive(JAXBElement<String> value) {
        this.activeInactive = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StateIdentifier }{@code >}
     *     
     */
    public JAXBElement<StateIdentifier> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StateIdentifier }{@code >}
     *     
     */
    public void setState(JAXBElement<StateIdentifier> value) {
        this.state = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}
     *     
     */
    public JAXBElement<UserIdentifier> getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}
     *     
     */
    public void setOwner(JAXBElement<UserIdentifier> value) {
        this.owner = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrl(JAXBElement<String> value) {
        this.url = value;
    }

    /**
     * Gets the value of the extendedField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValue }
     * 
     * 
     */
    public List<NameValue> getExtendedField() {
        if (extendedField == null) {
            extendedField = new ArrayList<NameValue>();
        }
        return this.extendedField;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * 
     * 
     */
    public List<Note> getNote() {
        if (note == null) {
            note = new ArrayList<Note>();
        }
        return this.note;
    }

    /**
     * Gets the value of the itemLink property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemLink property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemLink().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemLink }
     * 
     * 
     */
    public List<ItemLink> getItemLink() {
        if (itemLink == null) {
            itemLink = new ArrayList<ItemLink>();
        }
        return this.itemLink;
    }

    /**
     * Gets the value of the urlAttachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlAttachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrlAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link URLAttachment }
     * 
     * 
     */
    public List<URLAttachment> getUrlAttachment() {
        if (urlAttachment == null) {
            urlAttachment = new ArrayList<URLAttachment>();
        }
        return this.urlAttachment;
    }

    /**
     * Gets the value of the fileAttachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileAttachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileAttachment }
     * 
     * 
     */
    public List<FileAttachment> getFileAttachment() {
        if (fileAttachment == null) {
            fileAttachment = new ArrayList<FileAttachment>();
        }
        return this.fileAttachment;
    }

    /**
     * Gets the value of the subtasks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubTasks }{@code >}
     *     
     */
    public JAXBElement<SubTasks> getSubtasks() {
        return subtasks;
    }

    /**
     * Sets the value of the subtasks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubTasks }{@code >}
     *     
     */
    public void setSubtasks(JAXBElement<SubTasks> value) {
        this.subtasks = value;
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

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}

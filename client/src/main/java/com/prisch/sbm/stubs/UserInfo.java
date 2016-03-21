
package com.prisch.sbm.stubs;

import java.math.BigInteger;
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
 * <p>Java class for UserInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{urn:sbmappservices72}UserIdentifier" minOccurs="0"/>
 *         &lt;element name="accessType" type="{urn:sbmappservices72}AccessType" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offsetFromGMT" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="dstSavings" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="datePreference" type="{urn:sbmappservices72}DatePreference" minOccurs="0"/>
 *         &lt;element name="timePreference" type="{urn:sbmappservices72}TimePreference" minOccurs="0"/>
 *         &lt;element name="namespaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="contact" type="{urn:sbmappservices72}ContactIdentifier" minOccurs="0"/>
 *         &lt;element name="maxNotes" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="maxChangeHistory" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="maxItemsPerPage" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="fieldsMask" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="notesMask" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="changeHistoryMask" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="browserMask" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="group" type="{urn:sbmappservices72}GroupIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="preferredSolution" type="{urn:sbmappservices72}SolutionIdentifier" minOccurs="0"/>
 *         &lt;element name="solutionData" type="{urn:sbmappservices72}UserSolutionData" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "UserInfo", propOrder = {
    "id",
    "accessType",
    "email",
    "emailCC",
    "timezone",
    "offsetFromGMT",
    "dstSavings",
    "datePreference",
    "timePreference",
    "namespaceName",
    "phoneNumber",
    "locale",
    "isDeleted",
    "contact",
    "maxNotes",
    "maxChangeHistory",
    "maxItemsPerPage",
    "fieldsMask",
    "notesMask",
    "changeHistoryMask",
    "browserMask",
    "group",
    "preferredSolution",
    "solutionData",
    "extendedData"
})
public class UserInfo {

    @XmlElementRef(name = "id", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<UserIdentifier> id;
    @XmlElement(defaultValue = "ACCESS-LEAVE-UNCHANGED")
    @XmlSchemaType(name = "string")
    protected AccessType accessType;
    @XmlElementRef(name = "email", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "emailCC", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailCC;
    @XmlElementRef(name = "timezone", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timezone;
    protected BigInteger offsetFromGMT;
    protected BigInteger dstSavings;
    @XmlElement(defaultValue = "DATE-FORMAT-LEAVE-UNCHANGED")
    @XmlSchemaType(name = "string")
    protected DatePreference datePreference;
    @XmlElement(defaultValue = "TIME-FORMAT-LEAVE-UNCHANGED")
    @XmlSchemaType(name = "string")
    protected TimePreference timePreference;
    @XmlElementRef(name = "namespaceName", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<String> namespaceName;
    @XmlElementRef(name = "phoneNumber", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneNumber;
    @XmlElementRef(name = "locale", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locale;
    protected boolean isDeleted;
    @XmlElementRef(name = "contact", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ContactIdentifier> contact;
    protected BigInteger maxNotes;
    protected BigInteger maxChangeHistory;
    protected BigInteger maxItemsPerPage;
    protected BigInteger fieldsMask;
    protected BigInteger notesMask;
    protected BigInteger changeHistoryMask;
    protected BigInteger browserMask;
    protected List<GroupIdentifier> group;
    @XmlElementRef(name = "preferredSolution", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<SolutionIdentifier> preferredSolution;
    protected List<UserSolutionData> solutionData;
    @XmlElementRef(name = "extendedData", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtendedData> extendedData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}
     *     
     */
    public JAXBElement<UserIdentifier> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserIdentifier }{@code >}
     *     
     */
    public void setId(JAXBElement<UserIdentifier> value) {
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Gets the value of the emailCC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailCC() {
        return emailCC;
    }

    /**
     * Sets the value of the emailCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailCC(JAXBElement<String> value) {
        this.emailCC = value;
    }

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimezone(JAXBElement<String> value) {
        this.timezone = value;
    }

    /**
     * Gets the value of the offsetFromGMT property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOffsetFromGMT() {
        return offsetFromGMT;
    }

    /**
     * Sets the value of the offsetFromGMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOffsetFromGMT(BigInteger value) {
        this.offsetFromGMT = value;
    }

    /**
     * Gets the value of the dstSavings property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDstSavings() {
        return dstSavings;
    }

    /**
     * Sets the value of the dstSavings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDstSavings(BigInteger value) {
        this.dstSavings = value;
    }

    /**
     * Gets the value of the datePreference property.
     * 
     * @return
     *     possible object is
     *     {@link DatePreference }
     *     
     */
    public DatePreference getDatePreference() {
        return datePreference;
    }

    /**
     * Sets the value of the datePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePreference }
     *     
     */
    public void setDatePreference(DatePreference value) {
        this.datePreference = value;
    }

    /**
     * Gets the value of the timePreference property.
     * 
     * @return
     *     possible object is
     *     {@link TimePreference }
     *     
     */
    public TimePreference getTimePreference() {
        return timePreference;
    }

    /**
     * Sets the value of the timePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePreference }
     *     
     */
    public void setTimePreference(TimePreference value) {
        this.timePreference = value;
    }

    /**
     * Gets the value of the namespaceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNamespaceName() {
        return namespaceName;
    }

    /**
     * Sets the value of the namespaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNamespaceName(JAXBElement<String> value) {
        this.namespaceName = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneNumber(JAXBElement<String> value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocale(JAXBElement<String> value) {
        this.locale = value;
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
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactIdentifier }{@code >}
     *     
     */
    public JAXBElement<ContactIdentifier> getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactIdentifier }{@code >}
     *     
     */
    public void setContact(JAXBElement<ContactIdentifier> value) {
        this.contact = value;
    }

    /**
     * Gets the value of the maxNotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNotes() {
        return maxNotes;
    }

    /**
     * Sets the value of the maxNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNotes(BigInteger value) {
        this.maxNotes = value;
    }

    /**
     * Gets the value of the maxChangeHistory property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxChangeHistory() {
        return maxChangeHistory;
    }

    /**
     * Sets the value of the maxChangeHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxChangeHistory(BigInteger value) {
        this.maxChangeHistory = value;
    }

    /**
     * Gets the value of the maxItemsPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxItemsPerPage() {
        return maxItemsPerPage;
    }

    /**
     * Sets the value of the maxItemsPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxItemsPerPage(BigInteger value) {
        this.maxItemsPerPage = value;
    }

    /**
     * Gets the value of the fieldsMask property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFieldsMask() {
        return fieldsMask;
    }

    /**
     * Sets the value of the fieldsMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFieldsMask(BigInteger value) {
        this.fieldsMask = value;
    }

    /**
     * Gets the value of the notesMask property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNotesMask() {
        return notesMask;
    }

    /**
     * Sets the value of the notesMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNotesMask(BigInteger value) {
        this.notesMask = value;
    }

    /**
     * Gets the value of the changeHistoryMask property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChangeHistoryMask() {
        return changeHistoryMask;
    }

    /**
     * Sets the value of the changeHistoryMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChangeHistoryMask(BigInteger value) {
        this.changeHistoryMask = value;
    }

    /**
     * Gets the value of the browserMask property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBrowserMask() {
        return browserMask;
    }

    /**
     * Sets the value of the browserMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBrowserMask(BigInteger value) {
        this.browserMask = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupIdentifier }
     * 
     * 
     */
    public List<GroupIdentifier> getGroup() {
        if (group == null) {
            group = new ArrayList<GroupIdentifier>();
        }
        return this.group;
    }

    /**
     * Gets the value of the preferredSolution property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SolutionIdentifier }{@code >}
     *     
     */
    public JAXBElement<SolutionIdentifier> getPreferredSolution() {
        return preferredSolution;
    }

    /**
     * Sets the value of the preferredSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SolutionIdentifier }{@code >}
     *     
     */
    public void setPreferredSolution(JAXBElement<SolutionIdentifier> value) {
        this.preferredSolution = value;
    }

    /**
     * Gets the value of the solutionData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solutionData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolutionData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserSolutionData }
     * 
     * 
     */
    public List<UserSolutionData> getSolutionData() {
        if (solutionData == null) {
            solutionData = new ArrayList<UserSolutionData>();
        }
        return this.solutionData;
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

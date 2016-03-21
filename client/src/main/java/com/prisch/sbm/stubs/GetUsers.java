
package com.prisch.sbm.stubs;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="getCurrentUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="searchByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user" type="{urn:sbmappservices72}UserIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="options" type="{urn:sbmappservices72}UserResponseOptions" minOccurs="0"/>
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
    "getCurrentUser",
    "searchByName",
    "user",
    "options"
})
@XmlRootElement(name = "GetUsers")
public class GetUsers {

    @XmlElementRef(name = "auth", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<Auth> auth;
    protected boolean getCurrentUser;
    @XmlElementRef(name = "searchByName", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<String> searchByName;
    protected List<UserIdentifier> user;
    @XmlElementRef(name = "options", namespace = "urn:sbmappservices72", type = JAXBElement.class, required = false)
    protected JAXBElement<UserResponseOptions> options;

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
     * Gets the value of the getCurrentUser property.
     * 
     */
    public boolean isGetCurrentUser() {
        return getCurrentUser;
    }

    /**
     * Sets the value of the getCurrentUser property.
     * 
     */
    public void setGetCurrentUser(boolean value) {
        this.getCurrentUser = value;
    }

    /**
     * Gets the value of the searchByName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSearchByName() {
        return searchByName;
    }

    /**
     * Sets the value of the searchByName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSearchByName(JAXBElement<String> value) {
        this.searchByName = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the user property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserIdentifier }
     * 
     * 
     */
    public List<UserIdentifier> getUser() {
        if (user == null) {
            user = new ArrayList<UserIdentifier>();
        }
        return this.user;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserResponseOptions }{@code >}
     *     
     */
    public JAXBElement<UserResponseOptions> getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserResponseOptions }{@code >}
     *     
     */
    public void setOptions(JAXBElement<UserResponseOptions> value) {
        this.options = value;
    }

}

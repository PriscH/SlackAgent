
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Options complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Options">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extraOption" type="{urn:sbmappservices72}ExtraValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Options", propOrder = {
    "extraOption"
})
@XmlSeeAlso({
    MultipleOptions.class,
    ResponseItemOptions.class,
    UserSingleResponseOptions.class
})
public class Options {

    protected List<ExtraValue> extraOption;

    /**
     * Gets the value of the extraOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtraValue }
     * 
     * 
     */
    public List<ExtraValue> getExtraOption() {
        if (extraOption == null) {
            extraOption = new ArrayList<ExtraValue>();
        }
        return this.extraOption;
    }

}

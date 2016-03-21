
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserResponseOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserResponseOptions">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sbmappservices72}UserSingleResponseOptions">
 *       &lt;sequence>
 *         &lt;element name="multiOption" type="{urn:sbmappservices72}MultipleOption" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserResponseOptions", propOrder = {
    "multiOption"
})
public class UserResponseOptions
    extends UserSingleResponseOptions
{

    @XmlSchemaType(name = "string")
    protected MultipleOption multiOption;

    /**
     * Gets the value of the multiOption property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleOption }
     *     
     */
    public MultipleOption getMultiOption() {
        return multiOption;
    }

    /**
     * Sets the value of the multiOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleOption }
     *     
     */
    public void setMultiOption(MultipleOption value) {
        this.multiOption = value;
    }

}

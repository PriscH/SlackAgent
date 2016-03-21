
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Field-Attribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Field-Attribute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ATTRIBUTES-NOT-DEFINED"/>
 *     &lt;enumeration value="BINARY-ATTRIBUTE-LISTBOX"/>
 *     &lt;enumeration value="BINARY-ATTRIBUTE-RADIOBUTTON"/>
 *     &lt;enumeration value="BINARY-ATTRIBUTE-CHECKBOX"/>
 *     &lt;enumeration value="BINARY-ATTRIBUTE-TRINARY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Field-Attribute")
@XmlEnum
public enum FieldAttribute {

    @XmlEnumValue("ATTRIBUTES-NOT-DEFINED")
    ATTRIBUTES_NOT_DEFINED("ATTRIBUTES-NOT-DEFINED"),
    @XmlEnumValue("BINARY-ATTRIBUTE-LISTBOX")
    BINARY_ATTRIBUTE_LISTBOX("BINARY-ATTRIBUTE-LISTBOX"),
    @XmlEnumValue("BINARY-ATTRIBUTE-RADIOBUTTON")
    BINARY_ATTRIBUTE_RADIOBUTTON("BINARY-ATTRIBUTE-RADIOBUTTON"),
    @XmlEnumValue("BINARY-ATTRIBUTE-CHECKBOX")
    BINARY_ATTRIBUTE_CHECKBOX("BINARY-ATTRIBUTE-CHECKBOX"),
    @XmlEnumValue("BINARY-ATTRIBUTE-TRINARY")
    BINARY_ATTRIBUTE_TRINARY("BINARY-ATTRIBUTE-TRINARY");
    private final String value;

    FieldAttribute(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FieldAttribute fromValue(String v) {
        for (FieldAttribute c: FieldAttribute.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

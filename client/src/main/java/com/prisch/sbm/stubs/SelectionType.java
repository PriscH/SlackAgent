
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Selection-Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Selection-Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SINGLE-SELECTION"/>
 *     &lt;enumeration value="BINARY-SELECTION"/>
 *     &lt;enumeration value="MULTI-SELECTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Selection-Type")
@XmlEnum
public enum SelectionType {

    @XmlEnumValue("SINGLE-SELECTION")
    SINGLE_SELECTION("SINGLE-SELECTION"),
    @XmlEnumValue("BINARY-SELECTION")
    BINARY_SELECTION("BINARY-SELECTION"),
    @XmlEnumValue("MULTI-SELECTION")
    MULTI_SELECTION("MULTI-SELECTION");
    private final String value;

    SelectionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SelectionType fromValue(String v) {
        for (SelectionType c: SelectionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

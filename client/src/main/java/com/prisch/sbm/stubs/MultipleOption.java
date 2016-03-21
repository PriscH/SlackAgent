
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultipleOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MultipleOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTINUE-ON-FAILURE"/>
 *     &lt;enumeration value="STOP-ON-FAILURE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MultipleOption")
@XmlEnum
public enum MultipleOption {

    @XmlEnumValue("CONTINUE-ON-FAILURE")
    CONTINUE_ON_FAILURE("CONTINUE-ON-FAILURE"),
    @XmlEnumValue("STOP-ON-FAILURE")
    STOP_ON_FAILURE("STOP-ON-FAILURE");
    private final String value;

    MultipleOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MultipleOption fromValue(String v) {
        for (MultipleOption c: MultipleOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

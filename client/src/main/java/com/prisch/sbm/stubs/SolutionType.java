
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Solution-Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Solution-Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TEAMTRACK-SOLUTION"/>
 *     &lt;enumeration value="USER-SOLUTION"/>
 *     &lt;enumeration value="THIRDPARTY-SOLUTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Solution-Type")
@XmlEnum
public enum SolutionType {

    @XmlEnumValue("TEAMTRACK-SOLUTION")
    TEAMTRACK_SOLUTION("TEAMTRACK-SOLUTION"),
    @XmlEnumValue("USER-SOLUTION")
    USER_SOLUTION("USER-SOLUTION"),
    @XmlEnumValue("THIRDPARTY-SOLUTION")
    THIRDPARTY_SOLUTION("THIRDPARTY-SOLUTION");
    private final String value;

    SolutionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SolutionType fromValue(String v) {
        for (SolutionType c: SolutionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

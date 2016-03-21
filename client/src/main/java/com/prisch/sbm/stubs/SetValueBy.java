
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Set-Value-By.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Set-Value-By">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRECEDENCE-VALUE"/>
 *     &lt;enumeration value="INTERNAL-VALUE"/>
 *     &lt;enumeration value="UUID-VALUE"/>
 *     &lt;enumeration value="DISPLAY-VALUE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Set-Value-By")
@XmlEnum
public enum SetValueBy {

    @XmlEnumValue("PRECEDENCE-VALUE")
    PRECEDENCE_VALUE("PRECEDENCE-VALUE"),
    @XmlEnumValue("INTERNAL-VALUE")
    INTERNAL_VALUE("INTERNAL-VALUE"),
    @XmlEnumValue("UUID-VALUE")
    UUID_VALUE("UUID-VALUE"),
    @XmlEnumValue("DISPLAY-VALUE")
    DISPLAY_VALUE("DISPLAY-VALUE");
    private final String value;

    SetValueBy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SetValueBy fromValue(String v) {
        for (SetValueBy c: SetValueBy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

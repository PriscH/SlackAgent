
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Set-Value-Method.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Set-Value-Method">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="REPLACE-VALUES"/>
 *     &lt;enumeration value="APPEND-VALUES"/>
 *     &lt;enumeration value="REMOVE-VALUES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Set-Value-Method")
@XmlEnum
public enum SetValueMethod {

    @XmlEnumValue("REPLACE-VALUES")
    REPLACE_VALUES("REPLACE-VALUES"),
    @XmlEnumValue("APPEND-VALUES")
    APPEND_VALUES("APPEND-VALUES"),
    @XmlEnumValue("REMOVE-VALUES")
    REMOVE_VALUES("REMOVE-VALUES");
    private final String value;

    SetValueMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SetValueMethod fromValue(String v) {
        for (SetValueMethod c: SetValueMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

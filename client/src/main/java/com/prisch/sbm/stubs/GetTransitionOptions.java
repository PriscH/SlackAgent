
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTransitionOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GetTransitionOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TRANSITIONS-ALL"/>
 *     &lt;enumeration value="TRANSITIONS-QUICK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GetTransitionOptions")
@XmlEnum
public enum GetTransitionOptions {

    @XmlEnumValue("TRANSITIONS-ALL")
    TRANSITIONS_ALL("TRANSITIONS-ALL"),
    @XmlEnumValue("TRANSITIONS-QUICK")
    TRANSITIONS_QUICK("TRANSITIONS-QUICK");
    private final String value;

    GetTransitionOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GetTransitionOptions fromValue(String v) {
        for (GetTransitionOptions c: GetTransitionOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

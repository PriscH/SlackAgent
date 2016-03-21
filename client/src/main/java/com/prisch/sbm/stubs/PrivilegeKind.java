
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrivilegeKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrivilegeKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USER-KIND"/>
 *     &lt;enumeration value="ADMIN-KIND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrivilegeKind")
@XmlEnum
public enum PrivilegeKind {

    @XmlEnumValue("USER-KIND")
    USER_KIND("USER-KIND"),
    @XmlEnumValue("ADMIN-KIND")
    ADMIN_KIND("ADMIN-KIND");
    private final String value;

    PrivilegeKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrivilegeKind fromValue(String v) {
        for (PrivilegeKind c: PrivilegeKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

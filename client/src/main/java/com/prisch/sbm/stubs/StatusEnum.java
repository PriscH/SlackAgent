
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IS-WARNING"/>
 *     &lt;enumeration value="IS-INFORMATION"/>
 *     &lt;enumeration value="IS-ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusEnum")
@XmlEnum
public enum StatusEnum {

    @XmlEnumValue("IS-WARNING")
    IS_WARNING("IS-WARNING"),
    @XmlEnumValue("IS-INFORMATION")
    IS_INFORMATION("IS-INFORMATION"),
    @XmlEnumValue("IS-ERROR")
    IS_ERROR("IS-ERROR");
    private final String value;

    StatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusEnum fromValue(String v) {
        for (StatusEnum c: StatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

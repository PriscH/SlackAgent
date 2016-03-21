
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccessType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccessType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCESS-NONE"/>
 *     &lt;enumeration value="ACCESS-USER"/>
 *     &lt;enumeration value="ACCESS-OCCASIONAL"/>
 *     &lt;enumeration value="ACCESS-EXTERNAL"/>
 *     &lt;enumeration value="ACCESS-ADMIN"/>
 *     &lt;enumeration value="ACCESS-APISCRIPT"/>
 *     &lt;enumeration value="ACCESS-LEAVE-UNCHANGED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccessType")
@XmlEnum
public enum AccessType {

    @XmlEnumValue("ACCESS-NONE")
    ACCESS_NONE("ACCESS-NONE"),
    @XmlEnumValue("ACCESS-USER")
    ACCESS_USER("ACCESS-USER"),
    @XmlEnumValue("ACCESS-OCCASIONAL")
    ACCESS_OCCASIONAL("ACCESS-OCCASIONAL"),
    @XmlEnumValue("ACCESS-EXTERNAL")
    ACCESS_EXTERNAL("ACCESS-EXTERNAL"),
    @XmlEnumValue("ACCESS-ADMIN")
    ACCESS_ADMIN("ACCESS-ADMIN"),
    @XmlEnumValue("ACCESS-APISCRIPT")
    ACCESS_APISCRIPT("ACCESS-APISCRIPT"),
    @XmlEnumValue("ACCESS-LEAVE-UNCHANGED")
    ACCESS_LEAVE_UNCHANGED("ACCESS-LEAVE-UNCHANGED");
    private final String value;

    AccessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessType fromValue(String v) {
        for (AccessType c: AccessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

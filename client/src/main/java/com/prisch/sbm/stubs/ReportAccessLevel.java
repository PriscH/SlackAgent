
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportAccessLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportAccessLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRIVATE"/>
 *     &lt;enumeration value="GUEST"/>
 *     &lt;enumeration value="USER"/>
 *     &lt;enumeration value="MANAGER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportAccessLevel")
@XmlEnum
public enum ReportAccessLevel {

    PRIVATE,
    GUEST,
    USER,
    MANAGER;

    public String value() {
        return name();
    }

    public static ReportAccessLevel fromValue(String v) {
        return valueOf(v);
    }

}

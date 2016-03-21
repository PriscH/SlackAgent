
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LISTING"/>
 *     &lt;enumeration value="ALLTYPES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportType")
@XmlEnum
public enum ReportType {

    LISTING,
    ALLTYPES;

    public String value() {
        return name();
    }

    public static ReportType fromValue(String v) {
        return valueOf(v);
    }

}

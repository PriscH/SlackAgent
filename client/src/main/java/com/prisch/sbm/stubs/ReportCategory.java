
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="APPLICATION"/>
 *     &lt;enumeration value="BUILTIN"/>
 *     &lt;enumeration value="MY"/>
 *     &lt;enumeration value="QUICKLINKS"/>
 *     &lt;enumeration value="USERREPORTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportCategory")
@XmlEnum
public enum ReportCategory {

    ALL,
    APPLICATION,
    BUILTIN,
    MY,
    QUICKLINKS,
    USERREPORTS;

    public String value() {
        return name();
    }

    public static ReportCategory fromValue(String v) {
        return valueOf(v);
    }

}

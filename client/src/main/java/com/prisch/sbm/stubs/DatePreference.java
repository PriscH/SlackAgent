
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatePreference.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DatePreference">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DATE-FORMAT-FROM-LOCALE"/>
 *     &lt;enumeration value="DATE-FORMAT-MM-DD-YYYY"/>
 *     &lt;enumeration value="DATE-FORMAT-DD-MM-YYYY"/>
 *     &lt;enumeration value="DATE-FORMAT-DD-MM-YYYY.S"/>
 *     &lt;enumeration value="DATE-FORMAT-YYYY-MM-DD"/>
 *     &lt;enumeration value="DATE-FORMAT-LEAVE-UNCHANGED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DatePreference")
@XmlEnum
public enum DatePreference {

    @XmlEnumValue("DATE-FORMAT-FROM-LOCALE")
    DATE_FORMAT_FROM_LOCALE("DATE-FORMAT-FROM-LOCALE"),
    @XmlEnumValue("DATE-FORMAT-MM-DD-YYYY")
    DATE_FORMAT_MM_DD_YYYY("DATE-FORMAT-MM-DD-YYYY"),
    @XmlEnumValue("DATE-FORMAT-DD-MM-YYYY")
    DATE_FORMAT_DD_MM_YYYY("DATE-FORMAT-DD-MM-YYYY"),
    @XmlEnumValue("DATE-FORMAT-DD-MM-YYYY.S")
    DATE_FORMAT_DD_MM_YYYY_S("DATE-FORMAT-DD-MM-YYYY.S"),
    @XmlEnumValue("DATE-FORMAT-YYYY-MM-DD")
    DATE_FORMAT_YYYY_MM_DD("DATE-FORMAT-YYYY-MM-DD"),
    @XmlEnumValue("DATE-FORMAT-LEAVE-UNCHANGED")
    DATE_FORMAT_LEAVE_UNCHANGED("DATE-FORMAT-LEAVE-UNCHANGED");
    private final String value;

    DatePreference(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DatePreference fromValue(String v) {
        for (DatePreference c: DatePreference.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

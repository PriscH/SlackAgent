
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimePreference.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimePreference">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TIME-FORMAT-12HOUR"/>
 *     &lt;enumeration value="TIME-FORMAT-24HOUR"/>
 *     &lt;enumeration value="TIME-FORMAT-USE-GMT-OFFSET"/>
 *     &lt;enumeration value="TIME-FORMAT-HONOR-DAYLIGHT"/>
 *     &lt;enumeration value="TIME-FORMAT-LEAVE-UNCHANGED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimePreference")
@XmlEnum
public enum TimePreference {

    @XmlEnumValue("TIME-FORMAT-12HOUR")
    TIME_FORMAT_12_HOUR("TIME-FORMAT-12HOUR"),
    @XmlEnumValue("TIME-FORMAT-24HOUR")
    TIME_FORMAT_24_HOUR("TIME-FORMAT-24HOUR"),
    @XmlEnumValue("TIME-FORMAT-USE-GMT-OFFSET")
    TIME_FORMAT_USE_GMT_OFFSET("TIME-FORMAT-USE-GMT-OFFSET"),
    @XmlEnumValue("TIME-FORMAT-HONOR-DAYLIGHT")
    TIME_FORMAT_HONOR_DAYLIGHT("TIME-FORMAT-HONOR-DAYLIGHT"),
    @XmlEnumValue("TIME-FORMAT-LEAVE-UNCHANGED")
    TIME_FORMAT_LEAVE_UNCHANGED("TIME-FORMAT-LEAVE-UNCHANGED");
    private final String value;

    TimePreference(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimePreference fromValue(String v) {
        for (TimePreference c: TimePreference.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

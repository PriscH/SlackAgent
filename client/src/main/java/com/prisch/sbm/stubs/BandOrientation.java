
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Band-Orientation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Band-Orientation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BAND-HORIZONTAL"/>
 *     &lt;enumeration value="BAND-VERTICAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Band-Orientation")
@XmlEnum
public enum BandOrientation {

    @XmlEnumValue("BAND-HORIZONTAL")
    BAND_HORIZONTAL("BAND-HORIZONTAL"),
    @XmlEnumValue("BAND-VERTICAL")
    BAND_VERTICAL("BAND-VERTICAL");
    private final String value;

    BandOrientation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BandOrientation fromValue(String v) {
        for (BandOrientation c: BandOrientation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

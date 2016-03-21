
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transition-Style.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Transition-Style">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STYLE-STRAIGHT"/>
 *     &lt;enumeration value="STYLE-ARC"/>
 *     &lt;enumeration value="STYLE-POLYLINE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Transition-Style")
@XmlEnum
public enum TransitionStyle {

    @XmlEnumValue("STYLE-STRAIGHT")
    STYLE_STRAIGHT("STYLE-STRAIGHT"),
    @XmlEnumValue("STYLE-ARC")
    STYLE_ARC("STYLE-ARC"),
    @XmlEnumValue("STYLE-POLYLINE")
    STYLE_POLYLINE("STYLE-POLYLINE");
    private final String value;

    TransitionStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransitionStyle fromValue(String v) {
        for (TransitionStyle c: TransitionStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

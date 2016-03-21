
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SectionsOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SectionsOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SECTIONS-ALL"/>
 *     &lt;enumeration value="SECTIONS-NONE"/>
 *     &lt;enumeration value="SECTIONS-SPECIFIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SectionsOption")
@XmlEnum
public enum SectionsOption {

    @XmlEnumValue("SECTIONS-ALL")
    SECTIONS_ALL("SECTIONS-ALL"),
    @XmlEnumValue("SECTIONS-NONE")
    SECTIONS_NONE("SECTIONS-NONE"),
    @XmlEnumValue("SECTIONS-SPECIFIED")
    SECTIONS_SPECIFIED("SECTIONS-SPECIFIED");
    private final String value;

    SectionsOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SectionsOption fromValue(String v) {
        for (SectionsOption c: SectionsOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

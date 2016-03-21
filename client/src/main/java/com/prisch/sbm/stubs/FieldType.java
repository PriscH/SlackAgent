
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Field-Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Field-Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FLDTYPE-UNKNOWN"/>
 *     &lt;enumeration value="FLDTYPE-NUMERIC"/>
 *     &lt;enumeration value="FLDTYPE-TEXT"/>
 *     &lt;enumeration value="FLDTYPE-DATETIME"/>
 *     &lt;enumeration value="FLDTYPE-SELECTION"/>
 *     &lt;enumeration value="FLDTYPE-BINARY"/>
 *     &lt;enumeration value="FLDTYPE-STATE"/>
 *     &lt;enumeration value="FLDTYPE-USER"/>
 *     &lt;enumeration value="FLDTYPE-PROJECT"/>
 *     &lt;enumeration value="FLDTYPE-SUMMATION"/>
 *     &lt;enumeration value="FLDTYPE-MULTIPLE-SELECTION"/>
 *     &lt;enumeration value="FLDTYPE-CONTACT"/>
 *     &lt;enumeration value="FLDTYPE-INCIDENT"/>
 *     &lt;enumeration value="FLDTYPE-FOLDER"/>
 *     &lt;enumeration value="FLDTYPE-RELATIONAL"/>
 *     &lt;enumeration value="FLDTYPE-SUBRELATIONAL"/>
 *     &lt;enumeration value="FLDTYPE-SYSTEM"/>
 *     &lt;enumeration value="FLDTYPE-MULTIPLE-RELATIONAL"/>
 *     &lt;enumeration value="FLDTYPE-MULTIPLE-GROUP"/>
 *     &lt;enumeration value="FLDTYPE-MULTIPLE-USERGROUP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Field-Type")
@XmlEnum
public enum FieldType {

    @XmlEnumValue("FLDTYPE-UNKNOWN")
    FLDTYPE_UNKNOWN("FLDTYPE-UNKNOWN"),
    @XmlEnumValue("FLDTYPE-NUMERIC")
    FLDTYPE_NUMERIC("FLDTYPE-NUMERIC"),
    @XmlEnumValue("FLDTYPE-TEXT")
    FLDTYPE_TEXT("FLDTYPE-TEXT"),
    @XmlEnumValue("FLDTYPE-DATETIME")
    FLDTYPE_DATETIME("FLDTYPE-DATETIME"),
    @XmlEnumValue("FLDTYPE-SELECTION")
    FLDTYPE_SELECTION("FLDTYPE-SELECTION"),
    @XmlEnumValue("FLDTYPE-BINARY")
    FLDTYPE_BINARY("FLDTYPE-BINARY"),
    @XmlEnumValue("FLDTYPE-STATE")
    FLDTYPE_STATE("FLDTYPE-STATE"),
    @XmlEnumValue("FLDTYPE-USER")
    FLDTYPE_USER("FLDTYPE-USER"),
    @XmlEnumValue("FLDTYPE-PROJECT")
    FLDTYPE_PROJECT("FLDTYPE-PROJECT"),
    @XmlEnumValue("FLDTYPE-SUMMATION")
    FLDTYPE_SUMMATION("FLDTYPE-SUMMATION"),
    @XmlEnumValue("FLDTYPE-MULTIPLE-SELECTION")
    FLDTYPE_MULTIPLE_SELECTION("FLDTYPE-MULTIPLE-SELECTION"),
    @XmlEnumValue("FLDTYPE-CONTACT")
    FLDTYPE_CONTACT("FLDTYPE-CONTACT"),
    @XmlEnumValue("FLDTYPE-INCIDENT")
    FLDTYPE_INCIDENT("FLDTYPE-INCIDENT"),
    @XmlEnumValue("FLDTYPE-FOLDER")
    FLDTYPE_FOLDER("FLDTYPE-FOLDER"),
    @XmlEnumValue("FLDTYPE-RELATIONAL")
    FLDTYPE_RELATIONAL("FLDTYPE-RELATIONAL"),
    @XmlEnumValue("FLDTYPE-SUBRELATIONAL")
    FLDTYPE_SUBRELATIONAL("FLDTYPE-SUBRELATIONAL"),
    @XmlEnumValue("FLDTYPE-SYSTEM")
    FLDTYPE_SYSTEM("FLDTYPE-SYSTEM"),
    @XmlEnumValue("FLDTYPE-MULTIPLE-RELATIONAL")
    FLDTYPE_MULTIPLE_RELATIONAL("FLDTYPE-MULTIPLE-RELATIONAL"),
    @XmlEnumValue("FLDTYPE-MULTIPLE-GROUP")
    FLDTYPE_MULTIPLE_GROUP("FLDTYPE-MULTIPLE-GROUP"),
    @XmlEnumValue("FLDTYPE-MULTIPLE-USERGROUP")
    FLDTYPE_MULTIPLE_USERGROUP("FLDTYPE-MULTIPLE-USERGROUP");
    private final String value;

    FieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FieldType fromValue(String v) {
        for (FieldType c: FieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

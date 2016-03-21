
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Table-Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Table-Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT-SPECIFIED"/>
 *     &lt;enumeration value="SYSTEM-TABLE"/>
 *     &lt;enumeration value="PRIMARY-TABLE"/>
 *     &lt;enumeration value="AUXILIARY-TABLE"/>
 *     &lt;enumeration value="SYSTEM-AUXILIARY-TABLE"/>
 *     &lt;enumeration value="ARCHIVE-TABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Table-Type")
@XmlEnum
public enum TableType {

    @XmlEnumValue("NOT-SPECIFIED")
    NOT_SPECIFIED("NOT-SPECIFIED"),
    @XmlEnumValue("SYSTEM-TABLE")
    SYSTEM_TABLE("SYSTEM-TABLE"),
    @XmlEnumValue("PRIMARY-TABLE")
    PRIMARY_TABLE("PRIMARY-TABLE"),
    @XmlEnumValue("AUXILIARY-TABLE")
    AUXILIARY_TABLE("AUXILIARY-TABLE"),
    @XmlEnumValue("SYSTEM-AUXILIARY-TABLE")
    SYSTEM_AUXILIARY_TABLE("SYSTEM-AUXILIARY-TABLE"),
    @XmlEnumValue("ARCHIVE-TABLE")
    ARCHIVE_TABLE("ARCHIVE-TABLE");
    private final String value;

    TableType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TableType fromValue(String v) {
        for (TableType c: TableType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

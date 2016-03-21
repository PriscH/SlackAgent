
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemLink-Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemLink-Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFAULT-ITEM-LINK"/>
 *     &lt;enumeration value="TWOWAY-NO-TRIGGERS"/>
 *     &lt;enumeration value="ONEWAY-NO-TRIGGERS"/>
 *     &lt;enumeration value="ONEWAY-CURRENT-TRIGGERS-LINKED"/>
 *     &lt;enumeration value="TWOWAY-CURRENT-TRIGGERS-LINKED"/>
 *     &lt;enumeration value="TWOWAY-LINKED-TRIGGERS-CURRENT"/>
 *     &lt;enumeration value="TWOWAY-BOTH-TRIGGERS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemLink-Type")
@XmlEnum
public enum ItemLinkType {

    @XmlEnumValue("DEFAULT-ITEM-LINK")
    DEFAULT_ITEM_LINK("DEFAULT-ITEM-LINK"),
    @XmlEnumValue("TWOWAY-NO-TRIGGERS")
    TWOWAY_NO_TRIGGERS("TWOWAY-NO-TRIGGERS"),
    @XmlEnumValue("ONEWAY-NO-TRIGGERS")
    ONEWAY_NO_TRIGGERS("ONEWAY-NO-TRIGGERS"),
    @XmlEnumValue("ONEWAY-CURRENT-TRIGGERS-LINKED")
    ONEWAY_CURRENT_TRIGGERS_LINKED("ONEWAY-CURRENT-TRIGGERS-LINKED"),
    @XmlEnumValue("TWOWAY-CURRENT-TRIGGERS-LINKED")
    TWOWAY_CURRENT_TRIGGERS_LINKED("TWOWAY-CURRENT-TRIGGERS-LINKED"),
    @XmlEnumValue("TWOWAY-LINKED-TRIGGERS-CURRENT")
    TWOWAY_LINKED_TRIGGERS_CURRENT("TWOWAY-LINKED-TRIGGERS-CURRENT"),
    @XmlEnumValue("TWOWAY-BOTH-TRIGGERS")
    TWOWAY_BOTH_TRIGGERS("TWOWAY-BOTH-TRIGGERS");
    private final String value;

    ItemLinkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemLinkType fromValue(String v) {
        for (ItemLinkType c: ItemLinkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

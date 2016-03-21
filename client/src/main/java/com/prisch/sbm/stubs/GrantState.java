
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrantState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GrantState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INHERITED"/>
 *     &lt;enumeration value="REVOKED"/>
 *     &lt;enumeration value="GRANTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GrantState")
@XmlEnum
public enum GrantState {

    INHERITED,
    REVOKED,
    GRANTED;

    public String value() {
        return name();
    }

    public static GrantState fromValue(String v) {
        return valueOf(v);
    }

}

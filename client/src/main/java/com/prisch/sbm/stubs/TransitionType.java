
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transition-Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Transition-Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TRANSITION-REGULAR"/>
 *     &lt;enumeration value="TRANSITION-COPY"/>
 *     &lt;enumeration value="TRANSITION-POST"/>
 *     &lt;enumeration value="TRANSITION-SUBMITPROBLEM"/>
 *     &lt;enumeration value="TRANSITION-MOBILE"/>
 *     &lt;enumeration value="TRANSITION-SUBTASK"/>
 *     &lt;enumeration value="TRANSITION-UPDATE"/>
 *     &lt;enumeration value="TRANSITION-DELETE"/>
 *     &lt;enumeration value="TRANSITION-EXTERNALPOST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Transition-Type")
@XmlEnum
public enum TransitionType {

    @XmlEnumValue("TRANSITION-REGULAR")
    TRANSITION_REGULAR("TRANSITION-REGULAR"),
    @XmlEnumValue("TRANSITION-COPY")
    TRANSITION_COPY("TRANSITION-COPY"),
    @XmlEnumValue("TRANSITION-POST")
    TRANSITION_POST("TRANSITION-POST"),
    @XmlEnumValue("TRANSITION-SUBMITPROBLEM")
    TRANSITION_SUBMITPROBLEM("TRANSITION-SUBMITPROBLEM"),
    @XmlEnumValue("TRANSITION-MOBILE")
    TRANSITION_MOBILE("TRANSITION-MOBILE"),
    @XmlEnumValue("TRANSITION-SUBTASK")
    TRANSITION_SUBTASK("TRANSITION-SUBTASK"),
    @XmlEnumValue("TRANSITION-UPDATE")
    TRANSITION_UPDATE("TRANSITION-UPDATE"),
    @XmlEnumValue("TRANSITION-DELETE")
    TRANSITION_DELETE("TRANSITION-DELETE"),
    @XmlEnumValue("TRANSITION-EXTERNALPOST")
    TRANSITION_EXTERNALPOST("TRANSITION-EXTERNALPOST");
    private final String value;

    TransitionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransitionType fromValue(String v) {
        for (TransitionType c: TransitionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

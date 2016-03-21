
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Attachment-Access-Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Attachment-Access-Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ATTACHACCESS-DEFAULT"/>
 *     &lt;enumeration value="ATTACHACCESS-RESTRICTED"/>
 *     &lt;enumeration value="ATTACHACCESS-UNRESTRICTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Attachment-Access-Type")
@XmlEnum
public enum AttachmentAccessType {

    @XmlEnumValue("ATTACHACCESS-DEFAULT")
    ATTACHACCESS_DEFAULT("ATTACHACCESS-DEFAULT"),
    @XmlEnumValue("ATTACHACCESS-RESTRICTED")
    ATTACHACCESS_RESTRICTED("ATTACHACCESS-RESTRICTED"),
    @XmlEnumValue("ATTACHACCESS-UNRESTRICTED")
    ATTACHACCESS_UNRESTRICTED("ATTACHACCESS-UNRESTRICTED");
    private final String value;

    AttachmentAccessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttachmentAccessType fromValue(String v) {
        for (AttachmentAccessType c: AttachmentAccessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

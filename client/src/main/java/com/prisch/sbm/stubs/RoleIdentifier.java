
package com.prisch.sbm.stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoleIdentifier">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sbmappservices72}Identifier">
 *       &lt;sequence>
 *         &lt;element name="projectId" type="{urn:sbmappservices72}ProjectIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleIdentifier", propOrder = {
    "projectId"
})
public class RoleIdentifier
    extends Identifier
{

    @XmlElement(required = true, nillable = true)
    protected ProjectIdentifier projectId;

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectIdentifier }
     *     
     */
    public ProjectIdentifier getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectIdentifier }
     *     
     */
    public void setProjectId(ProjectIdentifier value) {
        this.projectId = value;
    }

}

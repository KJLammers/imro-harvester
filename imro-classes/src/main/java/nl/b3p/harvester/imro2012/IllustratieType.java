//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.07 at 09:45:45 AM CET 
//


package nl.b3p.harvester.imro2012;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IllustratieType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IllustratieType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="afbeelding"/>
 *     &lt;enumeration value="kaart"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IllustratieType")
@XmlEnum
public enum IllustratieType {

    @XmlEnumValue("afbeelding")
    AFBEELDING("afbeelding"),
    @XmlEnumValue("kaart")
    KAART("kaart");
    private final String value;

    IllustratieType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IllustratieType fromValue(String v) {
        for (IllustratieType c: IllustratieType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
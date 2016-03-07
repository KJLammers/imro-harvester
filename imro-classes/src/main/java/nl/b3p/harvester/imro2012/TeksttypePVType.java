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
 * <p>Java class for Teksttype_PVType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Teksttype_PVType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="regel zonder voorbereidingsbescherming"/>
 *     &lt;enumeration value="regel met voorbereidingsbescherming"/>
 *     &lt;enumeration value="toelichting"/>
 *     &lt;enumeration value="bijlage bij regel zonder voorbereidingsbescherming"/>
 *     &lt;enumeration value="bijlage bij regel met voorbereidingsbescherming"/>
 *     &lt;enumeration value="bijlage bij toelichting"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Teksttype_PVType")
@XmlEnum
public enum TeksttypePVType {

    @XmlEnumValue("regel zonder voorbereidingsbescherming")
    REGEL_ZONDER_VOORBEREIDINGSBESCHERMING("regel zonder voorbereidingsbescherming"),
    @XmlEnumValue("regel met voorbereidingsbescherming")
    REGEL_MET_VOORBEREIDINGSBESCHERMING("regel met voorbereidingsbescherming"),
    @XmlEnumValue("toelichting")
    TOELICHTING("toelichting"),
    @XmlEnumValue("bijlage bij regel zonder voorbereidingsbescherming")
    BIJLAGE_BIJ_REGEL_ZONDER_VOORBEREIDINGSBESCHERMING("bijlage bij regel zonder voorbereidingsbescherming"),
    @XmlEnumValue("bijlage bij regel met voorbereidingsbescherming")
    BIJLAGE_BIJ_REGEL_MET_VOORBEREIDINGSBESCHERMING("bijlage bij regel met voorbereidingsbescherming"),
    @XmlEnumValue("bijlage bij toelichting")
    BIJLAGE_BIJ_TOELICHTING("bijlage bij toelichting");
    private final String value;

    TeksttypePVType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TeksttypePVType fromValue(String v) {
        for (TeksttypePVType c: TeksttypePVType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

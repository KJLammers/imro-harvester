//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.31 at 04:49:50 PM CEST 
//


package nl.b3p.imro._2006._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NiveauType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NiveauType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="blok/cluster"/>
 *     &lt;enumeration value="buurt"/>
 *     &lt;enumeration value="internationaal"/>
 *     &lt;enumeration value="kavel"/>
 *     &lt;enumeration value="lokaal"/>
 *     &lt;enumeration value="nationaal"/>
 *     &lt;enumeration value="provinciaal"/>
 *     &lt;enumeration value="regionaal"/>
 *     &lt;enumeration value="stadsgewestelijk"/>
 *     &lt;enumeration value="wijk"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NiveauType")
@XmlEnum
public enum NiveauType {

    @XmlEnumValue("blok/cluster")
    BLOK_CLUSTER("blok/cluster"),
    @XmlEnumValue("buurt")
    BUURT("buurt"),
    @XmlEnumValue("internationaal")
    INTERNATIONAAL("internationaal"),
    @XmlEnumValue("kavel")
    KAVEL("kavel"),
    @XmlEnumValue("lokaal")
    LOKAAL("lokaal"),
    @XmlEnumValue("nationaal")
    NATIONAAL("nationaal"),
    @XmlEnumValue("provinciaal")
    PROVINCIAAL("provinciaal"),
    @XmlEnumValue("regionaal")
    REGIONAAL("regionaal"),
    @XmlEnumValue("stadsgewestelijk")
    STADSGEWESTELIJK("stadsgewestelijk"),
    @XmlEnumValue("wijk")
    WIJK("wijk");
    private final String value;

    NiveauType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NiveauType fromValue(String v) {
        for (NiveauType c: NiveauType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.30 at 11:41:45 AM CEST 
//


package nl.b3p.imro._2008._11;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Bestemmingshoofdgroep_EType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Bestemmingshoofdgroep_EType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="agrarisch"/>
 *     &lt;enumeration value="agrarisch met waarden"/>
 *     &lt;enumeration value="bedrijf"/>
 *     &lt;enumeration value="bedrijventerrein"/>
 *     &lt;enumeration value="bos"/>
 *     &lt;enumeration value="centrum"/>
 *     &lt;enumeration value="cultuur en ontspanning"/>
 *     &lt;enumeration value="detailhandel"/>
 *     &lt;enumeration value="dienstverlening"/>
 *     &lt;enumeration value="gemengd"/>
 *     &lt;enumeration value="groen"/>
 *     &lt;enumeration value="horeca"/>
 *     &lt;enumeration value="kantoor"/>
 *     &lt;enumeration value="maatschappelijk"/>
 *     &lt;enumeration value="natuur"/>
 *     &lt;enumeration value="overig"/>
 *     &lt;enumeration value="recreatie"/>
 *     &lt;enumeration value="sport"/>
 *     &lt;enumeration value="tuin"/>
 *     &lt;enumeration value="verkeer"/>
 *     &lt;enumeration value="water"/>
 *     &lt;enumeration value="wonen"/>
 *     &lt;enumeration value="woongebied"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Bestemmingshoofdgroep_EType")
@XmlEnum
public enum BestemmingshoofdgroepEType {

    @XmlEnumValue("agrarisch")
    AGRARISCH("agrarisch"),
    @XmlEnumValue("agrarisch met waarden")
    AGRARISCH_MET_WAARDEN("agrarisch met waarden"),
    @XmlEnumValue("bedrijf")
    BEDRIJF("bedrijf"),
    @XmlEnumValue("bedrijventerrein")
    BEDRIJVENTERREIN("bedrijventerrein"),
    @XmlEnumValue("bos")
    BOS("bos"),
    @XmlEnumValue("centrum")
    CENTRUM("centrum"),
    @XmlEnumValue("cultuur en ontspanning")
    CULTUUR_EN_ONTSPANNING("cultuur en ontspanning"),
    @XmlEnumValue("detailhandel")
    DETAILHANDEL("detailhandel"),
    @XmlEnumValue("dienstverlening")
    DIENSTVERLENING("dienstverlening"),
    @XmlEnumValue("gemengd")
    GEMENGD("gemengd"),
    @XmlEnumValue("groen")
    GROEN("groen"),
    @XmlEnumValue("horeca")
    HORECA("horeca"),
    @XmlEnumValue("kantoor")
    KANTOOR("kantoor"),
    @XmlEnumValue("maatschappelijk")
    MAATSCHAPPELIJK("maatschappelijk"),
    @XmlEnumValue("natuur")
    NATUUR("natuur"),
    @XmlEnumValue("overig")
    OVERIG("overig"),
    @XmlEnumValue("recreatie")
    RECREATIE("recreatie"),
    @XmlEnumValue("sport")
    SPORT("sport"),
    @XmlEnumValue("tuin")
    TUIN("tuin"),
    @XmlEnumValue("verkeer")
    VERKEER("verkeer"),
    @XmlEnumValue("water")
    WATER("water"),
    @XmlEnumValue("wonen")
    WONEN("wonen"),
    @XmlEnumValue("woongebied")
    WOONGEBIED("woongebied");
    private final String value;

    BestemmingshoofdgroepEType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BestemmingshoofdgroepEType fromValue(String v) {
        for (BestemmingshoofdgroepEType c: BestemmingshoofdgroepEType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
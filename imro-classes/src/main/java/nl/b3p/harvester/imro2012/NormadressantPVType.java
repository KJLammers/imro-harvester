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
 * <p>Java class for Normadressant_PVType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Normadressant_PVType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bevoegd gezag"/>
 *     &lt;enumeration value="burgemeester en wethouders"/>
 *     &lt;enumeration value="gedeputeerde staten"/>
 *     &lt;enumeration value="gemeentelijke bestuursorganen"/>
 *     &lt;enumeration value="gemeenteraad"/>
 *     &lt;enumeration value="regionale bestuursorganen"/>
 *     &lt;enumeration value="niet nader aangeduid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Normadressant_PVType")
@XmlEnum
public enum NormadressantPVType {

    @XmlEnumValue("bevoegd gezag")
    BEVOEGD_GEZAG("bevoegd gezag"),
    @XmlEnumValue("burgemeester en wethouders")
    BURGEMEESTER_EN_WETHOUDERS("burgemeester en wethouders"),
    @XmlEnumValue("gedeputeerde staten")
    GEDEPUTEERDE_STATEN("gedeputeerde staten"),
    @XmlEnumValue("gemeentelijke bestuursorganen")
    GEMEENTELIJKE_BESTUURSORGANEN("gemeentelijke bestuursorganen"),
    @XmlEnumValue("gemeenteraad")
    GEMEENTERAAD("gemeenteraad"),
    @XmlEnumValue("regionale bestuursorganen")
    REGIONALE_BESTUURSORGANEN("regionale bestuursorganen"),
    @XmlEnumValue("niet nader aangeduid")
    NIET_NADER_AANGEDUID("niet nader aangeduid");
    private final String value;

    NormadressantPVType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NormadressantPVType fromValue(String v) {
        for (NormadressantPVType c: NormadressantPVType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.01 at 01:44:26 PM CEST 
//


package nl.b3p.imro._2012._11;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Normadressant_AMBType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Normadressant_AMBType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bevoegd gezag"/>
 *     &lt;enumeration value="burgemeester en wethouders"/>
 *     &lt;enumeration value="burgers"/>
 *     &lt;enumeration value="gedeputeerde staten"/>
 *     &lt;enumeration value="gemeentelijke bestuursorganen"/>
 *     &lt;enumeration value="gemeenteraad"/>
 *     &lt;enumeration value="provinciale bestuursorganen"/>
 *     &lt;enumeration value="provinciale staten"/>
 *     &lt;enumeration value="regionale bestuursorganen"/>
 *     &lt;enumeration value="onze Minister"/>
 *     &lt;enumeration value="onze Minister die het mede aangaat"/>
 *     &lt;enumeration value="rijksbestuursorganen"/>
 *     &lt;enumeration value="waterschappen"/>
 *     &lt;enumeration value="niet nader aangeduid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Normadressant_AMBType")
@XmlEnum
public enum NormadressantAMBType {

    @XmlEnumValue("bevoegd gezag")
    BEVOEGD_GEZAG("bevoegd gezag"),
    @XmlEnumValue("burgemeester en wethouders")
    BURGEMEESTER_EN_WETHOUDERS("burgemeester en wethouders"),
    @XmlEnumValue("burgers")
    BURGERS("burgers"),
    @XmlEnumValue("gedeputeerde staten")
    GEDEPUTEERDE_STATEN("gedeputeerde staten"),
    @XmlEnumValue("gemeentelijke bestuursorganen")
    GEMEENTELIJKE_BESTUURSORGANEN("gemeentelijke bestuursorganen"),
    @XmlEnumValue("gemeenteraad")
    GEMEENTERAAD("gemeenteraad"),
    @XmlEnumValue("provinciale bestuursorganen")
    PROVINCIALE_BESTUURSORGANEN("provinciale bestuursorganen"),
    @XmlEnumValue("provinciale staten")
    PROVINCIALE_STATEN("provinciale staten"),
    @XmlEnumValue("regionale bestuursorganen")
    REGIONALE_BESTUURSORGANEN("regionale bestuursorganen"),
    @XmlEnumValue("onze Minister")
    ONZE_MINISTER("onze Minister"),
    @XmlEnumValue("onze Minister die het mede aangaat")
    ONZE_MINISTER_DIE_HET_MEDE_AANGAAT("onze Minister die het mede aangaat"),
    @XmlEnumValue("rijksbestuursorganen")
    RIJKSBESTUURSORGANEN("rijksbestuursorganen"),
    @XmlEnumValue("waterschappen")
    WATERSCHAPPEN("waterschappen"),
    @XmlEnumValue("niet nader aangeduid")
    NIET_NADER_AANGEDUID("niet nader aangeduid");
    private final String value;

    NormadressantAMBType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NormadressantAMBType fromValue(String v) {
        for (NormadressantAMBType c: NormadressantAMBType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

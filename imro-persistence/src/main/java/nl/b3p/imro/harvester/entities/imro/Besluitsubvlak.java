/*
 * Copyright (C) 2016 B3Partners B.V.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package nl.b3p.imro.harvester.entities.imro;

import com.vividsolutions.jts.geom.MultiPolygon;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Meine Toonen meinetoonen@b3partners.nl
 */
@Entity
public class Besluitsubvlak {

    @Id
    private String identificatie;

    private String naam;

    @org.hibernate.annotations.Type(type = "org.hibernatespatial.GeometryUserType")
    private MultiPolygon geometrie;

    private String artikelnummer;

    private String verwijzing;

    private String typePlanObject;

    @ManyToOne
    private Besluitgebied besluitgebied;

    @OneToMany
    private List<Besluitvlak> besluitvlakken;

    @OneToMany
    private List<Besluitsubvlak> besluitsubvlakken;

    public String getIdentificatie() {
        return identificatie;
    }

    public void setIdentificatie(String identificatie) {
        this.identificatie = identificatie;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public MultiPolygon getGeometrie() {
        return geometrie;
    }

    public void setGeometrie(MultiPolygon geometrie) {
        this.geometrie = geometrie;
    }

    public String getArtikelnummer() {
        return artikelnummer;
    }

    public void setArtikelnummer(String artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    public String getVerwijzing() {
        return verwijzing;
    }

    public void setVerwijzing(String verwijzing) {
        this.verwijzing = verwijzing;
    }

    public String getTypePlanObject() {
        return typePlanObject;
    }

    public void setTypePlanObject(String typePlanObject) {
        this.typePlanObject = typePlanObject;
    }

    public Besluitgebied getBesluitgebied() {
        return besluitgebied;
    }

    public void setBesluitgebied(Besluitgebied besluitgebied) {
        this.besluitgebied = besluitgebied;
    }

    public List<Besluitvlak> getBesluitvlakken() {
        return besluitvlakken;
    }

    public void setBesluitvlakken(List<Besluitvlak> besluitvlakken) {
        this.besluitvlakken = besluitvlakken;
    }

    public List<Besluitsubvlak> getBesluitsubvlakken() {
        return besluitsubvlakken;
    }

    public void setBesluitsubvlakken(List<Besluitsubvlak> besluitsubvlakken) {
        this.besluitsubvlakken = besluitsubvlakken;
    }

    
    
}
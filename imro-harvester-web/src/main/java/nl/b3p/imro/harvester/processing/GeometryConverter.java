/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.b3p.imro.harvester.processing;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.MultiPolygon;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.PrecisionModel;
import com.vividsolutions.jts.simplify.DouglasPeuckerSimplifier;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.StringReader;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.geotools.gml3.ArcParameters;
import org.geotools.gml3.CircleRadiusTolerance;
import org.geotools.xml.Parser;
import org.jdom2.input.DOMBuilder;
import org.jdom2.output.XMLOutputter;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 *
 * @author Meine Toonen <meinetoonen@b3partners.nl>
 */
public class GeometryConverter {

    protected final static Log log = LogFactory.getLog(GeometryConverter.class);

    private final static double DISTANCE_TOLERANCE = 0.001;
    //private int simplifierCounter = 0;
    //private final static int SIMPLIFIED_COUNTER_MAX = 1;

    private Parser parser;
    private GeometryFactory geometryFactory;

    protected final static int SRID = 28992;
    protected final static double LINEARIZATION_TOLERANCE_MULTIPLIER = 0.01;//0.001;

    public GeometryConverter() {
        GeometryFactory gf = new GeometryFactory(new PrecisionModel(), SRID);
        ArcParameters arcParameters = new ArcParameters(new CircleRadiusTolerance(LINEARIZATION_TOLERANCE_MULTIPLIER));//new AbsoluteTolerance(LINEARIZATION_TOLERANCE));

        org.geotools.gml3.GMLConfiguration gml3Config = new org.geotools.gml3.GMLConfiguration();
        gml3Config.getContext().registerComponentInstance(gf);
        gml3Config.getContext().registerComponentInstance(arcParameters);

        parser = new Parser(gml3Config);
        this.geometryFactory = gf;
    }

    public MultiPolygon convertMultiPolygonGeometry(Element geometry)
            throws IOException, ParserConfigurationException, SAXException, TransformerException {
        if (geometry != null) {
            Geometry resultGeometry = convertGeometry(geometry);

            if (resultGeometry instanceof MultiPolygon) {
                return (MultiPolygon) resultGeometry;
            } else if (resultGeometry instanceof Polygon) {
                return geometryFactory.createMultiPolygon(new Polygon[]{(Polygon) resultGeometry});
            }

            //   throw new ROConversionException("geometry not a Polygon or MultiPolygon: " + resultGeometry.getClass());
        }
        return null;
    }
    /*
     public MultiLineString convertMultiLineStringGeometry(Node geometry)
     throws  IOException, SAXException, ParserConfigurationException {
     if (geometry != null) {
     Geometry resultGeometry = convertGeometryImpl(geometry);

     if (resultGeometry instanceof MultiLineString)
     return (MultiLineString) resultGeometry;
     else if (resultGeometry instanceof LineString)
     return geometryFactory.createMultiLineString(new LineString[] { (LineString)resultGeometry });

     // throw new ROConversionException("geometry not a LineString or MultiLineString: " + resultGeometry.getClass());
     }
     return null;
     }
     */

    private Geometry convertGeometry(Element el)
            throws IOException, SAXException, ParserConfigurationException, TransformerException {
        if (!(el instanceof org.w3c.dom.Element)) {
            throw new IllegalArgumentException("gml org.w3c.node is not an org.w3c.Element");
        }
            // TODO: maybe convert node directly to a source / inputsource / reader / stream for parser.
        // instead of JDOM detour.
        org.jdom2.Element elem = new DOMBuilder().build((org.w3c.dom.Element) el);
        /* Transformer transformer = TransformerFactory.newInstance().newTransformer();
         transformer.setOutputProperty(OutputKeys.INDENT, "yes");

         StreamResult result = new StreamResult(new StringWriter());
         DOMSource source = new DOMSource(elem);
         transformer.transform(source, result);

         String gmlString = result.getWriter().toString();
         */
        String gmlString = new XMLOutputter().outputString(elem);
        //String gmlString = "";
        gmlString = gmlString.replaceAll("gml:", "");
        parser.getNamespaces().declarePrefix("gml", "http://www.opengis.net/gml/3.2");
        Object parsedObject = parser.parse(new StringReader(gmlString));

        if (parsedObject instanceof Geometry) {
            Geometry geom = (Geometry) parsedObject;
            if (!geom.isValid()) {
                geom = geom.buffer(0.0);
                log.debug("Geometry is invalid. Made valid by buffering with 0");
            }
            // arcs can have nodes that are on the same point (28992; 3 digit precision): simplify
            Geometry simplGeom = DouglasPeuckerSimplifier.simplify(geom, DISTANCE_TOLERANCE);
            return simplGeom;
        } else {
            throw new InvalidClassException(parsedObject.getClass().getCanonicalName(), "Parsed object not of class Geometry.");
        }

    }
}

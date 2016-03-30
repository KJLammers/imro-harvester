/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.b3p.imro.harvester.parser;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import javax.xml.bind.JAXBException;
import nl.b3p.imro.harvester.entities.HarvestJob;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Meine Toonen <meinetoonen@b3partners.nl>
 */
public class STRIParser2012Test {

    private STRIParser2012 instance = null;
    private HarvestJob job = null;
    public STRIParser2012Test() throws JAXBException, MalformedURLException {
        instance = new STRIParser2012();

        job = new HarvestJob();

        URL u = new URL("http://files.b3p.nl/imroharvester/manifest.xml");
        //URL u = this.getClass().getResource("testaaenhunze.html");
        //"https://www.ruimtelijkeplannen.nl/web-roi/index/showManifest?organizationId=aaenhunze&striVersion=STRI2008"
        job.setUrl(u.toString());
    }

    /**
     * Test of getGeleideformulierURLSFromManifest method, of class STRIParser2012.
     */
    @Test
    public void testGetGeleideformulierURLSFromManifest() throws Exception {
        System.out.println("getGeleideformulierURLSFromManifest");
        URL u = this.getClass().getResource("v2.0_STRI2012-manifest-voorbeeld.xml");

        STRIParser2012 instance = new STRIParser2012();
        List<URL> result = instance.getGeleideformulierURLSFromManifest(u);
        assertEquals(2, result.size());
    }

    /**
     * Test of retrieveGeleideformulieren method, of class STRIParser2012.
     */
    @Test
    public void testRetrieveGeleideformulieren() throws Exception {
        System.out.println("retrieveGeleideformulieren");

        URL u = this.getClass().getResource("geleideformulier2012.xml");
        List<URL> geleideformulieren = Collections.singletonList(u);
        List<Geleideformulier> result = instance.retrieveGeleideformulieren(geleideformulieren);
        assertEquals(1, result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testParseGeleideformulieren() throws MalformedURLException, JAXBException {
        URL expResult = new URL("http://www.rijksplannen.nl/NL.IMRO.0000.AD16081970/V037/NL.IMRO.0000.AD16081970-V037.gml");
        URL u = this.getClass().getResource("v2.0_STRI2012-geleideformulier-voorbeeld.xml");
        List<Geleideformulier> result = instance.retrieveGeleideformulieren(Collections.singletonList(u));
        assertEquals(1, result.size());
        Geleideformulier form = result.get(0);
        assertEquals(expResult, form.getGML());
        assertEquals(5, form.getBijlages().size());
        assertEquals("Voorbeeld", form.getNaam());
        assertEquals("bestemmingsplan", form.getType());
        assertEquals("vastgesteld", form.getStatus());
        assertEquals("2012-07-01",form.getDatum());
        assertEquals("IMRO2012",form.getVersie());
        assertEquals("NL.IMRO.0000.AD16081970-V037",form.getIdentificatie());
    }

    /**
     * Test of getPlannen method, of class Processor.
     */
    @Test
    public void testGetPlannenManifestSTRItV1() {
        try {
            System.out.println("testGetPlannenManifestV1");
            List<URL> result = instance.getGeleideformulierURLSFromManifest(new URL(job.getUrl()));
            assertEquals(1, result.size());
        } catch (Exception e) {
            fail("Exception occured: " + e.getLocalizedMessage());
        }
    }

    /**
     * Test of getPlannen method, of class Processor.
     */
    @Test
    public void testGetPlannenManifestV2() throws JAXBException, MalformedURLException {
        System.out.println("testGetPlannenManifestV2");
        URL u = this.getClass().getResource("v2.0_STRI2012-manifest-voorbeeld.xml");
        List<URL> result = instance.getGeleideformulierURLSFromManifest(u);
        assertEquals(2, result.size());
    }
}

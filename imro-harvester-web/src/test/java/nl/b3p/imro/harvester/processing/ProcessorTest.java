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
package nl.b3p.imro.harvester.processing;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import nl.b3p.imro.harvester.entities.HarvestJob;
import nl.b3p.imro.harvester.entities.imro.Bestemmingsplan;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Meine Toonen <meinetoonen@b3partners.nl>
 */
public class ProcessorTest {

    public ProcessorTest() {
    }

    private Processor instance = null;
    private HarvestJob job = null;

    @Before
    public void initTests() throws MalformedURLException {
        job = new HarvestJob();

        URL u = new URL("http://files.b3p.nl/imroharvester/manifest.xml");
        //URL u = this.getClass().getResource("testaaenhunze.html");
        //"https://www.ruimtelijkeplannen.nl/web-roi/index/showManifest?organizationId=aaenhunze&striVersion=STRI2008"
        job.setUrl(u.toString());
        instance = new Processor(Collections.singletonList(job));
    }

    @Test
    public void testRun(){
        job = new HarvestJob();
        job.setUrl("https://www.ruimtelijkeplannen.nl/web-roi/index/showManifest?organizationId=zaltbommel&striVersion=STRI2008");
        instance = new Processor(Collections.singletonList(job));
        instance.process();
    }

    /*
     * Test of getManifest method, of class Processor.
     */

    @Test
    public void testGetManifestUrl() {
        try {
            URL expResult = new URL("http://files.b3p.nl/imroharvester/manifest.xml");
            URL result = instance.getManifest(job);
            assertEquals(expResult, result);
        } catch (Exception e) {
            fail("Exception occured: " + e.getLocalizedMessage());
        }
    }

    @Test
    public void testParseGeleideformulieren(){
           try {
            URL expResult = new URL("http://files.b3p.nl/imroharvester/NL.IMRO.0297.BGBBP20140020-OW01.gml");
            List<URL> result = instance.parseGeleideformulieren(Collections.singletonList(new URL("http://files.b3p.nl/imroharvester/g_NL.IMRO.0297.BGBBP20140020-OW01.xml")));

            assertEquals(1, result.size());
            assertEquals(expResult, result.get(0));
        } catch (Exception e) {
            fail("Exception occured: " + e.getLocalizedMessage());
        }
    }

    /**
     * Test of getPlannen method, of class Processor.
     */
    @Test
    public void testGetPlannenManifesSTRItV1() {
        try {
            System.out.println("testGetPlannenManifestV1");
           // URL u = this.getClass().getResource("manifestaaenhunze.xml");
            List<URL> result = instance.getPlanURLs(new URL(job.getUrl()));
            assertEquals(1, result.size());
        } catch (Exception e) {
            fail("Exception occured: " + e.getLocalizedMessage());
        }
    }

    /**
     * Test of getPlannen method, of class Processor.
     */
    //@Test
    public void testGetPlannenManifestV2() {
        try {
            fail("Not yet implemented");
            System.out.println("testGetPlannenManifestV2");
            URL u = this.getClass().getResource("v2.0_STRI2012-manifest-voorbeeld.xml");
            List<URL> result = instance.getPlanURLs(u);
            assertEquals(2, result.size());
        } catch (Exception e) {
            fail("Exception occured: " + e.getLocalizedMessage());
        }

    }

    /**
     * Test of parsePlan method, of class Processor.
     */
    @Test
    public void testParsePlan() {
        try {
            System.out.println("parsePlan");
            URL u = this.getClass().getResource("2012.gml");
            List<Object> o = instance.parsePlan(u);
            assertNotNull(o);
            assertNotEquals(0, o.size());
        } catch (Exception e) {
            fail("Exception occured: " + e.getLocalizedMessage());
        }
    }

    /**
     * Test of parsePlan method, of class Processor.
     */
    @Test
    public void testParsePlanInhoudBestemmingsplan() {
        try {
            System.out.println("parsePlanInhoud");
            URL u = this.getClass().getResource("2012.gml");
            List<Object> o = instance.parsePlan(u);
            assertNotNull(o);
            Bestemmingsplan bp = null;
            for (Object obj : o) {
                if(obj instanceof Bestemmingsplan){
                    bp = (Bestemmingsplan)obj;
                }
            }
            assertNotNull(bp);
            assertEquals("bestemmingsplan", bp.getTypePlan());
            assertEquals("NL.IMRO.0297.BGBBP20140020-OW01", bp.getIdentificatie());
        } catch (Exception e) {
            fail("Exception occured: " + e.getLocalizedMessage());
        }
    }


}

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
package nl.b3p.imro.harvester.stripes;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.After;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.StrictBinding;
import net.sourceforge.stripes.action.UrlBinding;
import net.sourceforge.stripes.controller.LifecycleStage;
import nl.b3p.imro.harvester.entities.HarvestJob;
import org.stripesstuff.stripersist.Stripersist;

/**
 *
 * @author Meine Toonen <meinetoonen@b3partners.nl>
 */
@StrictBinding
@UrlBinding("/action/beheer/jobs/{event}")
public class HarvestJobActionBean implements ActionBean{

    private ActionBeanContext context;

    private final String JSP_VIEW = "/WEB-INF/jsp/jobs/view.jsp";
    private final String JSP_EDIT = "/WEB-INF/jsp/jobs/edit.jsp";
    private final String JSP_ADD = "/WEB-INF/jsp/jobs/add.jsp";

    private List<HarvestJob> jobs = new ArrayList<HarvestJob>();

    // <editor-fold desc="Getters and Setters" defaultstate="collapsed" >
    @Override
    public ActionBeanContext getContext() {
        return context;
    }

    @Override
    public void setContext(ActionBeanContext context) {
        this.context = context;
    }

    public List<HarvestJob> getJobs() {
        return jobs;
    }

    public void setJobs(List<HarvestJob> jobs) {
        this.jobs = jobs;
    }

    // </editor-fold>

    @DefaultHandler
    public Resolution view(){
        return new ForwardResolution(JSP_VIEW);
    }

    public Resolution add(){
        return new ForwardResolution(JSP_ADD);
        
    }

    public Resolution save(){
        return new ForwardResolution(JSP_VIEW);
    }

    public Resolution edit(){
        return new ForwardResolution(JSP_EDIT);
    }


    @After(stages = LifecycleStage.EventHandling)
    private void createLists(){
        EntityManager em = Stripersist.getEntityManager();
        jobs = em.createQuery("From HarvestJob", HarvestJob.class).getResultList();
    }
}
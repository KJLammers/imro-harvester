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

import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import nl.b3p.imro.harvester.entities.Configuration;
import nl.b3p.imro.harvester.stripes.AdminActionBean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.stripesstuff.stripersist.Stripersist;

/**
 *
 * @author Meine Toonen <meinetoonen@b3partners.nl>
 */
public class QuartzInitializer implements Servlet {

    protected final static Log log = LogFactory.getLog(QuartzInitializer.class);

    public static final String JOB_NAME = "harvestJobsExecutor";
    private ServletConfig config;
    private static Scheduler scheduler;

    @Override
    public void init(ServletConfig sc) throws ServletException {
        this.config = sc;
        log.debug("Initializing quartz.");
        try {
            String cronschedule = "0 0 3 1/1 * ? *";

            Stripersist.requestInit();
            EntityManager em = Stripersist.getEntityManager("imroPU");
            try {
                Configuration cron = em.createQuery("FROM Configuration where key = :cronKey", Configuration.class).setParameter("cronKey", AdminActionBean.CONFIG_CRON).getSingleResult();
                cronschedule = cron.getValue();
            } catch (NoResultException e) {
            }
            JobDetail job = JobBuilder.newJob(JobExecutor.class)
                    .withIdentity(JOB_NAME, "group1").build();

            Trigger trigger = TriggerBuilder
                    .newTrigger()
                    .withIdentity("dummyTriggerName", "group1")
                    .withSchedule(
                            CronScheduleBuilder.cronSchedule(cronschedule))
                    .build();

            // schedule it
            scheduler = new StdSchedulerFactory().getScheduler();
            scheduler.start();

            scheduler.scheduleJob(job, trigger);
            SimpleDateFormat sdf = new SimpleDateFormat("mm:kk dd-MM-yyyy");
            log.debug("Quartz initialized. Next run is: " + sdf.format(trigger.getNextFireTime()));
        } catch (SchedulerException ex) {
            log.error("Cannot create scheduler", ex);
        } catch (Exception e) {
            log.error("Error creating scheduler", e); // catch all, to prevent startup problems.
        } finally {
            Stripersist.requestComplete();
        }
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getServletInfo() {
        return "Init quartz";
    }

    @Override
    public void destroy() {
        if(scheduler != null){
            try {
                scheduler.shutdown();
            } catch (SchedulerException ex) {
                log.error("Cannot shutdown quartz scheduler: ", ex);
            }
        }
    }

}

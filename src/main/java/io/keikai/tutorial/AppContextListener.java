package io.keikai.tutorial;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        SampleDataDao.initDatabase();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        SampleDataDao.close();
    }
}
package com.example.demo.listener;

import javax.servlet.*;
import java.io.IOException;

public class myListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("contextInitialized...success");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("contextDestroyed...success");
    }
}

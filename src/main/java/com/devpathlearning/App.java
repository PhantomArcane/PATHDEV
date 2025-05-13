package com.devpathlearning;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class App {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        // Set the webapp directory
        String webappDir = "src/main/webapp";
        tomcat.addWebapp("", new File(webappDir).getAbsolutePath());

        System.out.println("Starting embedded Tomcat server...");
        tomcat.start();
        tomcat.getServer().await();
    }
}

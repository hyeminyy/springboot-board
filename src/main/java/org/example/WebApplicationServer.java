package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class WebApplicationServer {

    private static final Logger log = LoggerFactory.getLogger(WebApplicationServer.class);

    public static void main(String[] args) {
        String webappDirLocation = "webapps/";
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        try {
            tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
            log.info("Configuring app with base directory: {}", new File(".", webappDirLocation).getAbsoluteFile());

            tomcat.start();
            tomcat.getServer().await();
        } catch (Exception e) {
            log.error("Error starting Tomcat server", e);
        }
    }
}

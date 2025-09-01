package org.zzssg.jmxdemo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JmxConfig {

    private static final Logger logger = LoggerFactory.getLogger(JmxConfig.class);

    @Value("${app.jmx.port}")
    private String jmxPort;

    @Value("${app.jmx.authenticate}")
    private String jmxAuth;

    @Value("${app.jmx.ssl}")
    private String jmxSsl;

    @Value("${app.jmx.password.file}")
    private String passwordFile;

    @Value("${app.jmx.access.file}")
    private String accessFile;

    @PostConstruct
    public void init() {
        logger.info("JMX port defined: {}", jmxPort);

        System.setProperty("com.sun.management.jmxremote", "");
        System.setProperty("com.sun.management.jmxremote.port", jmxPort);
        System.setProperty("com.sun.management.jmxremote.authenticate", jmxAuth);
        System.setProperty("com.sun.management.jmxremote.ssl", jmxSsl);
        System.setProperty("com.sun.management.jmxremote.password.file", passwordFile);
        System.setProperty("com.sun.management.jmxremote.access.file", accessFile);
    }
}

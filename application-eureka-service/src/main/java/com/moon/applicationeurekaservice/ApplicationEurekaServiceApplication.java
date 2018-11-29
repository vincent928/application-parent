package com.moon.applicationeurekaservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationEurekaServiceApplication {

    private static final Logger LOG = LoggerFactory.getLogger(ApplicationEurekaServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ApplicationEurekaServiceApplication.class, args);
        LOG.info("SpringCloud Eureka Server starting.............");
    }
}

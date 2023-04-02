package com.smithexperience.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * as of Spring Boot 3 and Spring Cloud 2022.0.0 no longer need to "enable" the Eureka client with the @EnableEurekaClient
 * annotation at the APP level (main class) -- it is auto-configured when adding the Eureka dependency
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    /**
     * Spring Cloud Config Server: a Spring Boot application with the Spring Cloud Config Server library dependency
     *  -- Spring Cloud Config server allows for the ability to 'pull-in' all configuration files from a centralized location
     *     that pertain to/are used by the [entire] application.
     *     -- Config changes are done in ONE place -- keeping the code 'clean and manageable'
     *  -- The config files contain all the 'properties' of the microservices [config client] registered to/with the config server
     *     -- The 'config client' [microservice] is created/established by defining the config server dependency [location/url] within the
     *        properties file of the service
     *     -- When the services start, the [micro] service will load all the configuration files from the config server
     */

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}

package com.example4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Spring Boot application class.
 * This class serves as the entry point for the Spring Boot application.
 *
 * @SpringBootApplication is a convenience annotation that adds:
 * - @Configuration: Tags the class as a source of bean definitions for the application context.
 * - @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
 * - @ComponentScan: Tells Spring to look for other components, configurations, and services in the 'com.example3' package,
 * allowing it to discover the UserController, UserServiceImpl, etc.
 */
@SpringBootApplication
public class SpringTestingApplication {

    public static void main(String[] args) {
        // Starts the Spring Boot application.
        SpringApplication.run(SpringTestingApplication.class, args);
    }
}

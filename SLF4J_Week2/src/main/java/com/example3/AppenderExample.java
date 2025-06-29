package com.example3; // Ensure this matches your project's base package

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Demonstrates logging messages using different appenders (console and file)
 * configured via logback.xml.
 */
public class AppenderExample {

    // Obtain a Logger instance for this class.
    private static final Logger logger = LoggerFactory.getLogger(AppenderExample.class);

    public static void main(String[] args) {
        String appName = "MySLF4JApp";
        int startupAttempts = 1;

        // Log messages at different levels
        logger.info("Application '{}' is starting up (Attempt {}).", appName, startupAttempts);
        logger.debug("Checking initial configuration parameters.");
        logger.warn("Potentially deprecated feature being used.");

        try {
            int data = Integer.parseInt("abc"); // This will throw a NumberFormatException
        } catch (NumberFormatException e) {
            logger.error("Failed to parse data. Invalid format received.", e);
        }

        logger.info("Application startup complete.");

        System.out.println("Check console for log messages, and look for 'app.log' file in your project directory.");
    }
}

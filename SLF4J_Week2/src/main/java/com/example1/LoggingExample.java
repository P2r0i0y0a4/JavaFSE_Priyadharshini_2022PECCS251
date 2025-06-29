package com.example1; // Ensure this matches your project's base package

import org.slf4j.Logger;         // Corrected: Import the SLF4J Logger interface (from org.slf4j, not org.slf44j)
import org.slf4j.LoggerFactory;  // Import the SLF4J LoggerFactory to get a Logger instance

/**
 * Demonstrates logging error and warning messages using SLF4J with Logback as the backend.
 * This class serves as a simple application to show basic logging functionalities.
 */
public class LoggingExample {

    // Obtain a Logger instance for this class.
    // The logger name will typically be the fully qualified class name.
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        // Log an error message.
        // Error messages indicate severe problems that might require immediate attention.
        logger.error("This is an error message from LoggingExample.");

        // Log a warning message.
        // Warning messages indicate potential problems or unusual situations that are not critical errors.
        logger.warn("This is a warning message from LoggingExample.");

        // You can also log other levels for demonstration if needed (DEBUG, INFO, TRACE)
        logger.info("This is an informational message.");
        logger.debug("This is a debug message (might not show by default, depending on logback config).");
        logger.trace("This is a trace message (least severe, usually for very detailed debugging).");
    }
}

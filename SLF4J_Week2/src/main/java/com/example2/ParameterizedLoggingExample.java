package com.example2; // Ensure this matches your project's base package

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Demonstrates parameterized logging using SLF4J.
 * Parameterized logging is more efficient and safer than string concatenation
 * as the string formatting only occurs if the log level is enabled.
 */
public class ParameterizedLoggingExample {

    // Obtain a Logger instance for this class.
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String userName = "Alice";
        int userAge = 30;
        double transactionAmount = 150.75;
        String itemId = "SKU12345";
        int quantity = 2;

        // Example 1: Basic parameterized logging with two parameters
        logger.info("User {} logged in successfully.", userName);

        // Example 2: Logging multiple parameters
        logger.debug("Processing order for user {} with amount {}.", userName, transactionAmount);

        // Example 3: Logging with more than two parameters
        logger.warn("Item {} is low in stock, only {} units remaining for user {}.", itemId, quantity, userName);

        // Example 4: Logging an exception with parameters
        try {
            int result = 10 / 0; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            // When logging an exception, pass it as the last argument.
            // SLF4J will correctly format the message and append the stack trace.
            logger.error("Failed to perform calculation for user {}. Error: {}", userName, e.getMessage(), e);
        }

        // Example 5: Logging with an array of arguments (useful for a variable number of parameters)
        Object[] values = {"Report", 2025, "January"};
        logger.trace("Generating {} for year {} in month {}.", values);

        System.out.println("Check console for log messages above.");
    }
}

package com.example;

import org.junit.After;  // Import for @After (JUnit 4)
import org.junit.Before; // Import for @Before (JUnit 4)
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.example.Calculator; // Import the Calculator class

public class CalculatorFixtureTest {

    // This is our 'test fixture' - an object that multiple test methods will use.
    // Declaring it at the class level allows setup/teardown methods to access it.
    private Calculator calculator;

    // --- Setup Method using @Before ---
    // This method runs BEFORE EACH test method in this class.
    // It's ideal for initializing objects that are common to all tests,
    // ensuring each test starts with a fresh, known state.
    @Before
    public void setUp() {
        System.out.println("Running @Before: Setting up Calculator instance...");
        calculator = new Calculator(); // Initialize the calculator before each test
        assertNotNull("Calculator should not be null after setup", calculator);
    }

    // --- Teardown Method using @After ---
    // This method runs AFTER EACH test method in this class.
    // It's ideal for cleaning up resources (e.g., closing files, resetting databases)
    // that were used by the test, ensuring tests don't interfere with each other.
    @After
    public void tearDown() {
        System.out.println("Running @After: Tearing down Calculator instance...");
        calculator = null; // Dereference the object to help with garbage collection
        // In more complex scenarios, you might close connections, delete temporary files, etc.
    }

    // --- Test Methods using Arrange-Act-Assert (AAA) Pattern ---

    @Test
    public void testAdd_PositiveNumbers() {
        // 1. Arrange (Setup the test):
        // Objects are already created in @Before. We just define test-specific variables.
        int num1 = 5;
        int num2 = 3;

        // 2. Act (Perform the action/method call):
        int sum = calculator.add(num1, num2);

        // 3. Assert (Verify the outcome):
        assertEquals("Addition of 5 and 3 should be 8", 8, sum);
        System.out.println("  Test: testAdd_PositiveNumbers completed.");
    }

    @Test
    public void testSubtract_NegativeResult() {
        // Arrange
        int num1 = 4;
        int num2 = 10;

        // Act
        int result = calculator.subtract(num1, num2);

        // Assert
        assertEquals("Subtraction of 4 and 10 should be -6", -6, result);
        System.out.println("  Test: testSubtract_NegativeResult completed.");
    }

    @Test
    public void testDivide_ByZero() {
        // Arrange
        int num1 = 5;
        int num2 = 0;

        // Act
        double result = calculator.divide(num1, num2);

        // Assert
        assertTrue("Division by zero should result in NaN", Double.isNaN(result));
        System.out.println("  Test: testDivide_ByZero completed.");
    }

    // You can add more test methods following the AAA pattern for other scenarios.
}
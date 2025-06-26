package com.example;

import org.junit.Test; // JUnit 4 @Test annotation
import static org.junit.Assert.assertEquals; // For checking equality
import static org.junit.Assert.assertNotNull; // For checking if an object is not null
import static org.junit.Assert.assertTrue; // For checking boolean conditions
import static org.junit.Assert.assertFalse; // For checking boolean conditions

// Import the Calculator class we just created
import com.example.Calculator; // Make sure this matches your Calculator's package
public class CalculatorTest {
	@Test
    public void testAdd() {
        Calculator calculator = new Calculator(); // Create an instance of the class to test
        int result = calculator.add(5, 3);
        assertEquals("Addition of 5 and 3 should be 8", 8, result); // (message, expected, actual)
    }

    // Test method for the subtract() method
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 4);
        assertEquals("Subtraction of 10 and 4 should be 6", 6, result);

        result = calculator.subtract(4, 10); // Test with negative result
        assertEquals("Subtraction of 4 and 10 should be -6", -6, result);
    }

    // Test method for the multiply() method
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 5);
        assertEquals("Multiplication of 2 and 5 should be 10", 10, result);

        result = calculator.multiply(-3, 4); // Test with negative number
        assertEquals("Multiplication of -3 and 4 should be -12", -12, result);
    }

    // Test method for the divide() method
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, 2);
        assertEquals("Division of 10 by 2 should be 5.0", 5.0, result, 0.001); // 0.001 is delta for double comparison

        result = calculator.divide(7, 3);
        assertEquals("Division of 7 by 3 should be approx 2.333", 2.333, result, 0.001);

        // Test division by zero - this will return Double.NaN as per our Calculator class
        result = calculator.divide(5, 0);
        assertTrue("Division by zero should result in NaN", Double.isNaN(result));
        assertFalse("Division by zero should not be a finite number", Double.isFinite(result));
    }

    // Example of another assertion type
    @Test
    public void testObjectCreation() {
        Calculator calculator = new Calculator();
        assertNotNull("Calculator object should not be null",calculator);;
}
}

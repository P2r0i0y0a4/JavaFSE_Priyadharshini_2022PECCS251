package advancedTesting;

import org.junit.Test;
import org.junit.runner.RunWith; // Required for JUnit 4 Parameterized tests
import org.junit.runners.Parameterized; // Required for JUnit 4 Parameterized tests
import org.junit.runners.Parameterized.Parameters; // Static import for @Parameters annotation

import static org.junit.Assert.assertEquals; // For making assertions

import advancedTesting.EvenChecker; // Import the EvenChecker class

import java.util.Arrays;
import java.util.Collection; // Required for the return type of the @Parameters method

// @RunWith(Parameterized.class) tells JUnit that this test class will run with a parameterized runner.
// This runner will execute the test method once for each set of parameters provided by the @Parameters method.
@RunWith(Parameterized.class)
public class EvenCheckerTest {
    private int inputNumber;
    private boolean expectedResult;

    // 2. Create a public constructor that takes parameters corresponding to the test data.
    // The order of parameters in the constructor must match the order of elements
    // in the Object[] arrays returned by the @Parameters method.
    public EvenCheckerTest(int inputNumber, boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    // 3. Create a static method annotated with @Parameters that provides the test data.
    // This method must return a Collection of Object arrays.
    // Each Object array represents one set of test parameters for a single run of the test method.
    @Parameters(name = "Test Case: isEven({0}) = {1}") // Optional: name for better output in JUnit runner
    public static Collection<Object[]> getTestParameters() {
        return Arrays.asList(new Object[][] {
            { 2, true },    // Test case 1: 2 is even
            { 4, true },    // Test case 2: 4 is even
            { 0, true },    // Test case 3: 0 is even
            { -2, true },   // Test case 4: -2 is even
            { 3, false },   // Test case 5: 3 is odd
            { 1, false },   // Test case 6: 1 is odd
            { -1, false },  // Test case 7: -1 is odd
            { 100, true },  // Test case 8
            { 99, false }   // Test case 9
        });
    }

    // 4. Write the actual test method, annotated with @Test.
    // This method will be run once for each set of parameters.
    // It uses the instance variables (inputNumber, expectedResult) that were
    // populated by the constructor for the current test run.
    @Test
    public void testIsEven() {
        EvenChecker checker = new EvenChecker(); // Create instance of the class under test
        boolean actualResult = checker.isEven(inputNumber); // Act

        // Assert that the actual result matches the expected result for the current input
        assertEquals("Checking if " + inputNumber + " is even", expectedResult, actualResult);
    }

}

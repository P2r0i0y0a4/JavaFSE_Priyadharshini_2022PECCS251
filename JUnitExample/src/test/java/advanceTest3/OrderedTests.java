package advanceTest3;

import org.junit.Test; // JUnit 4 @Test annotation
import static org.junit.Assert.assertEquals; // JUnit 4 Assertions

import org.junit.FixMethodOrder; // JUnit 4 annotation for method order
import org.junit.runners.MethodSorters; // Enum for method sorting strategies

// @FixMethodOrder(MethodSorters.NAME_ASCENDING)
// This annotation tells JUnit 4 to execute test methods in ascending alphabetical order of their names.
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderedTests {

    // A static StringBuilder to log execution order across tests.
    // It's static so its state persists between method calls within the same test class run.
    private static StringBuilder executionLog = new StringBuilder();

    // Each test method's name will start with a number to control its alphabetical order.

    @Test
    public void test_1_first() { // This method will run first (due to '_1_')
        executionLog.append("A");
        // Assert that 'A' is the only character logged so far
        assertEquals("Executing test_1_first", "A", executionLog.toString());
        System.out.println("Executing test_1_first (Order 1)");
    }

    @Test
    public void test_2_second() { // This method will run second (due to '_2_')
        executionLog.append("B");
        // Assert that 'A' and 'B' are logged in sequence
        assertEquals("Executing test_2_second", "AB", executionLog.toString());
        System.out.println("Executing test_2_second (Order 2)");
    }

    @Test
    public void test_3_third() { // This method will run third (due to '_3_')
        executionLog.append("C");
        // Assert that 'A', 'B', and 'C' are logged in sequence
        assertEquals("Executing test_3_third", "ABC", executionLog.toString());
        System.out.println("Executing test_3_third (Order 3)");
    }

    @Test
    public void test_4_fourth() { // This method will run fourth (due to '_4_')
        executionLog.append("D");
        // Assert that all characters are logged in sequence
        assertEquals("Executing test_4_fourth", "ABCD", executionLog.toString());
        System.out.println("Executing test_4_fourth (Order 4)");
    }
}
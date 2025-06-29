package advanceTest5;

import org.junit.Test; // JUnit 4 @Test annotation
// No need for 'import static org.junit.Assert.fail;' as timeout handles failure automatically

import advanceTest5.PerformanceTester; // Import the class we are testing (adjust package if needed)

public class PerformanceTesterTest {

    // Test case 1: Method completes within the specified timeout.
    // The 'timeout' attribute is in milliseconds.
    // This test method will sleep for 50 milliseconds, which is less than the 100ms timeout.
    @Test(timeout = 100) // Sets a timeout of 100 milliseconds
    public void testPerformTask_WithinTimeout() {
        System.out.println("Running testPerformTask_WithinTimeout...");
        PerformanceTester tester = new PerformanceTester();
        tester.performTask(50); // Task takes 50ms
        System.out.println("  testPerformTask_WithinTimeout completed successfully.");
        // If this method completes within 100ms, the test passes.
    }

    // Test case 2: Method EXCEEDS the specified timeout.
    // This test method will sleep for 200 milliseconds, which is more than the 100ms timeout.
    // This test is EXPECTED TO FAIL due to a TimeoutException in JUnit 4.
    @Test(timeout = 100) // Sets a timeout of 100 milliseconds
    public void testPerformTask_ExceedsTimeout() {
        System.out.println("Running testPerformTask_ExceedsTimeout (expecting timeout failure)...");
        PerformanceTester tester = new PerformanceTester();
        tester.performTask(200); // Task takes 200ms
        System.out.println("  (This line will not be reached if timeout occurs)");
        // If the timeout occurs, JUnit will automatically fail the test.
    }

    // Example: Another test with a different timeout
    @Test(timeout = 500) // Sets a timeout of 500 milliseconds (0.5 seconds)
    public void testPerformTask_HalfSecondTimeout() {
        System.out.println("Running testPerformTask_HalfSecondTimeout...");
        PerformanceTester tester = new PerformanceTester();
        tester.performTask(400); // Task takes 400ms, within 500ms
        System.out.println("  testPerformTask_HalfSecondTimeout completed successfully.");
    }
}
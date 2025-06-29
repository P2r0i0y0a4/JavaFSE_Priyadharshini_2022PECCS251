package advanceTest4;

import static org.junit.Assert.*;

import org.junit.Test;
import advanceTest4.ExceptionThrower; 
public class ExceptionThrowerTest {
	@Test(expected = IllegalArgumentException.class)
    public void testThrowIllegalArgumentException() {
        System.out.println("Running testThrowIllegalArgumentException...");
        ExceptionThrower et = new ExceptionThrower();
        et.throwException(1); // This call is expected to throw IllegalArgumentException
        System.out.println("  (This line will not be reached if exception is thrown)");
    }

    // Test for IndexOutOfBoundsException
    @Test(expected = IndexOutOfBoundsException.class)
    public void testThrowIndexOutOfBoundsException() {
        System.out.println("Running testThrowIndexOutOfBoundsException...");
        ExceptionThrower et = new ExceptionThrower();
        et.throwException(2); // This call is expected to throw IndexOutOfBoundsException
    }

    // Test for a generic RuntimeException
    @Test(expected = RuntimeException.class)
    public void testThrowGenericRuntimeException() {
        System.out.println("Running testThrowGenericRuntimeException...");
        ExceptionThrower et = new ExceptionThrower();
        et.throwException(99); // This call is expected to throw RuntimeException
    }

    // Test for NullPointerException
    @Test(expected = NullPointerException.class)
    public void testThrowNullPointerException() {
        System.out.println("Running testThrowNullPointerException...");
        ExceptionThrower et = new ExceptionThrower();
        et.throwNullPointerException(); // This call is expected to throw NullPointerException
    }

    // Example of a test that should FAIL if no exception is thrown
    // To demonstrate how JUnit handles an unexpected pass
    @Test(expected = IllegalArgumentException.class) // We expect this, but the method won't throw it
    public void testShouldFailIfNoExceptionThrown() {
        System.out.println("Running testShouldFailIfNoExceptionThrown (expecting failure)...");
        ExceptionThrower et = new ExceptionThrower();
        // This call won't throw IllegalArgumentException, so the test will FAIL
        // because the expected exception wasn't thrown.
        // It will instead throw RuntimeException, which is not what's expected.
        et.throwException(3);
    }
}

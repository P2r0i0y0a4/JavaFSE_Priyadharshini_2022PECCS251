package com.example.tests; // Make sure this matches your test package name

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertArrayEquals; // Often useful
import static org.junit.Assert.assertSame; // Checks if two object references point to the same object
import static org.junit.Assert.assertNotSame; // Checks if two object references point to different objects

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert equals: Checks if two values are equal
        assertEquals(5, 2 + 3); // Expected, Actual

        // Assert true: Checks if a condition is true
        assertTrue("5 should be greater than 3", 5 > 3); // Message, Condition

        // Assert false: Checks if a condition is false
        assertFalse("5 should not be less than 3", 5 < 3); // Message, Condition

        // Assert null: Checks if an object reference is null
        Object obj1 = null;
        assertNull("Object should be null", obj1); // Message, Object

        // Assert not null: Checks if an object reference is not null
        Object obj2 = new Object();
        assertNotNull("Object should not be null", obj2); // Object, Message (JUnit 4 order)

        // Assert same: Checks if two object references point to the EXACT SAME object (memory location)
        String str1 = new String("Hello");
        String str2 = str1; // str2 refers to the same object as str1
        assertSame("str1 and str2 should be the same object", str1, str2); // Message, Expected, Actual

        // Assert not same: Checks if two object references point to DIFFERENT objects
        String str3 = new String("World");
        String str4 = new String("World"); // str3 and str4 are different objects in memory, even if content is same
        assertNotSame("str3 and str4 should be different objects", str3, str4); // Message, Expected, Actual

        // Assert array equals: Checks if two arrays are equal in content and order
        int[] expectedArray = {1, 2, 3};
        int[] actualArray = {1, 2, 3};
        assertArrayEquals("Arrays should be equal", expectedArray, actualArray); // Message, Expected Array, Actual Array
    }
}
package com.example.test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MySimpleTest { // <-- REMOVE THE [] HERE

    @Test
    public void testAddition() {
        int num1 = 5;
        int num2 = 3;
        int sum = num1 + num2;
        assertEquals("5 + 3 should be 8", 8, sum);
    }

    @Test
    public void anotherTest() {
        String message = "Hello";
        assertEquals("String should be 'Hello'", "Hello", message);
    }
}
package com.example.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MySimpleTest {

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

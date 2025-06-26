package com.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    // Example of a method that might have edge cases
    public double divide(int a, int b) {
        if (b == 0) {
            // In a real application, you might throw an IllegalArgumentException
            // or return a special value. For now, let's keep it simple.
            // We'll test for this case.
            return Double.NaN; // Not a Number for division by zero
        }
        return (double) a / b;
    }


}

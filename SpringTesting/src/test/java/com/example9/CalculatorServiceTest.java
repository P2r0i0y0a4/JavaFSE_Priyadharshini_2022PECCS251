package com.example9;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @CsvSource({
        "1, 2, 3",
        "5, 5, 10",
        "-1, 1, 0",
        "100, 200, 300"
    })
    public void testAdd(int a, int b, int expectedSum) {
        int result = calculatorService.add(a, b);
        assertEquals(expectedSum, result);
    }
}

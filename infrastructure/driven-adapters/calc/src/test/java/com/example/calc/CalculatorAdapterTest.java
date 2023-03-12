package com.example.calc;

import org.junit.jupiter.api.*;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorAdapterTest {
    private CalculatorAdapter calculatorAdapter;

    @BeforeEach
    void setUp(){
        calculatorAdapter = new CalculatorAdapter();
    }
    @Test
    @DisplayName("should return seven when add two numbers three and four")
    void shouldReturnSevenWhenAddTwoNumbersThreeAndFour() {
        int a = 3;
        int b = 4;
        int expected = 7;
        calculatorAdapter.Add(a, b).subscribe(actual -> assertEquals(expected, actual));
    }
}
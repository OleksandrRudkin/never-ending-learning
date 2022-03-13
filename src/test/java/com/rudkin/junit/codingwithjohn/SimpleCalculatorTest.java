package com.rudkin.junit.codingwithjohn;

import com.rudkin.junit.codingwithjohn.SimpleCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

        @Test
        @DisplayName("twoPlusTwoShouldEqualsFour")
        void twoPlusTwoShouldEqualsFour() {
                var calculator = new SimpleCalculator();
                assertEquals(4, calculator.add(2,2));
        }


}
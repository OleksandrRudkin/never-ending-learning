package com.rudkin.junit.codingwithjohn;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    @DisplayName("fiftyNineShouldReturnF")
    void fiftyNineShouldReturnF() {
        var grader = new Grader();
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    @DisplayName("negativeOneShouldReturnIllegalArgumentException")
    void negativeOneShouldReturnIllegalArgumentException() {
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                () -> grader.determineLetterGrade(-1));
    }

}
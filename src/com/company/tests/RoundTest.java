package com.company.tests;

import com.company.Round;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundTest {
    Round round = new Round();

    @Test
    void draw() {
    }

    @Test
    void calculateArea() {
        round.setRadius(10);
        assertEquals(round.calculateArea(),314);
    }

    @Test
    void findColor() {
    }

    @Test
    void findDiameter() {
    }
}
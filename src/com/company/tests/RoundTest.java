package com.company.tests;

import com.company.Round;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundTest {
    Round round = new Round();
    Round round1 = new Round();
    Round round2 = new Round();


    @Test
    void draw() {
    }


    @Test
    void calculateArea() {
        round.setRadius(10);
        round1.setRadius(20);
        round2.setRadius(30);
        assertEquals(round.calculateArea(),314);
        assertEquals(round1.calculateArea(),1256);
        assertEquals(round2.calculateArea(),2827);

    }

    @Test
    void findDiameter() {
        round.setRadius(10);
        round1.setRadius(20);
        round2.setRadius(30);
        assertEquals(round.findDiameter(), 20);
        assertEquals(round.findDiameter(), 40);
        assertEquals(round.findDiameter(), 60);

    }
}
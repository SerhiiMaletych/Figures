package com.company.tests;

import com.company.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square = new Square();
    Square square1 = new Square();
    Square square2 = new Square();


    @Test
    void calculateArea() {
        square.setSide(20);
        square1.setSide(200);
        square2.setSide(140);

        assertEquals(square.calculateArea(),400);
        assertEquals(square1.calculateArea(),40000);
        assertEquals(square2.calculateArea(),19600);

    }

    @Test
    void findPerimeter() {
        square.setSide(20);
        square1.setSide(180);
        square2.setSide(440);

        assertEquals(square.findPerimeter(),80);
        assertEquals(square1.findPerimeter(),720);
        assertEquals(square2.findPerimeter(),1760);

    }
}
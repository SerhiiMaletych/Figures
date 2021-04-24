package com.company.tests;

import com.company.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square = new Square();

    @Test
    void calculateArea() {
        square.setSide(20);
        assertEquals(square.calculateArea(),400);
    }

    @Test
    void findPerimeter() {
        square.setSide(20);
        assertEquals(square.findPerimeter(),80);
    }
}
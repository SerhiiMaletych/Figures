package com.company.tests;

import com.company.Trapezoid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapezoidTest {
    Trapezoid trapezoid = new Trapezoid();

    @Test
    void calculateArea() {
        trapezoid.setBottomSide(20);
        trapezoid.setLeftSide(10);
        trapezoid.setRightSide(15);
        trapezoid.setTopSide(8);
        trapezoid.setHeight(12);
        assertEquals(trapezoid.calculateArea(), 168);
    }

    @Test
    void findPerimeter() {
        trapezoid.setBottomSide(30);
        trapezoid.setLeftSide(20);
        trapezoid.setRightSide(25);
        trapezoid.setTopSide(18);
        trapezoid.setHeight(22);
        assertEquals(trapezoid.findPerimeter(), 93);
    }
}
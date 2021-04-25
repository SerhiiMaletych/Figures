package com.company.tests;

import com.company.Trapezoid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapezoidTest {
    Trapezoid trapezoid = new Trapezoid();
    Trapezoid trapezoid1 = new Trapezoid();
    Trapezoid trapezoid2 = new Trapezoid();


    @Test
    void calculateArea() {
        trapezoid.setBottomSide(20);
        trapezoid.setLeftSide(10);
        trapezoid.setRightSide(15);
        trapezoid.setTopSide(8);
        trapezoid.setHeight(12);

        trapezoid1.setBottomSide(34);
        trapezoid1.setLeftSide(18);
        trapezoid1.setRightSide(22);
        trapezoid1.setTopSide(18);
        trapezoid1.setHeight(29);

        trapezoid2.setBottomSide(37);
        trapezoid2.setLeftSide(38);
        trapezoid2.setRightSide(35);
        trapezoid2.setTopSide(37);
        trapezoid2.setHeight(36);

        assertEquals(trapezoid.calculateArea(), 168);
        assertEquals(trapezoid1.calculateArea(), 754);
        assertEquals(trapezoid2.calculateArea(), 1332);

    }

    @Test
    void findPerimeter() {
        trapezoid.setBottomSide(30);
        trapezoid.setLeftSide(20);
        trapezoid.setRightSide(25);
        trapezoid.setTopSide(18);
        trapezoid.setHeight(22);

        trapezoid1.setBottomSide(37);
        trapezoid1.setLeftSide(38);
        trapezoid1.setRightSide(37);
        trapezoid1.setTopSide(49);
        trapezoid1.setHeight(35);

        trapezoid2.setBottomSide(112);
        trapezoid2.setLeftSide(126);
        trapezoid2.setRightSide(222);
        trapezoid2.setTopSide(124);
        trapezoid2.setHeight(160);
        assertEquals(trapezoid.findPerimeter(), 93);
        assertEquals(trapezoid1.findPerimeter(), 161);
        assertEquals(trapezoid2.findPerimeter(), 584);

    }
}
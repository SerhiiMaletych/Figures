package com.company.tests;

import com.company.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle triangle = new Triangle();

    @Test
    void calculateArea() {
        triangle.setFirstLeg(30);
        triangle.setSecondLeg(15);
        triangle.setCorner(170);
        assertEquals(triangle.calculateArea(), 77);
    }

    @Test
    void findHypotenuse() {
        triangle.setFirstLeg(40);
        triangle.setSecondLeg(34);
        assertEquals(triangle.findHypotenuse(), 52);
    }

    @Test
    void findPerimeter() {
        triangle.setFirstLeg(59);
        triangle.setSecondLeg(73);
        triangle.setCorner(33);
        assertEquals(triangle.findPerimeter(), 225);
    }
}
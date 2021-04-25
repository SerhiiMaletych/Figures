package com.company.tests;

import com.company.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle triangle = new Triangle();
    Triangle triangle1 = new Triangle();
    Triangle triangle2 = new Triangle();


    @Test
    void calculateArea() {
        triangle.setFirstLeg(30);
        triangle.setSecondLeg(15);
        triangle.setCorner(170);

        triangle1.setFirstLeg(22);
        triangle1.setSecondLeg(24);
        triangle1.setCorner(40);

        triangle2.setFirstLeg(180);
        triangle2.setSecondLeg(160);
        triangle2.setCorner(34);

        assertEquals(triangle.calculateArea(), 77);
        assertEquals(triangle1.calculateArea(), 196);
        assertEquals(triangle2.calculateArea(), 7618);

    }

    @Test
    void findHypotenuse() {
        triangle.setFirstLeg(40);
        triangle.setSecondLeg(34);

        triangle1.setFirstLeg(196);
        triangle1.setSecondLeg(300);

        triangle2.setFirstLeg(522);
        triangle2.setSecondLeg(297);

        assertEquals(triangle.findHypotenuse(), 52);
        assertEquals(triangle1.findHypotenuse(), 358);
        assertEquals(triangle2.findHypotenuse(), 600);

    }

    @Test
    void findPerimeter() {
        triangle.setFirstLeg(59);
        triangle.setSecondLeg(73);
        triangle.setCorner(33);

        triangle1.setFirstLeg(35);
        triangle1.setSecondLeg(35);
        triangle1.setCorner(90);

        triangle2.setFirstLeg(400);
        triangle2.setSecondLeg(300);
        triangle2.setCorner(22);

        assertEquals(triangle.findPerimeter(), 225);
        assertEquals(triangle1.findPerimeter(), 119);
        assertEquals(triangle2.findPerimeter(), 1200);

    }
}
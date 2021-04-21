package com.company;


public class Round implements Figure {

    private final double radius = Math.random() * 100;


    @Override
    public String draw() {
        return "It's a round!";
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public Color findColor() {
        return Color.randomColor();
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        return "Figure: " + draw() + " area: " + calculateArea() +
                " color: " + findColor() + " radius: " + getRadius();
    }
}

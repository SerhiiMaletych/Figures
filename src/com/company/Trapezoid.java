package com.company;

public class Trapezoid implements Figure {
    private final double topSide = Math.random() * 100;
    private final double bottomSide = Math.random() * 100;
    private final double leftSide = Math.random() * 100;
    private final double rightSide = Math.random() * 100;
    private final double height = Math.random() * 100;


    @Override

    public String draw() {
        return "It's a trapezoid";
    }

    @Override
    public double calculateArea() {
        return (topSide + bottomSide) / 2 * height;
    }

    @Override
    public Color findColor() {
        return Color.randomColor();
    }

    public double findPerimeter() {
        return leftSide + rightSide + bottomSide + topSide;

    }
}

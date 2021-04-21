package com.company;

public class Square implements Figure {

    private final double side = Math.random() * 100;

    @Override
    public String draw() {
        return "It's a square!";
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public Color findColor() {
        return Color.randomColor();
    }

    public double findPerimeter() {
        return side * 4;
    }


}

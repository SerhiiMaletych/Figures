package com.company;

public class Square implements Figure {

    private double side;
    private double perimeter;
    @Override
    public double draw() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public Color findColor() {
        return Color.randomColor();
    }

    public double findSide() {
        side=perimeter/4;
        return side;
    }
}

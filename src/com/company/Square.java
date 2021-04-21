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
    public String findColor() {
        return null;
    }

    public double findSide() {
        side=perimeter/4;
        return side;
    }
}

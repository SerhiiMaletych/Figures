package com.company;

public class Round implements Figure {
    private double area;
    private double radius;
    private double point;


    @Override
    public double draw() {
        return point+radius;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public String findColor() {
        return null;
    }

    public int findRadius() {
        return 0;
    }
}

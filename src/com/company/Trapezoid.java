package com.company;

public class Trapezoid implements Figure {
    private double topSide;
    private double bottomSide;
    private double leftSide;
    private double rightSide;
    private double height;

    public void initVariables() {
        topSide = (int) (Math.random() * 100);
        bottomSide = (int) (Math.random() * 100);
        leftSide = (int) (Math.random() * 100);
        rightSide = (int) (Math.random() * 100);
        height = (int) (Math.random() * 100);

    }

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

    public String calculate() {
        initVariables();
        return "Figure:" + draw() + ";" + " Area:" + calculateArea() + " m2" + ";" +
                " Color:" + findColor() + ";" + " Perimeter:" + findPerimeter();
    }
}

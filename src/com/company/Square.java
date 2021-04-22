package com.company;

public class Square implements Figure {

    private double side;


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

    @Override
    public void initVariables() {
        side = (int) (Math.random() * 100);
    }

    public double findPerimeter() {
        return side * 4;
    }

    public String calculate() {
       initVariables();
        return "Figure: " + draw() + " Area: " + calculateArea() +
                " Color: " + findColor() + " Perimeter: " + findPerimeter();
    }


}

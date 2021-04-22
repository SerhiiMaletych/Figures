package com.company;


public class Round implements Figure {

    private double radius;

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

    @Override
    public void initVariables() {
        radius = (int) (Math.random() * 100);
    }


    public String calculate() {
        initVariables();
        return "Figure: " + draw() + " Area: " + calculateArea() +
                " Color: " + findColor() + " Radius: " + radius;
    }
}

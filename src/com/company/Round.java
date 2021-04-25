package com.company;


public class Round implements Figure {


    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    @Override
    public String draw() {
        return "It's a round!";
    }

    @Override
    public double calculateArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public Color findColor() {
        return Color.randomColor();
    }

    @Override
    public void initVariables() {
        radius = (int) (Math.random() * 100);
    }

    public double findDiameter() {
        return radius + radius;
    }


    public String calculate() {
        initVariables();
        return "Figure:" + draw() + ";" + " Area:" + calculateArea() + " m2;" +
                " Color:" + findColor() + ";" + " Radius:" + radius + " m;" +
                " Diameter:" + findDiameter()+ " m;";
    }
}

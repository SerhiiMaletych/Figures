package com.company;

public class Triangle implements Figure {

    private double firstLeg;
    private double secondLeg;
    private double corner;

    public Triangle() {

    }

    @Override
    public String draw() {
        return "It's a triangle!";
    }

    @Override
    public double calculateArea() {
        return (int) (0.5 * firstLeg * secondLeg * Math.sin(corner));
    }

    @Override
    public Color findColor() {
        return Color.randomColor();
    }

    @Override
    public void initVariables() {
        firstLeg = (int) (Math.random() * 100);
        secondLeg = (int) (Math.random() * 100);
        corner = (int) (Math.random() * 90);
    }

    public double findHypotenuse() {
        return (int) Math.sqrt((firstLeg * firstLeg + secondLeg * secondLeg));
    }

    public double findPerimeter() {
        return firstLeg + secondLeg + findHypotenuse();
    }

    public String calculate() {
        initVariables();
        if (Math.sin(corner) < 0) {

            return "Figure:" + draw() + " WARNING! Sinus of corner between sides a and b is negative:" +
                    " " + Math.sin(corner) + "." + " Error occurred";
        } else return
                "Figure:" + draw() + ";" + " Area:" + calculateArea() + " m2" + ";" +
                        " Color:" + findColor() + ";" + " Hypotenuse:" + findHypotenuse()
                        + ";" + " First leg: " + firstLeg + ";" + " Second leg: " + secondLeg + ";" +
                        " Perimeter: " + findPerimeter();
    }
}

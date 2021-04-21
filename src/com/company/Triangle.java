package com.company;

public class Triangle implements Figure {

    private double firstLeg;
    private double secondLeg;
    private double hypotenuse;
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

    public double findHypotenuse() {
        hypotenuse= Math.sqrt((firstLeg*firstLeg+secondLeg*secondLeg));
        return hypotenuse;
    }
}

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
    public String findColor() {
        return null;
    }

    public double findHypotenuse() {
        hypotenuse= Math.sqrt((firstLeg*firstLeg+secondLeg*secondLeg));
        return hypotenuse;
    }
}

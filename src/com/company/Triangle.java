package com.company;

public class Triangle implements Figure {

    private final double firstLeg = Math.random() * 100;
    private final double secondLeg = Math.random() * 100;
    private final double corner = Math.random() * 90;

    @Override
    public String draw() {
        return "It's a triangle";
    }

    @Override
    public double calculateArea() {
        return (0.5 * firstLeg * secondLeg * Math.sin(corner));
    }

    @Override
    public Color findColor() {
        return Color.randomColor();
    }

    public double findHypotenuse() {
        return Math.sqrt((firstLeg * firstLeg + secondLeg * secondLeg));
    }
}

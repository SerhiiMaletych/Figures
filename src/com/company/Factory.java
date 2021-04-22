package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Factory {
    Random random = new Random();
    Round round = new Round();
    Square square = new Square();
    Trapezoid trapezoid = new Trapezoid();
    Triangle triangle = new Triangle();

    public void printRandomElement() {
        ArrayList elements = new ArrayList();
        for (int i = 0; i < Math.random() * 10000; i++) {
            List <String>figures = Arrays.asList(round.calculate(),
                    square.calculate(),
                    trapezoid.calculate(),
                    triangle.calculate());

            int randomIndex = random.nextInt(figures.size());
            String randomElement =  figures.get(randomIndex);
            System.out.println(randomElement);
            elements.add(randomElement);
            System.out.println("--------------------------------------------------------------------------------");


        }
        System.out.println("Total number of figures: " +elements.size());
    }

}

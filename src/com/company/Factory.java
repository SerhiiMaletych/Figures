package com.company;

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
        for(int i=0;i<100;i++){
        List figure = Arrays.asList(round.calculate(),
                square.calculate(),
                trapezoid.calculate(),
                triangle.calculate());
        int randomIndex = random.nextInt(figure.size());
        String randomElement = (String) figure.get(randomIndex);
        System.out.println(randomElement);
    }
        }

}

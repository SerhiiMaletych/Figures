package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList figures = new ArrayList();
        Round round = new Round();
//        String[]round1 = {String.valueOf(round.calculateArea()), String.valueOf(round.getRadius()),
//                round.draw(), String.valueOf(round.findColor())};
//        System.out.print(Arrays.toString(round1));
//        for(int i=0;i<(int)(Math.random()*100);i++) {
//            figures.add(Arrays.asList(round1));
//
//        }
//        System.out.print(figures);
        String round2 = round.toString();
        System.out.println(round2);
        for (int i = 0; i<((int) (Math.random() * 100)); i++){
            figures.add(round2);
            System.out.println(figures);
        }
    }

}

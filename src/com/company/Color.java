package com.company;

import java.util.Random;

public enum Color {
    WHITE, GREY, YELLOW, ORANGE, RED, GREEN, PINK, PURPLE, BLUE, BROWN, BLACK;

    public static Color randomColor() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}

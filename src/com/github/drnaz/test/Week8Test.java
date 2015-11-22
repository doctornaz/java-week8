package com.github.drnaz.test;

import com.github.drnaz.Week8;

/**
 * Created by Jorge Sarmiento on 11/21/2015.
 */

public class Week8Test {

    public static void main(String[] args) {
        System.out.println(Week8.validate( //PRUEBA DIAGONAL /
                new String[]{"73 32 31 66 10", "64 7 8 9 21", "12 12 13 14 39", "13 17 18 33 41", "26 22 23 24 5"},
                new int[]{4, 21, 1, 3, 5, 9, 7, 8, 6, 11, 21, 16, 2, 14, 24, 19, 24, 73, 13, 20, 26, 17, 10}));
        System.out.println(Week8.validate( // PRUEBA DIAGONAL \
                new String[]{"73 32 31 66 10", "64 7 8 9 21", "12 12 13 14 39", "13 17 18 33 41", "26 22 23 24 5"},
                new int[]{4, 21, 1, 3, 5, 9, 7, 8, 6, 11, 21, 16, 2, 14, 24, 19, 24, 73, 13, 20,26,17,10,33}));
        System.out.println(Week8.validate( //PRUEBA HORIZONTAL
                new String[]{"1 32 31 66 10", "2 7 8 9 21", "3 12 13 14 39", "4 17 18 33  41", "5 22 23 24 27"},
                new int[]{4, 21, 1, 3, 5, 9, 7, 8, 6, 11, 21, 16, 2, 14, 24, 19, 24, 73, 13, 20,26,17,10}));
        System.out.println(Week8.validate(// PRUEBA VERTICAL
                new String[]{"1 60 30 80 90", "2 40 50 9 21", "3 12 70 14 39", "4 17 80 33 41", "5 22 90 24 6"},
                new int[]{4, 21, 1, 3, 5, 9, 7, 8, 6, 11, 21, 16, 2, 14, 24, 19, 24, 73, 13, 20,26,17,10}));
        System.out.println(Week8.validate( // PRUEBA DE 3x3
                new String[]{"80 60 3", "110 2 80", "1 100 770"},
                new int[]{4, 21, 1, 3, 5, 9, 7, 8, 6, 11, 21, 16, 2, 14, 24, 19, 24, 73, 13, 20,26,17,10}));


        System.out.println(Week8.calculate(new int[]{1,2,3,4,5,6,7,8}, 7));
        System.out.println(Week8.calculate(new int[]{1,2,3,4,5,6,7,8}, 8));
        System.out.println(Week8.calculate(new int[]{1,2,3,4,5,6,7,8}, 14));
        System.out.println(Week8.calculate(new int[]{1,2,3,4,5,6,7,8}, 36));
        System.out.println(Week8.calculate(new int[]{2,4,6,8,10}, 15));
        System.out.println(Week8.calculate(new int[]{2,4,6,8,10}, 16));

    }
}

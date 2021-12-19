package com.company;

public class Zhaika {
    public void countX() {
        int count = 0;
        int [][] array = new int[36][40];
        for (int i = 0; i < 36; i++) {
            for (int j = 0; j < 40; j++) {
                array[i][j] = i;
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
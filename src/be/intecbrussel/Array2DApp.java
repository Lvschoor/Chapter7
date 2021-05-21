package be.intecbrussel;

public class Array2DApp {

    public static void main(String[] args) {
        //build 2D array with int values
        int[][] table = new int[4][6];
        //fill the "cells" of the 2D array with the product of row number and column number
        for (int i =0; i<table.length; i++) {
            for (int j =0; j< table[i].length;j++) {
                table[i][j] = (i+1) * (j+1);
            }
        }

        //print out the table
        for (int[] row : table) {
            for (int cel : row) {
                System.out.printf("%2d %c",cel,' ');
            }
            System.out.println(" ");
        }

    }
}

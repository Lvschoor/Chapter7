package be.intecbrussel;

import java.util.Arrays;

public class SortingApp {

    public static void main(String[] args) {
        // declare and initialize the array to sort
        int[] listOfNumbers = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        //declare an array and a boolean used in the algorithm
        int[] listOfNumbersTest;
        boolean sorted = false;
        //print the array to be sorted
        System.out.println(Arrays.toString(listOfNumbers));
        //sort the array
        while (!sorted) {
            listOfNumbersTest = listOfNumbers.clone();

            for (int i = 0; i < listOfNumbers.length - 1; i++) {
                if (listOfNumbers[i] > listOfNumbers[i + 1]) {
                    int temp = listOfNumbers[i];
                    listOfNumbers[i] = listOfNumbers[i + 1];
                    listOfNumbers[i + 1] = temp;
                }
            }
            if (Arrays.equals(listOfNumbers, listOfNumbersTest)) {
                sorted = true;
            }
        }
        //print the sorted array
        System.out.println("Sorted: ");
        System.out.println(Arrays.toString(listOfNumbers));
    }
}

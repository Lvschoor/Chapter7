package be.intecbrussel;

import java.util.Scanner;

public class LookupTablesApp {

    public static void main(String[] args) {
        //create an array with the scrabble values of the letters of the alphabet
        int[] valueOfLetters = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
        //initialize the variable sum; used to calculate the total value of the word
        int sum=0;
        //input of the word
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = kbd.nextLine();
        //put the word in uppercase to allow easy conversion from letter to value
        word = word.toUpperCase();
        // create an array of chars from the given String
        char[] letters = word.toCharArray();
        //add the value of each char in the string to sum
        for (char letter:letters){
            sum = sum +valueOfLetters[letter-65];
        }
        //print the result
        System.out.println("Scrabble word value for "+word + " is: "+sum);
    }
}

package be.intecbrussel;

import java.util.Scanner;

public class ArrayOfObjectsApp {

    public static void main(String[] args) {
        //read the sentence to be handled as a String
        Scanner kbd = new Scanner(System.in);
        System.out.print("Give a sentence: ");
        String text = kbd.nextLine();
        //if the sentence end with ".", remove the .
        //this could be extended to other punctuation marks
        if (text.endsWith(".")){
            text = text.substring(0,text.length()-1);
        }
        //create an array of Strings by splitting the text String at every space
        String[] words = text.split(" ");
        //print the individual words
        System.out.println("Find below the words that made your sentence:");
        for (String word:words){
            System.out.println(word);
        }

    }
}

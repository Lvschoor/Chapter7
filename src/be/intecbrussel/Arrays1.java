package be.intecbrussel;

public class Arrays1 {

    public static void main(String[] args) {

            //create an array of 20 int values
            int[] numbers = new int[20];
            //fill the array with multiples of 7
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = (i+1) * 7;
            }
            //print the values of this array with for-each loop
            System.out.println("First 20 multiples of 7:");
            for(int n:numbers){
                System.out.println(n);
            }
            //print the values of this array in reversed order using normal for loop
            System.out.println("First 20 multiples of 7 in reversed order:");

            for (int i = numbers.length-1;i>=0;i--){
                System.out.println(numbers[i]);
            }
            //create an array of boolean values
            boolean[] booleans = {true, true, false, true, false};
            //print the values of this array using a for-each loop
            System.out.println("A list of boolean values that was stored in an array");
            for (boolean b: booleans){
                System.out.println(b);
            }

        }
    }


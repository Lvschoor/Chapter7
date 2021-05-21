package be.intecbrussel;

public class PrimesWithArraysOnlyDivideByPrimes {


    //WORK IN PROGRESS

    public static void main(String[] args) {
        // Declare array to store primes
        int[] primes = new int[168];
        // Since all prime numbers are odd except 2, we take them out of the "loop"
        System.out.println('2');
        primes[0]= 2;
        // Initialize count of prime numbers
        int counter = 1;
        // Loop from number 3 till 999, as 1000 is even -> no prime
        //Increment is 2 as only odd numbers are tested
        for (int number = 3; number < 1000; number += 2) {
            // Initialize the flag
            boolean prime = true;
            // Loop through numbers starting with 2 and ending at Sqrt number to test the numbers
            for (int i = 0; primes[i]* primes[i] <= number; i++) {
                if (number % primes[i] == 0) {
                    prime = false;
                    break; // as soon as we find a divider we can skip the rest of the loop
                }
            }
            // Output all the prime numbers, put the value in the array and increment the counter
            if (prime) {
                System.out.println(number);
                primes[counter]=number;
                counter++;
            }
        }
        // Output the counter
        System.out.println("Total prime numbers smaller than 1000 is: " + counter);
        for (int p: primes){
            System.out.println(p);
        }
    }
}

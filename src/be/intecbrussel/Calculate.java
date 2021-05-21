package be.intecbrussel;

public class Calculate {

    public static void main(String[] args) {

        //call the Statistics utility class with the different methods
        System.out.println("The average value of the given numbers: "+Statistics.average(4, 6, 7));
        System.out.println("The minimum value of the given numbers: "+Statistics.min(4,6,2,8));
        System.out.println("The maximum value of the given numbers: "+Statistics.max(4,8,2,6,10));

    }
}

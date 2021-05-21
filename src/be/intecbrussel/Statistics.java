package be.intecbrussel;

public class Statistics {

    //compiler creates the arrays

    //method to calculate min value given values
    public static int min(int... values) {
        int min=values[0];
        for (int i=1;i< values.length;i++) {
            if (values[i]<min){
                min=values[i];
            }
        }
        return min;
    }
    //method to calculate max value of given values
    public static int max(int... values) {
        int max=values[0];
        for (int i=1;i< values.length;i++) {
            if (values[i]>max){
                max=values[i];
            }
        }
        return max;
    }

    public static float average(int... values) {
        float total = 0;
        float avg = 0;
        for (int el : values) {
            total += el;
        }
        if (values.length != 0) {
            avg = total / values.length;
        }
        return avg;
    }
}

package org.example.course.loops.whileLoop;


public class WhileLoop {

    public static double arraySumme(double[] arr) {
        double sum = 0.0;
        int a = 0;

        while (a < arr.length) {
            sum += arr[a];
            a++;
        }

        return sum;
    }

    public static void main(String[] args) {
        double[] numbers = {7.5, 8.5, 9.5, 10.5};
        double sum = arraySumme(numbers);
        System.out.println("Die Summe der Zahlen im Array beträgt: " + sum);
    }

}





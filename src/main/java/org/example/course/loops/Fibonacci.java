package org.example.course.loops;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n<0) {
            throw new IllegalArgumentException("Die Fibonacci Zahl ist für negative Zahlen nicht definiert");
        }

        if(n < 2){
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static void main(String[] args) {
        int result1 = fibonacci(0);
        int result2 = fibonacci(1);
        int result3 = fibonacci(7);
        int result4 = fibonacci(9);

        System.out.println("Fibonacci Zahl von 0: " + result1);
        System.out.println("Fibonacci Zahl von 1: " + result2);
        System.out.println("Fibonacci Zahl von 7: " + result3);
        System.out.println("Fibonacci Zahl von 9: " + result4);
    }
}

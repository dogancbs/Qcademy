package org.example.course.loops.whileLoop;

public class Primenummer {

        public static void primeNumbers(int n) {
            System.out.println("Primzahlen bis " + n + ":");

            int number = 2;
            while (number <= n) {
                if (isPrime(number)) {
                    System.out.print(number + " ");
                }
                number++;
            }

            System.out.println();
        }

        public static boolean isPrime(int number) {
            if (number < 2) {  //weil die kleinste Primzahl 2 ist.
                return false;
            }

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            int n = 45;
            primeNumbers(n);
        }
}


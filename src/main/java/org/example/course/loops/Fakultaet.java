package org.example.course.loops;

public class Fakultaet {
    public static int fakultaet(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Die Fakultaet ist für negative Zahlen nicht definiert");
        }

        int fakultaetWert = 1;

        for (int i = 1; i <= n; i++) {
            fakultaetWert *= i;
        }

        return fakultaetWert;

    }

    public static void main(String[] args) {
        int result1 = fakultaet(6);
        int result2 = fakultaet(8);
        int result3 = fakultaet(10);

        System.out.println("Fakultaet von 6: " + result1);
        System.out.println("Fakultaet von 8: " + result2);
        System.out.println("Fakultaet von 10: " + result3);
    }
}

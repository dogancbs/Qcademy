package org.example.course.loops;

public class FakultaetBerechnung {
    public static int fakultaet(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fakultaet(n - 1);
        }
    }

    public static void main(String[] args) {
        // Testen der fakultaet-Methode
        int zahl1 = 5;
        int zahl2 = 0;
        int zahl3 = 10;

        int ergebnis1 = fakultaet(zahl1);
        int ergebnis2 = fakultaet(zahl2);
        int ergebnis3 = fakultaet(zahl3);

        System.out.println(zahl1 + "! = " + ergebnis1);
        System.out.println(zahl2 + "! = " + ergebnis2);
        System.out.println(zahl3 + "! = " + ergebnis3);
    }
}

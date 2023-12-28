package org.example.course.oop;

public class AppPunkt {
    public static void main(String[] args) {
        Punkt punkt1 = new Punkt(2,4);

        System.out.println("Koordinaten von Punkt 1: " + punkt1.toString());
        System.out.println("Abstand von Punkt 1 zum Ursprung: " + punkt1.abstandZumUrsprung());
        System.out.println("Spiegelung von Punkt 1 an der X-Achse: " + punkt1.spiegelungAnX());
        System.out.println("Spiegelung von Punkt 1 an der Y-Achse: " + punkt1.spiegelungAnY());
        System.out.println("Spiegelung von Punkt 1 am Ursprung: " + punkt1.spiegelungAmUrsprung());

        Punkt punkt2 = new Punkt(4,8);
        System.out.println("Abstand von Punkt 1 zu Punkt 2: " + punkt1.abstandZuPunkt(punkt2));
    }
}

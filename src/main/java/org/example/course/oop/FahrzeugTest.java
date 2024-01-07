package org.example.course.oop;

public class FahrzeugTest {
    public static void main(String[] args) {
        Fahrrad fahrrad1 = new Fahrrad();
        fahrrad1.setzeGeschwindigkeit(20);
        fahrrad1.bewege(25);
        System.out.println("Position von Fahrrad1: " + fahrrad1.getPosition() + " km");
        System.out.println("Anzahl von Räder: " + fahrrad1.getAnzahlRäder() + " Stück");

        Car car1 = new Car();
        car1.setzeGeschwindigkeit(115);
        car1.bewege(30);
        System.out.println("Position von Car1: " + car1.getPosition() + " km");
        System.out.println("Anzahl von Räder: " + car1.getAnzahlRäder() + " Stück");

        Rennwagen rennwagen1 = new Rennwagen();
        rennwagen1.setzeGeschwindigkeit(188);
        rennwagen1.bewege(45);
        System.out.println("Position von Rennwagen1: " + rennwagen1.getPosition() + " km");
        System.out.println("Anzahl von Räder: " + rennwagen1.getAnzahlRäder() + " Stück");

        Krankenwagen krankenwagen1 = new Krankenwagen();
        krankenwagen1.setzeGeschwindigkeit(80);
        krankenwagen1.bewege(10);
        krankenwagen1.schalteBlaulicht(true);
        System.out.println("Position von Krankenwagen1: " + krankenwagen1.getPosition() + " km");
        System.out.println("Blaulicht angeschaltet? " + krankenwagen1.isBlaulichtAn());
    }
}

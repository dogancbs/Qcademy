package org.example.course.oop;

public class Fahrrad extends Fahrzeug {

    @Override
    public double getMaxGeschwindigkeit() {
        return 30;
    }

    @Override
    public int getAnzahlRäder() {
        return 2;
    }
}

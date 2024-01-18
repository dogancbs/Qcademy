package org.example.course.oop;

public class Car extends Fahrzeug {

    @Override
    public double getMaxGeschwindigkeit() {
        return 140;
    }

    @Override
    public int getAnzahlRäder() {
        return 4;
    }
}

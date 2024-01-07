package org.example.course.oop;

public abstract class Fahrzeug {
    private double position;
    private double geschwindigkeit;

    public Fahrzeug() {
        this.position = 0;
        this.geschwindigkeit = 0;
    }

    public void bewege(double zeitInMinuten) {
        this.position += (this.geschwindigkeit / 60) * zeitInMinuten;
    }
    public void setzeGeschwindigkeit(double neueGeschwindigkeit) {
        this.geschwindigkeit = Math.min(neueGeschwindigkeit, getMaxGeschwindigkeit());
    }
    public abstract double getMaxGeschwindigkeit();
    public int getAnzahlRäder() {
        return 0;
    }

    public double getPosition() {
        return position;
    }
}

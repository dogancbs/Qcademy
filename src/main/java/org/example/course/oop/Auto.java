package org.example.course.oop;

public class Auto {
    private String kennzeichen;
    private double kilometerstand;
    private double tankvolumen;
    private double kraftstoffverbrauch;
    private double kraftstoffmenge;

    public Auto () {
        this.kennzeichen = "";
        this.kilometerstand = 0.0;
        this.tankvolumen = 0.0;
        this.kraftstoffverbrauch = 0.0;
        this.kraftstoffmenge = 0.0;
    }

public Auto(String kennzeichen, double kilometerstand, double tankvolumen, double kraftstoffverbrauch, double kraftstoffmenge) {

    this.kennzeichen = kennzeichen;
    this.kilometerstand = kilometerstand;
    this.tankvolumen = tankvolumen;
    this.kraftstoffverbrauch = kraftstoffverbrauch;
    this.kraftstoffmenge = kraftstoffmenge;
}
public void tanken(double menge) {
    this.kraftstoffmenge += menge;
}
public void fahren(double strecke) {
    this.kilometerstand += strecke;
}
public String getKennzeichen() {
    return kennzeichen;
}
public double getKilometerstand() {
    return kilometerstand;
}
public double getTankvolumen() {
    return tankvolumen;
}
}

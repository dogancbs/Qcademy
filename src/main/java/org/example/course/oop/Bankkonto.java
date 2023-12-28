package org.example.course.oop;

public class Bankkonto {
    private String vorname;
    private String nachname;
    private String kontonummer;
    private double kontostand;
    private double limit;

    public Bankkonto(String vorname, String nachname, String kontonummer, double kontostand, double limit) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
        this.limit = limit;
    }

    public  void einzahlen(double betrag) {
        if (betrag > 0) {
            this.kontostand += betrag;
            System.out.println("Einzahlung erfolgreich. Neuer Kontostand: " + this.kontostand);
        } else {
            System.out.println("Ungültiger Betrag für Einzahlung.");
        }
    }

    public double kontostandAbfragen() {
        return this.kontostand;
    }

    public String toString() {
        return "Kontoinhaber: " + this.vorname + " " + this.nachname + " Kontonummer: " + this.kontonummer + " Kontostand: " + this.kontostand + " Euro";
    }
    public void auszahlen(double betrag) {
        double möglicherBetrag = this.kontostand + this.limit;
        if (betrag > 0 && betrag <= möglicherBetrag) {
            this.kontostand -= betrag;
            System.out.println("Auszahlung erfolgreich. Neuer Kontozustand: " + this.kontostand);
        } else {
            System.out.println("Auszahlung nicht möglich");
        }
    }

}

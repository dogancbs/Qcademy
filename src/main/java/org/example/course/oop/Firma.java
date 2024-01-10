package org.example.course.oop;

import java.util.ArrayList;

public class Firma {
    private String name;
    private String adresse;
    private int anzahlRaeume;
    private int maxRaeume;
    private ArrayList<Integer> raumGroessen;
    private ArrayList<Boolean> raumGebucht;

    public Firma(String name, String adresse, int anzahlRaeume, int maxRaeume) {
        this.name = name;
        this.adresse = adresse;
        this.anzahlRaeume = anzahlRaeume;
        this.maxRaeume = maxRaeume;
        this.raumGroessen = new ArrayList<>();
        this.raumGebucht = new ArrayList<>();
    }

    public void fuegeRaumHinzu(int plaetze) {
        if (anzahlRaeume < maxRaeume) {
            raumGroessen.add(plaetze);
            raumGebucht.add(false);
            anzahlRaeume++;
        } else {
            System.out.println("Maximale Anzahl an Räumen erreicht!");
        }
    }

    public int sucheRaum(int plaetze) {
        for (int i = 0; i < anzahlRaeume; i++) {
            if (!raumGebucht.get(i) && raumGroessen.get(i) >= plaetze) {
                raumGebucht.set(i, true);
                return i + 1;
            }
        }
        return -1;
    }

    public int anzahlFrei() {
        int frei = 0;
        for (boolean gebucht : raumGebucht) {
            if (!gebucht) {
                frei++;
            }
        }
        return frei;
    }

    public String getName() {
        return name;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getAnzahlRaeume() {
        return anzahlRaeume;
    }

    public int getMaxRaeume() {
        return maxRaeume;
    }
}


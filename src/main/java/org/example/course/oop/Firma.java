package org.example.course.oop;

import java.util.ArrayList;

public class Firma {
    private String name;
    private String adresse;
    private int anzahlRäume;
    private int maxRäume;
    private ArrayList<Integer> raumGrössen;
    private ArrayList<Boolean> raumGebucht;

    public Firma(String name, String adresse, int anzahlRäume, int maxRäume) {
      this.name = name;
      this.adresse = adresse;
      this.anzahlRäume = anzahlRäume;
      this.maxRäume = maxRäume;
      this.raumGrössen = new ArrayList<>();
      this.raumGebucht = new ArrayList<>();
    }

    public void fuegeRaumHinzu(int plaetze) {
        if (anzahlRäume < maxRäume) {
            raumGrössen.add(plaetze);
            raumGebucht.add(false);
            anzahlRäume++;
        } else {
            System.out.println("Maximale Anzahl an Räumen erreicht!");
        }
    }

    public int sucheRaum(int plaetze) {
        for (int i = 0; i < anzahlRäume; i++) {
            if (!raumGebucht.get(i) && raumGrössen.get(i) >= plaetze) {
              raumGebucht.set(i, true);
              return i+1;
            }
        }
        return -1;
    }

    public int anzahlFrei() {
        int frei = 0;
        for (boolean gebucht : raumGebucht) {
            if (!gebucht) {
                frei ++;
            }
        }
        return frei;
    }

    //Alle Attribute müssen gelesen werden können.

    public String getName() {
        return name;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getAnzahlRäume() {
        return anzahlRäume;
    }

    public int getMaxRäume() {
        return maxRäume;
    }

}

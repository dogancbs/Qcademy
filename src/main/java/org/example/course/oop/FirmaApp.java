package org.example.course.oop;

public class FirmaApp {
    public static void main(String[] args) {
        Firma firma = new Firma("Siemens", "Siemensstraße 90", 0, 3);

        firma.fuegeRaumHinzu(22);
        firma.fuegeRaumHinzu(17);
        firma.fuegeRaumHinzu(32);

        int gesuchtePlaetze = 25;
        int raumNummer = firma.sucheRaum(gesuchtePlaetze);
        if (raumNummer != -1) {
            System.out.println("Gefunden: Raum " + raumNummer + " mit " + gesuchtePlaetze + " Plätzen.");
        } else {
            System.out.println("Kein passender Raum gefunden.");
        }

        int freieRaeume = firma.anzahlFrei();
        System.out.println("Anzahl freier Räume: " + freieRaeume);

        System.out.println("Name: " + firma.getName());
        System.out.println("Adresse: " + firma.getAdresse());
        System.out.println("Anzahl Räume: " + firma.getAnzahlRaeume());
        System.out.println("Maximale Anzahl Räume: " + firma.getMaxRaeume());
    }
}


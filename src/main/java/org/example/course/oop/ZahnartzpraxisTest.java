package org.example.course.oop;

public class ZahnartzpraxisTest {
    public static void main(String[] args) {

        Krankenkasse krankenkasse1 = new Krankenkasse("Wgkk", 1);
        KassenPatient kassenPatient1 = new KassenPatient(1, "Stefan Weber", "Forsthausgasse 23", "01.08.1982", "Stefan Weber", true, krankenkasse1);

        Krankenkasse krankenkasse2 = new Krankenkasse("Sgkk", 2);
        KassenPatient kassenPatient2 = new KassenPatient(2, "Alisa Steiger", "Leystraße 96", "05.12.1990", "Alisa Steiger", true, krankenkasse2);

        System.out.println("Patient 1: " + kassenPatient1.getPatientenname() + ", Krankenkasse: " + kassenPatient1.getKrankenkasse().getKassenname());
        System.out.println("Patient 2: " + kassenPatient2.getPatientenname() + ", Krankenkasse: " + kassenPatient2.getKrankenkasse().getKassenname());

    }
}

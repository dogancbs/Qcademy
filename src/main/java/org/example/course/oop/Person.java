package org.example.course.oop;

import java.time.LocalDate;

public class Person {

    public static int mindestGeburtsJahr = 1990;

    private String vorname;
    private String nachname;
    private double gewicht;
    private LocalDate geburtsDatum;

    Person(String vorname, String nachname, LocalDate geburtsDatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
    }


    public int alter() {
        int jetzigesJahr = LocalDate.now().getYear();
        int geburtsJahr = geburtsDatum.getYear();
        return jetzigesJahr - geburtsJahr;
    }

    public void zunehmen(double kg) {
        gewicht += kg;
    }

    public void abnehmen(double kg) {
        gewicht -= kg;
    }
}

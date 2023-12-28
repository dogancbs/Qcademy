package org.example.course.oop;

import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
    private List<Buch> buchliste;

    public Bibliothek() {
        buchliste = new ArrayList<>();
    }
    public void buchHinzufuegen(Buch buch) {
        buchliste.add(buch);
    }

}

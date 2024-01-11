package org.example.course.oop;

import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
    private List<Buch> buchlist;

    public  Bibliothek() {
        this.buchlist = new ArrayList<>();
    }
    public void buchHinzufuegen(Buch buch) {
        buchlist.add(buch);
        System.out.println("Buch " + buch.getTitel() + " wurde hinzugefügt");
    }
    public void buchAusleihen(Buch buch) {
        if (buchlist.contains(buch)) {
            buchlist.remove(buch);
            System.out.println("Buch " + buch.getTitel() + " wurde ausgeliehen");
        } else {
            System.out.println("Das Buch ist nicht in der Bibliothek vorhanden.");
        }
    }
    public void buchZurueckgeben(Buch buch) {
        buchlist.add(buch);
        System.out.println("Buch " + buch.getTitel() + "wurde zurückgegeben");
    }
    public void buchLoeschen(Buch buch) {
        buchlist.remove(buch);
        System.out.println("Buch " + buch.getTitel() + "wurde gelöscht");
    }

    public List<Buch> getBuchlist() {
        return buchlist;
    }
}

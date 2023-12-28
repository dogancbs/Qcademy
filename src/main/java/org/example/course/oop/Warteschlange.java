package org.example.course.oop;

import java.util.LinkedList;

public class Warteschlange {
    private LinkedList<Autos> wartendeAutos;
    private static final int MaxAutos = 10;
    public Warteschlange() {
        this.wartendeAutos = new LinkedList<>();
    }

    public void autoHinzufuegen(Autos autos) {
        if (wartendeAutos.size() < MaxAutos) {
            wartendeAutos.addLast(autos);
        }
    }
    public void autoVerlassen(Autos autos) {
        wartendeAutos.remove(autos);
    }

    public void einfahrtErlaubt() {
        if (!wartendeAutos.isEmpty()) {
            Autos erstesAuto = wartendeAutos.getFirst();
            erstesAuto.setDarfEinfahren(true);
            wartendeAutos.removeFirst();
        }
    }
    public LinkedList<Autos> getWartendeAutos() {
        return wartendeAutos;
    }
}

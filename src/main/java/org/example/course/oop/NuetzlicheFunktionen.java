package org.example.course.oop;

public class NuetzlicheFunktionen {

    public static Vergleichbar kleinstesElement(Vergleichbar[] elemente) {
        Vergleichbar kleinster = elemente[0];
        for (int i = 1; i<elemente.length; i++) {
            if (elemente[i].vergleichenMit(kleinster) == -1) {
                kleinster = elemente[i];
            }
        }
        return kleinster;
    }
}

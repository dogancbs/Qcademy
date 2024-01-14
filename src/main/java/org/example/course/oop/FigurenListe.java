package org.example.course.oop;

public class FigurenListe <A extends Figur> {
    private A[] figurenListe;

    public FigurenListe(int maxSize) {
        figurenListe = (A[]) new Figur[maxSize];
    }
    public void figurAnfuegen(A figur) {
        for (int i = 0; i < figurenListe.length; i++) {
            if (figurenListe[i] == null) {
                figurenListe[i] = figur;
                break;
            }
        }
    }
    public A letzteFigurAuslesen() {
        for (int i = figurenListe.length -1; i>=0; i--) {
            if (figurenListe[i] != null) {
                return figurenListe[i];
            }
        }
        return null;
    }
    public void alleAnzeigen() {
        for (A figur : figurenListe) {
            if (figur != null) {
                figur.anzeigen();
            }
        }
    }
}

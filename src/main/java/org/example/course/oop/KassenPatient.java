package org.example.course.oop;

public class KassenPatient {
    private int patientenNummer;
    private String patientenname;
    private String adresse;
    private String geburtsdatum;
    private String versichertenname;
    private boolean versichertenKarteVorgelegt;
    private Krankenkasse krankenkasse;

    public KassenPatient(int patientenNummer, String patientenname, String adresse, String geburtsdatum, String versichertenname, boolean versichertenKarteVorgelegt, Krankenkasse krankenkasse) {
        this.patientenNummer = patientenNummer;
        this.patientenname = patientenname;
        this.adresse = adresse;
        this.geburtsdatum = geburtsdatum;
        this.versichertenname = patientenname;
        this.versichertenKarteVorgelegt = true;
        this.krankenkasse = krankenkasse;
    }

    public int getPatientenNummer() {
        return patientenNummer;
    }

    public void setPatientenNummer(int patientenNummer) {
        this.patientenNummer = patientenNummer;
    }

    public String getPatientenname() {
        return patientenname;
    }

    public void setPatientenname(String patientenname) {
        this.patientenname = patientenname;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getVersichertenname() {
        return versichertenname;
    }

    public void setVersichertenname(String versichertenname) {
        this.versichertenname = versichertenname;
    }

    public boolean isVersichertenKarteVorgelegt() {
        return versichertenKarteVorgelegt;
    }

    public void setVersichertenKarteVorgelegt(boolean versichertenKarteVorgelegt) {
        this.versichertenKarteVorgelegt = versichertenKarteVorgelegt;
    }

    public Krankenkasse getKrankenkasse() {
        return krankenkasse;
    }

    public void setKrankenkasse(Krankenkasse krankenkasse) {
        this.krankenkasse = krankenkasse;
    }
}

package org.example.course.oop;

public class Krankenkasse {
    private String kassenname;
    private int kassennummer;

    public Krankenkasse(String kassenname, int kassennummer) {
        this.kassenname = kassenname;
        this.kassennummer = kassennummer;
    }

    public String getKassenname() {
        return kassenname;
    }

    public void setKassenname(String kassenname) {
        this.kassenname = kassenname;
    }

    public int getKassennummer() {
        return kassennummer;
    }

    public void setKassennummer(int kassennummer) {
        this.kassennummer = kassennummer;
    }
}

package org.example.course.oop;

public class Autos {
    private String kennzeichen;
    private String farbe;
    private String modell;
    private String fahrer;
    private boolean darfEinfahren;

    public Autos(String kennzeichen, String farbe, String modell, String fahrer) {
        this.kennzeichen = kennzeichen;
        this.farbe = farbe;
        this.modell= modell;
        this.fahrer = fahrer;
        this.darfEinfahren = false;
    }
    public Autos() {
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public void setFahrer(String fahrer) {
        this.fahrer = fahrer;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }
    public String getFarbe() {
        return farbe;
    }
    public String getModell() {
        return modell;
    }
    public String getFahrer() {
        return fahrer;
    }
    public boolean isDarfEinfahren() {
        return darfEinfahren;
    }

    public void setDarfEinfahren(boolean darfEinfahren) {
        this.darfEinfahren = darfEinfahren;
    }
}

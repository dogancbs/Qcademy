package org.example.course.oop;

public class Radio {
    private boolean eingeschaltet;
    private int lautstärke;
    private double frequenz;

    public Radio(boolean istAn, int lautstärke, double frequenz) {
        this.eingeschaltet = istAn;
        this.lautstärke = lautstärke;
        if (frequenz >= 85.0 && frequenz <= 110.0) {
            this.frequenz = frequenz;
        } else {
            this.frequenz = 99.0;

                }
            }

    public void lauter() {
        if (eingeschaltet && lautstärke < 10) {
            lautstärke++;

        }
    }

    public void leiser() {
        if (eingeschaltet && lautstärke > 0) {
            lautstärke--;
        }
    }

    public void an() {
        eingeschaltet = true;
    }
    public void aus() {
        eingeschaltet = false;
    }
    public void wähleSender(double frequenz) {
        if (frequenz >= 85.0 && frequenz <= 110.0) {
            this.frequenz = frequenz;
        } else {
            this.frequenz = 99.9;
        }
    }
    public String toString() {
        return "Radio an: " + eingeschaltet + " Freq: " + frequenz + " Laut: " + lautstärke;
    }
}

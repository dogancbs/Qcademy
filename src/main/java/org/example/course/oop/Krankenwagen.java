package org.example.course.oop;

public class Krankenwagen extends Car  {
    private boolean blaulichtAn;

    public void schalteBlaulicht(boolean an) {
        this.blaulichtAn = an;
    }

    public boolean isBlaulichtAn() {
        return blaulichtAn;
    }
}

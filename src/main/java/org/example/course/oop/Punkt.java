package org.example.course.oop;

public class Punkt {
    private double x;
    private double y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX(){
      return this.x;
    }
    public double getY(){
        return this.y;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }

    public double abstandZumUrsprung(){
        return Math.sqrt(x * x + y * y);
    }

    public Punkt spiegelungAnX() {
        return new Punkt(x, -y);
    }

    public Punkt spiegelungAnY() {
        return new Punkt(-x, y);
    }

    public Punkt spiegelungAmUrsprung() {
        return new Punkt(-x, -y);
    }

    public double abstandZuPunkt(Punkt andererPunkt) {
        double deltaX = x - andererPunkt.getX();
        double deltaY = y - andererPunkt.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}

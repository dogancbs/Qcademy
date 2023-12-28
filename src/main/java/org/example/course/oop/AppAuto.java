package org.example.course.oop;

public class AppAuto {
    public static void main(String[] args) {
        Auto auto1 = new Auto("W2344H", 10000, 50, 6, 30);
        Auto auto2 = new Auto("D43444L", 20000, 60, 7, 20);

        auto1.tanken(30);
        auto1.fahren(200);
        System.out.println("Auto1 - Kennzeichen: " + auto1.getKennzeichen() + ", Auto1 - Kilometerstand: " + auto1.getKilometerstand() + ", Auto1 - Tankvolumen: " + auto1.getTankvolumen());

        auto2.tanken(40);
        auto2.fahren(300);
        System.out.println("Auto2 - Kennzeichen: " + auto2.getKennzeichen() + ", Auto2 - Kilometerstand: " + auto2.getKilometerstand() + ", Auto2 - Tankvolumen: " + auto2.getTankvolumen());

    }
}

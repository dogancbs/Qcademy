package org.example.course.oop;

public class MainBankkonto {
    public static void main(String[] args) {
        Bankkonto konto1 = new Bankkonto("Dogan", "Cabas", "AT123456789", 500000,20000);
        System.out.println(konto1);
        konto1.einzahlen(2000);
        konto1.auszahlen(1000);

        double kontostand = konto1.kontostandAbfragen();
        System.out.println("Aktueller Kontostand: " + kontostand);
    }
}

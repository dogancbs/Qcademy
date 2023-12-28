package org.example.course.oop;

public class AppBuch {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Stephan King");
        autor1.setSynonym("S. K.");
        autor1.setGage(1600);

        Autor autor2 = new Autor("Stephenie Meyer");
        autor2.setSynonym("S. M.");
        autor2.setGage(1800);

        Autor autor3 = new Autor("Ken Follett");
        autor3.setSynonym("K. F.");
        autor3.setGage(1900);

        Buch buch1 = new Buch("Achterbahn", "569-412-6-45451-1", autor1);
        buch1.setPreis(20);

        Buch buch2 = new Buch("Amanecer", "415-895-3-78452-1", autor2);
        buch2.setPreis(25);

        Buch buch3 = new Buch("Bear Raid", "125-745-5-65231-0", autor3);
        buch3.setPreis(28);

        System.out.println(buch1.toString());
        System.out.println(buch2.toString());
        System.out.println(buch3.toString());
    }
}

package org.example.course.oop;

import java.util.Scanner;

public class AppBuchErweitert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Autor autor = createAutorFromConsole(scanner);
        System.out.println("Geben Sie den Titel des Buchs ein: ");
        String titel = scanner.nextLine();

        System.out.println("Geben Sie den Isbn des Buchs ein: ");
        String isbn = scanner.nextLine();

        Buch buch = new Buch(titel, isbn, autor);

        System.out.println("Buch: " + buch.toString() + " erzeugt");
    }

    private static Autor createAutorFromConsole(Scanner scanner) {
        System.out.println("Geben Sie den Namen des Autors ein: ");
        String name = scanner.nextLine();

        Autor autor = new Autor(name);
        System.out.println("Geben Sie das Synonym des Autors ein: ");
        String synonym = scanner.nextLine();
        autor.setSynonym(synonym);

        System.out.println("Geben Sie die Gage des Autors ein: ");
        double gage = scanner.nextDouble();
        autor.setGage(gage);
        return autor;
    }
}

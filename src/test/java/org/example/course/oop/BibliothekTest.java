package org.example.course.oop;

import static org.junit.jupiter.api.Assertions.*;

class BibliothekTest {

    @org.junit.jupiter.api.Test
    void buchHinzufuegen() {
        //3As
        //Arrange
        Bibliothek bibliothek = new Bibliothek();
        Buch buch = new Buch("Harry Potter", "1254-98652-36", new Autor("Rowling"));

        //Act
        bibliothek.buchHinzufuegen(buch);

        //Asserts
        assertTrue(bibliothek.getBuchlist().contains(buch));
    }

    @org.junit.jupiter.api.Test
    void buchAusleihen() {
        Bibliothek bibliothek = new Bibliothek();
        Buch buch = new Buch("Achterbahn", "1458-98856-67", new Autor("Stephan King"));
        bibliothek.buchHinzufuegen(buch);
        bibliothek.buchAusleihen(buch);
        assertFalse(bibliothek.getBuchlist().contains(buch));

    }

    @org.junit.jupiter.api.Test
    void buchZurueckgeben() {
        Bibliothek bibliothek = new Bibliothek();
        Buch buch = new Buch("Harry Potter", "1254-98652-36", new Autor("Rowling"));
        bibliothek.buchZurueckgeben(buch);
        assertTrue(bibliothek.getBuchlist().contains(buch));
    }

    @org.junit.jupiter.api.Test
    void buchLoeschen() {
        Bibliothek bibliothek = new Bibliothek();
        Buch buch = new Buch("Harry Potter", "1254-98652-36", new Autor("Rowling"));
        bibliothek.buchLoeschen(buch);
        assertFalse(bibliothek.getBuchlist().contains(buch));
    }
}
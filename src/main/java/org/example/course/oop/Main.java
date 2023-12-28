package org.example.course.oop;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Person dogan = new Person("Dogan", "Cabas", LocalDate.of(1992, 07, 23));
        System.out.println("Das Alter von Dogan ist: " + dogan.alter());
    }
}

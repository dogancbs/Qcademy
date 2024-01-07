package org.example.course.oop;

public class Equals {

    public static void main(String[] args) {
        String string1 = new String("hello");
        String string2 = new String("hello");
        if (string1.equals(string2)){
            System.out.println("The Strings are equal");
        } else {
            System.out.println("The Strings are not equal");
        }

    }
}

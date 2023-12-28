package org.example.course.oop;

public class Autor {

    private String name;
    private String synonym;
    private double gage;

    public Autor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSynonym() {
        return synonym;
    }

    public double getGage() {
        return gage;
    }

    public void setSynonym(String synonym) {
        this.synonym = synonym;
    }

    public void setGage(double gage) {
        this.gage = gage;
    }

    public String toString() {
        return "Autor: (Name: " + name + " Synonym: " + synonym + " Gage: " + gage + ")";
    }
}

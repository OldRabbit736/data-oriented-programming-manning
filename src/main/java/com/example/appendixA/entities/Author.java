package com.example.appendixA.entities;

public class Author {

    private final String firstName;
    private final String lastName;
    private final int numberOfBooks;

    public Author(String firstName, String lastName, int numberOfBooks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfBooks = numberOfBooks;
    }

    public String fullName() {
        return this.firstName + " " + this.lastName;
    }

    public boolean isProlific() {
        return this.numberOfBooks > 100;
    }

}

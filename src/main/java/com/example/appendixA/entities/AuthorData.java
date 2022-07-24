package com.example.appendixA.entities;

public class AuthorData implements IHaveName, IHaveWrittenBooks {

    private final String firstName;
    private final String lastName;
    private final int numberOfBooks;

    public AuthorData(String firstName, String lastName, int numberOfBooks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfBooks = numberOfBooks;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public int getNumberOfBooksWritten() {
        return this.numberOfBooks;
    }
}

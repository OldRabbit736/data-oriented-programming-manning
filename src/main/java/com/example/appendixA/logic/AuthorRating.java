package com.example.appendixA.logic;

import com.example.appendixA.entities.IHaveWrittenBooks;

public class AuthorRating {

    public static boolean isProlific(IHaveWrittenBooks IHaveWrittenBooks) {
        return IHaveWrittenBooks.getNumberOfBooksWritten() > 100;
    }
}

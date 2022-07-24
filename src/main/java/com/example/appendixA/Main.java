package com.example.appendixA;

import com.example.appendixA.entities.Author;
import com.example.appendixA.entities.AuthorData;
import com.example.appendixA.logic.AuthorRating;
import com.example.appendixA.logic.NameCalculation;

public class Main {

    public static void main(String[] args) {
        breakingPrincipleOneInOOP();
        adheringPrincipleOneInOOP();
    }


    // DOP Principle #1 : Separate code from data
    // breaking principle #1 in OOP
    public static void breakingPrincipleOneInOOP() {
        Author author = new Author("Isaac", "Asimov", 500);
        System.out.println(author.fullName());
        System.out.println(author.isProlific());
    }

    // adhering to principle #1 in OOP
    // data 와 code 분리 --> code 의 재사용성 증대, code 의 분리된 환경에서의 테스트 가능, 시스템이 덜 복잡함
    public static void adheringPrincipleOneInOOP() {
        AuthorData author = new AuthorData("Isaac", "Asimov", 500);
        System.out.println(NameCalculation.fullName(author));
        System.out.println(AuthorRating.isProlific(author));
    }
}

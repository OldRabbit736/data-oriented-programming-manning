package com.example.appendixA.logic;

import com.example.appendixA.entities.IHaveName;

public class NameCalculation {

    public static String fullName(IHaveName IHaveName) {
        return IHaveName.getFirstName() + " " + IHaveName.getLastName();
    }
}

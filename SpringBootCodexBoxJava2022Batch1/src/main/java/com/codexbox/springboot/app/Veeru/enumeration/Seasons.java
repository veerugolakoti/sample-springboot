package com.codexbox.springboot.app.Veeru.enumeration;

public enum Seasons {

    SUMMER("It is a summer"),
    WINTER("It is winter"),
    FALL(" "),
    SPRING("It is a Spring");

    private String value;

    public String getValue() {
        return value;
    }



    Seasons(String value) {
        this.value = value;
    }
}

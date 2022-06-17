package com.codexbox.springboot.app.abhilash.enumaration;

public enum EnumarationExample {
    SUMMER("SUMMER IS SO HOT "),
    WINTER,
    SPRING,
    FALL;

    EnumarationExample() {
    }
    private String values;

    EnumarationExample(String values) {
        this.values = values;
    }

    public String getValues() {
        return values;
    }
}


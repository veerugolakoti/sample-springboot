package com.codexbox.springboot.app.abhilash.enumaration;

public enum EnumarationExample {
    SUMMER,
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


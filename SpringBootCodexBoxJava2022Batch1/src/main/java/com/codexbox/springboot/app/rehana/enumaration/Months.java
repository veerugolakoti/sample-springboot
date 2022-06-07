package com.codexbox.springboot.app.rehana.enumaration;

public enum Months {
    JANUARY("month is january"),
    FEBRUARY("month is february"),
    MARCH("month is march"),
    APRIL("month is april"),
    MAY("month is may");
private String value;
    public String getValue() {
        return value;
    }

    Months(String value) {
        this.value =value;
    }

    }



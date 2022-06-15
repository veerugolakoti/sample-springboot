package com.codexbox.springboot.app.vasu.sample;

import java.util.ArrayList;
import java.util.List;

public enum Seasons {
    SUMMER("It is a summer"),
    WINTER("It is a winter"),
    SPRING("It is a spring"),
    FALL("It is a fall");
     private String value;

    public String getValue() {
        return value;
    }

    Seasons(String s) {
        this.value=value;
    }


    }



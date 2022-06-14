package com.codexbox.springboot.app.HarshaDeepthi;

public enum Seasons {
    Summer("represented as summer"),

    Winter("represented as winter"),
    Spring("represented as spring"),
    ;
    private String s ;
    public String getvalue(){
        return s;
    }

    Seasons(String s) {
        this.s=s;

    }
}

package com.codexbox.springboot.app.swathi.assesment.enumeration;

public enum Day {
    MONDAY("REPRESETED AS MONDAY"),
    TUESDAY("REPRESETED BY TUESDAY"),
    WEDNESDAY("REPRESETED BY WEDNESDAY"),
    THURSDAY("REPRESENTED BY THURSDAY"),
    FRIDAY("REPRESENTED BY FRIDAY"),
    SATURDAY("REPRESENTED AS SATURDAY");
   private String S;
   public String getvalue(){
       return S;
   }

    Day(String S) {
        this.S=S;
    }
}

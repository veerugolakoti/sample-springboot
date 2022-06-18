package com.codexbox.springboot.app.ramdurgaprasad.enumeration;

public class Main {
    public static void main(String[] args) {
        EnumTest et = new EnumTest(SolarSystem.earth);
        et.details();
        EnumTest et1= new EnumTest(SolarSystem.mars);
        et1.details();
        EnumTest et2 =new EnumTest(SolarSystem.sun);
        et2.details();
    }
}

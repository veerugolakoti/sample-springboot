package com.codexbox.springboot.app.ramdurgaprasad.enumeration;

public class EnumTest {
    SolarSystem solarSystem;

public EnumTest(SolarSystem solarSystem){
this.solarSystem=solarSystem;
}
public void details(){
    switch(solarSystem){
        case sun:
            System.out.println("the sun is the major one in solar system");
          break;
        case mars:
            System.out.println("the first planet of the sun and nearer to the sun:");
            break;
        case mercury:
            System.out.println("the 2 planet in solar near to earth:");
            break;
        case earth:
            System.out.println("the living things in solar system is in earth only:");
            break;
        case venus:
            System.out.println("the planet next to the earth:");
            break;
        case jupiter:
            System.out.println("the 5 planet in the solar system");
            break;
        case uranus:
            System.out.println("the one of the biggest planet:");
            break;
    }
}
}
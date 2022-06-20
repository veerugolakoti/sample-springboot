package com.codexbox.springboot.app.sohailspringbootproject.interfaceconcept;

public class CarDetails implements CarPrice,Car {
    @Override
    public void ford() {
        System.out.println("I am in CarDetails CLass implementing  Ford method ");
    }
    public void tata(){
        System.out.println("I am in the Cardetails class implementing tata methods");
    }
    public void nano(){
        System.out.println("I am in Cardetails class implementing nano method");

    }

    public void audi(){
        System.out.println("I am in Cardetails class implementing audi method");
    }
}

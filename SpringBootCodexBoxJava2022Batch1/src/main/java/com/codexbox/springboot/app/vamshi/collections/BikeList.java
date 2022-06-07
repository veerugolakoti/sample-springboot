package com.codexbox.springboot.app.vamshi.collections;

import java.util.*;

public class BikeList {
    public void addBikes() {
        Set<String> bikes = new LinkedHashSet<>();
        bikes.add("YAMAHA");
        bikes.add("HUSQVARNA");
        bikes.add("KTM");
        bikes.add("DUCATI");
        bikes.add("Benilli");
        bikes.add("ULTRAVOILET");
        bikes.add("REVOLT");
        bikes.add("BAJAJ");
        bikes.add("ULTRAVOILET");
        bikes.add("BMW");
        bikes.add("SUZUKI");
        bikes.add("JAWA");
        System.out.println("Bikes company List "+bikes);

        List<String> testCars = new ArrayList<>();
        testCars.add("Maserati");
        testCars.add("Shelby");
        testCars.add("Porsche");
        testCars.add("Lamborghini");
        testCars.add("Mini cooper");
        testCars.add("Ferrari");
        testCars.add("Nissan");
        testCars.add("Rover");
        testCars.add("Audi");
        testCars.add("Bmw");
        testCars.add("Benz");
        testCars.add("Ford");
        System.out.println("Company of cars"+testCars);

        List<String> cars = new ArrayList<>(bikes);

        System.out.println("bike number 7 " + cars.get(1));
    }
}





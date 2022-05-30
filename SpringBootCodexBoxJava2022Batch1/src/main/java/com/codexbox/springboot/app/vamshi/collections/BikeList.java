package com.codexbox.springboot.app.vamshi.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class BikeList {
    public void addBikes() {
        HashSet<String> bikes = new HashSet<>();
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
        System.out.println("companies of bikes i like "+bikes);

        List<String> testBikes = new ArrayList<>();
        testBikes.add("audi");
        testBikes.add("bmw");
        testBikes.add("ferarri");
        testBikes.add("nissan");
        testBikes.add("rover");
        testBikes.add("benz");
        testBikes.add("minicopper");
        testBikes.add("ford");
        testBikes.add("shelby");
        testBikes.add("porsche");
        testBikes.add("lambo");
        testBikes.add("masirati");

        List<String> cars = new ArrayList<>(bikes);
        /**/
        System.out.println("list of cars i like "+cars);
        System.out.println("bikes number 7 "+cars.get(7));

    }





}





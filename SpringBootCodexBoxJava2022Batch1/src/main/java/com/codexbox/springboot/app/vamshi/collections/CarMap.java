package com.codexbox.springboot.app.vamshi.collections;

import java.util.*;

public class CarMap {
     public void orderTest() {
         TreeMap<String,Integer> cars = new TreeMap<>();
        cars.put("Maserati",11);
        cars.put("Shelby",22);
        cars.put("Porsche",33);
        cars.put("Lamborghini",44);
        cars.put("Mini cooper",55);
        cars.put("Ferrari",66);
        cars.put("Nissan",77);
        cars.put("Rover",88);
        cars.put("Audi",99);
        cars.put("Bmw",98);
        cars.put("Benz",61);
        cars.put("Ford",46);
         System.out.println(cars.descendingMap());

         //System.out.println(cars.get("Audi"));
         // System.out.println("testing the natural sorting order"+cars);
    }
}

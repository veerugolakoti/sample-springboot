package com.codexbox.springboot.app;

import javafx.scene.effect.SepiaTone;
import org.springframework.boot.autoconfigure.integration.IntegrationAutoConfiguration;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);
        for (String i : cars ) {
            System.out.println(i);
        }
        LinkedList<Integer> myLinkedList = new LinkedList<>();

    }
}


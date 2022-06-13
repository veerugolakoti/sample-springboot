package com.codexbox.springboot.app;

import collections.MapsExamples;
import collections.TreeSetExample;
import duplicateNames.DuplicateExample;
import enumerate.Directions;
import enumerate.java8features.LambdaExample;
import org.junit.jupiter.api.Test;

public class Kalyan_Testing {

    @Test
    public void testDuplicate(){
        DuplicateExample.duplicate();
    }
    @Test
    public void testSetExample(){
        TreeSetExample.mySet();
    }
    @Test
    public void testMapExample(){
        MapsExamples.setMap();
    }
    @Test
    public void testDirections() {
        Directions arr[] = Directions.values();
        for (Directions d : arr) {
            System.out.println(d + " at position : " + d.ordinal());
        }
    }
    @Test
    public void testLambda(){
        LambdaExample.lambda();
    }

}


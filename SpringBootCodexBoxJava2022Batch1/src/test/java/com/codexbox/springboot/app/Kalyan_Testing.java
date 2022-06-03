package com.codexbox.springboot.app;

import collections.MapsExamples;
import collections.TreeSetExample;
import duplicateNames.DuplicateExample;
import org.junit.jupiter.api.Test;
import rateofInterest.InterestExample;

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

}

package com.codexbox.springboot.app;

import com.codexbox.springboot.app.vamshi.collections.BikeList;
import com.codexbox.springboot.app.vamshi.collections.StackExample;
import org.junit.jupiter.api.Test;

import java.util.Stack;

public class VamshiTestClass {
    @Test
    void contextLoads() {
        /*stackExample
        StackExample example = new StackExample();
        example.stackOperation();*/
        BikeList bikeList = new BikeList();
        bikeList.addBikes();
//        bikeList.addBikes();


    }

}

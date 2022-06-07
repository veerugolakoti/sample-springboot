package com.codexbox.springboot.app;

import com.codexbox.springboot.app.vamshi.assessment.StudentsList;
import com.codexbox.springboot.app.vamshi.collections.BikeList;
import com.codexbox.springboot.app.vamshi.collections.CarMap;
import com.codexbox.springboot.app.vamshi.collections.StackExample;
import org.junit.jupiter.api.Test;

import java.util.Stack;

public class VamshiTestClass {
    @Test
    void contextLoads() {
        //stackExample
        StackExample example = new StackExample();
        example.stackOperation();
    }
    @Test
    public void testingHashset() {
        BikeList bikeList = new BikeList();
        bikeList.addBikes();
    }
    @Test
      public void orderTest(){
          CarMap carMap = new CarMap();
          carMap.orderTest();
    }
    @Test
    public void countofstudents(){
        StudentsList studentsList = new StudentsList();


    }

}


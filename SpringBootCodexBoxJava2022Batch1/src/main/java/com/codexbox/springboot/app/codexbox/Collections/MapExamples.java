package com.codexbox.springboot.app.codexbox.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExamples {
    public void myMapExamples() {
        Map<Integer, String> myMap = new HashMap();
        myMap.put(202284, "Dwaram Bhargava Sai Teja");
        myMap.put(202239, "R.Siva Narayana");
        myMap.put(202264, "G.Swathi");
        myMap.put(202285, "K.Kalyan");
        System.out.println(myMap.keySet() + " = " + myMap.values());
        System.out.println(myMap.get(202239));
    }
}

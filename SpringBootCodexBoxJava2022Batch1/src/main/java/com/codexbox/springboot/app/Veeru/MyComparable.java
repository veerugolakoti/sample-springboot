package com.codexbox.springboot.app.Veeru;

import java.util.Comparator;
import java.util.Map;

public  class MyComparable implements Comparator<Map.Entry<String,Integer>> {




    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o2.getValue() .compareTo(o1.getValue());
    }
}

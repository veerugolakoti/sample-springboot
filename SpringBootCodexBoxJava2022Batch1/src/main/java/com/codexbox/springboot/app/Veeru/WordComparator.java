package com.codexbox.springboot.app.Veeru;

import java.util.*;

public  class WordComparator implements Comparator<Map.Entry<String, Integer>> {

    @Override
    public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2) {
        return o2.getValue().compareTo(o1.getValue());
    }
}

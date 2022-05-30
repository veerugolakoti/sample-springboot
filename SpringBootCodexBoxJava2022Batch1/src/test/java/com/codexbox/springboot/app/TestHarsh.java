package com.codexbox.springboot.app;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

public class TestHarsh {
    @Test
    public void setOperations(){
            ArrayList<String> setone=new ArrayList<>();
            setone.add("Harsha");
            setone.add("Harsha");
            setone.add("Ramesh");
            setone.add("Ranjan");
            HashSet<String> hashSet=new HashSet<String>();
            for(int i = 0; i < setone.size(); i++) {
                if(hashSet.add(setone.get(i)) == false) {
                    System.out.println(setone.get(i));
                }
            }
    }
}

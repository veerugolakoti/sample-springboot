package com.codexbox.springboot.app.codexbox.Collections;

import javafx.beans.value.WritableSetValue;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExamples {
   public void addHashSet(){
       Set<String> hash = new HashSet<String>();
       {
            hash.add("CodexBox");
            hash.add("Wipro");
            hash.add("Kagool");
            hash.add("CodexBox");
            hash.add("Wipro");
           System.out.println(hash);
           hash.remove("Kagool");
           System.out.println(hash);
       }
    }
    public void linkedhashset() {
//        Set<String> hash = new LinkedHashSet<>();
//        Set<String> hash = new LinkedHashSet<>();

    }


}

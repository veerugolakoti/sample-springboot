package com.codexbox.springboot.app;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

   public List<String> loadMyList() {
       List<String> list = new LinkedList<>();
       list.add("Name1");
       list.add("Name2");
       return list;
    }

}

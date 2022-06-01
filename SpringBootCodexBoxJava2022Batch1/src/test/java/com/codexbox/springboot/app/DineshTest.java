package com.codexbox.springboot.app;

import org.junit.jupiter.api.Test;



import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static javafx.scene.input.KeyCode.T;

public class DineshTest {

    @Test
    void contextLoads() {

        List<String> list= new ArrayList<>();

;
        list.add("dinesh");
        list.add("jansi");
        list.add("vasu");
        list.add("ravali");
        list.add("renuka");
        list.add("vidya");
        list.add("vidya");

        list.add("dinesh");

        //System.out.println(list);




        int count=0;
        LinkedHashSet<String> hashSet = new LinkedHashSet();

        for(int i=0;i< list.size();i++)
        {
            if(hashSet.add(list.get(i))==false)
            {

                System.out.println(list.get(i) +" is repeating " );
            }

        }
        }


        @Test
    public void findingDuplicate()
        {
            HashMap<Integer,String> map= new HashMap();

            map.put(1,"dinesh");
            map.put(2,"vasu");
            map.put(3,"vasu");
            map.put(4,"ramu");
            map.put(5,"karthi");
            map.put(6,"vasu");


            Map<String, Long> values=map.values().stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

                System.out.println("Values Count : " + values);
            }
        }





package com.codexbox.springboot.app;

import com.codexbox.springboot.app.rehana.collection.PriorityQueueExample;
import com.codexbox.springboot.app.rehana.enumaration.Months;
import org.junit.jupiter.api.Test;

import java.util.*;

public class RehanaTestApplication {
    @Test
    public void operation(){
        PriorityQueueExample p = new PriorityQueueExample();
        p.operations();
    }

@Test
    public void mapExample(){
   List<String> myList = new ArrayList<>();
    myList.add("rehana");
    myList.add("abc");
    myList.add("zoya");
    //Collections.sort(myList);
   // System.out.println(myList);
    //List<String>myList = new ArrayList<>();

       Set<String> mySet =new TreeSet<>(myList);
       mySet.add("arha");
       mySet.add("zuniara");
       mySet.add("mehreen");
       mySet.add("zoya");
   System.out.println(mySet.size());
    System.out.println(mySet.contains("arha"));
    System.out.println(mySet);
   //System.out.println( mySet)


    System.out.println(Months.JANUARY.getValue());
    System.out.println(Months.FEBRUARY.getValue());
    System.out.println(Months.values());
    System.out.println(  Months.JANUARY);

}
}

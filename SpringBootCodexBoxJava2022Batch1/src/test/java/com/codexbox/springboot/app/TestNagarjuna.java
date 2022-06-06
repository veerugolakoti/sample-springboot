package com.codexbox.springboot.app;

import Enumeration.Size;
import Enumeration.Week;
import org.junit.jupiter.api.Test;

public class TestNagarjuna {
    @Test
public void getValue() {
//    public void operations() {
       /* HashSetOperations hashSetOperations=new HashSetOperations();
        hashSetOperations.testOperations();*/
       /* LinkedHashOperations linked = new LinkedHashOperations();
        linked.testOperations();*/
       /* QueueOperations qs=new QueueOperations();
        qs.testOperations();*/
        /*MapOperations mp=new MapOperations();
        mp.testOperations();*/
        System.out.println(Week.FRIDAY.ordinal());
        System.out.println(Week.SATURDAY.name());
        System.out.println(Week.THURSDAY.getValue());
        System.out.println(Week.MONDAY.compareTo(Week.SATURDAY));
        System.out.println(Size.SMALL.ordinal());
        System.out.println(Size.LARGE.getValue());
        System.out.println(Size.EXTRALARGE.toString());


    }
}


package com.codexbox.springboot.app;

import Enumeration.Size;
import Enumeration.Week;
import FileOperations.InputOutputStream;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TestNagarjuna {
    @Test
//public void getValue() {
//    public void operations() {
       /* HashSetOperations hashSetOperations=new HashSetOperations();
        hashSetOperations.testOperations();*/
       /* LinkedHashOperations linked = new LinkedHashOperations();
        linked.testOperations();*/
       /* QueueOperations qs=new QueueOperations();
        qs.testOperations();*/
        /*MapOperations mp=new MapOperations();
        mp.testOperations();*/
        /*System.out.println(Week.FRIDAY.ordinal());
        System.out.println(Week.SATURDAY.name());
        System.out.println(Week.THURSDAY.getValue());
        System.out.println(Week.MONDAY.compareTo(Week.SATURDAY));
        System.out.println(Size.SMALL.ordinal());
        System.out.println(Size.LARGE.getValue());
        System.out.println(Size.EXTRALARGE.toString());

*/
    public void inputOoutputOperations() throws IOException {
        InputOutputStream inputexample=new InputOutputStream();
        inputexample.inputOutputOperations();


    }
}


package com.codexbox.springboot.app;

import org.junit.Test;
import springboot.nag.collections.HashSetOperations;
import springboot.nag.collections.LinkedHashOperations;
import springboot.nag.collections.MapOperations;
import springboot.nag.collections.QueueOperations;

import java.util.LinkedHashSet;

public class TestNagarjuna {
    @Test
    public void operations() {
       /* HashSetOperations hashSetOperations=new HashSetOperations();
        hashSetOperations.testOperations();*/
       /* LinkedHashOperations linked = new LinkedHashOperations();
        linked.testOperations();*/
       /* QueueOperations qs=new QueueOperations();
        qs.testOperations();*/
        MapOperations mp=new MapOperations();
        mp.testOperations();
    }
}


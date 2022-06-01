package com.codexbox.springboot.app;

import feature_ranjan.collection.*;
import org.junit.jupiter.api.Test;



public class RanjanTestClass {
 @Test
    void duplicate(){
     DuplicateInList duplicateInList = new DuplicateInList();
     duplicateInList.duplicateList();
    }
@Test
    void stackm1(){
    StackEx se = new StackEx();
    se.stackMethod();
}
@Test
    void queueM2(){
    Queue que = new Queue();
    que.queue();

}
@Test
    void setTestm3(){
    SetEx setex0 = new SetEx();
    setex0.setex();
}

@Test
    void sortedm4(){
    ShortedSetEx se = new ShortedSetEx();
    se.sortedex();
}
@Test
    void mapex(){
     MapExample me = new MapExample();
     me.map();
}

}

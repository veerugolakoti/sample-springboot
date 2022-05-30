package com.codexbox.springboot.app;

import com.codexbox.springboot.app.codexbox.Collections.SetExamples;
import com.codexbox.springboot.app.codexbox.Collections.StackExamples;
import org.junit.jupiter.api.Test;

public class BhargavTestClass {

    @Test
            public void mystack() {
        StackExamples stackExamples = new StackExamples();
        stackExamples.addmystack();
    }

    @Test
    public void retriveStackElement(){
        StackExamples stackExamples = new StackExamples();
        stackExamples.retriveStackElement();
    }
    @Test
    public void addHashSet(){
        SetExamples setExamples = new SetExamples();
        setExamples.addHashSet();
    }
}

package com.codexbox.springboot.app;

import com.codexbox.springboot.app.codexbox.BhargavTej.collections.MapExamples;
import com.codexbox.springboot.app.codexbox.BhargavTej.collections.SetExamples;
import com.codexbox.springboot.app.codexbox.BhargavTej.collections.StackExamples;
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

    @Test
    public void linkedhashset(){
        SetExamples setExamples = new SetExamples();
        setExamples.linkedhashset();
    }
    @Test
    public void treeseExamples(){
        SetExamples setExamples = new SetExamples();
        setExamples.treeseExamples();
    }
@Test
    public void myMapExamples() {
    MapExamples mapExamples = new MapExamples();
    mapExamples.myMapExamples();
}

}

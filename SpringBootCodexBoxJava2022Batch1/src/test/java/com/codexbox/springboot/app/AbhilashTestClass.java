package com.codexbox.springboot.app;

import com.codexbox.springboot.app.abhilash.collection.SetExample;
import com.codexbox.springboot.app.abhilash.collection.StackExample;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;
import java.util.Set;

@SpringBootTest
public class AbhilashTestClass {
    @Test
    public void testStackExample() {
        StackExample stackExample = new StackExample();
        stackExample.push_operation();

    }
    @Test
   public void testSetExample() {
        SetExample setExample = new SetExample();
        setExample.methodOnSet();
   }

}

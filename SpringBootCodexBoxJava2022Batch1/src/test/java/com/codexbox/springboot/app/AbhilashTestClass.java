package com.codexbox.springboot.app;

import com.codexbox.springboot.app.abhilash.collection.SetArrayExample;
import com.codexbox.springboot.app.abhilash.collection.SetExample;
import com.codexbox.springboot.app.abhilash.collection.StackExample;
import com.codexbox.springboot.app.abhilash.filehandling.FileHandlingExample;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;
import java.io.IOException;
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
   @Test
    public void testSetArrayExample() {
       SetArrayExample setArrayExample = new SetArrayExample();
       setArrayExample.setArray();

}
@Test
public void testFileHandlingExample() throws IOException {
    FileHandlingExample fileHandlingExample = new FileHandlingExample();
    fileHandlingExample.example();

}
}

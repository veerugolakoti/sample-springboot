package com.codexbox.springboot.app;

import com.codexbox.springboot.app.abhilash.JdbcExample.PreparedstatementExample;
import com.codexbox.springboot.app.abhilash.collection.SetArrayExample;
import com.codexbox.springboot.app.abhilash.collection.SetExample;
import com.codexbox.springboot.app.abhilash.collection.StackExample;
import com.codexbox.springboot.app.abhilash.filehandling.FileExample;
import com.codexbox.springboot.app.abhilash.filehandling.FileHandlingExample;
import com.codexbox.springboot.app.abhilash.filehandling.Sample;
import com.codexbox.springboot.app.abhilash.filehandling.SequenceinputExample;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;
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
    fileHandlingExample.second();

}

@Test
public void testSampleByteOutput() {
        Sample testSampleByte = new Sample();
        testSampleByte.baos();

    }
    @Test
     public void testFileExample() throws IOException {
        FileExample obj = new FileExample();
        obj.example();

    }
    @Test
    public void testSequenceinputExample() {
        SequenceinputExample si = new SequenceinputExample();
        si.sequenceEx();
    }
    @Test
    public void testPreparedstatementExample(){
        PreparedstatementExample preparedstatementExample = new PreparedstatementExample();
        try {
            preparedstatementExample.establish();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

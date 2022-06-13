package feature_ranjan.mainmethod;

import feature_ranjan.fileiooperation.*;
import feature_ranjan.thread.ThreadExample;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
@SpringBootApplication
public class MainMethod {
    @Bean
    public static void main(String[] args) throws IOException {
       /* InputOutputExample inputOutputExample = new InputOutputExample();
        inputOutputExample.fileInputOutput();*/


       /* BufferOutputStreamExample bufferObject = new BufferOutputStreamExample();
        bufferObject.bufferOutput();*/

       /* BufferInputStreamExample bufferObject = new BufferInputStreamExample();
        bufferObject.bufferInput();*/

        /*SequenceInputStramExample sequenceObject = new SequenceInputStramExample();
        sequenceObject.sequenceInput();*/

        /*SequenceInputStream2 sequenceInputStream2 = new SequenceInputStream2();
        sequenceInputStream2.sequenceInput();*/

       /* ByteArrayOutputStreamExample byteArrayObject = new ByteArrayOutputStreamExample();
        byteArrayObject.byteArrayOutput();*/

       /* ByteArrayInputStreamExample byteArrayInputObject = new ByteArrayInputStreamExample();
        byteArrayInputObject.byteArrayInputStream();*/

        /*DataOutputClassExample dataOutputClassExample = new DataOutputClassExample();
        dataOutputClassExample.dataOutputClass();*/

        ThreadExample threadExample = new ThreadExample();

        System.out.println("My Thread Object Id :"+threadExample.getId());
        System.out.println("My Thread Object Name :"+threadExample.getName()+"\n");

        ThreadExample threadExample2 = new ThreadExample();

        System.out.println("Second Thread Object Id :"+threadExample2.getId());
        System.out.println("Second Thread Object Name :"+threadExample2.getName());
        System.out.println("Second Thread Object current Name :"+threadExample2.currentThread().getName()+"\n");

        Thread thread = new Thread();
        System.out.println("Main Thread class Id :"+thread.getId());
        System.out.println("Main Thread class Name :"+thread.getName());
        System.out.println("Main Thread class random method :"+thread.getContextClassLoader()+"\n");

        thread.run();
        System.out.println("run() using main Thread object :\n");

        System.out.println("My own Thread Example :");
        threadExample.myThreadExample();

        System.out.println("calling  run()  :");
        threadExample2.run();


    }
}

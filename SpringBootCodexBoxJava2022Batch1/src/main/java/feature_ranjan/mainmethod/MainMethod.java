package feature_ranjan.mainmethod;

import feature_ranjan.fileiooperation.*;
import feature_ranjan.thread.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
public class MainMethod {
    static final int MAXNO = 5;
    @Bean
    public static void main(String[] args) throws IOException, InterruptedException {
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

       /* ThreadExample threadExample = new ThreadExample();
        threadExample.start();
        System.out.println("state of my thread :"+threadExample.getState());

       *//* System.out.println("My Thread Object Id :"+threadExample.getId());
        System.out.println("My Thread Object Name :"+threadExample.getName()+"\n");*//*

        ThreadExample threadExample2 = new ThreadExample();
        System.out.println("state of my second thread :"+threadExample2.getState());

      *//*  System.out.println("Second Thread Object Id :"+threadExample2.getId());
        System.out.println("Second Thread Object Name :"+threadExample2.getName());
        System.out.println("Second Thread Object current Name :"+threadExample2.currentThread().getName()+"\n");*//*

        Thread thread = new Thread();
       *//* System.out.println("Main Thread class Id :"+thread.getId());
        System.out.println("Main Thread class Name :"+thread.getName());
        System.out.println("Main Thread class random method :"+thread.getContextClassLoader()+"\n");*//*

        System.out.println("run() using main Thread object :-");
        thread.run();

        System.out.println("\nMy own Thread Method calling :-");
        threadExample.myThreadExample();

        System.out.println("calling  run()  :");
        threadExample2.run();
        //threadExample2.wait();


        try {
            Thread.sleep(50000l);
        } catch (InterruptedException e) {

        }System.out.println("sleeping after 5000 milisecond :");*/
// Thread  Example 2
     /*   ThreadExample2 threadExample1 = new ThreadExample2();
        System.out.println(threadExample1.getState());
       // threadExample1.start();
        System.out.println("First Thread -:"+threadExample1.getId() +"  "+ threadExample1.getName() + "\n");
        //threadExample1.setPriority(2);

        ThreadExample2 threadExample2 = new ThreadExample2();
        threadExample2.start();
        System.out.println(threadExample2.getState());
        System.out.println("Second Thread -:"+threadExample2.getId()  +"  "+ threadExample2.getName() + "\n");
        //threadExample2.setPriority(1);

        ThreadExample2 threadExample3 = new ThreadExample2();
        threadExample3.run();

        //System.out.println("last Thread :" + threadExample3.getId() + "  " + threadExample3.getName());
        //threadExample3.start();

        Thread.sleep(1502l);
        System.out.println("State of thread at Last :" + threadExample3.getState());*/
        //threadExample3.setPriority(3);


        //System.out.println("getPriority :" +threadExample1.getPriority());
       // System.out.println("calling run() from Main :" + threadExample3.getState() + "\n");
        //threadExample3.start();
       /* threadExample3.wait();
        threadExample3.notify();*/
   /*     ThreadExample2 threadExample2 = new ThreadExample2();
        new Thread(){
            public void run(){
                threadExample2.threadEx2(50);
            }
        }.start();
        new Thread(){
            public void run(){
                threadExample2.notifyExample();
            }
        }.start();*/
// ThreadImplementationExample
       /* Runnable runnable1 = new ThreadImplementationExample("Task 1");
        Runnable runnable2 = new ThreadImplementationExample("Task 2");
        Runnable runnable3 = new ThreadImplementationExample("Task 3");
        Runnable runnable4 = new ThreadImplementationExample("Task 4");
        Runnable runnable5 = new ThreadImplementationExample("Task 5");

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(runnable1);
        executorService.execute(runnable2);
        executorService.execute(runnable3);
        executorService.execute(runnable4);
        executorService.execute(runnable5);
        executorService.*/

        //executorService.shutdown();

        //SynchronizedExample
        SynchronizedExample synchExample = new SynchronizedExample();
        SynchExample2 synchExample2 = new SynchExample2("hi", synchExample);
        SynchExample2 synchExample3 = new SynchExample2("by", synchExample);
        synchExample2.start();
        synchExample3.start();
        try{
            synchExample2.join();
            synchExample3.join();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

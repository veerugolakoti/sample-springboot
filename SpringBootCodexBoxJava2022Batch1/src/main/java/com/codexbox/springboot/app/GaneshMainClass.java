package com.codexbox.springboot.app;

import com.codexbox.springboot.app.ganesh.saturday.CustomorPurchaseHistory;

import java.sql.SQLException;

public class GaneshMainClass {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

       /* StatementExample se = new StatementExample();
        try {
            se.m1();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }*/



        //prepare statement
/*

        PreparedStatementExample pse = new PreparedStatementExample();
        pse.m2();
*/


        //SingletonExample se =SingletonExample.dis();




     CustomorPurchaseHistory cph = new CustomorPurchaseHistory();
        cph.custmordemographicdetails();




    /*    CreateTable ct =new CreateTable();
        ct.m2();

*/



    }

}





      /*  ThreadExample example = new ThreadExample();

synchronized (example){
    try {
        example.wait(10000);
        System.out.println("The thread is in wait state");
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    Thread.sleep(20000);
    System.out.println("The thread is sleep method");

}

        example.start();
        System.out.println(example.getState());
        System.out.println(example.getId());
        System.out.println( example.getName());
        System.out.println(example.getState());

    }
}
*/

        // ******************************//

       /* ThreadExample1 te1 = new ThreadExample1();

        System.out.println(te1.getState());
        te1.start();
        System.out.println(te1.getState());
        synchronized (te1) {
            System.out.println("main thread");
            try {
                te1.wait(3000);
                System.out.println("After the main thread");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(te1.getState());
///////////////////////

        Display1 d1 = new Display1();
        Thread thread = new Thread(d1);
        thread.start();
d1.run();*/

///////*****

      /*  //A class


        ThreadExample t1 = new ThreadExample();
        Thread thread0 = new Thread();
        thread0.start();
        // c class
        RunnableExample runnableExample = new RunnableExample();
        Thread thread = new Thread(runnableExample);
        thread.start();

        //B class

        ThreadExample1 te1 = new ThreadExample1(runnableExample);
        Thread thread1 = new Thread();
        thread1.start();
*/


//////****
/*
        RunnableExample runnableExample = new RunnableExample();
        Thread t1= new Thread(runnableExample);
        t1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
Thread t2 = new Thread(runnableExample);
        t2.start();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
Thread t3= new Thread(runnableExample);
        t3.start();
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        //**
        ThreadExample t4 = new ThreadExample();
        t4.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
ThreadExample t5 = new ThreadExample();
        t5.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ThreadExample t6 = new ThreadExample();
        t6.start();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        ////*****
/*

        ExecuteFrameworkExample efe = new ExecuteFrameworkExample();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 1; i <10 ; i++)
        {
            executorService.execute(efe);
        }


        executorService.shutdown();


    }

}*//*

        public class ExecuteFrameworkExample implements Callable {
            @Override
            public Object call() throws Exception {
                int a = 10;
                int b = 20;
                int c = a + b;

                return c;
            }
        }*/
/*
        ExecuteFrameworkExample ef = new ExecuteFrameworkExample();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 1; i <10 ; i++)
        {
            executorService.execute(ef);
        }


        executorService.shutdown();*/





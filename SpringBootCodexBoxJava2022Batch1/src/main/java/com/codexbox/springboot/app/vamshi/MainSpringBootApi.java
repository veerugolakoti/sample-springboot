package com.codexbox.springboot.app.vamshi;

import com.codexbox.springboot.app.vamshi.assessmentcustomerdetails.CustomerDetails;
import com.codexbox.springboot.app.vamshi.assessmentcustomerdetails.CustomerTable;
import com.codexbox.springboot.app.vamshi.jdbc.EmployeeJdbc;
import com.codexbox.springboot.app.vamshi.jdbc.JdbcSample;
import com.codexbox.springboot.app.vamshi.jdbc.SamplePreparedStatment;
import com.codexbox.springboot.app.vamshi.multithreading.MyRunnableSample;
import com.codexbox.springboot.app.vamshi.multithreading.MyThreadSample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;
import java.util.List;

@SpringBootApplication
public class MainSpringBootApi {
        public static void main(String[] args) {
                CustomerDetails customerDetails = new CustomerDetails();
                try {
                        customerDetails.insertDetails();
                } catch (SQLException e) {
                        throw new RuntimeException(e);
                }
               /* CustomerTable customerTable = new CustomerTable();
                try {
                        customerTable.customerTableCreation();
                } catch (SQLException e) {
                        throw new RuntimeException(e);
                }*/







               /* SamplePreparedStatment samplePreparedStatment = new SamplePreparedStatment();
                try {
                        samplePreparedStatment.getBatchdetails();
                        System.out.println();
                } catch (SQLException e) {
                        throw new RuntimeException(e);
                }*/



               /* JdbcSample jdbcSample = new JdbcSample();
                List<EmployeeJdbc>employeeJdbc =jdbcSample.getEmployee();
                for (EmployeeJdbc emp:employeeJdbc) {
                        System.out.println(emp.getPersonID()+","+emp.getLastName()+""+emp.getFirstName()+", "+emp.getAddress()+", "+emp.getCity());
                }*/


              /*  MyRunnableSample myRunnableSample = new MyRunnableSample();
                MyThreadSample m1 = new MyThreadSample();
                m1.isAlive();
                Thread t1 = new Thread(myRunnableSample);
                t1.setPriority(2);
                t1.start();
                Thread t2 = new Thread(myRunnableSample);
                t2.setPriority(4);
                t2.start();
                Thread t3 = new Thread(myRunnableSample);
                t3.setPriority(1);
                t3.start();
                Thread t4 = new Thread(myRunnableSample);
                try {
                        t4.join(1000l);
                        System.out.println("joining t4 test  "+t4);

                } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                }
                t4.start();
                Thread t5 = new Thread(myRunnableSample);
                t5.start();
                Thread t6 = new Thread(myRunnableSample);
                t6.isDaemon();
                t6.start();*/

       /* MyThreadSample myThreadSample = new MyThreadSample();
        MyRunnableSample myRunnableSample1 = new MyRunnableSample(myThreadSample);
        myRunnableSample1.run();*/

      /*  MyThreadSample myThreadSample = new MyThreadSample();
        System.out.println(myThreadSample.getState());
        myThreadSample.start();
       // System.out.println(myThreadSample.getState());
        try {
            myThreadSample.join();
            System.out.println("check joining ");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       // System.out.println(myThreadSample.getState());
        try {
            Thread.sleep(10000);
            System.out.println("check : sleep activated");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(myThreadSample.getState());*/




      /*
        //runnable
        MyRunnableSample myRunnableSample = new MyRunnableSample();
        myRunnableSample.run();
        try {
            Thread.sleep(1000l);
            // myRunnableSample.notify();
            // myRunnableSample.wait();
            System.out.println("check sleep works ");
            System.out.println(Thread.currentThread().getState());
        } catch (InterruptedException e) {
        }*/





        /*MyThreadSample myThreadSample = new MyThreadSample();
        int a = 11, b=44, c=a*b ;
        System.out.println("total >>>"+c);

        myThreadSample.start();

        myThreadSample.testThread();
        System.out.println("check3 "+myThreadSample.getId());
        System.out.println(myThreadSample.getName());

        Thread thread = new Thread();
        System.out.println(thread.getId());
        System.out.println("check4 "+thread.currentThread().getName());

        MyThreadSample myThreadSample1 = new MyThreadSample();
        System.out.println("check5  "+myThreadSample1.getId());
        System.out.println(myThreadSample1.getName());*/



        }
}

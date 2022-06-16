package com.codexbox.springboot.app.swathi.assesment.mainmethod;

import com.codexbox.springboot.app.swathi.assesment.Assessment3.Student;
import com.codexbox.springboot.app.swathi.assesment.EmployeeDetails;
import com.codexbox.springboot.app.swathi.assesment.MultiThreading.MyThread;
import com.codexbox.springboot.app.swathi.assesment.MultiThreading.ThreadExample;
import com.codexbox.springboot.app.swathi.assesment.enumeration.Day;
import com.codexbox.springboot.app.swathi.assesment.enumeration.EnumerationWeekday;
import com.codexbox.springboot.app.swathi.assesment.filehandling.BufferExample;
import com.codexbox.springboot.app.swathi.assesment.filehandling.FileHandling;
import com.codexbox.springboot.app.swathi.assesment.filehandling.Inputoutputstream;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    }
    }
        // SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);

      /*  List<EmployeeDetails> employees = new ArrayList<>();
        //for ( EmployeeDetails var:employees)
        for (int i = 1; i <= 3; i++) {
            Scanner object = new Scanner(System.in);
            System.out.println("employee name");
            String EmployeeName = object.next();
            System.out.println("employee id");
            String EmployeeId = object.next();
            System.out.println("employee address");
            String employeeAddress = object.next();
            EmployeeDetails employee = new EmployeeDetails(EmployeeName, EmployeeId, employeeAddress);
           employees.add(employee);


        }

       for (int i = 0; i <employees.size(); i++) {
           // System.out.println(Employee.get(i).printEmployeeDetails());
            employees.get(i).printEmployeeDetails();
        }

    *//*    employees.remove(employees.get(1));

        for (int i = 0; i <employees.size(); i++) {
            // System.out.println(Employee.get(i).printEmployeeDetails());
            employees.get(i).printEmployeeDetails();
        }
*//*
    }}
*/

//calculate grade
/*
    List<Student> studentList = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
                Scanner object = new Scanner(System.in);
                System.out.println("student name");
                String studentName = object.next();
                System.out.println("student no");
                String studentno = object.next();
                System.out.println("student address");
                String studentAddress = object.next();

                System.out.println("student marks");
            String studentmarks = object.next();
            Student student = new Student(studentName, studentno, studentAddress, studentmarks);
            studentList.add(student);


        }

            for (int i = 0; i < studentList.size(); i++) {
                studentList.get(i).studentmethod();
            }

            System.out.println("before sorting");
            for(Student student:studentList){


            }

        }

}*/
/*

            System.out.println(Day.MONDAY.name());
            System.out.println(Day.SATURDAY.getvalue()); //enum



        } }*/

        /*  EnumerationWeekday day =new EnumerationWeekday(EnumerationWeekday.Weekday.valueOf("THURSDAY"));

          day.method();
*/
          /*     FileHandling fileHandling=new FileHandling();
                fileHandling.filemethod();
*/

/*

              Inputoutputstream inputoutputstream =new Inputoutputstream();
                inputoutputstream.fileinputoutputoperations();

*/

          /*  BufferExample example=new BufferExample();
            example.buffer();
*/

            /*ThreadExample example = new ThreadExample();
            example.run();
            System.out.println(example.getId());
            System.out.println(example.getName());
            ThreadExample example1=new ThreadExample();
            example1.run();
            System.out.println(example1.getName());
            System.out.println(example1.getId());
            ThreadExample example2=new ThreadExample();
            example2.run();
            System.out.println(example2.getName());
            System.out.println(example2.getId());*/
            // ...............................
          /* System.out.println(Thread.currentThread().getPriority());
            MyThread mythread = new MyThread();
            System.out.println(mythread.getState());
            mythread.start();
            System.out.println(mythread.getState());

            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                mythread.wait(8000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            mythread.m1();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                mythread.wait(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            mythread.m2();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            mythread.m3();
            MyThread examples = new MyThread();
            System.out.println("this is my thread " + examples.hashCode());
            System.out.println(mythread.getState());

        }}*/
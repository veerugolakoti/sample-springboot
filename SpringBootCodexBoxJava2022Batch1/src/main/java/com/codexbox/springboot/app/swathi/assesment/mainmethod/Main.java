package com.codexbox.springboot.app.swathi.assesment.mainmethod;

import com.codexbox.springboot.app.swathi.assesment.Assessment3.Student;
import com.codexbox.springboot.app.swathi.assesment.EmployeeDetails;
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

            BufferExample example=new BufferExample();
            example.buffer();

}}


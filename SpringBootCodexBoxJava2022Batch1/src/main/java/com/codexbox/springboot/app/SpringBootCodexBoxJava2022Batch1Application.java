package com.codexbox.springboot.app;

import com.codexbox.springboot.app.dinesh202270.Employee;
import com.codexbox.springboot.app.dinesh202270.FileReaderClass;
import com.codexbox.springboot.app.dinesh202270.MyComparator;
import com.codexbox.springboot.app.dinesh202270.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
//		LinkedListExample example = new LinkedListExample();
//		System.out.println(example.loadMyList());
       /* Scanner sc = new Scanner(System.in);
        Stack<Employee> employeeList = new Stack<>();

        for (int i = 0; i < 3; i++) {

            Scanner input = new Scanner(System.in);

            System.out.println("Plz enter employee " + (i + 1) + " Name : ");
            String name = input.nextLine();
            System.out.println("Plz enter employee " + (i + 1) + " Address : ");
            String address = input.nextLine();
            System.out.println("Plz enter employee " + (i + 1) + " ContactNo : ");
            int id = input.nextInt();
            System.out.println("()()()()()()()()()()()()()");
            Employee employee = new Employee(name, address, id);
            employeeList.add(employee);
        }

        for (int i = 0; i < 3; i++) {
            //  if(employeeList.)
            employeeList.get(i).printData();
        }

        System.out.println("enter who is absent");
        String abs = sc.nextLine();

        for (int i = 0; i < employeeList.size(); i++) {

            if (employeeList.get(i).getName().equals(abs)) {
                // System.out.println(abs +" is absent ");

                System.out.println("Plz enter new employee Name : ");
                String name = sc.nextLine();
                System.out.println("Plz enter new employee  Address : ");
                String address = sc.nextLine();
                System.out.println("Plz enter new employee ContactNo : ");
                int id = sc.nextInt();
                Employee emp = new Employee(name, address, id);
                // emp.printData();

                employeeList.set(i, emp);
            }
        }
        for (int i = 0; i < 3; i++) {
            //  if(employeeList.)
            employeeList.get(i).printData();
        }
    }*/

/*

        List<Student> stdlist = new ArrayList<>();
        Student student1=null;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 3; i++) {

            String studentgrade;

           // Student student=null;
            try {
               student1=new Student();
                System.out.println("Enter student " + i + " ID : ");
                 student1.setID( scanner.nextInt());
                System.out.println("Enter student " + i + " Name : ");
          student1.setName(scanner.next());
                System.out.println("Enter student " + i + " address : ");
//                student1.setAddress(scanner.next());
                System.out.println("Enter student " + i + " marks : ");
           student1.setMarks(scanner.nextFloat());

                float grade=(student1.getMarks()/1000)*100;

                if(grade>90)
                {
                    studentgrade="G1";
                } else if (grade<=90 && grade>60) {
                     studentgrade="G2";
                } else if (grade<=60 && grade>35) {
                     studentgrade="G3";
                }else
                {
                     studentgrade="G4";
                }

                student1.setGrade(studentgrade);

            }catch (InputMismatchException s)
            {
                System.out.println(" YOU ENTERED WRONG INPUT ...PLEASE CHECK AND TYPE AGAIN");
            }
            ///Student student = new Student(ID, name, address, marks);

            stdlist.add(student1);

        }


        for (int i = 0; i < stdlist.size(); i++) {
            System.out.print("Student " + (i + 1) + " Details  :    ");
            stdlist.get(i).studentDetails();

        }

        Collections.sort(stdlist, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
if(o1.getGrade().equals(o2.getGrade()))
{
    if(o1.getMarks().equals(o2.getMarks())){
        if(o1.getName().equalsIgnoreCase(o2.getName()))
        {
            return o1.getID().compareTo(o2.getID());
        }
        return o1.getName().compareTo(o2.getName());
    }
    return o2.getMarks().compareTo(o1.getMarks());
}
                return o1.getGrade().compareTo(o2.getGrade());

            }
        });

        for (Student student:stdlist) {
            student.studentDetails();

        }


*/

        FileReaderClass file = new FileReaderClass();
        try {

            file.inputOutputStream();
        }catch (Exception e){
            System.out.println("exception occured ");
        }


    }
    }
















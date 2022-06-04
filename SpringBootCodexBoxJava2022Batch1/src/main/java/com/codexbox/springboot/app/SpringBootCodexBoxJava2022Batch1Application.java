package com.codexbox.springboot.app;

import assessment3.Employee;
import assessment4.Student;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		//int count = 1;
	/*	List<Employee> empList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 29 ; i++) {
			System.out.println("Enter Employee" + i + " Details: ");
			System.out.println("Enter emp name: ");
			String name = scanner.next();
			System.out.println("Enter emp id: ");
			Integer id = scanner.nextInt();
			System.out.println("Enter emp address: ");
			String address = scanner.next();
			Employee employee = new Employee(name, id, address);
			empList.add(employee);
		}
		System.out.println("My total employees : " + empList.size());
	}*/

		List<Student> studentList=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for (int i=1;i<3;i++) {
			System.out.println("enter student " + i + " details ");
			System.out.print("enter student name : ");
			String name = sc.next();
			System.out.print("enter student id : ");
			int id = sc.nextInt();
			System.out.print("enter student address : ");
			String address = sc.next();
			System.out.print("enter student marks : ");
			int marks = sc.nextInt();

			float percentage =(marks/100)*100;

			Student student = new Student(name, id, address, marks,percentage);
			studentList.add(student);
		}
		for (Student s:studentList) {
			System.out.println(s.getSname()+" : " +s.getSid()+ " : " +s.getSaddress()+ " : " +s.getSmarks()+" : "+s.getPercentage()+ " : "+s.getGrade());
		}

	}

}

package com.codexbox.springboot.app;

import com.codexbox.springboot.app.Veeru.Employee;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import thread.Thread1;
import thread.ThreadExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
//		//int count = 1;
//		List<Employee> empList = new ArrayList<>();
//		Scanner scanner = new Scanner(System.in);
//		for (int i = 1; i <= 29 ; i++) {
//
//			System.out.println("Enter Employee" + i + " Details: ");
//			System.out.println("Enter emp name: ");
//			String name = scanner.next();
//			System.out.println("Enter emp id: ");
//			Integer id = scanner.nextInt();
//			System.out.println("Enter emp address: ");
//			String address = scanner.next();
//
//			Employee employee = new Employee(name, id, address);
//			empList.add(employee);
//		}
//		System.out.println("My total employees : " + empList.size());
		Thread1 thread1 = new Thread1();
		thread1.start();
		System.out.println("inside main method "+thread1.getState());
		System.out.println("inside main method "+thread1.getId());


			int a = 20;
			int b = 60;
			int sub = a-b;
			System.out.println("inside main sub value :"+sub);



	}
}

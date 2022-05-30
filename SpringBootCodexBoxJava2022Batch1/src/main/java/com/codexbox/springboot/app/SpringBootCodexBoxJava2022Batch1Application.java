package com.codexbox.springboot.app;

import com.codexbox.springboot.app.HarshaDeepthi.EmployeeDetails;
import com.codexbox.springboot.app.HarshaDeepthi.StackExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {


		List<EmployeeDetails> employeeDetailsList = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			Scanner scanner = new Scanner((System.in));
			System.out.println("enter emp id:");
			Integer empId = scanner.nextInt();

			System.out.println("enter emp name:");
			String empName = scanner.next();

			System.out.println("enter the emp address:");
			String empadd = scanner.next();
			EmployeeDetails empDetl = new EmployeeDetails(empId, empName, empadd);

			employeeDetailsList.add(empDetl);

		}

		for (int i = 0; i < employeeDetailsList.size(); i++) {
			employeeDetailsList.get(i).display();
		}
		employeeDetailsList.remove(0);

		for (int i = 0; i < employeeDetailsList.size(); i++) {
			employeeDetailsList.get(i).display();
		}
	}

	}
//		StackExample  var=new StackExample();
//		Stack<String> variable=new Stack<>();
//		variable.push(var.name);
//		variable.push(var.name1);
//		variable.push(var.name2);
//
//		System.out.println(variable);
//
//
//	}
//}

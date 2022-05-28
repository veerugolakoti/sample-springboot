package com.codexbox.springboot.app;

import com.codexbox.springboot.app.ravalispringboot.EmployeelistExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		//	SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);

		List<EmployeelistExample> employeeList= new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 29; i++) {

			System.out.println("enter Employee List" + i + " details:");

			System.out.println("Employee name");

			String name = sc.next();

			System.out.println("Employee id ");

			int id = sc.nextInt();

			System.out.println("Employee address");

			String address = sc.next();


			EmployeelistExample employeelistExample= new EmployeelistExample(name,id,address);

			employeeList.add(employeelistExample);

			employeeList.remove(2);
			employeeList.add(employeelistExample);
		}

	}
}
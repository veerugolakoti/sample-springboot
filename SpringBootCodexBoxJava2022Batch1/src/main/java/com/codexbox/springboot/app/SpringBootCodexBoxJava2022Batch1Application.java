package com.codexbox.springboot.app;

import com.codexbox.springboot.app.HarshaDeepthi.EmployeeDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
	//	LinkedListExample example = new LinkedListExample();
		//System.out.println(example.loadMyList());


		List<EmployeeDetails> employeeDetailsList = new ArrayList<>();
		Scanner scanner=new Scanner((System.in));
		for(int i=1; i<=29; i++){
			System.out.println("enter emp id:");
			Integer empId = scanner.nextInt();

			System.out.println("enter emp name:");
			String empName = scanner.next();

			System.out.println("enter the emp address:");
			String empadd = scanner.next();
			EmployeeDetails empDetl =new EmployeeDetails(empId,empName,empadd);

			employeeDetailsList.add(empDetl);

		}
		System.out.println("details of employee:"+employeeDetailsList.size());

	}

}

package com.codexbox.springboot.app;

import com.codexbox.springboot.app.dhivya.EmployeeList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
		//LinkedListExample example = new LinkedListExample();
		//System.out.println(example.loadMyList());

		List<EmployeeList> employeeLists = new ArrayList<>();
		Scanner scanner=new Scanner(System.in);

		for (int i = 1; i <=29; i++) {

			EmployeeList employeeList=new EmployeeList();
			System.out.println("Enter Employee " +  i  + " Details ");
			System.out.println("Enter Employee name : ");
			employeeList.setName(scanner.next());
			System.out.println("Enter Employee Id : ");
			employeeList.setId(scanner.nextInt());
			System.out.println("Enter Employee address : ");
			employeeList.setAddress(scanner.next());


			employeeLists.add(employeeList);

		}
		for (int i = 0; i < employeeLists.size(); i++) {

			employeeLists.get(i).detils();
		}

	}
}
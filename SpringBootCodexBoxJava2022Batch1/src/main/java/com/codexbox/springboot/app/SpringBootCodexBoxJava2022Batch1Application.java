package com.codexbox.springboot.app;

import com.codexbox.springboot.app.Chandan.assessment3.EmployeesDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {


		//SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
		/*LinkedListExample example = new LinkedListExample();
		System.out.println(example.loadMyList());
		*/
		List<EmployeesDetails> list = new ArrayList<EmployeesDetails>();
		for(int i = 0; i < 2; i++) {
			System.out.println("Enter employee name: ");
			System.out.println("Enter employee id: ");
			System.out.println("Employee address: ");
			EmployeesDetails emp = new EmployeesDetails();
			list.add(emp);
		}

		for(EmployeesDetails empDetails : list) {
			System.out.println(empDetails.getEmployee_ID());
			System.out.println(empDetails.getEmployee_name());
			System.out.println(empDetails.getEmployee_Address());
		}

	}

}

package com.codexbox.springboot.app;

import com.codexbox.springboot.app.renuProjects.assessments.EmployeeDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {


	public static void main(String[] args) {
		List<EmployeeDetails> details=new ArrayList<>();
		Scanner sc=new Scanner(System.in);

		for(int i=1; i<=2; i++) {
			System.out.println("Enter the employee " + i + " details");
			System.out.println("Enter employee name: ");
			String name = sc.next();
			System.out.println("Enter employee id: ");
			int id = sc.nextInt();
			System.out.println("Enter employee address: ");
			String address = sc.next();

			EmployeeDetails	employee = new EmployeeDetails(name, id, address);
			details.add(employee);
		}
		for (EmployeeDetails empl : details) {
			System.out.println(empl.getEmpid() + " " + empl.getAddress() + " " + empl.getEmpname());
		}

	}

}

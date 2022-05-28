package com.codexbox.springboot.app;

import com.codexbox.springboot.app.vidyadarna.Employee;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {


	public static void main(String[] args) {


		//SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
		List<Employee> employeeList = new ArrayList<>();

		Scanner s = new Scanner(System.in);
		for (int i = 1; i<=2; i++) {
			System.out.println("enter the employee name");
			String EmployeeName = s.next();
			System.out.println("enter the employee id");
			int EmployeeId = s.nextInt();
			System.out.println(" enter employee address");
			String EmployeeAddress = s.next();
			Employee employee = new Employee(EmployeeName, EmployeeId, EmployeeAddress);
			employeeList.add(employee);
		}

	}
}

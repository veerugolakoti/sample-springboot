package com.codexbox.springboot.app;

import com.codexbox.springboot.app.vidyadarna.Employee;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {


		//SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
		List<Employee> employeeList = new ArrayList<>();

		Scanner s = new Scanner(System.in);
		for (int i = 0; i <= 3; i++) {
			System.out.println("enter the " + (i + 1) + " employee name");
			String EmployeeName = s.next();
			System.out.println("enter the employee id");
			int EmployeeId = s.nextInt();
			System.out.println(" enter employee address");
			String EmployeeAddress = s.next();
			Employee employee = new Employee(EmployeeName, EmployeeId, EmployeeAddress);
			employeeList.add(employee);

		}
		for (int i = 0; i <= 3; i++) {
			//	System.out.println("the employee list is : " + employeeList.size());
			employeeList.get(i).PrintDisplay();
			System.out.println("&&&&&&&&&&&&&&&&&&&");
		}
		System.out.println("who is obsent");
		String str = s.next();

		for (int i = 0; i < employeeList.size(); i++) {

			if (employeeList.get(i).getEmployeeName().equals(str)) {


				System.out.println("enter new employee name");
				String EmployeeName = s.next();
				System.out.println("enter the employee id");
				int EmployeeId = s.nextInt();
				System.out.println(" enter employee address");
				String EmployeeAddress = s.next();

				Employee employee = new Employee(EmployeeName, EmployeeId, EmployeeAddress);
				employeeList.add(employee);

				employeeList.set(i, employee);
			}
		}
		for (int i = 0; i < 3; i++) {
			employeeList.get(i).PrintDisplay();
     System.out.println("&&&&&&&&&&&&&&&&&&&");

//		}
		}
	}
}
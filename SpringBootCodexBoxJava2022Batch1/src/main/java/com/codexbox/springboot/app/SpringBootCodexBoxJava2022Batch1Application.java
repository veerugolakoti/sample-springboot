package com.codexbox.springboot.app;

import com.codexbox.springboot.app.vamshi.collections.Employee;
import com.codexbox.springboot.app.vamshi.collections.StackExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);

		/*List<Employee> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 29; i++) {
			System.out.println("Enter Details of Employee" + i + "");
			System.out.println("Enter ID: ");
			String IdNo = scanner.next();
			System.out.println("Enter Employee Name: ");
			String name = scanner.next();
			System.out.println("Enter Address:");
			String address = scanner.next();

			Employee employee = new Employee(IdNo, name, address);
			list.add(employee);
		}
		System.out.println("Total details of employees"+list.size());
		for (Employee e:list) {
			System.out.println(e.IdNo+" : "+e.name+" : "+e.address);
		}*/

		StackExample example = new StackExample();
		example.stackOperation();
	}

}





	/*LinkedListExample example = new LinkedListExample();
		System.out.println(example.loadMyList());
	}*/

package com.codexbox.springboot.app;

import com.codexbox.springboot.app.rehana.employedetails.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.soap.Detail;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		/*SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
		LinkedListExample example = new LinkedListExample();
		System.out.println(example.loadMyList());*/
		List<Employee>list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for(int i =1;i<=29;i++){
			System.out.println("Enter employee details "+i+ " details");
			System.out.println("Enter employee name: ");
			String name = sc.next();
			System.out.println("Enter employee id: ");
			int id = sc.nextInt();
			System.out.println("Enter employee address: ");
			String address = sc.next();
			Employee emp = new Employee(name,id,address);
			list.add(emp);int count =1;
			for (Employee emplist:list) {

				System.out.println("Detail of employee"+ count++ );
				System.out.println(name);
				System.out.println(id);
				System.out.println(address);
				System.out.println();
			}

		}

	}

}

package com.codexbox.springboot.app;

import com.codexbox.springboot.app.mounika.EmployeeDetails;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class SpringBootCodexBoxJava2022Batch1ApplicationTests {


	@Test

	public void setprogram() {
		ArrayDeque<String> queue = new ArrayDeque<>();
		queue.add("123");
		queue.add("456");
		queue.add("789");
		System.out.println(queue);

	}


	@Test
	public void sampleset() {
		HashSet<String> name = new HashSet<>();
		name.add("car");
		name.add("bike");
		name.add("bus");
		name.add("car");

		System.out.println("enter the  value :" + name);
		System.out.println("Before sorting :" + name);
		//name.retainAll();
		System.out.println("After retains all :" + name);
	}

		@Test

	public void Mapsets() {
		Map<String, Integer> hashmap = new HashMap<>();
		hashmap.put("Mounika", 12);
		hashmap.put("Divya", 10);
		hashmap.put("Dinesh", 23);
		hashmap.put("Sohail", 88);
		System.out.println(hashmap.get("Mounika"));
		System.out.println("my map :" + hashmap);
		System.out.println("Divya value is :" + hashmap.get("Divya"));


			EmployeeDetails employeeDetails1 = new EmployeeDetails();
			employeeDetails1.setName("dhivya");
			employeeDetails1.setId(124);
			employeeDetails1.setAddress("chennai");
			 EmployeeDetails employeeDetails2 = new EmployeeDetails();
			employeeDetails2 .setName("sohail");
			employeeDetails2.setId(456);
			employeeDetails2.setAddress("hyderabad");
			EmployeeDetails employeeDetails3 = new EmployeeDetails();
			employeeDetails3.setName("dinesh");
			employeeDetails3.setId(789);
			employeeDetails3.setAddress("kurnool");
			Map<String,EmployeeDetails> empdetails = new HashMap<>();
			empdetails.put("employee2",employeeDetails2);
			empdetails.put("employee3",employeeDetails3);
			System.out.println( empdetails);



			for(EmployeeDetails emp :empdetails.values()) {
				System.out.println(" employee name is :" + emp.getName());
				System.out.println("employee id is :" +emp.getId());
				System.out.println("employee address is "+ emp.getAddress());

			}
			EmployeeDetails emp = empdetails.get(employeeDetails1);
			System.out.println("employee1 name is : "+emp.getName());








			}

			}










package com.codexbox.springboot.app;

import com.codexbox.springboot.app.sangam.collections.Employeelist;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
		LinkedListExample example = new LinkedListExample();
		System.out.println(example.loadMyList());
		Employeelist employeelist = new Employeelist();
		employeelist.employeedetails();

//		Encapsulate encapsulate = new Encapsulate();
//		encapsulate.setName("raju");
//		encapsulate.setNo(950522282);
//		encapsulate.setAge(25);
//
//		System.out.println(encapsulate.getName());
//		System.out.println(encapsulate.getNo());
//		System.out.println(encapsulate.getAge());
	}

}

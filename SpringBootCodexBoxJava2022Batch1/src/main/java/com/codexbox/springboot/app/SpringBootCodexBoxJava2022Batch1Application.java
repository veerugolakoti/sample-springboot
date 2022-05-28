package com.codexbox.springboot.app;

import assment2.EmployeDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {
	public static void main(String[] args) {
		List<EmployeDetails> employelist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 29; i++) {
			System.out.println(" Enter the Employes"+i+"Details");
			System.out.println("Enter The Employe name ");
			String name = sc.next();
			System.out.println("Enter The id");
			Integer id = sc.nextInt();
			System.out.println("Enter The address");
			String address = sc.next();
			EmployeDetails employeDetails = new EmployeDetails("sasi",1,"ong");
			employelist.add(employeDetails);
			System.out.println("My total employes details :"+employelist.size());


		}
	}
}

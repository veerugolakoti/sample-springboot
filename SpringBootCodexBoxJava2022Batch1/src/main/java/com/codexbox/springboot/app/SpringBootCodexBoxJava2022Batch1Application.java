package com.codexbox.springboot.app;

import com.codexbox.springboot.app.employeelist.Employee;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedList;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Scanner sc =new Scanner(System.in);
		for (int i = 1;i<=2;i++){
			System.out.println("enter the employe " + i + " deatiles" );
			System.out.println("enter the empid");
			sc.next();
			System.out.println("enter the empname");
			sc.next();
			System.out.println("enter the address");
			sc.next();
			Employee e = new Employee();
			list.add(e);
		}
		System.out.println("enter total emp deatiles : "+ list.size());
		}
	}

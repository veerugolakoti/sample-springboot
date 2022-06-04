package com.codexbox.springboot.app;

import com.codexbox.springboot.app.ganesh.Scanner.Assessment.Students;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		//int count = 1;
//		List<Employee> empList = new ArrayList<>();
//		Scanner scanner = new Scanner(System.in);
//		for (int i = 1; i <= 29 ; i++) {
//
//			System.out.println("Enter Employee" + i + " Details: ");
//			System.out.println("Enter emp name: ");
//			String name = scanner.next();
//			System.out.println("Enter emp id: ");
//			Integer id = scanner.nextInt();
//			System.out.println("Enter emp address: ");
//			String address = scanner.next();
//
//			Employee employee = new Employee(name, id, address);
//			empList.add(employee);
//		}
//		System.out.println("My total employees : " + empList.size());
//	}
//
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the String:");
//		String s1 = s.nextLine();
//		StringBuffer sb = new StringBuffer();
//		sb.append(s1);
//		sb.reverse();
//		String s2 = new String(sb);
//		if (s1.equals(s2)) {
//			System.out.println("Palindrome....");
//		} else {
//			System.out.println("Non-Palindrome...");
//		}
//	}


		List<Students> order = new LinkedList<>();
		Scanner s = new Scanner(System.in);

		for (int i = 1; i <= 6; i++) {
			System.out.println("==========Enter the Students " + i + " Details============");
			System.out.println("Enter the Students number");
			 int Studentnumber = s.nextInt();
			System.out.println("Enter the Students name");
		String	Studentname = s.next();
			System.out.println("Enter the Students address");
			String Studentaddress = s.next();
			System.out.println("Enter the Students marks");
			float marks = s.nextFloat();

			Students students = new Students(Studentnumber, Studentname, Studentaddress, marks);
			order.add(students)	;

		}
	}
}

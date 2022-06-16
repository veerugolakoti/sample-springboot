package com.codexbox.springboot.app;


import com.codexbox.springboot.app.Veeru.mutlitthreading.MyRunnable;
import com.codexbox.springboot.app.Veeru.mutlitthreading.MyThread2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Integer.sum;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) throws IOException, InterruptedException {


		List<Integer> employees = new ArrayList<>();
		employees.add(1);
		employees.add(2);
		employees.add(10);
		employees.add(11);
		employees.add(19);
		employees.add(21);
		employees.add(31);
		employees.add(41);
		employees.add(71);
		employees.add(51);
		employees.add(91);
		employees.add(191);
		employees.add(491);
		employees.add(791);

		MyRunnable runnable = new MyRunnable();

		ExecutorService executorService = Executors.newFixedThreadPool(20);

		for (Integer eid : employees) {
			executorService.execute(runnable);
		}

		executorService.shutdown();
	} /*{

		InputOutputStreamExample ioExample = new InputOutputStreamExample();
		ioExample.fileInputOutputperations();
	*//*	String str = "Welcome codexbox and happy to see you all placed soon.";
		System.out.println(str.length());*//*

	}*/ /*{
		*//*StudentGradeAssessment assessment4 = new StudentGradeAssessment();
		assessment4.studentAndTheirGrades();*//*
		*//*Map<String, Integer> myHashMap = new HashMap<>();
		myHashMap.put("Name1", 1);
		myHashMap.put("Name1", 2);
		myHashMap.put(null, 3);
		myHashMap.put(null, 4);
		System.out.println(myHashMap.get(null));

		System.out.println(myHashMap);*//*

		List<Integer> testNumbers = new ArrayList<>();
		testNumbers.add(1);
		testNumbers.add(2);
		testNumbers.add(3);
		System.out.println(Seasons.SUMMER.name());
		System.out.println(Seasons.SPRING.ordinal());
		System.out.println(Seasons.SPRING.getValue());

	*//*ListIterator myIterator = testNumbers.();
		while (myIterator.hasNext()) {
			System.out.println(myIterator.next());
			myIterator.previous()
		}

		for
		}*//*


	}*/ /*{
		//int count = 1;

		List<Employee> empList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 29 ; i++) {

			System.out.println("Enter Employee" + i + " Details: ");
			System.out.println("Enter emp name: ");
			String name = scanner.next();
			System.out.println("Enter emp id: ");
			Integer id = scanner.nextInt();
			System.out.println("Enter emp address: ");
			String address = scanner.next();

			Employee employee = new Employee(name, id, address);
			empList.add(employee);
		}
		System.out.println("My total employees : " + empList.size());

	}*/


	private static int sum(int a, int b) {
		System.out.println(" inside sum method");
		int sum = a + b;
		return sum;
	}
}


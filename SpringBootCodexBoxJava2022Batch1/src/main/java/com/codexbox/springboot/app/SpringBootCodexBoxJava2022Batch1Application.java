package com.codexbox.springboot.app;

import com.codexbox.springboot.app.Veeru.Collections.StudentGradeAssessment;
import com.codexbox.springboot.app.sohailspringbootproject.collections.SpringBootApplication;
import com.codexbox.springboot.app.sohailspringbootproject.multithreading.MyThread;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		/*StudentGradeAssessment assessment4 = new StudentGradeAssessment();
		assessment4.studentAndTheirGrades();*/
	/*{
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
		MyThread myThread = new MyThread();
		myThread.start();
		//        Here the current thread initially refers to the main thread always
		System.out.println(myThread.currentThread().getId());
		System.out.println(myThread.currentThread().getName());

		System.out.println(myThread.getId());
		System.out.println(myThread.getName());

		MyThread myThread1 = new MyThread();
		System.out.println(myThread1.getId());
		System.out.println(myThread1.getName());

		Thread thread = new Thread();
		System.out.println(thread.getId());
		System.out.println(thread.getName());

		MyThread myThread5 = new MyThread();
		myThread.run();
		//        Here the current thread initially refers to the main thread always
		System.out.println(myThread5.currentThread().getId());
		System.out.println(myThread5.currentThread().getName());

		System.out.println(myThread5.getId());
		System.out.println(myThread5.getName());

		MyThread myThread2 = new MyThread();
		System.out.println(myThread2.getId());
		System.out.println(myThread2.getName());

		Thread thread3 = new Thread();
		System.out.println(thread3.getId());
		System.out.println(thread3.getName());
	}
}
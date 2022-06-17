package com.codexbox.springboot.app;

import com.codexbox.springboot.app.sohailspringbootproject.collections.SpringBootApplication;
import com.codexbox.springboot.app.sohailspringbootproject.jdbc.JdbcExample;
import com.codexbox.springboot.app.sohailspringbootproject.jdbc.Student;
import com.codexbox.springboot.app.sohailspringbootproject.multithreading.MyThread;
import com.codexbox.springboot.app.sohailspringbootproject.multithreading.MyThread1;
import com.codexbox.springboot.app.sohailspringbootproject.multithreading.MyThread2;
import com.codexbox.springboot.app.sohailspringbootproject.multithreading.Task;

import java.sql.SQLException;

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
		/*MyThread myThread = new MyThread();
		myThread.start();
		//        Here the current thread initially refers to the main thread always
		System.out.println(myThread.currentThread().getId());
		System.out.println(myThread.currentThread().getName());

		System.out.println(myThread.getId());
		System.out.println(myThread.getName());

		MyThread myThread1 = new MyThread();
		System.out.println(myThread1.getId());
		System.out.println(myThread1.getName());*/

		/*Thread thread = new Thread();
		*//*System.out.println(thread.getId());
		System.out.println(thread.getName());*//*
		thread.run();
		System.out.println(thread.getState());
		thread.start();
		System.out.println(thread.getState());

		System.out.println("I will execute after 10000 milisecond");
		System.out.println(thread.getState());
*/
		/*MyThread myThread5 = new MyThread();
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
		System.out.println(thread3.getName());*/

		/*MyThread2 myThread2 = new MyThread2();
		myThread2.run();*/

		/*MyThread myThread = new MyThread();
		myThread.setPriority(4);
		myThread.start();
*/

		/*System.out.println(myThread.getState());
		System.out.println(myThread.getName());*/


	/*	MyThread1 myThread1 = new MyThread1();
		Thread thread = new Thread(myThread1);
		thread.setPriority(9);
		thread.start();
	*//*	System.out.println(thread.getState());
		System.out.println(thread.getName());*//*



		MyThread2 myThread2 = new MyThread2();
		myThread2.setPriority(10);
		myThread2.start();*/
		/*System.out.println(myThread2.getState());
		System.out.println(myThread2.getName());*/


	/*	try{
			Thread.sleep(10000l);
			myThread2.sleep(10000l);
		}
		catch(InterruptedException ex){
			System.out.println("InterruptedException ");
		}*/

//		Task task = new Task();

/*	MyThread1 thread1 = new MyThread1();
	Thread thread = new Thread(thread1);


	MyThread2 myThread2 = new MyThread2();
	MyThread myThread = new MyThread();
	myThread2.start();
	try {
		myThread2.join(10000);
	}
	catch (InterruptedException e){
		System.out.println("Catch ");
	}
	myThread.start();
		thread.start();*/

		JdbcExample jdbcExample = new JdbcExample();

		try {
			jdbcExample.jdbcMethod();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}


	}
}



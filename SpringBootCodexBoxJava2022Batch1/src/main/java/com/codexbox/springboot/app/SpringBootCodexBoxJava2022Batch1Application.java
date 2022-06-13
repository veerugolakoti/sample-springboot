package com.codexbox.springboot.app;

import com.codexbox.springboot.app.vasu.sample.threads.MyThread;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		// Thread concept..

		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		MyThread myThread1=new MyThread();
		myThread1.run();
		System.out.println(myThread1.getId());
		System.out.println(myThread1.getName());
		MyThread myThread2=new MyThread();
		myThread2.run();
		System.out.println(myThread2.getId());
		System.out.println(myThread2.getName());
		MyThread myThread3=new MyThread();
		myThread3.checkAccess();
		System.out.println(myThread3.getState());
		System.out.println(myThread3.getContextClassLoader());


		/*//int count = 1;
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
		System.out.println("My total employees : " + empList.size());*/
	}

}

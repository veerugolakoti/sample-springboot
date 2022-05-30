package com.codexbox.springboot.app;

import com.codexbox.springboot.app.rehana.collection.StackOperations;
import com.codexbox.springboot.app.rehana.stackexamples.Student;
import com.codexbox.springboot.app.rehana.stackexamples.Student3;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Stack;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {

	/*	SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
		LinkedListExample example = new LinkedListExample();
		System.out.println(example.loadMyList());
		List<Employee>list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for(int i =1;i<=2;i++){
			System.out.println("Enter employee details "+i+ " details");
			System.out.println("Enter employee name: ");
			String name = sc.nextLine();
			System.out.println("Enter employee id: ");
			int id =Integer.parseInt(sc.nextLine()) ;
			System.out.println("Enter employee address: ");
			String address = sc.nextLine();
			Employee emp = new Employee(name,id,address);
			list.add(emp);int count =1;
			for (Employee emplist:list) {

				System.out.println("Details of employee"+ count++ );
				System.out.println(name);
				System.out.println(id);
				System.out.println(address);
				System.out.println();
*/
		/*Stack<Student> mystack = new Stack<>();
		Student std = new Student3();
		System.out.println(std.method1());
		System.out.println(std.method2());
		System.out.println(std.method3());
		Student3 std3 = new Student3();*/

		StackOperations s = new StackOperations();
		s.operations();





			}







}








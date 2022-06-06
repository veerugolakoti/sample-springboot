package com.codexbox.springboot.app;
import com.codexbox.springboot.app.dhivya.assisment.EmployeeList;
import com.codexbox.springboot.app.dhivya.assisment.StudentList;
import com.codexbox.springboot.app.dhivya.collections.HashsetOperation;
import com.codexbox.springboot.app.dhivya.collections.QueueOperation;
import com.codexbox.springboot.app.dhivya.collections.StackExample;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {
	public static void main(String[] args) {
		//SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
		//LinkedListExample example = new LinkedListExample();
		//System.out.println(example.loadMyList());


//assisment creating employee list and adding and removing employee details
		/*
		}
		for (int i = 0; i < employeeLists.size(); i++) {
			employeeLists.get(i).detils();
		}
		System.out.println("enter the absent name : ");
		String absent=scanner.next();
		for(int i = 0; i < employeeLists.size(); i++){
			EmployeeList emplist=new EmployeeList();
			if(employeeLists.get(i).getName().equalsIgnoreCase(absent)){
				System.out.println("Enter new employee name : ");
				emplist.setName(scanner.next());
				System.out.println("Enter new employee Id : ");
				emplist.setId(scanner.nextInt());
				System.out.println("Enter new employee Address: ");
				emplist.setAddress(scanner.next());

				employeeLists.set(i,emplist);
			}
		}
		for (int i = 0; i < employeeLists.size(); i++){
			employeeLists.get(i).detils();
		}*/


//stack operations
		/*StackExample stackExample=new StackExample();
		stackExample.stackoperation();*/

//Queue operations
		//QueueOperation queueOperation=new QueueOperation();
		//queueOperation.queueExample();

//Hash set operations
		/*HashsetOperation hashsetOperation=new HashsetOperation();
		hashsetOperation.hashsetExample();
*/

		List<StudentList>myStudentList  = new ArrayList<>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of Students : ");
		int studentlist=scanner.nextInt();
		for (int i = 0; i <=studentlist; i++) {
			StudentList studList=new StudentList();
			System.out.println("Enter Student   Details ");
			System.out.println("Enter Student " + (i+1) + " Name : ");
			studList.setStudno(scanner.nextInt());
			System.out.println("Enter Student" + (i+1) + " Id : ");
			studList.setStudName(scanner.next());
			System.out.println("Enter Student " + (i+1) + "Address : ");
			studList.setStudAddress(scanner.next());
			System.out.println("Enter Student " + (i+1) + "Marks : ");
			studList.setStudMarks(scanner.nextInt());
			System.out.println("Averge");
			studList.setAverage();
			myStudentList.add(studList);













	}
}}
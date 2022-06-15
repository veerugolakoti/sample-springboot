package com.codexbox.springboot.app;

import com.codexbox.springboot.app.dhivya.assisment.StudentList;
import com.codexbox.springboot.app.dhivya.collections.DuplicateElements;
import com.codexbox.springboot.app.dhivya.file.InputOutputStream;
import com.codexbox.springboot.app.dhivya.threads.ThreadExample1;
import com.codexbox.springboot.app.dhivya.threads.ThreadExample2;
import com.codexbox.springboot.app.dhivya.threads.ThreadExamples;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.*;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {
	public static void main(String[] args) throws IOException {
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

		/*List<StudentList>myStudentList  = new ArrayList<>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of Students : ");
		int studentlist=scanner.nextInt();
		for (int i = 1; i <=studentlist; i++) {
			StudentList studList=new StudentList();
			System.out.println("Enter Student   Details ");
			System.out.println("Enter Student " + (i) + " Id : ");
			studList.setStudno(scanner.nextInt());
			System.out.println("Enter Student " + (i) + " Name: ");
			studList.setStudName(scanner.next());
			System.out.println("Enter Student " + (i) + " Address : ");
			studList.setStudAddress(scanner.next());
			System.out.println("Enter Student " + (i) + " Marks : ");
			studList.setStudMarks(scanner.nextInt());
			System.out.println("averge" + " " + studList.setAverage());
			myStudentList.add(studList);
		}
		Map<StudentList,String> studentgrade=new HashMap<>();
		System.out.println("Before Sorting Sudent details");
		for (StudentList studentList:myStudentList) {
			studentList.details();
		}
			Collections.sort(myStudentList, new Comparator<StudentList>() {
				@Override
				public int compare(StudentList o1, StudentList o2) {
					if (o1.getStudMarks() == o2.getStudMarks()) {
						if (o2.getStudMarks() == o1.getStudMarks()) {
							if (o1.getStudName().equalsIgnoreCase(o2.getStudName())) {
								return o1.getStudno().compareTo(o2.getStudno());
							}
							return o1.getStudName().compareTo(o2.getStudName());
						}
						return o2.getStudMarks().compareTo(o1.getStudMarks());
					}
					return o1.setAverage().compareTo(o2.setAverage());
				}
			});
			System.out.println("After sorting");
		System.out.println("______________________________________");
			for (StudentList sortedlist : myStudentList) {
				System.out.println(sortedlist.getStudno() + " " + sortedlist.getStudName() + " " + sortedlist.getStudMarks() + " " + sortedlist.getStudAddress() + " " + sortedlist.setAverage());

			}

*/
		//InputOutputStream inputOutputStream=new InputOutputStream();
		//inputOutputStream.ioOperations();
		/*DuplicateElements duplicateList=new DuplicateElements();
		duplicateList.testlist();*/

//Thread Examples
		ThreadExamples threadExamples=new ThreadExamples();
		threadExamples.start();

		ThreadExample1 threadExample1=new ThreadExample1();
		System.out.println(threadExample1.getState());
		System.out.println(threadExamples.getPriority());


//		Runnable runnable=new ThreadExample2();
//		Thread thread=new Thread(runnable,"My New Thread");
//		thread.start();
//		String str=thread.getName();
//		System.out.println("Example : " + str);


		/*ThreadExample1 threadExample1=new ThreadExample1();
		ThreadExample1 threadExample2=new ThreadExample1();
		ThreadExample1 threadExample3=new ThreadExample1();
		threadExample1.start();
		threadExample2.start();
		threadExample3.start();*/


	}}
package com.codexbox.springboot.app;

import com.codexbox.springboot.app.ravalispringboot.inputoutputstrems.SequnceinputoutputstreamExample;
import com.codexbox.springboot.app.ravalispringboot.multithreadingprgm.Mythread;
import com.codexbox.springboot.app.ravalispringboot.multithreadingprgm.Mythread1;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		/*Mythread mythread = new Mythread();
		System.out.println(mythread.getState());
		//System.out.println(mythread.getId());
		System.out.println(mythread.getName());
		mythread.start();
		try {
			mythread.join(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println(" ");
		System.out.println(mythread.getPriority());*/

		Mythread1 mythread1 = new Mythread1(10);
		mythread1.run();
		mythread1.start();
		Runnable r1 = new Mythread1(10) ;


        /*Mythread1 mythread2= new Mythread1();
		mythread2.start();
		Thread thread= new Thread();
		thread.start();
		Thread thread1= new Thread(mythread1);
		thread1.getState();*/

		/*mythread1.notify();
		try {
			mythread1.wait(10, 3);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}*/
	}




	}







	/*	SequnceinputoutputstreamExample sequnceinputstreamExample = new SequnceinputoutputstreamExample();
		sequnceinputstreamExample.sequncemethod();*/
    /*Bufferinputoutputstream bufferinputoutputstream= new Bufferinputoutputstream();
		bufferinputoutputstream.bufferMethod();*/
		/*InputOutputStreamExample inputOutputStreamExample= new InputOutputStreamExample();
		inputOutputStreamExample.Inputoutputmethod();*/





//	SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);

		//System.out.println("Enter  std name: ");
		/*List<Student> stdlist = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		float sum = 0;
		int subjects = 6;

		for (int i = 1; i <= 3; i++) {

			System.out.println("Enter student " + i + " Details: ");
			System.out.println("Enter  std name: ");
			String name = scanner.next();
			System.out.println("Enter std no: ");
			Integer sno = scanner.nextInt();
			System.out.println("Enter  std address: ");
			String saddress = scanner.next();
			System.out.println("enter std marks  : ");
			Integer smarks = scanner.nextInt();

			Student std = new Student(name, sno, saddress, smarks);
			std.Calculator();
			stdlist.add(std);
		}

		for (Student Std : stdlist) {
			System.out.println(Std.getSname() + " " + Std.getSno() + " " + Std.getSaddress() + " " + Std.getMarks() + "  " + Std.getGrade());
		}
		System.out.println("student marks  :");

		//Map<String, Integer> stud = new HashMap<String, Integer>();

		List<Map.Entry<Student, String>> Studentgrade = new ArrayList<>();

		Collections.sort(Studentgrade, new Comparator<Map.Entry<Student, String>>() {
			@Override
			public int compare(Map.Entry<Student, String> o1, Map.Entry<Student, String> o2) {
				int result = 0;

				if (o2.getValue() == o1.getValue()) {
					result = o1.getValue().compareTo(o2.getValue());

				} else if (o1.getKey().getMarks() == o2.getKey().getMarks()) {
					result = o2.getValue().compareTo(o1.getValue());

				} else if (o2.getKey().getSname() == (o1.getKey().getSname())) {
					result = o1.getValue().compareTo(o2.getValue());

				} else if (o1.getKey().getSaddress() == o1.getKey().getSaddress()) {
					result = o2.getValue().compareTo(o1.getValue());
				} else {

				}
				return result;
			}

		});

		for (Student sortedStd : stdlist){
			System.out.println(sortedStd.getSno()+" "+sortedStd.getMarks()+" "+sortedStd.getSaddress()+" "+sortedStd.getGrade());

		}
	}
}
*/





	/*
			List<StudentListExample>list=new LinkedList<>();
			stdlist.add(new StudentListExample("reka",6,"hyd",87));
			stdlist.add(new StudentListExample("rema" ,6,"hyd",89));
			stdlist.add(new StudentListExample("janu",7,"punne",90));

			for(StudentListExample std :list) {
				System.out.println(list);*/




	//	}


		//int count = 1;
		/*List<Employee> empList = new ArrayList<>();
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




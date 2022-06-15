package com.codexbox.springboot.app;

import com.codexbox.springboot.app.renuProjects.multithreading.JoinThreadEx;
import com.codexbox.springboot.app.renuProjects.multithreading.JoinThreadEx;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) throws IOException, InterruptedException {/*{
		//int count = 1;
		*//*List<Employee> empList = new ArrayList<>();
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
	}
*//*


		List<StudentDetails> studentlist = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
StudentDetails  studentDetails=null;
		for (int i = 0; i < 2; i++) {
			System.out.println("student " + i + " details");
			System.out.println("enter student id: ");
			int studentnum = scanner.nextInt();
			System.out.println("enter student name : ");
			String name = scanner.next();
			System.out.println("enter student address: ");
			String adress = scanner.next();
			System.out.println("enter student marks: ");
			int marks = scanner.nextInt();

			int grade = (int)(marks / 600) * 100;
			String s;

			if (grade > 90) {
				s = " Grade1";
			} else if (grade <= 90 && grade > 60) {
				s = " Grade2";
			} else if (grade <= 60 && grade > 35) {
				s = "Grade3";
			} else {
				s = " Grade4";

			}


			 studentDetails = new StudentDetails(studentnum, name, adress, marks, s);
			studentlist.add(studentDetails);
		}
			for (StudentDetails details : studentlist) {
				System.out.println(details.getStudentnum() + " " + details.getName() + " " + details.getAdress() + " " + details.getMarks() + " " + details.getGrade());

			}
			*//*Map<StudentDetails,String> studentvalues= new HashMap<>();
			List<Map.Entry<StudentDetails, String>> studentmap;
			Collections.sort(studentDetails, new Comparator<Map.Entry<StudentDetails, String>>() {
				@Override
				public int compare(Map.Entry<StudentDetails, String> o1, Map.Entry<StudentDetails, String> o2) {
					int result = 0;
					if (o2.getValue() != o1.getValue()) {
						result = o1.getValue().compareTo(o2.getValue());
					} else if (o1.getKey().getMarks() != o2.getKey().getMarks()) {
						result = o2.getValue().compareTo(o1.getValue());
					} else if () {

					}

				}

			});
*//*


	}*/



		/*System.out.println(Weeks.THURSDAY.getvalue());
		System.out.println(Weeks.FRIDAY.name());
		System.out.println(Weeks.valueOf(Weeks.SUNDAY.name()));
		Map<String,Integer> mymap=new HashMap<>();
		mymap.put("")
*/


		/*InputStreamExample inputStreamExample=new InputStreamExample();
		inputStreamExample.fileInputStreamMethod();
*/


		/*BufferedInputStreamExample bufferinput=new BufferedInputStreamExample();
		bufferinput.buffermethod();
*/


		/*SequenceStreamExample example=new SequenceStreamExample();
		example.sequMethod();
*/
/*
		Mythread thread=new Mythread();
		thread.start();
		System.out.println(thread.getState());
		System.out.println("id is "+ thread.getId());
		System.out.println("name is " +thread.getName());
		try {
			thread.join(10000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println(thread.getState());
		MyThread2 thread2=new MyThread2();
		thread2.start();
		System.out.println(thread2.getState());*/


		JoinThreadEx  j1=new JoinThreadEx();
		JoinThreadEx j2=new JoinThreadEx();
		JoinThreadEx j3=new JoinThreadEx();
		j1.start();









/*

		MyRunnable runnable=new MyRunnable();
		//runnable.run();
		Thread t1=new Thread(runnable);
		t1.start();
		Thread t2=new Thread(runnable);
		t2.start();
		Thread t3=new Thread(runnable);
		t3.start();
		System.out.println(t1.getState());
		System.out.println(t1.getId());
		System.out.println(t2.getId());
		System.out.println(t3.getId());

*/



		/*System.out.println(thread.getPriority());
		try {
			thread.wait();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("waiting");
*/


		/*try {
			Thread.sleep(10000);
			System.out.println("timeup");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}*/





	}
}
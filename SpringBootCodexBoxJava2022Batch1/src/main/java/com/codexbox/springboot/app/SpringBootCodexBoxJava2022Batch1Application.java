package com.codexbox.springboot.app;

import com.codexbox.springboot.app.mounika.file.InputOutputStream;
import com.codexbox.springboot.app.mounika.multithreading.MyRunnable;
import com.codexbox.springboot.app.mounika.multithreading.Threading;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.Callable;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) throws InterruptedException {
//		SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
//		LinkedListExample example = new LinkedListExample();
//		System.out.println(example.loadMyList());


//		List<EmployeeDetails> list = new ArrayList<>();
//		Scanner sc = new Scanner(System.in);
//
//		for (int i = 0; i < 2; i++) {
//
//			System.out.println("enter employee  " + i + "  details");
//			//System.out.println();
//			EmployeeDetails employeeDetails = new EmployeeDetails();
//			System.out.println("enter employee name ");
//			employeeDetails.setName(sc.next());
//			System.out.println("enter employee id ");
//			employeeDetails.setId(sc.nextInt());
//			System.out.println("enter employee address");
//			employeeDetails.setAddress(sc.next());
//             list.add(employeeDetails);
//
//		}
//
//		for (int i=0;i<list.size();i++)
//
//		{
//			list.get(i).getDetails();
//		}
//		System.out.println("enter absent employee name");
//		Scanner scanner=new Scanner(System.in);
//		//EmployeeDetails scanner=new EmployeeDetails();
//
//		for(int i=0; i< list.size();i++){


		/*InputOutputStream inputOutputStream=new InputOutputStream();
		inputOutputStream.iooperation();
*/


		/*List<StudentList> myStudentList=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of students :  ");
		int numberstudent =sc.nextInt();
		for(int i=1;i<=numberstudent;i++){
			StudentList studentList=new StudentList();
			System.out.println("enter student details : ");
			System.out.println("enter student" + i + " id :" );
			studentList.setStudentId(sc.next());
			System.out.println("enter student "+ i + " name");
			studentList.setStudentName(sc.next());
			System.out.println("enter student" + i + " address");
			studentList.setStudentAddress(sc.next());
			System.out.println("enter student" + i+ " marks");
			studentList.setStudentMarks(sc.nextInt());
			System.out.println("average "+ " " + studentList.setAverage());
			studentList.add(studentList);

		}
*/

         /*Threading threading = new Threading();
         threading.run();
		System.out.println(threading.currentThread().getId());
		System.out.println(threading.currentThread().getName());

		Threading threading1 =new Threading();
		System.out.println(threading1.getId());
		System.out.println(threading1.getName());

		Thread thread =new Thread();
		System.out.println(thread.getId());
		System.out.println(thread.getName());



		Threading threading3 = new Threading();
		threading3.start();
		System.out.println(threading3.currentThread().getId());
		System.out.println(threading3.currentThread().getName());

		Threading threading4 =new Threading();
		System.out.println(threading4.getId());
		System.out.println(threading4.getName());

		Thread thread1 =new Thread();
		System.out.println(thread1.getId());
		System.out.println(thread1.getName());

		*/

		System.out.println(Thread.currentThread().getPriority());
		Threading threading = new Threading();
		System.out.println(threading.getState());
		threading.start();
		threading.getState();
		//Thread.sleep(100l);

		try {
			threading.sleep(1000l);
			System.out.println("inside try ");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		/*threading.sum();
		threading.setPriority();
		System.out.println("This is my thread");*/

     Threading threading5 =new Threading();
       threading5.start();
	   //threading5.hashCode();
		System.out.println(threading5.getState());

		Thread thread =new Thread();

		System.out.println(thread.getId());
		System.out.println(thread.getName());

		MyRunnable runnable=new MyRunnable();
	     runnable.hashCode();
		System.out.println("mouni");
		System.out.println(threading.getState());



		};

	}





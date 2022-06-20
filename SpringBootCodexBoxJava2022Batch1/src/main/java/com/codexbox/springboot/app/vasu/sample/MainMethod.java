package com.codexbox.springboot.app.vasu.sample;

import com.codexbox.springboot.app.vasu.sample.customerpurchasehistory.CustomerDetails;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication

public class MainMethod {
    public static void main(String[] args) throws SQLException {
        CustomerDetails customerDetails = new CustomerDetails();
        customerDetails.insertDetails();

        // assesment of customerpurchasehistory



//        CreateTable createTable=new CreateTable();
//        createTable.customerTable();
        // statement
    /*JdbcEx jdbcEx=new JdbcEx();
    List<Employee1>employee1List=jdbcEx.getEmployee1List();
    for (Employee1 emp:employee1List) {
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        System.out.println(emp.getAddress());*/

        // prepared statement
       /* JdbcEx1 jdbcEx1 = new JdbcEx1();
        List<Employee1> employee1List = jdbcEx1.employeeList();
        for (Employee1 emp : employee1List) {
            System.out.println(emp.getId());
            System.out.println(emp.getName());
            System.out.println(emp.getSalary());
            System.out.println(emp.getAddress());

        }*/
    /*System.out.println("Iam inside main method");
    int x=50;
    int y=40;
    int sum=sum(x,y);
    System.out.println(sum);
    MyThread myThread=new MyThread();
    Thread1 thread1=new Thread1();
    System.out.println(thread1.isAlive());
    System.out.println(myThread.isAlive());
    myThread.setPriority(10);
    thread1.setPriority(1);
    System.out.println(thread1.getPriority());
    thread1.start();
    myThread.start();
    System.out.println(myThread.getState());
    System.out.println(myThread.getPriority());
    try {
        Thread.sleep(10000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    System.out.println("sleep method");
    sum(20,30);
    sum=x+y;
    System.out.println("sum of two numbers");
    System.out.println(thread1.getState());

*/

		/*Thread1 thread1=new Thread1();
		thread1.run();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("time up");

		MyThread Thread=new MyThread();
		Thread.start();
		try {
			Thread.join(10000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("its lunch time");
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
*/
    }
}



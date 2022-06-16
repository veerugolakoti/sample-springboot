package com.codexbox.springboot.app.vasu.sample;

import com.codexbox.springboot.app.vasu.sample.multithreading.MyThread;
import com.codexbox.springboot.app.vasu.sample.multithreading.Thread1;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.Integer.sum;

@SpringBootApplication

public class MainMethod {public static void main(String[] args) {
    System.out.println("Iam inside main method");
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
*/sum(20,30);
    sum=x+y;
    System.out.println("sum of two numbers");
    System.out.println(thread1.getState());
}

}

package com.codexbox.springboot.app;


import com.codexbox.springboot.app.jhansiproject.multithreading.MyRunnable;
import com.codexbox.springboot.app.jhansiproject.multithreading.ThreadExample;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		ThreadExample thread=new ThreadExample();
		thread.multithreading();
		thread.run();
		thread.start();
		System.out.println(thread.getState());
		ThreadExample thread1=new ThreadExample();
		System.out.println(thread.getId());
		System.out.println(thread.getName());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println(thread1.getState());
		ThreadExample threads = new ThreadExample();
		threads.multithreading();
		threads.getName();
		System.out.println("Sleep method");
		MyRunnable run=new MyRunnable();
		run.hashCode();
		System.out.println("this is my thread");
		thread.getState();
		try {
			Thread.sleep(10000l);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println(thread.getState());



		/*SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
		LinkedListExample example = new LinkedListExample();
		System.out.println(example.loadMyList());
*/
		/*StackExample str=new StackExample();
		str.Stackoperations();
*/


	/*	EnumerationWeekday day=new EnumerationWeekday(EnumerationWeekday.WeekDay.valueOf("TUESDAY"));
		day.weekdaymethod();*/

		}
	}





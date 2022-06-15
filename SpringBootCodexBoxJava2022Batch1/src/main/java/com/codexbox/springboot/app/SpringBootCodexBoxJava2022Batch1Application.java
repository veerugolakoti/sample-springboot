package com.codexbox.springboot.app;


import com.codexbox.springboot.app.jhansiproject.multithreading.*;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
	/*	SetPriorityExample set=new SetPriorityExample();
		set.setPriority(Thread.MAX_PRIORITY);

		set.start();
		SetPriorityExample set1=new SetPriorityExample();
		set1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("priority of thread is:"+set1.getPriority());
		set1.setPriority(Thread.NORM_PRIORITY);
		System.out.println(set1.getPriority());

	}
*/
		ThreadPracticing thread=new ThreadPracticing();
		thread.start();
		Thread tr=new Thread();//to change the name of the thread.
		tr.setName("this is my thread");
		System.out.println(tr.getName());
	    ThreadExample2 th2=new ThreadExample2();
		ThreadExample2 th3=new ThreadExample2();

		th2.start();

		try {
			th2.join(500);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);

		}
		th3.start();

	}


	}
	/*	System.out.println(Thread.currentThread().getPriority());
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
*/


		/*SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
		LinkedListExample example = new LinkedListExample();
		System.out.println(example.loadMyList());
*/
		/*StackExample str=new StackExample();
		str.Stackoperations();
*/


	/*	EnumerationWeekday day=new EnumerationWeekday(EnumerationWeekday.WeekDay.valueOf("TUESDAY"));
		day.weekdaymethod();*/







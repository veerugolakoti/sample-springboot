package com.codexbox.springboot.app;


import com.codexbox.springboot.threading.MyThread1;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {
		public static void main(String[] args) throws InterruptedException {
			MyThread1 myThread1 = new MyThread1();
			myThread1.start();
			//myThread1.run();
			System.out.println("after start method : ");//1
			myThread1.getState();
			System.out.println("my thread is in main method :" + myThread1.getState());//5

			try {
				Thread.sleep(3265l);
				System.out.println("in main method thread is sleep :");//6
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			synchronized (myThread1){
				myThread1.wait(3265l);
				System.out.println("using wait method :");

			}




			// myThread1.start();
			//System.out.println("the main method :");//2

//			Threading threading= new Threading();
//			Thread thread = new Thread();
//			//threading.mythreadtesting();
//			//thread.sleep(10000l);
//			threading.run();
//			System.out.println(threading.getState());
//			threading.start();
//			System.out.println(threading.getState());
			//System.out.println();
			//System.out.println("my thread is slepping when is :");

//			//threading.run();
//			threading.mythreadtesting();
//			Thread thread = new Thread();
//			System.out.println(thread.getState());
//			System.out.println("the thread is running :");

//			ThreadExample te1 = new ThreadExample();
//			Thread thread = new Thread();
//			te1.run();
//			System.out.println("the state of thread is :" + te1.getPriority());
//			System.out.println("the state of thread group is :" + te1.getThreadGroup());
//			//System.out.println("the state of thread group is :" + te1.getThreadGroup());
//
//
//
//			System.out.println("the thread example name is :" + te1.getName());
//			System.out.println("the thread example id is :" + te1.getId());
//			System.out.println("the thread  name is :" + thread.getName());
//			System.out.println("the thread id is :" +thread.getId());
//
//			ThreadExample te2 = new ThreadExample();
//			System.out.println("the te2 id is :" + te2.getId());
//			System.out.println("the te2 name is :" + te2.getName());

	}
	}
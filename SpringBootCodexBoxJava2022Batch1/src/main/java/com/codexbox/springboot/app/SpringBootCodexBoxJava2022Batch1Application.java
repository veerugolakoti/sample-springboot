package com.codexbox.springboot.app;


import com.codexbox.springboot.threading.ThreadExample;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {
		public static void main(String[] args) {
			ThreadExample te1 = new ThreadExample();
			Thread thread = new Thread();
			te1.run();
			System.out.println("the state of thread is :" + te1.getPriority());
			System.out.println("the state of thread group is :" + te1.getThreadGroup());
			//System.out.println("the state of thread group is :" + te1.getThreadGroup());



			System.out.println("the thread example name is :" + te1.getName());
			System.out.println("the thread example id is :" + te1.getId());
			System.out.println("the thread  name is :" + thread.getName());
			System.out.println("the thread id is :" +thread.getId());
//
//			ThreadExample te2 = new ThreadExample();
//			System.out.println("the te2 id is :" + te2.getId());
//			System.out.println("the te2 name is :" + te2.getName());

	}
	}
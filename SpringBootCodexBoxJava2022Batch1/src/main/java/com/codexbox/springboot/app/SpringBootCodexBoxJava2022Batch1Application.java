package com.codexbox.springboot.app;


import com.codexbox.springboot.app.assesment3.CalculateGrade;
import com.codexbox.springboot.app.assesment3.StudentClass;
import com.codexbox.springboot.app.jhansiproject.collections.StackExample;
import com.codexbox.springboot.app.jhansiproject.enumeration.EnumerationWeekday;
import com.codexbox.springboot.app.jhansiproject.enumeration.Month;
import com.codexbox.springboot.app.jhansiproject.multithreading.ThreadExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		ThreadExample thread=new ThreadExample();
		thread.multithreading();
		thread.run();
		thread.run();
		ThreadExample thread1=new ThreadExample();
		thread.run();
		thread.run();


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





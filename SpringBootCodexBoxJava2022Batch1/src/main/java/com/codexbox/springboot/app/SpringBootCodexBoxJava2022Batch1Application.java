package com.codexbox.springboot.app;


import com.codexbox.springboot.app.jhansiproject.collections.StackExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		/*SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
		LinkedListExample example = new LinkedListExample();
		System.out.println(example.loadMyList());
*/
		StackExample str=new StackExample();
		str.Stackoperations();





	}

}
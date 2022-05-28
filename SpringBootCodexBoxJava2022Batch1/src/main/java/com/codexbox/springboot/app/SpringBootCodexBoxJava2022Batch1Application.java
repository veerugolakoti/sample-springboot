package com.codexbox.springboot.app;


import feature_ranjan.assignement.AssignementCollection;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCodexBoxJava2022Batch1Application {

	public static void main(String[] args) {
		/*SpringApplication.run(SpringBootCodexBoxJava2022Batch1Application.class, args);
		LinkedListExample example = new LinkedListExample();
		System.out.println(example.loadMyList());*/

//Ranjan Assignement in Collection
		AssignementCollection assignCol = new AssignementCollection();


		assignCol.collectionAssign();



	}

}

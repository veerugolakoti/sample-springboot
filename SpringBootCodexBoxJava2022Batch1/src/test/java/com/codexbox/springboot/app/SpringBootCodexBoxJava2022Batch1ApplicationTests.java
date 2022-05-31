package com.codexbox.springboot.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class SpringBootCodexBoxJava2022Batch1ApplicationTests {


	@Test

	public void setprogram() {
		ArrayDeque<String> queue = new ArrayDeque<>();
		queue.add("123");
		queue.add("456");
		queue.add("789");
		System.out.println(queue);

	}


	@Test
	public void sampleset() {
		HashSet<String> name = new HashSet<>();
		name.add("car");
		name.add("bike");
		name.add("bus");
		name.add("car");

		System.out.println("enter the  value :" + name);
		System.out.println("Before sorting :" + name);
		//name.retainAll();
		System.out.println("After retains all :" + name);
	}

		@Test

	public void Mapsets() {
		Map<String, Integer> hashmap = new HashMap<>();
		hashmap.put("Mounika", 12);
		hashmap.put("Divya", 10);
		hashmap.put("Dinesh", 23);
		hashmap.put("Sohail", 88);
		System.out.println(hashmap.get("Mounika"));
		System.out.println("my map :" + hashmap);
		System.out.println("Divya value is :" + hashmap.get("Divya"));


		}



	@Test

	      public void setexample(){


	}
		}



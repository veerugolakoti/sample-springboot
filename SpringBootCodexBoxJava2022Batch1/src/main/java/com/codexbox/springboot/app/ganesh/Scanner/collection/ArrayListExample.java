package com.codexbox.springboot.app.ganesh.Scanner.collection;

import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

import java.util.Collection;

@SpringBootTest
public
class ArrayListExample {


	@Test
	public void test() {
		Collection<String> empCollections = new java.util.ArrayList<>();
		empCollections.add("ganesh");
		empCollections.add("leela");
		empCollections.add("jaddu");
		empCollections.add("vamshi");
		empCollections.add("bhargava");
		empCollections.add("ram");
		empCollections.add("ganesh");
		empCollections.add("leela");
		empCollections.add("jaddu");
		empCollections.add("jhansi");
		empCollections.add("swathi");
		empCollections.add("teja");
		empCollections.add("vasu");
		empCollections.add("sohail");
		empCollections.add("kalyan");
		empCollections.add("shiva");
		empCollections.add("chandan");
		empCollections.add("rehana");
		System.out.println(empCollections.parallelStream());

//		HashSet<String> var = new HashSet<>(empCollections);
//		for (String str : var)
//			System.out.println(str);
//     System.out.println(str+"name is "+Collections.frequency(empCollections,str));
	}


}



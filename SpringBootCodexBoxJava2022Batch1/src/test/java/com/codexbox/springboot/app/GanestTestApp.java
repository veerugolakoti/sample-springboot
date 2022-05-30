package com.codexbox.springboot.app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

@SpringBootTest
class GanestTestApp {


	@Test
	void contextLoads() {
	}

	@Test
	public void calculate() {
		Collection<String> empCollections = new ArrayList<>();
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

		int count =0;

		HashSet<String> var = new HashSet<>(empCollections);
		for (String str : var)
			System.out.println(str);
//        System.out.println(str+"name is "+Collections.frequency(empCollections,str));
	}


}



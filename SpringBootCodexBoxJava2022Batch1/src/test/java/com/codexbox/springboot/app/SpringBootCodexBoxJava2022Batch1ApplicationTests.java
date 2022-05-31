package com.codexbox.springboot.app;

import com.codexbox.springboot.app.dhivya.collections.HashsetOperation;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

//@SpringBootTest
class SpringBootCodexBoxJava2022Batch1ApplicationTests {

	@Test
	public void hashsetExample(){
		HashSet<String>hashSet=new LinkedHashSet<>();
		hashSet.add("divya");
		hashSet.add("mounika");
		hashSet.add("divya");
		hashSet.add("dinesh");
		hashSet.add("sohail");
		hashSet.add("vamshi");
		System.out.println("duplicate value from my list : " +hashSet);

		List<String> mylist=new ArrayList<>(hashSet);
		System.out.println("the index value of my list : " + mylist.get(3));
		mylist.add("junaid");
		System.out.println("the new added value: " + mylist);

	}

	@Test
	public void treeSetExample(){
		List<String >mylist=new LinkedList<>();
		mylist.add("divya");
		mylist.add("ram");
		mylist.add("swathi");

		Set<String>setTree =new TreeSet<>();
		setTree.add("divya");
		setTree.add("mounika");
		setTree.add("junaid");
		setTree.add("dinesh");
		setTree.add("sohail");
		setTree.add("vamshi");
		System.out.println("the list : " +setTree);

		System.out.println("after retain: " + setTree.retainAll(mylist));

	}

	@Test
	public void hashMap(){
		Map<String ,Integer> hashmap=new HashMap<>();
		hashmap.put("dhivya",12);
		hashmap.put("mouni",21);
		hashmap.put("sohail",3);
		hashmap.put("junaid",-10);
		hashmap.put("dinesh",10);
		System.out.println("total size: " + hashmap.size() );
		System.out.println(" names : " + hashmap);



	}




}

package com.codexbox.springboot.app;

import com.codexbox.springboot.app.Veeru.Collections.MyAbstractList;
import com.codexbox.springboot.app.Veeru.Collections.StackExample;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class SpringBootCodexBoxJava2022Batch1ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testStackOperations() {
		StackExample stackExample = new StackExample();
		stackExample.stackOperations();
		/*MyAbstractList myAbstractList = new MyAbstractList();
		myAbstractList.add(1, 2);*/

	}

	@Test
	public void testArrayDequeue() {
		ArrayDeque queue = new ArrayDeque<>();
		queue.add("Name1");//0
		//queue.add(1);
		queue.add("Name2");//1
		queue.add("Name3");//2

		System.out.println("The size of my Queue: " + queue.size());
		System.out.println("my first element form quer: "+ queue.getFirst());
		System.out.println("My last element form queue: " + queue.getLast());

		System.out.println("The size of my queue after Poll: " + queue.size());

		System.out.println("Offer : " + queue.offer("Offer"));
		System.out.println("Peek : " + queue.peek());
	//	System.out.println("Peek : " + queue.peek());
		System.out.println("Poll:" + queue.poll());
	//	System.out.println("Poll:" + queue.poll());
		try {
			System.out.println(queue.toArray());
		} catch (Exception ex) {
			System.out.println("got exception while converting my quueue to Array");
		}
	}

	@Test
	public  void testSetOperations() {
		HashSet<String> hashSet	= new LinkedHashSet<>();
		hashSet.add("Veeru");
		hashSet.add("Mounika");
		hashSet.add("Divya");
		hashSet.add("Divya");
		System.out.println("Values from my Set: " + hashSet);

		for (String name : hashSet) {
			System.out.println("Name is : " + name);
		}
		System.out.println("The value at inded 0 from my set is : " + hashSet.iterator().next());
		System.out.println("The value at inded 1 from my set is : " + hashSet.iterator().next());

		List<String> arrayList	= new ArrayList<>(hashSet);

		System.out.println("Values from my list: " + arrayList);

		System.out.println("The value at inded 1 is : " + arrayList.get(1));


	}



}

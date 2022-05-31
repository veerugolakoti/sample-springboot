package com.codexbox.springboot.app;

import com.codexbox.springboot.app.Veeru.Collections.MyAbstractList;
import com.codexbox.springboot.app.Veeru.Collections.StackExample;
import com.codexbox.springboot.app.Veeru.Employee;
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

	@Test
	public void testTreeSet() {
		ArrayDeque queue = new ArrayDeque<>();
		queue.add("Mounika");//0
		//queue.add(1);
		queue.add("Name2");//1
		queue.add("Name3");//2

		HashSet<String> hashSet	= new HashSet<>();
		hashSet.add("Veeru");
		hashSet.add("Mounika");
		hashSet.add("Divya");
		hashSet.add("Divya");
		System.out.println("Before sorting : " + hashSet);
		hashSet.retainAll(queue);

		System.out.println("After retain all method : " + hashSet);

		List<String> namesSet = new ArrayList<>(hashSet);
		namesSet.add("teja");
		namesSet.add("Bhargav");
		System.out.println("After sorting : " + namesSet);
		System.out.println("Split iterator:" + namesSet.spliterator().characteristics());


	}
	@Test
	public  void testMapOperations() {
		Map<Integer, String> map = new HashMap();
		map.put(1, "Veeru");
		map.put(2, "Ram");
		map.put(3, "Ravali");
		map.put(45, "Viswa");

		Employee employee1 = new Employee("Bhargav", 202284, "Nellore");
		Employee employee2 = new Employee("Kalayan", 202286, "NZB");
		Employee employee3 = new Employee("Ramesh", 202290, "Ongole");

		Map<String, Employee> employeeMap =  new HashMap<>();
		employeeMap.put("employee1", employee1);
		employeeMap.put("employee2", employee2);
		employeeMap.put("employe3", employee3);

		System.out.println("My employee map : " + employeeMap);
		Collection<Employee> employeeCollection =  employeeMap.values();

		for (Employee emp :  employeeCollection) {
			System.out.println("employee name is : " + emp.getName());
		}

		Employee emp = employeeMap.get("employee2");
		System.out.println("employee2 name is : " + emp.getName());

		System.out.println("My map : " + map);
		System.out.println("Rams value is : " + map.get(2));
		Set<Integer> myKest = map.keySet();
		System.out.println("My all keys from my map: "+ myKest);
		System.out.println("My all values from my map: " + map.values());

		for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
			System.out.println("My key: " + entry.getKey( ) + " My Value " + entry.getValue().getName());
		}



	}



}

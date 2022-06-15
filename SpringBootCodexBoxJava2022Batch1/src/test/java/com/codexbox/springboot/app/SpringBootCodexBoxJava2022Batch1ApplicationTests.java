package com.codexbox.springboot.app;

import com.codexbox.springboot.app.Veeru.Collections.StackExample;
import com.codexbox.springboot.app.Veeru.Employee;
import com.codexbox.springboot.app.vidyadarna.collections.ExampleStack;
import com.codexbox.springboot.app.vidyadarna.fileInputOutput.*;
import com.codexbox.springboot.app.vidyadarna.threadconcepts.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
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


	public static class VidyaTest {
		@Test //stack example
		public void Test() {
			ExampleStack exampleStack = new ExampleStack();
			Stack<String> str = new Stack<>();
			boolean result = str.empty();
			System.out.println("the stack is empty : " + result);
			str.push("anusha");
			str.push("ramya");
			str.push("ram");
			str.push("vv");
			result = exampleStack.Stackmethod();
			System.out.println("elements in stack :" + str);
			System.out.println("the stack is empty : " + result);
			String s = str.pop();
			System.out.println("print pop concept " + s);
			String s2 = str.peek();
			System.out.println("print peek concept " + s2);
			int s3 = str.search("vv");
			System.out.println("print search concept " + s3);
		}

		//set example
		@Test
		public void set1() {
			// SetMethodExamples set1 = new SetMethodExamples();
			HashSet<Integer> set = new HashSet<>();
			set.add(44);
			set.add(22);
			set.add(44);
			set.add(43);
			set.add(33);
			set.add(33);
			set.add(32);
			System.out.println("add the integer values" + set);

			boolean result = set.contains(37);
			System.out.println("contain using set method " + result);
			set.toArray();
			System.out.println("the set is empty or not " + set);
			set.remove(32);
			System.out.println("remove the value is " + set);
			Iterator<Integer> i = set.iterator();
			System.out.println("iterating over list is " + i.next());
			set.clear();
			System.out.println(set);

		}

		@Test //tree set example
		public void testTreesetExamples() {
			HashSet<String> ts = new HashSet<>();
			ts.add("vidya");
			ts.add("vv");
			ts.add("mounika");
			ts.add("ddi");
			ts.add("vv");
			ts.add("abhi");

			System.out.println("before sorting " + ts);
			Set<String> tset = new TreeSet<>(ts);
			System.out.println("after sorting" + tset);
			tset.add("fox");
			System.out.println("after add the collection is " + tset);
			//  tset.contains("ddi
			boolean rs = tset.contains("ddi");
			System.out.println("this is true or not : " + rs);
			tset.removeAll(tset);
			System.out.println("after removeall " + tset);
			tset.add("vidya");
			System.out.println("again add the values " + tset);
			tset.spliterator();
			System.out.println("using spliterator " + tset);
		}

		@Test //queue example
		public void testQueueExample() {
			Queue<String> qe = new LinkedList<>();
			qe.add("ravali");
			qe.add("veeru");
			qe.add("jansi");
			qe.add("vidya");
			qe.add("mouni");
			qe.add("vv");
			qe.add("vidya");
			System.out.println(qe);
			System.out.println("the peek value is " + qe.peek());
			System.out.println("the poll value is " + qe.poll());
			System.out.println("the again poll " + qe.poll());
			System.out.println("the again poll " + qe.poll());
			//priority queue example
			Queue<String> pqueue = new PriorityQueue<>(qe);
			pqueue.add("vvv");
			pqueue.add("dhanu");
			pqueue.add("deekshu");
			pqueue.add("dhanu");
			System.out.println("the priority queue values is " + pqueue);
			System.out.println("the priority queue in peek " + pqueue.peek());
			System.out.println("the priority queue in poll " + pqueue.poll());
			//x below queue converts into set
			Set<String> str = new TreeSet<>(pqueue);
			System.out.println("the queue values are " + str);
		}

		@Test //map example
		public void testMapExample() {
			Map<String, Integer> mapex = new HashMap<String, Integer>();
			mapex.put("vidya", 1);
			mapex.put("divya", 2);
			mapex.put("dhanu", 3);
			mapex.put("deeksha", 4);
			mapex.put("dhanu", 5);
			System.out.println("the map method values are " + mapex);
			mapex.keySet();
			System.out.println("the map in only key set strings " + mapex.keySet());
			System.out.println("the map in only values " + mapex.values());
			boolean result = mapex.isEmpty();
			System.out.println("the map is " + result);

			com.codexbox.springboot.app.vidyadarna.Employee employee1 = new com.codexbox.springboot.app.vidyadarna.Employee("veeru", 100, "hyd");
			com.codexbox.springboot.app.vidyadarna.Employee employee2 = new com.codexbox.springboot.app.vidyadarna.Employee("abhi", 104, "sidhipet");
			com.codexbox.springboot.app.vidyadarna.Employee employee3 = new com.codexbox.springboot.app.vidyadarna.Employee("sandya", 105, "jangon");
			com.codexbox.springboot.app.vidyadarna.Employee employee4 = new com.codexbox.springboot.app.vidyadarna.Employee("sravani", 106, "gnp");
			com.codexbox.springboot.app.vidyadarna.Employee employee5 = new com.codexbox.springboot.app.vidyadarna.Employee("sathya", 166, "tkd");
			com.codexbox.springboot.app.vidyadarna.Employee employee6 = new com.codexbox.springboot.app.vidyadarna.Employee("kavya", 177, "uppal");

			Map<String, com.codexbox.springboot.app.vidyadarna.Employee> employeeMap = new TreeMap<>();
			employeeMap.put("employee1", employee1);
			employeeMap.put("employee2", employee2);
			employeeMap.put("employee3", employee3);
			employeeMap.put("employee4", employee4);
			employeeMap.put("employee5", employee5);
			employeeMap.put("employee6", employee6);
			System.out.println("my employee map is : " + employeeMap);

			Collection<com.codexbox.springboot.app.vidyadarna.Employee> employeelist = employeeMap.values();
			for (com.codexbox.springboot.app.vidyadarna.Employee employee : employeelist) {
				System.out.println("employee Map : " + employee.getEmployeeName());
			}
			com.codexbox.springboot.app.vidyadarna.Employee employee = employeeMap.get("employee2");
			System.out.println("employee name 2 is : " + employee.getEmployeeName());
			System.out.println("my map is  " + mapex);
			System.out.println("vidya value is " + mapex.get("vidya"));
			Set<String> myKst = mapex.keySet();
			System.out.println("my all keys from my map " + myKst);
			//  Set<Integer> mykst = mapex.keySet();

			System.out.println("my all values from my map " + mapex.values());
			for (Map.Entry<String, com.codexbox.springboot.app.vidyadarna.Employee> emp : employeeMap.entrySet()) {
				System.out.println("my key :   " + emp.getValue().getEmployeeId() + " my value :" + emp.getValue().getEmployeeName());
			}
		}

		@Test
		public void sortTestExample() {
			SortedMap<Integer, String> sm = new TreeMap<>();
			sm.put(9, "vidya");
			sm.put(2, "mounika");
			sm.put(3, "thara");
			sm.put(7, "kavitha");
			sm.put(8, "ravali");
			System.out.println("the values in soring map " + sm);
		}

		@Test
		public  void TestIO() throws IOException {
			InputOutputStreamExample example = new InputOutputStreamExample();
			example.inputOutputStreamExample();
			//        for(int i = 0; i < 5; i++) {
			//            System.out.println(i +" ");
			//        }
		}
		@Test
		public void TestBuferedInputOutput(){
			BufferedInputOutputExample buffered = new BufferedInputOutputExample();
			buffered.bufferedInputStream();
		}
		@Test
		public void TestCharArray() throws IOException {
			CharArrayExample charRW = new CharArrayExample();
			charRW.charArrayExample();

		}
		@Test
		public  void TestSequence() throws IOException {
			SequenceExample sequenceExample = new SequenceExample();
			sequenceExample.sequenceInputStream();
		}
		@Test
		public  void  TestByteArray() throws IOException {
			ByteArrayExample byteArrayExample = new ByteArrayExample();
			byteArrayExample.byteArray();
		}
		@Test
		public void TestDataStreamExample() throws IOException {
			DataStreamExample dataStreamExample = new DataStreamExample();
			dataStreamExample.dataStream();
		}
		@Test
		public void Thread() throws InterruptedException {
			Thread thread = new Thread();
			System.out.println("my thread state now : "+thread.getState());
			System.out.println("Thread name : "+thread.getName());
			System.out.println("Thread id : " +thread.getId());
//			ThreadExample1 threadExample = new ThreadExample1();
//			threadExample.run();
//		System.out.println(threadExample.getId());
//			System.out.println(threadExample.getName
			ThreadExample2 threadExample2 = new ThreadExample2();
			threadExample2.start();
			//threadExample2.run();
			//	System.out.println("my sum value : " +threadExample2.setName(););
			System.out.println("my thread name is "+threadExample2.getName());
			System.out.println("my thread id is " +threadExample2.getId());
			System.out.println("my state is :   " + threadExample2.getState());
			System.out.println("my programe line number1");

			PriorityExample1  priortyExample1= new PriorityExample1();
			priortyExample1.start();
			System.out.println("my priority1Example state " +priortyExample1.getState());
			PriorityExample2 priority2Example = new PriorityExample2();
			priority2Example.start();

			thread.setPriority(5);
			threadExample2.setPriority(3);
			priortyExample1.setPriority(1);
			priority2Example.setPriority(7);

			System.out.println("my Priority2Example priority is : " +priority2Example.getPriority());
			System.out.println(" my ThreadExample2 priority : "+threadExample2.getPriority());
			System.out.println("my Thread priority : " + thread.getPriority());
			System.out.println("my priority1Example priority :  " +priortyExample1.getPriority());
			//System.out.println("my progarmme terminated or not  : " + Thread.currentThread().getState());
			//Thread.sleep(10000l);

//			System.out.println("my thread terminated or not  :" + threadExample2.getState());
			Thread.sleep(10000l);
			System.out.println(threadExample2.getState());
//			System.out.println(	Thread.currentThread().getId());
//			System.out.println(	Thread.currentThread().getName());

		}
		@Test
		public  void TestSynchronizationExample(){
			SynchronizExample syn = new SynchronizExample();
			SynchronizationExample2 syn2 = new SynchronizationExample2();
			SynchronizationExample3 syn3 = new SynchronizationExample3();
              syn2.start();
			  syn3.start();
		}
	}
}



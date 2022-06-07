package com.codexbox.springboot.app;

import com.codexbox.springboot.app.vasu.sample.assesment.Employee;
import com.codexbox.springboot.app.vasu.sample.assesmentex.Employee1;
import org.junit.jupiter.api.Test;

import java.util.*;

public class VasuTest {/*
    @Test
    *//*public void testPriorityQueue(){
        PriorityQueue queue=new PriorityQueue();
        queue.add("name1");
        queue.add("name2");
        queue.add("name3");
        queue.add("name4");
        System.out.println("queue size:"+queue.size());
        System.out.println("queue poll:"+queue.poll());
        System.out.println("queue peek:"+queue.peek());
        System.out.println("queue remove:"+queue.remove());
        try {
            System.out.println("queue toArray:" + queue.toArray());
        }
        catch (Exception e){
            System.out.println("got exception while converting queue to array");
        }

    }*/
    /*@Test
            public void testOperators() {
        // *LIST...
        // 1) arraylist
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("vaasu");
        arrayList.add("vaasu1");
        arrayList.add("vaasu2");      // list allowes duplicates
        arrayList.add("vaasu3");
        arrayList.add("vaasu1");
        System.out.println("Arraylist:"+arrayList);

        // list-arraylist

        List<String>arraylist1=new ArrayList<>();
        arraylist1.add("vasu");
        arraylist1.add("vasu1");
        arraylist1.add("vasu2");      // list allowes duplicates
        arraylist1.add("vasu3");
        arraylist1.add("vasu1");
        System.out.println("Arraylist:"+arrayList);

        // 2) linked list

        LinkedList<String>items=new LinkedList<>();
        items.add("milk");
        items.add("milk");
        items.add("sugar");
        items.add("vegetables");
        items.add("oil");
        System.out.println("LinkedList:"+items);
        System.out.println(items.getFirst());
        System.out.println(items.peek());

        // list - linkedlist

        List<String>cities=new LinkedList<>();
        cities.add("hyderabad");
        cities.add("secunderbad");
        cities.add("mumbai");
        cities.add("chennai");
        cities.add("bengalore");
        System.out.println("cities:"+cities);
        System.out.println("cities:"+cities.size());


        //3)SET-hash set
        HashSet<String> linkedHashsetet = new HashSet<>();
        linkedHashsetet.add("vaasu");
        linkedHashsetet.add("vaasu1");
        linkedHashsetet.add("vaasu2");        // hash set will not allowed dulicates..
        linkedHashsetet.add("vaasu3");
        linkedHashsetet.add("vaasu");
        System.out.println("Hash set:"+linkedHashsetet);

        for (String str:linkedHashsetet) {
            System.out.println("str:"+str);
        }
        System.out.println("The value of inded 0 from my set is:"+linkedHashsetet.iterator().next());
        System.out.println("The value of inded 0 from my set is:"+linkedHashsetet.iterator().next());

        //  linked hashset

        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashsetet.add("vaasu");
        linkedHashsetet.add("vaasu1");
        linkedHashsetet.add("vaasu2");        // hash set will not allowed dulicates..
        linkedHashsetet.add("vaasu3");
        linkedHashsetet.add("vaasu");
        System.out.println("Hash set:"+linkedHashsetet);
        System.out.println(linkedHashSet.stream().spliterator());




    }*/

   /* @Test
   public void hashMap(){
        Map<String,Integer>hashmap=new HashMap<>();
        hashmap.put("vaasu",24);
        hashmap.put("sandeep",27);
        hashmap.put("madhu",26);
        hashmap.put("srinivas",32);
        System.out.println("HashMap:"+hashmap);
        System.out.println(hashmap.keySet());
        System.out.println(hashmap.replace("srinivas",3));
        System.out.println(hashmap.values());

    }*/

   /* @Test

    public void map(){
        Map<String,Integer>map=new HashMap<>();

        map.put("vaasu",24);
        map.put("vasu",22);
        map.put("sunil",30);
        map.put("vinod",31);
        map.put("srikanth",32);
        System.out.println("map:"+map);
        Employee employee1=new Employee("vaasu",1234,"kphb");
        Employee employee2= new Employee("madhu",5648,"kukatpally");
        Employee employee3=new Employee("sandeep",5673,"SR nagar");

        Map<String,Employee>map1=new HashMap<>();
        map1.put("employee1",employee1);
        map1.put("employee2",employee2);
        map1.put("employee3",employee3);
        System.out.println("map1:"+map1);

        Collection<Employee>employeeCollection=map1.values();
        for (Map.Entry<String, Employee> entry : map1.entrySet()) {
            System.out.println("My Employee Details: " + entry.getKey( ) + " My Value " + entry.getValue().getName());
            System.out.println("My Employee Details: " + entry.getKey( ) + " My Value " + entry.getValue().getId());
            System.out.println("My Employee Details: " + entry.getKey( ) + " My Value " + entry.getValue().getAddress());
        }
    }*/
    	/*@Test
	void contextLoads() {
	}

	@Test
	public void testStackOperations() {
		StackExample stackExample = new StackExample();
		stackExample.stackOperations();
		*//*MyAbstractList myAbstractList = new MyAbstractList();
		myAbstractList.add(1, 2);*//*

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
	      //========Employee========
       /*    List<Employee> employeeList=new ArrayList<>();
            Scanner obj=new Scanner(System.in);
            for (int i = 1; i <=29 ; i++) {
                System.out.println("Enter Employee" + i + "Details");

                System.out.println("Enter employee name: ");
                String name =obj.next();
                System.out.println("Enter employee Id: ");
                int Id=obj.nextInt();
                System.out.println("Enter employee Address: ");
                String address =obj.next();

                Employee employee=new Employee(name,Id,address);
                employeeList.add(employee);
            }
            System.out.println("my total employees:" +employeeList.size());


           List<Employee1> list=new ArrayList<>();
            Scanner obj=new Scanner(System.in);
            for(int i=1;i<=2;i++) {

                Employee1 employee1 = new Employee1();
                System.out.println("Enter the Empoyee:" + i + "Details: ");
                employee1.provideDetails();
                list.add(employee1);
            }

            Scanner obj1=new Scanner(System.in);
            System.out.println("Enter name you want to remove: ");
            String Name= obj1.nextLine();
            Employee1 employee1=new Employee1();
            for(int i=0;i<=2;i++){

            }*/



 /* // Enum numbers...
	@Test
	public void Seasons() {


		List<Integer> testnumbers = new ArrayList<>();
		testnumbers.add(1);
		testnumbers.add(2);
		testnumbers.add(3);
		System.out.println(Seasons.SUMMER.name());
		System.out.println(Seasons.SPRING.ordinal());
		System.out.println(Seasons.SPRING.getValue());
		System.out.println(Seasons.FALL.name());
		System.out.println(Seasons.WINTER.name());
	}*/
    //  InputOutputStreams




}



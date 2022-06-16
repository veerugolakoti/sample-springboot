package com.codexbox.springboot.app;
import com.codexbox.springboot.app.Veeru.Collections.StackExample;
import com.codexbox.springboot.app.Veeru.Collections.StudentGradeAssessment;
import com.codexbox.springboot.app.Veeru.employee.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootCodexBoxJava2022Batch1ApplicationTests {
    public static void main(String[] args) {
        BufferedInputOutputStream bufferInputOutputStream= new BufferedInputOutputStream();
        bufferInputOutputStream.bufferOutput();
     //   bufferInputOutputStream.bufferInput();



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


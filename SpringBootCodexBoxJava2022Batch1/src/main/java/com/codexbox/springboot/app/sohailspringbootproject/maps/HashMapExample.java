package com.codexbox.springboot.app.sohailspringbootproject.maps;

import com.codexbox.springboot.app.sohailspringbootproject.employee.Employee;
import org.junit.Test;

import java.util.*;

public class HashMapExample {
@Test
    public void hashMapMethod(){
    /*    Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Sohail" ,12);
        hashMap.put("Mounika" , 22);
        hashMap.put("Divya" , 3);
        hashMap.put("Junaid" , 44);
        hashMap.put("Vamsi",5);
        System.out.println("After using the HashMap : ");
        System.out.println(hashMap);


//        Linked hashmap maintains the insertion order with KEY VALUE
        Map<String , Integer> linkedHashMap = new LinkedHashMap<>(hashMap);
        System.out.println("After using the Linked Hashmap");
        System.out.println(linkedHashMap);*/
    Map<String,Employee> employeeMap = new HashMap();
    Employee emp = new Employee("Sohail", 1, "hyd");
    Employee emp1= new Employee("Junaid",456,"Hyd");
    Employee emp2 = new Employee("Mounika",876,"Ongole");
    employeeMap.put("key1", emp);
    employeeMap.put("Key 2",emp1);
    employeeMap.put("Key 3", emp2);
    System.out.println("after using the hashmap ");
    System.out.println(employeeMap);

    System.out.println(employeeMap.get("Key 1").getName());
    for (Employee employee: employeeMap.values()) {
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println(employee.getName());
        System.out.println(employee.getId());
        System.out.println(employee.getAddress());
    }

   /* Set<String> hashSet = new HashSet<>();
    hashSet.add("Sohial");
    hashSet.add("Veeru");
    hashSet.add("Junaid");
    System.out.println("Using the Hashset values");
    System.out.println(hashSet);

    Set<String> linkedHashset = new LinkedHashSet<>(hashSet);
    System.out.println("Using the Linked hashset");
    System.out.println(linkedHashset);
*/
    }
}

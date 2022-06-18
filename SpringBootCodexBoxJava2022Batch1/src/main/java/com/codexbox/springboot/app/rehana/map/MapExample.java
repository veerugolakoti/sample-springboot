package com.codexbox.springboot.app.rehana.map;



import com.codexbox.springboot.app.rehana.employedetails.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class MapExample {
    public void mapOperations() {

      Map<String,Integer> map = new HashMap<>();
        map.put("urdu",1);
        map.put("arabic",2);
        map.put("english",3);
        map.put("tamil",4);
        System.out.println( map.size());
        System.out.println( map.entrySet());
        System.out.println( map.values());
        Map<Integer,String> map2 = new HashMap<>();
        map2.put(10,"rimsha");
        map2.put(20,"zainab");
        map2.put(7,"arha");
        map2.put(9,"alia");
        map2.put(11,"aiza");
        Employee emp1 = new Employee("swathi",202250,"warangal");
        Employee emp2 = new Employee("divya",202229,"chennai");
        Employee emp3 = new Employee("rehana",202258,"hyderabad");
        Map<String,Employee> myEmp = new HashMap<>();
        myEmp.put("employee1",emp1);
        myEmp.put("Employee2",emp2);
        myEmp.put("employee3",emp3);
        System.out.println("my employee map :"+myEmp);
        Collection<Employee>employeeCollection = myEmp.values();
        for (Employee emp:employeeCollection) {
            System.out.println("employee name is : " +emp.getName());
        }



    }

}












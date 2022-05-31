package springboot.nag.collections;

import java.util.LinkedHashSet;

public class LinkedHashOperations {
    public void testOperations (){
        LinkedHashSet<Integer> evennumbers=new LinkedHashSet<>();
        evennumbers.add(2);
        evennumbers.add(4);
        evennumbers.add(6);
        evennumbers.add(8);
        System.out.println("Evennumbers : "+evennumbers);
        LinkedHashSet<Integer> numbers=new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        System.out.println(" numbers :"+numbers);
      /*  numbers.addAll(evennumbers);
        System.out.println("union is "+numbers);
        numbers.retainAll(evennumbers);
        System.out.println("Intersection  numbers is :"+numbers);
          boolean result= evennumbers.containsAll(numbers);
        System.out.println("subset or not "+result);*/
        numbers.remove(3);
        System.out.println("after removing element "+numbers);



    }
}

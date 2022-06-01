package collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void mySet(){
        TreeSet<String> set=new TreeSet<>();
        set.add("kalyan");
        set.add("raju");
        set.add("raj");
        set.add("ram");
        set.add("kalyan");
        set.add("chandan");
//        set.add("vamshi");
        System.out.println("assending order :" +set);
        System.out.println("desending order :"+set.descendingSet());

        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());
    }
}
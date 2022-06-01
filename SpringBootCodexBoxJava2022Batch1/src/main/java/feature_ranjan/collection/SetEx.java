package feature_ranjan.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
    public void setex(){
        Set<String> set = new HashSet<>();
        set.add("new");
        set.add("bike");
        set.add("is");
        set.add("better");
        set.add("bike");

        System.out.println("eliminate duplicate :"+set);

        Set<String> set1 = new LinkedHashSet<>();
        set1.add("a");
        set1.add("z");
        set1.add("b");
        set1.add("b");




        System.out.println("insertion order :"+set1);

        Set<String> treset = new TreeSet<>(set1);




        System.out.println("shorted order :"+ treset);
        set1.addAll(set);
        System.out.println("adding all :"+set1);

        set1.remove("b");
        System.out.println("remove a element  :"+set1);
        set1.removeAll(set);
        System.out.println("remove all element in set :"+set1);

        set.add("r15");
        set.add("e");
        set1.add("x");
        System.out.println(set);
        set1.containsAll(set);
        System.out.println(set1);



    }
}

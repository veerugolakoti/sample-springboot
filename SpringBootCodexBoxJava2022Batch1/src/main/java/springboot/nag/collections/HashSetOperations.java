package springboot.nag.collections;

import java.util.HashSet;

public class HashSetOperations {
    public void testOperations() {
        HashSet<String> set=new HashSet<>();
        set.add("nag");
        set.add("mani");
        set.add("raju");
        set.add("ravi");
        set.add("basha");
        set.add("siva");
        set.add("basha");
        System.out.println("After removing duplicates my present set elements is "+set);

        System.out.println("my present set size is "+set.size());
        HashSet<String> set1=new HashSet<>();
        set1.add("naresh");
        set1.add("harish");
        set.addAll(set1);
        System.out.println("my updated set is : "+set.size());
        set.remove("ravi");
        System.out.println("after removing element is "+set.size());
        System.out.println("my element present or not : "+set.contains("suresh"));
        for (String str:set) {
            System.out.println(str);
            


        }





    }
}

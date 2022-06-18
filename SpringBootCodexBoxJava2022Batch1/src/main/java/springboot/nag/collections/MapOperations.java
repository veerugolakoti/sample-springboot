package springboot.nag.collections;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {
    public void testOperations() {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"nag");
        map.put(2,"mani");
        map.put(1,"ravi");
        map.put(3,"raju");
        map.put(4,"jani");
        map.put(5,"nag");
        System.out.println("accesing key values "+map.keySet());
        System.out.println("accesing values  "+map.values());
        System.out.println("accesing entries "+map.entrySet());
        System.out.println("removing element is "+map.remove(1,"ravi"));
        System.out.println("getting 5th entry is "+map.get(5));
        System.out.println("is my map empty : "+map.isEmpty());




    }
}

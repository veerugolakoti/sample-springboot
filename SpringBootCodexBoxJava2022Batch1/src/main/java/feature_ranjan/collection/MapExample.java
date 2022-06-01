package feature_ranjan.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {
    public void map(){
        Map<Integer, String> map0 = new HashMap();
        map0.put(1,"SmrutiRanjan");
        map0.put(2,"Sarthak");
        map0.put(3,"sambit");
        map0.put(4,"Ankit");
        map0.putIfAbsent(5,"sangam");

        System.out.println(map0);
        System.out.println("keyset :"+map0.keySet());
        System.out.println("values :"+map0.values());
        System.out.println("size :"+map0.size());
        System.out.println("showing the entries :"+map0.entrySet());
        System.out.println("size of keyset :"+map0.keySet().size());
        System.out.println("give u the boolean result:"+map0.remove(1,"SmrutiRanjan"));
        System.out.println("remove key value 4 : "+map0.remove("Ankit"));


        for (Map.Entry<Integer, String> map : map0.entrySet()) {
            System.out.println("key:"+map.getKey() + " value:" +map.getValue());
        }
        Map<Integer, String> map2 = new HashMap();
        map2.put(1, "subrat");
        map2.put(2,"subhasmita");
        map2.put(3, "rajendra");
        map2.put(4, "biswjit");

        for (Map.Entry<Integer , String > map10 : map2.entrySet()) {
            System.out.println("map10 entry set  "+map10.getKey() +": "+ map10.getValue());


            Map<Long, Double> map4 = new LinkedHashMap<>();
            map4.put(878l, 45.78);

        }
    }
}

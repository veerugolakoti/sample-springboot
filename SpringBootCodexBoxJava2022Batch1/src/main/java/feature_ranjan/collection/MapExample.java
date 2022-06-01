package feature_ranjan.collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public void map(){
        Map map0 = new HashMap();
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


    }
}

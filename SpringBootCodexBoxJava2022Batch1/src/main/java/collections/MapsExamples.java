package collections;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExamples {
      public static void setMap(){
          Map<String, Integer> map=new TreeMap<>();
          map.put("kalyan" ,123);
          map.put("bhargav" ,345);
          map.put("teja" ,456);
          map.put("vamshin" ,567);
          map.put("chandan" ,789);
          System.out.println("before:"+map);

          for ( Map.Entry<String,Integer> s: map.entrySet()) {
              System.out.println(s);
          }

          Map<String,Integer> m=new TreeMap<>(map);
          m.put("ram",987);
          System.out.println(m);
          System.out.println(m.keySet());
          System.out.println(m.containsKey("kalyan"));
          System.out.println(m.hashCode());

      }
}

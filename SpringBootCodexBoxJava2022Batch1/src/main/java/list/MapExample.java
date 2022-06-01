package list;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String , Integer> ms = new HashMap<String, Integer>();
        ms.put("a",new Integer(12));
        ms.put("b" ,new Integer(13));
        ms.put("c", new Integer(15));
        for (Map.Entry<String , Integer> me:ms.entrySet())
              {
                  System.out.print(me.getKey() + ":");
                  System.out.println(me.getValue());
        }
    }
}

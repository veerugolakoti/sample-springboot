package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public void mapExample() {
        HashMap<Integer, Character> hmap = new HashMap<>();
        hmap.put(1, 'a');
        hmap.put(2, 'b');
        hmap.put(3, 'c');
        hmap.put(4, 'd');
        hmap.put(5, 'f');

        System.out.println("The keys and values: " + hmap);

        System.out.println();

        System.out.println("All the keys: " + hmap.keySet());

        System.out.println();

        for(Map.Entry<Integer, Character> maps : hmap.entrySet()) {
            System.out.println(maps.getKey() + " : " + maps.getValue());
        }

        System.out.println();

        System.out.println("The values: " + hmap.values());

        System.out.println();

        hmap.replace(4,'m');
        System.out.println("After removing the element: " + hmap.values());

        System.out.println();

        System.out.println("The size of map: " + hmap.size());

        System.out.println();

        hmap.remove(1);
        System.out.println("After removing 1 key: " + hmap);
    }
}

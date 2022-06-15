package duplicateNames;

import java.util.*;

public class DuplicateExample {
    public static void duplicate() {
        List<String> list=new ArrayList<>();
        list.add("kalyan");
        list.add("ram");
        list.add("kalyan");
        list.add("chandan");
        list.add("vamshi");
        System.out.println(list);

        HashSet<String> hashset=new LinkedHashSet<>(list);
        for (String str:hashset) {
            System.out.println(str+ " : " +Collections.frequency(list, str));
            }
        }
    }




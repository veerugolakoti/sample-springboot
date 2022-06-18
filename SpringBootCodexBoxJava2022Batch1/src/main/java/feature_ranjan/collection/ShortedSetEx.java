package feature_ranjan.collection;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ShortedSetEx {
    public void sortedex(){
        Set<String> sortedset = new TreeSet<>();
        sortedset.add("new");
        sortedset.add("car");
        sortedset.add("in");
        sortedset.add("the");
        sortedset.add("home");

        System.out.println("shorted order:"+sortedset);
        Set<String> s2 = new LinkedHashSet<>();
        System.out.println("insertion order:"+s2);
        s2.add("new");
        s2.retainAll(sortedset);
        System.out.println("remove all using retain:"+s2);

    }
}

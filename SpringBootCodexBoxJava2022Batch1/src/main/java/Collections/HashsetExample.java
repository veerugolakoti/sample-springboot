package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashsetExample {
    public void hashSet() {
        HashSet<Integer> hashset = new HashSet<>();
        hashset.add(11);
        hashset.add(12);
        hashset.add(13);
        hashset.add(14);
        hashset.add(15);
        hashset.add(16);

        System.out.println("The size: " + hashset.size());

        System.out.println();

        hashset.remove(12);
        System.out.println("After removing: ");
        System.out.println(hashset);

        System.out.println();

        System.out.println("Printing the elements: ");
        for(Integer nums : hashset) {
            System.out.println(nums);
        }

        System.out.println();

        if(hashset.contains(12)) {
            System.out.println("The element is present");
        } else {
            System.out.println("The element is not present");
        }

        System.out.println();

        System.out.println("is set empty: " + hashset.isEmpty());

        System.out.println();

        hashset.clear();
        System.out.println("Removing all the elements: ");
        System.out.println(hashset);

    }
}

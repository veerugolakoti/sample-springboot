package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {
    public void arrayList() {
        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(12);
        alist.add(16);
        alist.add(15);
        alist.add(19);
        alist.add(21);
        alist.add(2);

        int min = Collections.min(alist);
        int max = Collections.max(alist);

        if(min == max) {
            System.out.println("Elements are equal");
        } else {
            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
        }

        System.out.println();

        Collections.shuffle(alist);
        System.out.println("After shuffling: " + alist);

    }
}

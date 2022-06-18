package Collections;

import java.util.LinkedHashSet;

public class LinkedHashset {
    public void linkedHashSet() {

        LinkedHashSet<Integer> lhashset = new LinkedHashSet<>();
        lhashset.add(12);
        lhashset.add(33);
        lhashset.add(54);
        lhashset.add(85);
        lhashset.add(53);
        lhashset.add(29);
        lhashset.add(17);

        System.out.println(lhashset);

        System.out.println();

        for(int nums : lhashset) {
            System.out.println(nums);
        }

    }
}

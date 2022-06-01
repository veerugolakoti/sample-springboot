package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateElement {
    public void duplicateElement() {
        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(8);
        alist.add(12);
        alist.add(14);
        alist.add(15);
        alist.add(12);
        alist.add(14);
        HashSet<Integer> set = new HashSet<>();
        for(Integer nums : alist) {
            if(set.add(nums) == false) {
                System.out.println(nums);
            }
        }
    }
}

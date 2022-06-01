package feature_ranjan.collection;

import java.util.*;

public class DuplicateInList {
    public void duplicateList(){
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(5);
        myList.add(4);
        myList.add(5);

        Set<Integer> setList = new LinkedHashSet(myList);
        System.out.println("eliminate the duplicates:"+setList);


      //  Set<String> setList2 = new LinkedHashSet<>(myList);
        for (int i = 0; i<setList.size(); i++) {
            if (setList.add(i)==false) {
                System.out.println();
            }

        }

    }

}

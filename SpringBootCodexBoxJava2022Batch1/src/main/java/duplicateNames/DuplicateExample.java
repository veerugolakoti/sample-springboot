package duplicateNames;

import java.util.*;

public class DuplicateExample {
    public static void duplicate() {
         String [] li={"kalyan","vamshi","kalyan","ram"};
         int count=1;
        for (int i = 0; i < li.length; i++) {
            for (int j = i+1; j < li.length; j++) {
                if (li[i]==li[j]){
                }
            }
        }
        Set<String> hashset=new HashSet<>();
        for (String str:li) {
            if (hashset.add(str) == false) {
                System.out.println(""+str+":"+count++);
            }
        }
    }
}




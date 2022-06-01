package list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListExample {
      public void names(){
           ArrayList<String> list= new ArrayList();
         // List<String> list1 = new ArrayList<>();
           list.add("siva");
           list.add("teja");
           list.add("ram");
          list.add("ram");
          list.add("ram");
          list.add("ram");
          list.add("siva");
          list.add("siva");
          list.add("siva");

          System.out.println(" size of the arraylist: "+list.size());
           System.out.println("elements in the list is: "+list);
          Set<String> list2 = new HashSet<>(list);
          System.out.println("find the duplicate elements: "+ list2);


        }
}

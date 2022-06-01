package feature_ranjan.collection;

import java.util.*;

public class DuplicateInList {
    public void duplicateList(){
      /*  List<String> myList0 = new ArrayList<>();
        myList0.add("ram");
        myList0.add("ram");
        myList0.add("siva");
        myList0.add("naga");
        myList0.add("siva");*/

      /*  Set<String> myList0 = new LinkedHashSet(myList);
        System.out.println("eliminate the duplicates:"+myList0);*/

        Map<String, Integer> maplist = new LinkedHashMap<>();
        maplist.put("ram", 1);
        maplist.put("swati" , 2);
        maplist.put("harsha",3);
      /*  for (Map.Entry<String, Integer> i : maplist.entrySet()) {
            if((maplist.containsKey(i))){
                maplist.put(i, 1 + maplist.get(i) );

            }else{
                maplist.put(i,1);
            }
        }*/
        System.out.println(maplist);

    }

}



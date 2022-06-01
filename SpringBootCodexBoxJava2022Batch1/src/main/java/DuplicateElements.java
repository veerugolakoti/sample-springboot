import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateElements {
   public void duplicateElements(){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(11);
        al.add(22);
        al.add(33);
        al.add(44);
        al.add(11);
        al.add(22);

        Set<Integer> set = new LinkedHashSet<>(al);
        //for(int i=0; i<al.size(); i++) {
        // if(set.add(al.get(i)) == false) {
        for (Integer i : set){
            System.out.println( Collections.frequency(al,i)+" times : "+i);

        }
    }

}


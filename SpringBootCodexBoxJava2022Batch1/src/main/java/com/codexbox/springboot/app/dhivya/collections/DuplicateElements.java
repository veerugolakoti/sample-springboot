package com.codexbox.springboot.app.dhivya.collections;
import java.util.ArrayList;
import java.util.List;
public class DuplicateElements {
    public void testlist() {
        List<String> names = new ArrayList<>();
        names.add("dhivya");
        names.add("dhivya");
        names.add("dhivya");
        names.add("dinesh");
        names.add("sohail");
        names.add("mounika");
        System.out.println("Before rempoving Duplicate names :  " + names);
        System.out.println("After removing duplicate names : " + names );
        int count = 0;
        String temp = null;
        List<Integer> duplicatecount = new ArrayList();
        List<String> duplicatenames = new ArrayList();
        for (int i = 0; i < names.size(); i++) {
            for (int j = i + 1; j < names.size(); j++) {
                if (names.get(i).equalsIgnoreCase(names.get(j))) {
                    duplicatenames.add(names.get(i));
                    temp = names.get(i);
                    count++;
                    break;
                }
            }
            if (count > 0) {
                duplicatecount.add(count);
            }
        }
        System.out.println("duplicate names " + temp);
        System.out.println("number of time repeat " + count);
        System.out.println(names);
        System.out.println(count);
    }
}




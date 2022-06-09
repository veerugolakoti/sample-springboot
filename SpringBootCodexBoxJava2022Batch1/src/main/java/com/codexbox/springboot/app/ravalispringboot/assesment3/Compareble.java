package com.codexbox.springboot.app.ravalispringboot.assesment3;

import java.util.Comparator;
import java.util.Map;

public class Compareble implements Comparator<Map.Entry<Student,String>> {


    @Override
    public int compare(Map.Entry<Student, String> o1, Map.Entry<Student, String> o2) {
        int result = 0;
        if (o2.getValue() != o1.getValue()) {
            result = o1.getValue().compareTo(o2.getValue());
        } else if (o1.getKey().getMarks() != o2.getKey().getMarks()) {
            //  result = o2.getKey().getMarks().compareTo.(o1.getKey().getMarks());
            // }
            // }


        }
        return result;
    }
}


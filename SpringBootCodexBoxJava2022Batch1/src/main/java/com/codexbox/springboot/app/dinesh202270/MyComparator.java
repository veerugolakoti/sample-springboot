package com.codexbox.springboot.app.dinesh202270;


import java.util.Comparator;

public class MyComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {

        if(o1.getMarks()==o2.getMarks())
        {
            if (o1.getName().equalsIgnoreCase(o2.getName()))
            {
                return o2.getID().compareTo(o1.getID());
            }

           return o1.getName().compareTo(o2.getName());
        }


        return o1.getMarks().compareTo(o2.getMarks());
    }
}


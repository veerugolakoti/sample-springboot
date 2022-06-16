package com.codexbox.springboot.app.codexbox.BhargavTej.collections;

import java.util.ArrayList;

public class ToStringexamples {
    public static void main(String[] args) {
        ArrayList<Integer> companieslist = new ArrayList<>();
        companieslist.add(1);
        companieslist.add(420);
        companieslist.add(786);
        companieslist.add(369);
        companieslist.add(7);
        System.out.println("companieslist : " + companieslist);
        System.out.println(companieslist.getClass());

        //convert arraylist to String
        String list = companieslist.toString();
        System.out.println("companieslist tostring: " + list);
        System.out.println(list.getClass());
    }
}

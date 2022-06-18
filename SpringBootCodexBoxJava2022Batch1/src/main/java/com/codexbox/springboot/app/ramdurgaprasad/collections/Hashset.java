package com.codexbox.springboot.app.ramdurgaprasad.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {
    public static <set> void main(String[] args) {
        Set<String> st = new HashSet<>();
        st.add("rr");
        st.add("gt");
        st.add("mi");
        st.add("csk");
        st.add("dd");
        st.add("rcb");
        st.add("srh");
        st.add("lsg");
        st.add("pk");
        Iterator<String> gh=st.iterator();
        while(gh.hasNext())
        {
            System.out.println(gh.next());
        }
//        st.clear();

//        st.removeAll(st);
        System.out.println(st);

   /*     List<String> loi= new ArrayList<>(st);

        loi.add("rr");
        loi.add("gt");
        loi.add("mi");
        loi.add("csk");
        loi.add("dd");
        loi.add("rcb");
        loi.add("srh");
        loi.add("lsg");
        loi.add("pk");
        List<String> obj=new LinkedList<>(st);
        for (String lo:st) {
            System.out.println(loi.contains(lo)? "yes":"no");
        }*/
      /*  for (String sty:loi) {
            System.out.println(sty);

        }
        Set<String> sset=new TreeSet<>(st);
        for (String sty:sset) {
            System.out.println(sty);
        }
*/

     /*   System.out.println(st.size());
        System.out.println(st.removeAll(st));*/
/*        String[] array =new String[st.size()];
      st.toArray(array);
        for (String arr:array) {
            System.out.println(arr);
        }

    }*/
}}

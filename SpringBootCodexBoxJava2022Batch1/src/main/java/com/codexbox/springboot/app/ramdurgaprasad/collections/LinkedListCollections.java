package com.codexbox.springboot.app.ramdurgaprasad.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollections {
 public static void main(String[] args) {


 List<String> count1 = new LinkedList<String>();

  count1.add("r");
  count1.add("a");
  count1.add("m");
  count1.add("d");
  count1.add("u");
  count1.add("r");
  count1.add("g");
  count1.add("a");
  count1.add("p");
  count1.add("r");

/*  System.out.println(count1.listIterator(2));
  for (String str:count1) {
   System.out.println(str);*/
  List<String> count2 = new LinkedList<String>();
   count2.add("r");
   count2.add("a");
   count2.add("a");
   count2.add("d");
   count2.add("a");
   count2.add("r");
   count2.add("a");
   count2.add("a");
   count2.add("a");
   count2.add("uiy");
   count2.set(3,"hgfdjdjs");
  System.out.println(count2);

   List<String> l1=new LinkedList<>();
  for (String e :count1) {
   l1.add(count2.contains(e)? "yes"  : "no");
  }
  System.out.println(l1);
/*  System.out.println(count2.contains("raj"));
  System.out.println(count2.peekLast());
  System.out.println(count2.peek());
  List<String> str1=new LinkedList<>();*/
 /* str1= (List<String>) count2.clone();
  System.out.println(str1+"the clone elements");
   count2.removeFirst();
   count2.removeLast();
  System.out.println(count2);
  Collections.shuffle(count2);
  System.out.print(count2);*/

 /*  count2.remove(4);
  System.out.println(count2);
  */
 /* for (int i = 0; i < count2.size(); i++) {
   System.out.println(count2.get(i) + "=="+  i);
  }
*/
 /* System.out.println(count2.set(4,"ramdurga"));
count2.addLast("sita");
  count2.offerFirst("hanuman");
  count2.addFirst("hanuma");
  System.out.println(count2);
  System.out.println(count2.getFirst());
  System.out.println(count2.getLast());*/
  /* Iterator it= count2.listIterator(2);
   while(it.hasNext()){
    System.out.println(it.next());}
   Iterator iy=count2.descendingIterator();
  while(iy.hasNext())
  {
   System.out.println(iy.next());
   }*/
}}
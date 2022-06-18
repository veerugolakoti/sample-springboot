package com.codexbox.springboot.app.ramdurgaprasad.collections;

import java.util.Collections;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String>colors=new java.util.ArrayList<>();
        colors.add("orange");
        colors.add("blue");
        colors.add("red");
        colors.add("white");
        colors.add("black");
        colors.add("yellow");
        colors.add("green");
        colors.add("pink");
        colors.add("maroon");
     /*   System.out.println(colors.size());
        colors.remove("maroon");
        Collections.sort(colors);
        System.out.println(colors);*/
        List<String> count =new java.util.ArrayList<>();
        count.add("1");
        count.add("iyfg");
        count.add("1");
        count.add("1");
        count.add("1");
        count.add("1");
        count.add("1");
        count.add("1");
        String str="ballon";
        System.out.println(count.set(2,str));


        Collections.swap(count,1,3);
        for (String swap:count) {
            System.out.println(swap);

        }
        java.util.ArrayList<String> arrayList = new java.util.ArrayList<>();

        arrayList.add("ram");
        arrayList.add("duega");
        arrayList.add("durga");
        arrayList.add("prasad");
        arrayList.add("penaganti");
        arrayList.add("ram");
        arrayList.add("duega");
        arrayList.add("durga");
        arrayList.add("prasad");
        arrayList.trimToSize();
        System.out.println(arrayList);

      /*  arrayList.ensureCapacity(10);*/
        arrayList.add("ytd");
        arrayList.add("ruy");
        System.out.println(arrayList);
      /*  Collections.copy(count,colors);
        System.out.println(count);
        if(!colors.isEmpty()){
            try{  System.out.println(colors.contains("pink"));
                System.out.println(colors.set(3,"gold"));
                System.out.println(colors.lastIndexOf("red"));
                System.out.println(colors.get(0));
                System.out.println(colors.isEmpty());
               throw new UnsupportedOperationException();
            }catch(Exception ae){
                System.out.println("Arraystore exception is arrived");
            }
        }


//        System.out.println(colors);
        for (String color:colors) {
            System.out.println(color);*/

   /*     }

      Collections.shuffle(count);
        List<String> list =count.subList(0,4);
        System.out.println(list);
*/
    }
}

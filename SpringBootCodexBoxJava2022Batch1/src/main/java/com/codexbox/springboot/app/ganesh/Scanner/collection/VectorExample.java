package com.codexbox.springboot.app.ganesh.Scanner.collection;
import java.util.*;
public class VectorExample {
    public void testVector() {

//          VectorExample vec = new VectorExample();



            Scanner s = new Scanner(System.in);
            System.out.println("Enter the String:");
            String s1 = s.nextLine();
            StringBuffer sb = new StringBuffer(s1);
//            sb.append(s1);
            sb.reverse();
            String s2 = new String(sb);
            if (s1.equals(s2)) {
                System.out.println("Palindrome....");
            } else {
                System.out.println("Non-Palindrome.");


            }
        }
    }

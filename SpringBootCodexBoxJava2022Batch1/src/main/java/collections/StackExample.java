package collections;

import javafx.scene.layout.Priority;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackExample {
    public static  void myStack(){
//        Stack<String> list1=new Stack<>();
        PriorityQueue<String> list1=new PriorityQueue<>();
        list1.add("kalyan");
        list1.add("1234");
        list1.add("kmp");
       /* Stack<String> list2=new Stack<>();
        list2.push("vamshi");
        list2.push("1432");
        list2.push("hyd");*/
//        list1.add(2,"nzb");
        System.out.println("----before pop----");
        System.out.println(list1);
//        System.out.println(list2);
        System.out.println("----after pop----");
     /*   System.out.println(list1.pop());
        System.out.println(list2.pop());*/

        System.out.println(list1.peek());
        System.out.println(list1.peek());
        System.out.println(list1.poll());
        System.out.println(list1);
    }
}

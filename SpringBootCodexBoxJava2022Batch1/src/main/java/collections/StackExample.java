package collections;

import java.util.Stack;

public class StackExample {
    public static  void myStack(){
        Stack<String> list1=new Stack<>();
        list1.push("kalyan");
        list1.push("1234");
        list1.push("kmp");
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
        System.out.println(list1.pop());
        System.out.println(list1);
    }
}

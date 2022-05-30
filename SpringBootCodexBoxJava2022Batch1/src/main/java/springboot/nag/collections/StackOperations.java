package springboot.nag.collections;

import java.util.Stack;

public class StackOperations {
    public void testoperations () {
        Stack<String> ss=new Stack<>();
        ss.push("nag");
        ss.push("mani");
        ss.push("nani");
        ss.push("ravi");
        ss.push("naresh");
        System.out.println("my present stack size is "+ss.size());
        String s1=ss.pop();


        System.out.println("my pop element is "+s1);
        s1=ss.pop();
        System.out.println("my next pop element is " +s1);
        String s2=ss.peek();
        System.out.println("my top element is "+s2);
        int s3=ss.search("nag");
        System.out.println("present or not "+s3);
        boolean s4 = ss.isEmpty();
        System.out.println("Is my stack empty "+s4);
        System.out.println("present my stack size is "+ss.size());
        for (String str: ss) {
            System.out.println(str);

        }


}
}



package Collections;

import java.util.Stack;

public class StackExample {
    public void stackExample() {
        Stack stack = new Stack();
        stack.push(111);
        stack.push("Java");
        stack.push("Collections");
        stack.push("Frameworks");
        stack.push("234");

        System.out.println("Print the stack: ");
        System.out.println(stack);

        System.out.println();

        stack.pop();
        System.out.println("After the poping the element: ");
        System.out.println(stack);

        System.out.println();
        System.out.println("The element top of the stack: " + stack.peek());

        System.out.println();
        System.out.println("The element found at : " + stack.search("Frameworks"));

        System.out.println();
        System.out.println("Is stack empty: " + stack.empty());

    }
}

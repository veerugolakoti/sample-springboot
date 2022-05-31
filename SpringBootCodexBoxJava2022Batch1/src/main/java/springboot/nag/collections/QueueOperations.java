package springboot.nag.collections;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueOperations {

    public void testOperations() {
        /*PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        System.out.println("the elements are "+numbers);
        numbers.offer(4);
        numbers.offer(9);
        System.out.println("update elements are "+numbers);
        System.out.println("the size of the queue is "+numbers.size());

        System.out.println("the top element is "+numbers.peek());
        System.out.println("the remove element is "+numbers.poll());
        System.out.println("next element removing is "+numbers.poll());
        System.out.println("another  element removing is  "+numbers.poll());
        System.out.println("another element removinig is "+numbers.poll());
        System.out.println("the removing element is "+numbers.remove(4));
        System.out.println("after removing elements the size of the queue is "+numbers.size());*/

        ArrayDeque<String>  ad=new ArrayDeque<>();
        ad.add("dog");
        ad.add("cat");
        ad.add("tiger");
        System.out.println("the elements are "+ad);
        ad.addFirst("cat");
        ad.addLast("dog");
        System.out.println("the updated elements are "+ad);
        Iterator<String> str= ad.descendingIterator();
        while(str.hasNext()){
            System.out.println(str.next());

        }

        System.out.println("the size of the array deque is "+ad.size());
        System.out.println("the first element is "+ad.peekFirst());
        System.out.println("the last element is "+ad.peekLast());
        System.out.println("getting first element is "+ ad.getFirst());
        System.out.println("getting last element is "+ad.getLast());

        System.out.println("remove first element is "+ ad.removeFirst());
        System.out.println("remove last element is "+ad.removeLast());
        System.out.println("the removing element is "+ad.remove());
        System.out.println("removing specified element is "+ad.remove("tiger"));
        System.out.println("removing specified element is "+ad.pop());









    }
}

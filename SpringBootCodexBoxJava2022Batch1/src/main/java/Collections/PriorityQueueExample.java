package Collections;


import java.util.PriorityQueue;

public class PriorityQueueExample {
    public void priorityQueue() {
        PriorityQueue<Integer> priorityqueue = new PriorityQueue<>();
        priorityqueue.add(12);
        priorityqueue.add(15);
        priorityqueue.add(17);
        priorityqueue.add(19);

        System.out.println(priorityqueue.peek());

        System.out.println();

        System.out.println(priorityqueue.poll());
        System.out.println(priorityqueue.poll());

        System.out.println();

        priorityqueue.offer(19);
        System.out.println(priorityqueue);

    }
}

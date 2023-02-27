package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class MainQueue {

    public static void main(String[] args) {
        // Deque
        Deque<String> deque1 = new ArrayDeque<>();

        deque1.addFirst("first element");
        deque1.add("another element");
        deque1.addFirst("added element");
        deque1.addLast("last element");

        deque1.offer("offered element");
        deque1.offerFirst("offered first element");
        System.out.println(deque1);

        // Priority Queue
        PriorityQueue<Integer> prioQ1 = new PriorityQueue<>();
        prioQ1.offer(4);
        prioQ1.offer(5);
        prioQ1.offer(3);

        System.out.println(prioQ1);

        // Retrieve in ascending order
        System.out.println(prioQ1.poll());
        System.out.println(prioQ1.poll());
        System.out.println(prioQ1.poll());
    }

}

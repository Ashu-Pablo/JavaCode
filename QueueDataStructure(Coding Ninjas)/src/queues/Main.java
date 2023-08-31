package queues;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue<Integer> queue= new LinkedList<>();
        queue.add(10);
        queue.add(20);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.remove());

     }
}

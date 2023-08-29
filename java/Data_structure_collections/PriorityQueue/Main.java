package PriorityQueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue priorityQueue=new PriorityQueue();
        priorityQueue.offer(200);
        priorityQueue.offer(300);
        priorityQueue.offer(400);
        priorityQueue.offer(800);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.remove(2));
        System.out.println(priorityQueue);
    }
}

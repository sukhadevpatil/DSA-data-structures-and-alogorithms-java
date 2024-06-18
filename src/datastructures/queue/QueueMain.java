package datastructures.queue;

public class QueueMain {

    public static void main(String[] args) {
        Queue queue = new Queue(7);

        queue.getFirst();
        queue.getLast();
        queue.getLength();
        queue.printQueue();

        System.out.println("=======================");

        queue.enqueue(6);
        queue.enqueue(5);
        queue.printQueue();

        System.out.println("=======================");

        System.out.println(queue.dequeue().value);
        System.out.println(queue.dequeue().value);
        System.out.println(queue.dequeue().value);
        System.out.println(queue.dequeue());
        queue.printQueue();

        System.out.println("=======================");


    }
}

package app;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * The PlayQueue class demonstrates the usage of Java Queues, showcasing operations on Queues of Strings and Integers.
 */
public class PlayQueue {

    /**
     * The main method serves as the entry point for the program.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Set a Queue of Strings
        Queue<String> stringQueue = new LinkedList<String>();
        stringQueue.offer("Mark Reha");
        stringQueue.add("Mary Reha");
        stringQueue.offer("Justine Reha");
        stringQueue.add("Brianna Reha");

        // Setup a Queue of Integers
        Queue<Integer> integerQueue = new LinkedList<Integer>();
        integerQueue.add(1);
        integerQueue.offer(-1);
        integerQueue.add(5);
        integerQueue.offer(10);

        // Print out size and head element of the Queue
        System.out.println(integerQueue);
        System.out.printf("Integer Queue Tests: size is %d and head element is %d\n", integerQueue.size(), integerQueue.peek());

        // Use Iterator to get elements from the Queue, could of used loop over
        // size() and used remove() to achieve the same functionality
        Iterator<String> itr = stringQueue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
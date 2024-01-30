package app;

import java.util.Iterator;
import java.util.Stack;

/**
 * The PlayStack class demonstrates the usage of Java Stacks, showcasing operations on Stacks of Strings and Integers.
 */
public class PlayStack {

    /**
     * The main method serves as the entry point for the program.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Setup a Stack of Strings
        Stack<String> stringStack = new Stack<String>();
        stringStack.push("Mark Reha");
        stringStack.push("Mary Reha");
        stringStack.push("Justine Reha");
        stringStack.push("Brianna Reha");

        // Setup a Stack of Integers
        Stack<Integer> integerStack = new Stack<Integer>();
        integerStack.push(1);
        integerStack.push(-1);
        integerStack.push(5);
        integerStack.push(10);

        // Print out the size and second element in the Stack
        System.out.println(integerStack);
        System.out.printf("Integer Stack Tests: size is %d and 2nd element is %d\n", integerStack.size(), integerStack.elementAt(1));

        // Use Iterator to get elements from the Stack, could of used
        // loop over size() and used pop() to achieve the same functionality
        Iterator<String> itr = stringStack.iterator();
        while (itr.hasNext()) {
            System.out.println(stringStack.pop());
        }
    }
}
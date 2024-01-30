package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The PlayList class demonstrates the usage of Java generics with Lists, showcasing operations on Lists of Integers and Strings.
 */
public class PlayList {

    /**
     * The main method serves as the entry point for the program.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create a List of Integers and add elements using add()
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(Integer.valueOf(10));
        integerList.add(Integer.valueOf(11));

        // Create a List of Strings and add elements using add()
        List<String> stringList = new ArrayList<String>();
        stringList.add("Hello World");
        stringList.add("Hi World");

        // Get the first element from the List using get()
        System.out.printf("Integer Value: %d\n", integerList.get(0));
        System.out.printf("String Value: %s\n", stringList.get(0));

        // Loop over the List of Integers using a For Loop
        for (Integer data : integerList) {
            System.out.printf("Integer Value: %d\n", data);
        }

        // Loop over the List of Strings using an Iterator
        Iterator<String> stringIterator = stringList.iterator();
        while (stringIterator.hasNext()) {
            System.out.printf("String Value: %s\n", stringIterator.next());
        }
    }
}
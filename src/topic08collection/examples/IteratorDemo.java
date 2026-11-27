package topic08collection.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * This class shows how to use an Iterator to go through a list
 * and safely remove elements while looping.
 *
 * @author Emaliana Kasmuri, FTMK, UTeM
 * for BITP 3113 Object Oriented Programming
 * 
 */
public class IteratorDemo {

    /**
     * Main entry point to the application 
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
    	
        // Create a list of marks
        List<Integer> marks = new ArrayList<>(
        		Arrays.asList(45, 78, 32, 90, 60));
        
        System.out.println("Initial element: " + marks);

        // Step 1: get an iterator from the list
        Iterator<Integer> it = marks.iterator();

        // Step 2: loop while there is another element
        while (it.hasNext()) {
        	
            // Step 3: read the next element
            int m = it.next();

            // Step 4: remove the element through the iterator if it fails
            if (m < 50) {
            		System.out.println("Remove element less than 50: " + m);
                it.remove();              
            }
        }

        // Display the marks that remain
        System.out.println("Final elements: " + marks);        
    }
}
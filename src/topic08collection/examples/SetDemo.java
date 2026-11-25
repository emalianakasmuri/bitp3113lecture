package topic08collection.examples;

import java.util.*;

/**
 * This class demonstrate the main properties of a set: it keeps insertion order,
 * allows duplicate elements, and gives access to elements by index.
 *
 * @author Emaliana Kasmuri, FTMK, UTeM
 * for BITP 3113 Object Oriented Programming
 * 
 */
public class SetDemo {
	
	/**
     * Main entry point to the application 
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
    	
    		// Create empty set and add element
        Set<String> courses = new HashSet<>();
        courses.add("BITP");
        courses.add("BITS");
        System.out.println("Initial element");
        System.out.println("Elements: " + courses);
        System.out.println("Size: " + courses.size());
        
        // Attempt to add the same element
        String course = "BITP";
        boolean flag = courses.add(course);
        System.out.println("\nAttempt to add " + course + ": " + flag);
        
        // Find element
        course = "BITS";
        System.out.println("\nIs " + course + " exist?: " 
        		+ courses.contains("BITS"));

        // Sort element
        Set<Integer> sorted = new TreeSet<>(Arrays.asList(5, 1, 9, 1, 3));
        System.out.println("\nElements: " + Arrays.asList(5, 1, 9, 1, 3)); 
        System.out.println("Sorted elements: " + sorted);            

        Set<String> ordered = new LinkedHashSet<>(
        		Arrays.asList("C", "A", "B", "A"));
        System.out.println("\nElements: " + Arrays.asList("C", "A", "B", "A")); 
        System.out.println("Ordered Elements: " + ordered);           
    }
}









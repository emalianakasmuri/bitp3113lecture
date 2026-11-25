package topic08collection.examples;

import java.util.Enumeration;
import java.util.Vector;

/**
 * This class demonstrate how a Vector doubles its capacity when it is full,
 * and how to use its legacy methods and an Enumeration.
 *
 * @author Emaliana Kasmuri, FTMK, UTeM
 * for BITP 3113 Object Oriented Programming
 */
public class VectorDemo {

    /**
     * Main entry point to the application 
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
    	
        // Create a Vector with an initial capacity of 3
        Vector<Integer> vector = new Vector<>(3);
        System.out.println("Initial capacity: " + vector.capacity());
        System.out.println("Initial size: " + vector.size());

        // Fill the Vector to its capacity
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println("\nCapacity after filling vector: " 
        		+ vector.capacity()); 
        System.out.println("Size after filling vector: " + vector.size());     

        // Add one more element: the array is full, so the capacity doubles
        vector.addElement(40);
        System.out.println("\nCapacity after adding 1 elements: " 
        		+ vector.capacity()); 
        System.out.println("Size after adding 1 element: " + vector.size());       

        // Read the first element with a legacy method
        System.out.println("\nRetrieve first element: " +vector.firstElement());  

        // Go through the elements with a legacy Enumeration
        Enumeration<Integer> enumeration = vector.elements();
        System.out.println("\nList of elements: ");
        while (enumeration.hasMoreElements()) {
        	
            System.out.print(enumeration.nextElement() + " "); 
        }
    }
}

package topic08collection.examples;

import java.util.LinkedList;

/**
 * This class demonstrate how a LinkedList handles frequent insertions and 
 * removals at the start and end of a list.
 *
 * @author Emaliana Kasmuri, FTMK, UTeM
 * for BITP 3113 Object Oriented Programming
 */
public class LinkedListDemo {

    /**
     * Main entry point to the application 
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
    	
        // Create an empty linked list of customer names
        LinkedList<String> queue = new LinkedList<>();

        // Add customers at the end of the list
        queue.add("Aina");
        queue.add("Ben");
        System.out.println("Initial element");
        System.out.println("Elements: " + queue);
        System.out.println("Size: " + queue.size());

        // Insert a priority customer at the start of the list
        String customer = "Chong";
        queue.addFirst(customer);
        System.out.println("\nAdd: " + customer);
        System.out.println("Customers: " + queue);
        System.out.println("Size: " + queue.size());

        // Insert a customer in the middle at index 2
        customer = "Devi";
        queue.add(2, customer);
        System.out.println("\nAdd at [2]: " + customer);
        System.out.println("Customers: " + queue);
        System.out.println("Size: " + queue.size());

        // Read the first and last customers
        System.out.println("First customer:" + queue.getFirst());     
        System.out.println("Last customer:" + queue.getLast());      

        // Serve (remove) the first customer
        String served = queue.removeFirst();
        System.out.println("\nServed: " + served);  // Served: Chong
        System.out.println("Customers: " + queue);
        System.out.println("Size: " + queue.size());
    }
}
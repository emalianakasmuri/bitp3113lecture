package topic08collection.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * This class demonstrate the main properties of a List: it keeps insertion order,
 * allows duplicate elements, and gives access to elements by index.
 *
 * @author Emaliana Kasmuri, FTMK, UTeM
 * for BITP 3113 Object Oriented Programming
 * 
 */
public class ListDemo {

    /**
     * Main entry point to the application 
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
    	
        // Create an empty list of fruits
        List<String> fruits = new ArrayList<>();

        // Add elements at the end of the list
        fruits.add("Apple");
        fruits.add("Banana");
        // Allow duplicated element
        fruits.add("Apple");
        System.out.println("Initial element");
        System.out.println("Elements: " + fruits);
        System.out.println("Size: " + fruits.size());
        

        // Insert an element at a specific index
        String fruit = "Mango"; 
        fruits.add(1, fruit);                       
        System.out.println("\nAdding " + fruit);
        System.out.println("Elements: " + fruits);
        System.out.println("Size: " + fruits.size());                  

        // Read an element by its index
        System.out.println("\nRetrieve element at [2]: " + fruits.get(2));

        // Replace the element at index 0
        fruit = "Durian"; 
        fruits.set(0, fruit); 
        System.out.println("\nReplace element at [0] with: " + fruit);
        System.out.println("Elements: " + fruits);
        System.out.println("Size: " + fruits.size());    

        // Remove an element by value (first occurrence only)
        fruit = "Apple"; 
        System.out.println("\nRemove : " + fruit);
        System.out.println("Elements: " + fruits);
        System.out.println("Size: " + fruits.size());                      

        // Find the index of an element
        fruit = "Banana"; 
        System.out.println("Index of " + fruit + ": " + fruits.indexOf(fruit)); 
    }
}
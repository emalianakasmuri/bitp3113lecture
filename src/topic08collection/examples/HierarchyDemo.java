package topic08collection.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * This class shows how to program to the interface
 * using the List interface of the Java Collection Framework.
 *
 * @author Emaliana Kasmuri, FTMK, UTeM
 * for BITP 3113 Object Oriented Programming
 */
public class HierarchyDemo {

    /**
     * Main entry point to the application 
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        
    		// Declare the variable with the interface type (List)
        // and create the object with a class (ArrayList)
        List<String> names = new ArrayList<>();

        // Add three elements to the list
        names.add("Hussein Onn");
        names.add("Mahathir Mohammed");
        names.add("Anwar Ibrahim");
        names.add("Muhyiddin Yassin");
        names.add("Ismail Sabri");
        names.add("Lawrence Wong");
        

        // Display the number of elements and check whether an element exists
        System.out.println("Initial data");
        System.out.println("Element:" + names);
        System.out.println("Size: " + names.size());              
        System.out.println("Is Anwar Ibrahim exist? " 
        		+ names.contains("Anwar Ibrahim"));
      
        // Remove an element and display the remaining elements
        String primeMinister = "Muhyiddin Yassin";
        System.out.println("\nRemoving " + primeMinister);
        names.remove(primeMinister);
        System.out.println("Element:" + names);                               
        System.out.println("Size: " + names.size());         
        
        // Switch the implementation: same List variable, now a LinkedList
        System.out.println("\nChange to LinkedList");
        names = new LinkedList<>(names);
        
        // Add new prime minister
        primeMinister = "Tunku Abdul Rahman";
        System.out.println("Adding " + primeMinister);
        names.add(primeMinister);
        System.out.println("Element:" + names);
        System.out.println("Size: " + names.size());
    }
}
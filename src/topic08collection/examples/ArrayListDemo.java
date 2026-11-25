package topic08collection.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class demonstrate common ArrayList operations: adding, inserting
 * at an index, removing, sorting and looping through the elements.
 *
 * @author Emaliana Kasmuri, FTMK, UTeM
 * for BITP 3113 Object Oriented Programming
 */
public class ArrayListDemo {

	/**
	 * Main entry point to the application 
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {

		// Create an empty list of menu names
		ArrayList<String> menus = new ArrayList<>();

		// Add three names at the end of the list
		menus.add("Mc Chicken Meal");
		menus.add("Beef Properity Meal");
		menus.add("Filet-o-Fish Meal");
		
		System.out.println("Initial elements");
		printElements(menus);


		// Insert a menu at index 1
		String menu = "Apple Pie";
		menus.add(1, menu);
		System.out.println("\nAdd menu: " + menu);
		printElements(menus);

		// Remove a menu by value
		menu = "Filet-o-Fish Meal";
		menus.remove(menu); 
		System.out.println("\nRemoving: " + menu);
		printElements(menus);

		// Sort the names in alphabetical order
		Collections.sort(menus);
		System.out.println("\nSorted menus");
		printElements(menus);


	}

	/**
	 * This method print elements in the list.
	 * 
	 * @param elements
	 */
	public static void printElements (List<String> elements) {

		// Print each element using a for-each loop
		int counter = 1;
		for (String element : elements) {
			
			System.out.println(counter++ + ". " + element);
		}

		// Print the number of elements in the list
		System.out.println("Size: " + elements.size()); 


	}
}

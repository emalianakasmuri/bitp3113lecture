package lab08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * This class process a list of Melaka parliamentary seats using Set.
 * 
 * BITP 3113 Lab 08 Java Collection Framework
 * 
 * @author Emaliana Kasmuri, FTMK, UTeM
 */

public class SeatListDemo {

	/**
	 * Main entry point to the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Demonstrating Set and HashSet");
		System.out.println("-----------------------------\n");
		
		// Creating an object of HashSet
		Set<String> seats = new HashSet<String>();
		
		// Add 3 initial parliamentary seats 
		System.out.println("- Adding 3 Melaka parliamentary seats as initial data:");
		seats.add("P.137 Hang Tuah Jaya");
		seats.add("P.134 Masjid Tanah");
		seats.add("P.136 Tangga Batu");
		displayData(seats);
		
		// Display the the size
		System.out.print("- Size after adding intial data: "); 
		displaySize(seats);
		
	}
	
	
	/**
	 * This method display the data size
	 * 
	 * @param data
	 */
	public static void displaySize (Set<String> data) {
		
		System.out.println(data.size() + " elements");
	}
	
	/**
	 * This method construct and display data in one line
	 * 
	 * @param data
	 */
	public static void displayData (Set<String> data) {
		
		for (String item:data) {
			
			System.out.println("\t- " + item);
			
		}
		
	}
	
	

}

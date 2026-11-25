package lab08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This class process a list of countries using List.
 * 
 * BITP 3113 Lab 08 Java Collection Framework
 * 
 * @author Emaliana Kasmuri, FTMK, UTeM
 */

public class CountryListDemo {

	/**
	 * Main entry point to the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Demonstrating List and ArrayList");
		System.out.println("--------------------------------\n");
		
		// Creating an object of ArrayList
		List<String> countries = new ArrayList<String>();
		
		// Add 3 initial countries
		System.out.print("- Adding 3 countries as initial data: ");
		countries.add("Malaysia");
		countries.add("Singapore");
		countries.add("Thailand");
		displayData(countries);
		
		// Display the the size
		System.out.print("- Size after adding intial data: "); 
		displaySize(countries);
		
	}
	
	/**
	 * This method generates a random index number between 0 and the List size
	 * 
	 * @param size: the list size
	 * 
	 * @return random index number
	 */
	public static int generateRandomIndex (int size) {
		
		Random random = new Random();
		
		int modernRandom = random.nextInt(0,size);
		
		return modernRandom;
	}
	
	/**
	 * This method display the data size
	 * 
	 * @param data
	 */
	public static void displaySize (List<String> data) {
		
		System.out.println(data.size() + " elements");
	}
	
	/**
	 * This method construct and display data in one line
	 * 
	 * @param data
	 */
	public static void displayData (List<String> data) {
		
		// In-line data holder
		StringBuffer dataline = new StringBuffer();
		
		// Construct in-line data
		for (String item:data) {
			
			dataline.append(item).append(',');
			
		}
		
		// Remove the last comma
		dataline.deleteCharAt(dataline.toString().length()-1);
		
		// Display in-line data
		System.out.println(dataline.toString());
	}
	
	

}

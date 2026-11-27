/*
 * File name : MultiCatchDemo.java
 * Purpose   : Shows several catch blocks ordered from specific to general.
 * Lecture   : Lecture 12 - Exception Handling
 * Component : Theory example 12.4 (not part of any case study)
 */
package topic09exception.examples;

/**
 * Reads a value from an array of text and converts it to a number.
 */
public class MultiCatchDemo {

    
    /**
     * Converts the text at a given position to an int and prints it.
     *
     * @param data  the array of text values
     * @param index the position to read
     */
    public static void readNumber(String[] data, int index) {
    	
        try {
            // May throw ArrayIndexOutOfBoundsException (bad index)
            String text = data[index];
            
            // May throw NumberFormatException (text is not a number)
            int value = Integer.parseInt(text);
            
            System.out.println("Value at " + index + " = " + value);
            
        } catch (ArrayIndexOutOfBoundsException e) {
        	
            // Specific handler 1
            System.out.println("Index " + index + " does not exist");
            
        } catch (NumberFormatException e) {
        	
            // Specific handler 2
            System.out.println("Not a number: " + data[index]);
            
        } catch (Exception e) {
        	
            // General handler LAST: catches anything the handlers above missed
            System.out.println("Unexpected problem: " + e);
        }
    }

    /**
     * Program entry point.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        String[] data = {"7", "seven"};  // one valid number, one invalid
        readNumber(data, 0);   // works
        readNumber(data, 1);   // NumberFormatException
        readNumber(data, 5);   // ArrayIndexOutOfBoundsException
    }
}

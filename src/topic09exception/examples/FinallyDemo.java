/*
 * File name : FinallyDemo.java
 * Purpose   : Shows that the finally block runs whether or not an exception occurs.
 * Lecture   : Lecture 12 - Exception Handling
 * Component : Theory example 12.5 (not part of any case study)
 */
package topic09exception.examples;

/**
 * This class simulates opening and closing a connection around a risky division.
 */
public class FinallyDemo {
	
	/**
     * Program entry point.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        
    	
    	 	System.out.println("Processing normal case");
    		divide(8, 2);   // normal case
    		
    		System.out.println("\nProcessing exception case");
        divide(8, 0);   // exception case
        
        System.out.println("Program ends");
        
    }


    /**
     * Divides two numbers between an "open" and a "close" step.
     *
     * @param a the dividend
     * @param b the divisor
     */
    public static void divide(int a, int b) {
    	
        System.out.println("Open connection");
        
        try {
        	
            System.out.println(a + " / " + b + " = " + (a / b));
            
        } catch (ArithmeticException e) {
        	
            System.out.println("Error: " + e.getMessage());
            
        } finally {
        	
            // Clean-up code: runs in BOTH cases, so the connection is never left open
            System.out.println("Close connection");
        }
        
    }

    
}

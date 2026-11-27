package topic09exception.examples;

import java.io.FileWriter;

/**
 * This class divides two numbers and handles division by zero with try-catch.
 * 
 */
public class DivideWithHandling {

    
    /**
     * Program entry point.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
    	
        int total = 10;   // number of sweets to share
        int people = 0;   // number of people (zero by mistake)
        
        System.out.println("Start");
        
        try {
        	
            // Risky statement: may throw ArithmeticException
            int share = total / people;
            System.out.println("Each person gets " + share);
            
        } catch (ArithmeticException e) {
        	
            // Handler: runs only when ArithmeticException is thrown in the try block
            System.out.println("Cannot share: " + e.getMessage());
        }
        
        // The program continues normally after the try-catch
        System.out.println("End");
        
        
    }
}

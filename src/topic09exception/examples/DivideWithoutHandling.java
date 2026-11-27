package topic09exception.examples;

/**
 * This class demonstrates divides two numbers without any exception handling.
 */
public class DivideWithoutHandling {

    /**
     * Program entry point.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
    	
    		// Number of sweets to share
        int total = 10;  
        // Number of people (zero by mistake)
        int people = 0;   
        
        System.out.println("Start");
        
        // Integer division by zero: the JVM throws ArithmeticException here
        int share = total / people;
        
        // These lines never run, because the uncaught exception ends the program
        System.out.println("Each person gets " + share);
        System.out.println("End");
    }
}


package topic09exception.examples;

/**
 * Accepts a mark only if it lies between 0 and 100.
 */
public class MarkEntry {

    

    /**
     * Checks and records one mark.
     *
     * @param mark the mark to record (0 to 100)
     * @throws InvalidMarkException if the mark is below 0 or above 100
     */
    public static void recordMark(int mark) throws InvalidMarkException {
    	
        if (mark < 0 || mark > 100) {
        	
            // Throw our own exception type, with a clear message
            throw new InvalidMarkException("Mark " + mark + " is outside 0-100");
        }
        
        System.out.println("Mark " + mark + " recorded");
    }

    /**
     * Program entry point.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
    	
        try {
            recordMark(85);    // valid
            recordMark(105);   // invalid: throws InvalidMarkException
        } catch (InvalidMarkException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
    }
}

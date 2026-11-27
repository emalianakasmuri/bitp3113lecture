
package topic09exception.examples;

/**
 * Thrown when a mark is not between 0 and 100.
 * Extends Exception, so it is a checked exception.
 */
public class InvalidMarkException extends Exception {

    /** Version number for serialisation; recommended because Exception is Serializable. */
    private static final long serialVersionUID = 1L;

    /**
     * Creates the exception with a description.
     *
     * @param message explains what went wrong
     */
    public InvalidMarkException(String message) {
        super(message);   // store the message in the Exception superclass
    }
}

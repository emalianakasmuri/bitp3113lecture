/*
 * File name : PropagationDemo.java
 * Purpose   : Shows how an exception travels back up the call stack to a handler.
 * Lecture   : Lecture 12 - Exception Handling
 * Component : Theory example 12.6 (not part of any case study)
 */
package topic09exception.examples;

/**
 * main calls methodA, methodA calls methodB, and methodB throws.
 */
public class PropagationDemo {

    /**
     * Creates the object. Not needed because the methods are static.
     */
    public PropagationDemo() {
        // Nothing to initialise
    }

    /**
     * Throws an unchecked exception that it does not handle.
     *
     * @param value a number that must not be negative
     * @throws IllegalArgumentException if value is negative
     */
    public static void methodB(int value) {
        System.out.println("methodB starts");
        if (value < 0) {
            // No catch here, so the exception leaves methodB immediately
            throw new IllegalArgumentException("value is negative");
        }
        System.out.println("methodB ends");
    }

    /**
     * Calls methodB and does not handle the exception either.
     *
     * @param value the number passed on to methodB
     */
    public static void methodA(int value) {
        System.out.println("methodA starts");
        methodB(value);                 // exception passes through methodA
        System.out.println("methodA ends");   // skipped when methodB throws
    }

    /**
     * Program entry point; the only method with a handler.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        try {
            methodA(-1);
        } catch (IllegalArgumentException e) {
            // The exception has propagated up: methodB -> methodA -> main
            System.out.println("main caught: " + e.getMessage());
        }
    }
}

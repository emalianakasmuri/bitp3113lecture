/*
 * File name : ClaimThrowCatch.java
 * Purpose   : Shows the three steps: claiming (throws), throwing (throw) and catching (catch).
 * Lecture   : Lecture 12 - Exception Handling
 * Component : Theory example 12.3 (not part of any case study)
 */
package topic09exception.examples;

/**
 * This Sets a radius only if it is positive; otherwise throws an exception.
 */
public class ClaimThrowCatch {

   
    /**
     * Calculates the area of a circle.
     *
     * @param radius the radius of the circle (in cm)
     * @return the area of the circle (in square cm)
     * @throws Exception if the radius is zero or negative
     */
    public static double circleArea(double radius) throws Exception { // 1. Claim
        if (radius <= 0) {
            // 2. Throw: create an exception object with a helpful message
            throw new Exception("Radius must be positive, but was " + radius);
        }
        return Math.PI * radius * radius;
    }

    /**
     * Program entry point.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        try {
            // A valid radius: no exception
            System.out.printf("Area = %.2f%n", circleArea(2.0));
            // An invalid radius: circleArea throws, so control jumps to catch
            System.out.printf("Area = %.2f%n", circleArea(-1.0));
            System.out.println("This line is skipped");
        } catch (Exception e) { // 3. Catch
            System.out.println("Caught: " + e.getMessage());
        }
    }
}

package topic08collection.examples;

import java.util.List;
import java.util.Vector;

/**
 * This class demonstrate a Vector used as a List that is shared safely 
 * by two threads adding elements at the same time.
 *
 * @author Emaliana Kasmuri, FTMK, UTeM
 * for BITP 3113 Object Oriented Programming
 */
public class VectorListDemo {

    /**
     * Main entry point to the application 
     *
     * @param args command-line arguments (not used)
     * @throws InterruptedException if the main thread is interrupted while waiting
     */
    public static void main(String[] args) throws InterruptedException {
    	
        // Create a Vector and declare it with the List interface type
        List<Integer> numbers = new Vector<>();

        // Define a task that adds 1000 numbers to the shared list
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                numbers.add(i);
            }
        };

        // Run the task in two threads at the same time
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Display the final size of the list
        System.out.println("Size: " + numbers.size());  
    }
}
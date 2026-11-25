package topic06.abstrak;


/**
 * Main class that tests the Order hierarchy.
 */
public class POSAbstrakApp {

    /**
     * Program entry point.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
    	
    		// ERROR: Order is abstract
        // Order o = new Order("X1", 10.00);   

        // Polymorphism: an Order reference holds a subclass object
        Order order1 = new CounterOrder("C001", 15.90);
        Order order2 = new MobileAppOrder("M001", 22.50);

        // runs CounterOrder's overriding methods
        order1.displaySummary();   
        System.out.println();
        
        // runs MobileAppOrder's overriding methods
        order2.displaySummary();   
    }
}

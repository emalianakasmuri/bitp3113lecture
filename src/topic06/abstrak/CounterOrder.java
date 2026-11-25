package topic06.abstrak;

/**
 * An order placed at the counter. No service charge is applied.
 */
public class CounterOrder extends Order {

    /**
     * Creates a counter order.
     *
     * @param orderId  unique order identifier
     * @param subtotal price of ordered products (RM)
     */
    public CounterOrder(String orderId, double subtotal) {
    	
    		// calls the abstract class constructor
        super(orderId, subtotal);   
    }

    /**
     * Overriding: counter orders have no service charge.
     *
     * @return 0.00 (RM)
     */
    @Override
    public double calculateServiceCharge() {
        return 0.00;
    }

    /**
     * Overriding: identifies this order channel.
     *
     * @return "Counter"
     */
    @Override
    public String getChannel() {
        return "Counter";
    }
}
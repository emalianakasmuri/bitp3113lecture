package topic06.abstrak;

/**
 * Represents a general order. This class is abstract because a real order
 * is always a specific type (counter, mobile app, etc.).
 */
public abstract class Order {

    // Unique identifier of the order, e.g. "C001". 
	protected String orderId;

    // Total price of all ordered products before service charge (RM).
    protected double subtotal;

    /**
     * Constructor used by subclasses through super(...).
     *
     * @param orderId  unique order identifier
     * @param subtotal price of ordered products before charges (RM)
     */
    public Order(String orderId, double subtotal) {
        this.orderId = orderId;
        this.subtotal = subtotal;
    }

    /**
     * Abstract method: every order type must decide its own service charge.
     *
     * @return service charge for this order (RM)
     */
    public abstract double calculateServiceCharge();

    /**
     * Abstract method: every order type must state its ordering channel.
     *
     * @return name of the ordering channel
     */
    public abstract String getChannel();

    /**
     * Concrete method shared by all subclasses. It calls the abstract
     * method calculateServiceCharge(); Java runs the subclass version.
     *
     * @return total amount to pay (RM)
     */
    public double calculateTotal() {
        return subtotal + calculateServiceCharge();
    }

    /**
     * Concrete method that displays a short order summary.
     */
    public void displaySummary() {
        System.out.println("Order ID : " + orderId);
        System.out.println("Channel  : " + getChannel());
        System.out.printf("Subtotal : RM %.2f%n", subtotal);
        System.out.printf("Charge   : RM %.2f%n", calculateServiceCharge());
        System.out.printf("Total    : RM %.2f%n", calculateTotal());
    }
}
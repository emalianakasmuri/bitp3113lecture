package topic06.abstrak;


/**
 * An order placed through the mobile app for delivery.
 */
public class MobileAppOrder extends Order {

    /** Fixed delivery fee charged for every mobile app order (RM). */
    public static final double DELIVERY_FEE = 5.00;

    /**
     * Creates a mobile app order.
     *
     * @param orderId  unique order identifier
     * @param subtotal price of ordered products (RM)
     */
    public MobileAppOrder(String orderId, double subtotal) {
        super(orderId, subtotal);   // reuse the shared initialisation
    }

    /**
     * Overriding: mobile app orders add a delivery fee.
     *
     * @return delivery fee (RM)
     */
    @Override
    public double calculateServiceCharge() {
        return DELIVERY_FEE;
    }

    /**
     * Overriding: identifies this order channel.
     *
     * @return "Mobile App"
     */
    @Override
    public String getChannel() {
        return "Mobile App";
    }
}
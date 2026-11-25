package topic07;

/**
 * This is the superclass
 */
public class Order {
	
	private int orderNumber;
	private double totalAmount; 
	
	
	public void printReceipt() {
		
		System.out.println(orderNumber);
		
	}
	
	/**
	 * Constructor to initialize the object
	 */
	public Order(int orderNumber) {
		
		this.orderNumber = orderNumber;
		totalAmount = 0.0;
		
	}
	
	public int getOrderNumber () {
		
		return this.orderNumber;
	}
	
	

}









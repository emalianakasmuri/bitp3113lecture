package topic06abstract;

public abstract class Order {
	
	
	
	private double totalAmount;
	
	/**
	 * Absract method
	 * 
	 * @return
	 */
	public abstract double calculateAmount();
	
	
	public double getTotalAmount() {
		
		return totalAmount;
	}
	
	
	/**
	 * Concrete method that calculate 6% service tax 
	 * 
	 * @return
	 */
	public double calculateServiceTax() {
		
		return totalAmount * 0.06;
	}
	

}

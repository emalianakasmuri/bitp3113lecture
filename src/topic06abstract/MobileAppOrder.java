package topic06abstract;

public class MobileAppOrder extends Order {
	
	

	@Override
	/**
	 * New implementation for MobileOrderApp
	 */
	public double calculateAmount() {
		
		
		double totalAmount = super.getTotalAmount() + 3.00;
				
		return totalAmount;
	}

}

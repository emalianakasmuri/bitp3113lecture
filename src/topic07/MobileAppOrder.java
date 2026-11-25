package topic07;

public class MobileAppOrder extends Order implements Discountable, Printable {
	
	
	public MobileAppOrder(int orderNo) {
		
		super(orderNo);
	}

	@Override
	public double calculateDiscountedPrice() {
		
		// Calculate here
				
		return 0;
	}

	@Override
	public void printReceipt() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Overloaded method
	 * 
	 * @param riderName
	 */
	public void printReceipt(int riderName) {
		
		int orderNumber = super.getOrderNumber();
	}

}

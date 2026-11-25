package topic06;

/**
 * This is the sub class
 */
public class CounterOrder extends Order {
	
	
	private int counterNo;
	private double tenderedCash;
	private double returnedBalance;
	
	public CounterOrder (int orderNumber, int counterNo) {
		
		super(orderNumber);
		this.counterNo = counterNo;
	}
	
	/**
	 * Method overriding (of super class)
	 */
	public void printReceipt() {
				
		super.printReceipt();
		System.out.println(counterNo);
		
		
	}
	

}



package topic07;

import java.util.Date;

/**
 * This is the sub class
 */
public class CounterOrder extends Order {
	
	
	private int counterNo;
	private double tenderedCash;
	private double returnedBalance;
	
	/**
	 * Overloaded constructor
	 * 
	 * @param orderNumber
	 */
	public CounterOrder (int orderNumber) {
		
		super(orderNumber);
		counterNo = 0;
	}
	
	/**
	 * Overloaded constructor
	 * 
	 * @param orderNumber
	 */
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
	
	/**
	 * Overloaded method
	 * 
	 * @param cashierName
	 */
	public void printReceipt(String cashierName) {
		
		System.out.println(counterNo);
		System.out.println(cashierName);
		
		
	}
	
	/**
	 * Overloaded method
	 * 
	 * @param cashierName
	 */
	public void printReceipt(String cashierName, Date timeStamp) {
		
		
		System.out.println(cashierName);
		
		
	}
	
	/**
	 * Overloaded method, similar to previous but different sequence
	 * 
	 * @param cashierName
	 */
	public void printReceipt(Date timeStamp, String cashierName) {
		
		printReceipt(cashierName, timeStamp); 
		
		// Examples of overloaded method
		// Supply string
		System.out.println(cashierName);
		
		// Supply Date
		System.out.println(timeStamp.toString());
		
		// Supply int
		System.out.println(counterNo);
		
		
	}
	

}



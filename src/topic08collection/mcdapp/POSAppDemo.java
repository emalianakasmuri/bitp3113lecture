package topic08collection.mcdapp;

public class POSAppDemo {

	public static void main(String[] args) {
		
		
		Product bigMac = new Product (101, "Big Mac", 16.90);
		Product mcChicken = new Product (102, "Mc Chicken", 16.90);
		Product fries = new Product (103, "French Fries", 4.90);
		
		OrderedProduct line1 = new OrderedProduct (bigMac, 3);
		OrderedProduct line2 = new OrderedProduct (mcChicken, 2);
		OrderedProduct line3 = new OrderedProduct (fries, 5);
		
		Order order1 = new Order(101);
		order1.addOrderedProducts(line3);
		order1.addOrderedProducts(line2);
		order1.addOrderedProducts(line1);
		order1.addOrderedProducts(line2);
		order1.addOrderedProducts(line1);
		order1.addOrderedProducts(line3);
		order1.addOrderedProducts(line2);
		order1.addOrderedProducts(line1);
		order1.addOrderedProducts(line2);
		order1.addOrderedProducts(line1);
		order1.addOrderedProducts(line2);
		order1.addOrderedProducts(line1);
		
		order1.printReceipt();
		
		
		
	}

}

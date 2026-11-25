package topic08collection.mcdapp;

import java.util.ArrayList;

import topic07.Printable;

public class Order implements Printable {
	
	private int orderNumber;
	private ArrayList<OrderedProduct> orderedProducts;
	private double total;
	
	
	public Order (int orderNumber) {
		
		this.orderNumber = orderNumber;
		
		// Create initial spaces for orderedProducts
		this.orderedProducts = new ArrayList<OrderedProduct>(5);
		System.out.println("Initial size: " + orderedProducts.size());
		
		this.total = 0.0;
	}
	
	public boolean addOrderedProducts (OrderedProduct orderedProduct) {
		
		// Using array - 
		// Keep track of current index
		// maintain the index eg: index++
		// Check the index
		
		// Replacing conventional array [] with Java Collection Framework
		return orderedProducts.add(orderedProduct);
	}

	@Override
	public void printReceipt() {
		
		
		
		// Print details of ordered products using enhanced for (:)
		int totalProduct = 0;
		for (OrderedProduct lineOrder:orderedProducts) {
			
			totalProduct += lineOrder.getQuantity();
		}
		
		System.out.println("Total product: " + totalProduct);
		System.out.println("Size of orderedProducts: " + orderedProducts.size());
		
		orderedProducts.removeLast();
		orderedProducts.removeLast();
		
		System.out.println("Size of orderedProducts (after removal): " + orderedProducts.size());
	}
	
	

}

package ch08collection.mcdapp;

public class OrderedProduct {
	
	private Product orderedProduct;
	private int quantity;
	private double subTotal;
	
	/**
	 * @param orderedProduct
	 * @param quantity
	 * @param subTotal
	 */
	public OrderedProduct(Product orderedProduct, int quantity) {
		
		this.orderedProduct = orderedProduct;
		this.quantity = quantity;
		
		
		this.subTotal = calculateSubTotal();
	}
	
	public double calculateSubTotal () {
		
		return this.orderedProduct.getPrice() * this.quantity;
	}
	
	
	
	public Product getOrderedProduct() {
		return orderedProduct;
	}
	public void setOrderedProduct(Product orderedProduct) {
		this.orderedProduct = orderedProduct;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	
	
	
	

}

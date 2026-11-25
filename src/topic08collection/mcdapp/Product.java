package topic08collection.mcdapp;

public class Product {
	
	private int productNo;
	private String name;
	private double price;
	
	/**
	 * @param productNo
	 * @param name
	 * @param price
	 */
	public Product(int productNo, String name, double price) {
		this.productNo = productNo;
		this.name = name;
		this.price = price;
	}
	
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}

package com.live.model;

/*@Data
@AllArgsConstructor
@NoArgsConstructor*/
public class Product {
	private int productId;
	private String productName;
	//The join point is the execution of the method below
	public String getProductName() {
		System.out.println("getProductName() executed!");
		return productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	private float price;
	
}

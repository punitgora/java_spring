package com.live.model;

public class Product {
	private long productId;
	private String productName;
	private String productDescription;
	private float price;

	public Product(long productId, String productName, String productDescription, float price) {
		System.err.println("public Product(long productId, String productName, String productDescription, float price) ");
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
	}
	
	/*
	 * public Product() { System.err.println(" Product()"); }
	 */
	 
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", price=" + price + "]";
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		System.out.println("public void setProductId(Long productId)");
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}

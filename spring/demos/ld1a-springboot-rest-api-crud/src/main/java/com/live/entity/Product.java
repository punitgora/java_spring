package com.live.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="PRODUCTS")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;
	private String productName;
	@Column(name = "PRODUCT_NAME", nullable = false)
	private String productDescription;
	private String price;
//	public Product() {
//	}
//	
//	public Product(Long productId, String productName, String productDescription, String price) {
//		super();
//		this.productId = productId;
//		this.productName = productName;
//		this.productDescription = productDescription;
//		this.price = price;
//	}
//
//	public String getPrice() {
//		return price;
//	}
//
//	public String getProductDescription() {
//		return productDescription;
//	}
//
//	public Long getProductId() {
//		return productId;
//	}
//	public String getProductName() {
//		return productName;
//	}
//	public void setPrice(String price) {
//		this.price = price;
//	}
//	public void setProductDescription(String productDescription) {
//		this.productDescription = productDescription;
//	}
//	public void setProductId(Long productId) {
//		this.productId = productId;
//	}
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//	@Override
//	public String toString() {
//		return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
//				+ productDescription + ", price=" + price + "]";
//	}
//	
	
}

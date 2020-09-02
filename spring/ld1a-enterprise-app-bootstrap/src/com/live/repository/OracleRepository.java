package com.live.repository;

import java.util.ArrayList;
import java.util.List;

import com.live.model.Product;

public class OracleRepository implements del_ProductRepositoryInterface,del_OracleRepositoryInterface{

	public List<Product> getProducts(){
		//JDBC code here to fetch all the product from the database
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("P01", "Oracle"));
		return products;
	}
	public void deleteProducts(){
		
	}
}

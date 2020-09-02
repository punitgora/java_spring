package com.live.repository;

import java.util.ArrayList;
import java.util.List;

import com.live.model.Product;

public class MySqlRepository implements ProductRepository{
	@Override
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("P02", "MySQL"));
		return products;
	}
//JDBC code here
}

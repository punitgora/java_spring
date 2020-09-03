package com.live.service;

import java.util.List;

import com.live.model.Product;
import com.live.repository.MySqlRepository;
import com.live.repository.ProductRepository;

public class ProductServiceImpl implements ProductService{

	@Override
	public List<Product> getProducts() {
//		ProductRepository productRepository = new OracleRepository();
		ProductRepository productRepository = new MySqlRepository();
		return productRepository.getProducts();
	}
}

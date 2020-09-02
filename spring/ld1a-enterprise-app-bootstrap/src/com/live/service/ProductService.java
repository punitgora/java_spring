package com.live.service;

import java.util.List;

import com.live.model.Product;
import com.live.repository.OracleRepository;

public class ProductService {
//Enterprise Business Logic
//Transaction Management
	public List<Product> getProducts(){
		//Logic to fetch data from the service layer
		OracleRepository oracleRepository = new OracleRepository();
		//oracleRepository.deleteProducts();
		return oracleRepository.getProducts();
	}
}

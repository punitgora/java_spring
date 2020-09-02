package com.live.service;

import java.util.List;

import com.live.model.Product;

public class ProductServiceImpl implements ProductService{
	//Enterprise Business Logic
	//Transaction Management
	@Override
	public List<Product> getProducts() {
		return null;
	}

	
//DELETED
//	public List<Product> getProducts(){
////		//DELETED
//		//Logic to fetch data from the service layer
////		OracleRepository oracleRepository = new OracleRepository();
////		oracleRepository.deleteProducts();
////		return oracleRepository.getProducts();
//
//
////		ProductRepositoryInterface productRepositoryInterface = new OracleRepository();
////		productRepositoryInterface.getProducts();
////		productRepositoryInterface.deleteProducts();
////		
////		OracleRepositoryInterface oracleRepositoryInterface = new OracleRepository();
////		oracleRepositoryInterface.getProducts();
////		oracleRepositoryInterface.deleteProducts();
//	}
}

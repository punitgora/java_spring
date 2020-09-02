package com.live.service;

import java.util.List;

import com.live.model.Product;
import com.live.repository.ProductRepository;

public class ProductServiceImpl implements ProductService{
	
	public ProductServiceImpl() {
		System.out.println("public ProductServiceImpl() ");
	}
	
	//DEVELOPER IS NOT CREATING THE PRODUCTREPOSITORY INSTANCE
	//PRODUCT SERVICE NEEDS THE PRODUCT REPOSITORY
	//THE SPRING FRAMEWORK WILL BE INJECTING THE PRODUCTREPOSITORY INTO THE CONSTRUCTOR
	ProductRepository productRepository;
	
	
	public ProductServiceImpl(ProductRepository productRepository) {
		System.out.println("ProductServiceImpl(ProductRepository productRepository)");
		this.productRepository = productRepository;
	}
	//Enterprise Business Logic
	//Transaction Management
	@Override
	public List<Product> getProducts() {
		//Access the OracleRepository using Interface.
		//Logic to fetch data from the service layer
//		ProductRepository productRepository = new OracleRepository();
		return productRepository.getProducts();
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

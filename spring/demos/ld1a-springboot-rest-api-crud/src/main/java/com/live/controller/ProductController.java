package com.live.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.live.entity.Product;
import com.live.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	ProductRepository productRepository;
	@GetMapping("/products")
	public List<Product> getProducts(){
		//productRepository.save(new Product(null, "NewProduct","Prod Desc", "5555"));
		//System.err.println("Saving Product");
		Product product = productRepository.getOne(1L);
		productRepository.delete(product);
		System.err.println("Deleted Product");
		List<Product> products  = productRepository.findAll();
		//List<Product> products  = productRepository.findAllOrderByProductIdAsc();
		return products;
	}	
}

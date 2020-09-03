package com.live.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.live.model.Product;

@RestController
public class ProductController {
	List<Product> products = new ArrayList<Product>();
	//get all products
@GetMapping("/products")
	public List<Product> getProducts() {
		if(products.size()==0)
		{
		products.add(new Product(100l,"SpringBoot.","Book",500.50f));
		products.add(new Product(101l,"Angular","Book",555.50f));
		}
		return products;
	}
}

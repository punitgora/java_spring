package com.live;

import com.live.service.ProductService;

public class Application {
	public static void main(String[] args) {
		System.out.println("Enterprise App Starter!");
		ProductService productService = new ProductService();
		//productService.getProducts().forEach((product) -> System.out.println(product));
		//:: method reference operator
		//Lambda expression + method reference.
		productService.getProducts().forEach(System.out::println);
	}
}

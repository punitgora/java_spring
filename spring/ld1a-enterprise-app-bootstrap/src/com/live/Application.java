package com.live;

import com.live.service.ProductServiceImpl;

public class Application {
	public static void main(String[] args) {
		System.out.println("Enterprise App Starter!");
		ProductServiceImpl productService = new ProductServiceImpl();
		//productService.getProducts().forEach((product) -> System.out.println(product));
		//:: method reference operator
		//Lambda expression + method reference.
		productService.getProducts().forEach(System.out::println);
	}
}

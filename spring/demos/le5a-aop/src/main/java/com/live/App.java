package com.live;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.live.model.Product;
import com.live.repository.ProductRepository;

public class App {
	public static void main(String[] args) {
		ProductRepository productRepository = null;
		// loading the spring ioc container (ApplicationContext)
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// the bean is supplied by the Inversion of Control (IOC) container (i.e, the
		// ApplicationContext).
		//getProducts(context);
		Product product = context.getBean("product",Product.class);
		System.out.println(product.getProductName());
		
		((ClassPathXmlApplicationContext)context).close();
	}

	private static void getProducts(ApplicationContext context) {
		ProductRepository productRepository;
		productRepository = (ProductRepository) context.getBean("productRepository");
		productRepository.getProducts().forEach(System.out::println);
	}
}

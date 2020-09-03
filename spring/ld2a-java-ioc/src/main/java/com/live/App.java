package com.live;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.live.repository.ProductRepository;

public class App {
	public static void main(String[] args) {
		ProductRepository productRepository = null;
		// loading the spring ioc container (ApplicationContext)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// the bean is supplied by the Inversion of Control (IOC) container (i.e, the
		// ApplicationContext).
		productRepository = (ProductRepository) context.getBean("productRepository");
		productRepository.getProducts().forEach(System.out::println);
	}
}

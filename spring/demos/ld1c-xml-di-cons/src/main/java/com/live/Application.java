package com.live;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.live.repository.ProductRepository;
import com.live.service.ProductService;

public class Application {
	public static void main(String[] args) {
		System.out.println("Enterprise App Starter!");		
		//ioc();

		//CONSTRUCTOR BASED DI DEMO...
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductService productService;

		productService = (ProductService)context.getBean("productService");
		System.out.println(productService);
		productService.getProducts().forEach(System.out::println);
		productService = (ProductService)context.getBean("productService");
		System.out.println(productService);
		productService.getProducts().forEach(System.out::println);
	}

	private static void ioc() {
		//PERFORMING IOC
		//FETCHING THE PoductRepository implementation instance from spring IOC Container
		//The instance inside the container is Spring Beans.
		//CREATED THE IOC CONTAINER
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	//FIRST ACCESS
	ProductRepository productRepository = null;
    productRepository = (ProductRepository)context.getBean("productRepository");
	productRepository.getProducts().forEach(System.out::println);
	System.out.println(productRepository);

	//ACCESS AGAIN
	ProductRepository productRepositoryAgain = null;
	productRepositoryAgain = (ProductRepository)context.getBean("productRepository");
	productRepositoryAgain.getProducts().forEach(System.out::println);
	System.out.println(productRepositoryAgain);
	
	//SECOND ACCESS
	ProductRepository productRepository1 = null;
    productRepository1 = (ProductRepository)context.getBean("productRepository1");
	productRepository1.getProducts().forEach(System.out::println);
	System.out.println(productRepository1);
		
		
//OracleRepository repository = new OracleRepository();
//		OracleRepository repository = (OracleRepository)context.getBean("productRepositoryDummy");
//		repository.getProducts().forEach(System.out::println);
		//NOVICE CODE, ACCESSING THE IMPLEMENTATION DIRECTLY
//		ProductServiceImpl productService = new ProductServiceImpl();
//		//productService.getProducts().forEach((product) -> System.out.println(product));
//		//:: method reference operator
//		//Lambda expression + method reference.
//		productService.getProducts().forEach(System.out::println);
		
		//PRO CODE ACCESSING THE REPOSITORY USING INTERFACE.
//		ProductService productService = new ProductServiceImpl();
//		productService.getProducts().forEach(System.out::println);
	}
}

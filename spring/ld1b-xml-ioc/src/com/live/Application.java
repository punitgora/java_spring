package com.live;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.live.repository.ProductRepository;

public class Application {
	public static void main(String[] args) {
		System.out.println("Enterprise App Starter!");		

		//PERFORMING IOC
		//FETCHING THE PoductRepository implementation instance from spring IOC Container
		//The instance inside the container is Spring Beans.
		//CREATED THE IOC CONTAINER
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	//FIRST ACCESS
	ProductRepository productRepository = null;
  // productRepository = (ProductRepository)context.getBean("productRepository");
	productRepository = context.getBean("productRepository", ProductRepository.class);
	//productRepository.getProducts().forEach(System.out::println);
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

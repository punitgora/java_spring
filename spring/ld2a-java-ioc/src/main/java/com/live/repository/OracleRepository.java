package com.live.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.live.model.Product;

//Indicates that an annotated class is a "component".
//Such classes are considered as candidates for auto-detection 
//when using annotation-based configuration and classpath scanning. 

//<bean id="productRepository"
//class="com.live.repository.OracleRepository">
//</bean>
@Component("productRepository")
public class OracleRepository implements ProductRepository {
private  OracleRepository() {
	System.out.println("Wonderful.... I never guessed spring can execute a private constructor!");
}
	@Override
	public List<Product> getProducts() {
		System.out.println("Oracle Repository");
		List<Product> products = new ArrayList<>();

		Product product = new Product();

		product.setProductId("P01");
		product.setProductName("Oracle");

		products.add(product);

		return products;
	}

}

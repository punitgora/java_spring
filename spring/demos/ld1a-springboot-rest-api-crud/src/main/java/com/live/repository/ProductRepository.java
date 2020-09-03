package com.live.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.live.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
 //List<Product> findAllByOrderByProductNameDesc();
 
}

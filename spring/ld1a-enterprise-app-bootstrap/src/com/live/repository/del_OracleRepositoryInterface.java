package com.live.repository;

import java.util.List;

import com.live.model.Product;

public interface del_OracleRepositoryInterface{
	public List<Product> getProducts();
	public void deleteProducts();
}

package com.live.interface_driven_dev;

import java.util.List;

import com.live.model.Product;

public class DummyOracleRepositoryV2 implements DummyProductRepositoryRead, DummyProductRepositoryWrite {

	@Override
	public List<Product> read() {
		return null;
	}

	@Override
	public List<Product> write() {
		return null;
	}
	public List<Product> delete() {
		return null;
	}
	
}

package com.live.interface_driven_dev;

public class InterfaceDrivenDevelopment {
public static void main(String[] args) {
	DummyProductRepositoryRead dummyProductRepositoryRead;
	dummyProductRepositoryRead = new DummyOracleRepositoryV1();
	dummyProductRepositoryRead = new DummyOracleRepositoryV2();
}
}

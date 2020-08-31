package com.live.oops;

abstract class Person {
public String name;
public abstract void job();
}


class ITEmployee extends Person{

	@Override
	public void job() {
		System.out.println("Work with a computer");
	}
	
}
class Actor extends Person{

	@Override
	public void job() {
		System.out.println("Shoot films");
	}
	
}
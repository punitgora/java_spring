package com.collections;

import java.util.Vector;

import com.live.oops.Laptop;

public class VectorDemo {
	public static void main(String[] args) {
		Vector employees = new Vector();
		employees.add("Rambo");
		employees.add("John");
		employees.add(null);
		employees.add("John");
		employees.add(null);
		Laptop laptop = new Laptop("mac",50.60f);
		employees.add(laptop);
		System.out.println(employees);
	}
}

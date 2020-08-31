package com.collections;

import java.util.ArrayList;

import com.live.oops.Laptop;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList employees = new ArrayList();
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

package com.collections;

import java.util.LinkedList;

import com.live.oops.Laptop;

public class LinkedListDemo {
	public static void main(String[] args) {
//		LinkedList<Laptop> employees = new LinkedList<Laptop>();
		LinkedList<Object> employees = new LinkedList<Object>();
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

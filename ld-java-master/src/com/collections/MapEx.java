package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.live.oops.Laptop;

public class MapEx {
	public static void main(String[] args) {
//		m1();
		m2();
	}


	private static void m2() {
		Map map = new HashMap();
		Laptop sonyLaptop = new Laptop("sony", 123f);
		map.put(sonyLaptop.laptopName, sonyLaptop);
		Laptop dell = new Laptop("dell", 123f);
		map.put(dell.laptopName, dell);
		Laptop mac = new Laptop("mac", 123f);
		map.put(mac.laptopName, mac);
		
		//iterate the map
		Iterator iterator = map.values().iterator();
		while(iterator.hasNext()) {
			Object object = iterator.next();
			System.out.println(object);
		}

	}
	private static void m1() {
		Map map = new HashMap();
		Laptop sonyLaptop = new Laptop("sony", 123f);
		map.put(sonyLaptop.laptopName, sonyLaptop);
		Laptop dell = new Laptop("dell", 123f);
		map.put(dell.laptopName, dell);
		Laptop mac = new Laptop("mac", 123f);
		map.put(null, mac);
		Laptop lenova = new Laptop("lenova", 123f);
		map.put(null, lenova);
		map.put("lap1", null);
		map.put("lap2", null);
		System.out.println(map);
		//System.err.println(map.get("sony"));
		//System.err.println(map.containsKey("sony"));
	}
}

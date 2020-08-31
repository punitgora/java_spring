package com.live.oops;

public class StringPoolDemo {
	public static void main(String[] args) {
		String name = "Rambo";
		String name1 = "Rambo";
		name1 = name;
		System.out.println(name1);
		System.out.println(name);
		
		name1 = "Peter";
		System.out.println(name1);
		System.out.println(name);
		//String name1 = new String("Rambo");

//	System.out.println(name);
//	System.out.println(name1);
		// equals
		//System.out.println("equal " + name.equals(name1));
		// identical
		//System.out.println("identical " + (name == name1));
		//name1 = "Peter";
		//System.out.println(name == name1);
		//System.out.println(name);
		//System.out.println(name1);
	}
}

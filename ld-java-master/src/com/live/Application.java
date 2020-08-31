package com.live;

import com.live.oops.Laptop;

public class Application {
	static public void main(String arguments[]) {
		//creatingLaptopInstances();
		//toStringDemo();
		//equalsDemo();
//		getClassDemo();
		//equalsDemo1();
		equalsDemo2();
	}

	private static void getClassDemo() {
		Laptop dell = null;
		//the memory is alloted
		dell = new Laptop("Dell", 50.60f);
		System.out.println(dell.getClass());
	}
	
	private static void equalsDemo() {
		Laptop dell = null;
		//the memory is alloted
		dell = new Laptop("Dell", 50.60f);
		Laptop sony = null;
		//the memory is alloted
		sony = new Laptop();
		//access the member variables and fields
		sony.laptopName = "Vaio";
		sony.price= 000.50f;
		System.out.println(dell.equals(sony));
		dell = sony;
		System.out.println(dell.equals(sony));
	}
	
	private static void equalsDemo1() {
		Laptop dell = null;
		//the memory is alloted
		dell = new Laptop("Dell", 50.60f);
		Laptop dell1 = null;
		//the memory is alloted
		dell1 = new Laptop();
		//access the member variables and fields
		dell1.laptopName = "Dell XPS";
		dell1.price= 50.60f;
		System.out.println(dell.equals(dell1));
//		dell = dell1;
//		System.out.println(dell.equals(dell1));
	}
	
	private static void equalsDemo2() {
		Laptop dell = null;
		//the memory is alloted
		dell = new Laptop("Dell", 50.60f);
		Laptop dell1 = null;
		//the memory is alloted
		dell1 = new Laptop();
		//access the member variables and fields
		dell1.laptopName = "Dell";
		dell1.price= 50.60f;
		System.out.println(dell.equals(dell1));
		dell = dell1;
		System.out.println(dell == dell1);
//		dell = dell1;
//		System.out.println(dell.equals(dell1));
	}
	private static void toStringDemo() {
		Laptop dell = null;
		//the memory is alloted
		dell = new Laptop("Dell", 50.60f);
		//toString() method
		//Returns a string representation of the object.
		//name of the class
		//@
		//unsigned hexadecimal representation of the hash code
		String dellString = dell.toString();
		System.out.println(dellString);
		
		System.out.println(dell);
		
		System.out.println(dell.toString());
	}

	//modular
	private static void creatingLaptopInstances() {
		//main();
		//int numbers[] = {1,2};
		//main(numbers);		
		System.out.println("Welcome");
		//creating the reference
		Laptop dell = null;
		//the memory is alloted
		dell = new Laptop();
		//access the member variables and fields
		dell.laptopName = "XPS";
		dell.price= 500.50f;	
		dell.getDetails();	
		Laptop sony = null;
		//the memory is alloted
		sony = new Laptop();
		//access the member variables and fields
		sony.laptopName = "Vaio";
		sony.price= 000.50f;
		
		sony.getDetails();
	}
}

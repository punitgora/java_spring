package com.live.oops;

import java.util.HashMap;

public class Application {
	static public void main(String arguments[]) {
		//creatingLaptopInstances();
		//toStringDemo();
		//equalsDemo();
//		getClassDemo();
		//equalsDemo1();
		//equalsDemo2();
		//cloneDemo();
		//extendsImplementsDemo();
		finalizeDemo();
		
		//anonymous instances
		//System.out.println(new Laptop("Test",5.5f));
		
		HashMap<Laptop,String> hashMap = new HashMap<Laptop,String>();
		hashMap.put(new Laptop("Test",5.5f),"testlaptop");
		hashMap.put(new Laptop("Test",5.5f),"testlaptop1");
		System.out.println(hashMap);
		
		for(int i = 0; i< 10; i++) {
			Laptop laptop = new Laptop("Mac",5.5f);
			System.out.println(laptop.hashCode());
		}
	}

	private static void finalizeDemo() {
		Laptop dell = null;
		//the memory is alloted
		dell = new Laptop("Dell", 50.60f);
		try {
			System.out.println("Finalizing the Laptop before cleaning up the memory");
			dell.finalize();
			System.out.println("After clean up!");
		} catch (Throwable e) {
		System.out.println("Finalizing " + e);
		}
	}
	
	private static void extendsImplementsDemo() {
		//GooglePay gPay = new GooglePay();
		GooglePay gPay = new CitiBank();
		gPay.pay();
		gPay = new HSBCBank();
		gPay.pay();
		
		//Person actor = new Person();
		Person person = new Actor();
		person.name = "Will Smith!";
		person.job();
	}

	private static void cloneDemo() {
		Laptop dell = null;
		//the memory is alloted
		dell = new Laptop("Dell", 50.60f);
		System.out.println(dell);
		//make a copy of laptop
		Laptop dell1 = null;
		//the reference (memory address) of dell is assigned to dell1
		try {
			dell1 = (Laptop)dell.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
		}
		//dell1 = dell;
		System.out.println(dell1);
		dell1.price = 60f;
		System.out.println(dell1);
		System.out.println(dell);
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


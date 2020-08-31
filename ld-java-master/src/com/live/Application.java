package com.live;

import com.live.oops.Laptop;

public class Application {
	static public void main(String arguments[]) {
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

//Classes, Objects, References, Instances
//The syntax of the main program.
package com.live.oops;
//A class is a specification or blueprint for creating objects.
public class Laptop{
	//Fields
	public String laptopName;
	public float price;
	
	//method to print the details
	public void getDetails() {
		System.out.println(laptopName);
		System.out.println(price);
	}
	static public void main(String arguments[]) {
		System.out.println("Laptop");
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
// class Laptop {
////The main method is the entry point for a java program
//// public 
//	// accessible inside the current class
//	// accessible outside the current class by other classes
//	// accessible outside this application by other applications
//public static void main(int[] args) {
//	System.out.println("int [] args");
//}
//public static void main() {
//	System.out.println("no params");
//}
//	
////public static int main(int[] args) {
////	System.out.println("Welcome 1");
////	return 1;
////}
//}
//
////The main is the entry point for a java appication
//// static & public and be in any order
//// return type should always be prefixed before the method
//// the argument type matters
//// the agrument name does not matter

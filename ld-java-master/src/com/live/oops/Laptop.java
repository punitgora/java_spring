//A class is a specification or blueprint for creating objects.
package com.live.oops;
//Implement Cloneable object to inform JVM that this object can be cloned.
class Laptop extends Object implements Cloneable{
@Override
	protected void finalize() throws Throwable {
		System.out.println("Perform clean up operations!!!!");
		System.out.println("Close DB connections or network machines");
		super.finalize();
	}
	@Override 
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	//Fields
	public String laptopName;
	public float price;
	
	//Default constructor
	public Laptop(String plaptopName, float pprice) {
		laptopName = plaptopName;
		price = pprice;
	}
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}


	//method to print the details
	public void getDetails() {
		System.out.println(laptopName);
		System.out.println(price);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((laptopName == null) ? 0 : laptopName.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		return result;
	}
	@Override
	public String toString() {
		return "Laptop [laptopName=" + laptopName + ", price=" + price + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (laptopName == null) {
			if (other.laptopName != null)
				return false;
		} else if (!laptopName.equals(other.laptopName))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		return true;
	}

}




////Classes, Objects, References, Instances
////The syntax of the main program.
//package com.live.oops;
////A class is a specification or blueprint for creating objects.
//public class Laptop extends Object implements Cloneable{
//	//Fields
//	public String laptopName;
//	public float price;
//	
//	//Default constructor
//	public Laptop(String plaptopName, float pprice) {
//		laptopName = plaptopName;
//		price = pprice;
//	}
//	
//	public Laptop() {
//		// TODO Auto-generated constructor stub
//	}
//
//	/*
//	 * @Override public String toString() { return "Laptop Details " + laptopName +
//	 * " " + price; }
//	 */
//	
//	
//	//method to print the details
//	public void getDetails() {
//		System.out.println(laptopName);
//		System.out.println(price);
//	}
////	static public void main(String arguments[]) {
////		System.out.println("Laptop");
////		//main();
////		//int numbers[] = {1,2};
////		//main(numbers);		
////		System.out.println("Welcome");
////		//creating the reference
////		Laptop dell = null;
////		//the memory is alloted
////		dell = new Laptop();
////		//access the member variables and fields
////		dell.laptopName = "XPS";
////		dell.price= 500.50f;	
////		dell.getDetails();	
////		Laptop sony = null;
////		//the memory is alloted
////		sony = new Laptop();
////		//access the member variables and fields
////		sony.laptopName = "Vaio";
////		sony.price= 000.50f;
////		
////		sony.getDetails();
////	}
//
//	@Override
//	public String toString() {
//		return "Laptop [laptopName=" + laptopName + ", price=" + price + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((laptopName == null) ? 0 : laptopName.hashCode());
//		result = prime * result + Float.floatToIntBits(price);
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Laptop other = (Laptop) obj;
//		if (laptopName == null) {
//			if (other.laptopName != null)
//				return false;
//		} else if (!laptopName.equals(other.laptopName))
//			return false;
//		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
//			return false;
//		return true;
//	}
//}
//// class Laptop {
//////The main method is the entry point for a java program
////// public 
////	// accessible inside the current class
////	// accessible outside the current class by other classes
////	// accessible outside this application by other applications
////public static void main(int[] args) {
////	System.out.println("int [] args");
////}
////public static void main() {
////	System.out.println("no params");
////}
////	
//////public static int main(int[] args) {
//////	System.out.println("Welcome 1");
//////	return 1;
//////}
////}
////
//////The main is the entry point for a java appication
////// static & public and be in any order
////// return type should always be prefixed before the method
////// the argument type matters
////// the agrument name does not matter

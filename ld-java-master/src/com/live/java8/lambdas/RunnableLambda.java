package com.live.java8.lambdas;

public class RunnableLambda {

	public static void main(String[] args) {
//ChildThread childThread = new ChildThread();
//childThread.start();
//new ChildThread().start();

//	Thread thread = new Thread(new ChildThread1());
//	thread.start();
//	new Thread(new ChildThread1()).start();

//	new Thread(() -> System.out.println("Wow this is great")).start();

//Anonymous class
//	new Thread(new Runnable() {
//		@Override
//		public void run() {
//			System.out.println("Wow this is great");
//		}
//	}).start();
//	
//	
		// Lambda expressions
		// () -> System.out.println("Wow this is great");
		// The type of lambda expression is a functional interface
		// Functional Interfaces : an interface which has only on abstract method.
		// Runnable is a functional interface, because it has only one abstract method
		// Functional Programming is implemented using Lambda Expression
		Runnable runnable = () -> System.out.println("Wow this is great");
		new Thread(runnable).start();
		new Thread(() -> System.out.println("Wow this is great")).start();
	}
}

class ChildThread extends Thread {
	@Override
	public void run() {
		System.out.println("Wow this is great");
	}
}

class ChildThread1 implements Runnable {
	@Override
	public void run() {
		System.out.println("Wow this is great");

	}
}

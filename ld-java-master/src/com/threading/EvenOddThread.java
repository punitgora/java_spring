package com.threading;

public class EvenOddThread {
	public static void main(String[] args) {
		System.out.println("Main Thread Begins!");
		System.out.println("Insinde main: " + Thread.currentThread().getName());
		// Instantiate the EvenThread
		EvenThread evenThread = new EvenThread();
		evenThread.setName("even");
		// the run method runs inside the current thread (main thread)
		// thread.run();
		evenThread.start();
		Thread.currentThread().interrupt();
		//thread.interrupt();
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("Who woke me up!");
		}
		// for(int i = 0; i <1000; i++)
		//Thread.currentThread().stop();
		try {
			evenThread.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Main thread completed!");
		//System.out.println("Main Thread completes and waits for all child threads to complete!");

	}
}

//Creating a thread
//1. extend the thread class
//2. override the run method
class EvenThread extends Thread {
	@Override
	public void run() {
		System.out.println("Insinde EvenThread: " + Thread.currentThread().getName());
		for (int i = 2; i <= 10; i++) {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}
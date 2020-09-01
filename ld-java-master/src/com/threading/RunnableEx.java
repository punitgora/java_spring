package com.threading;

public class RunnableEx{
public static void main(String[] args) {
	ChildThread childThread = new ChildThread();
	//childThread.start();
	Thread thread = new Thread(childThread);
	thread.start();
}
}

//class ChildThread implements Runnable{
class ChildThread extends Test implements Runnable{

	@Override
	public void run() {
		for (int i = 2; i <= 10; i++) {
			try {
				Thread.currentThread().sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
	
}

class Test{
	
}
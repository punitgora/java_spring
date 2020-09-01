package com.threading;

public class SingleThread {
public static void main(String[] args) {
//	Thread thisThread = Thread.currentThread();
//	String threadNameString = thisThread.getName();
//	System.out.println(threadNameString);
	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getPriority());	
}
}

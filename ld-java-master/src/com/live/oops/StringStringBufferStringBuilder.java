package com.live.oops;

public class StringStringBufferStringBuilder {
	public static void main(String[] args) {
//Measure performance of String vs StringBuffer vs StringBuilder
		long startTime;
		
		String string = "1";
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			string += i;
			//System.out.println(string);
		}
		System.out.println(System.currentTimeMillis() - startTime);
		
		StringBuffer stringBuffer = new StringBuffer();
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			stringBuffer.append(i);
			//System.out.println(string);
		}
		System.out.println(System.currentTimeMillis() - startTime);
		
		StringBuilder stringBuilder = new StringBuilder();
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			stringBuilder.append(i);
			//System.out.println(string);
		}
		System.out.println(System.currentTimeMillis() - startTime);
	}
}

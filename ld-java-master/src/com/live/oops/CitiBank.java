package com.live.oops;

//Classes implement interfaces
public class CitiBank implements GooglePay{
	@Override
	public void pay() {
		System.out.println("Payment processed by Citi Bank!");
	}

}

package com.live.oops;

//Classes implement interfaces
public class HSBCBank implements GooglePay{
	@Override
	public void pay() {
		System.out.println("Payment processed by HSBC Bank!");
	}

}

class HSBCBankPremium extends HSBCBank{
	
}
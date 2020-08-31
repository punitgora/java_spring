package com.live.oops;

public interface GooglePay {
//public abstract void pay();
void pay();
}
//interface extends another interface
 interface GooglePayPremium extends GooglePay{
void rewards();
	}
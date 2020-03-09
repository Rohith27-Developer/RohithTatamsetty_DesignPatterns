package com.epam.State_Pattern;

abstract class Bank {
	abstract void initialize();
	abstract void startPayment();
	abstract void endPayment();
	public void payment()
	{
		initialize();
		startPayment();
		endPayment();
	}
}

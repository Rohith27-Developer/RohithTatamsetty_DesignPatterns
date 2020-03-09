package com.epam.State_Pattern;

public class Offline_Payment extends Bank {

	@Override
	void initialize() {
		System.out.println("Bank has Initialized Payment");
	}
	@Override
	void endPayment() {
		System.out.println("Bank has ended payment");
		
	}
	@Override
	void startPayment() {
		System.out.println("Bank has started the payment");
			
		}
}

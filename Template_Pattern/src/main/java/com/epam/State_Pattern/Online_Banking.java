package com.epam.State_Pattern;

public class Online_Banking extends Bank {

	@Override
	void endPayment() {
		System.out.println("User has ended Payment");
		
	}
	@Override
	void initialize() {
		System.out.println("User has Initialized Payment");
		
	}

	@Override
	void startPayment() {
		System.out.println("User has started Payment");
		
	}

	

}

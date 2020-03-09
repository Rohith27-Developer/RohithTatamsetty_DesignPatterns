package com.epam.Facade_Pattern;
public class Facade_Pattern {
	public static void main(String[] args) {
		VehicleSpeed speed=new VehicleSpeed();
		speed.getCarSpeed();
		speed.getBikeSpeed();
		speed.getTrainSpeed();
	}
}

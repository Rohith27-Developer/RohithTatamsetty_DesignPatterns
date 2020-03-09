package com.epam.Facade_Pattern;

public class VehicleSpeed {
	private Vehicle car;
	private Vehicle bike;
	private Vehicle train;

	public VehicleSpeed() {
		car = new Car();
		bike = new Bike();
		train = new Train();
	}

	public void getCarSpeed(){
		car.maxSpeed();;
	}
	public void getBikeSpeed(){
		bike.maxSpeed();
	}
	public void getTrainSpeed(){
		train.maxSpeed();
	}
}

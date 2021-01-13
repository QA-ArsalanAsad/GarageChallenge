package com.qa.main;

public class Bike extends Vehicle {

	@Override
	public String type() {

		return "Bike";
	}

	@Override
	public int numberOfWheels() {
		
		return 2;
	}

	@Override
	public int speed() {
		
		return 150;
	}

	@Override
	public int cost() {
		
		return 100;
	}

	@Override
	public String toString() {
		return "Bike [type()=" + type() + ", numberOfWheels()=" + numberOfWheels() + ", speed()=" + speed() + "]";
	}
	
	
	
	
	

}

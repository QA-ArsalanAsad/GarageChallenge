package com.qa.main;

public class Car extends Vehicle {

	@Override
	public String type() {
		return "Car";
	}

	@Override
	public int numberOfWheels() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int speed() {
		// TODO Auto-generated method stub
		return 250;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 600;
	}

	@Override
	public String toString() {
		return "Car [type()=" + type() + ", numberOfWheels()=" + numberOfWheels() + ", speed()=" + speed() + "]";
	}
	
	


	
	
	

}

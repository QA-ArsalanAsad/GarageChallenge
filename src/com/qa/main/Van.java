package com.qa.main;

public class Van extends Vehicle {

	@Override
	public String type() {
		return "Van";
	}

	@Override
	public int numberOfWheels() {
		
		return 4;
	}

	@Override
	public int speed() {
		
		return 80;
	}

	@Override
	public int cost() {
		
		return 66;
	}

	@Override
	public String toString() {
		return "Van [type()=" + type() + ", numberOfWheels()=" + numberOfWheels() + ", speed()=" + speed() + "]";
	}
	
	
	
	
	

}

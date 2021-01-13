package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	List <Vehicle> vehicleList = new ArrayList<>();
	
	
	public void bill () {
		for (Vehicle i : vehicleList) {
			int bill = 0;
			
			switch (i.type()) {
			case "Car":
				bill = 2*i.speed()*i.cost();
				break;
			case "Bike":
				bill = 4*i.speed()*i.cost();
				break;
			case "Van":
				bill = 5*i.speed()*i.cost();
				break;
				
			}
			System.out.println(i + "Bill: £" + bill);
		}
	}
	
	public void addVehicle (Vehicle vehicle) {
		vehicleList.add(vehicle);
		
	}
	
	public void removeByType (String type) {
		List<Vehicle> removeList = new ArrayList<Vehicle>();
		for (Vehicle v : vehicleList) {
			if (v.type().equals(type)) {
				System.out.println("Removing Vehicle " + v);
				
			} else {
				removeList.add(v);
			}
		
		}
		vehicleList=removeList;
		System.out.println(vehicleList);
	}
	
	public void fixByType (String type) {
		for (Vehicle v : vehicleList) {
			int bill = 0;
			if (v.type().equals(type)) {
				bill = v.speed()*v.cost();
				System.out.println(v + "Bill = £" + bill);
			}
			
		}
	}
	
	
	public void emptyGarage() {
		vehicleList.clear();
		
		System.out.println("Garage is empty!" + vehicleList);
	}
	
	

	}

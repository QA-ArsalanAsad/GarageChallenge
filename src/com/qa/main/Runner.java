package com.qa.main;

public class Runner {
	public static void main(String[] args) {
		
		Vehicle Audi = new Car();
		Vehicle BMW = new Bike();
		Vehicle Vauxhall = new Van();
		
		Garage g = new Garage();
		
		g.vehicleList.add(Audi);
		g.vehicleList.add(BMW);
		g.vehicleList.add(Vauxhall);
		
		System.out.println(g.vehicleList);
		
		
		g.bill();
		g.removeByType("Bike");
		g.fixByType("Van");
		g.emptyGarage();
		
		

   }
}

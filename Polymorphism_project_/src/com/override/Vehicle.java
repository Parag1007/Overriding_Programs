package com.override;

public class Vehicle {

	public String brand;
	public String model;

	public Vehicle(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}
	

	public void displayInfo() {
		System.out.println("Brand name: "+brand);
		System.out.println("model name: "+model);
	}


	public void start() {
		System.out.println("Vehicle Start");
		
	}


	public void stop() {
		System.out.println("vehicle stop:");
		
		
	}
	

}

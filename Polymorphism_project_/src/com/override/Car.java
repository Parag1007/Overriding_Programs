package com.override;

import com.Override2.VehicleAction;

public class Car extends Vehicle implements VehicleAction {

	public int door;

	public Car(int door, String model, String brand) {
		super(brand, model);

		this.door = door;

	}
	@Override
	public void start() {
		
		System.out.println("Car Start: ");
	}
	
	@Override
	public void stop() {
	System.out.println("Car Stop : ");
	}
	
	

	@Override
	public void displayInfo() {
		System.out.println("Model: " + model);
		System.out.println("Brand: " + brand);
		System.out.println("door: " + door);

	}


}
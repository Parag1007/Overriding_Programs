package com.override;

public class Bicycle extends Vehicle {

	boolean hasbell;

	public Bicycle(String brand, String model, boolean hasbell) {
		super(brand, model);

		this.hasbell = hasbell;

	}
	
	@Override
	public void displayInfo() {
		System.out.println("brand: " + brand);
		System.out.println("model: " + model);
		System.out.println("Has bell: " + hasbell);
	}

}

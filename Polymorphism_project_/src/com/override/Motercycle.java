package com.override;

import com.Override2.VehicleAction;

public class Motercycle extends Vehicle implements VehicleAction {
	boolean hasSidecar;

	public Motercycle(String brand, String model, boolean hasSidecar) {
		super(brand, model);
		this.hasSidecar = hasSidecar;

	}

	@Override
	public void start() {

		super.start();
	}

	@Override
	public void stop() {

		super.stop();
	}

	@Override
	public void displayInfo() {
		System.out.println("brand: " + brand);
		System.out.println("model: " + model);
		System.out.println("HasSideCar: " + hasSidecar);

	}

}

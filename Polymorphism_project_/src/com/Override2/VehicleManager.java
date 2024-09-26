package com.Override2;

import java.util.ArrayList;

import com.override.Bicycle;
import com.override.Vehicle;

public class VehicleManager {

	ArrayList<Vehicle> vehicle = new ArrayList<>();

	void addVehicle(Vehicle v) {

		vehicle.add(v);

	}

	void addVehicle(String brand, String model) {

		vehicle.add(new Bicycle(brand, model, false));
	}
	
	void DisplayAllVehicleInfo() {
		
		for (Vehicle v : vehicle) {
			v.displayInfo();
			
		}
	}

}

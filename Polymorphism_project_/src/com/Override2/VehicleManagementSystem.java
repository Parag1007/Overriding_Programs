package com.Override2;

import com.override.Car;
import com.override.Motercycle;
import com.override.Vehicle;

public class VehicleManagementSystem {
	public static void main(String[] args) {

		VehicleManager v = new VehicleManager();
		v.addVehicle(new Car(4, "Swift","Maruti Suzuki"));
		v.addVehicle(new Motercycle("YAMHA","R15",  true));
		v.DisplayAllVehicleInfo();

		Vehicle myCar = new Car(4, "Brezza,","Maruti Suzuki");
		myCar.displayInfo();

	}

}

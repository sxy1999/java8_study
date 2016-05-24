package com.donbest.lambda.tutorial07;

public interface IVehicle {
	void operate();
}

class Car implements IVehicle {
	@Override
	public void operate() {
		System.out.println("Car.operate() method invoked...");
	}
	@Override
	public String toString() {
		return "Car";
	}
}

class Suv implements IVehicle {
	@Override
	public void operate() {
		System.out.println("Suv.operate() method invoked...");
	}
	@Override
	public String toString() {
		return "Suv";
	}
}

class Truck implements IVehicle {
	@Override
	public void operate() {
		System.out.println("Truck.operate() method invoked...");
	}
	@Override
	public String toString() {
		return "Truck";
	}
}